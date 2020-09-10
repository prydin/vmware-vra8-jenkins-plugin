package com.vmware.vra.jenkinsplugin.pipeline;

import com.vmware.vra.jenkinsplugin.vra.VraApi;
import org.jenkinsci.plugins.workflow.steps.StepContext;
import org.jenkinsci.plugins.workflow.steps.SynchronousNonBlockingStepExecution;

public class WaitForAddressExecution extends SynchronousNonBlockingStepExecution<String> {
  private static final long serialVersionUID = -5637803299301492970L;

  private final WaitForAddressStep step;

  public WaitForAddressExecution(final StepContext context, final WaitForAddressStep step) {
    super(context);
    this.step = step;
  }

  @Override
  protected String run() throws Exception {
    final VraApi client = step.getClient();
    return client.waitForIPAddress(
        step.getDeploymentId(), step.getResourceName(), step.getTimeout() * 1000);
  }
}
