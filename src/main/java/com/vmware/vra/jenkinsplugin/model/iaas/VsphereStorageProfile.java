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

/**
 * Defines a structure that holds storage profile details defined for vSphere for a specific
 * region.**HATEOAS** links:&lt;br&gt;**datastore** - FabricVsphereDatastore - Datastore for this
 * storage profile.&lt;br&gt;**storage-policy** - FabricVsphereStoragePolicy - vSphere storage
 * policy for this storage profile.&lt;br&gt; **region** - Region - Region for the
 * profile.&lt;br&gt;**self** - VsphereStorageProfile - Self link to this vSphere storage profile.
 */
@Schema(
    description =
        "Defines a structure that holds storage profile details defined for vSphere for a specific region.**HATEOAS** links:<br>**datastore** - FabricVsphereDatastore - Datastore for this storage profile.<br>**storage-policy** - FabricVsphereStoragePolicy - vSphere storage policy for this storage profile.<br> **region** - Region - Region for the profile.<br>**self** - VsphereStorageProfile - Self link to this vSphere storage profile.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class VsphereStorageProfile {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

  @SerializedName("supportsEncryption")
  private Boolean supportsEncryption = null;

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("sharesLevel")
  private String sharesLevel = null;

  @SerializedName("cloudAccountId")
  private String cloudAccountId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("diskMode")
  private String diskMode = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("shares")
  private String shares = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("provisioningType")
  private String provisioningType = null;

  @SerializedName("limitIops")
  private String limitIops = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("defaultItem")
  private Boolean defaultItem = null;

  @SerializedName("diskType")
  private String diskType = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public VsphereStorageProfile owner(String owner) {
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

  public VsphereStorageProfile _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public VsphereStorageProfile putLinksItem(String key, Href _linksItem) {
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

  public VsphereStorageProfile supportsEncryption(Boolean supportsEncryption) {
    this.supportsEncryption = supportsEncryption;
    return this;
  }

  /**
   * Indicates whether this storage profile should support encryption or not.
   *
   * @return supportsEncryption
   */
  @Schema(
      example = "false",
      description = "Indicates whether this storage profile should support encryption or not.")
  public Boolean isSupportsEncryption() {
    return supportsEncryption;
  }

  public void setSupportsEncryption(Boolean supportsEncryption) {
    this.supportsEncryption = supportsEncryption;
  }

  public VsphereStorageProfile externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

  /**
   * The id of the region for which this profile is defined
   *
   * @return externalRegionId
   */
  @Schema(
      example = "Datacenter:datacenter-2",
      description = "The id of the region for which this profile is defined")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public VsphereStorageProfile sharesLevel(String sharesLevel) {
    this.sharesLevel = sharesLevel;
    return this;
  }

  /**
   * Shares level are specified as High, Normal, Low or Custom.
   *
   * @return sharesLevel
   */
  @Schema(
      example = "low / normal / high / custom",
      description = "Shares level are specified as High, Normal, Low or Custom.")
  public String getSharesLevel() {
    return sharesLevel;
  }

  public void setSharesLevel(String sharesLevel) {
    this.sharesLevel = sharesLevel;
  }

  public VsphereStorageProfile cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

  /**
   * Id of the cloud account this storage profile belongs to.
   *
   * @return cloudAccountId
   */
  @Schema(
      example = "[9e49]",
      description = "Id of the cloud account this storage profile belongs to.")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  public VsphereStorageProfile description(String description) {
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

  public VsphereStorageProfile diskMode(String diskMode) {
    this.diskMode = diskMode;
    return this;
  }

  /**
   * Type of mode for the disk
   *
   * @return diskMode
   */
  @Schema(
      example = "undefined / independent-persistent / independent-nonpersistent",
      description = "Type of mode for the disk")
  public String getDiskMode() {
    return diskMode;
  }

  public void setDiskMode(String diskMode) {
    this.diskMode = diskMode;
  }

  public VsphereStorageProfile orgId(String orgId) {
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

  public VsphereStorageProfile tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public VsphereStorageProfile addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags that represent the capabilities of this storage profile
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"tier\", \"value\": \"silver\" } ]",
      description = "A list of tags that represent the capabilities of this storage profile")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public VsphereStorageProfile organizationId(String organizationId) {
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

  public VsphereStorageProfile shares(String shares) {
    this.shares = shares;
    return this;
  }

  /**
   * A specific number of shares assigned to each virtual machine.
   *
   * @return shares
   */
  @Schema(
      example = "2000",
      description = "A specific number of shares assigned to each virtual machine.")
  public String getShares() {
    return shares;
  }

  public void setShares(String shares) {
    this.shares = shares;
  }

  public VsphereStorageProfile createdAt(String createdAt) {
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

  public VsphereStorageProfile provisioningType(String provisioningType) {
    this.provisioningType = provisioningType;
    return this;
  }

  /**
   * Type of format for the disk.
   *
   * @return provisioningType
   */
  @Schema(example = "thin / thick / eagerZeroedThick", description = "Type of format for the disk.")
  public String getProvisioningType() {
    return provisioningType;
  }

  public void setProvisioningType(String provisioningType) {
    this.provisioningType = provisioningType;
  }

  public VsphereStorageProfile limitIops(String limitIops) {
    this.limitIops = limitIops;
    return this;
  }

  /**
   * The upper bound for the I/O operations per second allocated for each disk.
   *
   * @return limitIops
   */
  @Schema(
      example = "1000",
      description = "The upper bound for the I/O operations per second allocated for each disk.")
  public String getLimitIops() {
    return limitIops;
  }

  public void setLimitIops(String limitIops) {
    this.limitIops = limitIops;
  }

  public VsphereStorageProfile name(String name) {
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

  public VsphereStorageProfile id(String id) {
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

  public VsphereStorageProfile defaultItem(Boolean defaultItem) {
    this.defaultItem = defaultItem;
    return this;
  }

  /**
   * Indicates if a storage profile contains default storage properties.
   *
   * @return defaultItem
   */
  @Schema(
      example = "false",
      required = true,
      description = "Indicates if a storage profile contains default storage properties.")
  public Boolean isDefaultItem() {
    return defaultItem;
  }

  public void setDefaultItem(Boolean defaultItem) {
    this.defaultItem = defaultItem;
  }

  public VsphereStorageProfile diskType(String diskType) {
    this.diskType = diskType;
    return this;
  }

  /**
   * Disk types are specified as Standard - Simple vSphere virtual disks which cannot be managed
   * independently without an attached VM. First Class - Improved version of standard virtual disks,
   * designed to be fully mananged independent storage objects. Empty value is considered as
   * Standard
   *
   * @return diskType
   */
  @Schema(
      example = "firstClass / standard",
      description =
          "Disk types are specified as   Standard - Simple vSphere virtual disks which cannot be managed independently without an attached VM.  First Class - Improved version of standard virtual disks, designed to be fully mananged   independent storage objects.  Empty value is considered as Standard")
  public String getDiskType() {
    return diskType;
  }

  public void setDiskType(String diskType) {
    this.diskType = diskType;
  }

  public VsphereStorageProfile updatedAt(String updatedAt) {
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
    VsphereStorageProfile vsphereStorageProfile = (VsphereStorageProfile) o;
    return Objects.equals(this.owner, vsphereStorageProfile.owner)
        && Objects.equals(this._links, vsphereStorageProfile._links)
        && Objects.equals(this.supportsEncryption, vsphereStorageProfile.supportsEncryption)
        && Objects.equals(this.externalRegionId, vsphereStorageProfile.externalRegionId)
        && Objects.equals(this.sharesLevel, vsphereStorageProfile.sharesLevel)
        && Objects.equals(this.cloudAccountId, vsphereStorageProfile.cloudAccountId)
        && Objects.equals(this.description, vsphereStorageProfile.description)
        && Objects.equals(this.diskMode, vsphereStorageProfile.diskMode)
        && Objects.equals(this.orgId, vsphereStorageProfile.orgId)
        && Objects.equals(this.tags, vsphereStorageProfile.tags)
        && Objects.equals(this.organizationId, vsphereStorageProfile.organizationId)
        && Objects.equals(this.shares, vsphereStorageProfile.shares)
        && Objects.equals(this.createdAt, vsphereStorageProfile.createdAt)
        && Objects.equals(this.provisioningType, vsphereStorageProfile.provisioningType)
        && Objects.equals(this.limitIops, vsphereStorageProfile.limitIops)
        && Objects.equals(this.name, vsphereStorageProfile.name)
        && Objects.equals(this.id, vsphereStorageProfile.id)
        && Objects.equals(this.defaultItem, vsphereStorageProfile.defaultItem)
        && Objects.equals(this.diskType, vsphereStorageProfile.diskType)
        && Objects.equals(this.updatedAt, vsphereStorageProfile.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        _links,
        supportsEncryption,
        externalRegionId,
        sharesLevel,
        cloudAccountId,
        description,
        diskMode,
        orgId,
        tags,
        organizationId,
        shares,
        createdAt,
        provisioningType,
        limitIops,
        name,
        id,
        defaultItem,
        diskType,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VsphereStorageProfile {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    supportsEncryption: ").append(toIndentedString(supportsEncryption)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    sharesLevel: ").append(toIndentedString(sharesLevel)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    diskMode: ").append(toIndentedString(diskMode)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    shares: ").append(toIndentedString(shares)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    provisioningType: ").append(toIndentedString(provisioningType)).append("\n");
    sb.append("    limitIops: ").append(toIndentedString(limitIops)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultItem: ").append(toIndentedString(defaultItem)).append("\n");
    sb.append("    diskType: ").append(toIndentedString(diskType)).append("\n");
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
