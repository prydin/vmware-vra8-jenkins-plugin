package com.vmware.vra.jenkinsplugin.vra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.google.gson.Gson;
import com.vmware.vra.jenkinsplugin.model.catalog.CatalogItem;
import com.vmware.vra.jenkinsplugin.model.catalog.CatalogItemRequest;
import com.vmware.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import com.vmware.vra.jenkinsplugin.model.catalog.Deployment;
import com.vmware.vra.jenkinsplugin.model.catalog.PageOfCatalogItem;
import com.vmware.vra.jenkinsplugin.model.deployment.DeploymentRequest;
import com.vmware.vra.jenkinsplugin.model.iaas.Project;
import com.vmware.vra.jenkinsplugin.model.iaas.ProjectResult;
import com.vmware.vra.jenkinsplugin.testutils.FileUtils;
import java.util.UUID;
import java.util.concurrent.TimeoutException;
import org.junit.Test;

public class VraApiTest {
  private static final String catalogItemName = "plain-ubuntu-18";

  private static final String projectName = "Pontus Project";

  private static final String catalogItemId = "563f6b86-e379-3965-81eb-90471da4d688";

  private static final String projectId = "9de81991-4063-43b8-9542-dbaff1e588f8";

  private static final String version = "6";

  @Test
  public void testLogin() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VraApi client = new VraApi(url, System.getenv("VRA_TOKEN"));
    assertNotNull(client);
  }

  @Test
  public void testGetCatalogItemByName() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VraApi client = new VraApi(url, System.getenv("VRA_TOKEN"));
    final CatalogItem ci = client.getCatalogItemByName(catalogItemName);
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
  }

  @Test
  public void testGetCatalogItemByNameMocked() throws Exception {
    final Gson gson = new Gson();
    final PageOfCatalogItem wanted =
        gson.fromJson(
            FileUtils.loadResource("/apiresults/PageOfCatalogItem.json"), PageOfCatalogItem.class);
    final VraClient mocked = mock(VraClient.class);
    when(mocked.get(eq("/catalog/api/items"), any(), eq(PageOfCatalogItem.class)))
        .thenReturn(wanted);
    final VraApi client = new VraApi(mocked);
    final CatalogItem ci = client.getCatalogItemByName(catalogItemName);
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
    verify(mocked, times(1)).get(eq("/catalog/api/items"), any(), eq(PageOfCatalogItem.class));
  }

  @Test
  public void testGetCatalogItemById() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VraApi client = new VraApi(url, System.getenv("VRA_TOKEN"));
    CatalogItem ci = client.getCatalogItemByName(catalogItemName);
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
    ci = client.getCatalogItemById(ci.getId().toString());
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
  }

  @Test
  public void testGetCatalogItemByIdMocked() throws Exception {
    final Gson gson = new Gson();
    final CatalogItem wanted =
        gson.fromJson(FileUtils.loadResource("/apiresults/CatalogItem.json"), CatalogItem.class);
    final VraClient mocked = mock(VraClient.class);
    when(mocked.get(eq("/catalog/api/items/" + catalogItemId), any(), eq(CatalogItem.class)))
        .thenReturn(wanted);
    final VraApi client = new VraApi(mocked);
    final CatalogItem ci = client.getCatalogItemById(catalogItemId);
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
    verify(mocked, times(1))
        .get(eq("/catalog/api/items/" + catalogItemId), any(), eq(CatalogItem.class));
  }

  @Test
  public void getProjectByName() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VraApi client = new VraApi(url, System.getenv("VRA_TOKEN"));
    final Project proj = client.getProjectByName(projectName);
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
  }

  @Test
  public void getProjectByNameMocked() throws Exception {
    final Gson gson = new Gson();
    final ProjectResult wanted =
        gson.fromJson(
            FileUtils.loadResource("/apiresults/ProjectResult.json"), ProjectResult.class);
    final VraClient mocked = mock(VraClient.class);
    when(mocked.get(eq("/iaas/api/projects"), any(), eq(ProjectResult.class))).thenReturn(wanted);
    final VraApi client = new VraApi(mocked);
    final Project proj = client.getProjectByName(projectName);
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
    verify(mocked, times(1)).get(eq("/iaas/api/projects"), any(), eq(ProjectResult.class));
  }

  @Test
  public void getProjectById() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VraApi client = new VraApi(url, System.getenv("VRA_TOKEN"));
    Project proj = client.getProjectByName(projectName);
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
    proj = client.getProjectById(proj.getId());
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
  }

  @Test
  public void getProjectByIdMocked() throws Exception {
    final Gson gson = new Gson();
    final Project wanted =
        gson.fromJson(FileUtils.loadResource("/apiresults/Project.json"), Project.class);
    final VraClient mocked = mock(VraClient.class);
    when(mocked.get(eq("/iaas/api/projects/" + projectId), any(), eq(Project.class)))
        .thenReturn(wanted);
    final VraApi client = new VraApi(mocked);
    final Project proj = client.getProjectById(projectId);
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
    verify(mocked, times(1)).get(eq("/iaas/api/projects/" + projectId), any(), eq(Project.class));
  }

  @Test
  public void testDeployment() throws VRAException, TimeoutException, InterruptedException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VraApi client = new VraApi(url, System.getenv("VRA_TOKEN"));
    final String depName = "Test " + UUID.randomUUID().toString();
    final CatalogItemRequestResponse[] resp =
        client.deployFromCatalog(
            catalogItemName, version, projectName, depName, "Some reason", null, 1);
    assertEquals(1, resp.length);
    assertNotNull(resp[0]);
    assertNotNull(resp[0].getDeploymentId());
    assertEquals(depName, resp[0].getDeploymentName());

    final Deployment dep = client.waitForCatalogDeployment(resp[0].getDeploymentId(), 300000);
    assertNotNull(dep);
    assertNotNull(dep.getId());
    assertEquals(resp[0].getDeploymentId(), dep.getId().toString());

    final DeploymentRequest dr = client.deleteCatalogDeployment(dep.getId().toString());
    assertNotNull(dr);
    assertNotNull(dr.getId());

    final DeploymentRequest deploymentRequest =
        client.waitForRequestCompletion(dr.getId().toString(), 300000);
    assertNotNull(deploymentRequest);
    assertNotNull(deploymentRequest.getId());

    final String ip = client.waitForIPAddress(resp[0].getDeploymentId(), "UbuntuMachine", 300000);
    assertNotNull(ip);
    assertTrue(
        ip.matches(
            "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"));
  }

  @Test
  public void testDeploymentMocked() throws Exception {
    final Gson gson = new Gson();

    // Load templates
    final ProjectResult wantedProject =
        gson.fromJson(
            FileUtils.loadResource("/apiresults/ProjectResult.json"), ProjectResult.class);
    final CatalogItemRequestResponse[] wantedResponse =
        gson.fromJson(
            FileUtils.loadResource("/apiresults/CatalogItemRequestResponse.json"),
            CatalogItemRequestResponse[].class);
    final CatalogItemRequest wantedRequest =
        gson.fromJson(
            FileUtils.loadResource("/apiresults/CatalogItemRequest.json"),
            CatalogItemRequest.class);
    final PageOfCatalogItem wantedCatalogItem =
        gson.fromJson(
            FileUtils.loadResource("/apiresults/PageOfCatalogItem.json"), PageOfCatalogItem.class);

    // Set up mocking
    final VraClient mocked = mock(VraClient.class);
    when(mocked.get(eq("/iaas/api/projects"), any(), eq(ProjectResult.class)))
        .thenReturn(wantedProject);
    when(mocked.get(eq("/catalog/api/items"), any(), eq(PageOfCatalogItem.class)))
        .thenReturn(wantedCatalogItem);
    when(mocked.post(eq("/catalog/api/items/" + catalogItemId + "/request"), any(), any(), any()))
        .thenReturn(wantedResponse);
    final VraApi client = new VraApi(mocked);
    final String depName = wantedResponse[0].getDeploymentName();
    final CatalogItemRequestResponse[] resp =
        client.deployFromCatalog(
            catalogItemName, version, projectName, depName, "Some reason", null, 1);
    verify(mocked, times(1))
        .post(
            eq("/catalog/api/items/" + catalogItemId + "/request"),
            any(),
            eq(wantedRequest),
            eq(CatalogItemRequestResponse[].class));
    assertEquals(1, resp.length);
    assertNotNull(resp[0]);
    assertNotNull(resp[0].getDeploymentId());
    assertEquals(depName, resp[0].getDeploymentName());
  }
}
