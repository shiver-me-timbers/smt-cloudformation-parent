
package aws.lambda;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VpcConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SecurityGroupIds",
    "SubnetIds"
})
public class VpcConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids")
    private Set<CharSequence> securityGroupIds = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids")
    private Set<CharSequence> subnetIds = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids
     * 
     */
    public Set<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-securitygroupids
     * 
     */
    public void setSecurityGroupIds(Set<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public VpcConfig withSecurityGroupIds(Set<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids
     * 
     */
    public Set<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-function-vpcconfig.html#cfn-lambda-function-vpcconfig-subnetids
     * 
     */
    public void setSubnetIds(Set<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public VpcConfig withSubnetIds(Set<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroupIds", securityGroupIds).append("subnetIds", subnetIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityGroupIds).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VpcConfig) == false) {
            return false;
        }
        VpcConfig rhs = ((VpcConfig) other);
        return new EqualsBuilder().append(securityGroupIds, rhs.securityGroupIds).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
