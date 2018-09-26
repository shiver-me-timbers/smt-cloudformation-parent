
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TopicConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Event",
    "Filter",
    "Topic"
})
public class TopicConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event
     * 
     */
    @JsonProperty("Event")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event")
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic
     * 
     */
    @JsonProperty("Topic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic")
    private CharSequence topic;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event
     * 
     */
    public CharSequence getEvent() {
        return event;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event
     * 
     */
    public void setEvent(CharSequence event) {
        this.event = event;
    }

    public TopicConfiguration withEvent(CharSequence event) {
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

    public TopicConfiguration withFilter(NotificationFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic
     * 
     */
    public CharSequence getTopic() {
        return topic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic
     * 
     */
    public void setTopic(CharSequence topic) {
        this.topic = topic;
    }

    public TopicConfiguration withTopic(CharSequence topic) {
        this.topic = topic;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("event", event).append("filter", filter).append("topic", topic).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filter).append(topic).append(event).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicConfiguration) == false) {
            return false;
        }
        TopicConfiguration rhs = ((TopicConfiguration) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(topic, rhs.topic).append(event, rhs.event).isEquals();
    }

}
