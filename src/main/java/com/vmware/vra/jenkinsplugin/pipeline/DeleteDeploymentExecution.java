package com.vmware.vra.jenkinsplugin.pipeline;

import com.vmware.vra.jenkinsplugin.model.deployment.DeploymentRequest;
import com.vmware.vra.jenkinsplugin.util.MapUtils;
import com.vmware.vra.jenkinsplugin.vra.VraApi;
import org.jenkinsci.plugins.workflow.steps.StepContext;
import org.jenkinsci.plugins.workflow.steps.SynchronousNonBlockingStepExecution;

public class DeleteDeploymentExecution extends SynchronousNonBlockingStepExecution<Object> {
  private static final long serialVersionUID = -5637803299301492970L;

  private final DeleteDeploymentStep step;

  public DeleteDeploymentExecution(final StepContext context, final DeleteDeploymentStep step) {
    super(context);
    this.step = step;
  }

  @Override
  protected Object run() throws Exception {
    final VraApi client = step.getClient();
    step.validate();
    final String depId = step.resolveDeploymentId();
    final DeploymentRequest dep = client.deleteCatalogDeployment(depId);
    return MapUtils.mappify(
        client.waitForRequestCompletion(dep.getId().toString(), step.getTimeout() * 1000));
  }
}
