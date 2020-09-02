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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Rule;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * Specification for a cloud security group
 */
@ApiModel(description = "Specification for a cloud security group")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class SecurityGroupSpecification {
  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("rules")
  private List<Rule> rules = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  public SecurityGroupSpecification customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public SecurityGroupSpecification putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Additional custom properties that may be used to extend the group.
   * @return customProperties
  **/
  @ApiModelProperty(value = "Additional custom properties that may be used to extend the group.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public SecurityGroupSpecification deploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
    return this;
  }

   /**
   * The id of the deployment that is associated with this resource
   * @return deploymentId
  **/
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "The id of the deployment that is associated with this resource")
  public String getDeploymentId() {
    return deploymentId;
  }

  public void setDeploymentId(String deploymentId) {
    this.deploymentId = deploymentId;
  }

  public SecurityGroupSpecification name(String name) {
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

  public SecurityGroupSpecification description(String description) {
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

  public SecurityGroupSpecification rules(List<Rule> rules) {
    this.rules = rules;
    return this;
  }

  public SecurityGroupSpecification addRulesItem(Rule rulesItem) {
    if (this.rules == null) {
      this.rules = new ArrayList<Rule>();
    }
    this.rules.add(rulesItem);
    return this;
  }

   /**
   * List of security rules.
   * @return rules
  **/
  @ApiModelProperty(value = "List of security rules.")
  public List<Rule> getRules() {
    return rules;
  }

  public void setRules(List<Rule> rules) {
    this.rules = rules;
  }

  public SecurityGroupSpecification projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * The id of the project the current user belongs to.
   * @return projectId
  **/
  @ApiModelProperty(example = "e058", required = true, value = "The id of the project the current user belongs to.")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public SecurityGroupSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityGroupSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values that should be set on any resource that is produced from this specification.
   * @return tags
  **/
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"group\\\", \\\"value\\\": \\\"ssh\\\" } ]\"", value = "A set of tag keys and optional values that should be set on any resource that is produced from this specification.")
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
    SecurityGroupSpecification securityGroupSpecification = (SecurityGroupSpecification) o;
    return Objects.equals(this.customProperties, securityGroupSpecification.customProperties) &&
        Objects.equals(this.deploymentId, securityGroupSpecification.deploymentId) &&
        Objects.equals(this.name, securityGroupSpecification.name) &&
        Objects.equals(this.description, securityGroupSpecification.description) &&
        Objects.equals(this.rules, securityGroupSpecification.rules) &&
        Objects.equals(this.projectId, securityGroupSpecification.projectId) &&
        Objects.equals(this.tags, securityGroupSpecification.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customProperties, deploymentId, name, description, rules, projectId, tags);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityGroupSpecification {\n");
    
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
