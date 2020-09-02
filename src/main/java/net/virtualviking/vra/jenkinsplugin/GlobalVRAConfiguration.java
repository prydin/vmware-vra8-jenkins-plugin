package net.virtualviking.vra.jenkinsplugin;

import hudson.Extension;
import java.io.Serializable;
import jenkins.model.GlobalConfiguration;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

@Extension
public class GlobalVRAConfiguration extends GlobalConfiguration implements Serializable {

  private static final long serialVersionUID = -8311413991909048173L;
  private String url;

  private String token;

  public GlobalVRAConfiguration() {
    // When Jenkins is restarted, load any saved configuration from disk.
    load();
  }

  @DataBoundConstructor
  public GlobalVRAConfiguration(final String url, final String token) {
    this.url = url;
    this.token = token;
  }

  public static GlobalVRAConfiguration get() {
    return jenkins.model.GlobalConfiguration.all().get(GlobalVRAConfiguration.class);
  }

  public String getUrl() {
    return url;
  }

  @DataBoundSetter
  public void setUrl(final String url) {
    this.url = url;
  }

  public String getToken() {
    return token;
  }

  @DataBoundSetter
  public void setToken(final String token) {
    this.token = token;
  }
}
