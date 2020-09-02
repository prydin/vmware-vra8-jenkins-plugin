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
import net.virtualviking.vra.jenkinsplugin.model.iaas.EnumerationString;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Locale;

/**
 * ResourceBundle
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class ResourceBundle {
  @SerializedName("baseBundleName")
  private String baseBundleName = null;

  @SerializedName("keys")
  private EnumerationString keys = null;

  @SerializedName("locale")
  private Locale locale = null;

  public ResourceBundle baseBundleName(String baseBundleName) {
    this.baseBundleName = baseBundleName;
    return this;
  }

   /**
   * Get baseBundleName
   * @return baseBundleName
  **/
  @ApiModelProperty(value = "")
  public String getBaseBundleName() {
    return baseBundleName;
  }

  public void setBaseBundleName(String baseBundleName) {
    this.baseBundleName = baseBundleName;
  }

  public ResourceBundle keys(EnumerationString keys) {
    this.keys = keys;
    return this;
  }

   /**
   * Get keys
   * @return keys
  **/
  @ApiModelProperty(value = "")
  public EnumerationString getKeys() {
    return keys;
  }

  public void setKeys(EnumerationString keys) {
    this.keys = keys;
  }

  public ResourceBundle locale(Locale locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public Locale getLocale() {
    return locale;
  }

  public void setLocale(Locale locale) {
    this.locale = locale;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceBundle resourceBundle = (ResourceBundle) o;
    return Objects.equals(this.baseBundleName, resourceBundle.baseBundleName) &&
        Objects.equals(this.keys, resourceBundle.keys) &&
        Objects.equals(this.locale, resourceBundle.locale);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseBundleName, keys, locale);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceBundle {\n");
    
    sb.append("    baseBundleName: ").append(toIndentedString(baseBundleName)).append("\n");
    sb.append("    keys: ").append(toIndentedString(keys)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
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

