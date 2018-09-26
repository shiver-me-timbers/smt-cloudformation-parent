
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReplicationDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AccessControlTranslation",
    "Account",
    "Bucket",
    "EncryptionConfiguration",
    "StorageClass"
})
public class ReplicationDestination {

    /**
     * AccessControlTranslation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
     * 
     */
    @JsonProperty("AccessControlTranslation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html")
    private AccessControlTranslation accessControlTranslation;
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
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html")
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass
     * 
     */
    @JsonProperty("StorageClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass")
    private CharSequence storageClass;

    /**
     * AccessControlTranslation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
     * 
     */
    public AccessControlTranslation getAccessControlTranslation() {
        return accessControlTranslation;
    }

    /**
     * AccessControlTranslation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
     * 
     */
    public void setAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
    }

    public ReplicationDestination withAccessControlTranslation(AccessControlTranslation accessControlTranslation) {
        this.accessControlTranslation = accessControlTranslation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account
     * 
     */
    public CharSequence getAccount() {
        return account;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationdestination-account
     * 
     */
    public void setAccount(CharSequence account) {
        this.account = account;
    }

    public ReplicationDestination withAccount(CharSequence account) {
        this.account = account;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket
     * 
     */
    public CharSequence getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-bucket
     * 
     */
    public void setBucket(CharSequence bucket) {
        this.bucket = bucket;
    }

    public ReplicationDestination withBucket(CharSequence bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
     * 
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-encryptionconfiguration.html
     * 
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    public ReplicationDestination withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass
     * 
     */
    public CharSequence getStorageClass() {
        return storageClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-replicationconfiguration-rules-destination.html#cfn-s3-bucket-replicationconfiguration-rules-destination-storageclass
     * 
     */
    public void setStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
    }

    public ReplicationDestination withStorageClass(CharSequence storageClass) {
        this.storageClass = storageClass;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accessControlTranslation", accessControlTranslation).append("account", account).append("bucket", bucket).append("encryptionConfiguration", encryptionConfiguration).append("storageClass", storageClass).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(encryptionConfiguration).append(accessControlTranslation).append(storageClass).append(account).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationDestination) == false) {
            return false;
        }
        ReplicationDestination rhs = ((ReplicationDestination) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(encryptionConfiguration, rhs.encryptionConfiguration).append(accessControlTranslation, rhs.accessControlTranslation).append(storageClass, rhs.storageClass).append(account, rhs.account).isEquals();
    }

}
