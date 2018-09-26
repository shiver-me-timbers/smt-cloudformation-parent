
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Schedule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ScheduleExpression"
})
public class Schedule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression
     * 
     */
    @JsonProperty("ScheduleExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression")
    private CharSequence scheduleExpression;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression
     * 
     */
    public CharSequence getScheduleExpression() {
        return scheduleExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-crawler-schedule.html#cfn-glue-crawler-schedule-scheduleexpression
     * 
     */
    public void setScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
    }

    public Schedule withScheduleExpression(CharSequence scheduleExpression) {
        this.scheduleExpression = scheduleExpression;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scheduleExpression", scheduleExpression).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(scheduleExpression).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Schedule) == false) {
            return false;
        }
        Schedule rhs = ((Schedule) other);
        return new EqualsBuilder().append(scheduleExpression, rhs.scheduleExpression).isEquals();
    }

}
