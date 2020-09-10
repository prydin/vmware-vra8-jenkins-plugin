package com.vmware.vra.jenkinsplugin.pipeline;

import static org.apache.commons.lang.StringUtils.isBlank;
import static org.apache.commons.lang.StringUtils.isNotBlank;

import com.vmware.vra.jenkinsplugin.model.catalog.Deployment;
import com.vmware.vra.jenkinsplugin.vra.VRAException;
import org.kohsuke.stapler.DataBoundSetter;

public abstract class DeploymentAwareStep extends AbstractStep {
  private static final long serialVersionUID = 7479667613779694008L;
  private String deploymentId;

  private String deploymentName;

  public String getDeploymentId() {
    return deploymentId;
  }

  @DataBoundSetter
  public void setDeploymentId(final String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  @DataBoundSetter
  public void setDeploymentName(final String deploymentName) {
    this.deploymentName = deploymentName;
  }

  protected String resolveDeploymentId() throws VRAException {
    final String depId = getDeploymentId();
    final String depName = getDeploymentName();
    if (isNotBlank(depId)) {
      return depId;
    }
    final Deployment dep = getClient().getCatalogDeploymentByName(depName, false);
    if (dep == null) {
      throw new IllegalArgumentException("Deployment " + depName + " does not exist");
    }
    return dep.getId().toString();
  }

  protected void validate() throws IllegalArgumentException {
    if (isNotBlank(getDeploymentId()) && isNotBlank(getDeploymentName())) {
      throw new IllegalArgumentException(
          "'deploymentId' and 'deploymentName' are mutually exclusive");
    }
    if (isBlank(getDeploymentId()) && isBlank(getDeploymentName())) {
      throw new IllegalArgumentException(
          "Either 'deploymentId' or 'deploymentName' must be specified");
    }
  }
}
