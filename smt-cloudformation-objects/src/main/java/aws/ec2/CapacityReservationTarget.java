
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
 * CapacityReservationTarget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CapacityReservationId"
})
public class CapacityReservationTarget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationid
     * 
     */
    @JsonProperty("CapacityReservationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationid")
    private CharSequence capacityReservationId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationid
     * 
     */
    @JsonIgnore
    public CharSequence getCapacityReservationId() {
        return capacityReservationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html#cfn-ec2-launchtemplate-capacityreservationtarget-capacityreservationid
     * 
     */
    @JsonIgnore
    public void setCapacityReservationId(CharSequence capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
    }

    public CapacityReservationTarget withCapacityReservationId(CharSequence capacityReservationId) {
        this.capacityReservationId = capacityReservationId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("capacityReservationId", capacityReservationId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(capacityReservationId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapacityReservationTarget) == false) {
            return false;
        }
        CapacityReservationTarget rhs = ((CapacityReservationTarget) other);
        return new EqualsBuilder().append(capacityReservationId, rhs.capacityReservationId).isEquals();
    }

}
