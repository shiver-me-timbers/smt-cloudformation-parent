
package shiver.me.timbers.aws.ssm;

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
 * ResourceDataSync
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Destination",
    "KMSKeyArn",
    "SyncSource",
    "BucketName",
    "BucketRegion",
    "SyncFormat",
    "SyncName",
    "SyncType",
    "BucketPrefix"
})
public class ResourceDataSync {

    /**
     * ResourceDataSyncS3Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html
     * 
     */
    @JsonProperty("S3Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html")
    private Property<ResourceDataSyncS3Destination> s3Destination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    @JsonProperty("KMSKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn")
    private CharSequence kMSKeyArn;
    /**
     * ResourceDataSyncSyncSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html
     * 
     */
    @JsonProperty("SyncSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html")
    private Property<ResourceDataSyncSyncSource> syncSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname")
    private CharSequence bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
    @JsonProperty("BucketRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion")
    private CharSequence bucketRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
    @JsonProperty("SyncFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat")
    private CharSequence syncFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    @JsonProperty("SyncName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname")
    private CharSequence syncName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype
     * 
     */
    @JsonProperty("SyncType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype")
    private CharSequence syncType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonProperty("BucketPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix")
    private CharSequence bucketPrefix;

    /**
     * ResourceDataSyncS3Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDataSyncS3Destination> getS3Destination() {
        return s3Destination;
    }

    /**
     * ResourceDataSyncS3Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html
     * 
     */
    @JsonIgnore
    public void setS3Destination(Property<ResourceDataSyncS3Destination> s3Destination) {
        this.s3Destination = s3Destination;
    }

    public ResourceDataSync withS3Destination(Property<ResourceDataSyncS3Destination> s3Destination) {
        this.s3Destination = s3Destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKMSKeyArn() {
        return kMSKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    @JsonIgnore
    public void setKMSKeyArn(CharSequence kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    public ResourceDataSync withKMSKeyArn(CharSequence kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
        return this;
    }

    /**
     * ResourceDataSyncSyncSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDataSyncSyncSource> getSyncSource() {
        return syncSource;
    }

    /**
     * ResourceDataSyncSyncSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-syncsource.html
     * 
     */
    @JsonIgnore
    public void setSyncSource(Property<ResourceDataSyncSyncSource> syncSource) {
        this.syncSource = syncSource;
    }

    public ResourceDataSync withSyncSource(Property<ResourceDataSyncSyncSource> syncSource) {
        this.syncSource = syncSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    @JsonIgnore
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public ResourceDataSync withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
    @JsonIgnore
    public CharSequence getBucketRegion() {
        return bucketRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
    @JsonIgnore
    public void setBucketRegion(CharSequence bucketRegion) {
        this.bucketRegion = bucketRegion;
    }

    public ResourceDataSync withBucketRegion(CharSequence bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
    @JsonIgnore
    public CharSequence getSyncFormat() {
        return syncFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
    @JsonIgnore
    public void setSyncFormat(CharSequence syncFormat) {
        this.syncFormat = syncFormat;
    }

    public ResourceDataSync withSyncFormat(CharSequence syncFormat) {
        this.syncFormat = syncFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    @JsonIgnore
    public CharSequence getSyncName() {
        return syncName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    @JsonIgnore
    public void setSyncName(CharSequence syncName) {
        this.syncName = syncName;
    }

    public ResourceDataSync withSyncName(CharSequence syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype
     * 
     */
    @JsonIgnore
    public CharSequence getSyncType() {
        return syncType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-synctype
     * 
     */
    @JsonIgnore
    public void setSyncType(CharSequence syncType) {
        this.syncType = syncType;
    }

    public ResourceDataSync withSyncType(CharSequence syncType) {
        this.syncType = syncType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonIgnore
    public CharSequence getBucketPrefix() {
        return bucketPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonIgnore
    public void setBucketPrefix(CharSequence bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    public ResourceDataSync withBucketPrefix(CharSequence bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Destination", s3Destination).append("kMSKeyArn", kMSKeyArn).append("syncSource", syncSource).append("bucketName", bucketName).append("bucketRegion", bucketRegion).append("syncFormat", syncFormat).append("syncName", syncName).append("syncType", syncType).append("bucketPrefix", bucketPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucketRegion).append(syncName).append(s3Destination).append(bucketName).append(kMSKeyArn).append(syncSource).append(syncFormat).append(bucketPrefix).append(syncType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDataSync) == false) {
            return false;
        }
        ResourceDataSync rhs = ((ResourceDataSync) other);
        return new EqualsBuilder().append(bucketRegion, rhs.bucketRegion).append(syncName, rhs.syncName).append(s3Destination, rhs.s3Destination).append(bucketName, rhs.bucketName).append(kMSKeyArn, rhs.kMSKeyArn).append(syncSource, rhs.syncSource).append(syncFormat, rhs.syncFormat).append(bucketPrefix, rhs.bucketPrefix).append(syncType, rhs.syncType).isEquals();
    }

}
