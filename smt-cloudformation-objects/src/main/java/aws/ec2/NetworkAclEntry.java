
package aws.ec2;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
     * NetworkAclEntryIcmp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
     * 
     */
    @JsonProperty("Icmp")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html")
    private Property<NetworkAclEntryIcmp> icmp;
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
     * NetworkAclEntryPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
     * 
     */
    @JsonProperty("PortRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html")
    private Property<NetworkAclEntryPortRange> portRange;
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
    @JsonIgnore
    public CharSequence getCidrBlock() {
        return cidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-cidrblock
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Boolean getEgress() {
        return egress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-egress
     * 
     */
    @JsonIgnore
    public void setEgress(Boolean egress) {
        this.egress = egress;
    }

    public NetworkAclEntry withEgress(Boolean egress) {
        this.egress = egress;
        return this;
    }

    /**
     * NetworkAclEntryIcmp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
     * 
     */
    @JsonIgnore
    public Property<NetworkAclEntryIcmp> getIcmp() {
        return icmp;
    }

    /**
     * NetworkAclEntryIcmp
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-icmp.html
     * 
     */
    @JsonIgnore
    public void setIcmp(Property<NetworkAclEntryIcmp> icmp) {
        this.icmp = icmp;
    }

    public NetworkAclEntry withIcmp(Property<NetworkAclEntryIcmp> icmp) {
        this.icmp = icmp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock
     * 
     */
    @JsonIgnore
    public CharSequence getIpv6CidrBlock() {
        return ipv6CidrBlock;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ipv6cidrblock
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getNetworkAclId() {
        return networkAclId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-networkaclid
     * 
     */
    @JsonIgnore
    public void setNetworkAclId(CharSequence networkAclId) {
        this.networkAclId = networkAclId;
    }

    public NetworkAclEntry withNetworkAclId(CharSequence networkAclId) {
        this.networkAclId = networkAclId;
        return this;
    }

    /**
     * NetworkAclEntryPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
     * 
     */
    @JsonIgnore
    public Property<NetworkAclEntryPortRange> getPortRange() {
        return portRange;
    }

    /**
     * NetworkAclEntryPortRange
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-networkaclentry-portrange.html
     * 
     */
    @JsonIgnore
    public void setPortRange(Property<NetworkAclEntryPortRange> portRange) {
        this.portRange = portRange;
    }

    public NetworkAclEntry withPortRange(Property<NetworkAclEntryPortRange> portRange) {
        this.portRange = portRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol
     * 
     */
    @JsonIgnore
    public Integer getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-protocol
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getRuleAction() {
        return ruleAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-ruleaction
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Integer getRuleNumber() {
        return ruleNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-network-acl-entry.html#cfn-ec2-networkaclentry-rulenumber
     * 
     */
    @JsonIgnore
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
