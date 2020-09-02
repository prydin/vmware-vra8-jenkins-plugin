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
import net.virtualviking.vra.jenkinsplugin.model.iaas.Constraint;

/**
 * Represents fabric image description. Used when creating image profiles.
 */
@ApiModel(description = "Represents fabric image description. Used when creating image profiles.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class FabricImageDescription {
  @SerializedName("cloudConfig")
  private String cloudConfig = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("constraints")
  private List<Constraint> constraints = null;

  public FabricImageDescription cloudConfig(String cloudConfig) {
    this.cloudConfig = cloudConfig;
    return this;
  }

   /**
   * Cloud config for this image. This cloud config will be merged during provisioning with other cloud configurations such as the bootConfig provided in MachineSpecification.
   * @return cloudConfig
  **/
  @ApiModelProperty(example = "runcmd:   - [\"mkdir\", \"/imageFolder\"]", value = "Cloud config for this image. This cloud config will be merged during provisioning with other cloud configurations such as the bootConfig provided in MachineSpecification.")
  public String getCloudConfig() {
    return cloudConfig;
  }

  public void setCloudConfig(String cloudConfig) {
    this.cloudConfig = cloudConfig;
  }

  public FabricImageDescription name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Fabric image name. Valid if id not provided.
   * @return name
  **/
  @ApiModelProperty(example = "ami-ubuntu-16.04-1.9.1-00-1516139717", value = "Fabric image name. Valid if id not provided.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FabricImageDescription id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of the fabric image
   * @return id
  **/
  @ApiModelProperty(example = "9e49", value = "The id of the fabric image")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FabricImageDescription constraints(List<Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public FabricImageDescription addConstraintsItem(Constraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<Constraint>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraints that are used to drive placement policies for the image that is produced from this mapping.Constraint expressions are matched against tags on existing placement targets.
   * @return constraints
  **/
  @ApiModelProperty(example = "\"[{\\\"mandatory\\\" : \\\"true\\\", \\\"expression\\\": \\\"environment\\\":\\\"prod\\\"}, {\\\"mandatory\\\" : \\\"false\\\", \\\"expression\\\": \\\"pci\\\"}]\"", value = "Constraints that are used to drive placement policies for the image that is produced from this mapping.Constraint expressions are matched against tags on existing placement targets.")
  public List<Constraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<Constraint> constraints) {
    this.constraints = constraints;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FabricImageDescription fabricImageDescription = (FabricImageDescription) o;
    return Objects.equals(this.cloudConfig, fabricImageDescription.cloudConfig) &&
        Objects.equals(this.name, fabricImageDescription.name) &&
        Objects.equals(this.id, fabricImageDescription.id) &&
        Objects.equals(this.constraints, fabricImageDescription.constraints);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cloudConfig, name, id, constraints);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricImageDescription {\n");
    
    sb.append("    cloudConfig: ").append(toIndentedString(cloudConfig)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
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

