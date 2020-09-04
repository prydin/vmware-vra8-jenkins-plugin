package net.virtualviking.vra.jenkinsplugin.pipeline;

import com.google.common.collect.ImmutableSet;
import hudson.Extension;
import hudson.FilePath;
import hudson.model.TaskListener;
import java.io.Serializable;
import java.util.Set;
import javax.annotation.Nonnull;
import org.jenkinsci.plugins.workflow.steps.StepContext;
import org.jenkinsci.plugins.workflow.steps.StepDescriptor;
import org.jenkinsci.plugins.workflow.steps.StepExecution;
import org.kohsuke.stapler.DataBoundConstructor;
import org.kohsuke.stapler.DataBoundSetter;

public class DeployFromCatalogStep extends AbstractStep implements Serializable {
  private static final long serialVersionUID = -4841698058313077987L;
  private long timeout = 300;
  private String projectName;
  private String catalogItemName;
  private String version;
  private String deploymentName;
  private String reason;
  private String inputs;
  private int count = 1;

  @DataBoundConstructor
  public DeployFromCatalogStep() {}

  @Override
  public StepExecution start(final StepContext stepContext) {
    return new DeployFromCatalogExecution(this, stepContext);
  }

  public String getProjectName() {
    return projectName;
  }

  @DataBoundSetter
  public void setProjectName(final String projectName) {
    this.projectName = projectName;
  }

  public String getCatalogItemName() {
    return catalogItemName;
  }

  @DataBoundSetter
  public void setCatalogItemName(final String catalogItemName) {
    this.catalogItemName = catalogItemName;
  }

  public String getVersion() {
    return version;
  }

  @DataBoundSetter
  public void setVersion(final String version) {
    this.version = version;
  }

  public String getDeploymentName() {
    return deploymentName;
  }

  @DataBoundSetter
  public void setDeploymentName(final String deploymentName) {
    this.deploymentName = deploymentName;
  }

  public String getReason() {
    return reason;
  }

  @DataBoundSetter
  public void setReason(final String reason) {
    this.reason = reason;
  }

  public String getInputs() {
    return inputs;
  }

  @DataBoundSetter
  public void setInputs(final String inputs) {
    this.inputs = inputs;
  }

  public int getCount() {
    return count;
  }

  @DataBoundSetter
  public void setCount(final int count) {
    this.count = count;
  }

  public long getTimeout() {
    return timeout;
  }

  @DataBoundSetter
  void setTimeout(final long timeout) {
    this.timeout = timeout;
  }

  // @Override
  // public StepDescriptor getDescriptor() {
  // return DESCRIPTOR;
  // }

  @Extension
  public static class DescriptorImpl extends StepDescriptor {

    public DescriptorImpl() {}

    @Override
    public Set<? extends Class<?>> getRequiredContext() {
      return ImmutableSet.of(TaskListener.class, FilePath.class);
    }

    @Override
    public String getFunctionName() {
      return "deployFromCatalog";
    }

    @Override
    @Nonnull
    public String getDisplayName() {
      return "vRA: Deploy from catalog";
    }
  }
}
