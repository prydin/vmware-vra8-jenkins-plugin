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


package net.virtualviking.vra.jenkinsplugin.model.catalog;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * The blueprint service&#39;s response to a deployment request
 */
@ApiModel(description = "The blueprint service's response to a deployment request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



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
   * The created deployment&#39;s ID
   * @return deploymentId
  **/
  @ApiModelProperty(value = "The created deployment's ID")
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
   * The created deployment&#39;s name
   * @return deploymentName
  **/
  @ApiModelProperty(value = "The created deployment's name")
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
    return Objects.equals(this.deploymentId, catalogItemRequestResponse.deploymentId) &&
        Objects.equals(this.deploymentName, catalogItemRequestResponse.deploymentName);
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
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

