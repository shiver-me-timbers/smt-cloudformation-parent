
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
 * ClusterScalingAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Market",
    "SimpleScalingPolicyConfiguration"
})
public class ClusterScalingAction implements Property<ClusterScalingAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market
     * 
     */
    @JsonProperty("Market")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market")
    private CharSequence market;
    /**
     * ClusterSimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("SimpleScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html")
    private Property<ClusterSimpleScalingPolicyConfiguration> simpleScalingPolicyConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market
     * 
     */
    @JsonIgnore
    public CharSequence getMarket() {
        return market;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market
     * 
     */
    @JsonIgnore
    public void setMarket(CharSequence market) {
        this.market = market;
    }

    public ClusterScalingAction withMarket(CharSequence market) {
        this.market = market;
        return this;
    }

    /**
     * ClusterSimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ClusterSimpleScalingPolicyConfiguration> getSimpleScalingPolicyConfiguration() {
        return simpleScalingPolicyConfiguration;
    }

    /**
     * ClusterSimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonIgnore
    public void setSimpleScalingPolicyConfiguration(Property<ClusterSimpleScalingPolicyConfiguration> simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
    }

    public ClusterScalingAction withSimpleScalingPolicyConfiguration(Property<ClusterSimpleScalingPolicyConfiguration> simpleScalingPolicyConfiguration) {
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
        if ((other instanceof ClusterScalingAction) == false) {
            return false;
        }
        ClusterScalingAction rhs = ((ClusterScalingAction) other);
        return new EqualsBuilder().append(market, rhs.market).append(simpleScalingPolicyConfiguration, rhs.simpleScalingPolicyConfiguration).isEquals();
    }

}
