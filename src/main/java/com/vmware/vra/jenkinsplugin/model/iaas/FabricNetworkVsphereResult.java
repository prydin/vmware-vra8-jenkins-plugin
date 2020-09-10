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
import java.util.List;
import java.util.Objects;

/** State object representing a query result of fabric networks. */
@Schema(description = "State object representing a query result of fabric networks.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class FabricNetworkVsphereResult {
  @SerializedName("numberOfElements")
  private Long numberOfElements = null;

  @SerializedName("content")
  private List<FabricNetworkVsphere> content = null;

  @SerializedName("totalElements")
  private Long totalElements = null;

  /**
   * Number of elements in the current page
   *
   * @return numberOfElements
   */
  @Schema(example = "1", description = "Number of elements in the current page")
  public Long getNumberOfElements() {
    return numberOfElements;
  }

  /**
   * List of content items
   *
   * @return content
   */
  @Schema(description = "List of content items")
  public List<FabricNetworkVsphere> getContent() {
    return content;
  }

  /**
   * Total number of elements. In some cases the field may not be populated
   *
   * @return totalElements
   */
  @Schema(
      example = "1",
      description = "Total number of elements. In some cases the field may not be populated")
  public Long getTotalElements() {
    return totalElements;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FabricNetworkVsphereResult fabricNetworkVsphereResult = (FabricNetworkVsphereResult) o;
    return Objects.equals(this.numberOfElements, fabricNetworkVsphereResult.numberOfElements)
        && Objects.equals(this.content, fabricNetworkVsphereResult.content)
        && Objects.equals(this.totalElements, fabricNetworkVsphereResult.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfElements, content, totalElements);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricNetworkVsphereResult {\n");

    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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
