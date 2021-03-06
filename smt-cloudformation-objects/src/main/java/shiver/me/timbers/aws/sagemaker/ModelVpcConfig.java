
package shiver.me.timbers.aws.sagemaker;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ModelVpcConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Subnets",
    "SecurityGroupIds"
})
public class ModelVpcConfig implements Property<ModelVpcConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets
     * 
     */
    @JsonProperty("Subnets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets")
    private List<CharSequence> subnets = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-subnets
     * 
     */
    @JsonIgnore
    public void setSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
    }

    public ModelVpcConfig withSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-model-vpcconfig.html#cfn-sagemaker-model-vpcconfig-securitygroupids
     * 
     */
    @JsonIgnore
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public ModelVpcConfig withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subnets", subnets).append("securityGroupIds", securityGroupIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnets).append(securityGroupIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ModelVpcConfig) == false) {
            return false;
        }
        ModelVpcConfig rhs = ((ModelVpcConfig) other);
        return new EqualsBuilder().append(subnets, rhs.subnets).append(securityGroupIds, rhs.securityGroupIds).isEquals();
    }

}
