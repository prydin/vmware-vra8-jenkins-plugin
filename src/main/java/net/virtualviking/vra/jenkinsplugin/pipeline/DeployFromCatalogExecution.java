package net.virtualviking.vra.jenkinsplugin.pipeline;

import static net.virtualviking.vra.jenkinsplugin.util.ValueCheckers.notBlank;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import hudson.model.TaskListener;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.annotation.Nonnull;
import net.virtualviking.vra.jenkinsplugin.model.catalog.CatalogItemRequestResponse;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Deployment;
import net.virtualviking.vra.jenkinsplugin.util.MapUtils;
import net.virtualviking.vra.jenkinsplugin.vra.VraApi;
import org.apache.commons.lang.StringUtils;
import org.jenkinsci.plugins.workflow.steps.StepContext;
import org.jenkinsci.plugins.workflow.steps.SynchronousNonBlockingStepExecution;

public class DeployFromCatalogExecution extends SynchronousNonBlockingStepExecution<Object>
    implements Serializable {
  private static final long serialVersionUID = -2997964521533971915L;
  private static final Type mapStringString = new TypeToken<Map<String, String>>() {}.getType();
  private final DeployFromCatalogStep step;

  protected DeployFromCatalogExecution(
      @Nonnull final DeployFromCatalogStep step, @Nonnull final StepContext context) {
    super(context);
    this.step = step;
  }

  @Override
  protected Object run() throws Exception {
    final PrintStream log = getContext().get(TaskListener.class).getLogger();
    final Map<String, String> inputMap;
    final String inputs = step.getInputs();
    if (!StringUtils.isBlank(inputs)) {
      inputMap = new Gson().fromJson(inputs, mapStringString);
    } else {
      inputMap = new HashMap<>();
    }

    // If the deploymentName is missing, we'll generate one
    String deploymentName = step.getDeploymentName();
    if (StringUtils.isBlank(deploymentName)) {
      deploymentName = "Jenkins-#";
    }

    // Replace any occurrences of '#' with a UUID
    if (deploymentName.contains("#")) {
      deploymentName = deploymentName.replace("#", UUID.randomUUID().toString());
    }
    final VraApi client = step.getClient();
    final CatalogItemRequestResponse[] response =
        client.deployFromCatalog(
            notBlank(step.getCatalogItemName(), "catalogItemName"),
            notBlank(step.getVersion(), "version"),
            notBlank(step.getProjectName(), "projectName"),
            deploymentName,
            step.getReason(),
            inputMap,
            step.getCount());
    log.println("Successfully requested deployment. Deployment ids: " + Arrays.toString(response));
    log.println("Waiting for deployment to complete");

    // Wait for all deployments to finish
    final Deployment[] deps = new Deployment[response.length];
    int i = 0;
    for (final CatalogItemRequestResponse cirr : response) {
      deps[i++] = client.waitForCatalogDeployment(cirr.getDeploymentId(), step.getTimeout() * 1000);
      log.println(
          "Deployment " + cirr.getDeploymentName() + "(" + cirr.getDeploymentId() + ") finished");
    }
    log.println("All deployments finished!");
    return MapUtils.mappify(deps);
  }
}