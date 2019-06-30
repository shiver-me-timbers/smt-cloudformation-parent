
package aws.cloudtrail;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    private CharSequence cloudWatchLogsLogGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn
     * 
     */
    @JsonProperty("CloudWatchLogsRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn")
    private CharSequence cloudWatchLogsRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation
     * 
     */
    @JsonProperty("EnableLogFileValidation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation")
    private CharSequence enableLogFileValidation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors
     * 
     */
    @JsonProperty("EventSelectors")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors")
    private Set<Property<TrailEventSelector>> eventSelectors = new LinkedHashSet<Property<TrailEventSelector>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents
     * 
     */
    @JsonProperty("IncludeGlobalServiceEvents")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents")
    private CharSequence includeGlobalServiceEvents;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging
     * 
     */
    @JsonProperty("IsLogging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging")
    private CharSequence isLogging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail
     * 
     */
    @JsonProperty("IsMultiRegionTrail")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail")
    private CharSequence isMultiRegionTrail;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid
     * 
     */
    @JsonProperty("KMSKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid")
    private CharSequence kMSKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname")
    private CharSequence s3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix
     * 
     */
    @JsonProperty("S3KeyPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix")
    private CharSequence s3KeyPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname
     * 
     */
    @JsonProperty("SnsTopicName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname")
    private CharSequence snsTopicName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname
     * 
     */
    @JsonProperty("TrailName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname")
    private CharSequence trailName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsloggrouparn
     * 
     */
    @JsonIgnore
    public void setCloudWatchLogsLogGroupArn(CharSequence cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    public Trail withCloudWatchLogsLogGroupArn(CharSequence cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-cloudwatchlogsrolearn
     * 
     */
    @JsonIgnore
    public void setCloudWatchLogsRoleArn(CharSequence cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    public Trail withCloudWatchLogsRoleArn(CharSequence cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation
     * 
     */
    @JsonIgnore
    public CharSequence getEnableLogFileValidation() {
        return enableLogFileValidation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-enablelogfilevalidation
     * 
     */
    @JsonIgnore
    public void setEnableLogFileValidation(CharSequence enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
    }

    public Trail withEnableLogFileValidation(CharSequence enableLogFileValidation) {
        this.enableLogFileValidation = enableLogFileValidation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors
     * 
     */
    @JsonIgnore
    public Set<Property<TrailEventSelector>> getEventSelectors() {
        return eventSelectors;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-eventselectors
     * 
     */
    @JsonIgnore
    public void setEventSelectors(Set<Property<TrailEventSelector>> eventSelectors) {
        this.eventSelectors = eventSelectors;
    }

    public Trail withEventSelectors(Set<Property<TrailEventSelector>> eventSelectors) {
        this.eventSelectors = eventSelectors;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeGlobalServiceEvents() {
        return includeGlobalServiceEvents;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-includeglobalserviceevents
     * 
     */
    @JsonIgnore
    public void setIncludeGlobalServiceEvents(CharSequence includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
    }

    public Trail withIncludeGlobalServiceEvents(CharSequence includeGlobalServiceEvents) {
        this.includeGlobalServiceEvents = includeGlobalServiceEvents;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging
     * 
     */
    @JsonIgnore
    public CharSequence getIsLogging() {
        return isLogging;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-islogging
     * 
     */
    @JsonIgnore
    public void setIsLogging(CharSequence isLogging) {
        this.isLogging = isLogging;
    }

    public Trail withIsLogging(CharSequence isLogging) {
        this.isLogging = isLogging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail
     * 
     */
    @JsonIgnore
    public CharSequence getIsMultiRegionTrail() {
        return isMultiRegionTrail;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-ismultiregiontrail
     * 
     */
    @JsonIgnore
    public void setIsMultiRegionTrail(CharSequence isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
    }

    public Trail withIsMultiRegionTrail(CharSequence isMultiRegionTrail) {
        this.isMultiRegionTrail = isMultiRegionTrail;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid
     * 
     */
    @JsonIgnore
    public CharSequence getKMSKeyId() {
        return kMSKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-kmskeyid
     * 
     */
    @JsonIgnore
    public void setKMSKeyId(CharSequence kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
    }

    public Trail withKMSKeyId(CharSequence kMSKeyId) {
        this.kMSKeyId = kMSKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getS3BucketName() {
        return s3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3bucketname
     * 
     */
    @JsonIgnore
    public void setS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    public Trail withS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix
     * 
     */
    @JsonIgnore
    public CharSequence getS3KeyPrefix() {
        return s3KeyPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-s3keyprefix
     * 
     */
    @JsonIgnore
    public void setS3KeyPrefix(CharSequence s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
    }

    public Trail withS3KeyPrefix(CharSequence s3KeyPrefix) {
        this.s3KeyPrefix = s3KeyPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname
     * 
     */
    @JsonIgnore
    public CharSequence getSnsTopicName() {
        return snsTopicName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-snstopicname
     * 
     */
    @JsonIgnore
    public void setSnsTopicName(CharSequence snsTopicName) {
        this.snsTopicName = snsTopicName;
    }

    public Trail withSnsTopicName(CharSequence snsTopicName) {
        this.snsTopicName = snsTopicName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Trail withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname
     * 
     */
    @JsonIgnore
    public CharSequence getTrailName() {
        return trailName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudtrail-trail.html#cfn-cloudtrail-trail-trailname
     * 
     */
    @JsonIgnore
    public void setTrailName(CharSequence trailName) {
        this.trailName = trailName;
    }

    public Trail withTrailName(CharSequence trailName) {
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
