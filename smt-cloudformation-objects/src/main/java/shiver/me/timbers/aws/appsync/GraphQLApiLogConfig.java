
package shiver.me.timbers.aws.appsync;

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
 * GraphQLApiLogConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudWatchLogsRoleArn",
    "ExcludeVerboseContent",
    "FieldLogLevel"
})
public class GraphQLApiLogConfig implements Property<GraphQLApiLogConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn
     * 
     */
    @JsonProperty("CloudWatchLogsRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn")
    private CharSequence cloudWatchLogsRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-excludeverbosecontent
     * 
     */
    @JsonProperty("ExcludeVerboseContent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-excludeverbosecontent")
    private CharSequence excludeVerboseContent;
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
    @JsonIgnore
    public CharSequence getCloudWatchLogsRoleArn() {
        return cloudWatchLogsRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-cloudwatchlogsrolearn
     * 
     */
    @JsonIgnore
    public void setCloudWatchLogsRoleArn(CharSequence cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
    }

    public GraphQLApiLogConfig withCloudWatchLogsRoleArn(CharSequence cloudWatchLogsRoleArn) {
        this.cloudWatchLogsRoleArn = cloudWatchLogsRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-excludeverbosecontent
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeVerboseContent() {
        return excludeVerboseContent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-excludeverbosecontent
     * 
     */
    @JsonIgnore
    public void setExcludeVerboseContent(CharSequence excludeVerboseContent) {
        this.excludeVerboseContent = excludeVerboseContent;
    }

    public GraphQLApiLogConfig withExcludeVerboseContent(CharSequence excludeVerboseContent) {
        this.excludeVerboseContent = excludeVerboseContent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel
     * 
     */
    @JsonIgnore
    public CharSequence getFieldLogLevel() {
        return fieldLogLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html#cfn-appsync-graphqlapi-logconfig-fieldloglevel
     * 
     */
    @JsonIgnore
    public void setFieldLogLevel(CharSequence fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel;
    }

    public GraphQLApiLogConfig withFieldLogLevel(CharSequence fieldLogLevel) {
        this.fieldLogLevel = fieldLogLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudWatchLogsRoleArn", cloudWatchLogsRoleArn).append("excludeVerboseContent", excludeVerboseContent).append("fieldLogLevel", fieldLogLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLogsRoleArn).append(excludeVerboseContent).append(fieldLogLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphQLApiLogConfig) == false) {
            return false;
        }
        GraphQLApiLogConfig rhs = ((GraphQLApiLogConfig) other);
        return new EqualsBuilder().append(cloudWatchLogsRoleArn, rhs.cloudWatchLogsRoleArn).append(excludeVerboseContent, rhs.excludeVerboseContent).append(fieldLogLevel, rhs.fieldLogLevel).isEquals();
    }

}
