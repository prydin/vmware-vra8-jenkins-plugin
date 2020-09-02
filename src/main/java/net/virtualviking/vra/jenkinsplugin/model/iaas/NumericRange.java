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
import net.virtualviking.vra.jenkinsplugin.model.iaas.Number;

/**
 * NumericRange
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class NumericRange {
  @SerializedName("min")
  private Number min = null;

  @SerializedName("isMaxInclusive")
  private Boolean isMaxInclusive = null;

  @SerializedName("max")
  private Number max = null;

  @SerializedName("isMinInclusive")
  private Boolean isMinInclusive = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    LONG("LONG"),
    
    STRING("STRING"),
    
    BYTES("BYTES"),
    
    PODO("PODO"),
    
    COLLECTION("COLLECTION"),
    
    MAP("MAP"),
    
    BOOLEAN("BOOLEAN"),
    
    DOUBLE("DOUBLE"),
    
    INTERNETADDRESSV4("InternetAddressV4"),
    
    INTERNETADDRESSV6("InternetAddressV6"),
    
    DATE("DATE"),
    
    URI("URI"),
    
    ENUM("ENUM");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("precisionStep")
  private Integer precisionStep = null;

  public NumericRange min(Number min) {
    this.min = min;
    return this;
  }

   /**
   * Get min
   * @return min
  **/
  @ApiModelProperty(value = "")
  public Number getMin() {
    return min;
  }

  public void setMin(Number min) {
    this.min = min;
  }

  public NumericRange isMaxInclusive(Boolean isMaxInclusive) {
    this.isMaxInclusive = isMaxInclusive;
    return this;
  }

   /**
   * Get isMaxInclusive
   * @return isMaxInclusive
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsMaxInclusive() {
    return isMaxInclusive;
  }

  public void setIsMaxInclusive(Boolean isMaxInclusive) {
    this.isMaxInclusive = isMaxInclusive;
  }

  public NumericRange max(Number max) {
    this.max = max;
    return this;
  }

   /**
   * Get max
   * @return max
  **/
  @ApiModelProperty(value = "")
  public Number getMax() {
    return max;
  }

  public void setMax(Number max) {
    this.max = max;
  }

  public NumericRange isMinInclusive(Boolean isMinInclusive) {
    this.isMinInclusive = isMinInclusive;
    return this;
  }

   /**
   * Get isMinInclusive
   * @return isMinInclusive
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsMinInclusive() {
    return isMinInclusive;
  }

  public void setIsMinInclusive(Boolean isMinInclusive) {
    this.isMinInclusive = isMinInclusive;
  }

  public NumericRange type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public NumericRange precisionStep(Integer precisionStep) {
    this.precisionStep = precisionStep;
    return this;
  }

   /**
   * Get precisionStep
   * @return precisionStep
  **/
  @ApiModelProperty(value = "")
  public Integer getPrecisionStep() {
    return precisionStep;
  }

  public void setPrecisionStep(Integer precisionStep) {
    this.precisionStep = precisionStep;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NumericRange numericRange = (NumericRange) o;
    return Objects.equals(this.min, numericRange.min) &&
        Objects.equals(this.isMaxInclusive, numericRange.isMaxInclusive) &&
        Objects.equals(this.max, numericRange.max) &&
        Objects.equals(this.isMinInclusive, numericRange.isMinInclusive) &&
        Objects.equals(this.type, numericRange.type) &&
        Objects.equals(this.precisionStep, numericRange.precisionStep);
  }

  @Override
  public int hashCode() {
    return Objects.hash(min, isMaxInclusive, max, isMinInclusive, type, precisionStep);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NumericRange {\n");
    
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    isMaxInclusive: ").append(toIndentedString(isMaxInclusive)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    isMinInclusive: ").append(toIndentedString(isMinInclusive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    precisionStep: ").append(toIndentedString(precisionStep)).append("\n");
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

