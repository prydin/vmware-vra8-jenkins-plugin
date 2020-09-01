package net.virtualviking.vra.jenkinsplugin.vra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import net.virtualviking.vra.jenkinsplugin.model.blueprint.Blueprint;
import org.junit.Test;

public class VRAClientTest {
  private static final String blueprintName = "plain-ubuntu-18";

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
  public void testGetBlueprint() throws VRAException {
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
}
