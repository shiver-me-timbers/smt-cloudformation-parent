
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
 * LaunchTemplateCapacityReservationSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CapacityReservationPreference",
    "CapacityReservationTarget"
})
public class LaunchTemplateCapacityReservationSpecification implements Property<LaunchTemplateCapacityReservationSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification-capacityreservationpreference
     * 
     */
    @JsonProperty("CapacityReservationPreference")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification-capacityreservationpreference")
    private CharSequence capacityReservationPreference;
    /**
     * LaunchTemplateCapacityReservationTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
     * 
     */
    @JsonProperty("CapacityReservationTarget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html")
    private Property<LaunchTemplateCapacityReservationTarget> capacityReservationTarget;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification-capacityreservationpreference
     * 
     */
    @JsonIgnore
    public CharSequence getCapacityReservationPreference() {
        return capacityReservationPreference;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html#cfn-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification-capacityreservationpreference
     * 
     */
    @JsonIgnore
    public void setCapacityReservationPreference(CharSequence capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
    }

    public LaunchTemplateCapacityReservationSpecification withCapacityReservationPreference(CharSequence capacityReservationPreference) {
        this.capacityReservationPreference = capacityReservationPreference;
        return this;
    }

    /**
     * LaunchTemplateCapacityReservationTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
     * 
     */
    @JsonIgnore
    public Property<LaunchTemplateCapacityReservationTarget> getCapacityReservationTarget() {
        return capacityReservationTarget;
    }

    /**
     * LaunchTemplateCapacityReservationTarget
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-capacityreservationtarget.html
     * 
     */
    @JsonIgnore
    public void setCapacityReservationTarget(Property<LaunchTemplateCapacityReservationTarget> capacityReservationTarget) {
        this.capacityReservationTarget = capacityReservationTarget;
    }

    public LaunchTemplateCapacityReservationSpecification withCapacityReservationTarget(Property<LaunchTemplateCapacityReservationTarget> capacityReservationTarget) {
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
        if ((other instanceof LaunchTemplateCapacityReservationSpecification) == false) {
            return false;
        }
        LaunchTemplateCapacityReservationSpecification rhs = ((LaunchTemplateCapacityReservationSpecification) other);
        return new EqualsBuilder().append(capacityReservationPreference, rhs.capacityReservationPreference).append(capacityReservationTarget, rhs.capacityReservationTarget).isEquals();
    }

}
