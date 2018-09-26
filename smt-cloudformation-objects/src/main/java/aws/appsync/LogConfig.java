
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LogConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudWatchLogsRoleArn",
    "FieldLogLevel"
})
public class LogConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn
     * 
     */
    @JsonProperty("CloudWatchLogsRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn")
    private CharSequence cloudWatchLogsRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel
     * 
     */
    @JsonProperty("FieldLogLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel")
    private CharSequence fieldLogLevel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn
     * 
     */
    public CharSequence getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn
     * 
     */
    public void setCloudWatchLogsRoleArn(CharSequence cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    public LogConfig withCloudWatchLogsRoleArn(CharSequence cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel
     * 
     */
    public CharSequence getFieldLogLevel() {
        return fieldLogLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel
     * 
     */
    public void setFieldLogLevel(CharSequence fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel;
    }

    public LogConfig withFieldLogLevel(CharSequence fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLogsRoleArn", cloudWatchLogsRoleArn).append("fieldLogLevel", fieldLogLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLogsRoleArn).append(fieldLogLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LogConfig) == false) {
            return false;
        }
        LogConfig rhs = ((LogConfig) other);
        return new EqualsBuilder().append(cloudWatchLogsRoleArn, rhs.cloudWatchLogsRoleArn).append(fieldLogLevel, rhs.fieldLogLevel).isEquals();
    }

}
