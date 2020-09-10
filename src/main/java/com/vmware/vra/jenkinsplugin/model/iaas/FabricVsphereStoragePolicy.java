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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vmware.vra.jenkinsplugin.model.iaas.Href;
import com.vmware.vra.jenkinsplugin.model.iaas.Tag;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Represents a structure that holds details of vSphere storage policy.**HATEOAS** links:&lt;br&gt;**self** - FabricVsphereStoragePolicy - Self link to this storage policy
 */
@Schema(description = "Represents a structure that holds details of vSphere storage policy.**HATEOAS** links:<br>**self** - FabricVsphereStoragePolicy - Self link to this storage policy")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class FabricVsphereStoragePolicy {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

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

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public FabricVsphereStoragePolicy owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Email of the user that owns the entity.
   * @return owner
  **/
  @Schema(example = "csp@vmware.com", description = "Email of the user that owns the entity.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public FabricVsphereStoragePolicy _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public FabricVsphereStoragePolicy putLinksItem(String key, Href _linksItem) {
    this._links.put(key, _linksItem);
    return this;
  }

   /**
   * HATEOAS of the entity
   * @return _links
  **/
  @Schema(required = true, description = "HATEOAS of the entity")
  public Map<String, Href> getLinks() {
    return _links;
  }

  public void setLinks(Map<String, Href> _links) {
    this._links = _links;
  }

  public FabricVsphereStoragePolicy externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

   /**
   * Id of datacenter in which the storage policy is present.
   * @return externalRegionId
  **/
  @Schema(example = "Datacenter:datacenter-2", description = "Id of datacenter in which the storage policy is present.")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public FabricVsphereStoragePolicy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-friendly description.
   * @return description
  **/
  @Schema(example = "my-description", description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FabricVsphereStoragePolicy externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External entity Id on the provider side.
   * @return externalId
  **/
  @Schema(example = "i-cfe4-e241-e53b-756a9a2e25d2", description = "External entity Id on the provider side.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FabricVsphereStoragePolicy orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * The id of the organization this entity belongs to.
   * @return orgId
  **/
  @Schema(example = "9.0E+49", description = "The id of the organization this entity belongs to.")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public FabricVsphereStoragePolicy tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public FabricVsphereStoragePolicy addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values that were set on this storage policy.
   * @return tags
  **/
  @Schema(example = "[ { \"key\" : \"vmencryption\", \"value\": \" \" } ]", description = "A set of tag keys and optional values that were set on this storage policy.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public FabricVsphereStoragePolicy organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.
   * @return organizationId
  **/
  @Schema(example = "deprecated", description = "This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public FabricVsphereStoragePolicy createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date when the entity was created. The date is in ISO 8601 and UTC.
   * @return createdAt
  **/
  @Schema(example = "2012-09-27", description = "Date when the entity was created. The date is in ISO 8601 and UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public FabricVsphereStoragePolicy cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public FabricVsphereStoragePolicy addCloudAccountIdsItem(String cloudAccountIdsItem) {
    if (this.cloudAccountIds == null) {
      this.cloudAccountIds = new ArrayList<String>();
    }
    this.cloudAccountIds.add(cloudAccountIdsItem);
    return this;
  }

   /**
   * Set of ids of the cloud accounts this entity belongs to.
   * @return cloudAccountIds
  **/
  @Schema(example = "[9e49]", description = "Set of ids of the cloud accounts this entity belongs to.")
  public List<String> getCloudAccountIds() {
    return cloudAccountIds;
  }

  public void setCloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
  }

  public FabricVsphereStoragePolicy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name used as an identifier in APIs that support this option.
   * @return name
  **/
  @Schema(example = "my-name", description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FabricVsphereStoragePolicy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this resource instance
   * @return id
  **/
  @Schema(example = "9.0E+49", required = true, description = "The id of this resource instance")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FabricVsphereStoragePolicy updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Date when the entity was last updated. The date is ISO 8601 and UTC.
   * @return updatedAt
  **/
  @Schema(example = "2012-09-27", description = "Date when the entity was last updated. The date is ISO 8601 and UTC.")
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
    FabricVsphereStoragePolicy fabricVsphereStoragePolicy = (FabricVsphereStoragePolicy) o;
    return Objects.equals(this.owner, fabricVsphereStoragePolicy.owner) &&
        Objects.equals(this._links, fabricVsphereStoragePolicy._links) &&
        Objects.equals(this.externalRegionId, fabricVsphereStoragePolicy.externalRegionId) &&
        Objects.equals(this.description, fabricVsphereStoragePolicy.description) &&
        Objects.equals(this.externalId, fabricVsphereStoragePolicy.externalId) &&
        Objects.equals(this.orgId, fabricVsphereStoragePolicy.orgId) &&
        Objects.equals(this.tags, fabricVsphereStoragePolicy.tags) &&
        Objects.equals(this.organizationId, fabricVsphereStoragePolicy.organizationId) &&
        Objects.equals(this.createdAt, fabricVsphereStoragePolicy.createdAt) &&
        Objects.equals(this.cloudAccountIds, fabricVsphereStoragePolicy.cloudAccountIds) &&
        Objects.equals(this.name, fabricVsphereStoragePolicy.name) &&
        Objects.equals(this.id, fabricVsphereStoragePolicy.id) &&
        Objects.equals(this.updatedAt, fabricVsphereStoragePolicy.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, _links, externalRegionId, description, externalId, orgId, tags, organizationId, createdAt, cloudAccountIds, name, id, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricVsphereStoragePolicy {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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