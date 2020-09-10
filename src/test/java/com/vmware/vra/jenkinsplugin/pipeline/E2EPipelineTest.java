package com.vmware.vra.jenkinsplugin.pipeline;

import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.CredentialsScope;
import com.cloudbees.plugins.credentials.domains.Domain;
import com.gargoylesoftware.htmlunit.html.HtmlForm;
import com.gargoylesoftware.htmlunit.html.HtmlTextInput;
import com.vmware.vra.jenkinsplugin.testutils.FileUtils;
import hudson.util.Secret;
import org.jenkinsci.plugins.plaincredentials.StringCredentials;
import org.jenkinsci.plugins.plaincredentials.impl.StringCredentialsImpl;
import org.jenkinsci.plugins.workflow.cps.CpsFlowDefinition;
import org.jenkinsci.plugins.workflow.job.WorkflowJob;
import org.jenkinsci.plugins.workflow.job.WorkflowRun;
import org.junit.Rule;
import org.junit.Test;
import org.jvnet.hudson.test.RestartableJenkinsRule;
import org.jvnet.hudson.test.recipes.WithTimeout;

public class E2EPipelineTest {
  @Rule public RestartableJenkinsRule rr = new RestartableJenkinsRule();

  private void testPipeline(final String name) {
    final String url = System.getenv("VRA_URL");
    if (url == null) {
      System.err.println("VRA_URL not set. Skipping test");
      return;
    }
    final String token = System.getenv("VRA_TOKEN");
    rr.then(
        r -> {
          rr.j.timeout = 300;

          // Create vRA token credential
          final StringCredentials vraCredentials =
              new StringCredentialsImpl(
                  CredentialsScope.GLOBAL, "vraToken", null, Secret.fromString(token));
          CredentialsProvider.lookupStores(r.jenkins)
              .iterator()
              .next()
              .addCredentials(Domain.global(), vraCredentials);

          // Edit configuration
          final HtmlForm config = r.createWebClient().goTo("configure").getFormByName("config");
          final HtmlTextInput textbox = config.getInputByName("_.vraURL");
          textbox.setText(url);
          config.getSelectByName("_.credentialId").setSelectedIndex(1);
          r.submit(config);

          final String pipeline = FileUtils.loadResource(name);

          final WorkflowJob job = r.jenkins.createProject(WorkflowJob.class, "project");
          job.setDefinition(new CpsFlowDefinition(pipeline, true));
          final WorkflowRun b = rr.j.buildAndAssertSuccess(job);
          r.assertLogContains("All deployments finished!", b);
        });
  }

  @WithTimeout(600)
  @Test
  public void testDeployFromCatalogPipeline() {
    testPipeline("/com/vmware/vra/jenkinsplugin/pipelines/DeployFromCatalog.groovy");
  }

  @WithTimeout(600)
  @Test
  public void testDeployFromCatalogPipelineWithJsonConfig() {
    testPipeline("/com/vmware/vra/jenkinsplugin/pipelines/DeployFromCatalogWithConfigJson.groovy");
  }

  @WithTimeout(600)
  @Test
  public void testDeployFromCatalogPipelineWithYamlConfig() {
    testPipeline("/com/vmware/vra/jenkinsplugin/pipelines/DeployFromCatalogWithConfigYaml.groovy");
  }
}
