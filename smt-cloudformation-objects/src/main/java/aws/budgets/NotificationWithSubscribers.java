
package aws.budgets;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * NotificationWithSubscribers
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Subscribers",
    "Notification"
})
public class NotificationWithSubscribers implements Property<NotificationWithSubscribers>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers
     * 
     */
    @JsonProperty("Subscribers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers")
    private List<Property<Subscriber>> subscribers = new ArrayList<Property<Subscriber>>();
    /**
     * Notification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
     * 
     */
    @JsonProperty("Notification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html")
    private Property<Notification> notification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers
     * 
     */
    @JsonIgnore
    public List<Property<Subscriber>> getSubscribers() {
        return subscribers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notificationwithsubscribers.html#cfn-budgets-budget-notificationwithsubscribers-subscribers
     * 
     */
    @JsonIgnore
    public void setSubscribers(List<Property<Subscriber>> subscribers) {
        this.subscribers = subscribers;
    }

    public NotificationWithSubscribers withSubscribers(List<Property<Subscriber>> subscribers) {
        this.subscribers = subscribers;
        return this;
    }

    /**
     * Notification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
     * 
     */
    @JsonIgnore
    public Property<Notification> getNotification() {
        return notification;
    }

    /**
     * Notification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
     * 
     */
    @JsonIgnore
    public void setNotification(Property<Notification> notification) {
        this.notification = notification;
    }

    public NotificationWithSubscribers withNotification(Property<Notification> notification) {
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
        if ((other instanceof NotificationWithSubscribers) == false) {
            return false;
        }
        NotificationWithSubscribers rhs = ((NotificationWithSubscribers) other);
        return new EqualsBuilder().append(notification, rhs.notification).append(subscribers, rhs.subscribers).isEquals();
    }

}
