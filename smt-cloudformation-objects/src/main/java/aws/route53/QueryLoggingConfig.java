
package aws.route53;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * QueryLoggingConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchLogsLogGroupArn"
})
public class QueryLoggingConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn
     * 
     */
    @JsonProperty("CloudWatchLogsLogGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn")
    private CharSequence cloudWatchLogsLogGroupArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn
     * 
     */
    public CharSequence getCloudWatchLogsLogGroupArn() {
        return cloudWatchLogsLogGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-route53-hostedzone-queryloggingconfig.html#cfn-route53-hostedzone-queryloggingconfig-cloudwatchlogsloggrouparn
     * 
     */
    public void setCloudWatchLogsLogGroupArn(CharSequence cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
    }

    public QueryLoggingConfig withCloudWatchLogsLogGroupArn(CharSequence cloudWatchLogsLogGroupArn) {
        this.cloudWatchLogsLogGroupArn = cloudWatchLogsLogGroupArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLogsLogGroupArn", cloudWatchLogsLogGroupArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLogsLogGroupArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QueryLoggingConfig) == false) {
            return false;
        }
        QueryLoggingConfig rhs = ((QueryLoggingConfig) other);
        return new EqualsBuilder().append(cloudWatchLogsLogGroupArn, rhs.cloudWatchLogsLogGroupArn).isEquals();
    }

}
