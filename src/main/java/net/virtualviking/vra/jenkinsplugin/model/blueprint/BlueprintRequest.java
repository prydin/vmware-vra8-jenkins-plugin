/*
 * VMware Cloud Assembly Blueprint API
 * A multi-cloud Blueprint API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-09-12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.virtualviking.vra.jenkinsplugin.model.blueprint;

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
import java.util.Date;
import java.util.List;
import java.util.UUID;
import net.virtualviking.vra.jenkinsplugin.model.blueprint.BlueprintValidationMessage;

/**
 * BlueprintRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-31T20:41:57.276-04:00")



public class BlueprintRequest {
  @SerializedName("blueprintId")
  private UUID blueprintId = null;

  @SerializedName("blueprintVersion")
  private String blueprintVersion = null;

  @SerializedName("cancelRequestedAt")
  private Date cancelRequestedAt = null;

  @SerializedName("cancelRequestedBy")
  private String cancelRequestedBy = null;

  @SerializedName("content")
  private String content = null;

  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("deploymentName")
  private String deploymentName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("destroy")
  private Boolean destroy = null;

  @SerializedName("failureMessage")
  private String failureMessage = null;

  @SerializedName("flowExecutionId")
  private String flowExecutionId = null;

  @SerializedName("flowId")
  private String flowId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("ignoreDeleteFailures")
  private Boolean ignoreDeleteFailures = null;

  @SerializedName("inputs")
  private Object inputs = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("plan")
  private Boolean plan = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("projectName")
  private String projectName = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("requestTrackerId")
  private String requestTrackerId = null;

  @SerializedName("simulate")
  private Boolean simulate = null;

  /**
   * Status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CREATED("CREATED"),
    
    STARTED("STARTED"),
    
    FINISHED("FINISHED"),
    
    FAILED("FAILED"),
    
    CANCELLED("CANCELLED");

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

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("updatedBy")
  private String updatedBy = null;

  @SerializedName("validationMessages")
  private List<BlueprintValidationMessage> validationMessages = null;

  public BlueprintRequest blueprintId(UUID blueprintId) {
    this.blueprintId = blueprintId;
    return this;
  }

   /**
   * Blueprint Id
   * @return blueprintId
  **/
  @ApiModelProperty(value = "Blueprint Id")
  public UUID getBlueprintId() {
    return blueprintId;
  }

  public void setBlueprintId(UUID blueprintId) {
    this.blueprintId = blueprintId;
  }

  public BlueprintRequest blueprintVersion(String blueprintVersion) {
    this.blueprintVersion = blueprintVersion;
    return this;
  }

   /**
   * Blueprint version
   * @return blueprintVersion
  **/
  @ApiModelProperty(value = "Blueprint version")
  public String getBlueprintVersion() {
    return blueprintVersion;
  }

  public void setBlueprintVersion(String blueprintVersion) {
    this.blueprintVersion = blueprintVersion;
  }

   /**
   * Cancel request time
   * @return cancelRequestedAt
  **/
  @ApiModelProperty(value = "Cancel request time")
  public Date getCancelRequestedAt() {
    return cancelRequestedAt;
  }

   /**
   * Cancel requested by
   * @return cancelRequestedBy
  **/
  @ApiModelProperty(value = "Cancel requested by")
  public String getCancelRequestedBy() {
    return cancelRequestedBy;
  }

  public BlueprintRequest content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Blueprint YAML content
   * @return content
  **/
  @ApiModelProperty(value = "Blueprint YAML content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

   /**
   * Created time
   * @return createdAt
  **/
  @ApiModelProperty(value = "Created time")
  public Date getCreatedAt() {
    return createdAt;
  }

   /**
   * Created by
   * @return createdBy
  **/
  @ApiModelProperty(value = "Created by")
  public String getCreatedBy() {
    return createdBy;
  }

  public BlueprintRequest deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Existing deployment Id
   * @return deploymentId
  **/
  @ApiModelProperty(value = "Existing deployment Id")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public BlueprintRequest deploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
    return this;
  }

   /**
   * Name for the new deployment
   * @return deploymentName
  **/
  @ApiModelProperty(value = "Name for the new deployment")
  public String getDeploymentName() {
    return deploymentName;
  }

  public void setDeploymentName(String deploymentName) {
    this.deploymentName = deploymentName;
  }

  public BlueprintRequest description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description for the new request
   * @return description
  **/
  @ApiModelProperty(value = "Description for the new request")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BlueprintRequest destroy(Boolean destroy) {
    this.destroy = destroy;
    return this;
  }

   /**
   * Destroy existing deployment
   * @return destroy
  **/
  @ApiModelProperty(value = "Destroy existing deployment")
  public Boolean isDestroy() {
    return destroy;
  }

  public void setDestroy(Boolean destroy) {
    this.destroy = destroy;
  }

   /**
   * Failure message
   * @return failureMessage
  **/
  @ApiModelProperty(value = "Failure message")
  public String getFailureMessage() {
    return failureMessage;
  }

   /**
   * Flow execution Id
   * @return flowExecutionId
  **/
  @ApiModelProperty(value = "Flow execution Id")
  public String getFlowExecutionId() {
    return flowExecutionId;
  }

   /**
   * Flow Id
   * @return flowId
  **/
  @ApiModelProperty(value = "Flow Id")
  public String getFlowId() {
    return flowId;
  }

   /**
   * Object ID
   * @return id
  **/
  @ApiModelProperty(value = "Object ID")
  public String getId() {
    return id;
  }

  public BlueprintRequest ignoreDeleteFailures(Boolean ignoreDeleteFailures) {
    this.ignoreDeleteFailures = ignoreDeleteFailures;
    return this;
  }

   /**
   * Ignore delete failures in blueprint request
   * @return ignoreDeleteFailures
  **/
  @ApiModelProperty(value = "Ignore delete failures in blueprint request")
  public Boolean isIgnoreDeleteFailures() {
    return ignoreDeleteFailures;
  }

  public void setIgnoreDeleteFailures(Boolean ignoreDeleteFailures) {
    this.ignoreDeleteFailures = ignoreDeleteFailures;
  }

  public BlueprintRequest inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

   /**
   * Blueprint request inputs
   * @return inputs
  **/
  @ApiModelProperty(value = "Blueprint request inputs")
  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

   /**
   * Org ID
   * @return orgId
  **/
  @ApiModelProperty(value = "Org ID")
  public String getOrgId() {
    return orgId;
  }

  public BlueprintRequest plan(Boolean plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Plan only without affecting existing deployment
   * @return plan
  **/
  @ApiModelProperty(value = "Plan only without affecting existing deployment")
  public Boolean isPlan() {
    return plan;
  }

  public void setPlan(Boolean plan) {
    this.plan = plan;
  }

  public BlueprintRequest projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Project ID
   * @return projectId
  **/
  @ApiModelProperty(value = "Project ID")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

   /**
   * Project Name
   * @return projectName
  **/
  @ApiModelProperty(value = "Project Name")
  public String getProjectName() {
    return projectName;
  }

  public BlueprintRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason for requesting a blueprint
   * @return reason
  **/
  @ApiModelProperty(value = "Reason for requesting a blueprint")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

   /**
   * Request tracker Id
   * @return requestTrackerId
  **/
  @ApiModelProperty(value = "Request tracker Id")
  public String getRequestTrackerId() {
    return requestTrackerId;
  }

  public BlueprintRequest simulate(Boolean simulate) {
    this.simulate = simulate;
    return this;
  }

   /**
   * Simulate blueprint request with providers
   * @return simulate
  **/
  @ApiModelProperty(value = "Simulate blueprint request with providers")
  public Boolean isSimulate() {
    return simulate;
  }

  public void setSimulate(Boolean simulate) {
    this.simulate = simulate;
  }

   /**
   * Status
   * @return status
  **/
  @ApiModelProperty(value = "Status")
  public StatusEnum getStatus() {
    return status;
  }

   /**
   * Updated time
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Updated time")
  public Date getUpdatedAt() {
    return updatedAt;
  }

   /**
   * Updated by
   * @return updatedBy
  **/
  @ApiModelProperty(value = "Updated by")
  public String getUpdatedBy() {
    return updatedBy;
  }

   /**
   * Validation messages
   * @return validationMessages
  **/
  @ApiModelProperty(value = "Validation messages")
  public List<BlueprintValidationMessage> getValidationMessages() {
    return validationMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlueprintRequest blueprintRequest = (BlueprintRequest) o;
    return Objects.equals(this.blueprintId, blueprintRequest.blueprintId) &&
        Objects.equals(this.blueprintVersion, blueprintRequest.blueprintVersion) &&
        Objects.equals(this.cancelRequestedAt, blueprintRequest.cancelRequestedAt) &&
        Objects.equals(this.cancelRequestedBy, blueprintRequest.cancelRequestedBy) &&
        Objects.equals(this.content, blueprintRequest.content) &&
        Objects.equals(this.createdAt, blueprintRequest.createdAt) &&
        Objects.equals(this.createdBy, blueprintRequest.createdBy) &&
        Objects.equals(this.deploymentId, blueprintRequest.deploymentId) &&
        Objects.equals(this.deploymentName, blueprintRequest.deploymentName) &&
        Objects.equals(this.description, blueprintRequest.description) &&
        Objects.equals(this.destroy, blueprintRequest.destroy) &&
        Objects.equals(this.failureMessage, blueprintRequest.failureMessage) &&
        Objects.equals(this.flowExecutionId, blueprintRequest.flowExecutionId) &&
        Objects.equals(this.flowId, blueprintRequest.flowId) &&
        Objects.equals(this.id, blueprintRequest.id) &&
        Objects.equals(this.ignoreDeleteFailures, blueprintRequest.ignoreDeleteFailures) &&
        Objects.equals(this.inputs, blueprintRequest.inputs) &&
        Objects.equals(this.orgId, blueprintRequest.orgId) &&
        Objects.equals(this.plan, blueprintRequest.plan) &&
        Objects.equals(this.projectId, blueprintRequest.projectId) &&
        Objects.equals(this.projectName, blueprintRequest.projectName) &&
        Objects.equals(this.reason, blueprintRequest.reason) &&
        Objects.equals(this.requestTrackerId, blueprintRequest.requestTrackerId) &&
        Objects.equals(this.simulate, blueprintRequest.simulate) &&
        Objects.equals(this.status, blueprintRequest.status) &&
        Objects.equals(this.updatedAt, blueprintRequest.updatedAt) &&
        Objects.equals(this.updatedBy, blueprintRequest.updatedBy) &&
        Objects.equals(this.validationMessages, blueprintRequest.validationMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blueprintId, blueprintVersion, cancelRequestedAt, cancelRequestedBy, content, createdAt, createdBy, deploymentId, deploymentName, description, destroy, failureMessage, flowExecutionId, flowId, id, ignoreDeleteFailures, inputs, orgId, plan, projectId, projectName, reason, requestTrackerId, simulate, status, updatedAt, updatedBy, validationMessages);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlueprintRequest {\n");
    
    sb.append("    blueprintId: ").append(toIndentedString(blueprintId)).append("\n");
    sb.append("    blueprintVersion: ").append(toIndentedString(blueprintVersion)).append("\n");
    sb.append("    cancelRequestedAt: ").append(toIndentedString(cancelRequestedAt)).append("\n");
    sb.append("    cancelRequestedBy: ").append(toIndentedString(cancelRequestedBy)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    deploymentName: ").append(toIndentedString(deploymentName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    destroy: ").append(toIndentedString(destroy)).append("\n");
    sb.append("    failureMessage: ").append(toIndentedString(failureMessage)).append("\n");
    sb.append("    flowExecutionId: ").append(toIndentedString(flowExecutionId)).append("\n");
    sb.append("    flowId: ").append(toIndentedString(flowId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    ignoreDeleteFailures: ").append(toIndentedString(ignoreDeleteFailures)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    requestTrackerId: ").append(toIndentedString(requestTrackerId)).append("\n");
    sb.append("    simulate: ").append(toIndentedString(simulate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    validationMessages: ").append(toIndentedString(validationMessages)).append("\n");
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

