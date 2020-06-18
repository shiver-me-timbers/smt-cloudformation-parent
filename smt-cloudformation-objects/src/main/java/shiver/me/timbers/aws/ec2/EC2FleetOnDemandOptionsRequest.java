
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
 * EC2FleetOnDemandOptionsRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SingleAvailabilityZone",
    "AllocationStrategy",
    "SingleInstanceType",
    "MinTargetCapacity",
    "MaxTotalPrice",
    "CapacityReservationOptions"
})
public class EC2FleetOnDemandOptionsRequest implements Property<EC2FleetOnDemandOptionsRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleavailabilityzone
     * 
     */
    @JsonProperty("SingleAvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleavailabilityzone")
    private CharSequence singleAvailabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-allocationstrategy
     * 
     */
    @JsonProperty("AllocationStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-allocationstrategy")
    private CharSequence allocationStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleinstancetype
     * 
     */
    @JsonProperty("SingleInstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleinstancetype")
    private CharSequence singleInstanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-mintargetcapacity
     * 
     */
    @JsonProperty("MinTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-mintargetcapacity")
    private Number minTargetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-maxtotalprice
     * 
     */
    @JsonProperty("MaxTotalPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-maxtotalprice")
    private CharSequence maxTotalPrice;
    /**
     * EC2FleetCapacityReservationOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html
     * 
     */
    @JsonProperty("CapacityReservationOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html")
    private Property<EC2FleetCapacityReservationOptionsRequest> capacityReservationOptions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleavailabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getSingleAvailabilityZone() {
        return singleAvailabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleavailabilityzone
     * 
     */
    @JsonIgnore
    public void setSingleAvailabilityZone(CharSequence singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
    }

    public EC2FleetOnDemandOptionsRequest withSingleAvailabilityZone(CharSequence singleAvailabilityZone) {
        this.singleAvailabilityZone = singleAvailabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-allocationstrategy
     * 
     */
    @JsonIgnore
    public CharSequence getAllocationStrategy() {
        return allocationStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-allocationstrategy
     * 
     */
    @JsonIgnore
    public void setAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
    }

    public EC2FleetOnDemandOptionsRequest withAllocationStrategy(CharSequence allocationStrategy) {
        this.allocationStrategy = allocationStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleinstancetype
     * 
     */
    @JsonIgnore
    public CharSequence getSingleInstanceType() {
        return singleInstanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-singleinstancetype
     * 
     */
    @JsonIgnore
    public void setSingleInstanceType(CharSequence singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
    }

    public EC2FleetOnDemandOptionsRequest withSingleInstanceType(CharSequence singleInstanceType) {
        this.singleInstanceType = singleInstanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-mintargetcapacity
     * 
     */
    @JsonIgnore
    public Number getMinTargetCapacity() {
        return minTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-mintargetcapacity
     * 
     */
    @JsonIgnore
    public void setMinTargetCapacity(Number minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
    }

    public EC2FleetOnDemandOptionsRequest withMinTargetCapacity(Number minTargetCapacity) {
        this.minTargetCapacity = minTargetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-maxtotalprice
     * 
     */
    @JsonIgnore
    public CharSequence getMaxTotalPrice() {
        return maxTotalPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html#cfn-ec2-ec2fleet-ondemandoptionsrequest-maxtotalprice
     * 
     */
    @JsonIgnore
    public void setMaxTotalPrice(CharSequence maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
    }

    public EC2FleetOnDemandOptionsRequest withMaxTotalPrice(CharSequence maxTotalPrice) {
        this.maxTotalPrice = maxTotalPrice;
        return this;
    }

    /**
     * EC2FleetCapacityReservationOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html
     * 
     */
    @JsonIgnore
    public Property<EC2FleetCapacityReservationOptionsRequest> getCapacityReservationOptions() {
        return capacityReservationOptions;
    }

    /**
     * EC2FleetCapacityReservationOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html
     * 
     */
    @JsonIgnore
    public void setCapacityReservationOptions(Property<EC2FleetCapacityReservationOptionsRequest> capacityReservationOptions) {
        this.capacityReservationOptions = capacityReservationOptions;
    }

    public EC2FleetOnDemandOptionsRequest withCapacityReservationOptions(Property<EC2FleetCapacityReservationOptionsRequest> capacityReservationOptions) {
        this.capacityReservationOptions = capacityReservationOptions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("singleAvailabilityZone", singleAvailabilityZone).append("allocationStrategy", allocationStrategy).append("singleInstanceType", singleInstanceType).append("minTargetCapacity", minTargetCapacity).append("maxTotalPrice", maxTotalPrice).append("capacityReservationOptions", capacityReservationOptions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(capacityReservationOptions).append(maxTotalPrice).append(singleInstanceType).append(minTargetCapacity).append(singleAvailabilityZone).append(allocationStrategy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2FleetOnDemandOptionsRequest) == false) {
            return false;
        }
        EC2FleetOnDemandOptionsRequest rhs = ((EC2FleetOnDemandOptionsRequest) other);
        return new EqualsBuilder().append(capacityReservationOptions, rhs.capacityReservationOptions).append(maxTotalPrice, rhs.maxTotalPrice).append(singleInstanceType, rhs.singleInstanceType).append(minTargetCapacity, rhs.minTargetCapacity).append(singleAvailabilityZone, rhs.singleAvailabilityZone).append(allocationStrategy, rhs.allocationStrategy).isEquals();
    }

}
