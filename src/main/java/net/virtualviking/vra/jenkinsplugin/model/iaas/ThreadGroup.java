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
import net.virtualviking.vra.jenkinsplugin.model.iaas.ThreadGroup;

/**
 * ThreadGroup
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class ThreadGroup {
  @SerializedName("parent")
  private ThreadGroup parent = null;

  @SerializedName("maxPriority")
  private Integer maxPriority = null;

  @SerializedName("destroyed")
  private Boolean destroyed = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("daemon")
  private Boolean daemon = null;

  public ThreadGroup parent(ThreadGroup parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  @ApiModelProperty(value = "")
  public ThreadGroup getParent() {
    return parent;
  }

  public void setParent(ThreadGroup parent) {
    this.parent = parent;
  }

  public ThreadGroup maxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
    return this;
  }

   /**
   * Get maxPriority
   * @return maxPriority
  **/
  @ApiModelProperty(value = "")
  public Integer getMaxPriority() {
    return maxPriority;
  }

  public void setMaxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
  }

  public ThreadGroup destroyed(Boolean destroyed) {
    this.destroyed = destroyed;
    return this;
  }

   /**
   * Get destroyed
   * @return destroyed
  **/
  @ApiModelProperty(value = "")
  public Boolean isDestroyed() {
    return destroyed;
  }

  public void setDestroyed(Boolean destroyed) {
    this.destroyed = destroyed;
  }

  public ThreadGroup name(String name) {
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

  public ThreadGroup daemon(Boolean daemon) {
    this.daemon = daemon;
    return this;
  }

   /**
   * Get daemon
   * @return daemon
  **/
  @ApiModelProperty(value = "")
  public Boolean isDaemon() {
    return daemon;
  }

  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadGroup threadGroup = (ThreadGroup) o;
    return Objects.equals(this.parent, threadGroup.parent) &&
        Objects.equals(this.maxPriority, threadGroup.maxPriority) &&
        Objects.equals(this.destroyed, threadGroup.destroyed) &&
        Objects.equals(this.name, threadGroup.name) &&
        Objects.equals(this.daemon, threadGroup.daemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, maxPriority, destroyed, name, daemon);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadGroup {\n");
    
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    maxPriority: ").append(toIndentedString(maxPriority)).append("\n");
    sb.append("    destroyed: ").append(toIndentedString(destroyed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
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

