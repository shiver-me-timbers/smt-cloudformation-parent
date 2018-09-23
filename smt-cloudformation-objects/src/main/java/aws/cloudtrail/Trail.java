
package aws.cloudtrail;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Trail
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchLogsLogGroupArn",
    "CloudWatchLogsRoleArn",
    "EnableLogFileValidation",
    "EventSelectors",
    "IncludeGlobalServiceEvents",
    "IsLogging",
    "IsMultiRegionTrail",
    "KMSKeyId",
    "S3BucketName",
    "S3KeyPrefix",
    "SnsTopicName",
    "Tags",
    "TrailName"
})
public class Trail {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn
     * 
     */
    @JsonProperty("CloudWatchLogsLogGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn")
    private String cloudWatchLogsLogGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn
     * 
     */
    @JsonProperty("CloudWatchLogsRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn")
    private String cloudWatchLogsRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation
     * 
     */
    @JsonProperty("EnableLogFileValidation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation")
    private Boolean enableLogFileValidation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors
     * 
     */
    @JsonProperty("EventSelectors")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors")
    private Set<EventSelector> eventSelectors = new LinkedHashSet<EventSelector>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents
     * 
     */
    @JsonProperty("IncludeGlobalServiceEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents")
    private Boolean includeGlobalServiceEvents;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging
     * 
     */
    @JsonProperty("IsLogging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging")
    private Boolean isLogging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail
     * 
     */
    @JsonProperty("IsMultiRegionTrail")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail")
    private Boolean isMultiRegionTrail;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid
     * 
     */
    @JsonProperty("KMSKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid")
    private String kMSKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname")
    private String s3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix")
    private String s3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname
     * 
     */
    @JsonProperty("SnsTopicName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname")
    private String snsTopicName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname
     * 
     */
    @JsonProperty("TrailName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname")
    private String trailName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn
     * 
     */
    @JsonProperty("CloudWatchLogsLogGroupArn")
    public String getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn
     * 
     */
    @JsonProperty("CloudWatchLogsLogGroupArn")
    public void setCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    public Trail withCloudWatchLogsLogGroupArn(String cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn
     * 
     */
    @JsonProperty("CloudWatchLogsRoleArn")
    public String getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn
     * 
     */
    @JsonProperty("CloudWatchLogsRoleArn")
    public void setCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    public Trail withCloudWatchLogsRoleArn(String cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation
     * 
     */
    @JsonProperty("EnableLogFileValidation")
    public Boolean getEnableLogFileValidation() {
        return enableLogFileValidation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation
     * 
     */
    @JsonProperty("EnableLogFileValidation")
    public void setEnableLogFileValidation(Boolean enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
    }

    public Trail withEnableLogFileValidation(Boolean enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors
     * 
     */
    @JsonProperty("EventSelectors")
    public Set<EventSelector> getEventSelectors() {
        return eventSelectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors
     * 
     */
    @JsonProperty("EventSelectors")
    public void setEventSelectors(Set<EventSelector> eventSelectors) {
        this.eventSelectors = eventSelectors;
    }

    public Trail withEventSelectors(Set<EventSelector> eventSelectors) {
        this.eventSelectors = eventSelectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents
     * 
     */
    @JsonProperty("IncludeGlobalServiceEvents")
    public Boolean getIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents
     * 
     */
    @JsonProperty("IncludeGlobalServiceEvents")
    public void setIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }

    public Trail withIncludeGlobalServiceEvents(Boolean includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging
     * 
     */
    @JsonProperty("IsLogging")
    public Boolean getIsLogging() {
        return isLogging;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging
     * 
     */
    @JsonProperty("IsLogging")
    public void setIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
    }

    public Trail withIsLogging(Boolean isLogging) {
        this.isLogging = isLogging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail
     * 
     */
    @JsonProperty("IsMultiRegionTrail")
    public Boolean getIsMultiRegionTrail() {
        return isMultiRegionTrail;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail
     * 
     */
    @JsonProperty("IsMultiRegionTrail")
    public void setIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
    }

    public Trail withIsMultiRegionTrail(Boolean isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid
     * 
     */
    @JsonProperty("KMSKeyId")
    public String getKMSKeyId() {
        return kMSKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid
     * 
     */
    @JsonProperty("KMSKeyId")
    public void setKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    public Trail withKMSKeyId(String kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    public String getS3BucketName() {
        return s3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    public void setS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    public Trail withS3BucketName(String s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    public String getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    public void setS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    public Trail withS3KeyPrefix(String s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname
     * 
     */
    @JsonProperty("SnsTopicName")
    public String getSnsTopicName() {
        return snsTopicName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname
     * 
     */
    @JsonProperty("SnsTopicName")
    public void setSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
    }

    public Trail withSnsTopicName(String snsTopicName) {
        this.snsTopicName = snsTopicName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Trail withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname
     * 
     */
    @JsonProperty("TrailName")
    public String getTrailName() {
        return trailName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname
     * 
     */
    @JsonProperty("TrailName")
    public void setTrailName(String trailName) {
        this.trailName = trailName;
    }

    public Trail withTrailName(String trailName) {
        this.trailName = trailName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLogsLogGroupArn", cloudWatchLogsLogGroupArn).append("cloudWatchLogsRoleArn", cloudWatchLogsRoleArn).append("enableLogFileValidation", enableLogFileValidation).append("eventSelectors", eventSelectors).append("includeGlobalServiceEvents", includeGlobalServiceEvents).append("isLogging", isLogging).append("isMultiRegionTrail", isMultiRegionTrail).append("kMSKeyId", kMSKeyId).append("s3BucketName", s3BucketName).append("s3KeyPrefix", s3KeyPrefix).append("snsTopicName", snsTopicName).append("tags", tags).append("trailName", trailName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(snsTopicName).append(eventSelectors).append(cloudWatchLogsRoleArn).append(cloudWatchLogsLogGroupArn).append(enableLogFileValidation).append(isLogging).append(includeGlobalServiceEvents).append(tags).append(isMultiRegionTrail).append(s3BucketName).append(kMSKeyId).append(trailName).append(s3KeyPrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Trail) == false) {
            return false;
        }
        Trail rhs = ((Trail) other);
        return new EqualsBuilder().append(snsTopicName, rhs.snsTopicName).append(eventSelectors, rhs.eventSelectors).append(cloudWatchLogsRoleArn, rhs.cloudWatchLogsRoleArn).append(cloudWatchLogsLogGroupArn, rhs.cloudWatchLogsLogGroupArn).append(enableLogFileValidation, rhs.enableLogFileValidation).append(isLogging, rhs.isLogging).append(includeGlobalServiceEvents, rhs.includeGlobalServiceEvents).append(tags, rhs.tags).append(isMultiRegionTrail, rhs.isMultiRegionTrail).append(s3BucketName, rhs.s3BucketName).append(kMSKeyId, rhs.kMSKeyId).append(trailName, rhs.trailName).append(s3KeyPrefix, rhs.s3KeyPrefix).isEquals();
    }

}