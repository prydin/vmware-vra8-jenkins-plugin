package com.vmware.vra.jenkinsplugin.pipeline;

import static org.junit.Assert.assertEquals;

import hudson.util.StreamTaskListener;
import java.util.HashMap;
import java.util.Map;
import org.jenkinsci.plugins.structs.describable.DescribableModel;
import org.jenkinsci.plugins.workflow.steps.StepConfigTester;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.jvnet.hudson.test.RestartableJenkinsRule;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GetDeploymentTest {
  @Rule public RestartableJenkinsRule rr = new RestartableJenkinsRule();

  @Test
  public void testConfigRoundtripWithId() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = new HashMap<>();
          config.put("vraURL", "vraURL");
          config.put("token", "token");
          config.put("deploymentId", "deploymentId");
          config.put("timeout", 1L);
          final DescribableModel<GetDeploymentStep> model =
              new DescribableModel<>(GetDeploymentStep.class);
          GetDeploymentStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          // assertEquals("vraURL", step.getVraURL());
          // assertEquals("token", step.getToken());
          assertEquals("deploymentId", step.getDeploymentId());
          assertEquals(1L, step.getTimeout());
          model.uninstantiate2_(step);
        });
  }

  @Test
  public void testConfigRoundtripWithName() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = new HashMap<>();
          config.put("vraURL", "vraURL");
          config.put("token", "token");
          config.put("deploymentName", "deploymentName");
          config.put("timeout", 1L);
          final DescribableModel<GetDeploymentStep> model =
              new DescribableModel<>(GetDeploymentStep.class);
          GetDeploymentStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          // assertEquals("vraURL", step.getVraURL());
          // assertEquals("token", step.getToken());
          assertEquals("deploymentName", step.getDeploymentId());
          assertEquals(1L, step.getTimeout());
          model.uninstantiate2_(step);
        });
  }
}
