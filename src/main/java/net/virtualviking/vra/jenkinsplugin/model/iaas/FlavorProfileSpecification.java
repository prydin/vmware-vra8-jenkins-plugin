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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.virtualviking.vra.jenkinsplugin.model.iaas.FabricFlavorDescription;

/**
 * Specification for flavor profile
 */
@ApiModel(description = "Specification for flavor profile")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class FlavorProfileSpecification {
  @SerializedName("regionId")
  private String regionId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("flavorMapping")
  private Map<String, FabricFlavorDescription> flavorMapping = new HashMap<String, FabricFlavorDescription>();

  public FlavorProfileSpecification regionId(String regionId) {
    this.regionId = regionId;
    return this;
  }

   /**
   * The id of the region for which this profile is created
   * @return regionId
  **/
  @ApiModelProperty(example = "9e49", required = true, value = "The id of the region for which this profile is created")
  public String getRegionId() {
    return regionId;
  }

  public void setRegionId(String regionId) {
    this.regionId = regionId;
  }

  public FlavorProfileSpecification name(String name) {
    this.name = name;
    return this;
  }

   /**
   * A human-friendly name used as an identifier in APIs that support this option.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FlavorProfileSpecification description(String description) {
    this.description = description;
    return this;
  }

   /**
   * A human-friendly description.
   * @return description
  **/
  @ApiModelProperty(value = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public FlavorProfileSpecification flavorMapping(Map<String, FabricFlavorDescription> flavorMapping) {
    this.flavorMapping = flavorMapping;
    return this;
  }

  public FlavorProfileSpecification putFlavorMappingItem(String key, FabricFlavorDescription flavorMappingItem) {
    this.flavorMapping.put(key, flavorMappingItem);
    return this;
  }

   /**
   * Map between global fabric flavor keys &lt;String&gt; and fabric flavor descriptions &lt;FabricFlavorDescription&gt; 
   * @return flavorMapping
  **/
  @ApiModelProperty(example = "\"{ \\\"small\\\": { \\\"name\\\": \\\"t2.small\\\" }, \\\"medium\\\": { \\\"name\\\": \\\"t2.medium\\\"}}, \\\"vSphere_small\\\": { \\\"cpuCount\\\": \\\"2\\\", \\\"memoryInMB\\\": \\\"2048\\\"}, \\\"vSphere_medium\\\": { \\\"cpuCount\\\": \\\"4\\\", \\\"memoryInMB\\\": \\\"4096\\\"}}\"", required = true, value = "Map between global fabric flavor keys <String> and fabric flavor descriptions <FabricFlavorDescription> ")
  public Map<String, FabricFlavorDescription> getFlavorMapping() {
    return flavorMapping;
  }

  public void setFlavorMapping(Map<String, FabricFlavorDescription> flavorMapping) {
    this.flavorMapping = flavorMapping;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlavorProfileSpecification flavorProfileSpecification = (FlavorProfileSpecification) o;
    return Objects.equals(this.regionId, flavorProfileSpecification.regionId) &&
        Objects.equals(this.name, flavorProfileSpecification.name) &&
        Objects.equals(this.description, flavorProfileSpecification.description) &&
        Objects.equals(this.flavorMapping, flavorProfileSpecification.flavorMapping);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionId, name, description, flavorMapping);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlavorProfileSpecification {\n");
    
    sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    flavorMapping: ").append(toIndentedString(flavorMapping)).append("\n");
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

