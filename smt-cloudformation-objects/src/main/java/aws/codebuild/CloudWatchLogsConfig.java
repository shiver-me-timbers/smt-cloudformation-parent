
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudWatchLogsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Status",
    "GroupName",
    "StreamName"
})
public class CloudWatchLogsConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status
     * 
     */
    @JsonProperty("Status")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status")
    private CharSequence status;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname
     * 
     */
    @JsonProperty("GroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname")
    private CharSequence groupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname
     * 
     */
    @JsonProperty("StreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname")
    private CharSequence streamName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status
     * 
     */
    public CharSequence getStatus() {
        return status;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-status
     * 
     */
    public void setStatus(CharSequence status) {
        this.status = status;
    }

    public CloudWatchLogsConfig withStatus(CharSequence status) {
        this.status = status;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname
     * 
     */
    public CharSequence getGroupName() {
        return groupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-groupname
     * 
     */
    public void setGroupName(CharSequence groupName) {
        this.groupName = groupName;
    }

    public CloudWatchLogsConfig withGroupName(CharSequence groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname
     * 
     */
    public CharSequence getStreamName() {
        return streamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-cloudwatchlogsconfig.html#cfn-codebuild-project-cloudwatchlogsconfig-streamname
     * 
     */
    public void setStreamName(CharSequence streamName) {
        this.streamName = streamName;
    }

    public CloudWatchLogsConfig withStreamName(CharSequence streamName) {
        this.streamName = streamName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("groupName", groupName).append("streamName", streamName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupName).append(streamName).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudWatchLogsConfig) == false) {
            return false;
        }
        CloudWatchLogsConfig rhs = ((CloudWatchLogsConfig) other);
        return new EqualsBuilder().append(groupName, rhs.groupName).append(streamName, rhs.streamName).append(status, rhs.status).isEquals();
    }

}
