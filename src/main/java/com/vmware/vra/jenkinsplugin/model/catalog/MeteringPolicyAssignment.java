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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/** Pricing card assignment for project/cloud zone */
@Schema(description = "Pricing card assignment for project/cloud zone")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class MeteringPolicyAssignment {
  @SerializedName("createdAt")
  private Date createdAt = null;

  @SerializedName("entityId")
  private String entityId = null;

  @SerializedName("entityName")
  private String entityName = null;

  /** Pricing card assigned entity type */
  @JsonAdapter(EntityTypeEnum.Adapter.class)
  public enum EntityTypeEnum {
    ALL("ALL"),
    PROJECT("PROJECT"),
    CLOUDZONE("CLOUDZONE");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static EntityTypeEnum fromValue(String text) {
      for (EntityTypeEnum b : EntityTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<EntityTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final EntityTypeEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public EntityTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return EntityTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("entityType")
  private EntityTypeEnum entityType = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("lastUpdatedAt")
  private Date lastUpdatedAt = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("pricingCardId")
  private UUID pricingCardId = null;

  @SerializedName("pricingCardName")
  private String pricingCardName = null;

  public MeteringPolicyAssignment createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Creation time
   *
   * @return createdAt
   */
  @Schema(description = "Creation time")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public MeteringPolicyAssignment entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }

  /**
   * Pricing card assigned entity id
   *
   * @return entityId
   */
  @Schema(description = "Pricing card assigned entity id")
  public String getEntityId() {
    return entityId;
  }

  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }

  public MeteringPolicyAssignment entityName(String entityName) {
    this.entityName = entityName;
    return this;
  }

  /**
   * Pricing card assigned entity name
   *
   * @return entityName
   */
  @Schema(description = "Pricing card assigned entity name")
  public String getEntityName() {
    return entityName;
  }

  public void setEntityName(String entityName) {
    this.entityName = entityName;
  }

  public MeteringPolicyAssignment entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }

  /**
   * Pricing card assigned entity type
   *
   * @return entityType
   */
  @Schema(description = "Pricing card assigned entity type")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  public MeteringPolicyAssignment id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Id of the pricingCardAssignment
   *
   * @return id
   */
  @Schema(description = "Id of the pricingCardAssignment")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MeteringPolicyAssignment lastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * Updated time
   *
   * @return lastUpdatedAt
   */
  @Schema(description = "Updated time")
  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public MeteringPolicyAssignment orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * OrgId of the pricingCardAssignment
   *
   * @return orgId
   */
  @Schema(description = "OrgId of the pricingCardAssignment")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public MeteringPolicyAssignment pricingCardId(UUID pricingCardId) {
    this.pricingCardId = pricingCardId;
    return this;
  }

  /**
   * Pricing card id
   *
   * @return pricingCardId
   */
  @Schema(description = "Pricing card id")
  public UUID getPricingCardId() {
    return pricingCardId;
  }

  public void setPricingCardId(UUID pricingCardId) {
    this.pricingCardId = pricingCardId;
  }

  public MeteringPolicyAssignment pricingCardName(String pricingCardName) {
    this.pricingCardName = pricingCardName;
    return this;
  }

  /**
   * Pricing card name
   *
   * @return pricingCardName
   */
  @Schema(description = "Pricing card name")
  public String getPricingCardName() {
    return pricingCardName;
  }

  public void setPricingCardName(String pricingCardName) {
    this.pricingCardName = pricingCardName;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteringPolicyAssignment meteringPolicyAssignment = (MeteringPolicyAssignment) o;
    return Objects.equals(this.createdAt, meteringPolicyAssignment.createdAt)
        && Objects.equals(this.entityId, meteringPolicyAssignment.entityId)
        && Objects.equals(this.entityName, meteringPolicyAssignment.entityName)
        && Objects.equals(this.entityType, meteringPolicyAssignment.entityType)
        && Objects.equals(this.id, meteringPolicyAssignment.id)
        && Objects.equals(this.lastUpdatedAt, meteringPolicyAssignment.lastUpdatedAt)
        && Objects.equals(this.orgId, meteringPolicyAssignment.orgId)
        && Objects.equals(this.pricingCardId, meteringPolicyAssignment.pricingCardId)
        && Objects.equals(this.pricingCardName, meteringPolicyAssignment.pricingCardName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        entityId,
        entityName,
        entityType,
        id,
        lastUpdatedAt,
        orgId,
        pricingCardId,
        pricingCardName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteringPolicyAssignment {\n");

    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    entityName: ").append(toIndentedString(entityName)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    pricingCardId: ").append(toIndentedString(pricingCardId)).append("\n");
    sb.append("    pricingCardName: ").append(toIndentedString(pricingCardName)).append("\n");
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
