package com.vmware.vra.jenkinsplugin.pipeline;

import com.google.errorprone.annotations.DoNotCall;
import com.vmware.vra.jenkinsplugin.GlobalVRAConfiguration;
import com.vmware.vra.jenkinsplugin.util.SecretHelper;
import com.vmware.vra.jenkinsplugin.vra.VRAException;
import com.vmware.vra.jenkinsplugin.vra.VraApi;
import java.io.Serializable;
import org.apache.commons.lang.StringUtils;
import org.jenkinsci.plugins.workflow.steps.Step;
import org.kohsuke.stapler.DataBoundSetter;

abstract class AbstractStep extends Step implements Serializable {
  private static final long serialVersionUID = 4802272043548740707L;
  private String vraURL;

  private String token;

  private VraApi cachedClient;

  public AbstractStep() {}

  public synchronized VraApi getClient() throws VRAException {
    if (cachedClient != null) {
      return cachedClient;
    }
    return cachedClient = new VraApi(resolveVraURL(), resolveToken());
  }

  @DoNotCall("use resolveVraURL instead!")
  public String getVraURL() {
    return vraURL;
  }

  @DataBoundSetter
  public void setVraURL(final String vraURL) {
    this.vraURL = vraURL;
  }

  public String resolveVraURL() {
    if (StringUtils.isNotBlank(vraURL)) {
      return vraURL;
    }
    return GlobalVRAConfiguration.get().getVraURL();
  }

  @DoNotCall("use resolveToken instead!")
  public String getToken() {
    return token;
  }

  @DataBoundSetter
  public void setToken(final String token) {
    this.token = token;
  }

  public String resolveToken() {
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
}
