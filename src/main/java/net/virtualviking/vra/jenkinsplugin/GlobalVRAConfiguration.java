package net.virtualviking.vra.jenkinsplugin;

import com.cloudbees.plugins.credentials.CredentialsMatchers;
import com.cloudbees.plugins.credentials.CredentialsProvider;
import com.cloudbees.plugins.credentials.common.StandardListBoxModel;
import com.cloudbees.plugins.credentials.domains.URIRequirementBuilder;
import hudson.Extension;
import hudson.model.Item;
import hudson.security.ACL;
import hudson.util.ListBoxModel;
import java.io.Serializable;
import jenkins.model.GlobalConfiguration;
import jenkins.model.Jenkins;
import org.jenkinsci.plugins.plaincredentials.StringCredentials;
import org.kohsuke.stapler.AncestorInPath;
import org.kohsuke.stapler.DataBoundSetter;
import org.kohsuke.stapler.QueryParameter;

@Extension
public class GlobalVRAConfiguration extends GlobalConfiguration implements Serializable {

  private static final long serialVersionUID = -8311413991909048173L;
  private String vraURL;

  private String credentialId;

  public GlobalVRAConfiguration() {
    // When Jenkins is restarted, load any saved configuration from disk.
    load();
  }

  public static GlobalVRAConfiguration get() {
    return jenkins.model.GlobalConfiguration.all().get(GlobalVRAConfiguration.class);
  }

  public String getVraURL() {
    return vraURL;
  }

  @DataBoundSetter
  public void setVraURL(final String vraURL) {
    this.vraURL = vraURL;
    save();
  }

  public String getCredentialId() {
    return credentialId;
  }

  @DataBoundSetter
  public void setCredentialId(final String credentialId) {
    this.credentialId = credentialId;
    save();
  }

  public ListBoxModel doFillCredentialIdItems(
      @AncestorInPath final Item item, @QueryParameter final String credentialId) {
    final StandardListBoxModel result = new StandardListBoxModel();
    final Jenkins instance = Jenkins.get();
    if (item == null) {
      if (!instance.hasPermission(Jenkins.ADMINISTER)) {
        return result.includeCurrentValue(credentialId);
      }
    } else {
      if (!item.hasPermission(Item.EXTENDED_READ)
          && !item.hasPermission(CredentialsProvider.USE_ITEM)) {
        return result.includeCurrentValue(credentialId);
      }
    }
    return result
        .includeEmptyValue()
        .includeMatchingAs(
            ACL.SYSTEM,
            instance,
            StringCredentials.class,
            URIRequirementBuilder.fromUri(getVraURL()).build(),
            CredentialsMatchers.always())
        .includeCurrentValue(credentialId);
  }
}
