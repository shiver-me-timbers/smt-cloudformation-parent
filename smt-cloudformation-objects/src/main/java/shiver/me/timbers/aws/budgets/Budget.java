
package shiver.me.timbers.aws.budgets;

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
 * Budget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NotificationsWithSubscribers",
    "Budget"
})
public class Budget {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers
     * 
     */
    @JsonProperty("NotificationsWithSubscribers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers")
    private List<Property<BudgetNotificationWithSubscribers>> notificationsWithSubscribers = new ArrayList<Property<BudgetNotificationWithSubscribers>>();
    /**
     * BudgetBudgetData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
     * 
     */
    @JsonProperty("Budget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html")
    private Property<BudgetBudgetData> budget;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers
     * 
     */
    @JsonIgnore
    public List<Property<BudgetNotificationWithSubscribers>> getNotificationsWithSubscribers() {
        return notificationsWithSubscribers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers
     * 
     */
    @JsonIgnore
    public void setNotificationsWithSubscribers(List<Property<BudgetNotificationWithSubscribers>> notificationsWithSubscribers) {
        this.notificationsWithSubscribers = notificationsWithSubscribers;
    }

    public Budget withNotificationsWithSubscribers(List<Property<BudgetNotificationWithSubscribers>> notificationsWithSubscribers) {
        this.notificationsWithSubscribers = notificationsWithSubscribers;
        return this;
    }

    /**
     * BudgetBudgetData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
     * 
     */
    @JsonIgnore
    public Property<BudgetBudgetData> getBudget() {
        return budget;
    }

    /**
     * BudgetBudgetData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
     * 
     */
    @JsonIgnore
    public void setBudget(Property<BudgetBudgetData> budget) {
        this.budget = budget;
    }

    public Budget withBudget(Property<BudgetBudgetData> budget) {
        this.budget = budget;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notificationsWithSubscribers", notificationsWithSubscribers).append("budget", budget).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notificationsWithSubscribers).append(budget).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Budget) == false) {
            return false;
        }
        Budget rhs = ((Budget) other);
        return new EqualsBuilder().append(notificationsWithSubscribers, rhs.notificationsWithSubscribers).append(budget, rhs.budget).isEquals();
    }

}
