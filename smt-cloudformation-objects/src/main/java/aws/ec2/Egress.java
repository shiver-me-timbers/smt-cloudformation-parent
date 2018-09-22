
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
    private String cidrIp;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6
     * 
     */
    @JsonProperty("CidrIpv6")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6")
    private String cidrIpv6;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid
     * 
     */
    @JsonProperty("DestinationPrefixListId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid")
    private String destinationPrefixListId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid
     * 
     */
    @JsonProperty("DestinationSecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid")
    private String destinationSecurityGroupId;
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
    private String ipProtocol;
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
    @JsonProperty("CidrIp")
    public String getCidrIp() {
        return cidrIp;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidrip
     * 
     */
    @JsonProperty("CidrIp")
    public void setCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
    }

    public Egress withCidrIp(String cidrIp) {
        this.cidrIp = cidrIp;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6
     * 
     */
    @JsonProperty("CidrIpv6")
    public String getCidrIpv6() {
        return cidrIpv6;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-cidripv6
     * 
     */
    @JsonProperty("CidrIpv6")
    public void setCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
    }

    public Egress withCidrIpv6(String cidrIpv6) {
        this.cidrIpv6 = cidrIpv6;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Egress withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid
     * 
     */
    @JsonProperty("DestinationPrefixListId")
    public String getDestinationPrefixListId() {
        return destinationPrefixListId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destinationprefixlistid
     * 
     */
    @JsonProperty("DestinationPrefixListId")
    public void setDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
    }

    public Egress withDestinationPrefixListId(String destinationPrefixListId) {
        this.destinationPrefixListId = destinationPrefixListId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid
     * 
     */
    @JsonProperty("DestinationSecurityGroupId")
    public String getDestinationSecurityGroupId() {
        return destinationSecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-destsecgroupid
     * 
     */
    @JsonProperty("DestinationSecurityGroupId")
    public void setDestinationSecurityGroupId(String destinationSecurityGroupId) {
        this.destinationSecurityGroupId = destinationSecurityGroupId;
    }

    public Egress withDestinationSecurityGroupId(String destinationSecurityGroupId) {
        this.destinationSecurityGroupId = destinationSecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport
     * 
     */
    @JsonProperty("FromPort")
    public Integer getFromPort() {
        return fromPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-fromport
     * 
     */
    @JsonProperty("FromPort")
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
    @JsonProperty("IpProtocol")
    public String getIpProtocol() {
        return ipProtocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-ipprotocol
     * 
     */
    @JsonProperty("IpProtocol")
    public void setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
    }

    public Egress withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport
     * 
     */
    @JsonProperty("ToPort")
    public Integer getToPort() {
        return toPort;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-toport
     * 
     */
    @JsonProperty("ToPort")
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
