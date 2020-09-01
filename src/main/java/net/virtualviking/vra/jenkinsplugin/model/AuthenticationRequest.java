package net.virtualviking.vra.jenkinsplugin.model;

public class AuthenticationRequest {
  private String refreshToken;

  public AuthenticationRequest() {}

  public AuthenticationRequest(final String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(final String refreshToken) {
    this.refreshToken = refreshToken;
  }
}
