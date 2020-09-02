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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Href;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * Represents a compute which is an entity on the cloud provider side that can be used to provision resources in. It could be an availability zone in a public cloud, cluster, host or resource pool in vSphere
 */
@ApiModel(description = "Represents a compute which is an entity on the cloud provider side that can be used to provision resources in. It could be an availability zone in a public cloud, cluster, host or resource pool in vSphere")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class FabricCompute {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("_links")
  private Map<String, Href> links = new HashMap<String, Href>();

  @SerializedName("externalZoneId")
  private String externalZoneId = null;

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public FabricCompute owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Email of the user that owns the entity.
   * @return owner
  **/
  @ApiModelProperty(example = "csp@vmware.com", value = "Email of the user that owns the entity.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public FabricCompute links(Map<String, Href> links) {
    this.links = links;
    return this;
  }

  public FabricCompute putLinksItem(String key, Href linksItem) {
    this.links.put(key, linksItem);
    return this;
  }

   /**
   * HATEOAS of the entity
   * @return links
  **/
  @ApiModelProperty(required = true, value = "HATEOAS of the entity")
  public Map<String, Href> getLinks() {
    return links;
  }

  public void setLinks(Map<String, Href> links) {
    this.links = links;
  }

  public FabricCompute externalZoneId(String externalZoneId) {
    this.externalZoneId = externalZoneId;
    return this;
  }

   /**
   * The external zoneId of the compute.
   * @return externalZoneId
  **/
  @ApiModelProperty(example = "us-east-1a", required = true, value = "The external zoneId of the compute.")
  public String getExternalZoneId() {
    return externalZoneId;
  }

  public void setExternalZoneId(String externalZoneId) {
    this.externalZoneId = externalZoneId;
  }

  public FabricCompute externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

   /**
   * The external regionId of the compute
   * @return externalRegionId
  **/
  @ApiModelProperty(example = "us-east-1", required = true, value = "The external regionId of the compute")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public FabricCompute description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-friendly description.
   * @return description
  **/
  @ApiModelProperty(example = "my-description", value = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FabricCompute externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * External entity Id on the provider side.
   * @return externalId
  **/
  @ApiModelProperty(example = "i-cfe4-e241-e53b-756a9a2e25d2", value = "External entity Id on the provider side.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public FabricCompute type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the compute instance
   * @return type
  **/
  @ApiModelProperty(example = "Availability Zone", value = "Type of the compute instance")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FabricCompute orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * The id of the organization this entity belongs to.
   * @return orgId
  **/
  @ApiModelProperty(example = "9e49", value = "The id of the organization this entity belongs to.")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public FabricCompute tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public FabricCompute addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values that were set on this resource instance.
   * @return tags
  **/
  @ApiModelProperty(value = "A set of tag keys and optional values that were set on this resource instance.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public FabricCompute organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

   /**
   * This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.
   * @return organizationId
  **/
  @ApiModelProperty(example = "deprecated", value = "This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public FabricCompute createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date when the entity was created. The date is in ISO 8601 and UTC.
   * @return createdAt
  **/
  @ApiModelProperty(example = "2012-09-27", value = "Date when the entity was created. The date is in ISO 8601 and UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public FabricCompute customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public FabricCompute putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Custom properties of the compute instance
   * @return customProperties
  **/
  @ApiModelProperty(value = "Custom properties of the compute instance")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public FabricCompute name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name used as an identifier in APIs that support this option.
   * @return name
  **/
  @ApiModelProperty(example = "my-name", value = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FabricCompute id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this resource instance
   * @return id
  **/
  @ApiModelProperty(example = "9e49", required = true, value = "The id of this resource instance")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FabricCompute updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Date when the entity was last updated. The date is ISO 8601 and UTC.
   * @return updatedAt
  **/
  @ApiModelProperty(example = "2012-09-27", value = "Date when the entity was last updated. The date is ISO 8601 and UTC.")
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
    FabricCompute fabricCompute = (FabricCompute) o;
    return Objects.equals(this.owner, fabricCompute.owner) &&
        Objects.equals(this.links, fabricCompute.links) &&
        Objects.equals(this.externalZoneId, fabricCompute.externalZoneId) &&
        Objects.equals(this.externalRegionId, fabricCompute.externalRegionId) &&
        Objects.equals(this.description, fabricCompute.description) &&
        Objects.equals(this.externalId, fabricCompute.externalId) &&
        Objects.equals(this.type, fabricCompute.type) &&
        Objects.equals(this.orgId, fabricCompute.orgId) &&
        Objects.equals(this.tags, fabricCompute.tags) &&
        Objects.equals(this.organizationId, fabricCompute.organizationId) &&
        Objects.equals(this.createdAt, fabricCompute.createdAt) &&
        Objects.equals(this.customProperties, fabricCompute.customProperties) &&
        Objects.equals(this.name, fabricCompute.name) &&
        Objects.equals(this.id, fabricCompute.id) &&
        Objects.equals(this.updatedAt, fabricCompute.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, links, externalZoneId, externalRegionId, description, externalId, type, orgId, tags, organizationId, createdAt, customProperties, name, id, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricCompute {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    externalZoneId: ").append(toIndentedString(externalZoneId)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
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
