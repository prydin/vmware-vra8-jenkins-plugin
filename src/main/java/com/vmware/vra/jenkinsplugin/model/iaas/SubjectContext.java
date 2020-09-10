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

package com.vmware.vra.jenkinsplugin.model.iaas;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * SubjectContext
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class SubjectContext {
  @SerializedName("sub")
  private String sub = null;

  @SerializedName("additionalContext")
  private Map<String, String> additionalContext = null;

  @SerializedName("acct")
  private String acct = null;

  public SubjectContext sub(String sub) {
    this.sub = sub;
    return this;
  }

   /**
   * Get sub
   * @return sub
  **/
  @Schema(description = "")
  public String getSub() {
    return sub;
  }

  public void setSub(String sub) {
    this.sub = sub;
  }

  public SubjectContext additionalContext(Map<String, String> additionalContext) {
    this.additionalContext = additionalContext;
    return this;
  }

  public SubjectContext putAdditionalContextItem(String key, String additionalContextItem) {
    if (this.additionalContext == null) {
      this.additionalContext = new HashMap<String, String>();
    }
    this.additionalContext.put(key, additionalContextItem);
    return this;
  }

   /**
   * Get additionalContext
   * @return additionalContext
  **/
  @Schema(description = "")
  public Map<String, String> getAdditionalContext() {
    return additionalContext;
  }

  public void setAdditionalContext(Map<String, String> additionalContext) {
    this.additionalContext = additionalContext;
  }

  public SubjectContext acct(String acct) {
    this.acct = acct;
    return this;
  }

   /**
   * Get acct
   * @return acct
  **/
  @Schema(description = "")
  public String getAcct() {
    return acct;
  }

  public void setAcct(String acct) {
    this.acct = acct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubjectContext subjectContext = (SubjectContext) o;
    return Objects.equals(this.sub, subjectContext.sub) &&
        Objects.equals(this.additionalContext, subjectContext.additionalContext) &&
        Objects.equals(this.acct, subjectContext.acct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sub, additionalContext, acct);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubjectContext {\n");
    
    sb.append("    sub: ").append(toIndentedString(sub)).append("\n");
    sb.append("    additionalContext: ").append(toIndentedString(additionalContext)).append("\n");
    sb.append("    acct: ").append(toIndentedString(acct)).append("\n");
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