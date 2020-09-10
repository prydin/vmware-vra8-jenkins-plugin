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

/** VolumeTypeList */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class VolumeTypeList {
  @SerializedName("volumeTypes")
  private List<String> volumeTypes = null;

  public VolumeTypeList volumeTypes(List<String> volumeTypes) {
    this.volumeTypes = volumeTypes;
    return this;
  }

  public VolumeTypeList addVolumeTypesItem(String volumeTypesItem) {
    if (this.volumeTypes == null) {
      this.volumeTypes = new ArrayList<String>();
    }
    this.volumeTypes.add(volumeTypesItem);
    return this;
  }

  /**
   * Get volumeTypes
   *
   * @return volumeTypes
   */
  @Schema(description = "")
  public List<String> getVolumeTypes() {
    return volumeTypes;
  }

  public void setVolumeTypes(List<String> volumeTypes) {
    this.volumeTypes = volumeTypes;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VolumeTypeList volumeTypeList = (VolumeTypeList) o;
    return Objects.equals(this.volumeTypes, volumeTypeList.volumeTypes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(volumeTypes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VolumeTypeList {\n");

    sb.append("    volumeTypes: ").append(toIndentedString(volumeTypes)).append("\n");
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
