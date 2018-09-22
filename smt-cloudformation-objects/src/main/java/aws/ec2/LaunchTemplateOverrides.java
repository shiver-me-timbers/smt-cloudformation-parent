
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchTemplateOverrides
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AvailabilityZone",
    "InstanceType",
    "SpotPrice",
    "SubnetId",
    "WeightedCapacity"
})
public class LaunchTemplateOverrides {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone")
    private String availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype")
    private String instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice")
    private String spotPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid")
    private String subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity")
    private Double weightedCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public LaunchTemplateOverrides withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public LaunchTemplateOverrides withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public LaunchTemplateOverrides withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public LaunchTemplateOverrides withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    public Double getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateoverrides.html#cfn-ec2-spotfleet-launchtemplateoverrides-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    public void setWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    public LaunchTemplateOverrides withWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("availabilityZone", availabilityZone).append("instanceType", instanceType).append("spotPrice", spotPrice).append("subnetId", subnetId).append("weightedCapacity", weightedCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(spotPrice).append(availabilityZone).append(weightedCapacity).append(instanceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateOverrides) == false) {
            return false;
        }
        LaunchTemplateOverrides rhs = ((LaunchTemplateOverrides) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(spotPrice, rhs.spotPrice).append(availabilityZone, rhs.availabilityZone).append(weightedCapacity, rhs.weightedCapacity).append(instanceType, rhs.instanceType).isEquals();
    }

}
