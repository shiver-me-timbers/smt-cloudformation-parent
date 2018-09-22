
package aws.rds;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CIDRIP",
    "EC2SecurityGroupId",
    "EC2SecurityGroupName",
    "EC2SecurityGroupOwnerId"
})
public class Ingress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip")
    private String cIDRIP;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid")
    private String eC2SecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname")
    private String eC2SecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid")
    private String eC2SecurityGroupOwnerId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    public String getCIDRIP() {
        return cIDRIP;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    public Ingress withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    public String getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }

    public Ingress withEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    public Ingress withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-security-group-rule.html#cfn-rds-securitygroup-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    public Ingress withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cIDRIP", cIDRIP).append("eC2SecurityGroupId", eC2SecurityGroupId).append("eC2SecurityGroupName", eC2SecurityGroupName).append("eC2SecurityGroupOwnerId", eC2SecurityGroupOwnerId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eC2SecurityGroupId).append(eC2SecurityGroupOwnerId).append(eC2SecurityGroupName).append(cIDRIP).toHashCode();
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
        return new EqualsBuilder().append(eC2SecurityGroupId, rhs.eC2SecurityGroupId).append(eC2SecurityGroupOwnerId, rhs.eC2SecurityGroupOwnerId).append(eC2SecurityGroupName, rhs.eC2SecurityGroupName).append(cIDRIP, rhs.cIDRIP).isEquals();
    }

}
