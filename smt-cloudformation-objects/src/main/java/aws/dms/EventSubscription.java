
package aws.dms;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EventSubscription
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SourceType",
    "EventCategories",
    "Enabled",
    "SubscriptionName",
    "SnsTopicArn",
    "SourceIds",
    "Tags"
})
public class EventSubscription {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype
     * 
     */
    @JsonProperty("SourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype")
    private CharSequence sourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories
     * 
     */
    @JsonProperty("EventCategories")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories")
    private List<CharSequence> eventCategories = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname
     * 
     */
    @JsonProperty("SubscriptionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname")
    private CharSequence subscriptionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn")
    private CharSequence snsTopicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids
     * 
     */
    @JsonProperty("SourceIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids")
    private List<CharSequence> sourceIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype
     * 
     */
    public CharSequence getSourceType() {
        return sourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourcetype
     * 
     */
    public void setSourceType(CharSequence sourceType) {
        this.sourceType = sourceType;
    }

    public EventSubscription withSourceType(CharSequence sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories
     * 
     */
    public List<CharSequence> getEventCategories() {
        return eventCategories;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-eventcategories
     * 
     */
    public void setEventCategories(List<CharSequence> eventCategories) {
        this.eventCategories = eventCategories;
    }

    public EventSubscription withEventCategories(List<CharSequence> eventCategories) {
        this.eventCategories = eventCategories;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public EventSubscription withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname
     * 
     */
    public CharSequence getSubscriptionName() {
        return subscriptionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-subscriptionname
     * 
     */
    public void setSubscriptionName(CharSequence subscriptionName) {
        this.subscriptionName = subscriptionName;
    }

    public EventSubscription withSubscriptionName(CharSequence subscriptionName) {
        this.subscriptionName = subscriptionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn
     * 
     */
    public CharSequence getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-snstopicarn
     * 
     */
    public void setSnsTopicArn(CharSequence snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    public EventSubscription withSnsTopicArn(CharSequence snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids
     * 
     */
    public List<CharSequence> getSourceIds() {
        return sourceIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-sourceids
     * 
     */
    public void setSourceIds(List<CharSequence> sourceIds) {
        this.sourceIds = sourceIds;
    }

    public EventSubscription withSourceIds(List<CharSequence> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-eventsubscription.html#cfn-dms-eventsubscription-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public EventSubscription withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourceType", sourceType).append("eventCategories", eventCategories).append("enabled", enabled).append("subscriptionName", subscriptionName).append("snsTopicArn", snsTopicArn).append("sourceIds", sourceIds).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceType).append(snsTopicArn).append(subscriptionName).append(eventCategories).append(enabled).append(sourceIds).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventSubscription) == false) {
            return false;
        }
        EventSubscription rhs = ((EventSubscription) other);
        return new EqualsBuilder().append(sourceType, rhs.sourceType).append(snsTopicArn, rhs.snsTopicArn).append(subscriptionName, rhs.subscriptionName).append(eventCategories, rhs.eventCategories).append(enabled, rhs.enabled).append(sourceIds, rhs.sourceIds).append(tags, rhs.tags).isEquals();
    }

}
