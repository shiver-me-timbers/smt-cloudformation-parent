
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
 * StateMachineCloudWatchLogsLogGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LogGroupArn"
})
public class StateMachineCloudWatchLogsLogGroup implements Property<StateMachineCloudWatchLogsLogGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html#cfn-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup-loggrouparn
     * 
     */
    @JsonProperty("LogGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html#cfn-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup-loggrouparn")
    private CharSequence logGroupArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html#cfn-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup-loggrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getLogGroupArn() {
        return logGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup.html#cfn-stepfunctions-statemachine-logdestination-cloudwatchlogsloggroup-loggrouparn
     * 
     */
    @JsonIgnore
    public void setLogGroupArn(CharSequence logGroupArn) {
        this.logGroupArn = logGroupArn;
    }

    public StateMachineCloudWatchLogsLogGroup withLogGroupArn(CharSequence logGroupArn) {
        this.logGroupArn = logGroupArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logGroupArn", logGroupArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logGroupArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StateMachineCloudWatchLogsLogGroup) == false) {
            return false;
        }
        StateMachineCloudWatchLogsLogGroup rhs = ((StateMachineCloudWatchLogsLogGroup) other);
        return new EqualsBuilder().append(logGroupArn, rhs.logGroupArn).isEquals();
    }

}
