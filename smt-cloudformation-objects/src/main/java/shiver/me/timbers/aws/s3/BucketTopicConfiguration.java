
package shiver.me.timbers.aws.s3;

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
 * BucketTopicConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Event",
    "Filter",
    "Topic"
})
public class BucketTopicConfiguration implements Property<BucketTopicConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event
     * 
     */
    @JsonProperty("Event")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event")
    private CharSequence event;
    /**
     * BucketNotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    @JsonProperty("Filter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html")
    private Property<BucketNotificationFilter> filter;
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
    @JsonIgnore
    public CharSequence getEvent() {
        return event;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-event
     * 
     */
    @JsonIgnore
    public void setEvent(CharSequence event) {
        this.event = event;
    }

    public BucketTopicConfiguration withEvent(CharSequence event) {
        this.event = event;
        return this;
    }

    /**
     * BucketNotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    @JsonIgnore
    public Property<BucketNotificationFilter> getFilter() {
        return filter;
    }

    /**
     * BucketNotificationFilter
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfiguration-config-filter.html
     * 
     */
    @JsonIgnore
    public void setFilter(Property<BucketNotificationFilter> filter) {
        this.filter = filter;
    }

    public BucketTopicConfiguration withFilter(Property<BucketNotificationFilter> filter) {
        this.filter = filter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic
     * 
     */
    @JsonIgnore
    public CharSequence getTopic() {
        return topic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-notificationconfig-topicconfig.html#cfn-s3-bucket-notificationconfig-topicconfig-topic
     * 
     */
    @JsonIgnore
    public void setTopic(CharSequence topic) {
        this.topic = topic;
    }

    public BucketTopicConfiguration withTopic(CharSequence topic) {
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
        if ((other instanceof BucketTopicConfiguration) == false) {
            return false;
        }
        BucketTopicConfiguration rhs = ((BucketTopicConfiguration) other);
        return new EqualsBuilder().append(filter, rhs.filter).append(topic, rhs.topic).append(event, rhs.event).isEquals();
    }

}
