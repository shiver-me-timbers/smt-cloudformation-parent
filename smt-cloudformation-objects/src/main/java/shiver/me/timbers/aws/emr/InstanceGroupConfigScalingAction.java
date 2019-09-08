
package shiver.me.timbers.aws.emr;

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
 * InstanceGroupConfigScalingAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Market",
    "SimpleScalingPolicyConfiguration"
})
public class InstanceGroupConfigScalingAction implements Property<InstanceGroupConfigScalingAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market
     * 
     */
    @JsonProperty("Market")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market")
    private CharSequence market;
    /**
     * InstanceGroupConfigSimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("SimpleScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html")
    private Property<InstanceGroupConfigSimpleScalingPolicyConfiguration> simpleScalingPolicyConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market
     * 
     */
    @JsonIgnore
    public CharSequence getMarket() {
        return market;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-scalingaction.html#cfn-elasticmapreduce-instancegroupconfig-scalingaction-market
     * 
     */
    @JsonIgnore
    public void setMarket(CharSequence market) {
        this.market = market;
    }

    public InstanceGroupConfigScalingAction withMarket(CharSequence market) {
        this.market = market;
        return this;
    }

    /**
     * InstanceGroupConfigSimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<InstanceGroupConfigSimpleScalingPolicyConfiguration> getSimpleScalingPolicyConfiguration() {
        return simpleScalingPolicyConfiguration;
    }

    /**
     * InstanceGroupConfigSimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancegroupconfig-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSimpleScalingPolicyConfiguration(Property<InstanceGroupConfigSimpleScalingPolicyConfiguration> simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
    }

    public InstanceGroupConfigScalingAction withSimpleScalingPolicyConfiguration(Property<InstanceGroupConfigSimpleScalingPolicyConfiguration> simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("market", market).append("simpleScalingPolicyConfiguration", simpleScalingPolicyConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(market).append(simpleScalingPolicyConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceGroupConfigScalingAction) == false) {
            return false;
        }
        InstanceGroupConfigScalingAction rhs = ((InstanceGroupConfigScalingAction) other);
        return new EqualsBuilder().append(market, rhs.market).append(simpleScalingPolicyConfiguration, rhs.simpleScalingPolicyConfiguration).isEquals();
    }

}
