
package aws.sns;

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
 * Topic
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DisplayName",
    "Subscription",
    "TopicName"
})
public class Topic {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname
     * 
     */
    @JsonProperty("DisplayName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname")
    private CharSequence displayName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription
     * 
     */
    @JsonProperty("Subscription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription")
    private List<Subscription> subscription = new ArrayList<Subscription>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname
     * 
     */
    @JsonProperty("TopicName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname")
    private CharSequence topicName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname
     * 
     */
    public CharSequence getDisplayName() {
        return displayName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname
     * 
     */
    public void setDisplayName(CharSequence displayName) {
        this.displayName = displayName;
    }

    public Topic withDisplayName(CharSequence displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription
     * 
     */
    public List<Subscription> getSubscription() {
        return subscription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription
     * 
     */
    public void setSubscription(List<Subscription> subscription) {
        this.subscription = subscription;
    }

    public Topic withSubscription(List<Subscription> subscription) {
        this.subscription = subscription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname
     * 
     */
    public CharSequence getTopicName() {
        return topicName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname
     * 
     */
    public void setTopicName(CharSequence topicName) {
        this.topicName = topicName;
    }

    public Topic withTopicName(CharSequence topicName) {
        this.topicName = topicName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("displayName", displayName).append("subscription", subscription).append("topicName", topicName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topicName).append(subscription).append(displayName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Topic) == false) {
            return false;
        }
        Topic rhs = ((Topic) other);
        return new EqualsBuilder().append(topicName, rhs.topicName).append(subscription, rhs.subscription).append(displayName, rhs.displayName).isEquals();
    }

}
