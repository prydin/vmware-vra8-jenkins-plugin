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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** Represents a resource day-two request */
@Schema(description = "Represents a resource day-two request")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class ResourceActionRequest {
  @SerializedName("actionId")
  private String actionId = null;

  @SerializedName("inputs")
  private Object inputs = null;

  @SerializedName("reason")
  private String reason = null;

  public ResourceActionRequest actionId(String actionId) {
    this.actionId = actionId;
    return this;
  }

  /**
   * The id of the action to perform.
   *
   * @return actionId
   */
  @Schema(description = "The id of the action to perform.")
  public String getActionId() {
    return actionId;
  }

  public void setActionId(String actionId) {
    this.actionId = actionId;
  }

  public ResourceActionRequest inputs(Object inputs) {
    this.inputs = inputs;
    return this;
  }

  /**
   * Resource action request inputs
   *
   * @return inputs
   */
  @Schema(description = "Resource action request inputs")
  public Object getInputs() {
    return inputs;
  }

  public void setInputs(Object inputs) {
    this.inputs = inputs;
  }

  public ResourceActionRequest reason(String reason) {
    this.reason = reason;
    return this;
  }

  /**
   * Reason for requesting a day2 operation
   *
   * @return reason
   */
  @Schema(description = "Reason for requesting a day2 operation")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResourceActionRequest resourceActionRequest = (ResourceActionRequest) o;
    return Objects.equals(this.actionId, resourceActionRequest.actionId)
        && Objects.equals(this.inputs, resourceActionRequest.inputs)
        && Objects.equals(this.reason, resourceActionRequest.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionId, inputs, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResourceActionRequest {\n");

    sb.append("    actionId: ").append(toIndentedString(actionId)).append("\n");
    sb.append("    inputs: ").append(toIndentedString(inputs)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
