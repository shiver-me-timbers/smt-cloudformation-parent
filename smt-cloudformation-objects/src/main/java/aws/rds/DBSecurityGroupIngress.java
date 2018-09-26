
package aws.rds;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DBSecurityGroupIngress
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CIDRIP",
    "DBSecurityGroupName",
    "EC2SecurityGroupId",
    "EC2SecurityGroupName",
    "EC2SecurityGroupOwnerId"
})
public class DBSecurityGroupIngress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip")
    private CharSequence cIDRIP;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname
     * 
     */
    @JsonProperty("DBSecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname")
    private CharSequence dBSecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid")
    private CharSequence eC2SecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname")
    private CharSequence eC2SecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid")
    private CharSequence eC2SecurityGroupOwnerId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip
     * 
     */
    public CharSequence getCIDRIP() {
        return cIDRIP;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip
     * 
     */
    public void setCIDRIP(CharSequence cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    public DBSecurityGroupIngress withCIDRIP(CharSequence cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname
     * 
     */
    public CharSequence getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname
     * 
     */
    public void setDBSecurityGroupName(CharSequence dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    public DBSecurityGroupIngress withDBSecurityGroupName(CharSequence dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid
     * 
     */
    public CharSequence getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid
     * 
     */
    public void setEC2SecurityGroupId(CharSequence eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }

    public DBSecurityGroupIngress withEC2SecurityGroupId(CharSequence eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname
     * 
     */
    public CharSequence getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname
     * 
     */
    public void setEC2SecurityGroupName(CharSequence eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    public DBSecurityGroupIngress withEC2SecurityGroupName(CharSequence eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid
     * 
     */
    public CharSequence getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid
     * 
     */
    public void setEC2SecurityGroupOwnerId(CharSequence eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    public DBSecurityGroupIngress withEC2SecurityGroupOwnerId(CharSequence eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cIDRIP", cIDRIP).append("dBSecurityGroupName", dBSecurityGroupName).append("eC2SecurityGroupId", eC2SecurityGroupId).append("eC2SecurityGroupName", eC2SecurityGroupName).append("eC2SecurityGroupOwnerId", eC2SecurityGroupOwnerId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eC2SecurityGroupId).append(eC2SecurityGroupOwnerId).append(eC2SecurityGroupName).append(dBSecurityGroupName).append(cIDRIP).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBSecurityGroupIngress) == false) {
            return false;
        }
        DBSecurityGroupIngress rhs = ((DBSecurityGroupIngress) other);
        return new EqualsBuilder().append(eC2SecurityGroupId, rhs.eC2SecurityGroupId).append(eC2SecurityGroupOwnerId, rhs.eC2SecurityGroupOwnerId).append(eC2SecurityGroupName, rhs.eC2SecurityGroupName).append(dBSecurityGroupName, rhs.dBSecurityGroupName).append(cIDRIP, rhs.cIDRIP).isEquals();
    }

}
