package net.virtualviking.vra.jenkinsplugin.pipeline;

import java.io.Serializable;
import net.virtualviking.vra.jenkinsplugin.GlobalVRAConfiguration;
import net.virtualviking.vra.jenkinsplugin.util.SecretHelper;
import net.virtualviking.vra.jenkinsplugin.vra.VRAException;
import net.virtualviking.vra.jenkinsplugin.vra.VraApi;
import org.apache.commons.lang.StringUtils;
import org.jenkinsci.plugins.workflow.steps.Step;
import org.kohsuke.stapler.DataBoundSetter;

abstract class AbstractStep extends Step implements Serializable {
  private static final long serialVersionUID = 4802272043548740707L;
  protected String vraURL;

  protected String token;

  private VraApi cachedClient;

  public synchronized VraApi getClient() throws VRAException {
    if (cachedClient != null) {
      return cachedClient;
    }
    cachedClient = new VraApi(getVraURL(), getToken());
    return cachedClient;
  }

  public String getVraURL() {
    if (StringUtils.isNotBlank(vraURL)) {
      return vraURL;
    }
    return GlobalVRAConfiguration.get().getVraURL();
  }

  @DataBoundSetter
  public void setVraURL(final String vraURL) {
    this.vraURL = vraURL;
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
