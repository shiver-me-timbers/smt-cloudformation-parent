
package aws.elasticache;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheSecurityGroupName",
    "EC2SecurityGroupName",
    "EC2SecurityGroupOwnerId"
})
public class SecurityGroupIngress {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname
     * 
     */
    @JsonProperty("CacheSecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname")
    private CharSequence cacheSecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname
     * 
     */
    @JsonProperty("EC2SecurityGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname")
    private CharSequence eC2SecurityGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid
     * 
     */
    @JsonProperty("EC2SecurityGroupOwnerId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid")
    private CharSequence eC2SecurityGroupOwnerId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname
     * 
     */
    public CharSequence getCacheSecurityGroupName() {
        return cacheSecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-cachesecuritygroupname
     * 
     */
    public void setCacheSecurityGroupName(CharSequence cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
    }

    public SecurityGroupIngress withCacheSecurityGroupName(CharSequence cacheSecurityGroupName) {
        this.cacheSecurityGroupName = cacheSecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname
     * 
     */
    public CharSequence getEC2SecurityGroupName() {
        return eC2SecurityGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupname
     * 
     */
    public void setEC2SecurityGroupName(CharSequence eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
    }

    public SecurityGroupIngress withEC2SecurityGroupName(CharSequence eC2SecurityGroupName) {
        this.eC2SecurityGroupName = eC2SecurityGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid
     * 
     */
    public CharSequence getEC2SecurityGroupOwnerId() {
        return eC2SecurityGroupOwnerId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-security-group-ingress.html#cfn-elasticache-securitygroupingress-ec2securitygroupownerid
     * 
     */
    public void setEC2SecurityGroupOwnerId(CharSequence eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
    }

    public SecurityGroupIngress withEC2SecurityGroupOwnerId(CharSequence eC2SecurityGroupOwnerId) {
        this.eC2SecurityGroupOwnerId = eC2SecurityGroupOwnerId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cacheSecurityGroupName", cacheSecurityGroupName).append("eC2SecurityGroupName", eC2SecurityGroupName).append("eC2SecurityGroupOwnerId", eC2SecurityGroupOwnerId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eC2SecurityGroupOwnerId).append(eC2SecurityGroupName).append(cacheSecurityGroupName).toHashCode();
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
        return new EqualsBuilder().append(eC2SecurityGroupOwnerId, rhs.eC2SecurityGroupOwnerId).append(eC2SecurityGroupName, rhs.eC2SecurityGroupName).append(cacheSecurityGroupName, rhs.cacheSecurityGroupName).isEquals();
    }

}
