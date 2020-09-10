package com.vmware.vra.jenkinsplugin.vra;

import static com.vmware.vra.jenkinsplugin.model.deployment.DeploymentRequest.StatusEnum.ABORTED;
import static com.vmware.vra.jenkinsplugin.model.deployment.DeploymentRequest.StatusEnum.FAILED;
import static com.vmware.vra.jenkinsplugin.model.deployment.DeploymentRequest.StatusEnum.SUCCESSFUL;

import com.vmware.vra.jenkinsplugin.model.catalog.CatalogItem;
import com.vmware.vra.jenkinsplugin.model.catalog.CatalogItemRequest;
import com.vmware.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import com.vmware.vra.jenkinsplugin.model.catalog.Deployment;
import com.vmware.vra.jenkinsplugin.model.catalog.PageOfCatalogItem;
import com.vmware.vra.jenkinsplugin.model.catalog.PageOfDeployment;
import com.vmware.vra.jenkinsplugin.model.catalog.Resource;
import com.vmware.vra.jenkinsplugin.model.deployment.DeploymentRequest;
import com.vmware.vra.jenkinsplugin.model.iaas.Project;
import com.vmware.vra.jenkinsplugin.model.iaas.ProjectResult;
import com.vmware.vra.jenkinsplugin.util.MapUtils;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeoutException;

public class VraApi implements Serializable {
  private static final long serialVersionUID = -3538449737600216823L;
  private static final long deploymentPollInterval = 30000;
  private static VraClientFactory clientFactory =
      new DefaultFactory(); // Hack to make testing easier. See below!
  private final VraClient vraClient;

  public VraApi(final String url, final String token) throws VRAException {
    this(clientFactory.createClient(url, token));
  }

  public VraApi(final VraClient vraClient) {
    this.vraClient = vraClient;
  }

  public static void setClientFactory(final VraClientFactory clientFactory) {
    VraApi.clientFactory = clientFactory;
  }

  private static void checkResponseSingleton(final List<?> content) throws VRAException {
    if (content == null) {
      throw new VRAException("No content was found");
    }
    if (content.size() != 1) {
      throw new VRAException("Expected 1 item, got " + content.size());
    }
  }

  public CatalogItem getCatalogItemByName(final String name) throws VRAException {
    final PageOfCatalogItem page =
        vraClient.get(
            "/catalog/api/items",
            MapUtils.mapOf("search", name, "size", "1000000"),
            PageOfCatalogItem.class);
    final List<CatalogItem> content = page.getContent();
    return content.stream().filter((c) -> c.getName().equals(name)).findFirst().orElse(null);
  }

  public Project getProjectByName(final String name) throws VRAException {
    final ProjectResult projs =
        vraClient.get(
            "/iaas/api/projects",
            MapUtils.mapOf("$filter", "name eq '" + name + "'"),
            ProjectResult.class);
    checkResponseSingleton(projs.getContent());
    return projs.getContent().get(0);
  }

  public Project getProjectById(final String id) throws VRAException {
    return vraClient.get("/iaas/api/projects/" + id, null, Project.class);
  }

  public CatalogItem getCatalogItemById(final String id) throws VRAException {
    return vraClient.get("/catalog/api/items/" + id, null, CatalogItem.class);
  }

  public String waitForIPAddress(
      final String deploymentId, final String resourceName, final long timeout)
      throws VRAException, InterruptedException, TimeoutException {
    return pollWithTimeout(
        timeout,
        () -> {
          final Deployment dep = getCatalogDeploymentById(deploymentId, true);
          if (dep == null) {
            throw new IllegalArgumentException("Deployment doesn't exist: " + deploymentId);
          }
          final Optional<Resource> resource =
              dep.getResources().stream()
                  .filter((r) -> r.getName().equals(resourceName))
                  .findFirst();
          if (!resource.isPresent()) {
            throw new VRAException("Resource " + resourceName + " does not exist in deployment");
          }
          final Resource r = resource.get();
          final Object props = r.getProperties();
          if (props != null) {
            if (!(props instanceof Map)) {
              throw new VRAException(
                  "Expected properties to be a Map but got" + props.getClass().getName());
            }
            final String ip = ((Map<String, String>) props).get("address");
            if (ip != null) {
              return Optional.of(ip);
            }
          }
          return Optional.empty();
        });
  }

  public CatalogItemRequestResponse[] deployFromCatalog(
      final String ciName,
      final String version,
      final String project,
      final String deploymentName,
      final String reason,
      final Map<String, String> inputs,
      final int count)
      throws VRAException {
    final CatalogItem ci = getCatalogItemByName(ciName);
    final Project proj = getProjectByName(project);

    final CatalogItemRequest cir = new CatalogItemRequest();
    cir.setBulkRequestCount(count);
    cir.setDeploymentName(deploymentName);
    cir.setProjectId(proj.getId());
    cir.setVersion(version);
    cir.setReason(reason);
    cir.setInputs(inputs != null ? inputs : Collections.EMPTY_MAP);
    return vraClient.post(
        "/catalog/api/items/" + ci.getId() + "/request",
        null,
        cir,
        CatalogItemRequestResponse[].class);
  }

  public Deployment getCatalogDeploymentById(
      final String deploymentId, final boolean expandResources) throws VRAException {
    return vraClient.get(
        "/deployment/api/deployments/" + deploymentId,
        MapUtils.mapOf("expandResources", Boolean.toString(expandResources)),
        Deployment.class);
  }

  public Deployment getCatalogDeploymentByName(
      final String deploymentName, final boolean expandResources) throws VRAException {
    final PageOfDeployment deps =
        vraClient.get(
            "/deployment/api/deployments",
            MapUtils.mapOf(
                "expandResources", Boolean.toString(expandResources), "name", deploymentName),
            PageOfDeployment.class);
    checkResponseSingleton(deps.getContent());
    return deps.getContent().get(0);
  }

  public DeploymentRequest deleteCatalogDeployment(final String deploymentId) throws VRAException {
    return vraClient.delete(
        "/deployment/api/deployments/" + deploymentId, null, DeploymentRequest.class);
  }

  public Deployment waitForCatalogDeployment(final String deploymentId, final long timeout)
      throws TimeoutException, VRAException, InterruptedException {
    return pollWithTimeout(
        timeout,
        () -> {
          final Deployment dep = getCatalogDeploymentById(deploymentId, false);
          if (dep != null && dep.getStatus() != null) {
            if (!dep.getStatus().getValue().endsWith("_INPROGRESS")) {
              return Optional.of(getCatalogDeploymentById(deploymentId, true));
            }
          }
          return Optional.empty();
        });
  }

  private <T> T pollWithTimeout(final long timeout, final Callable<Optional<T>> job)
      throws TimeoutException, VRAException, InterruptedException {
    final long start = System.currentTimeMillis();
    for (; ; ) {
      final long remaining = timeout - (System.currentTimeMillis() - start);
      try {
        final Optional<T> result = job.call();
        if (result.isPresent()) {
          return result.get();
        }
      } catch (final VRAException e) {
        throw e;
      } catch (final Exception e) {
        throw new RuntimeException("Unexpected exception", e);
      }
      if (remaining <= 0) {
        throw new TimeoutException("Timeout while waiting for deployment to finish");
      }
      Thread.sleep(Math.min(remaining, deploymentPollInterval));
    }
  }

  public DeploymentRequest getDeploymentRequest(final String id) throws VRAException {
    return vraClient.get("/deployment/api/requests/" + id, null, DeploymentRequest.class);
  }

  public DeploymentRequest waitForRequestCompletion(final String id, final long timeout)
      throws VRAException, TimeoutException, InterruptedException {
    return pollWithTimeout(
        timeout,
        () -> {
          final DeploymentRequest dr = getDeploymentRequest(id);
          if (dr.getStatus() == SUCCESSFUL
              || dr.getStatus() == ABORTED
              || dr.getStatus() == FAILED) {
            return Optional.of(dr);
          }
          return Optional.empty();
        });
  }

  // This construct is a bit of a hack to make it easier to inject mocked clients
  // when we're testing. We can't use mockedConstruction, since the creation may happen in
  // a different thread than the caller's.
  public static class DefaultFactory implements VraClientFactory {
    @Override
    public VraClient createClient(final String url, final String token) throws VRAException {
      return new VraClient(url, token);
    }
  }
}
