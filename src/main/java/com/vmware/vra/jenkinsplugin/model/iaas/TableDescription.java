/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** TableDescription */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class TableDescription {
  @SerializedName("serviceDocumentDescription")
  private ServiceDocumentDescription serviceDocumentDescription = null;

  @SerializedName("documentKind")
  private String documentKind = null;

  @SerializedName("jpaEntity")
  private Boolean jpaEntity = null;

  @SerializedName("factoryLink")
  private String factoryLink = null;

  @SerializedName("tableName")
  private String tableName = null;

  public TableDescription serviceDocumentDescription(
      ServiceDocumentDescription serviceDocumentDescription) {
    this.serviceDocumentDescription = serviceDocumentDescription;
    return this;
  }

  /**
   * Get serviceDocumentDescription
   *
   * @return serviceDocumentDescription
   */
  @Schema(description = "")
  public ServiceDocumentDescription getServiceDocumentDescription() {
    return serviceDocumentDescription;
  }

  public void setServiceDocumentDescription(ServiceDocumentDescription serviceDocumentDescription) {
    this.serviceDocumentDescription = serviceDocumentDescription;
  }

  public TableDescription documentKind(String documentKind) {
    this.documentKind = documentKind;
    return this;
  }

  /**
   * Get documentKind
   *
   * @return documentKind
   */
  @Schema(description = "")
  public String getDocumentKind() {
    return documentKind;
  }

  public void setDocumentKind(String documentKind) {
    this.documentKind = documentKind;
  }

  public TableDescription jpaEntity(Boolean jpaEntity) {
    this.jpaEntity = jpaEntity;
    return this;
  }

  /**
   * Get jpaEntity
   *
   * @return jpaEntity
   */
  @Schema(description = "")
  public Boolean isJpaEntity() {
    return jpaEntity;
  }

  public void setJpaEntity(Boolean jpaEntity) {
    this.jpaEntity = jpaEntity;
  }

  public TableDescription factoryLink(String factoryLink) {
    this.factoryLink = factoryLink;
    return this;
  }

  /**
   * Get factoryLink
   *
   * @return factoryLink
   */
  @Schema(description = "")
  public String getFactoryLink() {
    return factoryLink;
  }

  public void setFactoryLink(String factoryLink) {
    this.factoryLink = factoryLink;
  }

  public TableDescription tableName(String tableName) {
    this.tableName = tableName;
    return this;
  }

  /**
   * Get tableName
   *
   * @return tableName
   */
  @Schema(description = "")
  public String getTableName() {
    return tableName;
  }

  public void setTableName(String tableName) {
    this.tableName = tableName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableDescription tableDescription = (TableDescription) o;
    return Objects.equals(
            this.serviceDocumentDescription, tableDescription.serviceDocumentDescription)
        && Objects.equals(this.documentKind, tableDescription.documentKind)
        && Objects.equals(this.jpaEntity, tableDescription.jpaEntity)
        && Objects.equals(this.factoryLink, tableDescription.factoryLink)
        && Objects.equals(this.tableName, tableDescription.tableName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        serviceDocumentDescription, documentKind, jpaEntity, factoryLink, tableName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableDescription {\n");

    sb.append("    serviceDocumentDescription: ")
        .append(toIndentedString(serviceDocumentDescription))
        .append("\n");
    sb.append("    documentKind: ").append(toIndentedString(documentKind)).append("\n");
    sb.append("    jpaEntity: ").append(toIndentedString(jpaEntity)).append("\n");
    sb.append("    factoryLink: ").append(toIndentedString(factoryLink)).append("\n");
    sb.append("    tableName: ").append(toIndentedString(tableName)).append("\n");
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
