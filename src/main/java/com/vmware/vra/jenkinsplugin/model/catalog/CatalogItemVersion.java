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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Date;
import java.util.Objects;

/** Represents a version of a Catalog Item that can be requested by a consumer. */
@Schema(description = "Represents a version of a Catalog Item that can be requested by a consumer.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class CatalogItemVersion {
  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("formId")
  private String formId = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("schema")
  private Object schema = null;

  public CatalogItemVersion createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Created At
   *
   * @return createdAt
   */
  @Schema(description = "Created At")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public CatalogItemVersion description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description
   *
   * @return description
   */
  @Schema(description = "Description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CatalogItemVersion formId(String formId) {
    this.formId = formId;
    return this;
  }

  /**
   * Form ID
   *
   * @return formId
   */
  @Schema(description = "Form ID")
  public String getFormId() {
    return formId;
  }

  public void setFormId(String formId) {
    this.formId = formId;
  }

  public CatalogItemVersion id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Version ID
   *
   * @return id
   */
  @Schema(description = "Version ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CatalogItemVersion schema(Object schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Input Schema
   *
   * @return schema
   */
  @Schema(description = "Input Schema")
  public Object getSchema() {
    return schema;
  }

  public void setSchema(Object schema) {
    this.schema = schema;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemVersion catalogItemVersion = (CatalogItemVersion) o;
    return Objects.equals(this.createdAt, catalogItemVersion.createdAt)
        && Objects.equals(this.description, catalogItemVersion.description)
        && Objects.equals(this.formId, catalogItemVersion.formId)
        && Objects.equals(this.id, catalogItemVersion.id)
        && Objects.equals(this.schema, catalogItemVersion.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, description, formId, id, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemVersion {\n");

    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    formId: ").append(toIndentedString(formId)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
