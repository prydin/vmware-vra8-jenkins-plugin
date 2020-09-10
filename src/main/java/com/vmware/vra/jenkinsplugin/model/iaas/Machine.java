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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Represents a cloud agnostic machine.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**operations** -
 * array[String] - Supported operations for the machine.&lt;br&gt;**network-interfaces** -
 * array[NetworkInterface] - Network interfaces for the machine.&lt;br&gt;**disks** -
 * array[MachineDisk] - disks for the machine.&lt;br&gt;**deployment** - Deployment - Deployment
 * that this machine is part of.&lt;br&gt;**cloud-accounts** - array[CloudAccount] - Cloud accounts
 * where this machine is provisioned.&lt;br&gt;**self** - Machine - Self link to this machine
 */
@Schema(
    description =
        "Represents a cloud agnostic machine.<br>**HATEOAS** links:<br>**operations** - array[String] - Supported operations for the machine.<br>**network-interfaces** - array[NetworkInterface] - Network interfaces for the machine.<br>**disks** - array[MachineDisk] - disks for the machine.<br>**deployment** - Deployment - Deployment that this machine is part of.<br>**cloud-accounts** - array[CloudAccount] - Cloud accounts where this machine is provisioned.<br>**self** - Machine - Self link to this machine")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class Machine {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("address")
  private String address = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

  @SerializedName("externalZoneId")
  private String externalZoneId = null;

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("cloudAccountIds")
  private List<String> cloudAccountIds = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  /** Power state of machine. */
  @JsonAdapter(PowerStateEnum.Adapter.class)
  public enum PowerStateEnum {
    ON("ON"),
    OFF("OFF"),
    GUEST_OFF("GUEST_OFF"),
    UNKNOWN("UNKNOWN"),
    SUSPEND("SUSPEND");

    private String value;

    PowerStateEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PowerStateEnum fromValue(String text) {
      for (PowerStateEnum b : PowerStateEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PowerStateEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PowerStateEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PowerStateEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PowerStateEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("powerState")
  private PowerStateEnum powerState = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public Machine owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Email of the user that owns the entity.
   *
   * @return owner
   */
  @Schema(example = "csp@vmware.com", description = "Email of the user that owns the entity.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public Machine address(String address) {
    this.address = address;
    return this;
  }

  /**
   * Primary address allocated or in use by this machine. The actual type of the address depends on
   * the adapter type. Typically it is either the public or the external IP address.
   *
   * @return address
   */
  @Schema(
      example = "34.242.21.5",
      description =
          "Primary address allocated or in use by this machine. The actual type of the address depends on the adapter type. Typically it is either the public or the external IP address.")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public Machine _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public Machine putLinksItem(String key, Href _linksItem) {
    this._links.put(key, _linksItem);
    return this;
  }

  /**
   * HATEOAS of the entity
   *
   * @return _links
   */
  @Schema(required = true, description = "HATEOAS of the entity")
  public Map<String, Href> getLinks() {
    return _links;
  }

  public void setLinks(Map<String, Href> _links) {
    this._links = _links;
  }

  public Machine externalZoneId(String externalZoneId) {
    this.externalZoneId = externalZoneId;
    return this;
  }

  /**
   * The external zoneId of the resource.
   *
   * @return externalZoneId
   */
  @Schema(
      example = "us-east-1a",
      required = true,
      description = "The external zoneId of the resource.")
  public String getExternalZoneId() {
    return externalZoneId;
  }

  public void setExternalZoneId(String externalZoneId) {
    this.externalZoneId = externalZoneId;
  }

  public Machine externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

  /**
   * The external regionId of the resource.
   *
   * @return externalRegionId
   */
  @Schema(
      example = "us-east-1",
      required = true,
      description = "The external regionId of the resource.")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public Machine description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-friendly description.
   *
   * @return description
   */
  @Schema(example = "my-description", description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Machine externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

  /**
   * External entity Id on the provider side.
   *
   * @return externalId
   */
  @Schema(
      example = "i-cfe4-e241-e53b-756a9a2e25d2",
      description = "External entity Id on the provider side.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Machine orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The id of the organization this entity belongs to.
   *
   * @return orgId
   */
  @Schema(example = "9.0E+49", description = "The id of the organization this entity belongs to.")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public Machine tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public Machine addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values that were set on this resource.
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"ownedBy\", \"value\": \"Rainpole\" } ]",
      description = "A set of tag keys and optional values that were set on this resource.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public Machine organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.
   *
   * @return organizationId
   */
  @Schema(
      example = "deprecated",
      description =
          "This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public Machine createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date when the entity was created. The date is in ISO 8601 and UTC.
   *
   * @return createdAt
   */
  @Schema(
      example = "2012-09-27",
      description = "Date when the entity was created. The date is in ISO 8601 and UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public Machine cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public Machine addCloudAccountIdsItem(String cloudAccountIdsItem) {
    if (this.cloudAccountIds == null) {
      this.cloudAccountIds = new ArrayList<String>();
    }
    this.cloudAccountIds.add(cloudAccountIdsItem);
    return this;
  }

  /**
   * Set of ids of the cloud accounts this resource belongs to.
   *
   * @return cloudAccountIds
   */
  @Schema(
      example = "[9e49]",
      description = "Set of ids of the cloud accounts this resource belongs to.")
  public List<String> getCloudAccountIds() {
    return cloudAccountIds;
  }

  public void setCloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
  }

  public Machine customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public Machine putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

  /**
   * Additional properties that may be used to extend the base resource.
   *
   * @return customProperties
   */
  @Schema(
      example = "{ \"property\" : \"value\" }",
      description = "Additional properties that may be used to extend the base resource.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public Machine powerState(PowerStateEnum powerState) {
    this.powerState = powerState;
    return this;
  }

  /**
   * Power state of machine.
   *
   * @return powerState
   */
  @Schema(example = "ON, OFF", required = true, description = "Power state of machine.")
  public PowerStateEnum getPowerState() {
    return powerState;
  }

  public void setPowerState(PowerStateEnum powerState) {
    this.powerState = powerState;
  }

  public Machine deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

  /**
   * Deployment id that is associated with this resource.
   *
   * @return deploymentId
   */
  @Schema(
      example = "123e4567-e89b-12d3-a456-426655440000",
      description = "Deployment id that is associated with this resource.")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public Machine name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      example = "my-name",
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Machine id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of this resource instance
   *
   * @return id
   */
  @Schema(example = "9.0E+49", required = true, description = "The id of this resource instance")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Machine projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * The id of the project this resource belongs to.
   *
   * @return projectId
   */
  @Schema(example = "9.0E+49", description = "The id of the project this resource belongs to.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public Machine updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date when the entity was last updated. The date is ISO 8601 and UTC.
   *
   * @return updatedAt
   */
  @Schema(
      example = "2012-09-27",
      description = "Date when the entity was last updated. The date is ISO 8601 and UTC.")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Machine machine = (Machine) o;
    return Objects.equals(this.owner, machine.owner)
        && Objects.equals(this.address, machine.address)
        && Objects.equals(this._links, machine._links)
        && Objects.equals(this.externalZoneId, machine.externalZoneId)
        && Objects.equals(this.externalRegionId, machine.externalRegionId)
        && Objects.equals(this.description, machine.description)
        && Objects.equals(this.externalId, machine.externalId)
        && Objects.equals(this.orgId, machine.orgId)
        && Objects.equals(this.tags, machine.tags)
        && Objects.equals(this.organizationId, machine.organizationId)
        && Objects.equals(this.createdAt, machine.createdAt)
        && Objects.equals(this.cloudAccountIds, machine.cloudAccountIds)
        && Objects.equals(this.customProperties, machine.customProperties)
        && Objects.equals(this.powerState, machine.powerState)
        && Objects.equals(this.deploymentId, machine.deploymentId)
        && Objects.equals(this.name, machine.name)
        && Objects.equals(this.id, machine.id)
        && Objects.equals(this.projectId, machine.projectId)
        && Objects.equals(this.updatedAt, machine.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        address,
        _links,
        externalZoneId,
        externalRegionId,
        description,
        externalId,
        orgId,
        tags,
        organizationId,
        createdAt,
        cloudAccountIds,
        customProperties,
        powerState,
        deploymentId,
        name,
        id,
        projectId,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Machine {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    externalZoneId: ").append(toIndentedString(externalZoneId)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    powerState: ").append(toIndentedString(powerState)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
