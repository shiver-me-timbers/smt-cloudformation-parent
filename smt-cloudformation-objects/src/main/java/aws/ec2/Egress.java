
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Egress
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html
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
    "IpProtocol",
    "ToPort"
})
public class Egress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip
     * 
     */
    @JsonProperty("CidrIp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip")
    private CharSequence cidrIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6
     * 
     */
    @JsonProperty("CidrIpv6")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6")
    private CharSequence cidrIpv6;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid
     * 
     */
    @JsonProperty("DestinationPrefixListId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid")
    private CharSequence destinationPrefixListId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid
     * 
     */
    @JsonProperty("DestinationSecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid")
    private CharSequence destinationSecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport
     * 
     */
    @JsonProperty("FromPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport")
    private Integer fromPort;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol
     * 
     */
    @JsonProperty("IpProtocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol")
    private CharSequence ipProtocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport
     * 
     */
    @JsonProperty("ToPort")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport")
    private Integer toPort;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip
     * 
     */
    public CharSequence getCidrIp() {
        return cidrIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip
     * 
     */
    public void setCidrIp(CharSequence cidrIp) {
        this.cidrIp = cidrIp;
    }

    public Egress withCidrIp(CharSequence cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6
     * 
     */
    public CharSequence getCidrIpv6() {
        return cidrIpv6;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6
     * 
     */
    public void setCidrIpv6(CharSequence cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    public Egress withCidrIpv6(CharSequence cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Egress withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid
     * 
     */
    public CharSequence getDestinationPrefixListId() {
        return destinationPrefixListId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid
     * 
     */
    public void setDestinationPrefixListId(CharSequence destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    public Egress withDestinationPrefixListId(CharSequence destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid
     * 
     */
    public CharSequence getDestinationSecurityGroupId() {
        return destinationSecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid
     * 
     */
    public void setDestinationSecurityGroupId(CharSequence destinationSecurityGroupId) {
        this.destinationSecurityGroupId = destinationSecurityGroupId;
    }

    public Egress withDestinationSecurityGroupId(CharSequence destinationSecurityGroupId) {
        this.destinationSecurityGroupId = destinationSecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport
     * 
     */
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport
     * 
     */
    public void setFromPort(Integer fromPort) {
        this.fromPort = fromPort;
    }

    public Egress withFromPort(Integer fromPort) {
        this.fromPort = fromPort;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol
     * 
     */
    public CharSequence getIpProtocol() {
        return ipProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol
     * 
     */
    public void setIpProtocol(CharSequence ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public Egress withIpProtocol(CharSequence ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport
     * 
     */
    public Integer getToPort() {
        return toPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport
     * 
     */
    public void setToPort(Integer toPort) {
        this.toPort = toPort;
    }

    public Egress withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidrIp", cidrIp).append("cidrIpv6", cidrIpv6).append("description", description).append("destinationPrefixListId", destinationPrefixListId).append("destinationSecurityGroupId", destinationSecurityGroupId).append("fromPort", fromPort).append("ipProtocol", ipProtocol).append("toPort", toPort).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationPrefixListId).append(fromPort).append(toPort).append(description).append(cidrIpv6).append(ipProtocol).append(destinationSecurityGroupId).append(cidrIp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Egress) == false) {
            return false;
        }
        Egress rhs = ((Egress) other);
        return new EqualsBuilder().append(destinationPrefixListId, rhs.destinationPrefixListId).append(fromPort, rhs.fromPort).append(toPort, rhs.toPort).append(description, rhs.description).append(cidrIpv6, rhs.cidrIpv6).append(ipProtocol, rhs.ipProtocol).append(destinationSecurityGroupId, rhs.destinationSecurityGroupId).append(cidrIp, rhs.cidrIp).isEquals();
    }

}
