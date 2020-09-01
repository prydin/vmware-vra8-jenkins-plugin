/*
 * VMware Cloud Assembly Blueprint API
 * A multi-cloud Blueprint API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-09-12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.virtualviking.vra.jenkinsplugin.model.blueprint;

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
import java.util.Date;
import java.util.UUID;

/**
 * TerraformVersion
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-31T20:41:57.276-04:00")



public class TerraformVersion {
  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("sha256Checksum")
  private String sha256Checksum = null;

  @SerializedName("updatedAt")
  private Date updatedAt = null;

  @SerializedName("updatedBy")
  private String updatedBy = null;

  @SerializedName("url")
  private String url = null;

  @SerializedName("version")
  private String version = null;

   /**
   * Created time
   * @return createdAt
  **/
  @ApiModelProperty(value = "Created time")
  public Date getCreatedAt() {
    return createdAt;
  }

   /**
   * Created by
   * @return createdBy
  **/
  @ApiModelProperty(value = "Created by")
  public String getCreatedBy() {
    return createdBy;
  }

  public TerraformVersion description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Version description
   * @return description
  **/
  @ApiModelProperty(value = "Version description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public TerraformVersion enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Version status
   * @return enabled
  **/
  @ApiModelProperty(value = "Version status")
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

   /**
   * Version ID
   * @return id
  **/
  @ApiModelProperty(value = "Version ID")
  public UUID getId() {
    return id;
  }

   /**
   * Org ID
   * @return orgId
  **/
  @ApiModelProperty(value = "Org ID")
  public String getOrgId() {
    return orgId;
  }

  public TerraformVersion sha256Checksum(String sha256Checksum) {
    this.sha256Checksum = sha256Checksum;
    return this;
  }

   /**
   * The sha256 checksum of the terraform binary
   * @return sha256Checksum
  **/
  @ApiModelProperty(value = "The sha256 checksum of the terraform binary")
  public String getSha256Checksum() {
    return sha256Checksum;
  }

  public void setSha256Checksum(String sha256Checksum) {
    this.sha256Checksum = sha256Checksum;
  }

   /**
   * Updated time
   * @return updatedAt
  **/
  @ApiModelProperty(value = "Updated time")
  public Date getUpdatedAt() {
    return updatedAt;
  }

   /**
   * Updated by
   * @return updatedBy
  **/
  @ApiModelProperty(value = "Updated by")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public TerraformVersion url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Download url
   * @return url
  **/
  @ApiModelProperty(value = "Download url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public TerraformVersion version(String version) {
    this.version = version;
    return this;
  }

   /**
   * The numeric version of terraform release
   * @return version
  **/
  @ApiModelProperty(value = "The numeric version of terraform release")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TerraformVersion terraformVersion = (TerraformVersion) o;
    return Objects.equals(this.createdAt, terraformVersion.createdAt) &&
        Objects.equals(this.createdBy, terraformVersion.createdBy) &&
        Objects.equals(this.description, terraformVersion.description) &&
        Objects.equals(this.enabled, terraformVersion.enabled) &&
        Objects.equals(this.id, terraformVersion.id) &&
        Objects.equals(this.orgId, terraformVersion.orgId) &&
        Objects.equals(this.sha256Checksum, terraformVersion.sha256Checksum) &&
        Objects.equals(this.updatedAt, terraformVersion.updatedAt) &&
        Objects.equals(this.updatedBy, terraformVersion.updatedBy) &&
        Objects.equals(this.url, terraformVersion.url) &&
        Objects.equals(this.version, terraformVersion.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, description, enabled, id, orgId, sha256Checksum, updatedAt, updatedBy, url, version);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TerraformVersion {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    sha256Checksum: ").append(toIndentedString(sha256Checksum)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

