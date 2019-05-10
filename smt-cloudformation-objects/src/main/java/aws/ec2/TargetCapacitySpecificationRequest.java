
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TargetCapacitySpecificationRequest
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
public class TargetCapacitySpecificationRequest {

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
    private Integer totalTargetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity
     * 
     */
    @JsonProperty("OnDemandTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity")
    private Integer onDemandTargetCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity
     * 
     */
    @JsonProperty("SpotTargetCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity")
    private Integer spotTargetCapacity;

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

    public TargetCapacitySpecificationRequest withDefaultTargetCapacityType(CharSequence defaultTargetCapacityType) {
        this.defaultTargetCapacityType = defaultTargetCapacityType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity
     * 
     */
    @JsonIgnore
    public Integer getTotalTargetCapacity() {
        return totalTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-totaltargetcapacity
     * 
     */
    @JsonIgnore
    public void setTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
    }

    public TargetCapacitySpecificationRequest withTotalTargetCapacity(Integer totalTargetCapacity) {
        this.totalTargetCapacity = totalTargetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity
     * 
     */
    @JsonIgnore
    public Integer getOnDemandTargetCapacity() {
        return onDemandTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-ondemandtargetcapacity
     * 
     */
    @JsonIgnore
    public void setOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
    }

    public TargetCapacitySpecificationRequest withOnDemandTargetCapacity(Integer onDemandTargetCapacity) {
        this.onDemandTargetCapacity = onDemandTargetCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity
     * 
     */
    @JsonIgnore
    public Integer getSpotTargetCapacity() {
        return spotTargetCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html#cfn-ec2-ec2fleet-targetcapacityspecificationrequest-spottargetcapacity
     * 
     */
    @JsonIgnore
    public void setSpotTargetCapacity(Integer spotTargetCapacity) {
        this.spotTargetCapacity = spotTargetCapacity;
    }

    public TargetCapacitySpecificationRequest withSpotTargetCapacity(Integer spotTargetCapacity) {
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
        if ((other instanceof TargetCapacitySpecificationRequest) == false) {
            return false;
        }
        TargetCapacitySpecificationRequest rhs = ((TargetCapacitySpecificationRequest) other);
        return new EqualsBuilder().append(onDemandTargetCapacity, rhs.onDemandTargetCapacity).append(totalTargetCapacity, rhs.totalTargetCapacity).append(defaultTargetCapacityType, rhs.defaultTargetCapacityType).append(spotTargetCapacity, rhs.spotTargetCapacity).isEquals();
    }

}
