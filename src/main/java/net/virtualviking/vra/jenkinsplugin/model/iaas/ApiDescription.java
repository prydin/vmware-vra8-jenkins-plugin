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
import net.virtualviking.vra.jenkinsplugin.model.iaas.DeprecationPolicy;

/**
 * ApiDescription
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class ApiDescription {
  @SerializedName("apiVersion")
  private String apiVersion = null;

  @SerializedName("deprecationPolicy")
  private DeprecationPolicy deprecationPolicy = null;

  @SerializedName("documentationLink")
  private String documentationLink = null;

  public ApiDescription apiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The version of the API in yyyy-MM-dd format (UTC).
   * @return apiVersion
  **/
  @ApiModelProperty(required = true, value = "The version of the API in yyyy-MM-dd format (UTC).")
  public String getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }

  public ApiDescription deprecationPolicy(DeprecationPolicy deprecationPolicy) {
    this.deprecationPolicy = deprecationPolicy;
    return this;
  }

   /**
   * The deprecation policy may contain information whether the api is in deprecated state and when it expires.
   * @return deprecationPolicy
  **/
  @ApiModelProperty(value = "The deprecation policy may contain information whether the api is in deprecated state and when it expires.")
  public DeprecationPolicy getDeprecationPolicy() {
    return deprecationPolicy;
  }

  public void setDeprecationPolicy(DeprecationPolicy deprecationPolicy) {
    this.deprecationPolicy = deprecationPolicy;
  }

  public ApiDescription documentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
    return this;
  }

   /**
   * The link to the documentation of this api version
   * @return documentationLink
  **/
  @ApiModelProperty(required = true, value = "The link to the documentation of this api version")
  public String getDocumentationLink() {
    return documentationLink;
  }

  public void setDocumentationLink(String documentationLink) {
    this.documentationLink = documentationLink;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiDescription apiDescription = (ApiDescription) o;
    return Objects.equals(this.apiVersion, apiDescription.apiVersion) &&
        Objects.equals(this.deprecationPolicy, apiDescription.deprecationPolicy) &&
        Objects.equals(this.documentationLink, apiDescription.documentationLink);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, deprecationPolicy, documentationLink);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDescription {\n");
    
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    deprecationPolicy: ").append(toIndentedString(deprecationPolicy)).append("\n");
    sb.append("    documentationLink: ").append(toIndentedString(documentationLink)).append("\n");
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
