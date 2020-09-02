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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.virtualviking.vra.jenkinsplugin.model.iaas.FlavorMapping;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Href;

/**
 * Represents a structure that holds flavor mappings defined for the corresponding cloud end-point region.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**region** - Region - Region for the profile.&lt;br&gt;**self** - FlavorProfile - Self link to this flavor profile
 */
@ApiModel(description = "Represents a structure that holds flavor mappings defined for the corresponding cloud end-point region.<br>**HATEOAS** links:<br>**region** - Region - Region for the profile.<br>**self** - FlavorProfile - Self link to this flavor profile")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class FlavorProfile {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("flavorMappings")
  private FlavorMapping flavorMappings = null;

  @SerializedName("_links")
  private Map<String, Href> links = new HashMap<String, Href>();

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("cloudAccountId")
  private String cloudAccountId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public FlavorProfile owner(String owner) {
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

  public FlavorProfile organizationId(String organizationId) {
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

  public FlavorProfile createdAt(String createdAt) {
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

  public FlavorProfile flavorMappings(FlavorMapping flavorMappings) {
    this.flavorMappings = flavorMappings;
    return this;
  }

   /**
   * A list of the flavor mappings defined for the corresponding cloud end-point region
   * @return flavorMappings
  **/
  @ApiModelProperty(required = true, value = "A list of the flavor mappings defined for the corresponding cloud end-point region")
  public FlavorMapping getFlavorMappings() {
    return flavorMappings;
  }

  public void setFlavorMappings(FlavorMapping flavorMappings) {
    this.flavorMappings = flavorMappings;
  }

  public FlavorProfile links(Map<String, Href> links) {
    this.links = links;
    return this;
  }

  public FlavorProfile putLinksItem(String key, Href linksItem) {
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

  public FlavorProfile externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

   /**
   * The id of the region for which this profile is defined
   * @return externalRegionId
  **/
  @ApiModelProperty(example = "us-east-1", value = "The id of the region for which this profile is defined")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public FlavorProfile cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

   /**
   * Id of the cloud account this flavor profile belongs to.
   * @return cloudAccountId
  **/
  @ApiModelProperty(example = "[9e49]", value = "Id of the cloud account this flavor profile belongs to.")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  public FlavorProfile name(String name) {
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

  public FlavorProfile description(String description) {
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

  public FlavorProfile id(String id) {
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

  public FlavorProfile orgId(String orgId) {
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

  public FlavorProfile updatedAt(String updatedAt) {
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
    FlavorProfile flavorProfile = (FlavorProfile) o;
    return Objects.equals(this.owner, flavorProfile.owner) &&
        Objects.equals(this.organizationId, flavorProfile.organizationId) &&
        Objects.equals(this.createdAt, flavorProfile.createdAt) &&
        Objects.equals(this.flavorMappings, flavorProfile.flavorMappings) &&
        Objects.equals(this.links, flavorProfile.links) &&
        Objects.equals(this.externalRegionId, flavorProfile.externalRegionId) &&
        Objects.equals(this.cloudAccountId, flavorProfile.cloudAccountId) &&
        Objects.equals(this.name, flavorProfile.name) &&
        Objects.equals(this.description, flavorProfile.description) &&
        Objects.equals(this.id, flavorProfile.id) &&
        Objects.equals(this.orgId, flavorProfile.orgId) &&
        Objects.equals(this.updatedAt, flavorProfile.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, organizationId, createdAt, flavorMappings, links, externalRegionId, cloudAccountId, name, description, id, orgId, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlavorProfile {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    flavorMappings: ").append(toIndentedString(flavorMappings)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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

