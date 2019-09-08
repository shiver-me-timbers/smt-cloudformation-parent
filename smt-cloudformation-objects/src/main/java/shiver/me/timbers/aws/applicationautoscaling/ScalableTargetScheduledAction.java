
package shiver.me.timbers.aws.applicationautoscaling;

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
 * ScalableTargetScheduledAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EndTime",
    "ScalableTargetAction",
    "Schedule",
    "ScheduledActionName",
    "StartTime"
})
public class ScalableTargetScheduledAction implements Property<ScalableTargetScheduledAction>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime
     * 
     */
    @JsonProperty("EndTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime")
    private CharSequence endTime;
    /**
     * ScalableTargetScalableTargetAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
     * 
     */
    @JsonProperty("ScalableTargetAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html")
    private Property<ScalableTargetScalableTargetAction> scalableTargetAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule
     * 
     */
    @JsonProperty("Schedule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule")
    private CharSequence schedule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname
     * 
     */
    @JsonProperty("ScheduledActionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname")
    private CharSequence scheduledActionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime
     * 
     */
    @JsonProperty("StartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime")
    private CharSequence startTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime
     * 
     */
    @JsonIgnore
    public CharSequence getEndTime() {
        return endTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime
     * 
     */
    @JsonIgnore
    public void setEndTime(CharSequence endTime) {
        this.endTime = endTime;
    }

    public ScalableTargetScheduledAction withEndTime(CharSequence endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * ScalableTargetScalableTargetAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
     * 
     */
    @JsonIgnore
    public Property<ScalableTargetScalableTargetAction> getScalableTargetAction() {
        return scalableTargetAction;
    }

    /**
     * ScalableTargetScalableTargetAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
     * 
     */
    @JsonIgnore
    public void setScalableTargetAction(Property<ScalableTargetScalableTargetAction> scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
    }

    public ScalableTargetScheduledAction withScalableTargetAction(Property<ScalableTargetScalableTargetAction> scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule
     * 
     */
    @JsonIgnore
    public CharSequence getSchedule() {
        return schedule;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule
     * 
     */
    @JsonIgnore
    public void setSchedule(CharSequence schedule) {
        this.schedule = schedule;
    }

    public ScalableTargetScheduledAction withSchedule(CharSequence schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname
     * 
     */
    @JsonIgnore
    public CharSequence getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname
     * 
     */
    @JsonIgnore
    public void setScheduledActionName(CharSequence scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    public ScalableTargetScheduledAction withScheduledActionName(CharSequence scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime
     * 
     */
    @JsonIgnore
    public CharSequence getStartTime() {
        return startTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime
     * 
     */
    @JsonIgnore
    public void setStartTime(CharSequence startTime) {
        this.startTime = startTime;
    }

    public ScalableTargetScheduledAction withStartTime(CharSequence startTime) {
        this.startTime = startTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endTime", endTime).append("scalableTargetAction", scalableTargetAction).append("schedule", schedule).append("scheduledActionName", scheduledActionName).append("startTime", startTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(schedule).append(startTime).append(endTime).append(scalableTargetAction).append(scheduledActionName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalableTargetScheduledAction) == false) {
            return false;
        }
        ScalableTargetScheduledAction rhs = ((ScalableTargetScheduledAction) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(scalableTargetAction, rhs.scalableTargetAction).append(scheduledActionName, rhs.scheduledActionName).isEquals();
    }

}
