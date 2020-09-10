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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** PageOfFilterEntry */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class PageOfFilterEntry {
  @SerializedName("content")
  private List<FilterEntry> content = null;

  @SerializedName("empty")
  private Boolean empty = null;

  @SerializedName("first")
  private Boolean first = null;

  @SerializedName("last")
  private Boolean last = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("numberOfElements")
  private Integer numberOfElements = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("sort")
  private Sort sort = null;

  @SerializedName("totalElements")
  private Long totalElements = null;

  @SerializedName("totalPages")
  private Integer totalPages = null;

  public PageOfFilterEntry content(List<FilterEntry> content) {
    this.content = content;
    return this;
  }

  public PageOfFilterEntry addContentItem(FilterEntry contentItem) {
    if (this.content == null) {
      this.content = new ArrayList<FilterEntry>();
    }
    this.content.add(contentItem);
    return this;
  }

  /**
   * Get content
   *
   * @return content
   */
  @Schema(description = "")
  public List<FilterEntry> getContent() {
    return content;
  }

  public void setContent(List<FilterEntry> content) {
    this.content = content;
  }

  public PageOfFilterEntry empty(Boolean empty) {
    this.empty = empty;
    return this;
  }

  /**
   * Get empty
   *
   * @return empty
   */
  @Schema(description = "")
  public Boolean isEmpty() {
    return empty;
  }

  public void setEmpty(Boolean empty) {
    this.empty = empty;
  }

  public PageOfFilterEntry first(Boolean first) {
    this.first = first;
    return this;
  }

  /**
   * Get first
   *
   * @return first
   */
  @Schema(description = "")
  public Boolean isFirst() {
    return first;
  }

  public void setFirst(Boolean first) {
    this.first = first;
  }

  public PageOfFilterEntry last(Boolean last) {
    this.last = last;
    return this;
  }

  /**
   * Get last
   *
   * @return last
   */
  @Schema(description = "")
  public Boolean isLast() {
    return last;
  }

  public void setLast(Boolean last) {
    this.last = last;
  }

  public PageOfFilterEntry number(Integer number) {
    this.number = number;
    return this;
  }

  /**
   * Get number
   *
   * @return number
   */
  @Schema(description = "")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public PageOfFilterEntry numberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
    return this;
  }

  /**
   * Get numberOfElements
   *
   * @return numberOfElements
   */
  @Schema(description = "")
  public Integer getNumberOfElements() {
    return numberOfElements;
  }

  public void setNumberOfElements(Integer numberOfElements) {
    this.numberOfElements = numberOfElements;
  }

  public PageOfFilterEntry size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   *
   * @return size
   */
  @Schema(description = "")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public PageOfFilterEntry sort(Sort sort) {
    this.sort = sort;
    return this;
  }

  /**
   * Get sort
   *
   * @return sort
   */
  @Schema(description = "")
  public Sort getSort() {
    return sort;
  }

  public void setSort(Sort sort) {
    this.sort = sort;
  }

  public PageOfFilterEntry totalElements(Long totalElements) {
    this.totalElements = totalElements;
    return this;
  }

  /**
   * Get totalElements
   *
   * @return totalElements
   */
  @Schema(description = "")
  public Long getTotalElements() {
    return totalElements;
  }

  public void setTotalElements(Long totalElements) {
    this.totalElements = totalElements;
  }

  public PageOfFilterEntry totalPages(Integer totalPages) {
    this.totalPages = totalPages;
    return this;
  }

  /**
   * Get totalPages
   *
   * @return totalPages
   */
  @Schema(description = "")
  public Integer getTotalPages() {
    return totalPages;
  }

  public void setTotalPages(Integer totalPages) {
    this.totalPages = totalPages;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PageOfFilterEntry pageOfFilterEntry = (PageOfFilterEntry) o;
    return Objects.equals(this.content, pageOfFilterEntry.content)
        && Objects.equals(this.empty, pageOfFilterEntry.empty)
        && Objects.equals(this.first, pageOfFilterEntry.first)
        && Objects.equals(this.last, pageOfFilterEntry.last)
        && Objects.equals(this.number, pageOfFilterEntry.number)
        && Objects.equals(this.numberOfElements, pageOfFilterEntry.numberOfElements)
        && Objects.equals(this.size, pageOfFilterEntry.size)
        && Objects.equals(this.sort, pageOfFilterEntry.sort)
        && Objects.equals(this.totalElements, pageOfFilterEntry.totalElements)
        && Objects.equals(this.totalPages, pageOfFilterEntry.totalPages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        content,
        empty,
        first,
        last,
        number,
        numberOfElements,
        size,
        sort,
        totalElements,
        totalPages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PageOfFilterEntry {\n");

    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    empty: ").append(toIndentedString(empty)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    numberOfElements: ").append(toIndentedString(numberOfElements)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    totalElements: ").append(toIndentedString(totalElements)).append("\n");
    sb.append("    totalPages: ").append(toIndentedString(totalPages)).append("\n");
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
