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

/** Module */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class Module {
  @SerializedName("declaredAnnotations")
  private List<Annotation> declaredAnnotations = null;

  @SerializedName("named")
  private Boolean named = null;

  @SerializedName("classLoader")
  private ClassLoader classLoader = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("annotations")
  private List<Annotation> annotations = null;

  @SerializedName("descriptor")
  private ModuleDescriptor descriptor = null;

  @SerializedName("packages")
  private List<String> packages = null;

  @SerializedName("layer")
  private ModuleLayer layer = null;

  public Module declaredAnnotations(List<Annotation> declaredAnnotations) {
    this.declaredAnnotations = declaredAnnotations;
    return this;
  }

  public Module addDeclaredAnnotationsItem(Annotation declaredAnnotationsItem) {
    if (this.declaredAnnotations == null) {
      this.declaredAnnotations = new ArrayList<Annotation>();
    }
    this.declaredAnnotations.add(declaredAnnotationsItem);
    return this;
  }

  /**
   * Get declaredAnnotations
   *
   * @return declaredAnnotations
   */
  @Schema(description = "")
  public List<Annotation> getDeclaredAnnotations() {
    return declaredAnnotations;
  }

  public void setDeclaredAnnotations(List<Annotation> declaredAnnotations) {
    this.declaredAnnotations = declaredAnnotations;
  }

  public Module named(Boolean named) {
    this.named = named;
    return this;
  }

  /**
   * Get named
   *
   * @return named
   */
  @Schema(description = "")
  public Boolean isNamed() {
    return named;
  }

  public void setNamed(Boolean named) {
    this.named = named;
  }

  public Module classLoader(ClassLoader classLoader) {
    this.classLoader = classLoader;
    return this;
  }

  /**
   * Get classLoader
   *
   * @return classLoader
   */
  @Schema(description = "")
  public ClassLoader getClassLoader() {
    return classLoader;
  }

  public void setClassLoader(ClassLoader classLoader) {
    this.classLoader = classLoader;
  }

  public Module name(String name) {
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

  public Module annotations(List<Annotation> annotations) {
    this.annotations = annotations;
    return this;
  }

  public Module addAnnotationsItem(Annotation annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new ArrayList<Annotation>();
    }
    this.annotations.add(annotationsItem);
    return this;
  }

  /**
   * Get annotations
   *
   * @return annotations
   */
  @Schema(description = "")
  public List<Annotation> getAnnotations() {
    return annotations;
  }

  public void setAnnotations(List<Annotation> annotations) {
    this.annotations = annotations;
  }

  public Module descriptor(ModuleDescriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   *
   * @return descriptor
   */
  @Schema(description = "")
  public ModuleDescriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(ModuleDescriptor descriptor) {
    this.descriptor = descriptor;
  }

  public Module packages(List<String> packages) {
    this.packages = packages;
    return this;
  }

  public Module addPackagesItem(String packagesItem) {
    if (this.packages == null) {
      this.packages = new ArrayList<String>();
    }
    this.packages.add(packagesItem);
    return this;
  }

  /**
   * Get packages
   *
   * @return packages
   */
  @Schema(description = "")
  public List<String> getPackages() {
    return packages;
  }

  public void setPackages(List<String> packages) {
    this.packages = packages;
  }

  public Module layer(ModuleLayer layer) {
    this.layer = layer;
    return this;
  }

  /**
   * Get layer
   *
   * @return layer
   */
  @Schema(description = "")
  public ModuleLayer getLayer() {
    return layer;
  }

  public void setLayer(ModuleLayer layer) {
    this.layer = layer;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Module module = (Module) o;
    return Objects.equals(this.declaredAnnotations, module.declaredAnnotations)
        && Objects.equals(this.named, module.named)
        && Objects.equals(this.classLoader, module.classLoader)
        && Objects.equals(this.name, module.name)
        && Objects.equals(this.annotations, module.annotations)
        && Objects.equals(this.descriptor, module.descriptor)
        && Objects.equals(this.packages, module.packages)
        && Objects.equals(this.layer, module.layer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        declaredAnnotations, named, classLoader, name, annotations, descriptor, packages, layer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Module {\n");

    sb.append("    declaredAnnotations: ")
        .append(toIndentedString(declaredAnnotations))
        .append("\n");
    sb.append("    named: ").append(toIndentedString(named)).append("\n");
    sb.append("    classLoader: ").append(toIndentedString(classLoader)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    packages: ").append(toIndentedString(packages)).append("\n");
    sb.append("    layer: ").append(toIndentedString(layer)).append("\n");
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
