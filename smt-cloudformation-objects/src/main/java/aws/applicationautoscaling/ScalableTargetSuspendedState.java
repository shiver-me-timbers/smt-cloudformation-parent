
package aws.applicationautoscaling;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScalableTargetSuspendedState
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DynamicScalingInSuspended",
    "DynamicScalingOutSuspended",
    "ScheduledScalingSuspended"
})
public class ScalableTargetSuspendedState implements Property<ScalableTargetSuspendedState>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalinginsuspended
     * 
     */
    @JsonProperty("DynamicScalingInSuspended")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalinginsuspended")
    private CharSequence dynamicScalingInSuspended;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalingoutsuspended
     * 
     */
    @JsonProperty("DynamicScalingOutSuspended")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalingoutsuspended")
    private CharSequence dynamicScalingOutSuspended;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-scheduledscalingsuspended
     * 
     */
    @JsonProperty("ScheduledScalingSuspended")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-scheduledscalingsuspended")
    private CharSequence scheduledScalingSuspended;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalinginsuspended
     * 
     */
    @JsonIgnore
    public CharSequence getDynamicScalingInSuspended() {
        return dynamicScalingInSuspended;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalinginsuspended
     * 
     */
    @JsonIgnore
    public void setDynamicScalingInSuspended(CharSequence dynamicScalingInSuspended) {
        this.dynamicScalingInSuspended = dynamicScalingInSuspended;
    }

    public ScalableTargetSuspendedState withDynamicScalingInSuspended(CharSequence dynamicScalingInSuspended) {
        this.dynamicScalingInSuspended = dynamicScalingInSuspended;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalingoutsuspended
     * 
     */
    @JsonIgnore
    public CharSequence getDynamicScalingOutSuspended() {
        return dynamicScalingOutSuspended;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-dynamicscalingoutsuspended
     * 
     */
    @JsonIgnore
    public void setDynamicScalingOutSuspended(CharSequence dynamicScalingOutSuspended) {
        this.dynamicScalingOutSuspended = dynamicScalingOutSuspended;
    }

    public ScalableTargetSuspendedState withDynamicScalingOutSuspended(CharSequence dynamicScalingOutSuspended) {
        this.dynamicScalingOutSuspended = dynamicScalingOutSuspended;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-scheduledscalingsuspended
     * 
     */
    @JsonIgnore
    public CharSequence getScheduledScalingSuspended() {
        return scheduledScalingSuspended;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-suspendedstate.html#cfn-applicationautoscaling-scalabletarget-suspendedstate-scheduledscalingsuspended
     * 
     */
    @JsonIgnore
    public void setScheduledScalingSuspended(CharSequence scheduledScalingSuspended) {
        this.scheduledScalingSuspended = scheduledScalingSuspended;
    }

    public ScalableTargetSuspendedState withScheduledScalingSuspended(CharSequence scheduledScalingSuspended) {
        this.scheduledScalingSuspended = scheduledScalingSuspended;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dynamicScalingInSuspended", dynamicScalingInSuspended).append("dynamicScalingOutSuspended", dynamicScalingOutSuspended).append("scheduledScalingSuspended", scheduledScalingSuspended).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scheduledScalingSuspended).append(dynamicScalingInSuspended).append(dynamicScalingOutSuspended).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalableTargetSuspendedState) == false) {
            return false;
        }
        ScalableTargetSuspendedState rhs = ((ScalableTargetSuspendedState) other);
        return new EqualsBuilder().append(scheduledScalingSuspended, rhs.scheduledScalingSuspended).append(dynamicScalingInSuspended, rhs.dynamicScalingInSuspended).append(dynamicScalingOutSuspended, rhs.dynamicScalingOutSuspended).isEquals();
    }

}
