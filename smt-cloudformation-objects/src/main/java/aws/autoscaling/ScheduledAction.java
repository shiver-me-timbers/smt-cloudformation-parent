
package aws.autoscaling;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AutoScalingGroupName",
    "DesiredCapacity",
    "EndTime",
    "MaxSize",
    "MinSize",
    "Recurrence",
    "StartTime"
})
public class ScheduledAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname")
    private CharSequence autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity
     * 
     */
    @JsonProperty("DesiredCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity")
    private Integer desiredCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime
     * 
     */
    @JsonProperty("EndTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime")
    private CharSequence endTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize")
    private Integer maxSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize
     * 
     */
    @JsonProperty("MinSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize")
    private Integer minSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence
     * 
     */
    @JsonProperty("Recurrence")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence")
    private CharSequence recurrence;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime
     * 
     */
    @JsonProperty("StartTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime")
    private CharSequence startTime;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname
     * 
     */
    public CharSequence getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-asgname
     * 
     */
    public void setAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public ScheduledAction withAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity
     * 
     */
    public Integer getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-desiredcapacity
     * 
     */
    public void setDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    public ScheduledAction withDesiredCapacity(Integer desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime
     * 
     */
    public CharSequence getEndTime() {
        return endTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-endtime
     * 
     */
    public void setEndTime(CharSequence endTime) {
        this.endTime = endTime;
    }

    public ScheduledAction withEndTime(CharSequence endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize
     * 
     */
    public Integer getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-maxsize
     * 
     */
    public void setMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
    }

    public ScheduledAction withMaxSize(Integer maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize
     * 
     */
    public Integer getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-minsize
     * 
     */
    public void setMinSize(Integer minSize) {
        this.minSize = minSize;
    }

    public ScheduledAction withMinSize(Integer minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence
     * 
     */
    public CharSequence getRecurrence() {
        return recurrence;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-recurrence
     * 
     */
    public void setRecurrence(CharSequence recurrence) {
        this.recurrence = recurrence;
    }

    public ScheduledAction withRecurrence(CharSequence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime
     * 
     */
    public CharSequence getStartTime() {
        return startTime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-as-scheduledaction.html#cfn-as-scheduledaction-starttime
     * 
     */
    public void setStartTime(CharSequence startTime) {
        this.startTime = startTime;
    }

    public ScheduledAction withStartTime(CharSequence startTime) {
        this.startTime = startTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingGroupName", autoScalingGroupName).append("desiredCapacity", desiredCapacity).append("endTime", endTime).append("maxSize", maxSize).append("minSize", minSize).append("recurrence", recurrence).append("startTime", startTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recurrence).append(autoScalingGroupName).append(maxSize).append(minSize).append(startTime).append(endTime).append(desiredCapacity).toHashCode();
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
        return new EqualsBuilder().append(recurrence, rhs.recurrence).append(autoScalingGroupName, rhs.autoScalingGroupName).append(maxSize, rhs.maxSize).append(minSize, rhs.minSize).append(startTime, rhs.startTime).append(endTime, rhs.endTime).append(desiredCapacity, rhs.desiredCapacity).isEquals();
    }

}
