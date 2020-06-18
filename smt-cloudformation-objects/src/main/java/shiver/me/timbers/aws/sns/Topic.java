
package shiver.me.timbers.aws.sns;

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
import shiver.me.timbers.aws.Tag;


/**
 * Topic
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ContentBasedDeduplication",
    "DisplayName",
    "FifoTopic",
    "KmsMasterKeyId",
    "Subscription",
    "Tags",
    "TopicName"
})
public class Topic {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-contentbaseddeduplication
     * 
     */
    @JsonProperty("ContentBasedDeduplication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-contentbaseddeduplication")
    private CharSequence contentBasedDeduplication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname
     * 
     */
    @JsonProperty("DisplayName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname")
    private CharSequence displayName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-fifotopic
     * 
     */
    @JsonProperty("FifoTopic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-fifotopic")
    private CharSequence fifoTopic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-kmsmasterkeyid
     * 
     */
    @JsonProperty("KmsMasterKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-kmsmasterkeyid")
    private CharSequence kmsMasterKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription
     * 
     */
    @JsonProperty("Subscription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription")
    private List<Property<TopicSubscription>> subscription = new ArrayList<Property<TopicSubscription>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname
     * 
     */
    @JsonProperty("TopicName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname")
    private CharSequence topicName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-contentbaseddeduplication
     * 
     */
    @JsonIgnore
    public CharSequence getContentBasedDeduplication() {
        return contentBasedDeduplication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-contentbaseddeduplication
     * 
     */
    @JsonIgnore
    public void setContentBasedDeduplication(CharSequence contentBasedDeduplication) {
        this.contentBasedDeduplication = contentBasedDeduplication;
    }

    public Topic withContentBasedDeduplication(CharSequence contentBasedDeduplication) {
        this.contentBasedDeduplication = contentBasedDeduplication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname
     * 
     */
    @JsonIgnore
    public CharSequence getDisplayName() {
        return displayName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-displayname
     * 
     */
    @JsonIgnore
    public void setDisplayName(CharSequence displayName) {
        this.displayName = displayName;
    }

    public Topic withDisplayName(CharSequence displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-fifotopic
     * 
     */
    @JsonIgnore
    public CharSequence getFifoTopic() {
        return fifoTopic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-fifotopic
     * 
     */
    @JsonIgnore
    public void setFifoTopic(CharSequence fifoTopic) {
        this.fifoTopic = fifoTopic;
    }

    public Topic withFifoTopic(CharSequence fifoTopic) {
        this.fifoTopic = fifoTopic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKmsMasterKeyId() {
        return kmsMasterKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-kmsmasterkeyid
     * 
     */
    @JsonIgnore
    public void setKmsMasterKeyId(CharSequence kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    public Topic withKmsMasterKeyId(CharSequence kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription
     * 
     */
    @JsonIgnore
    public List<Property<TopicSubscription>> getSubscription() {
        return subscription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-subscription
     * 
     */
    @JsonIgnore
    public void setSubscription(List<Property<TopicSubscription>> subscription) {
        this.subscription = subscription;
    }

    public Topic withSubscription(List<Property<TopicSubscription>> subscription) {
        this.subscription = subscription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Topic withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname
     * 
     */
    @JsonIgnore
    public CharSequence getTopicName() {
        return topicName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-topic.html#cfn-sns-topic-topicname
     * 
     */
    @JsonIgnore
    public void setTopicName(CharSequence topicName) {
        this.topicName = topicName;
    }

    public Topic withTopicName(CharSequence topicName) {
        this.topicName = topicName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contentBasedDeduplication", contentBasedDeduplication).append("displayName", displayName).append("fifoTopic", fifoTopic).append("kmsMasterKeyId", kmsMasterKeyId).append("subscription", subscription).append("tags", tags).append("topicName", topicName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(contentBasedDeduplication).append(displayName).append(topicName).append(fifoTopic).append(kmsMasterKeyId).append(subscription).append(tags).toHashCode();
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
        return new EqualsBuilder().append(contentBasedDeduplication, rhs.contentBasedDeduplication).append(displayName, rhs.displayName).append(topicName, rhs.topicName).append(fifoTopic, rhs.fifoTopic).append(kmsMasterKeyId, rhs.kmsMasterKeyId).append(subscription, rhs.subscription).append(tags, rhs.tags).isEquals();
    }

}
