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
 * Specification for a Azure cloud account.&lt;br&gt;&lt;br&gt;A cloud account identifies a cloud
 * account type and an account-specific deployment region or data center where the associated cloud
 * account resources are hosted.
 */
@Schema(
    description =
        "Specification for a Azure cloud account.<br><br>A cloud account identifies a cloud account type and an account-specific deployment region or data center where the associated cloud account resources are hosted.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class CloudAccountAzureSpecification {
  @SerializedName("createDefaultZones")
  private Boolean createDefaultZones = null;

  @SerializedName("clientApplicationId")
  private String clientApplicationId = null;

  @SerializedName("clientApplicationSecretKey")
  private String clientApplicationSecretKey = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tenantId")
  private String tenantId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("regionIds")
  private List<String> regionIds = new ArrayList<String>();

  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public CloudAccountAzureSpecification createDefaultZones(Boolean createDefaultZones) {
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

  public CloudAccountAzureSpecification clientApplicationId(String clientApplicationId) {
    this.clientApplicationId = clientApplicationId;
    return this;
  }

  /**
   * Azure Client Application ID
   *
   * @return clientApplicationId
   */
  @Schema(
      example = "3287dd6e-76d8-41b7-9856-2584969e7739",
      required = true,
      description = "Azure Client Application ID")
  public String getClientApplicationId() {
    return clientApplicationId;
  }

  public void setClientApplicationId(String clientApplicationId) {
    this.clientApplicationId = clientApplicationId;
  }

  public CloudAccountAzureSpecification clientApplicationSecretKey(
      String clientApplicationSecretKey) {
    this.clientApplicationSecretKey = clientApplicationSecretKey;
    return this;
  }

  /**
   * Azure Client Application Secret Key
   *
   * @return clientApplicationSecretKey
   */
  @Schema(
      example = "GDfdasDasdASFas321das32cas2x3dsXCSA76xdcasg=",
      required = true,
      description = "Azure Client Application Secret Key")
  public String getClientApplicationSecretKey() {
    return clientApplicationSecretKey;
  }

  public void setClientApplicationSecretKey(String clientApplicationSecretKey) {
    this.clientApplicationSecretKey = clientApplicationSecretKey;
  }

  public CloudAccountAzureSpecification name(String name) {
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

  public CloudAccountAzureSpecification tenantId(String tenantId) {
    this.tenantId = tenantId;
    return this;
  }

  /**
   * Azure Tenant ID
   *
   * @return tenantId
   */
  @Schema(
      example = "9a13d920-4691-4e2d-b5d5-9c4c1279bc9a",
      required = true,
      description = "Azure Tenant ID")
  public String getTenantId() {
    return tenantId;
  }

  public void setTenantId(String tenantId) {
    this.tenantId = tenantId;
  }

  public CloudAccountAzureSpecification description(String description) {
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

  public CloudAccountAzureSpecification regionIds(List<String> regionIds) {
    this.regionIds = regionIds;
    return this;
  }

  public CloudAccountAzureSpecification addRegionIdsItem(String regionIdsItem) {
    this.regionIds.add(regionIdsItem);
    return this;
  }

  /**
   * A set of Region names to enable provisioning on. Refer to
   * /iaas/cloud-accounts-azure/region-enumeration..
   *
   * @return regionIds
   */
  @Schema(
      example = "[ \"East US\", \"North Europe\" ]",
      required = true,
      description =
          "A set of Region names to enable provisioning on. Refer to /iaas/cloud-accounts-azure/region-enumeration..")
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  public CloudAccountAzureSpecification subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

  /**
   * Azure Subscribtion ID
   *
   * @return subscriptionId
   */
  @Schema(
      example = "064865b2-e914-4717-b415-8806d17948f7",
      required = true,
      description = "Azure Subscribtion ID")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public CloudAccountAzureSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public CloudAccountAzureSpecification addTagsItem(Tag tagsItem) {
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
    CloudAccountAzureSpecification cloudAccountAzureSpecification =
        (CloudAccountAzureSpecification) o;
    return Objects.equals(
            this.createDefaultZones, cloudAccountAzureSpecification.createDefaultZones)
        && Objects.equals(
            this.clientApplicationId, cloudAccountAzureSpecification.clientApplicationId)
        && Objects.equals(
            this.clientApplicationSecretKey,
            cloudAccountAzureSpecification.clientApplicationSecretKey)
        && Objects.equals(this.name, cloudAccountAzureSpecification.name)
        && Objects.equals(this.tenantId, cloudAccountAzureSpecification.tenantId)
        && Objects.equals(this.description, cloudAccountAzureSpecification.description)
        && Objects.equals(this.regionIds, cloudAccountAzureSpecification.regionIds)
        && Objects.equals(this.subscriptionId, cloudAccountAzureSpecification.subscriptionId)
        && Objects.equals(this.tags, cloudAccountAzureSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createDefaultZones,
        clientApplicationId,
        clientApplicationSecretKey,
        name,
        tenantId,
        description,
        regionIds,
        subscriptionId,
        tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountAzureSpecification {\n");

    sb.append("    createDefaultZones: ").append(toIndentedString(createDefaultZones)).append("\n");
    sb.append("    clientApplicationId: ")
        .append(toIndentedString(clientApplicationId))
        .append("\n");
    sb.append("    clientApplicationSecretKey: ")
        .append(toIndentedString(clientApplicationSecretKey))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tenantId: ").append(toIndentedString(tenantId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
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
