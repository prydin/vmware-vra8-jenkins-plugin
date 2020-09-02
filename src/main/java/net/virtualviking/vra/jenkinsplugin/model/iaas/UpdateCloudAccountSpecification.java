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
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * UpdateCloudAccountSpecification
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class UpdateCloudAccountSpecification {
  @SerializedName("privateKey")
  private String privateKey = null;

  @SerializedName("createDefaultZones")
  private Boolean createDefaultZones = null;

  @SerializedName("associatedCloudAccountIds")
  private List<String> associatedCloudAccountIds = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("regionIds")
  private List<String> regionIds = null;

  @SerializedName("privateKeyId")
  private String privateKeyId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public UpdateCloudAccountSpecification privateKey(String privateKey) {
    this.privateKey = privateKey;
    return this;
  }

   /**
   * Secret access key or password to be used to authenticate with the cloud account
   * @return privateKey
  **/
  @ApiModelProperty(example = "[ \"LVJbZNAkPCJs\" ]", value = "Secret access key or password to be used to authenticate with the cloud account")
  public String getPrivateKey() {
    return privateKey;
  }

  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  public UpdateCloudAccountSpecification createDefaultZones(Boolean createDefaultZones) {
    this.createDefaultZones = createDefaultZones;
    return this;
  }

   /**
   * Create default cloud zones for the enabled regions.
   * @return createDefaultZones
  **/
  @ApiModelProperty(example = "true", value = "Create default cloud zones for the enabled regions.")
  public Boolean isCreateDefaultZones() {
    return createDefaultZones;
  }

  public void setCreateDefaultZones(Boolean createDefaultZones) {
    this.createDefaultZones = createDefaultZones;
  }

  public UpdateCloudAccountSpecification associatedCloudAccountIds(List<String> associatedCloudAccountIds) {
    this.associatedCloudAccountIds = associatedCloudAccountIds;
    return this;
  }

  public UpdateCloudAccountSpecification addAssociatedCloudAccountIdsItem(String associatedCloudAccountIdsItem) {
    if (this.associatedCloudAccountIds == null) {
      this.associatedCloudAccountIds = new ArrayList<String>();
    }
    this.associatedCloudAccountIds.add(associatedCloudAccountIdsItem);
    return this;
  }

   /**
   * Cloud accounts to associate with this cloud account
   * @return associatedCloudAccountIds
  **/
  @ApiModelProperty(example = "\"[ \\\"42f3e0d199d134755684cd935435a\\\" ]\"", value = "Cloud accounts to associate with this cloud account")
  public List<String> getAssociatedCloudAccountIds() {
    return associatedCloudAccountIds;
  }

  public void setAssociatedCloudAccountIds(List<String> associatedCloudAccountIds) {
    this.associatedCloudAccountIds = associatedCloudAccountIds;
  }

  public UpdateCloudAccountSpecification customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public UpdateCloudAccountSpecification putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Additional custom properties that may be used to extend the Cloud Account.
   * @return customProperties
  **/
  @ApiModelProperty(example = "\"{ \\\"sampleadapterProjectId\\\" : \\\"projectId\\\" }\"", value = "Additional custom properties that may be used to extend the Cloud Account.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public UpdateCloudAccountSpecification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name used as an identifier in APIs that support this option.
   * @return name
  **/
  @ApiModelProperty(value = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateCloudAccountSpecification description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-friendly description.
   * @return description
  **/
  @ApiModelProperty(value = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateCloudAccountSpecification regionIds(List<String> regionIds) {
    this.regionIds = regionIds;
    return this;
  }

  public UpdateCloudAccountSpecification addRegionIdsItem(String regionIdsItem) {
    if (this.regionIds == null) {
      this.regionIds = new ArrayList<String>();
    }
    this.regionIds.add(regionIdsItem);
    return this;
  }

   /**
   * A set of Region names to enable provisioning on.
   * @return regionIds
  **/
  @ApiModelProperty(example = "\"[\\\"us-east-1\\\", \\\"ap-northeast-1\\\"]\"", value = "A set of Region names to enable provisioning on.")
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  public UpdateCloudAccountSpecification privateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
    return this;
  }

   /**
   * Access key id or username to be used to authenticate with the cloud account
   * @return privateKeyId
  **/
  @ApiModelProperty(example = "[ \"ACDC55DB4MFH6ADG75KK\" ]", value = "Access key id or username to be used to authenticate with the cloud account")
  public String getPrivateKeyId() {
    return privateKeyId;
  }

  public void setPrivateKeyId(String privateKeyId) {
    this.privateKeyId = privateKeyId;
  }

  public UpdateCloudAccountSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateCloudAccountSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values to set on the Cloud Account
   * @return tags
  **/
  @ApiModelProperty(example = "\"[{\\\"key\\\": \\\"env\\\", \\\"value\\\": \\\"dev\\\"}]\"", value = "A set of tag keys and optional values to set on the Cloud Account")
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
    UpdateCloudAccountSpecification updateCloudAccountSpecification = (UpdateCloudAccountSpecification) o;
    return Objects.equals(this.privateKey, updateCloudAccountSpecification.privateKey) &&
        Objects.equals(this.createDefaultZones, updateCloudAccountSpecification.createDefaultZones) &&
        Objects.equals(this.associatedCloudAccountIds, updateCloudAccountSpecification.associatedCloudAccountIds) &&
        Objects.equals(this.customProperties, updateCloudAccountSpecification.customProperties) &&
        Objects.equals(this.name, updateCloudAccountSpecification.name) &&
        Objects.equals(this.description, updateCloudAccountSpecification.description) &&
        Objects.equals(this.regionIds, updateCloudAccountSpecification.regionIds) &&
        Objects.equals(this.privateKeyId, updateCloudAccountSpecification.privateKeyId) &&
        Objects.equals(this.tags, updateCloudAccountSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(privateKey, createDefaultZones, associatedCloudAccountIds, customProperties, name, description, regionIds, privateKeyId, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCloudAccountSpecification {\n");
    
    sb.append("    privateKey: ").append(toIndentedString(privateKey)).append("\n");
    sb.append("    createDefaultZones: ").append(toIndentedString(createDefaultZones)).append("\n");
    sb.append("    associatedCloudAccountIds: ").append(toIndentedString(associatedCloudAccountIds)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
    sb.append("    privateKeyId: ").append(toIndentedString(privateKeyId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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

