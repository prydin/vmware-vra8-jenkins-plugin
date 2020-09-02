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
 * A deployment update request
 */
@ApiModel(description = "A deployment update request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



public class DeploymentUpdate {
  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  public DeploymentUpdate description(String description) {
    this.description = description;
    return this;
  }

   /**
   * New description of the deployment
   * @return description
  **/
  @ApiModelProperty(value = "New description of the deployment")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public DeploymentUpdate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * New name of the deployment
   * @return name
  **/
  @ApiModelProperty(value = "New name of the deployment")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentUpdate deploymentUpdate = (DeploymentUpdate) o;
    return Objects.equals(this.description, deploymentUpdate.description) &&
        Objects.equals(this.name, deploymentUpdate.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentUpdate {\n");
    
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
