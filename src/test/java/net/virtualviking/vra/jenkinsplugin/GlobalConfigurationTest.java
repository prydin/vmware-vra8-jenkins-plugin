package net.virtualviking.vra.jenkinsplugin;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.RestartableJenkinsRule;

public class GlobalConfigurationTest {

  @Rule public RestartableJenkinsRule rr = new RestartableJenkinsRule();

  /**
   * Tries to exercise enough code paths to catch common mistakes:
   *
   * <ul>
   *   <li>missing {@code load}
   *   <li>missing {@code save}
   *   <li>misnamed or absent getter/setter
   *   <li>misnamed {@code textbox}
   * </ul>
   */
  @Test
  public void uiAndStorage() {
    rr.then(
        r -> {
          assertNull("not set initially", GlobalVRAConfiguration.get().getVraURL());
          final HtmlForm config = r.createWebClient().goTo("configure").getFormByName("config");
          final HtmlTextInput textbox = config.getInputByName("_.vraURL");
          textbox.setText("hello");

          r.submit(config);
          assertEquals(
              "global config page let us edit it",
              "hello",
              GlobalVRAConfiguration.get().getVraURL());
        });
    rr.then(
        r -> {
          assertEquals(
              "still there after restart of Jenkins",
              "hello",
              GlobalVRAConfiguration.get().getVraURL());
        });
  }
}
