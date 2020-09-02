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

/**
 * ServiceStatLogHistogram
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class ServiceStatLogHistogram {
  @SerializedName("bins")
  private List<Long> bins = null;

  public ServiceStatLogHistogram bins(List<Long> bins) {
    this.bins = bins;
    return this;
  }

  public ServiceStatLogHistogram addBinsItem(Long binsItem) {
    if (this.bins == null) {
      this.bins = new ArrayList<Long>();
    }
    this.bins.add(binsItem);
    return this;
  }

   /**
   * Get bins
   * @return bins
  **/
  @ApiModelProperty(value = "")
  public List<Long> getBins() {
    return bins;
  }

  public void setBins(List<Long> bins) {
    this.bins = bins;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceStatLogHistogram serviceStatLogHistogram = (ServiceStatLogHistogram) o;
    return Objects.equals(this.bins, serviceStatLogHistogram.bins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bins);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceStatLogHistogram {\n");
    
    sb.append("    bins: ").append(toIndentedString(bins)).append("\n");
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

