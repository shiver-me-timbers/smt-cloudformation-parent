
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ExtendedS3DestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
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
    "ProcessingConfiguration",
    "RoleARN",
    "S3BackupConfiguration",
    "S3BackupMode"
})
public class ExtendedS3DestinationConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn")
    private String bucketARN;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat
     * 
     */
    @JsonProperty("CompressionFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat")
    private String compressionFormat;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix")
    private String prefix;
    /**
     * ProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonProperty("ProcessingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html")
    private ProcessingConfiguration processingConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn")
    private String roleARN;
    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3BackupConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private S3DestinationConfiguration s3BackupConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode")
    private String s3BackupMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    public String getBucketARN() {
        return bucketARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    public void setBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
    }

    public ExtendedS3DestinationConfiguration withBucketARN(String bucketARN) {
        this.bucketARN = bucketARN;
        return this;
    }

    /**
     * ElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonProperty("BufferingHints")
    public ElasticsearchBufferingHints getBufferingHints() {
        return bufferingHints;
    }

    /**
     * ElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonProperty("BufferingHints")
    public void setBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    public ExtendedS3DestinationConfiguration withBufferingHints(ElasticsearchBufferingHints bufferingHints) {
        this.bufferingHints = bufferingHints;
        return this;
    }

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonProperty("CloudWatchLoggingOptions")
    public CloudWatchLoggingOptions getCloudWatchLoggingOptions() {
        return cloudWatchLoggingOptions;
    }

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonProperty("CloudWatchLoggingOptions")
    public void setCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    public ExtendedS3DestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat
     * 
     */
    @JsonProperty("CompressionFormat")
    public String getCompressionFormat() {
        return compressionFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat
     * 
     */
    @JsonProperty("CompressionFormat")
    public void setCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public ExtendedS3DestinationConfiguration withCompressionFormat(String compressionFormat) {
        this.compressionFormat = compressionFormat;
        return this;
    }

    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    public EncryptionConfiguration getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * EncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    public void setEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    public ExtendedS3DestinationConfiguration withEncryptionConfiguration(EncryptionConfiguration encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    public String getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public ExtendedS3DestinationConfiguration withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * ProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonProperty("ProcessingConfiguration")
    public ProcessingConfiguration getProcessingConfiguration() {
        return processingConfiguration;
    }

    /**
     * ProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonProperty("ProcessingConfiguration")
    public void setProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    public ExtendedS3DestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    public ExtendedS3DestinationConfiguration withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3BackupConfiguration")
    public S3DestinationConfiguration getS3BackupConfiguration() {
        return s3BackupConfiguration;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3BackupConfiguration")
    public void setS3BackupConfiguration(S3DestinationConfiguration s3BackupConfiguration) {
        this.s3BackupConfiguration = s3BackupConfiguration;
    }

    public ExtendedS3DestinationConfiguration withS3BackupConfiguration(S3DestinationConfiguration s3BackupConfiguration) {
        this.s3BackupConfiguration = s3BackupConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    public String getS3BackupMode() {
        return s3BackupMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    public void setS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    public ExtendedS3DestinationConfiguration withS3BackupMode(String s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketARN", bucketARN).append("bufferingHints", bufferingHints).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("compressionFormat", compressionFormat).append("encryptionConfiguration", encryptionConfiguration).append("prefix", prefix).append("processingConfiguration", processingConfiguration).append("roleARN", roleARN).append("s3BackupConfiguration", s3BackupConfiguration).append("s3BackupMode", s3BackupMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(processingConfiguration).append(bucketARN).append(prefix).append(roleARN).append(s3BackupConfiguration).append(compressionFormat).append(encryptionConfiguration).append(s3BackupMode).append(bufferingHints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ExtendedS3DestinationConfiguration) == false) {
            return false;
        }
        ExtendedS3DestinationConfiguration rhs = ((ExtendedS3DestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(processingConfiguration, rhs.processingConfiguration).append(bucketARN, rhs.bucketARN).append(prefix, rhs.prefix).append(roleARN, rhs.roleARN).append(s3BackupConfiguration, rhs.s3BackupConfiguration).append(compressionFormat, rhs.compressionFormat).append(encryptionConfiguration, rhs.encryptionConfiguration).append(s3BackupMode, rhs.s3BackupMode).append(bufferingHints, rhs.bufferingHints).isEquals();
    }

}
