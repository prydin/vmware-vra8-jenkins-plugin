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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Specification for a vSphere cloud account.&lt;br&gt;&lt;br&gt;A cloud account identifies a cloud
 * account type and an account-specific deployment region or data center where the associated cloud
 * account resources are hosted.
 */
@Schema(
    description =
        "Specification for a vSphere cloud account.<br><br>A cloud account identifies a cloud account type and an account-specific deployment region or data center where the associated cloud account resources are hosted.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class CloudAccountVsphereSpecification {
  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("acceptSelfSignedCertificate")
  private Boolean acceptSelfSignedCertificate = null;

  @SerializedName("associatedCloudAccountIds")
  private List<String> associatedCloudAccountIds = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("createDefaultZones")
  private Boolean createDefaultZones = null;

  @SerializedName("dcid")
  private String dcid = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("regionIds")
  private List<String> regionIds = new ArrayList<String>();

  @SerializedName("username")
  private String username = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public CloudAccountVsphereSpecification hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * Host name for the vSphere endpoint
   *
   * @return hostName
   */
  @Schema(
      example = "vc.mycompany.com",
      required = true,
      description = "Host name for the vSphere endpoint")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public CloudAccountVsphereSpecification acceptSelfSignedCertificate(
      Boolean acceptSelfSignedCertificate) {
    this.acceptSelfSignedCertificate = acceptSelfSignedCertificate;
    return this;
  }

  /**
   * Accept self signed certificate when connecting to vSphere
   *
   * @return acceptSelfSignedCertificate
   */
  @Schema(
      example = "false",
      description = "Accept self signed certificate when connecting to vSphere")
  public Boolean isAcceptSelfSignedCertificate() {
    return acceptSelfSignedCertificate;
  }

  public void setAcceptSelfSignedCertificate(Boolean acceptSelfSignedCertificate) {
    this.acceptSelfSignedCertificate = acceptSelfSignedCertificate;
  }

  public CloudAccountVsphereSpecification associatedCloudAccountIds(
      List<String> associatedCloudAccountIds) {
    this.associatedCloudAccountIds = associatedCloudAccountIds;
    return this;
  }

  public CloudAccountVsphereSpecification addAssociatedCloudAccountIdsItem(
      String associatedCloudAccountIdsItem) {
    if (this.associatedCloudAccountIds == null) {
      this.associatedCloudAccountIds = new ArrayList<String>();
    }
    this.associatedCloudAccountIds.add(associatedCloudAccountIdsItem);
    return this;
  }

  /**
   * NSX-V or NSX-T account to associate with this vSphere cloud account. vSphere cloud account can
   * be a single NSX-V cloud account or a single NSX-T cloud account.
   *
   * @return associatedCloudAccountIds
   */
  @Schema(
      example = "[ \"42f3e0d199d134755684cd935435a\" ]",
      description =
          "NSX-V or NSX-T account to associate with this vSphere cloud account. vSphere cloud account can be a single NSX-V cloud account or a single NSX-T cloud account.")
  public List<String> getAssociatedCloudAccountIds() {
    return associatedCloudAccountIds;
  }

  public void setAssociatedCloudAccountIds(List<String> associatedCloudAccountIds) {
    this.associatedCloudAccountIds = associatedCloudAccountIds;
  }

  public CloudAccountVsphereSpecification password(String password) {
    this.password = password;
    return this;
  }

  /**
   * Password for the user used to authenticate with the cloud Account
   *
   * @return password
   */
  @Schema(
      example = "cndhjslacd90ascdbasyoucbdh",
      required = true,
      description = "Password for the user used to authenticate with the cloud Account")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public CloudAccountVsphereSpecification createDefaultZones(Boolean createDefaultZones) {
    this.createDefaultZones = createDefaultZones;
    return this;
  }

  /**
   * Create default cloud zones for the enabled regions.
   *
   * @return createDefaultZones
   */
  @Schema(example = "true", description = "Create default cloud zones for the enabled regions.")
  public Boolean isCreateDefaultZones() {
    return createDefaultZones;
  }

  public void setCreateDefaultZones(Boolean createDefaultZones) {
    this.createDefaultZones = createDefaultZones;
  }

  public CloudAccountVsphereSpecification dcid(String dcid) {
    this.dcid = dcid;
    return this;
  }

  /**
   * Identifier of a data collector vm deployed in the on premise infrastructure. Refer to the
   * data-collector API to create or list data collectors
   *
   * @return dcid
   */
  @Schema(
      example = "23959a1e-18bc-4f0c-ac49-b5aeb4b6eef4",
      description =
          "Identifier of a data collector vm deployed in the on premise infrastructure. Refer to the data-collector API to create or list data collectors")
  public String getDcid() {
    return dcid;
  }

  public void setDcid(String dcid) {
    this.dcid = dcid;
  }

  public CloudAccountVsphereSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      required = true,
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CloudAccountVsphereSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-friendly description.
   *
   * @return description
   */
  @Schema(description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CloudAccountVsphereSpecification regionIds(List<String> regionIds) {
    this.regionIds = regionIds;
    return this;
  }

  public CloudAccountVsphereSpecification addRegionIdsItem(String regionIdsItem) {
    this.regionIds.add(regionIdsItem);
    return this;
  }

  /**
   * A set of datacenter managed object reference identifiers (MoRef) to enable provisioning on.
   * Refer to /iaas/cloud-accounts-vsphere/region-enumeration.
   *
   * @return regionIds
   */
  @Schema(
      example = "[ \"Datacenter:datacenter-2\" ]",
      required = true,
      description =
          "A set of datacenter managed object reference identifiers (MoRef) to enable provisioning on. Refer to /iaas/cloud-accounts-vsphere/region-enumeration.")
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  public CloudAccountVsphereSpecification username(String username) {
    this.username = username;
    return this;
  }

  /**
   * Username to authenticate with the cloud account
   *
   * @return username
   */
  @Schema(
      example = "administrator@mycompany.com",
      required = true,
      description = "Username to authenticate with the cloud account")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CloudAccountVsphereSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public CloudAccountVsphereSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values to set on the Cloud Account
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"env\", \"value\": \"dev\" } ]",
      description = "A set of tag keys and optional values to set on the Cloud Account")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountVsphereSpecification cloudAccountVsphereSpecification =
        (CloudAccountVsphereSpecification) o;
    return Objects.equals(this.hostName, cloudAccountVsphereSpecification.hostName)
        && Objects.equals(
            this.acceptSelfSignedCertificate,
            cloudAccountVsphereSpecification.acceptSelfSignedCertificate)
        && Objects.equals(
            this.associatedCloudAccountIds,
            cloudAccountVsphereSpecification.associatedCloudAccountIds)
        && Objects.equals(this.password, cloudAccountVsphereSpecification.password)
        && Objects.equals(
            this.createDefaultZones, cloudAccountVsphereSpecification.createDefaultZones)
        && Objects.equals(this.dcid, cloudAccountVsphereSpecification.dcid)
        && Objects.equals(this.name, cloudAccountVsphereSpecification.name)
        && Objects.equals(this.description, cloudAccountVsphereSpecification.description)
        && Objects.equals(this.regionIds, cloudAccountVsphereSpecification.regionIds)
        && Objects.equals(this.username, cloudAccountVsphereSpecification.username)
        && Objects.equals(this.tags, cloudAccountVsphereSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hostName,
        acceptSelfSignedCertificate,
        associatedCloudAccountIds,
        password,
        createDefaultZones,
        dcid,
        name,
        description,
        regionIds,
        username,
        tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountVsphereSpecification {\n");

    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    acceptSelfSignedCertificate: ")
        .append(toIndentedString(acceptSelfSignedCertificate))
        .append("\n");
    sb.append("    associatedCloudAccountIds: ")
        .append(toIndentedString(associatedCloudAccountIds))
        .append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    createDefaultZones: ").append(toIndentedString(createDefaultZones)).append("\n");
    sb.append("    dcid: ").append(toIndentedString(dcid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
