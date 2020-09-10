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
 * Projects link users and cloud zones, thus controlling who can use what cloud
 * resources.&lt;br&gt;**HATEOAS** links:&lt;br&gt;**self** - Project - Self link to this project
 */
@Schema(
    description =
        "Projects link users and cloud zones, thus controlling who can use what cloud resources.<br>**HATEOAS** links:<br>**self** - Project - Self link to this project")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class Project {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

  @SerializedName("operationTimeout")
  private Long operationTimeout = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("zones")
  private List<ZoneAssignmentConfig> zones = null;

  @SerializedName("constraints")
  private Map<String, List<Constraint>> constraints = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("viewers")
  private List<User> viewers = null;

  @SerializedName("machineNamingTemplate")
  private String machineNamingTemplate = null;

  @SerializedName("sharedResources")
  private Boolean sharedResources = null;

  @SerializedName("members")
  private List<User> members = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("administrators")
  private List<User> administrators = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public Project owner(String owner) {
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

  public Project _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public Project putLinksItem(String key, Href _linksItem) {
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

  public Project operationTimeout(Long operationTimeout) {
    this.operationTimeout = operationTimeout;
    return this;
  }

  /**
   * The timeout that should be used for Blueprint operations and Provisioning tasks. The timeout is
   * in seconds
   *
   * @return operationTimeout
   */
  @Schema(
      description =
          "The timeout that should be used for Blueprint operations and Provisioning tasks. The timeout is in seconds")
  public Long getOperationTimeout() {
    return operationTimeout;
  }

  public void setOperationTimeout(Long operationTimeout) {
    this.operationTimeout = operationTimeout;
  }

  public Project description(String description) {
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

  public Project zones(List<ZoneAssignmentConfig> zones) {
    this.zones = zones;
    return this;
  }

  public Project addZonesItem(ZoneAssignmentConfig zonesItem) {
    if (this.zones == null) {
      this.zones = new ArrayList<ZoneAssignmentConfig>();
    }
    this.zones.add(zonesItem);
    return this;
  }

  /**
   * List of Cloud Zones assigned to this project. You can limit deployment to a single region or
   * allow multi-region placement by adding more than one cloud zone to a project. A cloud zone
   * lists available resources. Use tags on resources to control workload placement.
   *
   * @return zones
   */
  @Schema(
      description =
          "List of Cloud Zones assigned to this project. You can limit deployment to a single region or allow multi-region placement by adding more than one cloud zone to a project. A cloud zone lists available resources. Use tags on resources to control workload placement.")
  public List<ZoneAssignmentConfig> getZones() {
    return zones;
  }

  public void setZones(List<ZoneAssignmentConfig> zones) {
    this.zones = zones;
  }

  public Project constraints(Map<String, List<Constraint>> constraints) {
    this.constraints = constraints;
    return this;
  }

  public Project putConstraintsItem(String key, List<Constraint> constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new HashMap<String, List<Constraint>>();
    }
    this.constraints.put(key, constraintsItem);
    return this;
  }

  /**
   * List of storage, network and extensibility constraints to be applied when provisioning through
   * this project.
   *
   * @return constraints
   */
  @Schema(
      example =
          "{\"network\":[{\"mandatory\": \"true\", \"expression\": \"env:dev\"}],\"storage\":[{\"mandatory\": \"false\", \"expression\": \"gold\"}],\"extensibility\":[{\"mandatory\": \"false\", \"expression\": \"key:value\"}]}",
      description =
          "List of storage, network and extensibility constraints to be applied when provisioning through this project.")
  public Map<String, List<Constraint>> getConstraints() {
    return constraints;
  }

  public void setConstraints(Map<String, List<Constraint>> constraints) {
    this.constraints = constraints;
  }

  public Project orgId(String orgId) {
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

  public Project organizationId(String organizationId) {
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

  public Project createdAt(String createdAt) {
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

  public Project viewers(List<User> viewers) {
    this.viewers = viewers;
    return this;
  }

  public Project addViewersItem(User viewersItem) {
    if (this.viewers == null) {
      this.viewers = new ArrayList<User>();
    }
    this.viewers.add(viewersItem);
    return this;
  }

  /**
   * List of viewer users associated with the project.
   *
   * @return viewers
   */
  @Schema(
      example = "[ { \"email\":\"viewer@vmware.com\" } ]",
      description = "List of viewer users associated with the project. ")
  public List<User> getViewers() {
    return viewers;
  }

  public void setViewers(List<User> viewers) {
    this.viewers = viewers;
  }

  public Project machineNamingTemplate(String machineNamingTemplate) {
    this.machineNamingTemplate = machineNamingTemplate;
    return this;
  }

  /**
   * The naming template to be used for machines provisioned in this project
   *
   * @return machineNamingTemplate
   */
  @Schema(
      example = "${project.name}-test-${####}",
      description = "The naming template to be used for machines provisioned in this project")
  public String getMachineNamingTemplate() {
    return machineNamingTemplate;
  }

  public void setMachineNamingTemplate(String machineNamingTemplate) {
    this.machineNamingTemplate = machineNamingTemplate;
  }

  public Project sharedResources(Boolean sharedResources) {
    this.sharedResources = sharedResources;
    return this;
  }

  /**
   * Specifies whether the resources in this projects are shared or not.
   *
   * @return sharedResources
   */
  @Schema(description = "Specifies whether the resources in this projects are shared or not.")
  public Boolean isSharedResources() {
    return sharedResources;
  }

  public void setSharedResources(Boolean sharedResources) {
    this.sharedResources = sharedResources;
  }

  public Project members(List<User> members) {
    this.members = members;
    return this;
  }

  public Project addMembersItem(User membersItem) {
    if (this.members == null) {
      this.members = new ArrayList<User>();
    }
    this.members.add(membersItem);
    return this;
  }

  /**
   * List of member users associated with the project.
   *
   * @return members
   */
  @Schema(
      example = "[ { \"email\":\"member@vmware.com\" } ]",
      description = "List of member users associated with the project. ")
  public List<User> getMembers() {
    return members;
  }

  public void setMembers(List<User> members) {
    this.members = members;
  }

  public Project name(String name) {
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

  public Project id(String id) {
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

  public Project administrators(List<User> administrators) {
    this.administrators = administrators;
    return this;
  }

  public Project addAdministratorsItem(User administratorsItem) {
    if (this.administrators == null) {
      this.administrators = new ArrayList<User>();
    }
    this.administrators.add(administratorsItem);
    return this;
  }

  /**
   * List of administrator users associated with the project. Only administrators can manage
   * project&#x27;s configuration.
   *
   * @return administrators
   */
  @Schema(
      example = "[ { \"email\":\"administrator@vmware.com\" } ]",
      description =
          "List of administrator users associated with the project. Only administrators can manage project's configuration.")
  public List<User> getAdministrators() {
    return administrators;
  }

  public void setAdministrators(List<User> administrators) {
    this.administrators = administrators;
  }

  public Project updatedAt(String updatedAt) {
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
    Project project = (Project) o;
    return Objects.equals(this.owner, project.owner)
        && Objects.equals(this._links, project._links)
        && Objects.equals(this.operationTimeout, project.operationTimeout)
        && Objects.equals(this.description, project.description)
        && Objects.equals(this.zones, project.zones)
        && Objects.equals(this.constraints, project.constraints)
        && Objects.equals(this.orgId, project.orgId)
        && Objects.equals(this.organizationId, project.organizationId)
        && Objects.equals(this.createdAt, project.createdAt)
        && Objects.equals(this.viewers, project.viewers)
        && Objects.equals(this.machineNamingTemplate, project.machineNamingTemplate)
        && Objects.equals(this.sharedResources, project.sharedResources)
        && Objects.equals(this.members, project.members)
        && Objects.equals(this.name, project.name)
        && Objects.equals(this.id, project.id)
        && Objects.equals(this.administrators, project.administrators)
        && Objects.equals(this.updatedAt, project.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        _links,
        operationTimeout,
        description,
        zones,
        constraints,
        orgId,
        organizationId,
        createdAt,
        viewers,
        machineNamingTemplate,
        sharedResources,
        members,
        name,
        id,
        administrators,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Project {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    operationTimeout: ").append(toIndentedString(operationTimeout)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    zones: ").append(toIndentedString(zones)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    viewers: ").append(toIndentedString(viewers)).append("\n");
    sb.append("    machineNamingTemplate: ")
        .append(toIndentedString(machineNamingTemplate))
        .append("\n");
    sb.append("    sharedResources: ").append(toIndentedString(sharedResources)).append("\n");
    sb.append("    members: ").append(toIndentedString(members)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    administrators: ").append(toIndentedString(administrators)).append("\n");
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
