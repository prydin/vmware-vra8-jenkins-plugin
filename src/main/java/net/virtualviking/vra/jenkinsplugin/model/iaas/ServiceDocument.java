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
import net.virtualviking.vra.jenkinsplugin.model.iaas.ServiceDocumentDescription;

/**
 * ServiceDocument
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class ServiceDocument {
  @SerializedName("documentAuthPrincipalLink")
  private String documentAuthPrincipalLink = null;

  @SerializedName("documentExpirationTimeMicros")
  private Long documentExpirationTimeMicros = null;

  @SerializedName("documentDescription")
  private ServiceDocumentDescription documentDescription = null;

  @SerializedName("documentKind")
  private String documentKind = null;

  @SerializedName("documentSelfLink")
  private String documentSelfLink = null;

  @SerializedName("documentTransactionId")
  private String documentTransactionId = null;

  @SerializedName("documentOwner")
  private String documentOwner = null;

  @SerializedName("documentUpdateAction")
  private String documentUpdateAction = null;

  @SerializedName("documentVersion")
  private Long documentVersion = null;

  @SerializedName("documentUpdateTimeMicros")
  private Long documentUpdateTimeMicros = null;

  public ServiceDocument documentAuthPrincipalLink(String documentAuthPrincipalLink) {
    this.documentAuthPrincipalLink = documentAuthPrincipalLink;
    return this;
  }

   /**
   * Get documentAuthPrincipalLink
   * @return documentAuthPrincipalLink
  **/
  @ApiModelProperty(value = "")
  public String getDocumentAuthPrincipalLink() {
    return documentAuthPrincipalLink;
  }

  public void setDocumentAuthPrincipalLink(String documentAuthPrincipalLink) {
    this.documentAuthPrincipalLink = documentAuthPrincipalLink;
  }

  public ServiceDocument documentExpirationTimeMicros(Long documentExpirationTimeMicros) {
    this.documentExpirationTimeMicros = documentExpirationTimeMicros;
    return this;
  }

   /**
   * Get documentExpirationTimeMicros
   * @return documentExpirationTimeMicros
  **/
  @ApiModelProperty(value = "")
  public Long getDocumentExpirationTimeMicros() {
    return documentExpirationTimeMicros;
  }

  public void setDocumentExpirationTimeMicros(Long documentExpirationTimeMicros) {
    this.documentExpirationTimeMicros = documentExpirationTimeMicros;
  }

  public ServiceDocument documentDescription(ServiceDocumentDescription documentDescription) {
    this.documentDescription = documentDescription;
    return this;
  }

   /**
   * Get documentDescription
   * @return documentDescription
  **/
  @ApiModelProperty(value = "")
  public ServiceDocumentDescription getDocumentDescription() {
    return documentDescription;
  }

  public void setDocumentDescription(ServiceDocumentDescription documentDescription) {
    this.documentDescription = documentDescription;
  }

  public ServiceDocument documentKind(String documentKind) {
    this.documentKind = documentKind;
    return this;
  }

   /**
   * Get documentKind
   * @return documentKind
  **/
  @ApiModelProperty(value = "")
  public String getDocumentKind() {
    return documentKind;
  }

  public void setDocumentKind(String documentKind) {
    this.documentKind = documentKind;
  }

  public ServiceDocument documentSelfLink(String documentSelfLink) {
    this.documentSelfLink = documentSelfLink;
    return this;
  }

   /**
   * Get documentSelfLink
   * @return documentSelfLink
  **/
  @ApiModelProperty(value = "")
  public String getDocumentSelfLink() {
    return documentSelfLink;
  }

  public void setDocumentSelfLink(String documentSelfLink) {
    this.documentSelfLink = documentSelfLink;
  }

  public ServiceDocument documentTransactionId(String documentTransactionId) {
    this.documentTransactionId = documentTransactionId;
    return this;
  }

   /**
   * Get documentTransactionId
   * @return documentTransactionId
  **/
  @ApiModelProperty(value = "")
  public String getDocumentTransactionId() {
    return documentTransactionId;
  }

  public void setDocumentTransactionId(String documentTransactionId) {
    this.documentTransactionId = documentTransactionId;
  }

  public ServiceDocument documentOwner(String documentOwner) {
    this.documentOwner = documentOwner;
    return this;
  }

   /**
   * Get documentOwner
   * @return documentOwner
  **/
  @ApiModelProperty(value = "")
  public String getDocumentOwner() {
    return documentOwner;
  }

  public void setDocumentOwner(String documentOwner) {
    this.documentOwner = documentOwner;
  }

  public ServiceDocument documentUpdateAction(String documentUpdateAction) {
    this.documentUpdateAction = documentUpdateAction;
    return this;
  }

   /**
   * Get documentUpdateAction
   * @return documentUpdateAction
  **/
  @ApiModelProperty(value = "")
  public String getDocumentUpdateAction() {
    return documentUpdateAction;
  }

  public void setDocumentUpdateAction(String documentUpdateAction) {
    this.documentUpdateAction = documentUpdateAction;
  }

  public ServiceDocument documentVersion(Long documentVersion) {
    this.documentVersion = documentVersion;
    return this;
  }

   /**
   * Get documentVersion
   * @return documentVersion
  **/
  @ApiModelProperty(value = "")
  public Long getDocumentVersion() {
    return documentVersion;
  }

  public void setDocumentVersion(Long documentVersion) {
    this.documentVersion = documentVersion;
  }

  public ServiceDocument documentUpdateTimeMicros(Long documentUpdateTimeMicros) {
    this.documentUpdateTimeMicros = documentUpdateTimeMicros;
    return this;
  }

   /**
   * Get documentUpdateTimeMicros
   * @return documentUpdateTimeMicros
  **/
  @ApiModelProperty(value = "")
  public Long getDocumentUpdateTimeMicros() {
    return documentUpdateTimeMicros;
  }

  public void setDocumentUpdateTimeMicros(Long documentUpdateTimeMicros) {
    this.documentUpdateTimeMicros = documentUpdateTimeMicros;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServiceDocument serviceDocument = (ServiceDocument) o;
    return Objects.equals(this.documentAuthPrincipalLink, serviceDocument.documentAuthPrincipalLink) &&
        Objects.equals(this.documentExpirationTimeMicros, serviceDocument.documentExpirationTimeMicros) &&
        Objects.equals(this.documentDescription, serviceDocument.documentDescription) &&
        Objects.equals(this.documentKind, serviceDocument.documentKind) &&
        Objects.equals(this.documentSelfLink, serviceDocument.documentSelfLink) &&
        Objects.equals(this.documentTransactionId, serviceDocument.documentTransactionId) &&
        Objects.equals(this.documentOwner, serviceDocument.documentOwner) &&
        Objects.equals(this.documentUpdateAction, serviceDocument.documentUpdateAction) &&
        Objects.equals(this.documentVersion, serviceDocument.documentVersion) &&
        Objects.equals(this.documentUpdateTimeMicros, serviceDocument.documentUpdateTimeMicros);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentAuthPrincipalLink, documentExpirationTimeMicros, documentDescription, documentKind, documentSelfLink, documentTransactionId, documentOwner, documentUpdateAction, documentVersion, documentUpdateTimeMicros);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceDocument {\n");
    
    sb.append("    documentAuthPrincipalLink: ").append(toIndentedString(documentAuthPrincipalLink)).append("\n");
    sb.append("    documentExpirationTimeMicros: ").append(toIndentedString(documentExpirationTimeMicros)).append("\n");
    sb.append("    documentDescription: ").append(toIndentedString(documentDescription)).append("\n");
    sb.append("    documentKind: ").append(toIndentedString(documentKind)).append("\n");
    sb.append("    documentSelfLink: ").append(toIndentedString(documentSelfLink)).append("\n");
    sb.append("    documentTransactionId: ").append(toIndentedString(documentTransactionId)).append("\n");
    sb.append("    documentOwner: ").append(toIndentedString(documentOwner)).append("\n");
    sb.append("    documentUpdateAction: ").append(toIndentedString(documentUpdateAction)).append("\n");
    sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
    sb.append("    documentUpdateTimeMicros: ").append(toIndentedString(documentUpdateTimeMicros)).append("\n");
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

