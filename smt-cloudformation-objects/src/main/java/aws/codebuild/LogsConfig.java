
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LogsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchLogs",
    "S3Logs"
})
public class LogsConfig {

    /**
     * CloudWatchLogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
     * 
     */
    @JsonProperty("CloudWatchLogs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html")
    private CloudWatchLogsConfig cloudWatchLogs;
    /**
     * S3LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
     * 
     */
    @JsonProperty("S3Logs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html")
    private S3LogsConfig s3Logs;

    /**
     * CloudWatchLogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
     * 
     */
    public CloudWatchLogsConfig getCloudWatchLogs() {
        return cloudWatchLogs;
    }

    /**
     * CloudWatchLogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
     * 
     */
    public void setCloudWatchLogs(CloudWatchLogsConfig cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    public LogsConfig withCloudWatchLogs(CloudWatchLogsConfig cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
        return this;
    }

    /**
     * S3LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
     * 
     */
    public S3LogsConfig getS3Logs() {
        return s3Logs;
    }

    /**
     * S3LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
     * 
     */
    public void setS3Logs(S3LogsConfig s3Logs) {
        this.s3Logs = s3Logs;
    }

    public LogsConfig withS3Logs(S3LogsConfig s3Logs) {
        this.s3Logs = s3Logs;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLogs", cloudWatchLogs).append("s3Logs", s3Logs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLogs).append(s3Logs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogsConfig) == false) {
            return false;
        }
        LogsConfig rhs = ((LogsConfig) other);
        return new EqualsBuilder().append(cloudWatchLogs, rhs.cloudWatchLogs).append(s3Logs, rhs.s3Logs).isEquals();
    }

}
