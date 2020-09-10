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

/**
 * Data collector registration object.&lt;br&gt;The supplied data collector is an OVA tool that
 * contains the credentials and protocols needed to create a connection between a data collector
 * appliance on a host vCenter and a vCenter-based cloud account. . The process of deploying data
 * collector is: &lt;br&gt; 1. Download the data collector ova from the
 * \&quot;ovaLink\&quot;.&lt;br&gt;2. Import the .ova file to the vCenter Server and start the
 * installation.&lt;br&gt; 3. When asked for the key, copy and use the \&quot;key\&quot;
 * provided.&lt;br&gt; 4. It takes a few minutes to detect your Data Collector after it is deployed
 * and powered on in vCenter.
 */
@Schema(
    description =
        "Data collector registration object.<br>The supplied data collector is an OVA tool that contains the credentials and protocols needed to create a connection between a data collector appliance on a host vCenter and a vCenter-based cloud account. . The process of deploying data collector is: <br> 1. Download the data collector ova from the \"ovaLink\".<br>2. Import the .ova file to the vCenter Server and start the installation.<br> 3. When asked for the key, copy and use the \"key\" provided.<br> 4. It takes a few minutes to detect your Data Collector after it is deployed and powered on in vCenter.")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class DataCollectorRegistration {
  @SerializedName("ovaLink")
  private String ovaLink = null;

  @SerializedName("key")
  private String key = null;

  public DataCollectorRegistration ovaLink(String ovaLink) {
    this.ovaLink = ovaLink;
    return this;
  }

  /**
   * Data collector OVA Link
   *
   * @return ovaLink
   */
  @Schema(
      example =
          "https://ci-data-collector.s3.amazonaws.com/VMware-Cloud-Services-Data-Collector.ova",
      required = true,
      description = "Data collector OVA Link")
  public String getOvaLink() {
    return ovaLink;
  }

  public void setOvaLink(String ovaLink) {
    this.ovaLink = ovaLink;
  }

  public DataCollectorRegistration key(String key) {
    this.key = key;
    return this;
  }

  /**
   * A registration key for the data collector
   *
   * @return key
   */
  @Schema(
      example = "eyJyZWdpc3RyYXRpb25VcmwiOiJodHRwczovL2Fw",
      required = true,
      description = "A registration key for the data collector")
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataCollectorRegistration dataCollectorRegistration = (DataCollectorRegistration) o;
    return Objects.equals(this.ovaLink, dataCollectorRegistration.ovaLink)
        && Objects.equals(this.key, dataCollectorRegistration.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ovaLink, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataCollectorRegistration {\n");

    sb.append("    ovaLink: ").append(toIndentedString(ovaLink)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
