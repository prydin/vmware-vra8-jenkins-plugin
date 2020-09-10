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

/** UpdateCloudAccountVmcSpecification */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class UpdateCloudAccountVmcSpecification {
  @SerializedName("createDefaultZones")
  private Boolean createDefaultZones = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("regionIds")
  private List<String> regionIds = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public UpdateCloudAccountVmcSpecification createDefaultZones(Boolean createDefaultZones) {
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

  public UpdateCloudAccountVmcSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateCloudAccountVmcSpecification description(String description) {
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

  public UpdateCloudAccountVmcSpecification regionIds(List<String> regionIds) {
    this.regionIds = regionIds;
    return this;
  }

  public UpdateCloudAccountVmcSpecification addRegionIdsItem(String regionIdsItem) {
    if (this.regionIds == null) {
      this.regionIds = new ArrayList<String>();
    }
    this.regionIds.add(regionIdsItem);
    return this;
  }

  /**
   * A set of Region names to enable provisioning on.
   *
   * @return regionIds
   */
  @Schema(
      example = "[\"us-east-1\", \"us-west-1\"]",
      description = "A set of Region names to enable provisioning on.")
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  public UpdateCloudAccountVmcSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateCloudAccountVmcSpecification addTagsItem(Tag tagsItem) {
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
      example = "[{\"key\": \"env\", \"value\": \"dev\"}]",
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
    UpdateCloudAccountVmcSpecification updateCloudAccountVmcSpecification =
        (UpdateCloudAccountVmcSpecification) o;
    return Objects.equals(
            this.createDefaultZones, updateCloudAccountVmcSpecification.createDefaultZones)
        && Objects.equals(this.name, updateCloudAccountVmcSpecification.name)
        && Objects.equals(this.description, updateCloudAccountVmcSpecification.description)
        && Objects.equals(this.regionIds, updateCloudAccountVmcSpecification.regionIds)
        && Objects.equals(this.tags, updateCloudAccountVmcSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createDefaultZones, name, description, regionIds, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCloudAccountVmcSpecification {\n");

    sb.append("    createDefaultZones: ").append(toIndentedString(createDefaultZones)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
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
