
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3DestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BucketARN",
    "BufferingHints",
    "CloudWatchLoggingOptions",
    "CompressionFormat",
    "EncryptionConfiguration",
    "Prefix",
    "RoleARN"
})
public class S3DestinationConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn")
    private CharSequence bucketARN;
    /**
     * ElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonProperty("BufferingHints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html")
    private ElasticsearchBufferingHints bufferingHints;
    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonProperty("CloudWatchLoggingOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html")
    private CloudWatchLoggingOptions cloudWatchLoggingOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat
     * 
     */
    @JsonProperty("CompressionFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat")
    private CharSequence compressionFormat;
    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html")
    private EncryptionConfiguration encryptionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix")
    private CharSequence prefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn")
    private CharSequence roleARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn
     * 
     */
    public CharSequence getBucketARN() {
        return bucketARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-bucketarn
     * 
     */
    public void setBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
    }

    public S3DestinationConfiguration withBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
        return this;
    }

    /**
     * ElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    public ElasticsearchBufferingHints getBufferingHints() {
        return bufferingHints;
    }

    /**
     * ElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    public void setBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    public S3DestinationConfiguration withBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
        return this;
    }

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return cloudWatchLoggingOptions;
    }

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    public S3DestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat
     * 
     */
    public CharSequence getCompressionFormat() {
        return compressionFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-compressionformat
     * 
     */
    public void setCompressionFormat(CharSequence compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public S3DestinationConfiguration withCompressionFormat(CharSequence compressionFormat) {
        this.compressionFormat = compressionFormat;
        return this;
    }

    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    public S3DestinationConfiguration withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix
     * 
     */
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-prefix
     * 
     */
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public S3DestinationConfiguration withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn
     * 
     */
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-s3destinationconfiguration-rolearn
     * 
     */
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public S3DestinationConfiguration withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketARN", bucketARN).append("bufferingHints", bufferingHints).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("compressionFormat", compressionFormat).append("encryptionConfiguration", encryptionConfiguration).append("prefix", prefix).append("roleARN", roleARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(bucketARN).append(prefix).append(roleARN).append(compressionFormat).append(encryptionConfiguration).append(bufferingHints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3DestinationConfiguration) == false) {
            return false;
        }
        S3DestinationConfiguration rhs = ((S3DestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(bucketARN, rhs.bucketARN).append(prefix, rhs.prefix).append(roleARN, rhs.roleARN).append(compressionFormat, rhs.compressionFormat).append(encryptionConfiguration, rhs.encryptionConfiguration).append(bufferingHints, rhs.bufferingHints).isEquals();
    }

}
