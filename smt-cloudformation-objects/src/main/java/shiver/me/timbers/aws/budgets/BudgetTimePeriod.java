
package shiver.me.timbers.aws.budgets;

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
 * BudgetTimePeriod
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Start",
    "End"
})
public class BudgetTimePeriod implements Property<BudgetTimePeriod>
{

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
    @JsonIgnore
    public CharSequence getStart() {
        return start;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-start
     * 
     */
    @JsonIgnore
    public void setStart(CharSequence start) {
        this.start = start;
    }

    public BudgetTimePeriod withStart(CharSequence start) {
        this.start = start;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end
     * 
     */
    @JsonIgnore
    public CharSequence getEnd() {
        return end;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html#cfn-budgets-budget-timeperiod-end
     * 
     */
    @JsonIgnore
    public void setEnd(CharSequence end) {
        this.end = end;
    }

    public BudgetTimePeriod withEnd(CharSequence end) {
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
        if ((other instanceof BudgetTimePeriod) == false) {
            return false;
        }
        BudgetTimePeriod rhs = ((BudgetTimePeriod) other);
        return new EqualsBuilder().append(start, rhs.start).append(end, rhs.end).isEquals();
    }

}
