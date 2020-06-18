
package shiver.me.timbers.aws.lambda;

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
 * EventInvokeConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FunctionName",
    "MaximumRetryAttempts",
    "DestinationConfig",
    "Qualifier",
    "MaximumEventAgeInSeconds"
})
public class EventInvokeConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname")
    private CharSequence functionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts
     * 
     */
    @JsonProperty("MaximumRetryAttempts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts")
    private Number maximumRetryAttempts;
    /**
     * EventInvokeConfigDestinationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html
     * 
     */
    @JsonProperty("DestinationConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html")
    private Property<EventInvokeConfigDestinationConfig> destinationConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier
     * 
     */
    @JsonProperty("Qualifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier")
    private CharSequence qualifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds
     * 
     */
    @JsonProperty("MaximumEventAgeInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds")
    private Number maximumEventAgeInSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-functionname
     * 
     */
    @JsonIgnore
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public EventInvokeConfig withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts
     * 
     */
    @JsonIgnore
    public Number getMaximumRetryAttempts() {
        return maximumRetryAttempts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumretryattempts
     * 
     */
    @JsonIgnore
    public void setMaximumRetryAttempts(Number maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
    }

    public EventInvokeConfig withMaximumRetryAttempts(Number maximumRetryAttempts) {
        this.maximumRetryAttempts = maximumRetryAttempts;
        return this;
    }

    /**
     * EventInvokeConfigDestinationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html
     * 
     */
    @JsonIgnore
    public Property<EventInvokeConfigDestinationConfig> getDestinationConfig() {
        return destinationConfig;
    }

    /**
     * EventInvokeConfigDestinationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html
     * 
     */
    @JsonIgnore
    public void setDestinationConfig(Property<EventInvokeConfigDestinationConfig> destinationConfig) {
        this.destinationConfig = destinationConfig;
    }

    public EventInvokeConfig withDestinationConfig(Property<EventInvokeConfigDestinationConfig> destinationConfig) {
        this.destinationConfig = destinationConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier
     * 
     */
    @JsonIgnore
    public CharSequence getQualifier() {
        return qualifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-qualifier
     * 
     */
    @JsonIgnore
    public void setQualifier(CharSequence qualifier) {
        this.qualifier = qualifier;
    }

    public EventInvokeConfig withQualifier(CharSequence qualifier) {
        this.qualifier = qualifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds
     * 
     */
    @JsonIgnore
    public Number getMaximumEventAgeInSeconds() {
        return maximumEventAgeInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventinvokeconfig.html#cfn-lambda-eventinvokeconfig-maximumeventageinseconds
     * 
     */
    @JsonIgnore
    public void setMaximumEventAgeInSeconds(Number maximumEventAgeInSeconds) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
    }

    public EventInvokeConfig withMaximumEventAgeInSeconds(Number maximumEventAgeInSeconds) {
        this.maximumEventAgeInSeconds = maximumEventAgeInSeconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("functionName", functionName).append("maximumRetryAttempts", maximumRetryAttempts).append("destinationConfig", destinationConfig).append("qualifier", qualifier).append("maximumEventAgeInSeconds", maximumEventAgeInSeconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximumRetryAttempts).append(functionName).append(destinationConfig).append(qualifier).append(maximumEventAgeInSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventInvokeConfig) == false) {
            return false;
        }
        EventInvokeConfig rhs = ((EventInvokeConfig) other);
        return new EqualsBuilder().append(maximumRetryAttempts, rhs.maximumRetryAttempts).append(functionName, rhs.functionName).append(destinationConfig, rhs.destinationConfig).append(qualifier, rhs.qualifier).append(maximumEventAgeInSeconds, rhs.maximumEventAgeInSeconds).isEquals();
    }

}
