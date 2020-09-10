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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** UpdateCloudAccountNsxVSpecification */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class UpdateCloudAccountNsxVSpecification {
  @SerializedName("associatedCloudAccountIds")
  private List<String> associatedCloudAccountIds = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public UpdateCloudAccountNsxVSpecification associatedCloudAccountIds(
      List<String> associatedCloudAccountIds) {
    this.associatedCloudAccountIds = associatedCloudAccountIds;
    return this;
  }

  public UpdateCloudAccountNsxVSpecification addAssociatedCloudAccountIdsItem(
      String associatedCloudAccountIdsItem) {
    if (this.associatedCloudAccountIds == null) {
      this.associatedCloudAccountIds = new ArrayList<String>();
    }
    this.associatedCloudAccountIds.add(associatedCloudAccountIdsItem);
    return this;
  }

  /**
   * vSphere cloud account associated with this NSX-V cloud account. NSX-V cloud account can be
   * associated with a single vSphere cloud account.
   *
   * @return associatedCloudAccountIds
   */
  @Schema(
      example = "[ \"42f3e0d199d134755684cd935435a\" ]",
      description =
          "vSphere cloud account associated with this NSX-V cloud account. NSX-V cloud account can be associated with a single vSphere cloud account.")
  public List<String> getAssociatedCloudAccountIds() {
    return associatedCloudAccountIds;
  }

  public void setAssociatedCloudAccountIds(List<String> associatedCloudAccountIds) {
    this.associatedCloudAccountIds = associatedCloudAccountIds;
  }

  public UpdateCloudAccountNsxVSpecification name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UpdateCloudAccountNsxVSpecification description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-friendly description.
   *
   * @return description
   */
  @Schema(description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public UpdateCloudAccountNsxVSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public UpdateCloudAccountNsxVSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A set of tag keys and optional values to set on the Cloud Account
   *
   * @return tags
   */
  @Schema(
      example = "[{\"key\": \"env\", \"value\": \"dev\"}]",
      description = "A set of tag keys and optional values to set on the Cloud Account")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCloudAccountNsxVSpecification updateCloudAccountNsxVSpecification =
        (UpdateCloudAccountNsxVSpecification) o;
    return Objects.equals(
            this.associatedCloudAccountIds,
            updateCloudAccountNsxVSpecification.associatedCloudAccountIds)
        && Objects.equals(this.name, updateCloudAccountNsxVSpecification.name)
        && Objects.equals(this.description, updateCloudAccountNsxVSpecification.description)
        && Objects.equals(this.tags, updateCloudAccountNsxVSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(associatedCloudAccountIds, name, description, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCloudAccountNsxVSpecification {\n");

    sb.append("    associatedCloudAccountIds: ")
        .append(toIndentedString(associatedCloudAccountIds))
        .append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
