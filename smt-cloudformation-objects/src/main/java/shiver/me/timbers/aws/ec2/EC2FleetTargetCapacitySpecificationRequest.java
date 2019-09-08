
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
 * EC2FleetTargetCapacitySpecificationRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DefaultTargetCapacityType",
    "TotalTargetCapacity",
    "OnDemandTargetCapacity",
    "SpotTargetCapacity"
})
public class EC2FleetTargetCapacitySpecificationRequest implements Property<EC2FleetTargetCapacitySpecificationRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-defaulttargetcapacitytype
     * 
     */
    @JsonProperty("DefaultTargetCapacityType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-defaulttargetcapacitytype")
    private CharSequence defaultTargetCapacityType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity
     * 
     */
    @JsonProperty("TotalTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity")
    private Number totalTargetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity
     * 
     */
    @JsonProperty("OnDemandTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity")
    private Number onDemandTargetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity
     * 
     */
    @JsonProperty("SpotTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity")
    private Number spotTargetCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-defaulttargetcapacitytype
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultTargetCapacityType() {
        return defaultTargetCapacityType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-defaulttargetcapacitytype
     * 
     */
    @JsonIgnore
    public void setDefaultTargetCapacityType(CharSequence defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
    }

    public EC2FleetTargetCapacitySpecificationRequest withDefaultTargetCapacityType(CharSequence defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity
     * 
     */
    @JsonIgnore
    public Number getTotalTargetCapacity() {
        return totalTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity
     * 
     */
    @JsonIgnore
    public void setTotalTargetCapacity(Number totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    public EC2FleetTargetCapacitySpecificationRequest withTotalTargetCapacity(Number totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity
     * 
     */
    @JsonIgnore
    public Number getOnDemandTargetCapacity() {
        return onDemandTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity
     * 
     */
    @JsonIgnore
    public void setOnDemandTargetCapacity(Number onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    public EC2FleetTargetCapacitySpecificationRequest withOnDemandTargetCapacity(Number onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity
     * 
     */
    @JsonIgnore
    public Number getSpotTargetCapacity() {
        return spotTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity
     * 
     */
    @JsonIgnore
    public void setSpotTargetCapacity(Number spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
    }

    public EC2FleetTargetCapacitySpecificationRequest withSpotTargetCapacity(Number spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultTargetCapacityType", defaultTargetCapacityType).append("totalTargetCapacity", totalTargetCapacity).append("onDemandTargetCapacity", onDemandTargetCapacity).append("spotTargetCapacity", spotTargetCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onDemandTargetCapacity).append(totalTargetCapacity).append(defaultTargetCapacityType).append(spotTargetCapacity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2FleetTargetCapacitySpecificationRequest) == false) {
            return false;
        }
        EC2FleetTargetCapacitySpecificationRequest rhs = ((EC2FleetTargetCapacitySpecificationRequest) other);
        return new EqualsBuilder().append(onDemandTargetCapacity, rhs.onDemandTargetCapacity).append(totalTargetCapacity, rhs.totalTargetCapacity).append(defaultTargetCapacityType, rhs.defaultTargetCapacityType).append(spotTargetCapacity, rhs.spotTargetCapacity).isEquals();
    }

}
