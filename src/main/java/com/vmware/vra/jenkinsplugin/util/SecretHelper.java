package com.vmware.vra.jenkinsplugin.util;

import com.cloudbees.plugins.credentials.CredentialsMatcher;
import com.cloudbees.plugins.credentials.CredentialsMatchers;
import com.cloudbees.plugins.credentials.CredentialsProvider;
import hudson.security.ACL;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import jenkins.model.Jenkins;
import org.jenkinsci.plugins.plaincredentials.StringCredentials;

public class SecretHelper {
  public static Optional<String> getSecretFor(final String credentialsId) {

    final List<StringCredentials> credentials =
        CredentialsProvider.lookupCredentials(
            StringCredentials.class, Jenkins.get(), ACL.SYSTEM, Collections.emptyList());
    final CredentialsMatcher matcher = CredentialsMatchers.withId(credentialsId);

    return Optional.ofNullable(CredentialsMatchers.firstOrNull(credentials, matcher))
        .flatMap(creds -> Optional.of(creds.getSecret()))
        .flatMap(secret -> Optional.of(secret.getPlainText()));
  }
}
