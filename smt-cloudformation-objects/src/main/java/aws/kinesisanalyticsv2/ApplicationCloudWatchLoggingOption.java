
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
 * ApplicationCloudWatchLoggingOption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApplicationName",
    "CloudWatchLoggingOption"
})
public class ApplicationCloudWatchLoggingOption {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname")
    private CharSequence applicationName;
    /**
     * ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html
     * 
     */
    @JsonProperty("CloudWatchLoggingOption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html")
    private Property<ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption> cloudWatchLoggingOption;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationcloudwatchloggingoption.html#cfn-kinesisanalyticsv2-applicationcloudwatchloggingoption-applicationname
     * 
     */
    @JsonIgnore
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public ApplicationCloudWatchLoggingOption withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption> getCloudWatchLoggingOption() {
        return cloudWatchLoggingOption;
    }

    /**
     * ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationcloudwatchloggingoption-cloudwatchloggingoption.html
     * 
     */
    @JsonIgnore
    public void setCloudWatchLoggingOption(Property<ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption> cloudWatchLoggingOption) {
        this.cloudWatchLoggingOption = cloudWatchLoggingOption;
    }

    public ApplicationCloudWatchLoggingOption withCloudWatchLoggingOption(Property<ApplicationCloudWatchLoggingOptionCloudWatchLoggingOption> cloudWatchLoggingOption) {
        this.cloudWatchLoggingOption = cloudWatchLoggingOption;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("cloudWatchLoggingOption", cloudWatchLoggingOption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudWatchLoggingOption).append(applicationName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationCloudWatchLoggingOption) == false) {
            return false;
        }
        ApplicationCloudWatchLoggingOption rhs = ((ApplicationCloudWatchLoggingOption) other);
        return new EqualsBuilder().append(cloudWatchLoggingOption, rhs.cloudWatchLoggingOption).append(applicationName, rhs.applicationName).isEquals();
    }

}
