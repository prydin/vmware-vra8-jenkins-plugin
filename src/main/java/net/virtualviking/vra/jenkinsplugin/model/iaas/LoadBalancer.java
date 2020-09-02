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
import net.virtualviking.vra.jenkinsplugin.model.iaas.RouteConfiguration;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * Represents a load balancer.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**load-balancer-targets** - array[Machine] - List of load balancer target machines.&lt;br&gt;**cloud-account** - CloudAccount - Cloud account where this LB is deployed.&lt;br&gt;**self** - LoadBalancer - Self link to this load balancer
 */
@ApiModel(description = "Represents a load balancer.<br>**HATEOAS** links:<br>**load-balancer-targets** - array[Machine] - List of load balancer target machines.<br>**cloud-account** - CloudAccount - Cloud account where this LB is deployed.<br>**self** - LoadBalancer - Self link to this load balancer")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class LoadBalancer {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("address")
  private String address = null;

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

  @SerializedName("cloudAccountIds")
  private List<String> cloudAccountIds = null;

  @SerializedName("routes")
  private List<RouteConfiguration> routes = new ArrayList<RouteConfiguration>();

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("loggingLevel")
  private String loggingLevel = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public LoadBalancer owner(String owner) {
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

  public LoadBalancer address(String address) {
    this.address = address;
    return this;
  }

   /**
   * Primary address allocated or in use by this load balancer. The address could be an in the form of a publicly resolvable DNS name or an IP address. 
   * @return address
  **/
  @ApiModelProperty(example = "lb-123456789.eu-west-1.elb.amazonaws.com", value = "Primary address allocated or in use by this load balancer. The address could be an in the form of a publicly resolvable DNS name or an IP address. ")
  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public LoadBalancer links(Map<String, Href> links) {
    this.links = links;
    return this;
  }

  public LoadBalancer putLinksItem(String key, Href linksItem) {
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

  public LoadBalancer externalZoneId(String externalZoneId) {
    this.externalZoneId = externalZoneId;
    return this;
  }

   /**
   * The external zoneId of the resource.
   * @return externalZoneId
  **/
  @ApiModelProperty(example = "us-east-1a", required = true, value = "The external zoneId of the resource.")
  public String getExternalZoneId() {
    return externalZoneId;
  }

  public void setExternalZoneId(String externalZoneId) {
    this.externalZoneId = externalZoneId;
  }

  public LoadBalancer externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

   /**
   * The external regionId of the resource.
   * @return externalRegionId
  **/
  @ApiModelProperty(example = "us-east-1", required = true, value = "The external regionId of the resource.")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public LoadBalancer description(String description) {
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

  public LoadBalancer externalId(String externalId) {
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

  public LoadBalancer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Define the type/variant of load balancer numbers e.g.for NSX the number virtual servers and pool members load balancer can host
   * @return type
  **/
  @ApiModelProperty(example = "Azure: BASIC, or STANDARD, AWS: Application, Network, or Classic, NSX: SMALL, MEDIUM, LARGE, EXTRA_LARGE", value = "Define the type/variant of load balancer numbers e.g.for NSX the number virtual servers and pool members load balancer can host")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LoadBalancer orgId(String orgId) {
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

  public LoadBalancer tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public LoadBalancer addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values that were set on this resource.
   * @return tags
  **/
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"ownedBy\\\", \\\"value\\\": \\\"Rainpole\\\" } ]\"", value = "A set of tag keys and optional values that were set on this resource.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public LoadBalancer organizationId(String organizationId) {
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

  public LoadBalancer createdAt(String createdAt) {
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

  public LoadBalancer cloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
    return this;
  }

  public LoadBalancer addCloudAccountIdsItem(String cloudAccountIdsItem) {
    if (this.cloudAccountIds == null) {
      this.cloudAccountIds = new ArrayList<String>();
    }
    this.cloudAccountIds.add(cloudAccountIdsItem);
    return this;
  }

   /**
   * Set of ids of the cloud accounts this resource belongs to.
   * @return cloudAccountIds
  **/
  @ApiModelProperty(example = "\"[9e49]\"", value = "Set of ids of the cloud accounts this resource belongs to.")
  public List<String> getCloudAccountIds() {
    return cloudAccountIds;
  }

  public void setCloudAccountIds(List<String> cloudAccountIds) {
    this.cloudAccountIds = cloudAccountIds;
  }

  public LoadBalancer routes(List<RouteConfiguration> routes) {
    this.routes = routes;
    return this;
  }

  public LoadBalancer addRoutesItem(RouteConfiguration routesItem) {
    this.routes.add(routesItem);
    return this;
  }

   /**
   * The load balancer route configuration regarding ports and protocols.
   * @return routes
  **/
  @ApiModelProperty(required = true, value = "The load balancer route configuration regarding ports and protocols.")
  public List<RouteConfiguration> getRoutes() {
    return routes;
  }

  public void setRoutes(List<RouteConfiguration> routes) {
    this.routes = routes;
  }

  public LoadBalancer customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public LoadBalancer putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Additional properties that may be used to extend the base resource.
   * @return customProperties
  **/
  @ApiModelProperty(example = "\"{ \\\"property\\\" : \\\"value\\\" }\"", value = "Additional properties that may be used to extend the base resource.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public LoadBalancer deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * Deployment id that is associated with this resource.
   * @return deploymentId
  **/
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "Deployment id that is associated with this resource.")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public LoadBalancer name(String name) {
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

  public LoadBalancer id(String id) {
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

  public LoadBalancer projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The id of the project this resource belongs to.
   * @return projectId
  **/
  @ApiModelProperty(example = "9e49", value = "The id of the project this resource belongs to.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public LoadBalancer loggingLevel(String loggingLevel) {
    this.loggingLevel = loggingLevel;
    return this;
  }

   /**
   * Defines logging level for collecting load balancer traffic logs.
   * @return loggingLevel
  **/
  @ApiModelProperty(example = "ERROR, WARNING, INFO, DEBUG", value = "Defines logging level for collecting load balancer traffic logs.")
  public String getLoggingLevel() {
    return loggingLevel;
  }

  public void setLoggingLevel(String loggingLevel) {
    this.loggingLevel = loggingLevel;
  }

  public LoadBalancer updatedAt(String updatedAt) {
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
    LoadBalancer loadBalancer = (LoadBalancer) o;
    return Objects.equals(this.owner, loadBalancer.owner) &&
        Objects.equals(this.address, loadBalancer.address) &&
        Objects.equals(this.links, loadBalancer.links) &&
        Objects.equals(this.externalZoneId, loadBalancer.externalZoneId) &&
        Objects.equals(this.externalRegionId, loadBalancer.externalRegionId) &&
        Objects.equals(this.description, loadBalancer.description) &&
        Objects.equals(this.externalId, loadBalancer.externalId) &&
        Objects.equals(this.type, loadBalancer.type) &&
        Objects.equals(this.orgId, loadBalancer.orgId) &&
        Objects.equals(this.tags, loadBalancer.tags) &&
        Objects.equals(this.organizationId, loadBalancer.organizationId) &&
        Objects.equals(this.createdAt, loadBalancer.createdAt) &&
        Objects.equals(this.cloudAccountIds, loadBalancer.cloudAccountIds) &&
        Objects.equals(this.routes, loadBalancer.routes) &&
        Objects.equals(this.customProperties, loadBalancer.customProperties) &&
        Objects.equals(this.deploymentId, loadBalancer.deploymentId) &&
        Objects.equals(this.name, loadBalancer.name) &&
        Objects.equals(this.id, loadBalancer.id) &&
        Objects.equals(this.projectId, loadBalancer.projectId) &&
        Objects.equals(this.loggingLevel, loadBalancer.loggingLevel) &&
        Objects.equals(this.updatedAt, loadBalancer.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, address, links, externalZoneId, externalRegionId, description, externalId, type, orgId, tags, organizationId, createdAt, cloudAccountIds, routes, customProperties, deploymentId, name, id, projectId, loggingLevel, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoadBalancer {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
    sb.append("    cloudAccountIds: ").append(toIndentedString(cloudAccountIds)).append("\n");
    sb.append("    routes: ").append(toIndentedString(routes)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    loggingLevel: ").append(toIndentedString(loggingLevel)).append("\n");
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

