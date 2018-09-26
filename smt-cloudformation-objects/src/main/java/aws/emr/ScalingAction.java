
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalingAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Market",
    "SimpleScalingPolicyConfiguration"
})
public class ScalingAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market
     * 
     */
    @JsonProperty("Market")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market")
    private CharSequence market;
    /**
     * SimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
     * 
     */
    @JsonProperty("SimpleScalingPolicyConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html")
    private SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market
     * 
     */
    public CharSequence getMarket() {
        return market;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-scalingaction.html#cfn-elasticmapreduce-cluster-scalingaction-market
     * 
     */
    public void setMarket(CharSequence market) {
        this.market = market;
    }

    public ScalingAction withMarket(CharSequence market) {
        this.market = market;
        return this;
    }

    /**
     * SimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
     * 
     */
    public SimpleScalingPolicyConfiguration getSimpleScalingPolicyConfiguration() {
        return simpleScalingPolicyConfiguration;
    }

    /**
     * SimpleScalingPolicyConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-simplescalingpolicyconfiguration.html
     * 
     */
    public void setSimpleScalingPolicyConfiguration(SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration) {
        this.simpleScalingPolicyConfiguration = simpleScalingPolicyConfiguration;
    }

    public ScalingAction withSimpleScalingPolicyConfiguration(SimpleScalingPolicyConfiguration simpleScalingPolicyConfiguration) {
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
        if ((other instanceof ScalingAction) == false) {
            return false;
        }
        ScalingAction rhs = ((ScalingAction) other);
        return new EqualsBuilder().append(market, rhs.market).append(simpleScalingPolicyConfiguration, rhs.simpleScalingPolicyConfiguration).isEquals();
    }

}
