
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * QueueConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Event",
    "Filter",
    "Queue"
})
public class QueueConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event
     * 
     */
    @JsonProperty("Event")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event")
    private CharSequence event;
    /**
     * NotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html")
    private NotificationFilter filter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue
     * 
     */
    @JsonProperty("Queue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue")
    private CharSequence queue;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event
     * 
     */
    public CharSequence getEvent() {
        return event;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-event
     * 
     */
    public void setEvent(CharSequence event) {
        this.event = event;
    }

    public QueueConfiguration withEvent(CharSequence event) {
        this.event = event;
        return this;
    }

    /**
     * NotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    public NotificationFilter getFilter() {
        return filter;
    }

    /**
     * NotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    public void setFilter(NotificationFilter filter) {
        this.filter = filter;
    }

    public QueueConfiguration withFilter(NotificationFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue
     * 
     */
    public CharSequence getQueue() {
        return queue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-queueconfig.html#cfn-s3-bucket-notificationconfig-queueconfig-queue
     * 
     */
    public void setQueue(CharSequence queue) {
        this.queue = queue;
    }

    public QueueConfiguration withQueue(CharSequence queue) {
        this.queue = queue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("event", event).append("filter", filter).append("queue", queue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(event).append(queue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueueConfiguration) == false) {
            return false;
        }
        QueueConfiguration rhs = ((QueueConfiguration) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(event, rhs.event).append(queue, rhs.queue).isEquals();
    }

}
