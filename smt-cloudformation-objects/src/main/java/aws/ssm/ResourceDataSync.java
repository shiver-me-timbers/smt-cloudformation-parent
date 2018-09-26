
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ResourceDataSync
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "KMSKeyArn",
    "BucketName",
    "BucketRegion",
    "SyncFormat",
    "SyncName",
    "BucketPrefix"
})
public class ResourceDataSync {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    @JsonProperty("KMSKeyArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn")
    private CharSequence kMSKeyArn;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonProperty("BucketPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix")
    private CharSequence bucketPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    public CharSequence getKMSKeyArn() {
        return kMSKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    public void setKMSKeyArn(CharSequence kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    public ResourceDataSync withKMSKeyArn(CharSequence kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
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
    public CharSequence getBucketRegion() {
        return bucketRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
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
    public CharSequence getSyncFormat() {
        return syncFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
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
    public CharSequence getSyncName() {
        return syncName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    public void setSyncName(CharSequence syncName) {
        this.syncName = syncName;
    }

    public ResourceDataSync withSyncName(CharSequence syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    public CharSequence getBucketPrefix() {
        return bucketPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    public void setBucketPrefix(CharSequence bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    public ResourceDataSync withBucketPrefix(CharSequence bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("kMSKeyArn", kMSKeyArn).append("bucketName", bucketName).append("bucketRegion", bucketRegion).append("syncFormat", syncFormat).append("syncName", syncName).append("bucketPrefix", bucketPrefix).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucketRegion).append(syncName).append(bucketName).append(kMSKeyArn).append(syncFormat).append(bucketPrefix).toHashCode();
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
        return new EqualsBuilder().append(bucketRegion, rhs.bucketRegion).append(syncName, rhs.syncName).append(bucketName, rhs.bucketName).append(kMSKeyArn, rhs.kMSKeyArn).append(syncFormat, rhs.syncFormat).append(bucketPrefix, rhs.bucketPrefix).isEquals();
    }

}
