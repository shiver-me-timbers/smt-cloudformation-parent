
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
 * SplunkDestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchLoggingOptions",
    "HECAcknowledgmentTimeoutInSeconds",
    "HECEndpoint",
    "HECEndpointType",
    "HECToken",
    "ProcessingConfiguration",
    "RetryOptions",
    "S3BackupMode",
    "S3Configuration"
})
public class SplunkDestinationConfiguration implements Property<SplunkDestinationConfiguration>
{

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonProperty("CloudWatchLoggingOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html")
    private Property<CloudWatchLoggingOptions> cloudWatchLoggingOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds
     * 
     */
    @JsonProperty("HECAcknowledgmentTimeoutInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds")
    private Integer hECAcknowledgmentTimeoutInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint
     * 
     */
    @JsonProperty("HECEndpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint")
    private CharSequence hECEndpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype
     * 
     */
    @JsonProperty("HECEndpointType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype")
    private CharSequence hECEndpointType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken
     * 
     */
    @JsonProperty("HECToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken")
    private CharSequence hECToken;
    /**
     * ProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonProperty("ProcessingConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html")
    private Property<ProcessingConfiguration> processingConfiguration;
    /**
     * SplunkRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html
     * 
     */
    @JsonProperty("RetryOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html")
    private Property<SplunkRetryOptions> retryOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode")
    private CharSequence s3BackupMode;
    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private Property<S3DestinationConfiguration> s3Configuration;

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonIgnore
    public Property<CloudWatchLoggingOptions> getCloudWatchLoggingOptions() {
        return cloudWatchLoggingOptions;
    }

    /**
     * CloudWatchLoggingOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchLoggingOptions(Property<CloudWatchLoggingOptions> cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
    }

    public SplunkDestinationConfiguration withCloudWatchLoggingOptions(Property<CloudWatchLoggingOptions> cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds
     * 
     */
    @JsonIgnore
    public Integer getHECAcknowledgmentTimeoutInSeconds() {
        return hECAcknowledgmentTimeoutInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecacknowledgmenttimeoutinseconds
     * 
     */
    @JsonIgnore
    public void setHECAcknowledgmentTimeoutInSeconds(Integer hECAcknowledgmentTimeoutInSeconds) {
        this.hECAcknowledgmentTimeoutInSeconds = hECAcknowledgmentTimeoutInSeconds;
    }

    public SplunkDestinationConfiguration withHECAcknowledgmentTimeoutInSeconds(Integer hECAcknowledgmentTimeoutInSeconds) {
        this.hECAcknowledgmentTimeoutInSeconds = hECAcknowledgmentTimeoutInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint
     * 
     */
    @JsonIgnore
    public CharSequence getHECEndpoint() {
        return hECEndpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpoint
     * 
     */
    @JsonIgnore
    public void setHECEndpoint(CharSequence hECEndpoint) {
        this.hECEndpoint = hECEndpoint;
    }

    public SplunkDestinationConfiguration withHECEndpoint(CharSequence hECEndpoint) {
        this.hECEndpoint = hECEndpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype
     * 
     */
    @JsonIgnore
    public CharSequence getHECEndpointType() {
        return hECEndpointType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hecendpointtype
     * 
     */
    @JsonIgnore
    public void setHECEndpointType(CharSequence hECEndpointType) {
        this.hECEndpointType = hECEndpointType;
    }

    public SplunkDestinationConfiguration withHECEndpointType(CharSequence hECEndpointType) {
        this.hECEndpointType = hECEndpointType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken
     * 
     */
    @JsonIgnore
    public CharSequence getHECToken() {
        return hECToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-hectoken
     * 
     */
    @JsonIgnore
    public void setHECToken(CharSequence hECToken) {
        this.hECToken = hECToken;
    }

    public SplunkDestinationConfiguration withHECToken(CharSequence hECToken) {
        this.hECToken = hECToken;
        return this;
    }

    /**
     * ProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ProcessingConfiguration> getProcessingConfiguration() {
        return processingConfiguration;
    }

    /**
     * ProcessingConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-processingconfiguration.html
     * 
     */
    @JsonIgnore
    public void setProcessingConfiguration(Property<ProcessingConfiguration> processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
    }

    public SplunkDestinationConfiguration withProcessingConfiguration(Property<ProcessingConfiguration> processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
        return this;
    }

    /**
     * SplunkRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html
     * 
     */
    @JsonIgnore
    public Property<SplunkRetryOptions> getRetryOptions() {
        return retryOptions;
    }

    /**
     * SplunkRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkretryoptions.html
     * 
     */
    @JsonIgnore
    public void setRetryOptions(Property<SplunkRetryOptions> retryOptions) {
        this.retryOptions = retryOptions;
    }

    public SplunkDestinationConfiguration withRetryOptions(Property<SplunkRetryOptions> retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public CharSequence getS3BackupMode() {
        return s3BackupMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-splunkdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-splunkdestinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public void setS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    public SplunkDestinationConfiguration withS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
        return this;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<S3DestinationConfiguration> getS3Configuration() {
        return s3Configuration;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3Configuration(Property<S3DestinationConfiguration> s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    public SplunkDestinationConfiguration withS3Configuration(Property<S3DestinationConfiguration> s3Configuration) {
        this.s3Configuration = s3Configuration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("hECAcknowledgmentTimeoutInSeconds", hECAcknowledgmentTimeoutInSeconds).append("hECEndpoint", hECEndpoint).append("hECEndpointType", hECEndpointType).append("hECToken", hECToken).append("processingConfiguration", processingConfiguration).append("retryOptions", retryOptions).append("s3BackupMode", s3BackupMode).append("s3Configuration", s3Configuration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(processingConfiguration).append(retryOptions).append(hECAcknowledgmentTimeoutInSeconds).append(hECToken).append(s3Configuration).append(hECEndpoint).append(hECEndpointType).append(s3BackupMode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SplunkDestinationConfiguration) == false) {
            return false;
        }
        SplunkDestinationConfiguration rhs = ((SplunkDestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(processingConfiguration, rhs.processingConfiguration).append(retryOptions, rhs.retryOptions).append(hECAcknowledgmentTimeoutInSeconds, rhs.hECAcknowledgmentTimeoutInSeconds).append(hECToken, rhs.hECToken).append(s3Configuration, rhs.s3Configuration).append(hECEndpoint, rhs.hECEndpoint).append(hECEndpointType, rhs.hECEndpointType).append(s3BackupMode, rhs.s3BackupMode).isEquals();
    }

}
