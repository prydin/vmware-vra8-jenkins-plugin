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

package com.vmware.vra.jenkinsplugin.model.catalog;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
/**
 * A timeseries object containing timestamp and price value at the timestamp
 */
@Schema(description = "A timeseries object containing timestamp and price value at the timestamp")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class TimeSeriesValue {
  @SerializedName("timestamp")
  private Date timestamp = null;

  @SerializedName("value")
  private BigDecimal value = null;

   /**
   * The timestamp of the metric.
   * @return timestamp
  **/
  @Schema(description = "The timestamp of the metric.")
  public Date getTimestamp() {
    return timestamp;
  }

   /**
   * The expense value at the timestamp.
   * @return value
  **/
  @Schema(description = "The expense value at the timestamp.")
  public BigDecimal getValue() {
    return value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeSeriesValue timeSeriesValue = (TimeSeriesValue) o;
    return Objects.equals(this.timestamp, timeSeriesValue.timestamp) &&
        Objects.equals(this.value, timeSeriesValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestamp, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeSeriesValue {\n");
    
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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