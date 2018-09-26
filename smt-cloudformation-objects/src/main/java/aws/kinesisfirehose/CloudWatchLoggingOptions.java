
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CloudWatchLoggingOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Enabled",
    "LogGroupName",
    "LogStreamName"
})
public class CloudWatchLoggingOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled")
    private Boolean enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname")
    private CharSequence logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname
     * 
     */
    @JsonProperty("LogStreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname")
    private CharSequence logStreamName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public CloudWatchLoggingOptions withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname
     * 
     */
    public CharSequence getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-loggroupname
     * 
     */
    public void setLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
    }

    public CloudWatchLoggingOptions withLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname
     * 
     */
    public CharSequence getLogStreamName() {
        return logStreamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-cloudwatchloggingoptions.html#cfn-kinesisfirehose-deliverystream-cloudwatchloggingoptions-logstreamname
     * 
     */
    public void setLogStreamName(CharSequence logStreamName) {
        this.logStreamName = logStreamName;
    }

    public CloudWatchLoggingOptions withLogStreamName(CharSequence logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enabled", enabled).append("logGroupName", logGroupName).append("logStreamName", logStreamName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logGroupName).append(enabled).append(logStreamName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CloudWatchLoggingOptions) == false) {
            return false;
        }
        CloudWatchLoggingOptions rhs = ((CloudWatchLoggingOptions) other);
        return new EqualsBuilder().append(logGroupName, rhs.logGroupName).append(enabled, rhs.enabled).append(logStreamName, rhs.logStreamName).isEquals();
    }

}
