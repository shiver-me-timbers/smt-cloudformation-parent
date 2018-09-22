
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RedshiftDestinationConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchLoggingOptions",
    "ClusterJDBCURL",
    "CopyCommand",
    "Password",
    "ProcessingConfiguration",
    "RoleARN",
    "S3Configuration",
    "Username"
})
public class RedshiftDestinationConfiguration {

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl
     * 
     */
    @JsonProperty("ClusterJDBCURL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl")
    private String clusterJDBCURL;
    /**
     * CopyCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
     * 
     */
    @JsonProperty("CopyCommand")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html")
    private CopyCommand copyCommand;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password")
    private String password;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn")
    private String roleARN;
    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3Configuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html")
    private S3DestinationConfiguration s3Configuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username")
    private String username;

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

    public RedshiftDestinationConfiguration withCloudWatchLoggingOptions(CloudWatchLoggingOptions cloudWatchLoggingOptions) {
        this.cloudWatchLoggingOptions = cloudWatchLoggingOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl
     * 
     */
    @JsonProperty("ClusterJDBCURL")
    public String getClusterJDBCURL() {
        return clusterJDBCURL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-clusterjdbcurl
     * 
     */
    @JsonProperty("ClusterJDBCURL")
    public void setClusterJDBCURL(String clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
    }

    public RedshiftDestinationConfiguration withClusterJDBCURL(String clusterJDBCURL) {
        this.clusterJDBCURL = clusterJDBCURL;
        return this;
    }

    /**
     * CopyCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
     * 
     */
    @JsonProperty("CopyCommand")
    public CopyCommand getCopyCommand() {
        return copyCommand;
    }

    /**
     * CopyCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
     * 
     */
    @JsonProperty("CopyCommand")
    public void setCopyCommand(CopyCommand copyCommand) {
        this.copyCommand = copyCommand;
    }

    public RedshiftDestinationConfiguration withCopyCommand(CopyCommand copyCommand) {
        this.copyCommand = copyCommand;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password
     * 
     */
    @JsonProperty("Password")
    public String getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-password
     * 
     */
    @JsonProperty("Password")
    public void setPassword(String password) {
        this.password = password;
    }

    public RedshiftDestinationConfiguration withPassword(String password) {
        this.password = password;
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

    public RedshiftDestinationConfiguration withProcessingConfiguration(ProcessingConfiguration processingConfiguration) {
        this.processingConfiguration = processingConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    public String getRoleARN() {
        return roleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-rolearn
     * 
     */
    @JsonProperty("RoleARN")
    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    public RedshiftDestinationConfiguration withRoleARN(String roleARN) {
        this.roleARN = roleARN;
        return this;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3Configuration")
    public S3DestinationConfiguration getS3Configuration() {
        return s3Configuration;
    }

    /**
     * S3DestinationConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-s3destinationconfiguration.html
     * 
     */
    @JsonProperty("S3Configuration")
    public void setS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
    }

    public RedshiftDestinationConfiguration withS3Configuration(S3DestinationConfiguration s3Configuration) {
        this.s3Configuration = s3Configuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username
     * 
     */
    @JsonProperty("Username")
    public String getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-redshiftdestinationconfiguration.html#cfn-kinesisfirehose-deliverystream-redshiftdestinationconfiguration-username
     * 
     */
    @JsonProperty("Username")
    public void setUsername(String username) {
        this.username = username;
    }

    public RedshiftDestinationConfiguration withUsername(String username) {
        this.username = username;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLoggingOptions", cloudWatchLoggingOptions).append("clusterJDBCURL", clusterJDBCURL).append("copyCommand", copyCommand).append("password", password).append("processingConfiguration", processingConfiguration).append("roleARN", roleARN).append("s3Configuration", s3Configuration).append("username", username).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOptions).append(copyCommand).append(processingConfiguration).append(password).append(clusterJDBCURL).append(s3Configuration).append(roleARN).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RedshiftDestinationConfiguration) == false) {
            return false;
        }
        RedshiftDestinationConfiguration rhs = ((RedshiftDestinationConfiguration) other);
        return new EqualsBuilder().append(cloudWatchLoggingOptions, rhs.cloudWatchLoggingOptions).append(copyCommand, rhs.copyCommand).append(processingConfiguration, rhs.processingConfiguration).append(password, rhs.password).append(clusterJDBCURL, rhs.clusterJDBCURL).append(s3Configuration, rhs.s3Configuration).append(roleARN, rhs.roleARN).append(username, rhs.username).isEquals();
    }

}
