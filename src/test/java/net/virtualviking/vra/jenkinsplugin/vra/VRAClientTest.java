package net.virtualviking.vra.jenkinsplugin.vra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.UUID;
import java.util.concurrent.TimeoutException;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.Blueprint;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItem;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Deployment;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Project;
import org.junit.Test;

public class VRAClientTest {
  private static final String blueprintName = "plain-ubuntu-18";

  private static final String catalogItemName = "plain-ubuntu-18";

  private static final String projectName = "Pontus Project";

  private static final String version = "6";

  @Test
  public void testLogin() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    assertNotNull(client);
  }

  @Test
  public void testGetBlueprintByName() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    final Blueprint bp = client.getBlueprintByName(blueprintName);
    assertNotNull(bp);
    assertEquals(blueprintName, bp.getName());
  }

  @Test
  public void testGetBlueprintById() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    Blueprint bp = client.getBlueprintByName(blueprintName);
    assertNotNull(bp);
    assertEquals(blueprintName, bp.getName());
    bp = client.getBlueprintById(bp.getId());
    assertNotNull(bp);
    assertEquals(blueprintName, bp.getName());
  }

  @Test
  public void testGetCatalogItemByName() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    final CatalogItem ci = client.getCatalogItemByName(catalogItemName);
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
  }

  @Test
  public void testGetCatalogItemById() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    CatalogItem ci = client.getCatalogItemByName(catalogItemName);
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
    ci = client.getCatalogItemById(ci.getId().toString());
    assertNotNull(ci);
    assertEquals(catalogItemName, ci.getName());
  }

  @Test
  public void getProjectByName() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    final Project proj = client.getProjectByName(projectName);
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
  }

  @Test
  public void getProjectById() throws VRAException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    Project proj = client.getProjectByName(projectName);
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
    proj = client.getProjectById(proj.getId());
    assertNotNull(proj);
    assertEquals(projectName, proj.getName());
  }

  @Test
  public void testDeployment() throws VRAException, TimeoutException, InterruptedException {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final VRAClient client = new VRAClient(url, System.getenv("VRA_TOKEN"));
    final String depName = "Test " + UUID.randomUUID().toString();
    final CatalogItemRequestResponse[] resp =
        client.deployFromCatalog(
            catalogItemName, version, projectName, depName, "Some reason", null, 1);
    assertEquals(1, resp.length);
    assertNotNull(resp[0]);
    assertNotNull(resp[0].getDeploymentId());
    assertEquals(depName, resp[0].getDeploymentName());

    Deployment dep = client.waitForCatalogDeployment(resp[0].getDeploymentId(), 300000);
    assertNotNull(dep);
    assertNotNull(dep.getId());
    assertEquals(resp[0].getDeploymentId(), dep.getId().toString());

    dep = client.deleteCatalogDeployment(dep.getId().toString());
    assertNotNull(dep);
    assertNotNull(dep.getId());

    dep = client.waitForCatalogDeployment(resp[0].getDeploymentId(), 300000);
    assertNotNull(dep);
    assertNotNull(dep.getId());

    final String ip = client.waitForIPAddress(resp[0].getDeploymentId(), "UbuntuMachine", 300000);
    assertNotNull(ip);
    assertTrue(
        ip.matches(
            "^(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"));
  }
}
