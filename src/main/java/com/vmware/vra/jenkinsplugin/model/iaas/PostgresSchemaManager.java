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
import com.vmware.vra.jenkinsplugin.model.iaas.PostgresLiquibaseSnapshot;
import com.vmware.vra.jenkinsplugin.model.iaas.TableDescription;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * PostgresSchemaManager
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class PostgresSchemaManager {
  @SerializedName("tableDescriptions")
  private List<TableDescription> tableDescriptions = null;

  @SerializedName("snapshot")
  private PostgresLiquibaseSnapshot snapshot = null;

  public PostgresSchemaManager tableDescriptions(List<TableDescription> tableDescriptions) {
    this.tableDescriptions = tableDescriptions;
    return this;
  }

  public PostgresSchemaManager addTableDescriptionsItem(TableDescription tableDescriptionsItem) {
    if (this.tableDescriptions == null) {
      this.tableDescriptions = new ArrayList<TableDescription>();
    }
    this.tableDescriptions.add(tableDescriptionsItem);
    return this;
  }

   /**
   * Get tableDescriptions
   * @return tableDescriptions
  **/
  @Schema(description = "")
  public List<TableDescription> getTableDescriptions() {
    return tableDescriptions;
  }

  public void setTableDescriptions(List<TableDescription> tableDescriptions) {
    this.tableDescriptions = tableDescriptions;
  }

  public PostgresSchemaManager snapshot(PostgresLiquibaseSnapshot snapshot) {
    this.snapshot = snapshot;
    return this;
  }

   /**
   * Get snapshot
   * @return snapshot
  **/
  @Schema(description = "")
  public PostgresLiquibaseSnapshot getSnapshot() {
    return snapshot;
  }

  public void setSnapshot(PostgresLiquibaseSnapshot snapshot) {
    this.snapshot = snapshot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostgresSchemaManager postgresSchemaManager = (PostgresSchemaManager) o;
    return Objects.equals(this.tableDescriptions, postgresSchemaManager.tableDescriptions) &&
        Objects.equals(this.snapshot, postgresSchemaManager.snapshot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tableDescriptions, snapshot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostgresSchemaManager {\n");
    
    sb.append("    tableDescriptions: ").append(toIndentedString(tableDescriptions)).append("\n");
    sb.append("    snapshot: ").append(toIndentedString(snapshot)).append("\n");
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