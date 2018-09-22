
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
    private String cIDRIP;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname
     * 
     */
    @JsonProperty("DBSecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname")
    private String dBSecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid")
    private String eC2SecurityGroupId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname")
    private String eC2SecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid")
    private String eC2SecurityGroupOwnerId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    public String getCIDRIP() {
        return cIDRIP;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    public void setCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    public DBSecurityGroupIngress withCIDRIP(String cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname
     * 
     */
    @JsonProperty("DBSecurityGroupName")
    public String getDBSecurityGroupName() {
        return dBSecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-dbsecuritygroupname
     * 
     */
    @JsonProperty("DBSecurityGroupName")
    public void setDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
    }

    public DBSecurityGroupIngress withDBSecurityGroupName(String dBSecurityGroupName) {
        this.dBSecurityGroupName = dBSecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    public String getEC2SecurityGroupId() {
        return eC2SecurityGroupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupid
     * 
     */
    @JsonProperty("EC2SecurityGroupId")
    public void setEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
    }

    public DBSecurityGroupIngress withEC2SecurityGroupId(String eC2SecurityGroupId) {
        this.eC2SecurityGroupId = eC2SecurityGroupId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    public String getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    public void setEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    public DBSecurityGroupIngress withEC2SecurityGroupName(String eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    public String getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-security-group-ingress.html#cfn-rds-securitygroup-ingress-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    public void setEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    public DBSecurityGroupIngress withEC2SecurityGroupOwnerId(String eC2SecurityGroupOwnerId) {
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
