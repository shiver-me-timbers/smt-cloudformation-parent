
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
 * BudgetBudgetData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BudgetLimit",
    "TimePeriod",
    "TimeUnit",
    "CostFilters",
    "BudgetName",
    "CostTypes",
    "BudgetType"
})
public class BudgetBudgetData implements Property<BudgetBudgetData>
{

    /**
     * BudgetSpend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
     * 
     */
    @JsonProperty("BudgetLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html")
    private Property<BudgetSpend> budgetLimit;
    /**
     * BudgetTimePeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
     * 
     */
    @JsonProperty("TimePeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html")
    private Property<BudgetTimePeriod> timePeriod;
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
     * BudgetCostTypes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
     * 
     */
    @JsonProperty("CostTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html")
    private Property<BudgetCostTypes> costTypes;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype
     * 
     */
    @JsonProperty("BudgetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype")
    private CharSequence budgetType;

    /**
     * BudgetSpend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
     * 
     */
    @JsonIgnore
    public Property<BudgetSpend> getBudgetLimit() {
        return budgetLimit;
    }

    /**
     * BudgetSpend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-spend.html
     * 
     */
    @JsonIgnore
    public void setBudgetLimit(Property<BudgetSpend> budgetLimit) {
        this.budgetLimit = budgetLimit;
    }

    public BudgetBudgetData withBudgetLimit(Property<BudgetSpend> budgetLimit) {
        this.budgetLimit = budgetLimit;
        return this;
    }

    /**
     * BudgetTimePeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
     * 
     */
    @JsonIgnore
    public Property<BudgetTimePeriod> getTimePeriod() {
        return timePeriod;
    }

    /**
     * BudgetTimePeriod
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-timeperiod.html
     * 
     */
    @JsonIgnore
    public void setTimePeriod(Property<BudgetTimePeriod> timePeriod) {
        this.timePeriod = timePeriod;
    }

    public BudgetBudgetData withTimePeriod(Property<BudgetTimePeriod> timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit
     * 
     */
    @JsonIgnore
    public CharSequence getTimeUnit() {
        return timeUnit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-timeunit
     * 
     */
    @JsonIgnore
    public void setTimeUnit(CharSequence timeUnit) {
        this.timeUnit = timeUnit;
    }

    public BudgetBudgetData withTimeUnit(CharSequence timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters
     * 
     */
    @JsonIgnore
    public Object getCostFilters() {
        return costFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-costfilters
     * 
     */
    @JsonIgnore
    public void setCostFilters(Object costFilters) {
        this.costFilters = costFilters;
    }

    public BudgetBudgetData withCostFilters(Object costFilters) {
        this.costFilters = costFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname
     * 
     */
    @JsonIgnore
    public CharSequence getBudgetName() {
        return budgetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgetname
     * 
     */
    @JsonIgnore
    public void setBudgetName(CharSequence budgetName) {
        this.budgetName = budgetName;
    }

    public BudgetBudgetData withBudgetName(CharSequence budgetName) {
        this.budgetName = budgetName;
        return this;
    }

    /**
     * BudgetCostTypes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
     * 
     */
    @JsonIgnore
    public Property<BudgetCostTypes> getCostTypes() {
        return costTypes;
    }

    /**
     * BudgetCostTypes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-costtypes.html
     * 
     */
    @JsonIgnore
    public void setCostTypes(Property<BudgetCostTypes> costTypes) {
        this.costTypes = costTypes;
    }

    public BudgetBudgetData withCostTypes(Property<BudgetCostTypes> costTypes) {
        this.costTypes = costTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype
     * 
     */
    @JsonIgnore
    public CharSequence getBudgetType() {
        return budgetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html#cfn-budgets-budget-budgetdata-budgettype
     * 
     */
    @JsonIgnore
    public void setBudgetType(CharSequence budgetType) {
        this.budgetType = budgetType;
    }

    public BudgetBudgetData withBudgetType(CharSequence budgetType) {
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
        if ((other instanceof BudgetBudgetData) == false) {
            return false;
        }
        BudgetBudgetData rhs = ((BudgetBudgetData) other);
        return new EqualsBuilder().append(budgetType, rhs.budgetType).append(costFilters, rhs.costFilters).append(timePeriod, rhs.timePeriod).append(budgetName, rhs.budgetName).append(costTypes, rhs.costTypes).append(budgetLimit, rhs.budgetLimit).append(timeUnit, rhs.timeUnit).isEquals();
    }

}
