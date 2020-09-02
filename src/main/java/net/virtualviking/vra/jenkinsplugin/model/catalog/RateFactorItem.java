/*
 * VMware Service Broker API
 * A multi-cloud API for Cloud Automation Services
 *
 * OpenAPI spec version: 2020-08-25
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.virtualviking.vra.jenkinsplugin.model.catalog;

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
import net.virtualviking.vra.jenkinsplugin.model.catalog.RateFactor;

/**
 * RateFactorItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



public class RateFactorItem {
  @SerializedName("key")
  private String key = null;

  @SerializedName("rateFactor")
  private RateFactor rateFactor = null;

  @SerializedName("value")
  private String value = null;

  public RateFactorItem key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * @return key
  **/
  @ApiModelProperty(value = "")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public RateFactorItem rateFactor(RateFactor rateFactor) {
    this.rateFactor = rateFactor;
    return this;
  }

   /**
   * Get rateFactor
   * @return rateFactor
  **/
  @ApiModelProperty(value = "")
  public RateFactor getRateFactor() {
    return rateFactor;
  }

  public void setRateFactor(RateFactor rateFactor) {
    this.rateFactor = rateFactor;
  }

  public RateFactorItem value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * @return value
  **/
  @ApiModelProperty(value = "")
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RateFactorItem rateFactorItem = (RateFactorItem) o;
    return Objects.equals(this.key, rateFactorItem.key) &&
        Objects.equals(this.rateFactor, rateFactorItem.rateFactor) &&
        Objects.equals(this.value, rateFactorItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, rateFactor, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RateFactorItem {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    rateFactor: ").append(toIndentedString(rateFactor)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

