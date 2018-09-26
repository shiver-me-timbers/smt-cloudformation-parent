
package aws.applicationautoscaling;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ScheduledAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EndTime",
    "ScalableTargetAction",
    "Schedule",
    "ScheduledActionName",
    "StartTime"
})
public class ScheduledAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime
     * 
     */
    @JsonProperty("EndTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime")
    private String endTime;
    /**
     * ScalableTargetAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
     * 
     */
    @JsonProperty("ScalableTargetAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html")
    private ScalableTargetAction scalableTargetAction;
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
    private String startTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime
     * 
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-endtime
     * 
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public ScheduledAction withEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * ScalableTargetAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
     * 
     */
    public ScalableTargetAction getScalableTargetAction() {
        return scalableTargetAction;
    }

    /**
     * ScalableTargetAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scalabletargetaction.html
     * 
     */
    public void setScalableTargetAction(ScalableTargetAction scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
    }

    public ScheduledAction withScalableTargetAction(ScalableTargetAction scalableTargetAction) {
        this.scalableTargetAction = scalableTargetAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule
     * 
     */
    public CharSequence getSchedule() {
        return schedule;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-schedule
     * 
     */
    public void setSchedule(CharSequence schedule) {
        this.schedule = schedule;
    }

    public ScheduledAction withSchedule(CharSequence schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname
     * 
     */
    public CharSequence getScheduledActionName() {
        return scheduledActionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-scheduledactionname
     * 
     */
    public void setScheduledActionName(CharSequence scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
    }

    public ScheduledAction withScheduledActionName(CharSequence scheduledActionName) {
        this.scheduledActionName = scheduledActionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime
     * 
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-applicationautoscaling-scalabletarget-scheduledaction.html#cfn-applicationautoscaling-scalabletarget-scheduledaction-starttime
     * 
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ScheduledAction withStartTime(String startTime) {
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
        if ((other instanceof ScheduledAction) == false) {
            return false;
        }
        ScheduledAction rhs = ((ScheduledAction) other);
        return new EqualsBuilder().append(schedule, rhs.schedule).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(scalableTargetAction, rhs.scalableTargetAction).append(scheduledActionName, rhs.scheduledActionName).isEquals();
    }

}
