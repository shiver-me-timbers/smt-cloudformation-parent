
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NetworkAclEntry
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CidrBlock",
    "Egress",
    "Icmp",
    "Ipv6CidrBlock",
    "NetworkAclId",
    "PortRange",
    "Protocol",
    "RuleAction",
    "RuleNumber"
})
public class NetworkAclEntry {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock
     * 
     */
    @JsonProperty("CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock")
    private CharSequence cidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress
     * 
     */
    @JsonProperty("Egress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress")
    private Boolean egress;
    /**
     * Icmp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
     * 
     */
    @JsonProperty("Icmp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html")
    private Icmp icmp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock
     * 
     */
    @JsonProperty("Ipv6CidrBlock")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock")
    private CharSequence ipv6CidrBlock;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid
     * 
     */
    @JsonProperty("NetworkAclId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid")
    private CharSequence networkAclId;
    /**
     * PortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
     * 
     */
    @JsonProperty("PortRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html")
    private PortRange portRange;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol")
    private Integer protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction
     * 
     */
    @JsonProperty("RuleAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction")
    private CharSequence ruleAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber
     * 
     */
    @JsonProperty("RuleNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber")
    private Integer ruleNumber;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock
     * 
     */
    public CharSequence getCidrBlock() {
        return cidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock
     * 
     */
    public void setCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
    }

    public NetworkAclEntry withCidrBlock(CharSequence cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress
     * 
     */
    public Boolean getEgress() {
        return egress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress
     * 
     */
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    public NetworkAclEntry withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * Icmp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
     * 
     */
    public Icmp getIcmp() {
        return icmp;
    }

    /**
     * Icmp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
     * 
     */
    public void setIcmp(Icmp icmp) {
        this.icmp = icmp;
    }

    public NetworkAclEntry withIcmp(Icmp icmp) {
        this.icmp = icmp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock
     * 
     */
    public CharSequence getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock
     * 
     */
    public void setIpv6CidrBlock(CharSequence ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
    }

    public NetworkAclEntry withIpv6CidrBlock(CharSequence ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid
     * 
     */
    public CharSequence getNetworkAclId() {
        return networkAclId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid
     * 
     */
    public void setNetworkAclId(CharSequence networkAclId) {
        this.networkAclId = networkAclId;
    }

    public NetworkAclEntry withNetworkAclId(CharSequence networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * PortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
     * 
     */
    public PortRange getPortRange() {
        return portRange;
    }

    /**
     * PortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
     * 
     */
    public void setPortRange(PortRange portRange) {
        this.portRange = portRange;
    }

    public NetworkAclEntry withPortRange(PortRange portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol
     * 
     */
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol
     * 
     */
    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }

    public NetworkAclEntry withProtocol(Integer protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction
     * 
     */
    public CharSequence getRuleAction() {
        return ruleAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction
     * 
     */
    public void setRuleAction(CharSequence ruleAction) {
        this.ruleAction = ruleAction;
    }

    public NetworkAclEntry withRuleAction(CharSequence ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber
     * 
     */
    public Integer getRuleNumber() {
        return ruleNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber
     * 
     */
    public void setRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
    }

    public NetworkAclEntry withRuleNumber(Integer ruleNumber) {
        this.ruleNumber = ruleNumber;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidrBlock", cidrBlock).append("egress", egress).append("icmp", icmp).append("ipv6CidrBlock", ipv6CidrBlock).append("networkAclId", networkAclId).append("portRange", portRange).append("protocol", protocol).append("ruleAction", ruleAction).append("ruleNumber", ruleNumber).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(portRange).append(ruleAction).append(protocol).append(cidrBlock).append(ruleNumber).append(icmp).append(ipv6CidrBlock).append(egress).append(networkAclId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof NetworkAclEntry) == false) {
            return false;
        }
        NetworkAclEntry rhs = ((NetworkAclEntry) other);
        return new EqualsBuilder().append(portRange, rhs.portRange).append(ruleAction, rhs.ruleAction).append(protocol, rhs.protocol).append(cidrBlock, rhs.cidrBlock).append(ruleNumber, rhs.ruleNumber).append(icmp, rhs.icmp).append(ipv6CidrBlock, rhs.ipv6CidrBlock).append(egress, rhs.egress).append(networkAclId, rhs.networkAclId).isEquals();
    }

}
