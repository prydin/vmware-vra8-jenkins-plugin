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

/**
 * FixedPrice
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



public class FixedPrice {
  /**
   * Gets or Sets chargePeriod
   */
  @JsonAdapter(ChargePeriodEnum.Adapter.class)
  public enum ChargePeriodEnum {
    HOURLY("HOURLY"),
    
    DAILY("DAILY"),
    
    WEEKLY("WEEKLY"),
    
    MONTHLY("MONTHLY");

    private String value;

    ChargePeriodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChargePeriodEnum fromValue(String text) {
      for (ChargePeriodEnum b : ChargePeriodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ChargePeriodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargePeriodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargePeriodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargePeriodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("chargePeriod")
  private ChargePeriodEnum chargePeriod = null;

  @SerializedName("rate")
  private Double rate = null;

  public FixedPrice chargePeriod(ChargePeriodEnum chargePeriod) {
    this.chargePeriod = chargePeriod;
    return this;
  }

   /**
   * Get chargePeriod
   * @return chargePeriod
  **/
  @ApiModelProperty(value = "")
  public ChargePeriodEnum getChargePeriod() {
    return chargePeriod;
  }

  public void setChargePeriod(ChargePeriodEnum chargePeriod) {
    this.chargePeriod = chargePeriod;
  }

  public FixedPrice rate(Double rate) {
    this.rate = rate;
    return this;
  }

   /**
   * Get rate
   * @return rate
  **/
  @ApiModelProperty(value = "")
  public Double getRate() {
    return rate;
  }

  public void setRate(Double rate) {
    this.rate = rate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FixedPrice fixedPrice = (FixedPrice) o;
    return Objects.equals(this.chargePeriod, fixedPrice.chargePeriod) &&
        Objects.equals(this.rate, fixedPrice.rate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargePeriod, rate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FixedPrice {\n");
    
    sb.append("    chargePeriod: ").append(toIndentedString(chargePeriod)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
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
