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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

/** MeteringPolicy */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class MeteringPolicy {
  @SerializedName("chargeModel")
  private ChargeModelEnum chargeModel = null;
  @SerializedName("createdAt")
  private Date createdAt = null;
  @SerializedName("createdBy")
  private String createdBy = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("fixedPrice")
  private FixedPrice fixedPrice = null;
  @SerializedName("id")
  private UUID id = null;
  @SerializedName("lastUpdatedAt")
  private Date lastUpdatedAt = null;
  @SerializedName("meteringItems")
  private List<MeteringItem> meteringItems = null;
  @SerializedName("name")
  private String name = null;
  @SerializedName("namedMeteringItems")
  private List<NamedMeteringItem> namedMeteringItems = null;
  @SerializedName("oneTimeMeteringItems")
  private List<OneTimeMeteringItem> oneTimeMeteringItems = null;
  @SerializedName("orgId")
  private String orgId = null;
  @SerializedName("pricingCardAssignmentInfo")
  private MeteringPolicyAssignmentInfo pricingCardAssignmentInfo = null;
  @SerializedName("tagBasedMeteringItems")
  private List<TagBasedMeteringItem> tagBasedMeteringItems = null;
  @SerializedName("tagBasedOneTimeMeteringItems")
  private List<TagBasedOneTimeMeteringItem> tagBasedOneTimeMeteringItems = null;
  @SerializedName("tagBasedRateFactorItems")
  private List<TagBasedRateFactorItem> tagBasedRateFactorItems = null;

  public MeteringPolicy chargeModel(ChargeModelEnum chargeModel) {
    this.chargeModel = chargeModel;
    return this;
  }

  /**
   * Get chargeModel
   *
   * @return chargeModel
   */
  @Schema(description = "")
  public ChargeModelEnum getChargeModel() {
    return chargeModel;
  }

  public void setChargeModel(ChargeModelEnum chargeModel) {
    this.chargeModel = chargeModel;
  }

  public MeteringPolicy createdAt(Date createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   *
   * @return createdAt
   */
  @Schema(description = "")
  public Date getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public MeteringPolicy createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * Get createdBy
   *
   * @return createdBy
   */
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public MeteringPolicy description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   *
   * @return description
   */
  @Schema(description = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MeteringPolicy fixedPrice(FixedPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
    return this;
  }

  /**
   * Get fixedPrice
   *
   * @return fixedPrice
   */
  @Schema(description = "")
  public FixedPrice getFixedPrice() {
    return fixedPrice;
  }

  public void setFixedPrice(FixedPrice fixedPrice) {
    this.fixedPrice = fixedPrice;
  }

  public MeteringPolicy id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   *
   * @return id
   */
  @Schema(description = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public MeteringPolicy lastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
    return this;
  }

  /**
   * Get lastUpdatedAt
   *
   * @return lastUpdatedAt
   */
  @Schema(description = "")
  public Date getLastUpdatedAt() {
    return lastUpdatedAt;
  }

  public void setLastUpdatedAt(Date lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public MeteringPolicy meteringItems(List<MeteringItem> meteringItems) {
    this.meteringItems = meteringItems;
    return this;
  }

  public MeteringPolicy addMeteringItemsItem(MeteringItem meteringItemsItem) {
    if (this.meteringItems == null) {
      this.meteringItems = new ArrayList<MeteringItem>();
    }
    this.meteringItems.add(meteringItemsItem);
    return this;
  }

  /**
   * Get meteringItems
   *
   * @return meteringItems
   */
  @Schema(description = "")
  public List<MeteringItem> getMeteringItems() {
    return meteringItems;
  }

  public void setMeteringItems(List<MeteringItem> meteringItems) {
    this.meteringItems = meteringItems;
  }

  public MeteringPolicy name(String name) {
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

  public MeteringPolicy namedMeteringItems(List<NamedMeteringItem> namedMeteringItems) {
    this.namedMeteringItems = namedMeteringItems;
    return this;
  }

  public MeteringPolicy addNamedMeteringItemsItem(NamedMeteringItem namedMeteringItemsItem) {
    if (this.namedMeteringItems == null) {
      this.namedMeteringItems = new ArrayList<NamedMeteringItem>();
    }
    this.namedMeteringItems.add(namedMeteringItemsItem);
    return this;
  }

  /**
   * Get namedMeteringItems
   *
   * @return namedMeteringItems
   */
  @Schema(description = "")
  public List<NamedMeteringItem> getNamedMeteringItems() {
    return namedMeteringItems;
  }

  public void setNamedMeteringItems(List<NamedMeteringItem> namedMeteringItems) {
    this.namedMeteringItems = namedMeteringItems;
  }

  public MeteringPolicy oneTimeMeteringItems(List<OneTimeMeteringItem> oneTimeMeteringItems) {
    this.oneTimeMeteringItems = oneTimeMeteringItems;
    return this;
  }

  public MeteringPolicy addOneTimeMeteringItemsItem(OneTimeMeteringItem oneTimeMeteringItemsItem) {
    if (this.oneTimeMeteringItems == null) {
      this.oneTimeMeteringItems = new ArrayList<OneTimeMeteringItem>();
    }
    this.oneTimeMeteringItems.add(oneTimeMeteringItemsItem);
    return this;
  }

  /**
   * Get oneTimeMeteringItems
   *
   * @return oneTimeMeteringItems
   */
  @Schema(description = "")
  public List<OneTimeMeteringItem> getOneTimeMeteringItems() {
    return oneTimeMeteringItems;
  }

  public void setOneTimeMeteringItems(List<OneTimeMeteringItem> oneTimeMeteringItems) {
    this.oneTimeMeteringItems = oneTimeMeteringItems;
  }

  public MeteringPolicy orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * Get orgId
   *
   * @return orgId
   */
  @Schema(description = "")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public MeteringPolicy pricingCardAssignmentInfo(
      MeteringPolicyAssignmentInfo pricingCardAssignmentInfo) {
    this.pricingCardAssignmentInfo = pricingCardAssignmentInfo;
    return this;
  }

  /**
   * Get pricingCardAssignmentInfo
   *
   * @return pricingCardAssignmentInfo
   */
  @Schema(description = "")
  public MeteringPolicyAssignmentInfo getPricingCardAssignmentInfo() {
    return pricingCardAssignmentInfo;
  }

  public void setPricingCardAssignmentInfo(MeteringPolicyAssignmentInfo pricingCardAssignmentInfo) {
    this.pricingCardAssignmentInfo = pricingCardAssignmentInfo;
  }

  public MeteringPolicy tagBasedMeteringItems(List<TagBasedMeteringItem> tagBasedMeteringItems) {
    this.tagBasedMeteringItems = tagBasedMeteringItems;
    return this;
  }

  public MeteringPolicy addTagBasedMeteringItemsItem(
      TagBasedMeteringItem tagBasedMeteringItemsItem) {
    if (this.tagBasedMeteringItems == null) {
      this.tagBasedMeteringItems = new ArrayList<TagBasedMeteringItem>();
    }
    this.tagBasedMeteringItems.add(tagBasedMeteringItemsItem);
    return this;
  }

  /**
   * Get tagBasedMeteringItems
   *
   * @return tagBasedMeteringItems
   */
  @Schema(description = "")
  public List<TagBasedMeteringItem> getTagBasedMeteringItems() {
    return tagBasedMeteringItems;
  }

  public void setTagBasedMeteringItems(List<TagBasedMeteringItem> tagBasedMeteringItems) {
    this.tagBasedMeteringItems = tagBasedMeteringItems;
  }

  public MeteringPolicy tagBasedOneTimeMeteringItems(
      List<TagBasedOneTimeMeteringItem> tagBasedOneTimeMeteringItems) {
    this.tagBasedOneTimeMeteringItems = tagBasedOneTimeMeteringItems;
    return this;
  }

  public MeteringPolicy addTagBasedOneTimeMeteringItemsItem(
      TagBasedOneTimeMeteringItem tagBasedOneTimeMeteringItemsItem) {
    if (this.tagBasedOneTimeMeteringItems == null) {
      this.tagBasedOneTimeMeteringItems = new ArrayList<TagBasedOneTimeMeteringItem>();
    }
    this.tagBasedOneTimeMeteringItems.add(tagBasedOneTimeMeteringItemsItem);
    return this;
  }

  /**
   * Get tagBasedOneTimeMeteringItems
   *
   * @return tagBasedOneTimeMeteringItems
   */
  @Schema(description = "")
  public List<TagBasedOneTimeMeteringItem> getTagBasedOneTimeMeteringItems() {
    return tagBasedOneTimeMeteringItems;
  }

  public void setTagBasedOneTimeMeteringItems(
      List<TagBasedOneTimeMeteringItem> tagBasedOneTimeMeteringItems) {
    this.tagBasedOneTimeMeteringItems = tagBasedOneTimeMeteringItems;
  }

  public MeteringPolicy tagBasedRateFactorItems(
      List<TagBasedRateFactorItem> tagBasedRateFactorItems) {
    this.tagBasedRateFactorItems = tagBasedRateFactorItems;
    return this;
  }

  public MeteringPolicy addTagBasedRateFactorItemsItem(
      TagBasedRateFactorItem tagBasedRateFactorItemsItem) {
    if (this.tagBasedRateFactorItems == null) {
      this.tagBasedRateFactorItems = new ArrayList<TagBasedRateFactorItem>();
    }
    this.tagBasedRateFactorItems.add(tagBasedRateFactorItemsItem);
    return this;
  }

  /**
   * Get tagBasedRateFactorItems
   *
   * @return tagBasedRateFactorItems
   */
  @Schema(description = "")
  public List<TagBasedRateFactorItem> getTagBasedRateFactorItems() {
    return tagBasedRateFactorItems;
  }

  public void setTagBasedRateFactorItems(List<TagBasedRateFactorItem> tagBasedRateFactorItems) {
    this.tagBasedRateFactorItems = tagBasedRateFactorItems;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MeteringPolicy meteringPolicy = (MeteringPolicy) o;
    return Objects.equals(this.chargeModel, meteringPolicy.chargeModel)
        && Objects.equals(this.createdAt, meteringPolicy.createdAt)
        && Objects.equals(this.createdBy, meteringPolicy.createdBy)
        && Objects.equals(this.description, meteringPolicy.description)
        && Objects.equals(this.fixedPrice, meteringPolicy.fixedPrice)
        && Objects.equals(this.id, meteringPolicy.id)
        && Objects.equals(this.lastUpdatedAt, meteringPolicy.lastUpdatedAt)
        && Objects.equals(this.meteringItems, meteringPolicy.meteringItems)
        && Objects.equals(this.name, meteringPolicy.name)
        && Objects.equals(this.namedMeteringItems, meteringPolicy.namedMeteringItems)
        && Objects.equals(this.oneTimeMeteringItems, meteringPolicy.oneTimeMeteringItems)
        && Objects.equals(this.orgId, meteringPolicy.orgId)
        && Objects.equals(this.pricingCardAssignmentInfo, meteringPolicy.pricingCardAssignmentInfo)
        && Objects.equals(this.tagBasedMeteringItems, meteringPolicy.tagBasedMeteringItems)
        && Objects.equals(
            this.tagBasedOneTimeMeteringItems, meteringPolicy.tagBasedOneTimeMeteringItems)
        && Objects.equals(this.tagBasedRateFactorItems, meteringPolicy.tagBasedRateFactorItems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        chargeModel,
        createdAt,
        createdBy,
        description,
        fixedPrice,
        id,
        lastUpdatedAt,
        meteringItems,
        name,
        namedMeteringItems,
        oneTimeMeteringItems,
        orgId,
        pricingCardAssignmentInfo,
        tagBasedMeteringItems,
        tagBasedOneTimeMeteringItems,
        tagBasedRateFactorItems);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MeteringPolicy {\n");

    sb.append("    chargeModel: ").append(toIndentedString(chargeModel)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    fixedPrice: ").append(toIndentedString(fixedPrice)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
    sb.append("    meteringItems: ").append(toIndentedString(meteringItems)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namedMeteringItems: ").append(toIndentedString(namedMeteringItems)).append("\n");
    sb.append("    oneTimeMeteringItems: ")
        .append(toIndentedString(oneTimeMeteringItems))
        .append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    pricingCardAssignmentInfo: ")
        .append(toIndentedString(pricingCardAssignmentInfo))
        .append("\n");
    sb.append("    tagBasedMeteringItems: ")
        .append(toIndentedString(tagBasedMeteringItems))
        .append("\n");
    sb.append("    tagBasedOneTimeMeteringItems: ")
        .append(toIndentedString(tagBasedOneTimeMeteringItems))
        .append("\n");
    sb.append("    tagBasedRateFactorItems: ")
        .append(toIndentedString(tagBasedRateFactorItems))
        .append("\n");
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

  /** Gets or Sets chargeModel */
  @JsonAdapter(ChargeModelEnum.Adapter.class)
  public enum ChargeModelEnum {
    GO("PAY_AS_YOU_GO");

    private String value;

    ChargeModelEnum(String value) {
      this.value = value;
    }

    public static ChargeModelEnum fromValue(String text) {
      for (ChargeModelEnum b : ChargeModelEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static class Adapter extends TypeAdapter<ChargeModelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChargeModelEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChargeModelEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ChargeModelEnum.fromValue(String.valueOf(value));
      }
    }
  }
}
