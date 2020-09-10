package com.vmware.vra.jenkinsplugin.vra;

public interface VraClientFactory {
  VraClient createClient(String url, String token) throws VRAException;
}
