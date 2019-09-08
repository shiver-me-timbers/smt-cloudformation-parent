
package shiver.me.timbers.aws.kinesisfirehose;

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
 * DeliveryStreamElasticsearchDestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BufferingHints",
    "CloudWatchLoggingOptions",
    "DomainARN",
    "IndexName",
    "IndexRotationPeriod",
    "ProcessingConfiguration",
    "RetryOptions",
    "RoleARN",
    "S3BackupMode",
    "S3Configuration",
    "TypeName"
})
public class DeliveryStreamElasticsearchDestinationConfiguration implements Property<DeliveryStreamElasticsearchDestinationConfiguration>
{

    /**
     * DeliveryStreamElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonProperty("BufferingHints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html")
    private Property<DeliveryStreamElasticsearchBufferingHints> bufferingHints;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn
     * 
     */
    @JsonProperty("DomainARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn")
    private CharSequence domainARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname
     * 
     */
    @JsonProperty("IndexName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname")
    private CharSequence indexName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod
     * 
     */
    @JsonProperty("IndexRotationPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod")
    private CharSequence indexRotationPeriod;
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
     * DeliveryStreamElasticsearchRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html
     * 
     */
    @JsonProperty("RetryOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html")
    private Property<DeliveryStreamElasticsearchRetryOptions> retryOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn")
    private CharSequence roleARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode")
    private CharSequence s3BackupMode;
    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private Property<DeliveryStreamS3DestinationConfiguration> s3Configuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename
     * 
     */
    @JsonProperty("TypeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename")
    private CharSequence typeName;

    /**
     * DeliveryStreamElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamElasticsearchBufferingHints> getBufferingHints() {
        return bufferingHints;
    }

    /**
     * DeliveryStreamElasticsearchBufferingHints
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchbufferinghints.html
     * 
     */
    @JsonIgnore
    public void setBufferingHints(Property<DeliveryStreamElasticsearchBufferingHints> bufferingHints) {
        this.bufferingHints = bufferingHints;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withBufferingHints(Property<DeliveryStreamElasticsearchBufferingHints> bufferingHints) {
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

    public DeliveryStreamElasticsearchDestinationConfiguration withCloudWatchLoggingOptions(Property<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn
     * 
     */
    @JsonIgnore
    public CharSequence getDomainARN() {
        return domainARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-domainarn
     * 
     */
    @JsonIgnore
    public void setDomainARN(CharSequence domainARN) {
        this.domainARN = domainARN;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withDomainARN(CharSequence domainARN) {
        this.domainARN = domainARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname
     * 
     */
    @JsonIgnore
    public CharSequence getIndexName() {
        return indexName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexname
     * 
     */
    @JsonIgnore
    public void setIndexName(CharSequence indexName) {
        this.indexName = indexName;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withIndexName(CharSequence indexName) {
        this.indexName = indexName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod
     * 
     */
    @JsonIgnore
    public CharSequence getIndexRotationPeriod() {
        return indexRotationPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-indexrotationperiod
     * 
     */
    @JsonIgnore
    public void setIndexRotationPeriod(CharSequence indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withIndexRotationPeriod(CharSequence indexRotationPeriod) {
        this.indexRotationPeriod = indexRotationPeriod;
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

    public DeliveryStreamElasticsearchDestinationConfiguration withProcessingConfiguration(Property<DeliveryStreamProcessingConfiguration> processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
        return this;
    }

    /**
     * DeliveryStreamElasticsearchRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamElasticsearchRetryOptions> getRetryOptions() {
        return retryOptions;
    }

    /**
     * DeliveryStreamElasticsearchRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchretryoptions.html
     * 
     */
    @JsonIgnore
    public void setRetryOptions(Property<DeliveryStreamElasticsearchRetryOptions> retryOptions) {
        this.retryOptions = retryOptions;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withRetryOptions(Property<DeliveryStreamElasticsearchRetryOptions> retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public CharSequence getS3BackupMode() {
        return s3BackupMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public void setS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
        return this;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamS3DestinationConfiguration> getS3Configuration() {
        return s3Configuration;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3Configuration(Property<DeliveryStreamS3DestinationConfiguration> s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withS3Configuration(Property<DeliveryStreamS3DestinationConfiguration> s3Configuration) {
        this.s3Configuration = s3Configuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename
     * 
     */
    @JsonIgnore
    public CharSequence getTypeName() {
        return typeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-elasticsearchdestinationconfiguration-typename
     * 
     */
    @JsonIgnore
    public void setTypeName(CharSequence typeName) {
        this.typeName = typeName;
    }

    public DeliveryStreamElasticsearchDestinationConfiguration withTypeName(CharSequence typeName) {
        this.typeName = typeName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bufferingHints", bufferingHints).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("domainARN", domainARN).append("indexName", indexName).append("indexRotationPeriod", indexRotationPeriod).append("processingConfiguration", processingConfiguration).append("retryOptions", retryOptions).append("roleARN", roleARN).append("s3BackupMode", s3BackupMode).append("s3Configuration", s3Configuration).append("typeName", typeName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(processingConfiguration).append(retryOptions).append(s3Configuration).append(indexRotationPeriod).append(indexName).append(roleARN).append(typeName).append(s3BackupMode).append(domainARN).append(bufferingHints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamElasticsearchDestinationConfiguration) == false) {
            return false;
        }
        DeliveryStreamElasticsearchDestinationConfiguration rhs = ((DeliveryStreamElasticsearchDestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(processingConfiguration, rhs.processingConfiguration).append(retryOptions, rhs.retryOptions).append(s3Configuration, rhs.s3Configuration).append(indexRotationPeriod, rhs.indexRotationPeriod).append(indexName, rhs.indexName).append(roleARN, rhs.roleARN).append(typeName, rhs.typeName).append(s3BackupMode, rhs.s3BackupMode).append(domainARN, rhs.domainARN).append(bufferingHints, rhs.bufferingHints).isEquals();
    }

}
