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


package net.virtualviking.vra.jenkinsplugin.model.iaas;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import net.virtualviking.vra.jenkinsplugin.model.iaas.ClassLoader;
import net.virtualviking.vra.jenkinsplugin.model.iaas.ModelPackage;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Module;

/**
 * ClassLoader
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



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
   * @return parent
  **/
  @ApiModelProperty(value = "")
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
   * @return unnamedModule
  **/
  @ApiModelProperty(value = "")
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
   * @return name
  **/
  @ApiModelProperty(value = "")
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
   * @return registeredAsParallelCapable
  **/
  @ApiModelProperty(value = "")
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
   * @return definedPackages
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.parent, classLoader.parent) &&
        Objects.equals(this.unnamedModule, classLoader.unnamedModule) &&
        Objects.equals(this.name, classLoader.name) &&
        Objects.equals(this.registeredAsParallelCapable, classLoader.registeredAsParallelCapable) &&
        Objects.equals(this.definedPackages, classLoader.definedPackages);
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
    sb.append("    registeredAsParallelCapable: ").append(toIndentedString(registeredAsParallelCapable)).append("\n");
    sb.append("    definedPackages: ").append(toIndentedString(definedPackages)).append("\n");
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
