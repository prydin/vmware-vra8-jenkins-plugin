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
import java.util.List;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * Represents a specification of AWS storage profile.
 */
@ApiModel(description = "Represents a specification of AWS storage profile.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class StorageProfileAwsSpecification {
  @SerializedName("deviceType")
  private String deviceType = null;

  @SerializedName("volumeType")
  private String volumeType = null;

  @SerializedName("supportsEncryption")
  private Boolean supportsEncryption = null;

  @SerializedName("regionId")
  private String regionId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("iops")
  private String iops = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("defaultItem")
  private Boolean defaultItem = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public StorageProfileAwsSpecification deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

   /**
   * Indicates the type of storage.
   * @return deviceType
  **/
  @ApiModelProperty(example = "ebs / instance-store", required = true, value = "Indicates the type of storage.")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public StorageProfileAwsSpecification volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

   /**
   * Indicates the type of volume associated with type of storage.
   * @return volumeType
  **/
  @ApiModelProperty(example = "gp2 / io1 / sc1 / st1 / standard", value = "Indicates the type of volume associated with type of storage.")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public StorageProfileAwsSpecification supportsEncryption(Boolean supportsEncryption) {
    this.supportsEncryption = supportsEncryption;
    return this;
  }

   /**
   * Indicates whether this storage profile supports encryption or not.
   * @return supportsEncryption
  **/
  @ApiModelProperty(example = "false", value = "Indicates whether this storage profile supports encryption or not.")
  public Boolean isSupportsEncryption() {
    return supportsEncryption;
  }

  public void setSupportsEncryption(Boolean supportsEncryption) {
    this.supportsEncryption = supportsEncryption;
  }

  public StorageProfileAwsSpecification regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * A link to the region that is associated with the storage profile.
   * @return regionId
  **/
  @ApiModelProperty(example = "31186", required = true, value = "A link to the region that is associated with the storage profile.")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public StorageProfileAwsSpecification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name used as an identifier in APIs that support this option.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public StorageProfileAwsSpecification iops(String iops) {
    this.iops = iops;
    return this;
  }

   /**
   * Indicates maximum I/O operations per second in range(1-20,000).
   * @return iops
  **/
  @ApiModelProperty(example = "2000", value = "Indicates maximum I/O operations per second in range(1-20,000).")
  public String getIops() {
    return iops;
  }

  public void setIops(String iops) {
    this.iops = iops;
  }

  public StorageProfileAwsSpecification description(String description) {
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

  public StorageProfileAwsSpecification defaultItem(Boolean defaultItem) {
    this.defaultItem = defaultItem;
    return this;
  }

   /**
   * Indicates if a storage profile is default or not.
   * @return defaultItem
  **/
  @ApiModelProperty(example = "true", value = "Indicates if a storage profile is default or not.")
  public Boolean isDefaultItem() {
    return defaultItem;
  }

  public void setDefaultItem(Boolean defaultItem) {
    this.defaultItem = defaultItem;
  }

  public StorageProfileAwsSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public StorageProfileAwsSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A list of tags that represent the capabilities of this storage profile
   * @return tags
  **/
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"tier\\\", \\\"value\\\": \\\"silver\\\" } ]\"", value = "A list of tags that represent the capabilities of this storage profile")
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
    StorageProfileAwsSpecification storageProfileAwsSpecification = (StorageProfileAwsSpecification) o;
    return Objects.equals(this.deviceType, storageProfileAwsSpecification.deviceType) &&
        Objects.equals(this.volumeType, storageProfileAwsSpecification.volumeType) &&
        Objects.equals(this.supportsEncryption, storageProfileAwsSpecification.supportsEncryption) &&
        Objects.equals(this.regionId, storageProfileAwsSpecification.regionId) &&
        Objects.equals(this.name, storageProfileAwsSpecification.name) &&
        Objects.equals(this.iops, storageProfileAwsSpecification.iops) &&
        Objects.equals(this.description, storageProfileAwsSpecification.description) &&
        Objects.equals(this.defaultItem, storageProfileAwsSpecification.defaultItem) &&
        Objects.equals(this.tags, storageProfileAwsSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, volumeType, supportsEncryption, regionId, name, iops, description, defaultItem, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageProfileAwsSpecification {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    supportsEncryption: ").append(toIndentedString(supportsEncryption)).append("\n");
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultItem: ").append(toIndentedString(defaultItem)).append("\n");
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

