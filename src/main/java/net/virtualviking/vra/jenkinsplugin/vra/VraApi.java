package net.virtualviking.vra.jenkinsplugin.vra;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.TimeoutException;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.Blueprint;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.PageOfBlueprint;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItem;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequest;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Deployment;
import net.virtualviking.vra.jenkinsplugin.model.catalog.PageOfCatalogItem;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Resource;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Project;
import net.virtualviking.vra.jenkinsplugin.model.iaas.ProjectResult;
import net.virtualviking.vra.jenkinsplugin.util.MapUtils;

public class VraApi implements Serializable {
  private static final long serialVersionUID = -3538449737600216823L;
  private static final long deploymentPollInterval = 30000;
  private final VraClient vraClient;

  public VraApi(final String url, final String token) throws VRAException {
    this(new VraClient(url, token));
  }

  public VraApi(final VraClient vraClient) {
    this.vraClient = vraClient;
  }

  private static void checkResponseSingleton(final List<?> content) throws VRAException {
    if (content == null) {
      throw new VRAException("No content was found");
    }
    if (content.size() != 1) {
      throw new VRAException("Expected 1 item, got " + content.size());
    }
  }

  public Blueprint getBlueprintByName(final String name) throws VRAException {
    final PageOfBlueprint page =
        vraClient.get(
            "/blueprint/api/blueprints", MapUtils.mapOf("name", name), PageOfBlueprint.class);
    if (page.isEmpty()) {
      return null;
    }
    final List<Blueprint> content = page.getContent();
    checkResponseSingleton(content);
    return content.get(0);
  }

  public Blueprint getBlueprintById(final String id) throws VRAException {
    return vraClient.get("/blueprint/api/blueprints/" + id, null, Blueprint.class);
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
    final long start = System.currentTimeMillis();
    Deployment dep = waitForCatalogDeployment(deploymentId, timeout);
    for (; ; ) {
      final Optional<Resource> resource =
          dep.getResources().stream().filter((r) -> r.getName().equals(resourceName)).findFirst();
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
          return ip;
        }
      }
      final long remaining = timeout - (System.currentTimeMillis() - start);
      if (remaining <= 0) {
        throw new TimeoutException("Timeout while waiting for IP address");
      }
      Thread.sleep(Math.min(remaining, 30000));
      dep = getCatalogDeployment(deploymentId, true);
    }
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

  public Deployment getCatalogDeployment(final String deploymentId, final boolean expandResources)
      throws VRAException {
    return vraClient.get(
        "/deployment/api/deployments/" + deploymentId,
        MapUtils.mapOf("expandResources", Boolean.toString(expandResources)),
        Deployment.class);
  }

  public Deployment deleteCatalogDeployment(final String deploymentId) throws VRAException {
    return vraClient.delete("/deployment/api/deployments/" + deploymentId, null, Deployment.class);
  }

  public Deployment waitForCatalogDeployment(final String deploymentId, final long timeout)
      throws TimeoutException, VRAException, InterruptedException {
    final long start = System.currentTimeMillis();
    for (; ; ) {
      final Deployment dep = getCatalogDeployment(deploymentId, false);
      if (dep != null && dep.getStatus() != null) {
        if (!dep.getStatus().getValue().endsWith("_INPROGRESS")) {
          return getCatalogDeployment(deploymentId, true);
        }
      }
      final long remaining = timeout - (System.currentTimeMillis() - start);
      if (remaining <= 0) {
        throw new TimeoutException("Timeout while waiting for deployment to finish");
      }
      Thread.sleep(Math.min(remaining, deploymentPollInterval));
    }
  }
}
