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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Query */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class Query {
  @SerializedName("booleanClauses")
  private List<Query> booleanClauses = null;

  @SerializedName("term")
  private QueryTerm term = null;

  /** Gets or Sets occurance */
  @JsonAdapter(OccuranceEnum.Adapter.class)
  public enum OccuranceEnum {
    MUST_OCCUR("MUST_OCCUR"),
    MUST_NOT_OCCUR("MUST_NOT_OCCUR"),
    SHOULD_OCCUR("SHOULD_OCCUR");

    private String value;

    OccuranceEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OccuranceEnum fromValue(String text) {
      for (OccuranceEnum b : OccuranceEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OccuranceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OccuranceEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OccuranceEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OccuranceEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("occurance")
  private OccuranceEnum occurance = null;

  public Query booleanClauses(List<Query> booleanClauses) {
    this.booleanClauses = booleanClauses;
    return this;
  }

  public Query addBooleanClausesItem(Query booleanClausesItem) {
    if (this.booleanClauses == null) {
      this.booleanClauses = new ArrayList<Query>();
    }
    this.booleanClauses.add(booleanClausesItem);
    return this;
  }

  /**
   * Get booleanClauses
   *
   * @return booleanClauses
   */
  @Schema(description = "")
  public List<Query> getBooleanClauses() {
    return booleanClauses;
  }

  public void setBooleanClauses(List<Query> booleanClauses) {
    this.booleanClauses = booleanClauses;
  }

  public Query term(QueryTerm term) {
    this.term = term;
    return this;
  }

  /**
   * Get term
   *
   * @return term
   */
  @Schema(description = "")
  public QueryTerm getTerm() {
    return term;
  }

  public void setTerm(QueryTerm term) {
    this.term = term;
  }

  public Query occurance(OccuranceEnum occurance) {
    this.occurance = occurance;
    return this;
  }

  /**
   * Get occurance
   *
   * @return occurance
   */
  @Schema(description = "")
  public OccuranceEnum getOccurance() {
    return occurance;
  }

  public void setOccurance(OccuranceEnum occurance) {
    this.occurance = occurance;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Query query = (Query) o;
    return Objects.equals(this.booleanClauses, query.booleanClauses)
        && Objects.equals(this.term, query.term)
        && Objects.equals(this.occurance, query.occurance);
  }

  @Override
  public int hashCode() {
    return Objects.hash(booleanClauses, term, occurance);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Query {\n");

    sb.append("    booleanClauses: ").append(toIndentedString(booleanClauses)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    occurance: ").append(toIndentedString(occurance)).append("\n");
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
