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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;

/** ResourceType */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class ResourceType {
  @SerializedName("accountType")
  private AccountTypeEnum accountType = null;
  @SerializedName("composable")
  private Boolean composable = null;
  @SerializedName("createdAt")
  private Date createdAt = null;
  @SerializedName("createdBy")
  private String createdBy = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("displayName")
  private String displayName = null;
  @SerializedName("id")
  private String id = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("orgId")
  private String orgId = null;
  @SerializedName("projectId")
  private String projectId = null;
  @SerializedName("providerId")
  private String providerId = null;
  @SerializedName("schema")
  private Object schema = null;
  @SerializedName("updatedAt")
  private Date updatedAt = null;
  @SerializedName("updatedBy")
  private String updatedBy = null;

  public ResourceType accountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
    return this;
  }

  /**
   * Optional. Account type to which the resource type belongs to. Example: AWS, Azure etc
   *
   * @return accountType
   */
  @Schema(
      description =
          "Optional. Account type to which the resource type belongs to. Example: AWS, Azure etc")
  public AccountTypeEnum getAccountType() {
    return accountType;
  }

  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }

  public ResourceType composable(Boolean composable) {
    this.composable = composable;
    return this;
  }

  /**
   * Composable with other types or not
   *
   * @return composable
   */
  @Schema(description = "Composable with other types or not")
  public Boolean isComposable() {
    return composable;
  }

  public void setComposable(Boolean composable) {
    this.composable = composable;
  }

  public ResourceType createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time at which the resource type was created.
   *
   * @return createdAt
   */
  @Schema(description = "Time at which the resource type was created.")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public ResourceType createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Name of the user who created the resource type.
   *
   * @return createdBy
   */
  @Schema(description = "Name of the user who created the resource type.")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public ResourceType description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Resource type description
   *
   * @return description
   */
  @Schema(description = "Resource type description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ResourceType displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Resource display name
   *
   * @return displayName
   */
  @Schema(description = "Resource display name")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public ResourceType id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Resource type id
   *
   * @return id
   */
  @Schema(description = "Resource type id")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ResourceType name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Resource type name
   *
   * @return name
   */
  @Schema(description = "Resource type name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ResourceType orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Org ID where resource type belongs
   *
   * @return orgId
   */
  @Schema(description = "Org ID where resource type belongs")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public ResourceType projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Project ID where resource type belongs
   *
   * @return projectId
   */
  @Schema(description = "Project ID where resource type belongs")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public ResourceType providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Provider Id
   *
   * @return providerId
   */
  @Schema(description = "Provider Id")
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  public ResourceType schema(Object schema) {
    this.schema = schema;
    return this;
  }

  /**
   * Resource type schema
   *
   * @return schema
   */
  @Schema(description = "Resource type schema")
  public Object getSchema() {
    return schema;
  }

  public void setSchema(Object schema) {
    this.schema = schema;
  }

  public ResourceType updatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time at which the resource type was updated.
   *
   * @return updatedAt
   */
  @Schema(description = "Time at which the resource type was updated.")
  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  public ResourceType updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * Name of the user who updated the resource type.
   *
   * @return updatedBy
   */
  @Schema(description = "Name of the user who updated the resource type.")
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceType resourceType = (ResourceType) o;
    return Objects.equals(this.accountType, resourceType.accountType)
        && Objects.equals(this.composable, resourceType.composable)
        && Objects.equals(this.createdAt, resourceType.createdAt)
        && Objects.equals(this.createdBy, resourceType.createdBy)
        && Objects.equals(this.description, resourceType.description)
        && Objects.equals(this.displayName, resourceType.displayName)
        && Objects.equals(this.id, resourceType.id)
        && Objects.equals(this.name, resourceType.name)
        && Objects.equals(this.orgId, resourceType.orgId)
        && Objects.equals(this.projectId, resourceType.projectId)
        && Objects.equals(this.providerId, resourceType.providerId)
        && Objects.equals(this.schema, resourceType.schema)
        && Objects.equals(this.updatedAt, resourceType.updatedAt)
        && Objects.equals(this.updatedBy, resourceType.updatedBy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        accountType,
        composable,
        createdAt,
        createdBy,
        description,
        displayName,
        id,
        name,
        orgId,
        projectId,
        providerId,
        schema,
        updatedAt,
        updatedBy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceType {\n");

    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    composable: ").append(toIndentedString(composable)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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

  /** Optional. Account type to which the resource type belongs to. Example: AWS, Azure etc */
  @JsonAdapter(AccountTypeEnum.Adapter.class)
  public enum AccountTypeEnum {
    AWS("AWS"),
    AZURE("Azure"),
    GCP("GCP"),
    VSPHERE("vSphere"),
    VSPHERE_CLOUD("vSphere-cloud"),
    AZURE_EA("Azure-EA"),
    NSX_V("NSX-V"),
    NSX_T("NSX-T"),
    NSX_P("NSX-P"),
    NSX_P_CLOUD("NSX-P-cloud"),
    VCLOUD_DIRECTOR("vCloud Director"),
    VMC("VMC"),
    PUPPET("Puppet"),
    ANSIBLE("Ansible");

    private String value;

    AccountTypeEnum(String value) {
      this.value = value;
    }

    public static AccountTypeEnum fromValue(String text) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static class Adapter extends TypeAdapter<AccountTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccountTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccountTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccountTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }
}
