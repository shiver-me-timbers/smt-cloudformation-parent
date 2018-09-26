
package aws.redshift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ClusterSecurityGroupIngress
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CIDRIP",
    "ClusterSecurityGroupName",
    "EC2SecurityGroupName",
    "EC2SecurityGroupOwnerId"
})
public class ClusterSecurityGroupIngress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip
     * 
     */
    @JsonProperty("CIDRIP")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip")
    private CharSequence cIDRIP;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname
     * 
     */
    @JsonProperty("ClusterSecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname")
    private CharSequence clusterSecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname")
    private CharSequence eC2SecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid")
    private CharSequence eC2SecurityGroupOwnerId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip
     * 
     */
    public CharSequence getCIDRIP() {
        return cIDRIP;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-cidrip
     * 
     */
    public void setCIDRIP(CharSequence cIDRIP) {
        this.cIDRIP = cIDRIP;
    }

    public ClusterSecurityGroupIngress withCIDRIP(CharSequence cIDRIP) {
        this.cIDRIP = cIDRIP;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname
     * 
     */
    public CharSequence getClusterSecurityGroupName() {
        return clusterSecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-clustersecuritygroupname
     * 
     */
    public void setClusterSecurityGroupName(CharSequence clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
    }

    public ClusterSecurityGroupIngress withClusterSecurityGroupName(CharSequence clusterSecurityGroupName) {
        this.clusterSecurityGroupName = clusterSecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname
     * 
     */
    public CharSequence getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupname
     * 
     */
    public void setEC2SecurityGroupName(CharSequence eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    public ClusterSecurityGroupIngress withEC2SecurityGroupName(CharSequence eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid
     * 
     */
    public CharSequence getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroupingress.html#cfn-redshift-clustersecuritygroupingress-ec2securitygroupownerid
     * 
     */
    public void setEC2SecurityGroupOwnerId(CharSequence eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    public ClusterSecurityGroupIngress withEC2SecurityGroupOwnerId(CharSequence eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cIDRIP", cIDRIP).append("clusterSecurityGroupName", clusterSecurityGroupName).append("eC2SecurityGroupName", eC2SecurityGroupName).append("eC2SecurityGroupOwnerId", eC2SecurityGroupOwnerId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eC2SecurityGroupOwnerId).append(eC2SecurityGroupName).append(clusterSecurityGroupName).append(cIDRIP).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterSecurityGroupIngress) == false) {
            return false;
        }
        ClusterSecurityGroupIngress rhs = ((ClusterSecurityGroupIngress) other);
        return new EqualsBuilder().append(eC2SecurityGroupOwnerId, rhs.eC2SecurityGroupOwnerId).append(eC2SecurityGroupName, rhs.eC2SecurityGroupName).append(clusterSecurityGroupName, rhs.clusterSecurityGroupName).append(cIDRIP, rhs.cIDRIP).isEquals();
    }

}
