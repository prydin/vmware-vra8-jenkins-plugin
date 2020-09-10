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
import java.util.Objects;

/** Specification for attaching disk to a machine */
@Schema(description = "Specification for attaching disk to a machine")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class DiskAttachmentSpecification {
  @SerializedName("blockDeviceId")
  private String blockDeviceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  public DiskAttachmentSpecification blockDeviceId(String blockDeviceId) {
    this.blockDeviceId = blockDeviceId;
    return this;
  }

  /**
   * The id of the existing block device
   *
   * @return blockDeviceId
   */
  @Schema(example = "1298765", required = true, description = "The id of the existing block device")
  public String getBlockDeviceId() {
    return blockDeviceId;
  }

  public void setBlockDeviceId(String blockDeviceId) {
    this.blockDeviceId = blockDeviceId;
  }

  public DiskAttachmentSpecification name(String name) {
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

  public DiskAttachmentSpecification description(String description) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiskAttachmentSpecification diskAttachmentSpecification = (DiskAttachmentSpecification) o;
    return Objects.equals(this.blockDeviceId, diskAttachmentSpecification.blockDeviceId)
        && Objects.equals(this.name, diskAttachmentSpecification.name)
        && Objects.equals(this.description, diskAttachmentSpecification.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(blockDeviceId, name, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiskAttachmentSpecification {\n");

    sb.append("    blockDeviceId: ").append(toIndentedString(blockDeviceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
