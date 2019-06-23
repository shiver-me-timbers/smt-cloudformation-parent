
package aws.codebuild;

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
 * ProjectLogsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-logsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchLogs",
    "S3Logs"
})
public class ProjectLogsConfig implements Property<ProjectLogsConfig>
{

    /**
     * ProjectCloudWatchLogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
     * 
     */
    @JsonProperty("CloudWatchLogs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html")
    private Property<ProjectCloudWatchLogsConfig> cloudWatchLogs;
    /**
     * ProjectS3LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
     * 
     */
    @JsonProperty("S3Logs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html")
    private Property<ProjectS3LogsConfig> s3Logs;

    /**
     * ProjectCloudWatchLogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
     * 
     */
    @JsonIgnore
    public Property<ProjectCloudWatchLogsConfig> getCloudWatchLogs() {
        return cloudWatchLogs;
    }

    /**
     * ProjectCloudWatchLogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchLogs(Property<ProjectCloudWatchLogsConfig> cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
    }

    public ProjectLogsConfig withCloudWatchLogs(Property<ProjectCloudWatchLogsConfig> cloudWatchLogs) {
        this.cloudWatchLogs = cloudWatchLogs;
        return this;
    }

    /**
     * ProjectS3LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
     * 
     */
    @JsonIgnore
    public Property<ProjectS3LogsConfig> getS3Logs() {
        return s3Logs;
    }

    /**
     * ProjectS3LogsConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-s3logsconfig.html
     * 
     */
    @JsonIgnore
    public void setS3Logs(Property<ProjectS3LogsConfig> s3Logs) {
        this.s3Logs = s3Logs;
    }

    public ProjectLogsConfig withS3Logs(Property<ProjectS3LogsConfig> s3Logs) {
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
        if ((other instanceof ProjectLogsConfig) == false) {
            return false;
        }
        ProjectLogsConfig rhs = ((ProjectLogsConfig) other);
        return new EqualsBuilder().append(cloudWatchLogs, rhs.cloudWatchLogs).append(s3Logs, rhs.s3Logs).isEquals();
    }

}
