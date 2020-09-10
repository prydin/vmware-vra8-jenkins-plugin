package com.vmware.vra.jenkinsplugin.pipeline;

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

public class WaitForAddressStep extends AbstractStep implements Serializable {
  private static final long serialVersionUID = -213305840840304411L;

  private String deploymentId;

  private String resourceName;

  private long timeout = 300;

  @DataBoundConstructor
  public WaitForAddressStep(final String deploymentId, final String resourceName) {
    this.resourceName = resourceName;
    this.deploymentId = deploymentId;
  }

  public String getDeploymentId() {
    return deploymentId;
  }

  @DataBoundSetter
  public void setDeploymentId(final String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public String getResourceName() {
    return resourceName;
  }

  @DataBoundSetter
  public void setResourceName(final String resourceName) {
    this.resourceName = resourceName;
  }

  public long getTimeout() {
    return timeout;
  }

  @DataBoundSetter
  public void setTimeout(final long timeout) {
    this.timeout = timeout;
  }

  @Override
  public StepExecution start(final StepContext stepContext) throws Exception {
    return new WaitForAddressExecution(stepContext, this);
  }

  @Extension
  public static class DescriptorImpl extends StepDescriptor {

    public DescriptorImpl() {}

    @Override
    public Set<? extends Class<?>> getRequiredContext() {
      return ImmutableSet.of(TaskListener.class, FilePath.class);
    }

    @Override
    public String getFunctionName() {
      return "vraWaitForAddress";
    }

    @Override
    @Nonnull
    public String getDisplayName() {
      return "vRA: Wait for Address";
    }
  }
}
