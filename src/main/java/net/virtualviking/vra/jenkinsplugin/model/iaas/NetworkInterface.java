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
 * Represents a network interface.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**cloud-accounts** - array[CloudAccount] - List of cloud accounts where this network domain exists.&lt;br&gt;**security-groups** - array[SecurityGroup] - List of security groups for this network interface.&lt;br&gt;**self** - NetworkInterface - Self link to this network interface
 */
@ApiModel(description = "Represents a network interface.<br>**HATEOAS** links:<br>**cloud-accounts** - array[CloudAccount] - List of cloud accounts where this network domain exists.<br>**security-groups** - array[SecurityGroup] - List of security groups for this network interface.<br>**self** - NetworkInterface - Self link to this network interface")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class NetworkInterface {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("addresses")
  private List<String> addresses = null;

  @SerializedName("_links")
  private Map<String, Href> links = new HashMap<String, Href>();

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("deviceIndex")
  private Integer deviceIndex = null;

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

  @SerializedName("securityGroupIds")
  private List<String> securityGroupIds = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public NetworkInterface owner(String owner) {
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

  public NetworkInterface addresses(List<String> addresses) {
    this.addresses = addresses;
    return this;
  }

  public NetworkInterface addAddressesItem(String addressesItem) {
    if (this.addresses == null) {
      this.addresses = new ArrayList<String>();
    }
    this.addresses.add(addressesItem);
    return this;
  }

   /**
   * A list of IP addresses allocated or in use by this network interface.
   * @return addresses
  **/
  @ApiModelProperty(example = "\"[ \\\"10.1.2.190\\\" ]\"", value = "A list of IP addresses allocated or in use by this network interface.")
  public List<String> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<String> addresses) {
    this.addresses = addresses;
  }

  public NetworkInterface links(Map<String, Href> links) {
    this.links = links;
    return this;
  }

  public NetworkInterface putLinksItem(String key, Href linksItem) {
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

  public NetworkInterface externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

   /**
   * The external regionId of the network interface.
   * @return externalRegionId
  **/
  @ApiModelProperty(example = "ap-northeast-2", required = true, value = "The external regionId of the network interface.")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public NetworkInterface description(String description) {
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

  public NetworkInterface externalId(String externalId) {
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

  public NetworkInterface deviceIndex(Integer deviceIndex) {
    this.deviceIndex = deviceIndex;
    return this;
  }

   /**
   * The device index of this network interface.
   * @return deviceIndex
  **/
  @ApiModelProperty(example = "1", value = "The device index of this network interface.")
  public Integer getDeviceIndex() {
    return deviceIndex;
  }

  public void setDeviceIndex(Integer deviceIndex) {
    this.deviceIndex = deviceIndex;
  }

  public NetworkInterface orgId(String orgId) {
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

  public NetworkInterface tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public NetworkInterface addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values that were set on this network interface.
   * @return tags
  **/
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"vmware.enumeration.type\\\", \\\"value\\\": \\\"nec2_net_interface\\\" } ]\"", value = "A set of tag keys and optional values that were set on this network interface.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public NetworkInterface organizationId(String organizationId) {
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

  public NetworkInterface createdAt(String createdAt) {
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

  public NetworkInterface cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public NetworkInterface addCloudAccountIdsItem(String cloudAccountIdsItem) {
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

  public NetworkInterface customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public NetworkInterface putCustomPropertiesItem(String key, String customPropertiesItem) {
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
  @ApiModelProperty(example = "\"{ \\\"awaitIp\\\" : \\\"true\\\" }\"", value = "Additional properties that may be used to extend the base type.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public NetworkInterface securityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
    return this;
  }

  public NetworkInterface addSecurityGroupIdsItem(String securityGroupIdsItem) {
    if (this.securityGroupIds == null) {
      this.securityGroupIds = new ArrayList<String>();
    }
    this.securityGroupIds.add(securityGroupIdsItem);
    return this;
  }

   /**
   * A list of security group ids this network interface is associated with
   * @return securityGroupIds
  **/
  @ApiModelProperty(value = "A list of security group ids this network interface is associated with")
  public List<String> getSecurityGroupIds() {
    return securityGroupIds;
  }

  public void setSecurityGroupIds(List<String> securityGroupIds) {
    this.securityGroupIds = securityGroupIds;
  }

  public NetworkInterface name(String name) {
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

  public NetworkInterface id(String id) {
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

  public NetworkInterface updatedAt(String updatedAt) {
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
    NetworkInterface networkInterface = (NetworkInterface) o;
    return Objects.equals(this.owner, networkInterface.owner) &&
        Objects.equals(this.addresses, networkInterface.addresses) &&
        Objects.equals(this.links, networkInterface.links) &&
        Objects.equals(this.externalRegionId, networkInterface.externalRegionId) &&
        Objects.equals(this.description, networkInterface.description) &&
        Objects.equals(this.externalId, networkInterface.externalId) &&
        Objects.equals(this.deviceIndex, networkInterface.deviceIndex) &&
        Objects.equals(this.orgId, networkInterface.orgId) &&
        Objects.equals(this.tags, networkInterface.tags) &&
        Objects.equals(this.organizationId, networkInterface.organizationId) &&
        Objects.equals(this.createdAt, networkInterface.createdAt) &&
        Objects.equals(this.cloudAccountIds, networkInterface.cloudAccountIds) &&
        Objects.equals(this.customProperties, networkInterface.customProperties) &&
        Objects.equals(this.securityGroupIds, networkInterface.securityGroupIds) &&
        Objects.equals(this.name, networkInterface.name) &&
        Objects.equals(this.id, networkInterface.id) &&
        Objects.equals(this.updatedAt, networkInterface.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, addresses, links, externalRegionId, description, externalId, deviceIndex, orgId, tags, organizationId, createdAt, cloudAccountIds, customProperties, securityGroupIds, name, id, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkInterface {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    addresses: ").append(toIndentedString(addresses)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    deviceIndex: ").append(toIndentedString(deviceIndex)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    securityGroupIds: ").append(toIndentedString(securityGroupIds)).append("\n");
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
