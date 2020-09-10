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

/** ClassLoader */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class ClassLoader {
  @SerializedName("parent")
  private ClassLoader parent = null;

  @SerializedName("unnamedModule")
  private Module unnamedModule = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("registeredAsParallelCapable")
  private Boolean registeredAsParallelCapable = null;

  @SerializedName("definedPackages")
  private List<ModelPackage> definedPackages = null;

  public ClassLoader parent(ClassLoader parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   *
   * @return parent
   */
  @Schema(description = "")
  public ClassLoader getParent() {
    return parent;
  }

  public void setParent(ClassLoader parent) {
    this.parent = parent;
  }

  public ClassLoader unnamedModule(Module unnamedModule) {
    this.unnamedModule = unnamedModule;
    return this;
  }

  /**
   * Get unnamedModule
   *
   * @return unnamedModule
   */
  @Schema(description = "")
  public Module getUnnamedModule() {
    return unnamedModule;
  }

  public void setUnnamedModule(Module unnamedModule) {
    this.unnamedModule = unnamedModule;
  }

  public ClassLoader name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ClassLoader registeredAsParallelCapable(Boolean registeredAsParallelCapable) {
    this.registeredAsParallelCapable = registeredAsParallelCapable;
    return this;
  }

  /**
   * Get registeredAsParallelCapable
   *
   * @return registeredAsParallelCapable
   */
  @Schema(description = "")
  public Boolean isRegisteredAsParallelCapable() {
    return registeredAsParallelCapable;
  }

  public void setRegisteredAsParallelCapable(Boolean registeredAsParallelCapable) {
    this.registeredAsParallelCapable = registeredAsParallelCapable;
  }

  public ClassLoader definedPackages(List<ModelPackage> definedPackages) {
    this.definedPackages = definedPackages;
    return this;
  }

  public ClassLoader addDefinedPackagesItem(ModelPackage definedPackagesItem) {
    if (this.definedPackages == null) {
      this.definedPackages = new ArrayList<ModelPackage>();
    }
    this.definedPackages.add(definedPackagesItem);
    return this;
  }

  /**
   * Get definedPackages
   *
   * @return definedPackages
   */
  @Schema(description = "")
  public List<ModelPackage> getDefinedPackages() {
    return definedPackages;
  }

  public void setDefinedPackages(List<ModelPackage> definedPackages) {
    this.definedPackages = definedPackages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClassLoader classLoader = (ClassLoader) o;
    return Objects.equals(this.parent, classLoader.parent)
        && Objects.equals(this.unnamedModule, classLoader.unnamedModule)
        && Objects.equals(this.name, classLoader.name)
        && Objects.equals(this.registeredAsParallelCapable, classLoader.registeredAsParallelCapable)
        && Objects.equals(this.definedPackages, classLoader.definedPackages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, unnamedModule, name, registeredAsParallelCapable, definedPackages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClassLoader {\n");

    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    unnamedModule: ").append(toIndentedString(unnamedModule)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    registeredAsParallelCapable: ")
        .append(toIndentedString(registeredAsParallelCapable))
        .append("\n");
    sb.append("    definedPackages: ").append(toIndentedString(definedPackages)).append("\n");
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
