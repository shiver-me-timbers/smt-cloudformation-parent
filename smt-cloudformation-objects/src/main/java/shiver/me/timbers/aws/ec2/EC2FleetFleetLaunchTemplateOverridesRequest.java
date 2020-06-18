
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
 * EC2FleetFleetLaunchTemplateOverridesRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "WeightedCapacity",
    "Placement",
    "Priority",
    "AvailabilityZone",
    "SubnetId",
    "InstanceType",
    "MaxPrice"
})
public class EC2FleetFleetLaunchTemplateOverridesRequest implements Property<EC2FleetFleetLaunchTemplateOverridesRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-weightedcapacity")
    private Number weightedCapacity;
    /**
     * EC2FleetPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html")
    private Property<EC2FleetPlacement> placement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-priority
     * 
     */
    @JsonProperty("Priority")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-priority")
    private Number priority;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-subnetid")
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-maxprice
     * 
     */
    @JsonProperty("MaxPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-maxprice")
    private CharSequence maxPrice;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-weightedcapacity
     * 
     */
    @JsonIgnore
    public Number getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-weightedcapacity
     * 
     */
    @JsonIgnore
    public void setWeightedCapacity(Number weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withWeightedCapacity(Number weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    /**
     * EC2FleetPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html
     * 
     */
    @JsonIgnore
    public Property<EC2FleetPlacement> getPlacement() {
        return placement;
    }

    /**
     * EC2FleetPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-placement.html
     * 
     */
    @JsonIgnore
    public void setPlacement(Property<EC2FleetPlacement> placement) {
        this.placement = placement;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withPlacement(Property<EC2FleetPlacement> placement) {
        this.placement = placement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-priority
     * 
     */
    @JsonIgnore
    public Number getPriority() {
        return priority;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-priority
     * 
     */
    @JsonIgnore
    public void setPriority(Number priority) {
        this.priority = priority;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withPriority(Number priority) {
        this.priority = priority;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-availabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-availabilityzone
     * 
     */
    @JsonIgnore
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-subnetid
     * 
     */
    @JsonIgnore
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-subnetid
     * 
     */
    @JsonIgnore
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-maxprice
     * 
     */
    @JsonIgnore
    public CharSequence getMaxPrice() {
        return maxPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateoverridesrequest-maxprice
     * 
     */
    @JsonIgnore
    public void setMaxPrice(CharSequence maxPrice) {
        this.maxPrice = maxPrice;
    }

    public EC2FleetFleetLaunchTemplateOverridesRequest withMaxPrice(CharSequence maxPrice) {
        this.maxPrice = maxPrice;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("weightedCapacity", weightedCapacity).append("placement", placement).append("priority", priority).append("availabilityZone", availabilityZone).append("subnetId", subnetId).append("instanceType", instanceType).append("maxPrice", maxPrice).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(instanceType).append(placement).append(maxPrice).append(priority).append(availabilityZone).append(weightedCapacity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2FleetFleetLaunchTemplateOverridesRequest) == false) {
            return false;
        }
        EC2FleetFleetLaunchTemplateOverridesRequest rhs = ((EC2FleetFleetLaunchTemplateOverridesRequest) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(instanceType, rhs.instanceType).append(placement, rhs.placement).append(maxPrice, rhs.maxPrice).append(priority, rhs.priority).append(availabilityZone, rhs.availabilityZone).append(weightedCapacity, rhs.weightedCapacity).isEquals();
    }

}
