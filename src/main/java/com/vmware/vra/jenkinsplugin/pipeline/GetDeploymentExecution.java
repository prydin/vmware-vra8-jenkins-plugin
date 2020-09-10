package com.vmware.vra.jenkinsplugin.pipeline;

import com.vmware.vra.jenkinsplugin.util.MapUtils;
import com.vmware.vra.jenkinsplugin.vra.VraApi;
import org.jenkinsci.plugins.workflow.steps.StepContext;
import org.jenkinsci.plugins.workflow.steps.SynchronousNonBlockingStepExecution;

public class GetDeploymentExecution extends SynchronousNonBlockingStepExecution<Object> {
  private static final long serialVersionUID = -5637803299301492970L;

  private final GetDeploymentStep step;

  public GetDeploymentExecution(final StepContext context, final GetDeploymentStep step) {
    super(context);
    this.step = step;
  }

  @Override
  protected Object run() throws Exception {
    final VraApi client = step.getClient();
    step.validate();
    final String depId = step.resolveDeploymentId();
    return MapUtils.mappify(client.getCatalogDeploymentById(depId, step.getExpandResources()));
  }
}
