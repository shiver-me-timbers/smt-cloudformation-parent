
package aws.logs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LogStream
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LogGroupName",
    "LogStreamName"
})
public class LogStream {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname")
    private String logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname
     * 
     */
    @JsonProperty("LogStreamName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname")
    private String logStreamName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    public String getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }

    public LogStream withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname
     * 
     */
    @JsonProperty("LogStreamName")
    public String getLogStreamName() {
        return logStreamName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-logstream.html#cfn-logs-logstream-logstreamname
     * 
     */
    @JsonProperty("LogStreamName")
    public void setLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
    }

    public LogStream withLogStreamName(String logStreamName) {
        this.logStreamName = logStreamName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logGroupName", logGroupName).append("logStreamName", logStreamName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logGroupName).append(logStreamName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogStream) == false) {
            return false;
        }
        LogStream rhs = ((LogStream) other);
        return new EqualsBuilder().append(logGroupName, rhs.logGroupName).append(logStreamName, rhs.logStreamName).isEquals();
    }

}