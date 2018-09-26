
package aws.rds;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EventSubscription
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "EventCategories",
    "SnsTopicArn",
    "SourceIds",
    "SourceType"
})
public class EventSubscription {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories
     * 
     */
    @JsonProperty("EventCategories")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories")
    private Set<CharSequence> eventCategories = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn")
    private CharSequence snsTopicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids
     * 
     */
    @JsonProperty("SourceIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids")
    private List<CharSequence> sourceIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype
     * 
     */
    @JsonProperty("SourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype")
    private CharSequence sourceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories
     * 
     */
    public Set<CharSequence> getEventCategories() {
        return eventCategories;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories
     * 
     */
    public void setEventCategories(Set<CharSequence> eventCategories) {
        this.eventCategories = eventCategories;
    }

    public EventSubscription withEventCategories(Set<CharSequence> eventCategories) {
        this.eventCategories = eventCategories;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn
     * 
     */
    public CharSequence getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids
     * 
     */
    public List<CharSequence> getSourceIds() {
        return sourceIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype
     * 
     */
    public CharSequence getSourceType() {
        return sourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype
     * 
     */
    public void setSourceType(CharSequence sourceType) {
        this.sourceType = sourceType;
    }

    public EventSubscription withSourceType(CharSequence sourceType) {
        this.sourceType = sourceType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("eventCategories", eventCategories).append("snsTopicArn", snsTopicArn).append("sourceIds", sourceIds).append("sourceType", sourceType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventCategories).append(snsTopicArn).append(sourceType).append(enabled).append(sourceIds).toHashCode();
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
        return new EqualsBuilder().append(eventCategories, rhs.eventCategories).append(snsTopicArn, rhs.snsTopicArn).append(sourceType, rhs.sourceType).append(enabled, rhs.enabled).append(sourceIds, rhs.sourceIds).isEquals();
    }

}
