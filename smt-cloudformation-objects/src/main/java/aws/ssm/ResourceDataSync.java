
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
    private String kMSKeyArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname")
    private String bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
    @JsonProperty("BucketRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion")
    private String bucketRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
    @JsonProperty("SyncFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat")
    private String syncFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    @JsonProperty("SyncName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname")
    private String syncName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonProperty("BucketPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix")
    private String bucketPrefix;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    @JsonProperty("KMSKeyArn")
    public String getKMSKeyArn() {
        return kMSKeyArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-kmskeyarn
     * 
     */
    @JsonProperty("KMSKeyArn")
    public void setKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
    }

    public ResourceDataSync withKMSKeyArn(String kMSKeyArn) {
        this.kMSKeyArn = kMSKeyArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    @JsonProperty("BucketName")
    public String getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketname
     * 
     */
    @JsonProperty("BucketName")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public ResourceDataSync withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
    @JsonProperty("BucketRegion")
    public String getBucketRegion() {
        return bucketRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketregion
     * 
     */
    @JsonProperty("BucketRegion")
    public void setBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
    }

    public ResourceDataSync withBucketRegion(String bucketRegion) {
        this.bucketRegion = bucketRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
    @JsonProperty("SyncFormat")
    public String getSyncFormat() {
        return syncFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncformat
     * 
     */
    @JsonProperty("SyncFormat")
    public void setSyncFormat(String syncFormat) {
        this.syncFormat = syncFormat;
    }

    public ResourceDataSync withSyncFormat(String syncFormat) {
        this.syncFormat = syncFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    @JsonProperty("SyncName")
    public String getSyncName() {
        return syncName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-syncname
     * 
     */
    @JsonProperty("SyncName")
    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    public ResourceDataSync withSyncName(String syncName) {
        this.syncName = syncName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonProperty("BucketPrefix")
    public String getBucketPrefix() {
        return bucketPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-resourcedatasync.html#cfn-ssm-resourcedatasync-bucketprefix
     * 
     */
    @JsonProperty("BucketPrefix")
    public void setBucketPrefix(String bucketPrefix) {
        this.bucketPrefix = bucketPrefix;
    }

    public ResourceDataSync withBucketPrefix(String bucketPrefix) {
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
