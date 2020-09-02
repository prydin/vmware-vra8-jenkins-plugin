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
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * Specification for a VCF cloud account.&lt;br&gt;&lt;br&gt;A cloud account identifies a cloud account type and an account-specific deployment region or data center where the associated cloud account resources are hosted.
 */
@ApiModel(description = "Specification for a VCF cloud account.<br><br>A cloud account identifies a cloud account type and an account-specific deployment region or data center where the associated cloud account resources are hosted.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class CloudAccountVcfSpecification {
  @SerializedName("vcenterPassword")
  private String vcenterPassword = null;

  @SerializedName("acceptSelfSignedCertificate")
  private Boolean acceptSelfSignedCertificate = null;

  @SerializedName("nsxHostName")
  private String nsxHostName = null;

  @SerializedName("vcenterUsername")
  private String vcenterUsername = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("regionIds")
  private List<String> regionIds = new ArrayList<String>();

  @SerializedName("sddcManagerId")
  private String sddcManagerId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("vcenterHostName")
  private String vcenterHostName = null;

  @SerializedName("createDefaultZones")
  private Boolean createDefaultZones = null;

  @SerializedName("nsxCertificate")
  private String nsxCertificate = null;

  @SerializedName("nsxUsername")
  private String nsxUsername = null;

  @SerializedName("workloadDomainName")
  private String workloadDomainName = null;

  @SerializedName("nsxPassword")
  private String nsxPassword = null;

  @SerializedName("vcenterCertificate")
  private String vcenterCertificate = null;

  @SerializedName("dcId")
  private String dcId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("workloadDomainId")
  private String workloadDomainId = null;

  public CloudAccountVcfSpecification vcenterPassword(String vcenterPassword) {
    this.vcenterPassword = vcenterPassword;
    return this;
  }

   /**
   * Password for the user used to authenticate with the vCenter in VCF cloud account
   * @return vcenterPassword
  **/
  @ApiModelProperty(example = "cndhjslacd90ascdbasyoucbdh", required = true, value = "Password for the user used to authenticate with the vCenter in VCF cloud account")
  public String getVcenterPassword() {
    return vcenterPassword;
  }

  public void setVcenterPassword(String vcenterPassword) {
    this.vcenterPassword = vcenterPassword;
  }

  public CloudAccountVcfSpecification acceptSelfSignedCertificate(Boolean acceptSelfSignedCertificate) {
    this.acceptSelfSignedCertificate = acceptSelfSignedCertificate;
    return this;
  }

   /**
   * Accept self signed certificate when connecting to vSphere and NSX-T
   * @return acceptSelfSignedCertificate
  **/
  @ApiModelProperty(example = "false", value = "Accept self signed certificate when connecting to vSphere and NSX-T")
  public Boolean isAcceptSelfSignedCertificate() {
    return acceptSelfSignedCertificate;
  }

  public void setAcceptSelfSignedCertificate(Boolean acceptSelfSignedCertificate) {
    this.acceptSelfSignedCertificate = acceptSelfSignedCertificate;
  }

  public CloudAccountVcfSpecification nsxHostName(String nsxHostName) {
    this.nsxHostName = nsxHostName;
    return this;
  }

   /**
   * Host name for the NSX endpoint from the specified workload domain.
   * @return nsxHostName
  **/
  @ApiModelProperty(example = "nsxt.mycompany.com", required = true, value = "Host name for the NSX endpoint from the specified workload domain.")
  public String getNsxHostName() {
    return nsxHostName;
  }

  public void setNsxHostName(String nsxHostName) {
    this.nsxHostName = nsxHostName;
  }

  public CloudAccountVcfSpecification vcenterUsername(String vcenterUsername) {
    this.vcenterUsername = vcenterUsername;
    return this;
  }

   /**
   * vCenter user name for the specified workload domain.The specified user requires CloudAdmin credentials. The user does not require CloudGlobalAdmin credentials.
   * @return vcenterUsername
  **/
  @ApiModelProperty(example = "administrator@mycompany.com", required = true, value = "vCenter user name for the specified workload domain.The specified user requires CloudAdmin credentials. The user does not require CloudGlobalAdmin credentials.")
  public String getVcenterUsername() {
    return vcenterUsername;
  }

  public void setVcenterUsername(String vcenterUsername) {
    this.vcenterUsername = vcenterUsername;
  }

  public CloudAccountVcfSpecification description(String description) {
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

  public CloudAccountVcfSpecification regionIds(List<String> regionIds) {
    this.regionIds = regionIds;
    return this;
  }

  public CloudAccountVcfSpecification addRegionIdsItem(String regionIdsItem) {
    this.regionIds.add(regionIdsItem);
    return this;
  }

   /**
   * A set of Region names to enable provisioning on.Refer to /iaas/cloud-accounts/region-enumeration.
   * @return regionIds
  **/
  @ApiModelProperty(example = "\"[ \\\"us-east-1\\\", \\\"ap-northeast-1\\\" ]\"", required = true, value = "A set of Region names to enable provisioning on.Refer to /iaas/cloud-accounts/region-enumeration.")
  public List<String> getRegionIds() {
    return regionIds;
  }

  public void setRegionIds(List<String> regionIds) {
    this.regionIds = regionIds;
  }

  public CloudAccountVcfSpecification sddcManagerId(String sddcManagerId) {
    this.sddcManagerId = sddcManagerId;
    return this;
  }

   /**
   * SDDC manager integration id
   * @return sddcManagerId
  **/
  @ApiModelProperty(value = "SDDC manager integration id")
  public String getSddcManagerId() {
    return sddcManagerId;
  }

  public void setSddcManagerId(String sddcManagerId) {
    this.sddcManagerId = sddcManagerId;
  }

  public CloudAccountVcfSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public CloudAccountVcfSpecification addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * A set of tag keys and optional values to set on the Cloud Account.Cloud account capability tags may enable different features. 
   * @return tags
  **/
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"env\\\", \\\"value\\\": \\\"dev\\\" } ]\"", value = "A set of tag keys and optional values to set on the Cloud Account.Cloud account capability tags may enable different features. ")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public CloudAccountVcfSpecification vcenterHostName(String vcenterHostName) {
    this.vcenterHostName = vcenterHostName;
    return this;
  }

   /**
   * Host name for the vSphere from the specified workload domain.
   * @return vcenterHostName
  **/
  @ApiModelProperty(example = "vc.mycompany.com", required = true, value = "Host name for the vSphere from the specified workload domain.")
  public String getVcenterHostName() {
    return vcenterHostName;
  }

  public void setVcenterHostName(String vcenterHostName) {
    this.vcenterHostName = vcenterHostName;
  }

  public CloudAccountVcfSpecification createDefaultZones(Boolean createDefaultZones) {
    this.createDefaultZones = createDefaultZones;
    return this;
  }

   /**
   * Create default cloud zones for the enabled regions.
   * @return createDefaultZones
  **/
  @ApiModelProperty(example = "true", value = "Create default cloud zones for the enabled regions.")
  public Boolean isCreateDefaultZones() {
    return createDefaultZones;
  }

  public void setCreateDefaultZones(Boolean createDefaultZones) {
    this.createDefaultZones = createDefaultZones;
  }

  public CloudAccountVcfSpecification nsxCertificate(String nsxCertificate) {
    this.nsxCertificate = nsxCertificate;
    return this;
  }

   /**
   * NSX Certificate
   * @return nsxCertificate
  **/
  @ApiModelProperty(value = "NSX Certificate")
  public String getNsxCertificate() {
    return nsxCertificate;
  }

  public void setNsxCertificate(String nsxCertificate) {
    this.nsxCertificate = nsxCertificate;
  }

  public CloudAccountVcfSpecification nsxUsername(String nsxUsername) {
    this.nsxUsername = nsxUsername;
    return this;
  }

   /**
   * User name for the NSX manager in the specified workload domain.
   * @return nsxUsername
  **/
  @ApiModelProperty(example = "administrator@mycompany.com", required = true, value = "User name for the NSX manager in the specified workload domain.")
  public String getNsxUsername() {
    return nsxUsername;
  }

  public void setNsxUsername(String nsxUsername) {
    this.nsxUsername = nsxUsername;
  }

  public CloudAccountVcfSpecification workloadDomainName(String workloadDomainName) {
    this.workloadDomainName = workloadDomainName;
    return this;
  }

   /**
   * Name of the workload domain to add as VCF cloud account.
   * @return workloadDomainName
  **/
  @ApiModelProperty(example = "Management", required = true, value = "Name of the workload domain to add as VCF cloud account.")
  public String getWorkloadDomainName() {
    return workloadDomainName;
  }

  public void setWorkloadDomainName(String workloadDomainName) {
    this.workloadDomainName = workloadDomainName;
  }

  public CloudAccountVcfSpecification nsxPassword(String nsxPassword) {
    this.nsxPassword = nsxPassword;
    return this;
  }

   /**
   * Password for the user used to authenticate with the NSX-T manager in VCF cloud account
   * @return nsxPassword
  **/
  @ApiModelProperty(example = "cndhjslacd90ascdbasyoucbdh", required = true, value = "Password for the user used to authenticate with the NSX-T manager in VCF cloud account")
  public String getNsxPassword() {
    return nsxPassword;
  }

  public void setNsxPassword(String nsxPassword) {
    this.nsxPassword = nsxPassword;
  }

  public CloudAccountVcfSpecification vcenterCertificate(String vcenterCertificate) {
    this.vcenterCertificate = vcenterCertificate;
    return this;
  }

   /**
   * vCenter Certificate
   * @return vcenterCertificate
  **/
  @ApiModelProperty(value = "vCenter Certificate")
  public String getVcenterCertificate() {
    return vcenterCertificate;
  }

  public void setVcenterCertificate(String vcenterCertificate) {
    this.vcenterCertificate = vcenterCertificate;
  }

  public CloudAccountVcfSpecification dcId(String dcId) {
    this.dcId = dcId;
    return this;
  }

   /**
   * Identifier of a data collector vm deployed in the on premise infrastructure. Refer to the data-collector API to create or list data collectors
   * @return dcId
  **/
  @ApiModelProperty(example = "23959a1e-18bc-4f0c-ac49-b5aeb4b6eef4", value = "Identifier of a data collector vm deployed in the on premise infrastructure. Refer to the data-collector API to create or list data collectors")
  public String getDcId() {
    return dcId;
  }

  public void setDcId(String dcId) {
    this.dcId = dcId;
  }

  public CloudAccountVcfSpecification name(String name) {
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

  public CloudAccountVcfSpecification workloadDomainId(String workloadDomainId) {
    this.workloadDomainId = workloadDomainId;
    return this;
  }

   /**
   * Id of the workload domain to add as VCF cloud account.
   * @return workloadDomainId
  **/
  @ApiModelProperty(required = true, value = "Id of the workload domain to add as VCF cloud account.")
  public String getWorkloadDomainId() {
    return workloadDomainId;
  }

  public void setWorkloadDomainId(String workloadDomainId) {
    this.workloadDomainId = workloadDomainId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudAccountVcfSpecification cloudAccountVcfSpecification = (CloudAccountVcfSpecification) o;
    return Objects.equals(this.vcenterPassword, cloudAccountVcfSpecification.vcenterPassword) &&
        Objects.equals(this.acceptSelfSignedCertificate, cloudAccountVcfSpecification.acceptSelfSignedCertificate) &&
        Objects.equals(this.nsxHostName, cloudAccountVcfSpecification.nsxHostName) &&
        Objects.equals(this.vcenterUsername, cloudAccountVcfSpecification.vcenterUsername) &&
        Objects.equals(this.description, cloudAccountVcfSpecification.description) &&
        Objects.equals(this.regionIds, cloudAccountVcfSpecification.regionIds) &&
        Objects.equals(this.sddcManagerId, cloudAccountVcfSpecification.sddcManagerId) &&
        Objects.equals(this.tags, cloudAccountVcfSpecification.tags) &&
        Objects.equals(this.vcenterHostName, cloudAccountVcfSpecification.vcenterHostName) &&
        Objects.equals(this.createDefaultZones, cloudAccountVcfSpecification.createDefaultZones) &&
        Objects.equals(this.nsxCertificate, cloudAccountVcfSpecification.nsxCertificate) &&
        Objects.equals(this.nsxUsername, cloudAccountVcfSpecification.nsxUsername) &&
        Objects.equals(this.workloadDomainName, cloudAccountVcfSpecification.workloadDomainName) &&
        Objects.equals(this.nsxPassword, cloudAccountVcfSpecification.nsxPassword) &&
        Objects.equals(this.vcenterCertificate, cloudAccountVcfSpecification.vcenterCertificate) &&
        Objects.equals(this.dcId, cloudAccountVcfSpecification.dcId) &&
        Objects.equals(this.name, cloudAccountVcfSpecification.name) &&
        Objects.equals(this.workloadDomainId, cloudAccountVcfSpecification.workloadDomainId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vcenterPassword, acceptSelfSignedCertificate, nsxHostName, vcenterUsername, description, regionIds, sddcManagerId, tags, vcenterHostName, createDefaultZones, nsxCertificate, nsxUsername, workloadDomainName, nsxPassword, vcenterCertificate, dcId, name, workloadDomainId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudAccountVcfSpecification {\n");
    
    sb.append("    vcenterPassword: ").append(toIndentedString(vcenterPassword)).append("\n");
    sb.append("    acceptSelfSignedCertificate: ").append(toIndentedString(acceptSelfSignedCertificate)).append("\n");
    sb.append("    nsxHostName: ").append(toIndentedString(nsxHostName)).append("\n");
    sb.append("    vcenterUsername: ").append(toIndentedString(vcenterUsername)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
    sb.append("    sddcManagerId: ").append(toIndentedString(sddcManagerId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    vcenterHostName: ").append(toIndentedString(vcenterHostName)).append("\n");
    sb.append("    createDefaultZones: ").append(toIndentedString(createDefaultZones)).append("\n");
    sb.append("    nsxCertificate: ").append(toIndentedString(nsxCertificate)).append("\n");
    sb.append("    nsxUsername: ").append(toIndentedString(nsxUsername)).append("\n");
    sb.append("    workloadDomainName: ").append(toIndentedString(workloadDomainName)).append("\n");
    sb.append("    nsxPassword: ").append(toIndentedString(nsxPassword)).append("\n");
    sb.append("    vcenterCertificate: ").append(toIndentedString(vcenterCertificate)).append("\n");
    sb.append("    dcId: ").append(toIndentedString(dcId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    workloadDomainId: ").append(toIndentedString(workloadDomainId)).append("\n");
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
