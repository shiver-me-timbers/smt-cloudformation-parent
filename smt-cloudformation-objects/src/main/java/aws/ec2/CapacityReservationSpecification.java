
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
 * CapacityReservationSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CapacityReservationPreference",
    "CapacityReservationTarget"
})
public class CapacityReservationSpecification {

    /**
     * CapacityReservationPreference
     * <p>
     * 
     * 
     */
    @JsonProperty("CapacityReservationPreference")
    private CharSequence capacityReservationPreference;
    /**
     * CapacityReservationTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
     * 
     */
    @JsonProperty("CapacityReservationTarget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html")
    private CapacityReservationTarget capacityReservationTarget;

    /**
     * CapacityReservationPreference
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public CharSequence getCapacityReservationPreference() {
        return capacityReservationPreference;
    }

    /**
     * CapacityReservationPreference
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public void setCapacityReservationPreference(CharSequence capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    public CapacityReservationSpecification withCapacityReservationPreference(CharSequence capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
        return this;
    }

    /**
     * CapacityReservationTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
     * 
     */
    @JsonIgnore
    public CapacityReservationTarget getCapacityReservationTarget() {
        return capacityReservationTarget;
    }

    /**
     * CapacityReservationTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
     * 
     */
    @JsonIgnore
    public void setCapacityReservationTarget(CapacityReservationTarget capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
    }

    public CapacityReservationSpecification withCapacityReservationTarget(CapacityReservationTarget capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("capacityReservationPreference", capacityReservationPreference).append("capacityReservationTarget", capacityReservationTarget).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(capacityReservationPreference).append(capacityReservationTarget).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CapacityReservationSpecification) == false) {
            return false;
        }
        CapacityReservationSpecification rhs = ((CapacityReservationSpecification) other);
        return new EqualsBuilder().append(capacityReservationPreference, rhs.capacityReservationPreference).append(capacityReservationTarget, rhs.capacityReservationTarget).isEquals();
    }

}
