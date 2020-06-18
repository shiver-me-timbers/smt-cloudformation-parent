
package shiver.me.timbers.aws.imagebuilder;

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
 * ImagePipelineSchedule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ScheduleExpression",
    "PipelineExecutionStartCondition"
})
public class ImagePipelineSchedule implements Property<ImagePipelineSchedule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-scheduleexpression")
    private CharSequence scheduleExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-pipelineexecutionstartcondition
     * 
     */
    @JsonProperty("PipelineExecutionStartCondition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-pipelineexecutionstartcondition")
    private CharSequence pipelineExecutionStartCondition;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-scheduleexpression
     * 
     */
    @JsonIgnore
    public CharSequence getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-scheduleexpression
     * 
     */
    @JsonIgnore
    public void setScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    public ImagePipelineSchedule withScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-pipelineexecutionstartcondition
     * 
     */
    @JsonIgnore
    public CharSequence getPipelineExecutionStartCondition() {
        return pipelineExecutionStartCondition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-schedule.html#cfn-imagebuilder-imagepipeline-schedule-pipelineexecutionstartcondition
     * 
     */
    @JsonIgnore
    public void setPipelineExecutionStartCondition(CharSequence pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
    }

    public ImagePipelineSchedule withPipelineExecutionStartCondition(CharSequence pipelineExecutionStartCondition) {
        this.pipelineExecutionStartCondition = pipelineExecutionStartCondition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scheduleExpression", scheduleExpression).append("pipelineExecutionStartCondition", pipelineExecutionStartCondition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scheduleExpression).append(pipelineExecutionStartCondition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagePipelineSchedule) == false) {
            return false;
        }
        ImagePipelineSchedule rhs = ((ImagePipelineSchedule) other);
        return new EqualsBuilder().append(scheduleExpression, rhs.scheduleExpression).append(pipelineExecutionStartCondition, rhs.pipelineExecutionStartCondition).isEquals();
    }

}
