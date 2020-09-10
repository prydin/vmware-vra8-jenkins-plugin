/*
 * VMware Cloud Assembly IaaS API
 * A multi-cloud IaaS API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-01-15
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.iaas;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** Load balancer route configuration. */
@Schema(description = "Load balancer route configuration.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class RouteConfiguration {
  @SerializedName("protocol")
  private String protocol = null;

  @SerializedName("port")
  private String port = null;

  @SerializedName("memberPort")
  private String memberPort = null;

  @SerializedName("memberProtocol")
  private String memberProtocol = null;

  @SerializedName("healthCheckConfiguration")
  private HealthCheckConfiguration healthCheckConfiguration = null;

  @SerializedName("algorithmParameters")
  private String algorithmParameters = null;

  @SerializedName("algorithm")
  private String algorithm = null;

  public RouteConfiguration protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

  /**
   * The protocol of the incoming load balancer requests.
   *
   * @return protocol
   */
  @Schema(
      example = "TCP, UDP",
      required = true,
      description = "The protocol of the incoming load balancer requests.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public RouteConfiguration port(String port) {
    this.port = port;
    return this;
  }

  /**
   * Port which the load balancer is listening to.
   *
   * @return port
   */
  @Schema(
      example = "80",
      required = true,
      description = "Port which the load balancer is listening to.")
  public String getPort() {
    return port;
  }

  public void setPort(String port) {
    this.port = port;
  }

  public RouteConfiguration memberPort(String memberPort) {
    this.memberPort = memberPort;
    return this;
  }

  /**
   * Member port where the traffic is routed to.
   *
   * @return memberPort
   */
  @Schema(
      example = "80",
      required = true,
      description = "Member port where the traffic is routed to.")
  public String getMemberPort() {
    return memberPort;
  }

  public void setMemberPort(String memberPort) {
    this.memberPort = memberPort;
  }

  public RouteConfiguration memberProtocol(String memberProtocol) {
    this.memberProtocol = memberProtocol;
    return this;
  }

  /**
   * The protocol of the member traffic.
   *
   * @return memberProtocol
   */
  @Schema(
      example = "TCP, UDP",
      required = true,
      description = "The protocol of the member traffic.")
  public String getMemberProtocol() {
    return memberProtocol;
  }

  public void setMemberProtocol(String memberProtocol) {
    this.memberProtocol = memberProtocol;
  }

  public RouteConfiguration healthCheckConfiguration(
      HealthCheckConfiguration healthCheckConfiguration) {
    this.healthCheckConfiguration = healthCheckConfiguration;
    return this;
  }

  /**
   * Get healthCheckConfiguration
   *
   * @return healthCheckConfiguration
   */
  @Schema(description = "")
  public HealthCheckConfiguration getHealthCheckConfiguration() {
    return healthCheckConfiguration;
  }

  public void setHealthCheckConfiguration(HealthCheckConfiguration healthCheckConfiguration) {
    this.healthCheckConfiguration = healthCheckConfiguration;
  }

  public RouteConfiguration algorithmParameters(String algorithmParameters) {
    this.algorithmParameters = algorithmParameters;
    return this;
  }

  /**
   * Parameters need for load balancing algorithm.Use newline to separate multiple parameters.
   *
   * @return algorithmParameters
   */
  @Schema(
      example = "uriLength=10 urlParam=section",
      description =
          "Parameters need for load balancing algorithm.Use newline to separate multiple parameters.")
  public String getAlgorithmParameters() {
    return algorithmParameters;
  }

  public void setAlgorithmParameters(String algorithmParameters) {
    this.algorithmParameters = algorithmParameters;
  }

  public RouteConfiguration algorithm(String algorithm) {
    this.algorithm = algorithm;
    return this;
  }

  /**
   * Algorithm employed for load balancing.
   *
   * @return algorithm
   */
  @Schema(example = "ROUND_ROBIN", description = "Algorithm employed for load balancing.")
  public String getAlgorithm() {
    return algorithm;
  }

  public void setAlgorithm(String algorithm) {
    this.algorithm = algorithm;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RouteConfiguration routeConfiguration = (RouteConfiguration) o;
    return Objects.equals(this.protocol, routeConfiguration.protocol)
        && Objects.equals(this.port, routeConfiguration.port)
        && Objects.equals(this.memberPort, routeConfiguration.memberPort)
        && Objects.equals(this.memberProtocol, routeConfiguration.memberProtocol)
        && Objects.equals(
            this.healthCheckConfiguration, routeConfiguration.healthCheckConfiguration)
        && Objects.equals(this.algorithmParameters, routeConfiguration.algorithmParameters)
        && Objects.equals(this.algorithm, routeConfiguration.algorithm);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        protocol,
        port,
        memberPort,
        memberProtocol,
        healthCheckConfiguration,
        algorithmParameters,
        algorithm);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RouteConfiguration {\n");

    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    port: ").append(toIndentedString(port)).append("\n");
    sb.append("    memberPort: ").append(toIndentedString(memberPort)).append("\n");
    sb.append("    memberProtocol: ").append(toIndentedString(memberProtocol)).append("\n");
    sb.append("    healthCheckConfiguration: ")
        .append(toIndentedString(healthCheckConfiguration))
        .append("\n");
    sb.append("    algorithmParameters: ")
        .append(toIndentedString(algorithmParameters))
        .append("\n");
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
