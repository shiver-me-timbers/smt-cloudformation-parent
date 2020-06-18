
package shiver.me.timbers.aws.dlm;

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
 * LifecyclePolicyCrossRegionCopyRetainRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IntervalUnit",
    "Interval"
})
public class LifecyclePolicyCrossRegionCopyRetainRule implements Property<LifecyclePolicyCrossRegionCopyRetainRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-intervalunit
     * 
     */
    @JsonProperty("IntervalUnit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-intervalunit")
    private CharSequence intervalUnit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-interval
     * 
     */
    @JsonProperty("Interval")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-interval")
    private Number interval;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-intervalunit
     * 
     */
    @JsonIgnore
    public CharSequence getIntervalUnit() {
        return intervalUnit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-intervalunit
     * 
     */
    @JsonIgnore
    public void setIntervalUnit(CharSequence intervalUnit) {
        this.intervalUnit = intervalUnit;
    }

    public LifecyclePolicyCrossRegionCopyRetainRule withIntervalUnit(CharSequence intervalUnit) {
        this.intervalUnit = intervalUnit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-interval
     * 
     */
    @JsonIgnore
    public Number getInterval() {
        return interval;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html#cfn-dlm-lifecyclepolicy-crossregioncopyretainrule-interval
     * 
     */
    @JsonIgnore
    public void setInterval(Number interval) {
        this.interval = interval;
    }

    public LifecyclePolicyCrossRegionCopyRetainRule withInterval(Number interval) {
        this.interval = interval;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("intervalUnit", intervalUnit).append("interval", interval).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(interval).append(intervalUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicyCrossRegionCopyRetainRule) == false) {
            return false;
        }
        LifecyclePolicyCrossRegionCopyRetainRule rhs = ((LifecyclePolicyCrossRegionCopyRetainRule) other);
        return new EqualsBuilder().append(interval, rhs.interval).append(intervalUnit, rhs.intervalUnit).isEquals();
    }

}
