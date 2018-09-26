
package aws.budgets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TimePeriod
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Start",
    "End"
})
public class TimePeriod {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start
     * 
     */
    @JsonProperty("Start")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start")
    private CharSequence start;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end
     * 
     */
    @JsonProperty("End")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end")
    private CharSequence end;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start
     * 
     */
    public CharSequence getStart() {
        return start;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start
     * 
     */
    public void setStart(CharSequence start) {
        this.start = start;
    }

    public TimePeriod withStart(CharSequence start) {
        this.start = start;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end
     * 
     */
    public CharSequence getEnd() {
        return end;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end
     * 
     */
    public void setEnd(CharSequence end) {
        this.end = end;
    }

    public TimePeriod withEnd(CharSequence end) {
        this.end = end;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("start", start).append("end", end).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(start).append(end).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TimePeriod) == false) {
            return false;
        }
        TimePeriod rhs = ((TimePeriod) other);
        return new EqualsBuilder().append(start, rhs.start).append(end, rhs.end).isEquals();
    }

}
