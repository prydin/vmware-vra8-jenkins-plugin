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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.vmware.vra.jenkinsplugin.model.catalog.Criteria;
import com.vmware.vra.jenkinsplugin.model.catalog.DataElement;
import com.vmware.vra.jenkinsplugin.model.catalog.PolicyStats;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
/**
 * A policy such as lease policy that will be enforced.
 */
@Schema(description = "A policy such as lease policy that will be enforced.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class Policy {
  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("criteria")
  private Criteria criteria = null;

  @SerializedName("definition")
  private Object definition = null;

  @SerializedName("definitionLegend")
  private Map<String, DataElement> definitionLegend = null;

  @SerializedName("description")
  private String description = null;

  /**
   * Defines enforcement type for policy. Default is HARD
   */
  @JsonAdapter(EnforcementTypeEnum.Adapter.class)
  public enum EnforcementTypeEnum {
    SOFT("SOFT"),
    HARD("HARD");

    private String value;

    EnforcementTypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static EnforcementTypeEnum fromValue(String text) {
      for (EnforcementTypeEnum b : EnforcementTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<EnforcementTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EnforcementTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EnforcementTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EnforcementTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("enforcementType")
  private EnforcementTypeEnum enforcementType = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("lastUpdatedAt")
  private Date lastUpdatedAt = null;

  @SerializedName("lastUpdatedBy")
  private String lastUpdatedBy = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("projectId")
  private String projectId = null;

  @SerializedName("statistics")
  private PolicyStats statistics = null;

  @SerializedName("typeId")
  private String typeId = null;

  public Policy createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public Policy createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

   /**
   * Get createdBy
   * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public Policy criteria(Criteria criteria) {
    this.criteria = criteria;
    return this;
  }

   /**
   * Get criteria
   * @return criteria
  **/
  @Schema(description = "")
  public Criteria getCriteria() {
    return criteria;
  }

  public void setCriteria(Criteria criteria) {
    this.criteria = criteria;
  }

  public Policy definition(Object definition) {
    this.definition = definition;
    return this;
  }

   /**
   * Get definition
   * @return definition
  **/
  @Schema(description = "")
  public Object getDefinition() {
    return definition;
  }

  public void setDefinition(Object definition) {
    this.definition = definition;
  }

  public Policy definitionLegend(Map<String, DataElement> definitionLegend) {
    this.definitionLegend = definitionLegend;
    return this;
  }

  public Policy putDefinitionLegendItem(String key, DataElement definitionLegendItem) {
    if (this.definitionLegend == null) {
      this.definitionLegend = new HashMap<String, DataElement>();
    }
    this.definitionLegend.put(key, definitionLegendItem);
    return this;
  }

   /**
   * Get definitionLegend
   * @return definitionLegend
  **/
  @Schema(description = "")
  public Map<String, DataElement> getDefinitionLegend() {
    return definitionLegend;
  }

  public void setDefinitionLegend(Map<String, DataElement> definitionLegend) {
    this.definitionLegend = definitionLegend;
  }

  public Policy description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Policy enforcementType(EnforcementTypeEnum enforcementType) {
    this.enforcementType = enforcementType;
    return this;
  }

   /**
   * Defines enforcement type for policy. Default is HARD
   * @return enforcementType
  **/
  @Schema(description = "Defines enforcement type for policy. Default is HARD")
  public EnforcementTypeEnum getEnforcementType() {
    return enforcementType;
  }

  public void setEnforcementType(EnforcementTypeEnum enforcementType) {
    this.enforcementType = enforcementType;
  }

  public Policy id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public Policy lastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

   /**
   * Get lastUpdatedAt
   * @return lastUpdatedAt
  **/
  @Schema(description = "")
  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public Policy lastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
    return this;
  }

   /**
   * Get lastUpdatedBy
   * @return lastUpdatedBy
  **/
  @Schema(description = "")
  public String getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(String lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }

  public Policy name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Policy orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

   /**
   * Get orgId
   * @return orgId
  **/
  @Schema(description = "")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public Policy projectId(String projectId) {
    this.projectId = projectId;
    return this;
  }

   /**
   * Get projectId
   * @return projectId
  **/
  @Schema(description = "")
  public String getProjectId() {
    return projectId;
  }

  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }

  public Policy statistics(PolicyStats statistics) {
    this.statistics = statistics;
    return this;
  }

   /**
   * Get statistics
   * @return statistics
  **/
  @Schema(description = "")
  public PolicyStats getStatistics() {
    return statistics;
  }

  public void setStatistics(PolicyStats statistics) {
    this.statistics = statistics;
  }

  public Policy typeId(String typeId) {
    this.typeId = typeId;
    return this;
  }

   /**
   * Get typeId
   * @return typeId
  **/
  @Schema(description = "")
  public String getTypeId() {
    return typeId;
  }

  public void setTypeId(String typeId) {
    this.typeId = typeId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Policy policy = (Policy) o;
    return Objects.equals(this.createdAt, policy.createdAt) &&
        Objects.equals(this.createdBy, policy.createdBy) &&
        Objects.equals(this.criteria, policy.criteria) &&
        Objects.equals(this.definition, policy.definition) &&
        Objects.equals(this.definitionLegend, policy.definitionLegend) &&
        Objects.equals(this.description, policy.description) &&
        Objects.equals(this.enforcementType, policy.enforcementType) &&
        Objects.equals(this.id, policy.id) &&
        Objects.equals(this.lastUpdatedAt, policy.lastUpdatedAt) &&
        Objects.equals(this.lastUpdatedBy, policy.lastUpdatedBy) &&
        Objects.equals(this.name, policy.name) &&
        Objects.equals(this.orgId, policy.orgId) &&
        Objects.equals(this.projectId, policy.projectId) &&
        Objects.equals(this.statistics, policy.statistics) &&
        Objects.equals(this.typeId, policy.typeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, createdBy, criteria, definition, definitionLegend, description, enforcementType, id, lastUpdatedAt, lastUpdatedBy, name, orgId, projectId, statistics, typeId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Policy {\n");
    
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    criteria: ").append(toIndentedString(criteria)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    definitionLegend: ").append(toIndentedString(definitionLegend)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enforcementType: ").append(toIndentedString(enforcementType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    lastUpdatedBy: ").append(toIndentedString(lastUpdatedBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    typeId: ").append(toIndentedString(typeId)).append("\n");
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