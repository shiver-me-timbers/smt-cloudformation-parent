
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SecurityGroupEgress
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CidrIp",
    "CidrIpv6",
    "Description",
    "DestinationPrefixListId",
    "DestinationSecurityGroupId",
    "FromPort",
    "GroupId",
    "IpProtocol",
    "ToPort"
})
public class SecurityGroupEgress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip
     * 
     */
    @JsonProperty("CidrIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip")
    private CharSequence cidrIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6
     * 
     */
    @JsonProperty("CidrIpv6")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6")
    private CharSequence cidrIpv6;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid
     * 
     */
    @JsonProperty("DestinationPrefixListId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid")
    private CharSequence destinationPrefixListId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid
     * 
     */
    @JsonProperty("DestinationSecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid")
    private CharSequence destinationSecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport
     * 
     */
    @JsonProperty("FromPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport")
    private Integer fromPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid
     * 
     */
    @JsonProperty("GroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid")
    private CharSequence groupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol
     * 
     */
    @JsonProperty("IpProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol")
    private CharSequence ipProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport
     * 
     */
    @JsonProperty("ToPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport")
    private Integer toPort;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip
     * 
     */
    public CharSequence getCidrIp() {
        return cidrIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidrip
     * 
     */
    public void setCidrIp(CharSequence cidrIp) {
        this.cidrIp = cidrIp;
    }

    public SecurityGroupEgress withCidrIp(CharSequence cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6
     * 
     */
    public CharSequence getCidrIpv6() {
        return cidrIpv6;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-cidripv6
     * 
     */
    public void setCidrIpv6(CharSequence cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    public SecurityGroupEgress withCidrIpv6(CharSequence cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public SecurityGroupEgress withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid
     * 
     */
    public CharSequence getDestinationPrefixListId() {
        return destinationPrefixListId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationprefixlistid
     * 
     */
    public void setDestinationPrefixListId(CharSequence destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    public SecurityGroupEgress withDestinationPrefixListId(CharSequence destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid
     * 
     */
    public CharSequence getDestinationSecurityGroupId() {
        return destinationSecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-destinationsecuritygroupid
     * 
     */
    public void setDestinationSecurityGroupId(CharSequence destinationSecurityGroupId) {
        this.destinationSecurityGroupId = destinationSecurityGroupId;
    }

    public SecurityGroupEgress withDestinationSecurityGroupId(CharSequence destinationSecurityGroupId) {
        this.destinationSecurityGroupId = destinationSecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport
     * 
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-fromport
     * 
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public SecurityGroupEgress withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid
     * 
     */
    public CharSequence getGroupId() {
        return groupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-groupid
     * 
     */
    public void setGroupId(CharSequence groupId) {
        this.groupId = groupId;
    }

    public SecurityGroupEgress withGroupId(CharSequence groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol
     * 
     */
    public CharSequence getIpProtocol() {
        return ipProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-ipprotocol
     * 
     */
    public void setIpProtocol(CharSequence ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public SecurityGroupEgress withIpProtocol(CharSequence ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport
     * 
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-security-group-egress.html#cfn-ec2-securitygroupegress-toport
     * 
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    public SecurityGroupEgress withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidrIp", cidrIp).append("cidrIpv6", cidrIpv6).append("description", description).append("destinationPrefixListId", destinationPrefixListId).append("destinationSecurityGroupId", destinationSecurityGroupId).append("fromPort", fromPort).append("groupId", groupId).append("ipProtocol", ipProtocol).append("toPort", toPort).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationPrefixListId).append(fromPort).append(groupId).append(toPort).append(description).append(cidrIpv6).append(ipProtocol).append(destinationSecurityGroupId).append(cidrIp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityGroupEgress) == false) {
            return false;
        }
        SecurityGroupEgress rhs = ((SecurityGroupEgress) other);
        return new EqualsBuilder().append(destinationPrefixListId, rhs.destinationPrefixListId).append(fromPort, rhs.fromPort).append(groupId, rhs.groupId).append(toPort, rhs.toPort).append(description, rhs.description).append(cidrIpv6, rhs.cidrIpv6).append(ipProtocol, rhs.ipProtocol).append(destinationSecurityGroupId, rhs.destinationSecurityGroupId).append(cidrIp, rhs.cidrIp).isEquals();
    }

}
