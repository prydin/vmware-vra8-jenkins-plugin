/*
 * VMware Cloud Assembly Blueprint API
 * A multi-cloud Blueprint API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-09-12
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.virtualviking.vra.jenkinsplugin.model.blueprint;

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
 * Variable
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-08-31T20:41:57.276-04:00")



public class Variable {
  @SerializedName("defaultValue")
  private Object defaultValue = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("sensitive")
  private Boolean sensitive = null;

  /**
   * The variable&#39;s type in the Terraform configuration. Complex Terraform types may be treated as Strings.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    STRING("STRING"),
    
    NUMBER("NUMBER"),
    
    BOOL("BOOL"),
    
    LIST("LIST"),
    
    MAP("MAP");

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

  public Variable defaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
    return this;
  }

   /**
   * The variable&#39;s default value in the Terraform configuration.
   * @return defaultValue
  **/
  @ApiModelProperty(value = "The variable's default value in the Terraform configuration.")
  public Object getDefaultValue() {
    return defaultValue;
  }

  public void setDefaultValue(Object defaultValue) {
    this.defaultValue = defaultValue;
  }

  public Variable description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The variable&#39;s description in the Terraform configuration.
   * @return description
  **/
  @ApiModelProperty(value = "The variable's description in the Terraform configuration.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Variable name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The variable&#39;s name in the Terraform configuration.
   * @return name
  **/
  @ApiModelProperty(value = "The variable's name in the Terraform configuration.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Variable sensitive(Boolean sensitive) {
    this.sensitive = sensitive;
    return this;
  }

   /**
   * Whether the variable should be obscured because of security concerns.
   * @return sensitive
  **/
  @ApiModelProperty(value = "Whether the variable should be obscured because of security concerns.")
  public Boolean isSensitive() {
    return sensitive;
  }

  public void setSensitive(Boolean sensitive) {
    this.sensitive = sensitive;
  }

  public Variable type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The variable&#39;s type in the Terraform configuration. Complex Terraform types may be treated as Strings.
   * @return type
  **/
  @ApiModelProperty(value = "The variable's type in the Terraform configuration. Complex Terraform types may be treated as Strings.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Variable variable = (Variable) o;
    return Objects.equals(this.defaultValue, variable.defaultValue) &&
        Objects.equals(this.description, variable.description) &&
        Objects.equals(this.name, variable.name) &&
        Objects.equals(this.sensitive, variable.sensitive) &&
        Objects.equals(this.type, variable.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultValue, description, name, sensitive, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Variable {\n");
    
    sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    sensitive: ").append(toIndentedString(sensitive)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

