
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
 * BudgetNotificationWithSubscribers
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Subscribers",
    "Notification"
})
public class BudgetNotificationWithSubscribers implements Property<BudgetNotificationWithSubscribers>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers
     * 
     */
    @JsonProperty("Subscribers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers")
    private List<Property<BudgetSubscriber>> subscribers = new ArrayList<Property<BudgetSubscriber>>();
    /**
     * BudgetNotification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
     * 
     */
    @JsonProperty("Notification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html")
    private Property<BudgetNotification> notification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers
     * 
     */
    @JsonIgnore
    public List<Property<BudgetSubscriber>> getSubscribers() {
        return subscribers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers
     * 
     */
    @JsonIgnore
    public void setSubscribers(List<Property<BudgetSubscriber>> subscribers) {
        this.subscribers = subscribers;
    }

    public BudgetNotificationWithSubscribers withSubscribers(List<Property<BudgetSubscriber>> subscribers) {
        this.subscribers = subscribers;
        return this;
    }

    /**
     * BudgetNotification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
     * 
     */
    @JsonIgnore
    public Property<BudgetNotification> getNotification() {
        return notification;
    }

    /**
     * BudgetNotification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
     * 
     */
    @JsonIgnore
    public void setNotification(Property<BudgetNotification> notification) {
        this.notification = notification;
    }

    public BudgetNotificationWithSubscribers withNotification(Property<BudgetNotification> notification) {
        this.notification = notification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("subscribers", subscribers).append("notification", notification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(notification).append(subscribers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BudgetNotificationWithSubscribers) == false) {
            return false;
        }
        BudgetNotificationWithSubscribers rhs = ((BudgetNotificationWithSubscribers) other);
        return new EqualsBuilder().append(notification, rhs.notification).append(subscribers, rhs.subscribers).isEquals();
    }

}
