
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
 * EC2FleetCapacityReservationOptionsRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "UsageStrategy"
})
public class EC2FleetCapacityReservationOptionsRequest implements Property<EC2FleetCapacityReservationOptionsRequest>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html#cfn-ec2-ec2fleet-capacityreservationoptionsrequest-usagestrategy
     * 
     */
    @JsonProperty("UsageStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html#cfn-ec2-ec2fleet-capacityreservationoptionsrequest-usagestrategy")
    private CharSequence usageStrategy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html#cfn-ec2-ec2fleet-capacityreservationoptionsrequest-usagestrategy
     * 
     */
    @JsonIgnore
    public CharSequence getUsageStrategy() {
        return usageStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-capacityreservationoptionsrequest.html#cfn-ec2-ec2fleet-capacityreservationoptionsrequest-usagestrategy
     * 
     */
    @JsonIgnore
    public void setUsageStrategy(CharSequence usageStrategy) {
        this.usageStrategy = usageStrategy;
    }

    public EC2FleetCapacityReservationOptionsRequest withUsageStrategy(CharSequence usageStrategy) {
        this.usageStrategy = usageStrategy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("usageStrategy", usageStrategy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(usageStrategy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2FleetCapacityReservationOptionsRequest) == false) {
            return false;
        }
        EC2FleetCapacityReservationOptionsRequest rhs = ((EC2FleetCapacityReservationOptionsRequest) other);
        return new EqualsBuilder().append(usageStrategy, rhs.usageStrategy).isEquals();
    }

}
