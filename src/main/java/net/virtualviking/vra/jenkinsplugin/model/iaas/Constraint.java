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

/**
 * A constraint that is conveyed to the policy engine.
 */
@ApiModel(description = "A constraint that is conveyed to the policy engine.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class Constraint {
  @SerializedName("expression")
  private String expression = null;

  @SerializedName("mandatory")
  private Boolean mandatory = null;

  public Constraint expression(String expression) {
    this.expression = expression;
    return this;
  }

   /**
   * An expression of the form \&quot;[!]tag-key[:[tag-value]]\&quot;, used to indicate a constraint match on keys and values of tags. 
   * @return expression
  **/
  @ApiModelProperty(example = "ha:strong", required = true, value = "An expression of the form \"[!]tag-key[:[tag-value]]\", used to indicate a constraint match on keys and values of tags. ")
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public Constraint mandatory(Boolean mandatory) {
    this.mandatory = mandatory;
    return this;
  }

   /**
   * Indicates whether this constraint should be strictly enforced or not.
   * @return mandatory
  **/
  @ApiModelProperty(required = true, value = "Indicates whether this constraint should be strictly enforced or not.")
  public Boolean isMandatory() {
    return mandatory;
  }

  public void setMandatory(Boolean mandatory) {
    this.mandatory = mandatory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Constraint constraint = (Constraint) o;
    return Objects.equals(this.expression, constraint.expression) &&
        Objects.equals(this.mandatory, constraint.mandatory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression, mandatory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Constraint {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    mandatory: ").append(toIndentedString(mandatory)).append("\n");
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
