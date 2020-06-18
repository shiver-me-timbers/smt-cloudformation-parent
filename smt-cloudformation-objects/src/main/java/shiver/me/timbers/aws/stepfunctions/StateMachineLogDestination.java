
package shiver.me.timbers.aws.stepfunctions;

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
 * StateMachineLogDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchLogsLogGroup"
})
public class StateMachineLogDestination implements Property<StateMachineLogDestination>
{

    /**
     * StateMachineCloudWatchLogsLogGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html
     * 
     */
    @JsonProperty("CloudWatchLogsLogGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html")
    private Property<StateMachineCloudWatchLogsLogGroup> cloudWatchLogsLogGroup;

    /**
     * StateMachineCloudWatchLogsLogGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html
     * 
     */
    @JsonIgnore
    public Property<StateMachineCloudWatchLogsLogGroup> getCloudWatchLogsLogGroup() {
        return cloudWatchLogsLogGroup;
    }

    /**
     * StateMachineCloudWatchLogsLogGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchLogsLogGroup(Property<StateMachineCloudWatchLogsLogGroup> cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
    }

    public StateMachineLogDestination withCloudWatchLogsLogGroup(Property<StateMachineCloudWatchLogsLogGroup> cloudWatchLogsLogGroup) {
        this.cloudWatchLogsLogGroup = cloudWatchLogsLogGroup;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLogsLogGroup", cloudWatchLogsLogGroup).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLogsLogGroup).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateMachineLogDestination) == false) {
            return false;
        }
        StateMachineLogDestination rhs = ((StateMachineLogDestination) other);
        return new EqualsBuilder().append(cloudWatchLogsLogGroup, rhs.cloudWatchLogsLogGroup).isEquals();
    }

}
