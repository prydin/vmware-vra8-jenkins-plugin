/*
 * VMware Service Broker API
 * A multi-cloud API for Cloud Automation Services
 *
 * OpenAPI spec version: 2020-08-25
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.catalog;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** The blueprint service&#x27;s response to a deployment request */
@Schema(description = "The blueprint service's response to a deployment request")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class CatalogItemRequestResponse {
  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("deploymentName")
  private String deploymentName = null;

  public CatalogItemRequestResponse deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The created deployment&#x27;s ID
   *
   * @return deploymentId
   */
  @Schema(description = "The created deployment's ID")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public CatalogItemRequestResponse deploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  /**
   * The created deployment&#x27;s name
   *
   * @return deploymentName
   */
  @Schema(description = "The created deployment's name")
  public String getDeploymentName() {
    return deploymentName;
  }

  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemRequestResponse catalogItemRequestResponse = (CatalogItemRequestResponse) o;
    return Objects.equals(this.deploymentId, catalogItemRequestResponse.deploymentId)
        && Objects.equals(this.deploymentName, catalogItemRequestResponse.deploymentName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, deploymentName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemRequestResponse {\n");

    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
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
