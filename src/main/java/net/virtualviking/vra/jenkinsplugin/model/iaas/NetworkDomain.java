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
 * The network domain object is the parent of related subnets that are configured together. Subnets within a domain must have non-overlapping address spaces.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**cloud-accounts** - array[CloudAccount] - List of cloud accounts where this network domain exists.&lt;br&gt;**self** - NetworkDomain - Self link to this network domain
 */
@ApiModel(description = "The network domain object is the parent of related subnets that are configured together. Subnets within a domain must have non-overlapping address spaces.<br>**HATEOAS** links:<br>**cloud-accounts** - array[CloudAccount] - List of cloud accounts where this network domain exists.<br>**self** - NetworkDomain - Self link to this network domain")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class NetworkDomain {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("_links")
  private Map<String, Href> links = new HashMap<String, Href>();

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

  @SerializedName("name")
  private String name = null;

  @SerializedName("cidr")
  private String cidr = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public NetworkDomain owner(String owner) {
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

  public NetworkDomain links(Map<String, Href> links) {
    this.links = links;
    return this;
  }

  public NetworkDomain putLinksItem(String key, Href linksItem) {
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

  public NetworkDomain externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

   /**
   * The external regionId of the network domain.
   * @return externalRegionId
  **/
  @ApiModelProperty(example = "ap-northeast-2", required = true, value = "The external regionId of the network domain.")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public NetworkDomain description(String description) {
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

  public NetworkDomain externalId(String externalId) {
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

  public NetworkDomain orgId(String orgId) {
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

  public NetworkDomain tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public NetworkDomain addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values that were set on this network domain.
   * @return tags
  **/
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"vmware.enumeration.type\\\", \\\"value\\\": \\\"nec2_vpc\\\" } ]\"", value = "A set of tag keys and optional values that were set on this network domain.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public NetworkDomain organizationId(String organizationId) {
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

  public NetworkDomain createdAt(String createdAt) {
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

  public NetworkDomain cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public NetworkDomain addCloudAccountIdsItem(String cloudAccountIdsItem) {
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
  @ApiModelProperty(example = "\"[9e49]\"", value = "Set of ids of the cloud accounts this entity belongs to.")
  public List<String> getCloudAccountIds() {
    return cloudAccountIds;
  }

  public void setCloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
  }

  public NetworkDomain customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public NetworkDomain putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Additional properties that may be used to extend the base type.
   * @return customProperties
  **/
  @ApiModelProperty(example = "\"{ \\\"awsGatewayID\\\" : \\\"igw-f9539691\\\" }\"", value = "Additional properties that may be used to extend the base type.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public NetworkDomain name(String name) {
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

  public NetworkDomain cidr(String cidr) {
    this.cidr = cidr;
    return this;
  }

   /**
   * IPv4 address range of the network domain in CIDR format
   * @return cidr
  **/
  @ApiModelProperty(example = "10.0.0.0/8", required = true, value = "IPv4 address range of the network domain in CIDR format")
  public String getCidr() {
    return cidr;
  }

  public void setCidr(String cidr) {
    this.cidr = cidr;
  }

  public NetworkDomain id(String id) {
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

  public NetworkDomain updatedAt(String updatedAt) {
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
    NetworkDomain networkDomain = (NetworkDomain) o;
    return Objects.equals(this.owner, networkDomain.owner) &&
        Objects.equals(this.links, networkDomain.links) &&
        Objects.equals(this.externalRegionId, networkDomain.externalRegionId) &&
        Objects.equals(this.description, networkDomain.description) &&
        Objects.equals(this.externalId, networkDomain.externalId) &&
        Objects.equals(this.orgId, networkDomain.orgId) &&
        Objects.equals(this.tags, networkDomain.tags) &&
        Objects.equals(this.organizationId, networkDomain.organizationId) &&
        Objects.equals(this.createdAt, networkDomain.createdAt) &&
        Objects.equals(this.cloudAccountIds, networkDomain.cloudAccountIds) &&
        Objects.equals(this.customProperties, networkDomain.customProperties) &&
        Objects.equals(this.name, networkDomain.name) &&
        Objects.equals(this.cidr, networkDomain.cidr) &&
        Objects.equals(this.id, networkDomain.id) &&
        Objects.equals(this.updatedAt, networkDomain.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, links, externalRegionId, description, externalId, orgId, tags, organizationId, createdAt, cloudAccountIds, customProperties, name, cidr, id, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkDomain {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cidr: ").append(toIndentedString(cidr)).append("\n");
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
