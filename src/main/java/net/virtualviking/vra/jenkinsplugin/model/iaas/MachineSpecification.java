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
import net.virtualviking.vra.jenkinsplugin.model.iaas.Constraint;
import net.virtualviking.vra.jenkinsplugin.model.iaas.DiskAttachmentSpecification;
import net.virtualviking.vra.jenkinsplugin.model.iaas.MachineBootConfig;
import net.virtualviking.vra.jenkinsplugin.model.iaas.MachineBootConfigSettings;
import net.virtualviking.vra.jenkinsplugin.model.iaas.NetworkInterfaceSpecification;
import net.virtualviking.vra.jenkinsplugin.model.iaas.RemoteAccessSpecification;
import net.virtualviking.vra.jenkinsplugin.model.iaas.Tag;

/**
 * Specification for a cloud agnostic machine.
 */
@ApiModel(description = "Specification for a cloud agnostic machine.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class MachineSpecification {
  @SerializedName("image")
  private String image = null;

  @SerializedName("disks")
  private List<DiskAttachmentSpecification> disks = null;

  @SerializedName("imageDiskConstraints")
  private List<Constraint> imageDiskConstraints = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("machineCount")
  private Integer machineCount = null;

  @SerializedName("constraints")
  private List<Constraint> constraints = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("flavor")
  private String flavor = null;

  @SerializedName("customProperties")
  private Map<String, String> customProperties = null;

  @SerializedName("deploymentId")
  private String deploymentId = null;

  @SerializedName("bootConfig")
  private MachineBootConfig bootConfig = null;

  @SerializedName("bootConfigSettings")
  private MachineBootConfigSettings bootConfigSettings = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("nics")
  private List<NetworkInterfaceSpecification> nics = null;

  @SerializedName("imageRef")
  private String imageRef = null;

  @SerializedName("remoteAccess")
  private RemoteAccessSpecification remoteAccess = null;

  @SerializedName("projectId")
  private String projectId = null;

  public MachineSpecification image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Type of image used for this machine.
   * @return image
  **/
  @ApiModelProperty(example = "vmware-gold-master, ubuntu-latest, rhel-compliant, windows", required = true, value = "Type of image used for this machine.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public MachineSpecification disks(List<DiskAttachmentSpecification> disks) {
    this.disks = disks;
    return this;
  }

  public MachineSpecification addDisksItem(DiskAttachmentSpecification disksItem) {
    if (this.disks == null) {
      this.disks = new ArrayList<DiskAttachmentSpecification>();
    }
    this.disks.add(disksItem);
    return this;
  }

   /**
   * A set of disk specifications for this machine.
   * @return disks
  **/
  @ApiModelProperty(value = "A set of disk specifications for this machine.")
  public List<DiskAttachmentSpecification> getDisks() {
    return disks;
  }

  public void setDisks(List<DiskAttachmentSpecification> disks) {
    this.disks = disks;
  }

  public MachineSpecification imageDiskConstraints(List<Constraint> imageDiskConstraints) {
    this.imageDiskConstraints = imageDiskConstraints;
    return this;
  }

  public MachineSpecification addImageDiskConstraintsItem(Constraint imageDiskConstraintsItem) {
    if (this.imageDiskConstraints == null) {
      this.imageDiskConstraints = new ArrayList<Constraint>();
    }
    this.imageDiskConstraints.add(imageDiskConstraintsItem);
    return this;
  }

   /**
   * Constraints that are used to drive placement policies for the image disk. Constraint expressions are matched against tags on existing placement targets.
   * @return imageDiskConstraints
  **/
  @ApiModelProperty(example = "\"[{\\\"mandatory\\\" : \\\"true\\\", \\\"expression\\\": \\\"environment:prod\\\"}, {\\\"mandatory\\\" : \\\"false\\\", \\\"expression\\\": \\\"pci\\\"}]\"", value = "Constraints that are used to drive placement policies for the image disk. Constraint expressions are matched against tags on existing placement targets.")
  public List<Constraint> getImageDiskConstraints() {
    return imageDiskConstraints;
  }

  public void setImageDiskConstraints(List<Constraint> imageDiskConstraints) {
    this.imageDiskConstraints = imageDiskConstraints;
  }

  public MachineSpecification description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Describes machine within the scope of your organization and is not propagated to the cloud
   * @return description
  **/
  @ApiModelProperty(value = "Describes machine within the scope of your organization and is not propagated to the cloud")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MachineSpecification machineCount(Integer machineCount) {
    this.machineCount = machineCount;
    return this;
  }

   /**
   * Number of machines to provision - default 1.
   * @return machineCount
  **/
  @ApiModelProperty(example = "3", value = "Number of machines to provision - default 1.")
  public Integer getMachineCount() {
    return machineCount;
  }

  public void setMachineCount(Integer machineCount) {
    this.machineCount = machineCount;
  }

  public MachineSpecification constraints(List<Constraint> constraints) {
    this.constraints = constraints;
    return this;
  }

  public MachineSpecification addConstraintsItem(Constraint constraintsItem) {
    if (this.constraints == null) {
      this.constraints = new ArrayList<Constraint>();
    }
    this.constraints.add(constraintsItem);
    return this;
  }

   /**
   * Constraints that are used to drive placement policies for the virtual machine that is produced from this specification. Constraint expressions are matched against tags on existing placement targets.
   * @return constraints
  **/
  @ApiModelProperty(example = "\"[{\\\"mandatory\\\" : \\\"true\\\", \\\"expression\\\": \\\"environment\\\":\\\"prod\\\"}, {\\\"mandatory\\\" : \\\"false\\\", \\\"expression\\\": \\\"pci\\\"}]\"", value = "Constraints that are used to drive placement policies for the virtual machine that is produced from this specification. Constraint expressions are matched against tags on existing placement targets.")
  public List<Constraint> getConstraints() {
    return constraints;
  }

  public void setConstraints(List<Constraint> constraints) {
    this.constraints = constraints;
  }

  public MachineSpecification tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public MachineSpecification addTagsItem(Tag tagsItem) {
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
  @ApiModelProperty(example = "\"[ { \\\"key\\\" : \\\"ownedBy\\\", \\\"value\\\": \\\"Rainpole\\\" } ]\"", value = "A set of tag keys and optional values that should be set on any resource that is produced from this specification.")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public MachineSpecification flavor(String flavor) {
    this.flavor = flavor;
    return this;
  }

   /**
   * Flavor of machine instance.
   * @return flavor
  **/
  @ApiModelProperty(example = "small, medium, large", required = true, value = "Flavor of machine instance.")
  public String getFlavor() {
    return flavor;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public MachineSpecification customProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
    return this;
  }

  public MachineSpecification putCustomPropertiesItem(String key, String customPropertiesItem) {
    if (this.customProperties == null) {
      this.customProperties = new HashMap<String, String>();
    }
    this.customProperties.put(key, customPropertiesItem);
    return this;
  }

   /**
   * Additional custom properties that may be used to extend the machine.
   * @return customProperties
  **/
  @ApiModelProperty(value = "Additional custom properties that may be used to extend the machine.")
  public Map<String, String> getCustomProperties() {
    return customProperties;
  }

  public void setCustomProperties(Map<String, String> customProperties) {
    this.customProperties = customProperties;
  }

  public MachineSpecification deploymentId(String deploymentId) {
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

  public MachineSpecification bootConfig(MachineBootConfig bootConfig) {
    this.bootConfig = bootConfig;
    return this;
  }

   /**
   * A valid cloud config data in json-escaped yaml syntax
   * @return bootConfig
  **/
  @ApiModelProperty(value = "A valid cloud config data in json-escaped yaml syntax")
  public MachineBootConfig getBootConfig() {
    return bootConfig;
  }

  public void setBootConfig(MachineBootConfig bootConfig) {
    this.bootConfig = bootConfig;
  }

  public MachineSpecification bootConfigSettings(MachineBootConfigSettings bootConfigSettings) {
    this.bootConfigSettings = bootConfigSettings;
    return this;
  }

   /**
   * A set of settings that specify how the provided Boot Config should be handled
   * @return bootConfigSettings
  **/
  @ApiModelProperty(value = "A set of settings that specify how the provided Boot Config should be handled")
  public MachineBootConfigSettings getBootConfigSettings() {
    return bootConfigSettings;
  }

  public void setBootConfigSettings(MachineBootConfigSettings bootConfigSettings) {
    this.bootConfigSettings = bootConfigSettings;
  }

  public MachineSpecification name(String name) {
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

  public MachineSpecification nics(List<NetworkInterfaceSpecification> nics) {
    this.nics = nics;
    return this;
  }

  public MachineSpecification addNicsItem(NetworkInterfaceSpecification nicsItem) {
    if (this.nics == null) {
      this.nics = new ArrayList<NetworkInterfaceSpecification>();
    }
    this.nics.add(nicsItem);
    return this;
  }

   /**
   * A set of network interface controller specifications for this machine. If not specified, then a default network connection will be created.
   * @return nics
  **/
  @ApiModelProperty(value = "A set of network interface controller specifications for this machine. If not specified, then a default network connection will be created.")
  public List<NetworkInterfaceSpecification> getNics() {
    return nics;
  }

  public void setNics(List<NetworkInterfaceSpecification> nics) {
    this.nics = nics;
  }

  public MachineSpecification imageRef(String imageRef) {
    this.imageRef = imageRef;
    return this;
  }

   /**
   * Direct image reference used for this machine (name, path, location, uri, etc.). Valid if no image property is provided
   * @return imageRef
  **/
  @ApiModelProperty(example = "ami-f6795a8c", required = true, value = "Direct image reference used for this machine (name, path, location, uri, etc.). Valid if no image property is provided")
  public String getImageRef() {
    return imageRef;
  }

  public void setImageRef(String imageRef) {
    this.imageRef = imageRef;
  }

  public MachineSpecification remoteAccess(RemoteAccessSpecification remoteAccess) {
    this.remoteAccess = remoteAccess;
    return this;
  }

   /**
   * Settings to remotely connect to the provisioned machine, by public/private key pair or username/password authentication. AWS and vSphere support key pair. Azure supports key pair or username/password.
   * @return remoteAccess
  **/
  @ApiModelProperty(value = "Settings to remotely connect to the provisioned machine, by public/private key pair or username/password authentication. AWS and vSphere support key pair. Azure supports key pair or username/password.")
  public RemoteAccessSpecification getRemoteAccess() {
    return remoteAccess;
  }

  public void setRemoteAccess(RemoteAccessSpecification remoteAccess) {
    this.remoteAccess = remoteAccess;
  }

  public MachineSpecification projectId(String projectId) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MachineSpecification machineSpecification = (MachineSpecification) o;
    return Objects.equals(this.image, machineSpecification.image) &&
        Objects.equals(this.disks, machineSpecification.disks) &&
        Objects.equals(this.imageDiskConstraints, machineSpecification.imageDiskConstraints) &&
        Objects.equals(this.description, machineSpecification.description) &&
        Objects.equals(this.machineCount, machineSpecification.machineCount) &&
        Objects.equals(this.constraints, machineSpecification.constraints) &&
        Objects.equals(this.tags, machineSpecification.tags) &&
        Objects.equals(this.flavor, machineSpecification.flavor) &&
        Objects.equals(this.customProperties, machineSpecification.customProperties) &&
        Objects.equals(this.deploymentId, machineSpecification.deploymentId) &&
        Objects.equals(this.bootConfig, machineSpecification.bootConfig) &&
        Objects.equals(this.bootConfigSettings, machineSpecification.bootConfigSettings) &&
        Objects.equals(this.name, machineSpecification.name) &&
        Objects.equals(this.nics, machineSpecification.nics) &&
        Objects.equals(this.imageRef, machineSpecification.imageRef) &&
        Objects.equals(this.remoteAccess, machineSpecification.remoteAccess) &&
        Objects.equals(this.projectId, machineSpecification.projectId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, disks, imageDiskConstraints, description, machineCount, constraints, tags, flavor, customProperties, deploymentId, bootConfig, bootConfigSettings, name, nics, imageRef, remoteAccess, projectId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MachineSpecification {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    disks: ").append(toIndentedString(disks)).append("\n");
    sb.append("    imageDiskConstraints: ").append(toIndentedString(imageDiskConstraints)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    machineCount: ").append(toIndentedString(machineCount)).append("\n");
    sb.append("    constraints: ").append(toIndentedString(constraints)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    flavor: ").append(toIndentedString(flavor)).append("\n");
    sb.append("    customProperties: ").append(toIndentedString(customProperties)).append("\n");
    sb.append("    deploymentId: ").append(toIndentedString(deploymentId)).append("\n");
    sb.append("    bootConfig: ").append(toIndentedString(bootConfig)).append("\n");
    sb.append("    bootConfigSettings: ").append(toIndentedString(bootConfigSettings)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nics: ").append(toIndentedString(nics)).append("\n");
    sb.append("    imageRef: ").append(toIndentedString(imageRef)).append("\n");
    sb.append("    remoteAccess: ").append(toIndentedString(remoteAccess)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
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
