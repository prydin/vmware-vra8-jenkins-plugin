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
 * Specification for a VMC cloud account.&lt;br&gt;&lt;br&gt;A cloud account identifies a cloud
 * account type and an account-specific deployment region or data center where the associated cloud
 * account resources are hosted.
 */
@Schema(
    description =
        "Specification for a VMC cloud account.<br><br>A cloud account identifies a cloud account type and an account-specific deployment region or data center where the associated cloud account resources are hosted.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class CloudAccountVmcSpecification {
  @SerializedName("hostName")
  private String hostName = null;

  @SerializedName("acceptSelfSignedCertificate")
  private Boolean acceptSelfSignedCertificate = null;

  @SerializedName("apiKey")
  private String apiKey = null;

  @SerializedName("nsxHostName")
  private String nsxHostName = null;

  @SerializedName("sddcId")
  private String sddcId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("regionIds")
  private List<String> regionIds = new ArrayList<String>();

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("createDefaultZones")
  private Boolean createDefaultZones = null;

  @SerializedName("dcId")
  private String dcId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("username")
  private String username = null;

  @SerializedName("cspHostName")
  private String cspHostName = null;

  public CloudAccountVmcSpecification hostName(String hostName) {
    this.hostName = hostName;
    return this;
  }

  /**
   * Enter the IP address or FQDN of the vCenter Server in the specified SDDC. The cloud proxy
   * belongs on this vCenter.
   *
   * @return hostName
   */
  @Schema(
      example = "vc1.vmware.com",
      required = true,
      description =
          "Enter the IP address or FQDN of the vCenter Server in the specified SDDC. The cloud proxy belongs on this vCenter.")
  public String getHostName() {
    return hostName;
  }

  public void setHostName(String hostName) {
    this.hostName = hostName;
  }

  public CloudAccountVmcSpecification acceptSelfSignedCertificate(
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

  public CloudAccountVmcSpecification apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }

  /**
   * VMC API access key
   *
   * @return apiKey
   */
  @Schema(description = "VMC API access key")
  public String getApiKey() {
    return apiKey;
  }

  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }

  public CloudAccountVmcSpecification nsxHostName(String nsxHostName) {
    this.nsxHostName = nsxHostName;
    return this;
  }

  /**
   * The IP address of the NSX Manager server in the specified SDDC / FQDN.
   *
   * @return nsxHostName
   */
  @Schema(
      example = "nsxManager.sddc-52-12-8-145.vmwaretest.com",
      required = true,
      description = "The IP address of the NSX Manager server in the specified SDDC / FQDN.")
  public String getNsxHostName() {
    return nsxHostName;
  }

  public void setNsxHostName(String nsxHostName) {
    this.nsxHostName = nsxHostName;
  }

  public CloudAccountVmcSpecification sddcId(String sddcId) {
    this.sddcId = sddcId;
    return this;
  }

  /**
   * Identifier of the on-premise SDDC to be used by this cloud account. Note that NSX-V SDDCs are
   * not supported.
   *
   * @return sddcId
   */
  @Schema(
      example = "CMBU-PRD-NSXT-M8GA-090319",
      description =
          "Identifier of the on-premise SDDC to be used by this cloud account. Note that NSX-V SDDCs are not supported.")
  public String getSddcId() {
    return sddcId;
  }

  public void setSddcId(String sddcId) {
    this.sddcId = sddcId;
  }

  public CloudAccountVmcSpecification description(String description) {
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

  public CloudAccountVmcSpecification regionIds(List<String> regionIds) {
    this.regionIds = regionIds;
    return this;
  }

  public CloudAccountVmcSpecification addRegionIdsItem(String regionIdsItem) {
    this.regionIds.add(regionIdsItem);
    return this;
  }

  /**
   * A set of Region names to enable provisioning on.Refer to
   * /iaas/cloud-accounts/region-enumeration.
   *
   * @return regionIds
   */
  @Schema(
      example = "[ \"us-east-1\", \"ap-northeast-1\" ]",
      required = true,
      description =
          "A set of Region names to enable provisioning on.Refer to /iaas/cloud-accounts/region-enumeration.")
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  public CloudAccountVmcSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public CloudAccountVmcSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values to set on the Cloud Account.Cloud account capability tags
   * may enable different features.
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"env\", \"value\": \"dev\" } ]",
      description =
          "A set of tag keys and optional values to set on the Cloud Account.Cloud account capability tags may enable different features. ")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public CloudAccountVmcSpecification password(String password) {
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

  public CloudAccountVmcSpecification createDefaultZones(Boolean createDefaultZones) {
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

  public CloudAccountVmcSpecification dcId(String dcId) {
    this.dcId = dcId;
    return this;
  }

  /**
   * Identifier of a data collector vm deployed in the on premise infrastructure. Refer to the
   * data-collector API to create or list data collectors
   *
   * @return dcId
   */
  @Schema(
      example = "23959a1e-18bc-4f0c-ac49-b5aeb4b6eef4",
      description =
          "Identifier of a data collector vm deployed in the on premise infrastructure. Refer to the data-collector API to create or list data collectors")
  public String getDcId() {
    return dcId;
  }

  public void setDcId(String dcId) {
    this.dcId = dcId;
  }

  public CloudAccountVmcSpecification name(String name) {
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

  public CloudAccountVmcSpecification username(String username) {
    this.username = username;
    return this;
  }

  /**
   * vCenter user name for the specified SDDC.The specified user requires CloudAdmin credentials.
   * The user does not require CloudGlobalAdmin credentials.
   *
   * @return username
   */
  @Schema(
      example = "administrator@mycompany.com",
      required = true,
      description =
          "vCenter user name for the specified SDDC.The specified user requires CloudAdmin credentials. The user does not require CloudGlobalAdmin credentials.")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public CloudAccountVmcSpecification cspHostName(String cspHostName) {
    this.cspHostName = cspHostName;
    return this;
  }

  /**
   * The host name of the CSP service.
   *
   * @return cspHostName
   */
  @Schema(
      example = "console-stg.cloud.vmware.com",
      description = "The host name of the CSP service.")
  public String getCspHostName() {
    return cspHostName;
  }

  public void setCspHostName(String cspHostName) {
    this.cspHostName = cspHostName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountVmcSpecification cloudAccountVmcSpecification = (CloudAccountVmcSpecification) o;
    return Objects.equals(this.hostName, cloudAccountVmcSpecification.hostName)
        && Objects.equals(
            this.acceptSelfSignedCertificate,
            cloudAccountVmcSpecification.acceptSelfSignedCertificate)
        && Objects.equals(this.apiKey, cloudAccountVmcSpecification.apiKey)
        && Objects.equals(this.nsxHostName, cloudAccountVmcSpecification.nsxHostName)
        && Objects.equals(this.sddcId, cloudAccountVmcSpecification.sddcId)
        && Objects.equals(this.description, cloudAccountVmcSpecification.description)
        && Objects.equals(this.regionIds, cloudAccountVmcSpecification.regionIds)
        && Objects.equals(this.tags, cloudAccountVmcSpecification.tags)
        && Objects.equals(this.password, cloudAccountVmcSpecification.password)
        && Objects.equals(this.createDefaultZones, cloudAccountVmcSpecification.createDefaultZones)
        && Objects.equals(this.dcId, cloudAccountVmcSpecification.dcId)
        && Objects.equals(this.name, cloudAccountVmcSpecification.name)
        && Objects.equals(this.username, cloudAccountVmcSpecification.username)
        && Objects.equals(this.cspHostName, cloudAccountVmcSpecification.cspHostName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        hostName,
        acceptSelfSignedCertificate,
        apiKey,
        nsxHostName,
        sddcId,
        description,
        regionIds,
        tags,
        password,
        createDefaultZones,
        dcId,
        name,
        username,
        cspHostName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountVmcSpecification {\n");

    sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
    sb.append("    acceptSelfSignedCertificate: ")
        .append(toIndentedString(acceptSelfSignedCertificate))
        .append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    nsxHostName: ").append(toIndentedString(nsxHostName)).append("\n");
    sb.append("    sddcId: ").append(toIndentedString(sddcId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    createDefaultZones: ").append(toIndentedString(createDefaultZones)).append("\n");
    sb.append("    dcId: ").append(toIndentedString(dcId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    cspHostName: ").append(toIndentedString(cspHostName)).append("\n");
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
