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
import net.virtualviking.vra.jenkinsplugin.model.iaas.AwsStorageProfile;

/**
 * State object representing a query result of Aws storage profiles.
 */
@ApiModel(description = "State object representing a query result of Aws storage profiles.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class StorageProfileAwsResult {
  @SerializedName("numberOfElements")
  private Long numberOfElements = null;

  @SerializedName("content")
  private List<AwsStorageProfile> content = null;

  @SerializedName("totalElements")
  private Long totalElements = null;

   /**
   * Number of elements in the current page
   * @return numberOfElements
  **/
  @ApiModelProperty(example = "1", value = "Number of elements in the current page")
  public Long getNumberOfElements() {
    return numberOfElements;
  }

   /**
   * List of content items
   * @return content
  **/
  @ApiModelProperty(value = "List of content items")
  public List<AwsStorageProfile> getContent() {
    return content;
  }

   /**
   * Total number of elements. In some cases the field may not be populated
   * @return totalElements
  **/
  @ApiModelProperty(example = "1", value = "Total number of elements. In some cases the field may not be populated")
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
    StorageProfileAwsResult storageProfileAwsResult = (StorageProfileAwsResult) o;
    return Objects.equals(this.numberOfElements, storageProfileAwsResult.numberOfElements) &&
        Objects.equals(this.content, storageProfileAwsResult.content) &&
        Objects.equals(this.totalElements, storageProfileAwsResult.totalElements);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberOfElements, content, totalElements);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StorageProfileAwsResult {\n");
    
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
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

