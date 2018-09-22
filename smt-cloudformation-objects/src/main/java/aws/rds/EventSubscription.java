
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
    private Set<String> eventCategories = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn")
    private String snsTopicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids
     * 
     */
    @JsonProperty("SourceIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids")
    private List<String> sourceIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype
     * 
     */
    @JsonProperty("SourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype")
    private String sourceType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled
     * 
     */
    @JsonProperty("Enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-enabled
     * 
     */
    @JsonProperty("Enabled")
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
    @JsonProperty("EventCategories")
    public Set<String> getEventCategories() {
        return eventCategories;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-eventcategories
     * 
     */
    @JsonProperty("EventCategories")
    public void setEventCategories(Set<String> eventCategories) {
        this.eventCategories = eventCategories;
    }

    public EventSubscription withEventCategories(Set<String> eventCategories) {
        this.eventCategories = eventCategories;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicArn")
    public String getSnsTopicArn() {
        return snsTopicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-snstopicarn
     * 
     */
    @JsonProperty("SnsTopicArn")
    public void setSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
    }

    public EventSubscription withSnsTopicArn(String snsTopicArn) {
        this.snsTopicArn = snsTopicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids
     * 
     */
    @JsonProperty("SourceIds")
    public List<String> getSourceIds() {
        return sourceIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourceids
     * 
     */
    @JsonProperty("SourceIds")
    public void setSourceIds(List<String> sourceIds) {
        this.sourceIds = sourceIds;
    }

    public EventSubscription withSourceIds(List<String> sourceIds) {
        this.sourceIds = sourceIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype
     * 
     */
    @JsonProperty("SourceType")
    public String getSourceType() {
        return sourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-eventsubscription.html#cfn-rds-eventsubscription-sourcetype
     * 
     */
    @JsonProperty("SourceType")
    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public EventSubscription withSourceType(String sourceType) {
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
