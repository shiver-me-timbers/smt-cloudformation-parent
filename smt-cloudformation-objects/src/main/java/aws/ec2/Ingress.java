
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Ingress
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CidrIp",
    "CidrIpv6",
    "Description",
    "FromPort",
    "IpProtocol",
    "SourceSecurityGroupId",
    "SourceSecurityGroupName",
    "SourceSecurityGroupOwnerId",
    "ToPort"
})
public class Ingress {

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid
     * 
     */
    @JsonProperty("SourceSecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid")
    private String sourceSecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname
     * 
     */
    @JsonProperty("SourceSecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname")
    private String sourceSecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid
     * 
     */
    @JsonProperty("SourceSecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid")
    private String sourceSecurityGroupOwnerId;
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

    public Ingress withCidrIp(String cidrIp) {
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

    public Ingress withCidrIpv6(String cidrIpv6) {
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

    public Ingress withDescription(String description) {
        this.description = description;
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

    public Ingress withFromPort(Integer fromPort) {
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

    public Ingress withIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid
     * 
     */
    @JsonProperty("SourceSecurityGroupId")
    public String getSourceSecurityGroupId() {
        return sourceSecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupid
     * 
     */
    @JsonProperty("SourceSecurityGroupId")
    public void setSourceSecurityGroupId(String sourceSecurityGroupId) {
        this.sourceSecurityGroupId = sourceSecurityGroupId;
    }

    public Ingress withSourceSecurityGroupId(String sourceSecurityGroupId) {
        this.sourceSecurityGroupId = sourceSecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname
     * 
     */
    @JsonProperty("SourceSecurityGroupName")
    public String getSourceSecurityGroupName() {
        return sourceSecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupname
     * 
     */
    @JsonProperty("SourceSecurityGroupName")
    public void setSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
    }

    public Ingress withSourceSecurityGroupName(String sourceSecurityGroupName) {
        this.sourceSecurityGroupName = sourceSecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid
     * 
     */
    @JsonProperty("SourceSecurityGroupOwnerId")
    public String getSourceSecurityGroupOwnerId() {
        return sourceSecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-security-group-rule.html#cfn-ec2-security-group-rule-sourcesecuritygroupownerid
     * 
     */
    @JsonProperty("SourceSecurityGroupOwnerId")
    public void setSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
    }

    public Ingress withSourceSecurityGroupOwnerId(String sourceSecurityGroupOwnerId) {
        this.sourceSecurityGroupOwnerId = sourceSecurityGroupOwnerId;
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

    public Ingress withToPort(Integer toPort) {
        this.toPort = toPort;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cidrIp", cidrIp).append("cidrIpv6", cidrIpv6).append("description", description).append("fromPort", fromPort).append("ipProtocol", ipProtocol).append("sourceSecurityGroupId", sourceSecurityGroupId).append("sourceSecurityGroupName", sourceSecurityGroupName).append("sourceSecurityGroupOwnerId", sourceSecurityGroupOwnerId).append("toPort", toPort).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceSecurityGroupName).append(fromPort).append(toPort).append(description).append(cidrIpv6).append(ipProtocol).append(sourceSecurityGroupOwnerId).append(cidrIp).append(sourceSecurityGroupId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Ingress) == false) {
            return false;
        }
        Ingress rhs = ((Ingress) other);
        return new EqualsBuilder().append(sourceSecurityGroupName, rhs.sourceSecurityGroupName).append(fromPort, rhs.fromPort).append(toPort, rhs.toPort).append(description, rhs.description).append(cidrIpv6, rhs.cidrIpv6).append(ipProtocol, rhs.ipProtocol).append(sourceSecurityGroupOwnerId, rhs.sourceSecurityGroupOwnerId).append(cidrIp, rhs.cidrIp).append(sourceSecurityGroupId, rhs.sourceSecurityGroupId).isEquals();
    }

}
