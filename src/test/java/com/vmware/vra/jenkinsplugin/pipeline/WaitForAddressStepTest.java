package com.vmware.vra.jenkinsplugin.pipeline;

import static org.junit.Assert.assertEquals;

import hudson.util.StreamTaskListener;
import java.util.HashMap;
import java.util.Map;
import org.jenkinsci.plugins.structs.describable.DescribableModel;
import org.jenkinsci.plugins.workflow.steps.StepConfigTester;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.RestartableJenkinsRule;

public class WaitForAddressStepTest {
  @Rule public RestartableJenkinsRule rr = new RestartableJenkinsRule();

  @Test
  public void configRoundTrip() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = new HashMap<>();
          config.put("vraURL", "vraURL");
          config.put("token", "token");
          config.put("deploymentId", "deploymentId");
          config.put("resourceName", "resourceName");
          config.put("timeout", 1L);
          final DescribableModel<WaitForAddressStep> model =
              new DescribableModel<>(WaitForAddressStep.class);
          WaitForAddressStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          // assertEquals("vraURL", step.getVraURL());
          // assertEquals("token", step.getToken());
          assertEquals("resourceName", step.getResourceName());
          assertEquals("deploymentId", step.getDeploymentId());
          assertEquals(1L, step.getTimeout());
          model.uninstantiate2_(step);
        });
  }
}
