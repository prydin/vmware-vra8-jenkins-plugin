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

/** A request to create a deployment based on a catalog item */
@Schema(description = "A request to create a deployment based on a catalog item")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class CatalogItemRequest {
  @SerializedName("bulkRequestCount")
  private Integer bulkRequestCount = null;

  @SerializedName("deploymentName")
  private String deploymentName = null;

  @SerializedName("inputs")
  private Object inputs = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("version")
  private String version = null;

  public CatalogItemRequest bulkRequestCount(Integer bulkRequestCount) {
    this.bulkRequestCount = bulkRequestCount;
    return this;
  }

  /**
   * Deployment request count; defaults to 1 if not specified. minimum: -128 maximum: 127
   *
   * @return bulkRequestCount
   */
  @Schema(description = "Deployment request count; defaults to 1 if not specified.")
  public Integer getBulkRequestCount() {
    return bulkRequestCount;
  }

  public void setBulkRequestCount(Integer bulkRequestCount) {
    this.bulkRequestCount = bulkRequestCount;
  }

  public CatalogItemRequest deploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

  /**
   * Name of the requested deployment
   *
   * @return deploymentName
   */
  @Schema(description = "Name of the requested deployment")
  public String getDeploymentName() {
    return deploymentName;
  }

  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  public CatalogItemRequest inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Input parameters for the request. These must be compliant with the schema of the corresponding
   * catalog item
   *
   * @return inputs
   */
  @Schema(
      description =
          "Input parameters for the request. These must be compliant with the schema of the corresponding catalog item")
  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

  public CatalogItemRequest projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Project to be used for the request
   *
   * @return projectId
   */
  @Schema(description = "Project to be used for the request")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public CatalogItemRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for request
   *
   * @return reason
   */
  @Schema(description = "Reason for request")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public CatalogItemRequest version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the catalog item. e.g. v2.0
   *
   * @return version
   */
  @Schema(description = "Version of the catalog item. e.g. v2.0")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemRequest catalogItemRequest = (CatalogItemRequest) o;
    return Objects.equals(this.bulkRequestCount, catalogItemRequest.bulkRequestCount)
        && Objects.equals(this.deploymentName, catalogItemRequest.deploymentName)
        && Objects.equals(this.inputs, catalogItemRequest.inputs)
        && Objects.equals(this.projectId, catalogItemRequest.projectId)
        && Objects.equals(this.reason, catalogItemRequest.reason)
        && Objects.equals(this.version, catalogItemRequest.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bulkRequestCount, deploymentName, inputs, projectId, reason, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemRequest {\n");

    sb.append("    bulkRequestCount: ").append(toIndentedString(bulkRequestCount)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
