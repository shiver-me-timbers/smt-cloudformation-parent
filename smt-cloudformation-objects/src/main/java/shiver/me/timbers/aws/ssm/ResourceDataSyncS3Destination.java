
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
 * ResourceDataSyncS3Destination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KMSKeyArn",
    "BucketName",
    "BucketRegion",
    "SyncFormat",
    "BucketPrefix"
})
public class ResourceDataSyncS3Destination implements Property<ResourceDataSyncS3Destination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-kmskeyarn
     * 
     */
    @JsonProperty("KMSKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-kmskeyarn")
    private CharSequence kMSKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketname")
    private CharSequence bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketregion
     * 
     */
    @JsonProperty("BucketRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketregion")
    private CharSequence bucketRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-syncformat
     * 
     */
    @JsonProperty("SyncFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-syncformat")
    private CharSequence syncFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketprefix
     * 
     */
    @JsonProperty("BucketPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketprefix")
    private CharSequence bucketPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-kmskeyarn
     * 
     */
    @JsonIgnore
    public CharSequence getKMSKeyArn() {
        return kMSKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-kmskeyarn
     * 
     */
    @JsonIgnore
    public void setKMSKeyArn(CharSequence kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    public ResourceDataSyncS3Destination withKMSKeyArn(CharSequence kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketname
     * 
     */
    @JsonIgnore
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public ResourceDataSyncS3Destination withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketregion
     * 
     */
    @JsonIgnore
    public CharSequence getBucketRegion() {
        return bucketRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketregion
     * 
     */
    @JsonIgnore
    public void setBucketRegion(CharSequence bucketRegion) {
        this.bucketRegion = bucketRegion;
    }

    public ResourceDataSyncS3Destination withBucketRegion(CharSequence bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-syncformat
     * 
     */
    @JsonIgnore
    public CharSequence getSyncFormat() {
        return syncFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-syncformat
     * 
     */
    @JsonIgnore
    public void setSyncFormat(CharSequence syncFormat) {
        this.syncFormat = syncFormat;
    }

    public ResourceDataSyncS3Destination withSyncFormat(CharSequence syncFormat) {
        this.syncFormat = syncFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketprefix
     * 
     */
    @JsonIgnore
    public CharSequence getBucketPrefix() {
        return bucketPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-s3destination.html#cfn-ssm-resourcedatasync-s3destination-bucketprefix
     * 
     */
    @JsonIgnore
    public void setBucketPrefix(CharSequence bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    public ResourceDataSyncS3Destination withBucketPrefix(CharSequence bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kMSKeyArn", kMSKeyArn).append("bucketName", bucketName).append("bucketRegion", bucketRegion).append("syncFormat", syncFormat).append("bucketPrefix", bucketPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucketRegion).append(bucketName).append(kMSKeyArn).append(syncFormat).append(bucketPrefix).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDataSyncS3Destination) == false) {
            return false;
        }
        ResourceDataSyncS3Destination rhs = ((ResourceDataSyncS3Destination) other);
        return new EqualsBuilder().append(bucketRegion, rhs.bucketRegion).append(bucketName, rhs.bucketName).append(kMSKeyArn, rhs.kMSKeyArn).append(syncFormat, rhs.syncFormat).append(bucketPrefix, rhs.bucketPrefix).isEquals();
    }

}
