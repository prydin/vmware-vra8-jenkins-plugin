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
import net.virtualviking.vra.jenkinsplugin.model.catalog.Metering;

/**
 * MeteringItem
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



public class MeteringItem {
  @SerializedName("itemName")
  private String itemName = null;

  @SerializedName("metering")
  private Metering metering = null;

  public MeteringItem itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @ApiModelProperty(value = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public MeteringItem metering(Metering metering) {
    this.metering = metering;
    return this;
  }

   /**
   * Get metering
   * @return metering
  **/
  @ApiModelProperty(value = "")
  public Metering getMetering() {
    return metering;
  }

  public void setMetering(Metering metering) {
    this.metering = metering;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteringItem meteringItem = (MeteringItem) o;
    return Objects.equals(this.itemName, meteringItem.itemName) &&
        Objects.equals(this.metering, meteringItem.metering);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemName, metering);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteringItem {\n");
    
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    metering: ").append(toIndentedString(metering)).append("\n");
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

