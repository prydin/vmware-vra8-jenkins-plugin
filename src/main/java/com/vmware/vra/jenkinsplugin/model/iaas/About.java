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

/** State object representing an about page that includes api versioning information */
@Schema(
    description =
        "State object representing an about page that includes api versioning information")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class About {
  @SerializedName("supportedApis")
  private List<ApiDescription> supportedApis = new ArrayList<ApiDescription>();

  @SerializedName("latestApiVersion")
  private String latestApiVersion = null;

  public About supportedApis(List<ApiDescription> supportedApis) {
    this.supportedApis = supportedApis;
    return this;
  }

  public About addSupportedApisItem(ApiDescription supportedApisItem) {
    this.supportedApis.add(supportedApisItem);
    return this;
  }

  /**
   * A collection of all currently supported api versions.
   *
   * @return supportedApis
   */
  @Schema(required = true, description = "A collection of all currently supported api versions.")
  public List<ApiDescription> getSupportedApis() {
    return supportedApis;
  }

  public void setSupportedApis(List<ApiDescription> supportedApis) {
    this.supportedApis = supportedApis;
  }

  public About latestApiVersion(String latestApiVersion) {
    this.latestApiVersion = latestApiVersion;
    return this;
  }

  /**
   * The latest version of the API in yyyy-MM-dd format (UTC).
   *
   * @return latestApiVersion
   */
  @Schema(
      required = true,
      description = "The latest version of the API in yyyy-MM-dd format (UTC).")
  public String getLatestApiVersion() {
    return latestApiVersion;
  }

  public void setLatestApiVersion(String latestApiVersion) {
    this.latestApiVersion = latestApiVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    About about = (About) o;
    return Objects.equals(this.supportedApis, about.supportedApis)
        && Objects.equals(this.latestApiVersion, about.latestApiVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(supportedApis, latestApiVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class About {\n");

    sb.append("    supportedApis: ").append(toIndentedString(supportedApis)).append("\n");
    sb.append("    latestApiVersion: ").append(toIndentedString(latestApiVersion)).append("\n");
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
