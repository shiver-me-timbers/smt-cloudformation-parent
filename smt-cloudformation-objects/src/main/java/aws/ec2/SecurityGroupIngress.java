
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SecurityGroupIngress
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CidrIp",
    "CidrIpv6",
    "Description",
    "FromPort",
    "GroupId",
    "GroupName",
    "IpProtocol",
    "SourceSecurityGroupId",
    "SourceSecurityGroupName",
    "SourceSecurityGroupOwnerId",
    "ToPort"
})
public class SecurityGroupIngress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip
     * 
     */
    @JsonProperty("CidrIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip")
    private CharSequence cidrIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6
     * 
     */
    @JsonProperty("CidrIpv6")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6")
    private CharSequence cidrIpv6;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport
     * 
     */
    @JsonProperty("FromPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport")
    private Integer fromPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid
     * 
     */
    @JsonProperty("GroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid")
    private CharSequence groupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname")
    private CharSequence groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol
     * 
     */
    @JsonProperty("IpProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol")
    private CharSequence ipProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid
     * 
     */
    @JsonProperty("SourceSecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid")
    private CharSequence sourceSecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname
     * 
     */
    @JsonProperty("SourceSecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname")
    private CharSequence sourceSecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid
     * 
     */
    @JsonProperty("SourceSecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid")
    private CharSequence sourceSecurityGroupOwnerId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport
     * 
     */
    @JsonProperty("ToPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport")
    private Integer toPort;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip
     * 
     */
    public CharSequence getCidrIp() {
        return cidrIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidrip
     * 
     */
    public void setCidrIp(CharSequence cidrIp) {
        this.cidrIp = cidrIp;
    }

    public SecurityGroupIngress withCidrIp(CharSequence cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6
     * 
     */
    public CharSequence getCidrIpv6() {
        return cidrIpv6;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-cidripv6
     * 
     */
    public void setCidrIpv6(CharSequence cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    public SecurityGroupIngress withCidrIpv6(CharSequence cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public SecurityGroupIngress withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport
     * 
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-fromport
     * 
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public SecurityGroupIngress withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid
     * 
     */
    public CharSequence getGroupId() {
        return groupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupid
     * 
     */
    public void setGroupId(CharSequence groupId) {
        this.groupId = groupId;
    }

    public SecurityGroupIngress withGroupId(CharSequence groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname
     * 
     */
    public CharSequence getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-groupname
     * 
     */
    public void setGroupName(CharSequence groupName) {
        this.groupName = groupName;
    }

    public SecurityGroupIngress withGroupName(CharSequence groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol
     * 
     */
    public CharSequence getIpProtocol() {
        return ipProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-ipprotocol
     * 
     */
    public void setIpProtocol(CharSequence ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public SecurityGroupIngress withIpProtocol(CharSequence ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid
     * 
     */
    public CharSequence getSourceSecurityGroupId() {
        return sourceSecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupid
     * 
     */
    public void setSourceSecurityGroupId(CharSequence sourceSecurityGroupId) {
        this.sourceSecurityGroupId = sourceSecurityGroupId;
    }

    public SecurityGroupIngress withSourceSecurityGroupId(CharSequence sourceSecurityGroupId) {
        this.sourceSecurityGroupId = sourceSecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname
     * 
     */
    public CharSequence getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupname
     * 
     */
    public void setSourceSecurityGroupName(CharSequence sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    public SecurityGroupIngress withSourceSecurityGroupName(CharSequence sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid
     * 
     */
    public CharSequence getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-sourcesecuritygroupownerid
     * 
     */
    public void setSourceSecurityGroupOwnerId(CharSequence sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    public SecurityGroupIngress withSourceSecurityGroupOwnerId(CharSequence sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport
     * 
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-ingress.html#cfn-ec2-security-group-ingress-toport
     * 
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    public SecurityGroupIngress withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidrIp", cidrIp).append("cidrIpv6", cidrIpv6).append("description", description).append("fromPort", fromPort).append("groupId", groupId).append("groupName", groupName).append("ipProtocol", ipProtocol).append("sourceSecurityGroupId", sourceSecurityGroupId).append("sourceSecurityGroupName", sourceSecurityGroupName).append("sourceSecurityGroupOwnerId", sourceSecurityGroupOwnerId).append("toPort", toPort).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceSecurityGroupName).append(groupName).append(fromPort).append(groupId).append(toPort).append(description).append(cidrIpv6).append(ipProtocol).append(sourceSecurityGroupOwnerId).append(cidrIp).append(sourceSecurityGroupId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SecurityGroupIngress) == false) {
            return false;
        }
        SecurityGroupIngress rhs = ((SecurityGroupIngress) other);
        return new EqualsBuilder().append(sourceSecurityGroupName, rhs.sourceSecurityGroupName).append(groupName, rhs.groupName).append(fromPort, rhs.fromPort).append(groupId, rhs.groupId).append(toPort, rhs.toPort).append(description, rhs.description).append(cidrIpv6, rhs.cidrIpv6).append(ipProtocol, rhs.ipProtocol).append(sourceSecurityGroupOwnerId, rhs.sourceSecurityGroupOwnerId).append(cidrIp, rhs.cidrIp).append(sourceSecurityGroupId, rhs.sourceSecurityGroupId).isEquals();
    }

}
