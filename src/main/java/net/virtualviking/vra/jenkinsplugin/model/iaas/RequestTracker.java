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


package net.virtualviking.vra.jenkinsplugin.model.iaas;

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
import java.util.ArrayList;
import java.util.List;

/**
 * An object used to track long-running operations.
 */
@ApiModel(description = "An object used to track long-running operations.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class RequestTracker {
  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("progress")
  private Integer progress = null;

  @SerializedName("resources")
  private List<String> resources = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("message")
  private String message = null;

  /**
   * Status of the request.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    FINISHED("FINISHED"),
    
    INPROGRESS("INPROGRESS"),
    
    FAILED("FAILED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("selfLink")
  private String selfLink = null;

  public RequestTracker deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * ID of the deployment, this request is connected to.
   * @return deploymentId
  **/
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426614174000", value = "ID of the deployment, this request is connected to.")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public RequestTracker name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the operation.
   * @return name
  **/
  @ApiModelProperty(example = "Power-off", value = "Name of the operation.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public RequestTracker progress(Integer progress) {
    this.progress = progress;
    return this;
  }

   /**
   * Progress of the request as percentage.
   * @return progress
  **/
  @ApiModelProperty(example = "90", required = true, value = "Progress of the request as percentage.")
  public Integer getProgress() {
    return progress;
  }

  public void setProgress(Integer progress) {
    this.progress = progress;
  }

  public RequestTracker resources(List<String> resources) {
    this.resources = resources;
    return this;
  }

  public RequestTracker addResourcesItem(String resourcesItem) {
    if (this.resources == null) {
      this.resources = new ArrayList<String>();
    }
    this.resources.add(resourcesItem);
    return this;
  }

   /**
   * Collection of resources.
   * @return resources
  **/
  @ApiModelProperty(example = "\"[\\\"/resources/i-0be3655a12fd28e8e\\\", \\\"/resources/i-0be234a15ft8det3\\\"]\"", value = "Collection of resources.")
  public List<String> getResources() {
    return resources;
  }

  public void setResources(List<String> resources) {
    this.resources = resources;
  }

  public RequestTracker id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of this request.
   * @return id
  **/
  @ApiModelProperty(example = "we655aew4e8e", required = true, value = "ID of this request.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public RequestTracker message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Status message of the request.
   * @return message
  **/
  @ApiModelProperty(example = "In Progress", value = "Status message of the request.")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public RequestTracker status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the request.
   * @return status
  **/
  @ApiModelProperty(example = "FINISHED", required = true, value = "Status of the request.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public RequestTracker selfLink(String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

   /**
   * Self link of this request.
   * @return selfLink
  **/
  @ApiModelProperty(example = "/.../request-tracker/we655aew4e8e", required = true, value = "Self link of this request.")
  public String getSelfLink() {
    return selfLink;
  }

  public void setSelfLink(String selfLink) {
    this.selfLink = selfLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTracker requestTracker = (RequestTracker) o;
    return Objects.equals(this.deploymentId, requestTracker.deploymentId) &&
        Objects.equals(this.name, requestTracker.name) &&
        Objects.equals(this.progress, requestTracker.progress) &&
        Objects.equals(this.resources, requestTracker.resources) &&
        Objects.equals(this.id, requestTracker.id) &&
        Objects.equals(this.message, requestTracker.message) &&
        Objects.equals(this.status, requestTracker.status) &&
        Objects.equals(this.selfLink, requestTracker.selfLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deploymentId, name, progress, resources, id, message, status, selfLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTracker {\n");
    
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    progress: ").append(toIndentedString(progress)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    selfLink: ").append(toIndentedString(selfLink)).append("\n");
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

