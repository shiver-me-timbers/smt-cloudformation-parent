
package aws.kinesisfirehose;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeliveryStreamExtendedS3DestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BucketARN",
    "BufferingHints",
    "CloudWatchLoggingOptions",
    "CompressionFormat",
    "DataFormatConversionConfiguration",
    "EncryptionConfiguration",
    "ErrorOutputPrefix",
    "Prefix",
    "ProcessingConfiguration",
    "RoleARN",
    "S3BackupConfiguration",
    "S3BackupMode"
})
public class DeliveryStreamExtendedS3DestinationConfiguration implements Property<DeliveryStreamExtendedS3DestinationConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn
     * 
     */
    @JsonProperty("BucketARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn")
    private CharSequence bucketARN;
    /**
     * DeliveryStreamElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonProperty("BufferingHints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html")
    private Property<DeliveryStreamBufferingHints> bufferingHints;
    /**
     * DeliveryStreamCloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonProperty("CloudWatchLoggingOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html")
    private Property<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat
     * 
     */
    @JsonProperty("CompressionFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat")
    private CharSequence compressionFormat;
    /**
     * DeliveryStreamDataFormatConversionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html
     * 
     */
    @JsonProperty("DataFormatConversionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html")
    private Property<DeliveryStreamDataFormatConversionConfiguration> dataFormatConversionConfiguration;
    /**
     * DeliveryStreamEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    @JsonProperty("EncryptionConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html")
    private Property<DeliveryStreamEncryptionConfiguration> encryptionConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-erroroutputprefix
     * 
     */
    @JsonProperty("ErrorOutputPrefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-erroroutputprefix")
    private CharSequence errorOutputPrefix;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix
     * 
     */
    @JsonProperty("Prefix")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix")
    private CharSequence prefix;
    /**
     * DeliveryStreamProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonProperty("ProcessingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html")
    private Property<DeliveryStreamProcessingConfiguration> processingConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn")
    private CharSequence roleARN;
    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3BackupConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private Property<DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode")
    private CharSequence s3BackupMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn
     * 
     */
    @JsonIgnore
    public CharSequence getBucketARN() {
        return bucketARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-bucketarn
     * 
     */
    @JsonIgnore
    public void setBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withBucketARN(CharSequence bucketARN) {
        this.bucketARN = bucketARN;
        return this;
    }

    /**
     * DeliveryStreamElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamBufferingHints> getBufferingHints() {
        return bufferingHints;
    }

    /**
     * DeliveryStreamElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonIgnore
    public void setBufferingHints(Property<DeliveryStreamBufferingHints> bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withBufferingHints(Property<DeliveryStreamBufferingHints> bufferingHints) {
        this.bufferingHints = bufferingHints;
        return this;
    }

    /**
     * DeliveryStreamCloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamCloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return cloudWatchLoggingOptions;
    }

    /**
     * DeliveryStreamCloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchLoggingOptions(Property<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withCloudWatchLoggingOptions(Property<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat
     * 
     */
    @JsonIgnore
    public CharSequence getCompressionFormat() {
        return compressionFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-compressionformat
     * 
     */
    @JsonIgnore
    public void setCompressionFormat(CharSequence compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withCompressionFormat(CharSequence compressionFormat) {
        this.compressionFormat = compressionFormat;
        return this;
    }

    /**
     * DeliveryStreamDataFormatConversionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamDataFormatConversionConfiguration> getDataFormatConversionConfiguration() {
        return dataFormatConversionConfiguration;
    }

    /**
     * DeliveryStreamDataFormatConversionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-dataformatconversionconfiguration.html
     * 
     */
    @JsonIgnore
    public void setDataFormatConversionConfiguration(Property<DeliveryStreamDataFormatConversionConfiguration> dataFormatConversionConfiguration) {
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withDataFormatConversionConfiguration(Property<DeliveryStreamDataFormatConversionConfiguration> dataFormatConversionConfiguration) {
        this.dataFormatConversionConfiguration = dataFormatConversionConfiguration;
        return this;
    }

    /**
     * DeliveryStreamEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamEncryptionConfiguration> getEncryptionConfiguration() {
        return encryptionConfiguration;
    }

    /**
     * DeliveryStreamEncryptionConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-encryptionconfiguration.html
     * 
     */
    @JsonIgnore
    public void setEncryptionConfiguration(Property<DeliveryStreamEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withEncryptionConfiguration(Property<DeliveryStreamEncryptionConfiguration> encryptionConfiguration) {
        this.encryptionConfiguration = encryptionConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-erroroutputprefix
     * 
     */
    @JsonIgnore
    public CharSequence getErrorOutputPrefix() {
        return errorOutputPrefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-erroroutputprefix
     * 
     */
    @JsonIgnore
    public void setErrorOutputPrefix(CharSequence errorOutputPrefix) {
        this.errorOutputPrefix = errorOutputPrefix;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withErrorOutputPrefix(CharSequence errorOutputPrefix) {
        this.errorOutputPrefix = errorOutputPrefix;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix
     * 
     */
    @JsonIgnore
    public CharSequence getPrefix() {
        return prefix;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-prefix
     * 
     */
    @JsonIgnore
    public void setPrefix(CharSequence prefix) {
        this.prefix = prefix;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withPrefix(CharSequence prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * DeliveryStreamProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamProcessingConfiguration> getProcessingConfiguration() {
        return processingConfiguration;
    }

    /**
     * DeliveryStreamProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setProcessingConfiguration(Property<DeliveryStreamProcessingConfiguration> processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withProcessingConfiguration(Property<DeliveryStreamProcessingConfiguration> processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamS3DestinationConfiguration> getS3BackupConfiguration() {
        return s3BackupConfiguration;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3BackupConfiguration(Property<DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration) {
        this.s3BackupConfiguration = s3BackupConfiguration;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withS3BackupConfiguration(Property<DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration) {
        this.s3BackupConfiguration = s3BackupConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public CharSequence getS3BackupMode() {
        return s3BackupMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-extendeds3destinationconfiguration.html#cfn-kinesisfirehose-deliverystream-extendeds3destinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public void setS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    public DeliveryStreamExtendedS3DestinationConfiguration withS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketARN", bucketARN).append("bufferingHints", bufferingHints).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("compressionFormat", compressionFormat).append("dataFormatConversionConfiguration", dataFormatConversionConfiguration).append("encryptionConfiguration", encryptionConfiguration).append("errorOutputPrefix", errorOutputPrefix).append("prefix", prefix).append("processingConfiguration", processingConfiguration).append("roleARN", roleARN).append("s3BackupConfiguration", s3BackupConfiguration).append("s3BackupMode", s3BackupMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(processingConfiguration).append(prefix).append(s3BackupConfiguration).append(compressionFormat).append(errorOutputPrefix).append(dataFormatConversionConfiguration).append(bucketARN).append(roleARN).append(encryptionConfiguration).append(s3BackupMode).append(bufferingHints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamExtendedS3DestinationConfiguration) == false) {
            return false;
        }
        DeliveryStreamExtendedS3DestinationConfiguration rhs = ((DeliveryStreamExtendedS3DestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(processingConfiguration, rhs.processingConfiguration).append(prefix, rhs.prefix).append(s3BackupConfiguration, rhs.s3BackupConfiguration).append(compressionFormat, rhs.compressionFormat).append(errorOutputPrefix, rhs.errorOutputPrefix).append(dataFormatConversionConfiguration, rhs.dataFormatConversionConfiguration).append(bucketARN, rhs.bucketARN).append(roleARN, rhs.roleARN).append(encryptionConfiguration, rhs.encryptionConfiguration).append(s3BackupMode, rhs.s3BackupMode).append(bufferingHints, rhs.bufferingHints).isEquals();
    }

}
