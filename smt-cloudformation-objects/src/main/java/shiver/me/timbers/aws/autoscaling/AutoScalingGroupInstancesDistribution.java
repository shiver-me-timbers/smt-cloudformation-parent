
package shiver.me.timbers.aws.autoscaling;

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
 * AutoScalingGroupInstancesDistribution
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnDemandAllocationStrategy",
    "OnDemandBaseCapacity",
    "OnDemandPercentageAboveBaseCapacity",
    "SpotAllocationStrategy",
    "SpotInstancePools",
    "SpotMaxPrice"
})
public class AutoScalingGroupInstancesDistribution implements Property<AutoScalingGroupInstancesDistribution>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandallocationstrategy
     * 
     */
    @JsonProperty("OnDemandAllocationStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandallocationstrategy")
    private CharSequence onDemandAllocationStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandbasecapacity
     * 
     */
    @JsonProperty("OnDemandBaseCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandbasecapacity")
    private Number onDemandBaseCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandpercentageabovebasecapacity
     * 
     */
    @JsonProperty("OnDemandPercentageAboveBaseCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandpercentageabovebasecapacity")
    private Number onDemandPercentageAboveBaseCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotallocationstrategy
     * 
     */
    @JsonProperty("SpotAllocationStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotallocationstrategy")
    private CharSequence spotAllocationStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotinstancepools
     * 
     */
    @JsonProperty("SpotInstancePools")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotinstancepools")
    private Number spotInstancePools;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotmaxprice
     * 
     */
    @JsonProperty("SpotMaxPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotmaxprice")
    private CharSequence spotMaxPrice;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandallocationstrategy
     * 
     */
    @JsonIgnore
    public CharSequence getOnDemandAllocationStrategy() {
        return onDemandAllocationStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandallocationstrategy
     * 
     */
    @JsonIgnore
    public void setOnDemandAllocationStrategy(CharSequence onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
    }

    public AutoScalingGroupInstancesDistribution withOnDemandAllocationStrategy(CharSequence onDemandAllocationStrategy) {
        this.onDemandAllocationStrategy = onDemandAllocationStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandbasecapacity
     * 
     */
    @JsonIgnore
    public Number getOnDemandBaseCapacity() {
        return onDemandBaseCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandbasecapacity
     * 
     */
    @JsonIgnore
    public void setOnDemandBaseCapacity(Number onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
    }

    public AutoScalingGroupInstancesDistribution withOnDemandBaseCapacity(Number onDemandBaseCapacity) {
        this.onDemandBaseCapacity = onDemandBaseCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandpercentageabovebasecapacity
     * 
     */
    @JsonIgnore
    public Number getOnDemandPercentageAboveBaseCapacity() {
        return onDemandPercentageAboveBaseCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-ondemandpercentageabovebasecapacity
     * 
     */
    @JsonIgnore
    public void setOnDemandPercentageAboveBaseCapacity(Number onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
    }

    public AutoScalingGroupInstancesDistribution withOnDemandPercentageAboveBaseCapacity(Number onDemandPercentageAboveBaseCapacity) {
        this.onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotallocationstrategy
     * 
     */
    @JsonIgnore
    public CharSequence getSpotAllocationStrategy() {
        return spotAllocationStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotallocationstrategy
     * 
     */
    @JsonIgnore
    public void setSpotAllocationStrategy(CharSequence spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
    }

    public AutoScalingGroupInstancesDistribution withSpotAllocationStrategy(CharSequence spotAllocationStrategy) {
        this.spotAllocationStrategy = spotAllocationStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotinstancepools
     * 
     */
    @JsonIgnore
    public Number getSpotInstancePools() {
        return spotInstancePools;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotinstancepools
     * 
     */
    @JsonIgnore
    public void setSpotInstancePools(Number spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
    }

    public AutoScalingGroupInstancesDistribution withSpotInstancePools(Number spotInstancePools) {
        this.spotInstancePools = spotInstancePools;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotmaxprice
     * 
     */
    @JsonIgnore
    public CharSequence getSpotMaxPrice() {
        return spotMaxPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-mixedinstancespolicy-instancesdistribution.html#cfn-autoscaling-autoscalinggroup-instancesdistribution-spotmaxprice
     * 
     */
    @JsonIgnore
    public void setSpotMaxPrice(CharSequence spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
    }

    public AutoScalingGroupInstancesDistribution withSpotMaxPrice(CharSequence spotMaxPrice) {
        this.spotMaxPrice = spotMaxPrice;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onDemandAllocationStrategy", onDemandAllocationStrategy).append("onDemandBaseCapacity", onDemandBaseCapacity).append("onDemandPercentageAboveBaseCapacity", onDemandPercentageAboveBaseCapacity).append("spotAllocationStrategy", spotAllocationStrategy).append("spotInstancePools", spotInstancePools).append("spotMaxPrice", spotMaxPrice).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onDemandBaseCapacity).append(spotInstancePools).append(spotMaxPrice).append(spotAllocationStrategy).append(onDemandAllocationStrategy).append(onDemandPercentageAboveBaseCapacity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingGroupInstancesDistribution) == false) {
            return false;
        }
        AutoScalingGroupInstancesDistribution rhs = ((AutoScalingGroupInstancesDistribution) other);
        return new EqualsBuilder().append(onDemandBaseCapacity, rhs.onDemandBaseCapacity).append(spotInstancePools, rhs.spotInstancePools).append(spotMaxPrice, rhs.spotMaxPrice).append(spotAllocationStrategy, rhs.spotAllocationStrategy).append(onDemandAllocationStrategy, rhs.onDemandAllocationStrategy).append(onDemandPercentageAboveBaseCapacity, rhs.onDemandPercentageAboveBaseCapacity).isEquals();
    }

}
