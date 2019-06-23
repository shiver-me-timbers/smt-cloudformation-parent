
package aws.kinesisanalyticsv2;

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
 * ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LogStreamARN"
})
public class ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption implements Property<ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn
     * 
     */
    @JsonProperty("LogStreamARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn")
    private CharSequence logStreamARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn
     * 
     */
    @JsonIgnore
    public CharSequence getLogStreamARN() {
        return logStreamARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption-logstreamarn
     * 
     */
    @JsonIgnore
    public void setLogStreamARN(CharSequence logStreamARN) {
        this.logStreamARN = logStreamARN;
    }

    public ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption withLogStreamARN(CharSequence logStreamARN) {
        this.logStreamARN = logStreamARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logStreamARN", logStreamARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(logStreamARN).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption) == false) {
            return false;
        }
        ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption rhs = ((ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption) other);
        return new EqualsBuilder().append(logStreamARN, rhs.logStreamARN).isEquals();
    }

}
