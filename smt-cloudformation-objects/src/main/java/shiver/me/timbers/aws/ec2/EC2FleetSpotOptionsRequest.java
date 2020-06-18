
package shiver.me.timbers.aws.ec2;

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
 * EC2FleetSpotOptionsRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SingleAvailabilityZone",
    "AllocationStrategy",
    "SingleInstanceType",
    "MinTargetCapacity",
    "MaxTotalPrice",
    "InstanceInterruptionBehavior",
    "InstancePoolsToUseCount"
})
public class EC2FleetSpotOptionsRequest implements Property<EC2FleetSpotOptionsRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleavailabilityzone
     * 
     */
    @JsonProperty("SingleAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleavailabilityzone")
    private CharSequence singleAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-allocationstrategy
     * 
     */
    @JsonProperty("AllocationStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-allocationstrategy")
    private CharSequence allocationStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleinstancetype
     * 
     */
    @JsonProperty("SingleInstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleinstancetype")
    private CharSequence singleInstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-mintargetcapacity
     * 
     */
    @JsonProperty("MinTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-mintargetcapacity")
    private Number minTargetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maxtotalprice
     * 
     */
    @JsonProperty("MaxTotalPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maxtotalprice")
    private CharSequence maxTotalPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instanceinterruptionbehavior
     * 
     */
    @JsonProperty("InstanceInterruptionBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instanceinterruptionbehavior")
    private CharSequence instanceInterruptionBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instancepoolstousecount
     * 
     */
    @JsonProperty("InstancePoolsToUseCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instancepoolstousecount")
    private Number instancePoolsToUseCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleavailabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getSingleAvailabilityZone() {
        return singleAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleavailabilityzone
     * 
     */
    @JsonIgnore
    public void setSingleAvailabilityZone(CharSequence singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    public EC2FleetSpotOptionsRequest withSingleAvailabilityZone(CharSequence singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-allocationstrategy
     * 
     */
    @JsonIgnore
    public CharSequence getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-allocationstrategy
     * 
     */
    @JsonIgnore
    public void setAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public EC2FleetSpotOptionsRequest withAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleinstancetype
     * 
     */
    @JsonIgnore
    public CharSequence getSingleInstanceType() {
        return singleInstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-singleinstancetype
     * 
     */
    @JsonIgnore
    public void setSingleInstanceType(CharSequence singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
    }

    public EC2FleetSpotOptionsRequest withSingleInstanceType(CharSequence singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-mintargetcapacity
     * 
     */
    @JsonIgnore
    public Number getMinTargetCapacity() {
        return minTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-mintargetcapacity
     * 
     */
    @JsonIgnore
    public void setMinTargetCapacity(Number minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
    }

    public EC2FleetSpotOptionsRequest withMinTargetCapacity(Number minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maxtotalprice
     * 
     */
    @JsonIgnore
    public CharSequence getMaxTotalPrice() {
        return maxTotalPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-maxtotalprice
     * 
     */
    @JsonIgnore
    public void setMaxTotalPrice(CharSequence maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
    }

    public EC2FleetSpotOptionsRequest withMaxTotalPrice(CharSequence maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instanceinterruptionbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceInterruptionBehavior() {
        return instanceInterruptionBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instanceinterruptionbehavior
     * 
     */
    @JsonIgnore
    public void setInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
    }

    public EC2FleetSpotOptionsRequest withInstanceInterruptionBehavior(CharSequence instanceInterruptionBehavior) {
        this.instanceInterruptionBehavior = instanceInterruptionBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instancepoolstousecount
     * 
     */
    @JsonIgnore
    public Number getInstancePoolsToUseCount() {
        return instancePoolsToUseCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html#cfn-ec2-ec2fleet-spotoptionsrequest-instancepoolstousecount
     * 
     */
    @JsonIgnore
    public void setInstancePoolsToUseCount(Number instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
    }

    public EC2FleetSpotOptionsRequest withInstancePoolsToUseCount(Number instancePoolsToUseCount) {
        this.instancePoolsToUseCount = instancePoolsToUseCount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("singleAvailabilityZone", singleAvailabilityZone).append("allocationStrategy", allocationStrategy).append("singleInstanceType", singleInstanceType).append("minTargetCapacity", minTargetCapacity).append("maxTotalPrice", maxTotalPrice).append("instanceInterruptionBehavior", instanceInterruptionBehavior).append("instancePoolsToUseCount", instancePoolsToUseCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxTotalPrice).append(instancePoolsToUseCount).append(singleInstanceType).append(minTargetCapacity).append(instanceInterruptionBehavior).append(singleAvailabilityZone).append(allocationStrategy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2FleetSpotOptionsRequest) == false) {
            return false;
        }
        EC2FleetSpotOptionsRequest rhs = ((EC2FleetSpotOptionsRequest) other);
        return new EqualsBuilder().append(maxTotalPrice, rhs.maxTotalPrice).append(instancePoolsToUseCount, rhs.instancePoolsToUseCount).append(singleInstanceType, rhs.singleInstanceType).append(minTargetCapacity, rhs.minTargetCapacity).append(instanceInterruptionBehavior, rhs.instanceInterruptionBehavior).append(singleAvailabilityZone, rhs.singleAvailabilityZone).append(allocationStrategy, rhs.allocationStrategy).isEquals();
    }

}
