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


package net.virtualviking.vra.jenkinsplugin.model.catalog;

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

/**
 * FormDefinition
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T09:23:54.867-04:00")



public class FormDefinition {
  @SerializedName("formURI")
  private String formURI = null;

  @SerializedName("trackProgressInModal")
  private Boolean trackProgressInModal = null;

  public FormDefinition formURI(String formURI) {
    this.formURI = formURI;
    return this;
  }

   /**
   * Get formURI
   * @return formURI
  **/
  @ApiModelProperty(value = "")
  public String getFormURI() {
    return formURI;
  }

  public void setFormURI(String formURI) {
    this.formURI = formURI;
  }

  public FormDefinition trackProgressInModal(Boolean trackProgressInModal) {
    this.trackProgressInModal = trackProgressInModal;
    return this;
  }

   /**
   * Get trackProgressInModal
   * @return trackProgressInModal
  **/
  @ApiModelProperty(value = "")
  public Boolean isTrackProgressInModal() {
    return trackProgressInModal;
  }

  public void setTrackProgressInModal(Boolean trackProgressInModal) {
    this.trackProgressInModal = trackProgressInModal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDefinition formDefinition = (FormDefinition) o;
    return Objects.equals(this.formURI, formDefinition.formURI) &&
        Objects.equals(this.trackProgressInModal, formDefinition.trackProgressInModal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formURI, trackProgressInModal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDefinition {\n");
    
    sb.append("    formURI: ").append(toIndentedString(formURI)).append("\n");
    sb.append("    trackProgressInModal: ").append(toIndentedString(trackProgressInModal)).append("\n");
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
