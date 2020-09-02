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

/**
 * A rule used in a security group.
 */
@ApiModel(description = "A rule used in a security group.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-09-01T10:54:54.585-04:00")



public class Rule {
  @SerializedName("protocol")
  private String protocol = null;

  /**
   * Type of access (Allow, Deny or Drop) for the security rule. Allow is default. Traffic that does not match any rules will be denied.
   */
  @JsonAdapter(AccessEnum.Adapter.class)
  public enum AccessEnum {
    ALLOW("Allow"),
    
    DENY("Deny"),
    
    DROP("Drop");

    private String value;

    AccessEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static AccessEnum fromValue(String text) {
      for (AccessEnum b : AccessEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<AccessEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final AccessEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public AccessEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return AccessEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("access")
  private AccessEnum access = null;

  @SerializedName("service")
  private String service = null;

  @SerializedName("ipRangeCidr")
  private String ipRangeCidr = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("ports")
  private String ports = null;

  /**
   * Direction of the security rule (inbound or outboud). 
   */
  @JsonAdapter(DirectionEnum.Adapter.class)
  public enum DirectionEnum {
    INBOUND("Inbound"),
    
    OUTBOUND("Outbound");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectionEnum fromValue(String text) {
      for (DirectionEnum b : DirectionEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectionEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectionEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectionEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectionEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("direction")
  private DirectionEnum direction = null;

  public Rule protocol(String protocol) {
    this.protocol = protocol;
    return this;
  }

   /**
   * Protocol the security rule applies to.
   * @return protocol
  **/
  @ApiModelProperty(example = "ANY, TCP, UDP", value = "Protocol the security rule applies to.")
  public String getProtocol() {
    return protocol;
  }

  public void setProtocol(String protocol) {
    this.protocol = protocol;
  }

  public Rule access(AccessEnum access) {
    this.access = access;
    return this;
  }

   /**
   * Type of access (Allow, Deny or Drop) for the security rule. Allow is default. Traffic that does not match any rules will be denied.
   * @return access
  **/
  @ApiModelProperty(example = "Allow", required = true, value = "Type of access (Allow, Deny or Drop) for the security rule. Allow is default. Traffic that does not match any rules will be denied.")
  public AccessEnum getAccess() {
    return access;
  }

  public void setAccess(AccessEnum access) {
    this.access = access;
  }

  public Rule service(String service) {
    this.service = service;
    return this;
  }

   /**
   * Service defined by the provider (such as: SSH, HTTPS). Either service or protocol have to be specified.
   * @return service
  **/
  @ApiModelProperty(example = "HTTPS, SSH", value = "Service defined by the provider (such as: SSH, HTTPS). Either service or protocol have to be specified.")
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
  }

  public Rule ipRangeCidr(String ipRangeCidr) {
    this.ipRangeCidr = ipRangeCidr;
    return this;
  }

   /**
   * IP address(es) in CIDR format which the security rule applies to.
   * @return ipRangeCidr
  **/
  @ApiModelProperty(example = "66.170.99.2/32", required = true, value = "IP address(es) in CIDR format which the security rule applies to.")
  public String getIpRangeCidr() {
    return ipRangeCidr;
  }

  public void setIpRangeCidr(String ipRangeCidr) {
    this.ipRangeCidr = ipRangeCidr;
  }

  public Rule name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of security rule.
   * @return name
  **/
  @ApiModelProperty(example = "5756f7e2", value = "Name of security rule.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Rule ports(String ports) {
    this.ports = ports;
    return this;
  }

   /**
   * Ports the security rule applies to.
   * @return ports
  **/
  @ApiModelProperty(example = "443, 1-655535", required = true, value = "Ports the security rule applies to.")
  public String getPorts() {
    return ports;
  }

  public void setPorts(String ports) {
    this.ports = ports;
  }

  public Rule direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }

   /**
   * Direction of the security rule (inbound or outboud). 
   * @return direction
  **/
  @ApiModelProperty(example = "Outbound", required = true, value = "Direction of the security rule (inbound or outboud). ")
  public DirectionEnum getDirection() {
    return direction;
  }

  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Rule rule = (Rule) o;
    return Objects.equals(this.protocol, rule.protocol) &&
        Objects.equals(this.access, rule.access) &&
        Objects.equals(this.service, rule.service) &&
        Objects.equals(this.ipRangeCidr, rule.ipRangeCidr) &&
        Objects.equals(this.name, rule.name) &&
        Objects.equals(this.ports, rule.ports) &&
        Objects.equals(this.direction, rule.direction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(protocol, access, service, ipRangeCidr, name, ports, direction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Rule {\n");
    
    sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
    sb.append("    access: ").append(toIndentedString(access)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
    sb.append("    ipRangeCidr: ").append(toIndentedString(ipRangeCidr)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
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
