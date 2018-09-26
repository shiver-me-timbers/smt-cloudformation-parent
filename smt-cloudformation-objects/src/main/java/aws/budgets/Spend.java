
package aws.budgets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Spend
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Amount",
    "Unit"
})
public class Spend {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount
     * 
     */
    @JsonProperty("Amount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount")
    private Double amount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit
     * 
     */
    @JsonProperty("Unit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit")
    private CharSequence unit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount
     * 
     */
    public Double getAmount() {
        return amount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-amount
     * 
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Spend withAmount(Double amount) {
        this.amount = amount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit
     * 
     */
    public CharSequence getUnit() {
        return unit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html#cfn-budgets-budget-spend-unit
     * 
     */
    public void setUnit(CharSequence unit) {
        this.unit = unit;
    }

    public Spend withUnit(CharSequence unit) {
        this.unit = unit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("amount", amount).append("unit", unit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(amount).append(unit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Spend) == false) {
            return false;
        }
        Spend rhs = ((Spend) other);
        return new EqualsBuilder().append(amount, rhs.amount).append(unit, rhs.unit).isEquals();
    }

}
