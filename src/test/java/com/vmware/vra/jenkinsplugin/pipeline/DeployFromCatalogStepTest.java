package com.vmware.vra.jenkinsplugin.pipeline;

import static org.junit.Assert.assertEquals;

import com.vmware.vra.jenkinsplugin.testutils.FileUtils;
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
public class DeployFromCatalogStepTest {
  @Rule public RestartableJenkinsRule rr = new RestartableJenkinsRule();

  private static Map<String, Object> getTestConfig() {
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
    config.put("count", 42L);
    return config;
  }

  @Test
  public void testConfigRoundTrip() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = getTestConfig();
          final DescribableModel<DeployFromCatalogStep> model =
              new DescribableModel<>(DeployFromCatalogStep.class);
          DeployFromCatalogStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          // assertEquals("vraURL", step.getVraURL());
          // assertEquals("token", step.getToken());
          assertEquals("catalogItemName", step.getCatalogItemName());
          assertEquals("projectName", step.getProjectName());
          assertEquals("deploymentName", step.getDeploymentName());
          assertEquals("reason", step.getReason());
          assertEquals("inputs", step.getInputs());
          assertEquals("version", step.getVersion());
          assertEquals(1L, step.getTimeout());
          assertEquals(42, step.getCount());
          model.uninstantiate2_(step);
        });
  }

  @Test
  public void testJsonConfigRoundTrip() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = new HashMap<>();
          config.put("configFormat", "json");
          final String configText = FileUtils.loadResource("/apiresults/DeploymentConfig.json");
          config.put("config", configText);
          final DescribableModel<DeployFromCatalogStep> model =
              new DescribableModel<>(DeployFromCatalogStep.class);
          DeployFromCatalogStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          // assertEquals("vraURL", step.getVraURL());
          // assertEquals("token", step.getToken());
          assertEquals(configText, step.getConfig());
          assertEquals("json", step.getConfigFormat());
          model.uninstantiate2_(step);
        });
  }

  @Test
  public void testYamlConfigRoundTrip() {
    rr.then(
        r -> {
          final StepConfigTester sct = new StepConfigTester(rr.j);
          final Map<String, Object> config = new HashMap<>();
          config.put("configFormat", "yaml");
          final String configText = FileUtils.loadResource("/apiresults/DeploymentConfig.yaml");
          config.put("config", configText);
          final DescribableModel<DeployFromCatalogStep> model =
              new DescribableModel<>(DeployFromCatalogStep.class);
          DeployFromCatalogStep step = model.instantiate(config, StreamTaskListener.fromStderr());
          step = sct.configRoundTrip(step);
          // assertEquals("vraURL", step.getVraURL());
          // assertEquals("token", step.getToken());
          assertEquals(configText, step.getConfig());
          assertEquals("yaml", step.getConfigFormat());
          model.uninstantiate2_(step);
        });
  }
}