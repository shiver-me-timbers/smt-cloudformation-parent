
package shiver.me.timbers.aws.s3;

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
 * BucketReplicationDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccessControlTranslation",
    "Account",
    "Bucket",
    "EncryptionConfiguration",
    "Metrics",
    "ReplicationTime",
    "StorageClass"
})
public class BucketReplicationDestination implements Property<BucketReplicationDestination>
{

    /**
     * BucketAccessControlTranslation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
     * 
     */
    @JsonProperty("AccessControlTranslation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html")
    private Property<BucketAccessControlTranslation> accessControlTranslation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account
     * 
     */
    @JsonProperty("Account")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account")
    private CharSequence account;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket")
    private CharSequence bucket;
    /**
     * BucketEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html")
    private Property<BucketEncryptionConfiguration> encryptionConfiguration;
    /**
     * BucketMetrics
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html
     * 
     */
    @JsonProperty("Metrics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html")
    private Property<BucketMetrics> metrics;
    /**
     * BucketReplicationTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html
     * 
     */
    @JsonProperty("ReplicationTime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html")
    private Property<BucketReplicationTime> replicationTime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass
     * 
     */
    @JsonProperty("StorageClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass")
    private CharSequence storageClass;

    /**
     * BucketAccessControlTranslation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
     * 
     */
    @JsonIgnore
    public Property<BucketAccessControlTranslation> getAccessControlTranslation() {
        return accessControlTranslation;
    }

    /**
     * BucketAccessControlTranslation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
     * 
     */
    @JsonIgnore
    public void setAccessControlTranslation(Property<BucketAccessControlTranslation> accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
    }

    public BucketReplicationDestination withAccessControlTranslation(Property<BucketAccessControlTranslation> accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account
     * 
     */
    @JsonIgnore
    public CharSequence getAccount() {
        return account;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account
     * 
     */
    @JsonIgnore
    public void setAccount(CharSequence account) {
        this.account = account;
    }

    public BucketReplicationDestination withAccount(CharSequence account) {
        this.account = account;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket
     * 
     */
    @JsonIgnore
    public CharSequence getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket
     * 
     */
    @JsonIgnore
    public void setBucket(CharSequence bucket) {
        this.bucket = bucket;
    }

    public BucketReplicationDestination withBucket(CharSequence bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * BucketEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<BucketEncryptionConfiguration> getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * BucketEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEncryptionConfiguration(Property<BucketEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    public BucketReplicationDestination withEncryptionConfiguration(Property<BucketEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * BucketMetrics
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html
     * 
     */
    @JsonIgnore
    public Property<BucketMetrics> getMetrics() {
        return metrics;
    }

    /**
     * BucketMetrics
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-metrics.html
     * 
     */
    @JsonIgnore
    public void setMetrics(Property<BucketMetrics> metrics) {
        this.metrics = metrics;
    }

    public BucketReplicationDestination withMetrics(Property<BucketMetrics> metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * BucketReplicationTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html
     * 
     */
    @JsonIgnore
    public Property<BucketReplicationTime> getReplicationTime() {
        return replicationTime;
    }

    /**
     * BucketReplicationTime
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationtime.html
     * 
     */
    @JsonIgnore
    public void setReplicationTime(Property<BucketReplicationTime> replicationTime) {
        this.replicationTime = replicationTime;
    }

    public BucketReplicationDestination withReplicationTime(Property<BucketReplicationTime> replicationTime) {
        this.replicationTime = replicationTime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass
     * 
     */
    @JsonIgnore
    public CharSequence getStorageClass() {
        return storageClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass
     * 
     */
    @JsonIgnore
    public void setStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
    }

    public BucketReplicationDestination withStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accessControlTranslation", accessControlTranslation).append("account", account).append("bucket", bucket).append("encryptionConfiguration", encryptionConfiguration).append("metrics", metrics).append("replicationTime", replicationTime).append("storageClass", storageClass).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(accessControlTranslation).append(storageClass).append(encryptionConfiguration).append(replicationTime).append(metrics).append(account).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketReplicationDestination) == false) {
            return false;
        }
        BucketReplicationDestination rhs = ((BucketReplicationDestination) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(accessControlTranslation, rhs.accessControlTranslation).append(storageClass, rhs.storageClass).append(encryptionConfiguration, rhs.encryptionConfiguration).append(replicationTime, rhs.replicationTime).append(metrics, rhs.metrics).append(account, rhs.account).isEquals();
    }

}
