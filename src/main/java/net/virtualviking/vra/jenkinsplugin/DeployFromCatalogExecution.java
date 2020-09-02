package net.virtualviking.vra.jenkinsplugin;

import javax.annotation.Nonnull;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Deployment;
import net.virtualviking.vra.jenkinsplugin.vra.VRAClient;
import org.jenkinsci.plugins.workflow.steps.StepContext;
import org.jenkinsci.plugins.workflow.steps.SynchronousNonBlockingStepExecution;

public class DeployFromCatalogExecution extends SynchronousNonBlockingStepExecution<Deployment[]> {
  private static final long serialVersionUID = -2997964521533971915L;

  private final DeployFromCatalogStep step;

  protected DeployFromCatalogExecution(
      @Nonnull final DeployFromCatalogStep step, @Nonnull final StepContext context) {
    super(context);
    this.step = step;
  }

  @Override
  protected Deployment[] run() throws Exception {
    final VRAClient client = step.getClient();
    final CatalogItemRequestResponse[] response =
        client.deployFromCatalog(
            step.getCatalogItemName(),
            step.getVersion(),
            step.getProjectName(),
            step.getDescription(),
            step.getReason(),
            step.getInputs(),
            step.getCount());

    // Wait for all deployments to finish
    final Deployment[] deps = new Deployment[response.length];
    int i = 0;
    for (final CatalogItemRequestResponse cirr : response) {
      deps[i++] = client.waitForCatalogDeployment(cirr.getDeploymentId(), step.getTimeout() * 1000);
    }
    return deps;
  }
}
