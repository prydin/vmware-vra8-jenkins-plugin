package net.virtualviking.vra.jenkinsplugin;

import net.virtualviking.vra.jenkinsplugin.util.SecretHelper;
import net.virtualviking.vra.jenkinsplugin.vra.VRAClient;
import net.virtualviking.vra.jenkinsplugin.vra.VRAException;
import org.apache.commons.lang.StringUtils;
import org.jenkinsci.plugins.workflow.steps.Step;
import org.kohsuke.stapler.DataBoundSetter;

abstract class AbstractStep extends Step {
  protected String url;

  protected String token;

  private VRAClient cachedClient;

  public synchronized VRAClient getClient() throws VRAException {
    if (cachedClient != null) {
      return cachedClient;
    }
    return new VRAClient(getUrl(), getToken());
  }

  public String getUrl() {
    if (StringUtils.isNotBlank(url)) {
      return url;
    }
    return GlobalVRAConfiguration.get().getVraURL();
  }

  @DataBoundSetter
  public void setUrl(final String url) {
    this.url = url;
  }

  public String getToken() {
    // If token is specified locally, got get it. Otherwise, try to get it from the global config.
    if (StringUtils.isNotBlank(token)) {
      return token;
    }
    final String credId = GlobalVRAConfiguration.get().getCredentialId();
    if (credId == null) {
      return null;
    }
    return SecretHelper.getSecretFor(credId).orElse(null);
  }

  @DataBoundSetter
  public void setToken(final String token) {
    this.token = token;
  }
}
