
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
 * DeliveryStreamRedshiftDestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchLoggingOptions",
    "ClusterJDBCURL",
    "CopyCommand",
    "Password",
    "ProcessingConfiguration",
    "RetryOptions",
    "RoleARN",
    "S3BackupConfiguration",
    "S3BackupMode",
    "S3Configuration",
    "Username"
})
public class DeliveryStreamRedshiftDestinationConfiguration implements Property<DeliveryStreamRedshiftDestinationConfiguration>
{

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl
     * 
     */
    @JsonProperty("ClusterJDBCURL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl")
    private CharSequence clusterJDBCURL;
    /**
     * DeliveryStreamCopyCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
     * 
     */
    @JsonProperty("CopyCommand")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html")
    private Property<DeliveryStreamCopyCommand> copyCommand;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password")
    private CharSequence password;
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
     * DeliveryStreamRedshiftRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html
     * 
     */
    @JsonProperty("RetryOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html")
    private Property<DeliveryStreamRedshiftRetryOptions> retryOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn")
    private CharSequence roleARN;
    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3BackupConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupmode
     * 
     */
    @JsonProperty("S3BackupMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupmode")
    private CharSequence s3BackupMode;
    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> s3Configuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username")
    private CharSequence username;

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

    public DeliveryStreamRedshiftDestinationConfiguration withCloudWatchLoggingOptions(Property<DeliveryStreamCloudWatchLoggingOptions> cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl
     * 
     */
    @JsonIgnore
    public CharSequence getClusterJDBCURL() {
        return clusterJDBCURL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl
     * 
     */
    @JsonIgnore
    public void setClusterJDBCURL(CharSequence clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withClusterJDBCURL(CharSequence clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
        return this;
    }

    /**
     * DeliveryStreamCopyCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamCopyCommand> getCopyCommand() {
        return copyCommand;
    }

    /**
     * DeliveryStreamCopyCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
     * 
     */
    @JsonIgnore
    public void setCopyCommand(Property<DeliveryStreamCopyCommand> copyCommand) {
        this.copyCommand = copyCommand;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withCopyCommand(Property<DeliveryStreamCopyCommand> copyCommand) {
        this.copyCommand = copyCommand;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password
     * 
     */
    @JsonIgnore
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password
     * 
     */
    @JsonIgnore
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withPassword(CharSequence password) {
        this.password = password;
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

    public DeliveryStreamRedshiftDestinationConfiguration withProcessingConfiguration(Property<DeliveryStreamProcessingConfiguration> processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
        return this;
    }

    /**
     * DeliveryStreamRedshiftRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html
     * 
     */
    @JsonIgnore
    public Property<DeliveryStreamRedshiftRetryOptions> getRetryOptions() {
        return retryOptions;
    }

    /**
     * DeliveryStreamRedshiftRetryOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftretryoptions.html
     * 
     */
    @JsonIgnore
    public void setRetryOptions(Property<DeliveryStreamRedshiftRetryOptions> retryOptions) {
        this.retryOptions = retryOptions;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withRetryOptions(Property<DeliveryStreamRedshiftRetryOptions> retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleARN(CharSequence roleARN) {
        this.roleARN = roleARN;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withRoleARN(CharSequence roleARN) {
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
    public Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> getS3BackupConfiguration() {
        return s3BackupConfiguration;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3BackupConfiguration(Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration) {
        this.s3BackupConfiguration = s3BackupConfiguration;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withS3BackupConfiguration(Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> s3BackupConfiguration) {
        this.s3BackupConfiguration = s3BackupConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public CharSequence getS3BackupMode() {
        return s3BackupMode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-s3backupmode
     * 
     */
    @JsonIgnore
    public void setS3BackupMode(CharSequence s3BackupMode) {
        this.s3BackupMode = s3BackupMode;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withS3BackupMode(CharSequence s3BackupMode) {
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
    public Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> getS3Configuration() {
        return s3Configuration;
    }

    /**
     * DeliveryStreamS3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonIgnore
    public void setS3Configuration(Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withS3Configuration(Property<shiver.me.timbers.aws.kinesisfirehose.DeliveryStreamS3DestinationConfiguration> s3Configuration) {
        this.s3Configuration = s3Configuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username
     * 
     */
    @JsonIgnore
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username
     * 
     */
    @JsonIgnore
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public DeliveryStreamRedshiftDestinationConfiguration withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("clusterJDBCURL", clusterJDBCURL).append("copyCommand", copyCommand).append("password", password).append("processingConfiguration", processingConfiguration).append("retryOptions", retryOptions).append("roleARN", roleARN).append("s3BackupConfiguration", s3BackupConfiguration).append("s3BackupMode", s3BackupMode).append("s3Configuration", s3Configuration).append("username", username).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(copyCommand).append(processingConfiguration).append(password).append(retryOptions).append(clusterJDBCURL).append(s3Configuration).append(roleARN).append(s3BackupConfiguration).append(s3BackupMode).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamRedshiftDestinationConfiguration) == false) {
            return false;
        }
        DeliveryStreamRedshiftDestinationConfiguration rhs = ((DeliveryStreamRedshiftDestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(copyCommand, rhs.copyCommand).append(processingConfiguration, rhs.processingConfiguration).append(password, rhs.password).append(retryOptions, rhs.retryOptions).append(clusterJDBCURL, rhs.clusterJDBCURL).append(s3Configuration, rhs.s3Configuration).append(roleARN, rhs.roleARN).append(s3BackupConfiguration, rhs.s3BackupConfiguration).append(s3BackupMode, rhs.s3BackupMode).append(username, rhs.username).isEquals();
    }

}
