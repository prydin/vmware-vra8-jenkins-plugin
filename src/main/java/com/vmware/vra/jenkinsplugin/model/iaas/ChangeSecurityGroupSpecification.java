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

/** Specification for a second day change security groups operation for a vsphere machine */
@Schema(
    description =
        "Specification for a second day change security groups operation for a vsphere machine")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class ChangeSecurityGroupSpecification {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("networkInterfaceSpecifications")
  private List<NetworkInterfaceSpecification> networkInterfaceSpecifications = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

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

  public ChangeSecurityGroupSpecification owner(String owner) {
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

  public ChangeSecurityGroupSpecification organizationId(String organizationId) {
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

  public ChangeSecurityGroupSpecification createdAt(String createdAt) {
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

  public ChangeSecurityGroupSpecification networkInterfaceSpecifications(
      List<NetworkInterfaceSpecification> networkInterfaceSpecifications) {
    this.networkInterfaceSpecifications = networkInterfaceSpecifications;
    return this;
  }

  public ChangeSecurityGroupSpecification addNetworkInterfaceSpecificationsItem(
      NetworkInterfaceSpecification networkInterfaceSpecificationsItem) {
    if (this.networkInterfaceSpecifications == null) {
      this.networkInterfaceSpecifications = new ArrayList<NetworkInterfaceSpecification>();
    }
    this.networkInterfaceSpecifications.add(networkInterfaceSpecificationsItem);
    return this;
  }

  /**
   * A set of network interface controller specifications for this machine. If not specified, then
   * no reconfiguration will be performed.
   *
   * @return networkInterfaceSpecifications
   */
  @Schema(
      description =
          "A set of network interface controller specifications for this machine. If not specified, then no reconfiguration will be performed.")
  public List<NetworkInterfaceSpecification> getNetworkInterfaceSpecifications() {
    return networkInterfaceSpecifications;
  }

  public void setNetworkInterfaceSpecifications(
      List<NetworkInterfaceSpecification> networkInterfaceSpecifications) {
    this.networkInterfaceSpecifications = networkInterfaceSpecifications;
  }

  public ChangeSecurityGroupSpecification _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public ChangeSecurityGroupSpecification putLinksItem(String key, Href _linksItem) {
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

  public ChangeSecurityGroupSpecification name(String name) {
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

  public ChangeSecurityGroupSpecification description(String description) {
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

  public ChangeSecurityGroupSpecification id(String id) {
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

  public ChangeSecurityGroupSpecification orgId(String orgId) {
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

  public ChangeSecurityGroupSpecification updatedAt(String updatedAt) {
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
    ChangeSecurityGroupSpecification changeSecurityGroupSpecification =
        (ChangeSecurityGroupSpecification) o;
    return Objects.equals(this.owner, changeSecurityGroupSpecification.owner)
        && Objects.equals(this.organizationId, changeSecurityGroupSpecification.organizationId)
        && Objects.equals(this.createdAt, changeSecurityGroupSpecification.createdAt)
        && Objects.equals(
            this.networkInterfaceSpecifications,
            changeSecurityGroupSpecification.networkInterfaceSpecifications)
        && Objects.equals(this._links, changeSecurityGroupSpecification._links)
        && Objects.equals(this.name, changeSecurityGroupSpecification.name)
        && Objects.equals(this.description, changeSecurityGroupSpecification.description)
        && Objects.equals(this.id, changeSecurityGroupSpecification.id)
        && Objects.equals(this.orgId, changeSecurityGroupSpecification.orgId)
        && Objects.equals(this.updatedAt, changeSecurityGroupSpecification.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        organizationId,
        createdAt,
        networkInterfaceSpecifications,
        _links,
        name,
        description,
        id,
        orgId,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeSecurityGroupSpecification {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    networkInterfaceSpecifications: ")
        .append(toIndentedString(networkInterfaceSpecifications))
        .append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
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
