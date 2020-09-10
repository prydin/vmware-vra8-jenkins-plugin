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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Specification for a cloud network */
@Schema(description = "Specification for a cloud network")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class NetworkSpecification {
  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("outboundAccess")
  private Boolean outboundAccess = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("constraints")
  private List<Constraint> constraints = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public NetworkSpecification customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public NetworkSpecification putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Additional custom properties that may be used to extend the network.
   *
   * @return customProperties
   */
  @Schema(description = "Additional custom properties that may be used to extend the network.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public NetworkSpecification deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * The id of the deployment that is associated with this resource
   *
   * @return deploymentId
   */
  @Schema(
      example = "123e4567-e89b-12d3-a456-426655440000",
      description = "The id of the deployment that is associated with this resource")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public NetworkSpecification outboundAccess(Boolean outboundAccess) {
    this.outboundAccess = outboundAccess;
    return this;
  }

  /**
   * Flag to indicate if the network needs to have outbound access or not. Default is true. This
   * field will be ignored if there is proper input for networkType customProperty
   *
   * @return outboundAccess
   */
  @Schema(
      example = "true",
      description =
          "Flag to indicate if the network needs to have outbound access or not. Default is true. This field will be ignored if there is proper input for networkType customProperty")
  public Boolean isOutboundAccess() {
    return outboundAccess;
  }

  public void setOutboundAccess(Boolean outboundAccess) {
    this.outboundAccess = outboundAccess;
  }

  public NetworkSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      required = true,
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public NetworkSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-friendly description.
   *
   * @return description
   */
  @Schema(description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public NetworkSpecification projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The id of the project the current user belongs to.
   *
   * @return projectId
   */
  @Schema(
      example = "e058",
      required = true,
      description = "The id of the project the current user belongs to.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public NetworkSpecification constraints(List<Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public NetworkSpecification addConstraintsItem(Constraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<Constraint>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

  /**
   * Constraints that are used to drive placement policies for the network that is produced from
   * this specification, related with the network profile. Constraint expressions are matched
   * against tags on existing placement targets.
   *
   * @return constraints
   */
  @Schema(
      example =
          "[{\"mandatory\" : \"true\", \"expression\": \"environment\":\"prod\"}, {\"mandatory\" : \"false\", \"expression\": \"pci\"}]",
      description =
          "Constraints that are used to drive placement policies for the network that is produced from this specification, related with the network profile. Constraint expressions are matched against tags on existing placement targets.")
  public List<Constraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<Constraint> constraints) {
    this.constraints = constraints;
  }

  public NetworkSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public NetworkSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values that should be set on any resource that is produced from
   * this specification.
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"vmware.enumeration.type\", \"value\": \"nec2_vpc\" } ]",
      description =
          "A set of tag keys and optional values that should be set on any resource that is produced from this specification.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkSpecification networkSpecification = (NetworkSpecification) o;
    return Objects.equals(this.customProperties, networkSpecification.customProperties)
        && Objects.equals(this.deploymentId, networkSpecification.deploymentId)
        && Objects.equals(this.outboundAccess, networkSpecification.outboundAccess)
        && Objects.equals(this.name, networkSpecification.name)
        && Objects.equals(this.description, networkSpecification.description)
        && Objects.equals(this.projectId, networkSpecification.projectId)
        && Objects.equals(this.constraints, networkSpecification.constraints)
        && Objects.equals(this.tags, networkSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        customProperties,
        deploymentId,
        outboundAccess,
        name,
        description,
        projectId,
        constraints,
        tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkSpecification {\n");

    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    outboundAccess: ").append(toIndentedString(outboundAccess)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
