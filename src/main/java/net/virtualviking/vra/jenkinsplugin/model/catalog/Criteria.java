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
import java.util.ArrayList;
import java.util.List;
import net.virtualviking.vra.jenkinsplugin.model.catalog.Clause;

/**
 * Criteria
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



public class Criteria {
  @SerializedName("matchExpression")
  private List<Clause> matchExpression = null;

  public Criteria matchExpression(List<Clause> matchExpression) {
    this.matchExpression = matchExpression;
    return this;
  }

  public Criteria addMatchExpressionItem(Clause matchExpressionItem) {
    if (this.matchExpression == null) {
      this.matchExpression = new ArrayList<Clause>();
    }
    this.matchExpression.add(matchExpressionItem);
    return this;
  }

   /**
   * Get matchExpression
   * @return matchExpression
  **/
  @ApiModelProperty(value = "")
  public List<Clause> getMatchExpression() {
    return matchExpression;
  }

  public void setMatchExpression(List<Clause> matchExpression) {
    this.matchExpression = matchExpression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Criteria criteria = (Criteria) o;
    return Objects.equals(this.matchExpression, criteria.matchExpression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpression);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Criteria {\n");
    
    sb.append("    matchExpression: ").append(toIndentedString(matchExpression)).append("\n");
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
