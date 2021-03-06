
package shiver.me.timbers.aws.dlm;

import java.util.ArrayList;
import java.util.List;
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
 * LifecyclePolicyCreateRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IntervalUnit",
    "Times",
    "CronExpression",
    "Interval"
})
public class LifecyclePolicyCreateRule implements Property<LifecyclePolicyCreateRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-intervalunit
     * 
     */
    @JsonProperty("IntervalUnit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-intervalunit")
    private CharSequence intervalUnit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-times
     * 
     */
    @JsonProperty("Times")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-times")
    private List<CharSequence> times = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-cronexpression
     * 
     */
    @JsonProperty("CronExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-cronexpression")
    private CharSequence cronExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-interval
     * 
     */
    @JsonProperty("Interval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-interval")
    private Number interval;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-intervalunit
     * 
     */
    @JsonIgnore
    public CharSequence getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-intervalunit
     * 
     */
    @JsonIgnore
    public void setIntervalUnit(CharSequence intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public LifecyclePolicyCreateRule withIntervalUnit(CharSequence intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-times
     * 
     */
    @JsonIgnore
    public List<CharSequence> getTimes() {
        return times;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-times
     * 
     */
    @JsonIgnore
    public void setTimes(List<CharSequence> times) {
        this.times = times;
    }

    public LifecyclePolicyCreateRule withTimes(List<CharSequence> times) {
        this.times = times;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-cronexpression
     * 
     */
    @JsonIgnore
    public CharSequence getCronExpression() {
        return cronExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-cronexpression
     * 
     */
    @JsonIgnore
    public void setCronExpression(CharSequence cronExpression) {
        this.cronExpression = cronExpression;
    }

    public LifecyclePolicyCreateRule withCronExpression(CharSequence cronExpression) {
        this.cronExpression = cronExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-interval
     * 
     */
    @JsonIgnore
    public Number getInterval() {
        return interval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html#cfn-dlm-lifecyclepolicy-createrule-interval
     * 
     */
    @JsonIgnore
    public void setInterval(Number interval) {
        this.interval = interval;
    }

    public LifecyclePolicyCreateRule withInterval(Number interval) {
        this.interval = interval;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("intervalUnit", intervalUnit).append("times", times).append("cronExpression", cronExpression).append("interval", interval).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cronExpression).append(times).append(interval).append(intervalUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicyCreateRule) == false) {
            return false;
        }
        LifecyclePolicyCreateRule rhs = ((LifecyclePolicyCreateRule) other);
        return new EqualsBuilder().append(cronExpression, rhs.cronExpression).append(times, rhs.times).append(interval, rhs.interval).append(intervalUnit, rhs.intervalUnit).isEquals();
    }

}
