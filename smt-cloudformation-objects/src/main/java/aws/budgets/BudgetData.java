
package aws.budgets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BudgetData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BudgetLimit",
    "TimePeriod",
    "TimeUnit",
    "CostFilters",
    "BudgetName",
    "CostTypes",
    "BudgetType"
})
public class BudgetData {

    /**
     * Spend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
     * 
     */
    @JsonProperty("BudgetLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html")
    private Spend budgetLimit;
    /**
     * TimePeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
     * 
     */
    @JsonProperty("TimePeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html")
    private TimePeriod timePeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit
     * 
     */
    @JsonProperty("TimeUnit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit")
    private CharSequence timeUnit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters
     * 
     */
    @JsonProperty("CostFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters")
    private Object costFilters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname
     * 
     */
    @JsonProperty("BudgetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname")
    private CharSequence budgetName;
    /**
     * CostTypes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
     * 
     */
    @JsonProperty("CostTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html")
    private CostTypes costTypes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype
     * 
     */
    @JsonProperty("BudgetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype")
    private CharSequence budgetType;

    /**
     * Spend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
     * 
     */
    public Spend getBudgetLimit() {
        return budgetLimit;
    }

    /**
     * Spend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
     * 
     */
    public void setBudgetLimit(Spend budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public BudgetData withBudgetLimit(Spend budgetLimit) {
        this.budgetLimit = budgetLimit;
        return this;
    }

    /**
     * TimePeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
     * 
     */
    public TimePeriod getTimePeriod() {
        return timePeriod;
    }

    /**
     * TimePeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
     * 
     */
    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public BudgetData withTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit
     * 
     */
    public CharSequence getTimeUnit() {
        return timeUnit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit
     * 
     */
    public void setTimeUnit(CharSequence timeUnit) {
        this.timeUnit = timeUnit;
    }

    public BudgetData withTimeUnit(CharSequence timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters
     * 
     */
    public Object getCostFilters() {
        return costFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters
     * 
     */
    public void setCostFilters(Object costFilters) {
        this.costFilters = costFilters;
    }

    public BudgetData withCostFilters(Object costFilters) {
        this.costFilters = costFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname
     * 
     */
    public CharSequence getBudgetName() {
        return budgetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname
     * 
     */
    public void setBudgetName(CharSequence budgetName) {
        this.budgetName = budgetName;
    }

    public BudgetData withBudgetName(CharSequence budgetName) {
        this.budgetName = budgetName;
        return this;
    }

    /**
     * CostTypes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
     * 
     */
    public CostTypes getCostTypes() {
        return costTypes;
    }

    /**
     * CostTypes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
     * 
     */
    public void setCostTypes(CostTypes costTypes) {
        this.costTypes = costTypes;
    }

    public BudgetData withCostTypes(CostTypes costTypes) {
        this.costTypes = costTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype
     * 
     */
    public CharSequence getBudgetType() {
        return budgetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype
     * 
     */
    public void setBudgetType(CharSequence budgetType) {
        this.budgetType = budgetType;
    }

    public BudgetData withBudgetType(CharSequence budgetType) {
        this.budgetType = budgetType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("budgetLimit", budgetLimit).append("timePeriod", timePeriod).append("timeUnit", timeUnit).append("costFilters", costFilters).append("budgetName", budgetName).append("costTypes", costTypes).append("budgetType", budgetType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(budgetType).append(costFilters).append(timePeriod).append(budgetName).append(costTypes).append(budgetLimit).append(timeUnit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetData) == false) {
            return false;
        }
        BudgetData rhs = ((BudgetData) other);
        return new EqualsBuilder().append(budgetType, rhs.budgetType).append(costFilters, rhs.costFilters).append(timePeriod, rhs.timePeriod).append(budgetName, rhs.budgetName).append(costTypes, rhs.costTypes).append(budgetLimit, rhs.budgetLimit).append(timeUnit, rhs.timeUnit).isEquals();
    }

}
