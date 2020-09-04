package net.virtualviking.vra.jenkinsplugin.pipeline;

import static org.junit.Assert.assertEquals;

import hudson.util.StreamTaskListener;
import java.util.HashMap;
import java.util.Map;
import org.jenkinsci.plugins.structs.describable.DescribableModel;
import org.jenkinsci.plugins.workflow.steps.StepConfigTester;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.RestartableJenkinsRule;

public class DeployFromCatalogStepTest {
  @Rule public RestartableJenkinsRule rr = new RestartableJenkinsRule();

  @Test
  public void configRoundTrip() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = new HashMap<>();
          config.put("vraURL", "vraURL");
          config.put("token", "token");
          config.put("catalogItemName", "catalogItemName");
          config.put("projectName", "projectName");
          config.put("deploymentName", "deploymentName");
          config.put("reason", "reason");
          config.put("inputs", "inputs");
          config.put("version", "version");
          config.put("timeout", 1L);
          final DescribableModel<DeployFromCatalogStep> model =
              new DescribableModel<>(DeployFromCatalogStep.class);
          DeployFromCatalogStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          assertEquals("vraURL", step.getVraURL());
          assertEquals("token", step.getToken());
          assertEquals("catalogItemName", step.getCatalogItemName());
          assertEquals("projectName", step.getProjectName());
          assertEquals("deploymentName", step.getDeploymentName());
          assertEquals("reason", step.getReason());
          assertEquals("inputs", step.getInputs());
          assertEquals("version", step.getVersion());
          assertEquals(1L, step.getTimeout());
          model.uninstantiate2_(step);
        });
  }
}
