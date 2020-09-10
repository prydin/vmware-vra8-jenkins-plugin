/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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
 * State object representing a block device.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**cloud-accounts**
 * - array[CloudAccount] - Cloud accounts where this disk is provisioned.&lt;br&gt;**self** -
 * BlockDevice - Self link to this block device
 */
@Schema(
    description =
        "State object representing a block device.<br>**HATEOAS** links:<br>**cloud-accounts** - array[CloudAccount] - Cloud accounts where this disk is provisioned.<br>**self** - BlockDevice - Self link to this block device")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class BlockDevice {
  @SerializedName("owner")
  private String owner = null;

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

  /** Type of the block device */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    SSD("SSD"),
    HDD("HDD"),
    CDROM("CDROM"),
    FLOPPY("FLOPPY");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("capacityInGB")
  private Integer capacityInGB = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("cloudAccountIds")
  private List<String> cloudAccountIds = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("persistent")
  private Boolean persistent = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  /** Status of the block device */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    DETACHED("DETACHED"),
    ATTACHED("ATTACHED"),
    AVAILABLE("AVAILABLE");

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
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration)
          throws IOException {
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

  public BlockDevice owner(String owner) {
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

  public BlockDevice _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public BlockDevice putLinksItem(String key, Href _linksItem) {
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

  public BlockDevice externalZoneId(String externalZoneId) {
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

  public BlockDevice externalRegionId(String externalRegionId) {
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

  public BlockDevice description(String description) {
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

  public BlockDevice externalId(String externalId) {
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

  public BlockDevice type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the block device
   *
   * @return type
   */
  @Schema(example = "HDD", description = "Type of the block device")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public BlockDevice orgId(String orgId) {
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

  public BlockDevice tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public BlockDevice addTagsItem(Tag tagsItem) {
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

  public BlockDevice organizationId(String organizationId) {
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

  public BlockDevice capacityInGB(Integer capacityInGB) {
    this.capacityInGB = capacityInGB;
    return this;
  }

  /**
   * Capacity of the block device in GB.
   *
   * @return capacityInGB
   */
  @Schema(example = "10", required = true, description = "Capacity of the block device in GB.")
  public Integer getCapacityInGB() {
    return capacityInGB;
  }

  public void setCapacityInGB(Integer capacityInGB) {
    this.capacityInGB = capacityInGB;
  }

  public BlockDevice createdAt(String createdAt) {
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

  public BlockDevice cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public BlockDevice addCloudAccountIdsItem(String cloudAccountIdsItem) {
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

  public BlockDevice customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public BlockDevice putCustomPropertiesItem(String key, String customPropertiesItem) {
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

  public BlockDevice deploymentId(String deploymentId) {
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

  public BlockDevice name(String name) {
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

  public BlockDevice id(String id) {
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

  public BlockDevice persistent(Boolean persistent) {
    this.persistent = persistent;
    return this;
  }

  /**
   * Indicates whether the block device survives a delete action.
   *
   * @return persistent
   */
  @Schema(
      example = "true",
      description = "Indicates whether the block device survives a delete action.")
  public Boolean isPersistent() {
    return persistent;
  }

  public void setPersistent(Boolean persistent) {
    this.persistent = persistent;
  }

  public BlockDevice projectId(String projectId) {
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

  public BlockDevice updatedAt(String updatedAt) {
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

  public BlockDevice status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Status of the block device
   *
   * @return status
   */
  @Schema(example = "ATTACHED", required = true, description = "Status of the block device")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BlockDevice blockDevice = (BlockDevice) o;
    return Objects.equals(this.owner, blockDevice.owner)
        && Objects.equals(this._links, blockDevice._links)
        && Objects.equals(this.externalZoneId, blockDevice.externalZoneId)
        && Objects.equals(this.externalRegionId, blockDevice.externalRegionId)
        && Objects.equals(this.description, blockDevice.description)
        && Objects.equals(this.externalId, blockDevice.externalId)
        && Objects.equals(this.type, blockDevice.type)
        && Objects.equals(this.orgId, blockDevice.orgId)
        && Objects.equals(this.tags, blockDevice.tags)
        && Objects.equals(this.organizationId, blockDevice.organizationId)
        && Objects.equals(this.capacityInGB, blockDevice.capacityInGB)
        && Objects.equals(this.createdAt, blockDevice.createdAt)
        && Objects.equals(this.cloudAccountIds, blockDevice.cloudAccountIds)
        && Objects.equals(this.customProperties, blockDevice.customProperties)
        && Objects.equals(this.deploymentId, blockDevice.deploymentId)
        && Objects.equals(this.name, blockDevice.name)
        && Objects.equals(this.id, blockDevice.id)
        && Objects.equals(this.persistent, blockDevice.persistent)
        && Objects.equals(this.projectId, blockDevice.projectId)
        && Objects.equals(this.updatedAt, blockDevice.updatedAt)
        && Objects.equals(this.status, blockDevice.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        _links,
        externalZoneId,
        externalRegionId,
        description,
        externalId,
        type,
        orgId,
        tags,
        organizationId,
        capacityInGB,
        createdAt,
        cloudAccountIds,
        customProperties,
        deploymentId,
        name,
        id,
        persistent,
        projectId,
        updatedAt,
        status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BlockDevice {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    externalZoneId: ").append(toIndentedString(externalZoneId)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    capacityInGB: ").append(toIndentedString(capacityInGB)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    persistent: ").append(toIndentedString(persistent)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
