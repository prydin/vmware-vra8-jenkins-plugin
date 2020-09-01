package net.virtualviking.vra.jenkinsplugin.model;

public class AuthenticationResponse {
  private String token;

  private String tokenType;

  public AuthenticationResponse() {}

  public AuthenticationResponse(final String token, final String tokenType) {
    this.token = token;
    this.tokenType = tokenType;
  }

  public String getToken() {
    return token;
  }

  public void setToken(final String token) {
    this.token = token;
  }

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(final String tokenType) {
    this.tokenType = tokenType;
  }
}
