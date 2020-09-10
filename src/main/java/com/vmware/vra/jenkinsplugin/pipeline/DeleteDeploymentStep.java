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

public class DeleteDeploymentStep extends DeploymentAwareStep implements Serializable {
  private static final long serialVersionUID = -213305840840304411L;

  private long timeout = 300;

  @DataBoundConstructor
  public DeleteDeploymentStep() {}

  public long getTimeout() {
    return timeout;
  }

  @DataBoundSetter
  public void setTimeout(final long timeout) {
    this.timeout = timeout;
  }

  @Override
  public StepExecution start(final StepContext stepContext) throws Exception {
    return new DeleteDeploymentExecution(stepContext, this);
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
      return "vraDeleteDeployment";
    }

    @Override
    @Nonnull
    public String getDisplayName() {
      return "vRA: Delete Deployment";
    }
  }
}
