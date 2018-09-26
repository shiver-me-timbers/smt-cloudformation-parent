
package aws.budgets;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Budget
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private List<NotificationWithSubscribers> notificationsWithSubscribers = new ArrayList<NotificationWithSubscribers>();
    /**
     * BudgetData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
     * 
     */
    @JsonProperty("Budget")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html")
    private BudgetData budget;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers
     * 
     */
    public List<NotificationWithSubscribers> getNotificationsWithSubscribers() {
        return notificationsWithSubscribers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-budgets-budget.html#cfn-budgets-budget-notificationswithsubscribers
     * 
     */
    public void setNotificationsWithSubscribers(List<NotificationWithSubscribers> notificationsWithSubscribers) {
        this.notificationsWithSubscribers = notificationsWithSubscribers;
    }

    public Budget withNotificationsWithSubscribers(List<NotificationWithSubscribers> notificationsWithSubscribers) {
        this.notificationsWithSubscribers = notificationsWithSubscribers;
        return this;
    }

    /**
     * BudgetData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
     * 
     */
    public BudgetData getBudget() {
        return budget;
    }

    /**
     * BudgetData
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-budgetdata.html
     * 
     */
    public void setBudget(BudgetData budget) {
        this.budget = budget;
    }

    public Budget withBudget(BudgetData budget) {
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
