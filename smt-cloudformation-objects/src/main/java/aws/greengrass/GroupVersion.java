
package aws.greengrass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GroupVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LoggerDefinitionVersionArn",
    "DeviceDefinitionVersionArn",
    "FunctionDefinitionVersionArn",
    "CoreDefinitionVersionArn",
    "ResourceDefinitionVersionArn",
    "ConnectorDefinitionVersionArn",
    "SubscriptionDefinitionVersionArn"
})
public class GroupVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-loggerdefinitionversionarn
     * 
     */
    @JsonProperty("LoggerDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-loggerdefinitionversionarn")
    private CharSequence loggerDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-devicedefinitionversionarn
     * 
     */
    @JsonProperty("DeviceDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-devicedefinitionversionarn")
    private CharSequence deviceDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-functiondefinitionversionarn
     * 
     */
    @JsonProperty("FunctionDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-functiondefinitionversionarn")
    private CharSequence functionDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-coredefinitionversionarn
     * 
     */
    @JsonProperty("CoreDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-coredefinitionversionarn")
    private CharSequence coreDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-resourcedefinitionversionarn
     * 
     */
    @JsonProperty("ResourceDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-resourcedefinitionversionarn")
    private CharSequence resourceDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-connectordefinitionversionarn
     * 
     */
    @JsonProperty("ConnectorDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-connectordefinitionversionarn")
    private CharSequence connectorDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-subscriptiondefinitionversionarn
     * 
     */
    @JsonProperty("SubscriptionDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-subscriptiondefinitionversionarn")
    private CharSequence subscriptionDefinitionVersionArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-loggerdefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getLoggerDefinitionVersionArn() {
        return loggerDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-loggerdefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setLoggerDefinitionVersionArn(CharSequence loggerDefinitionVersionArn) {
        this.loggerDefinitionVersionArn = loggerDefinitionVersionArn;
    }

    public GroupVersion withLoggerDefinitionVersionArn(CharSequence loggerDefinitionVersionArn) {
        this.loggerDefinitionVersionArn = loggerDefinitionVersionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-devicedefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceDefinitionVersionArn() {
        return deviceDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-devicedefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setDeviceDefinitionVersionArn(CharSequence deviceDefinitionVersionArn) {
        this.deviceDefinitionVersionArn = deviceDefinitionVersionArn;
    }

    public GroupVersion withDeviceDefinitionVersionArn(CharSequence deviceDefinitionVersionArn) {
        this.deviceDefinitionVersionArn = deviceDefinitionVersionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-functiondefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionDefinitionVersionArn() {
        return functionDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-functiondefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setFunctionDefinitionVersionArn(CharSequence functionDefinitionVersionArn) {
        this.functionDefinitionVersionArn = functionDefinitionVersionArn;
    }

    public GroupVersion withFunctionDefinitionVersionArn(CharSequence functionDefinitionVersionArn) {
        this.functionDefinitionVersionArn = functionDefinitionVersionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-coredefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getCoreDefinitionVersionArn() {
        return coreDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-coredefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setCoreDefinitionVersionArn(CharSequence coreDefinitionVersionArn) {
        this.coreDefinitionVersionArn = coreDefinitionVersionArn;
    }

    public GroupVersion withCoreDefinitionVersionArn(CharSequence coreDefinitionVersionArn) {
        this.coreDefinitionVersionArn = coreDefinitionVersionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-resourcedefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getResourceDefinitionVersionArn() {
        return resourceDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-resourcedefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setResourceDefinitionVersionArn(CharSequence resourceDefinitionVersionArn) {
        this.resourceDefinitionVersionArn = resourceDefinitionVersionArn;
    }

    public GroupVersion withResourceDefinitionVersionArn(CharSequence resourceDefinitionVersionArn) {
        this.resourceDefinitionVersionArn = resourceDefinitionVersionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-connectordefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getConnectorDefinitionVersionArn() {
        return connectorDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-connectordefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setConnectorDefinitionVersionArn(CharSequence connectorDefinitionVersionArn) {
        this.connectorDefinitionVersionArn = connectorDefinitionVersionArn;
    }

    public GroupVersion withConnectorDefinitionVersionArn(CharSequence connectorDefinitionVersionArn) {
        this.connectorDefinitionVersionArn = connectorDefinitionVersionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-subscriptiondefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getSubscriptionDefinitionVersionArn() {
        return subscriptionDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-group-groupversion.html#cfn-greengrass-group-groupversion-subscriptiondefinitionversionarn
     * 
     */
    @JsonIgnore
    public void setSubscriptionDefinitionVersionArn(CharSequence subscriptionDefinitionVersionArn) {
        this.subscriptionDefinitionVersionArn = subscriptionDefinitionVersionArn;
    }

    public GroupVersion withSubscriptionDefinitionVersionArn(CharSequence subscriptionDefinitionVersionArn) {
        this.subscriptionDefinitionVersionArn = subscriptionDefinitionVersionArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("loggerDefinitionVersionArn", loggerDefinitionVersionArn).append("deviceDefinitionVersionArn", deviceDefinitionVersionArn).append("functionDefinitionVersionArn", functionDefinitionVersionArn).append("coreDefinitionVersionArn", coreDefinitionVersionArn).append("resourceDefinitionVersionArn", resourceDefinitionVersionArn).append("connectorDefinitionVersionArn", connectorDefinitionVersionArn).append("subscriptionDefinitionVersionArn", subscriptionDefinitionVersionArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subscriptionDefinitionVersionArn).append(coreDefinitionVersionArn).append(functionDefinitionVersionArn).append(resourceDefinitionVersionArn).append(deviceDefinitionVersionArn).append(loggerDefinitionVersionArn).append(connectorDefinitionVersionArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupVersion) == false) {
            return false;
        }
        GroupVersion rhs = ((GroupVersion) other);
        return new EqualsBuilder().append(subscriptionDefinitionVersionArn, rhs.subscriptionDefinitionVersionArn).append(coreDefinitionVersionArn, rhs.coreDefinitionVersionArn).append(functionDefinitionVersionArn, rhs.functionDefinitionVersionArn).append(resourceDefinitionVersionArn, rhs.resourceDefinitionVersionArn).append(deviceDefinitionVersionArn, rhs.deviceDefinitionVersionArn).append(loggerDefinitionVersionArn, rhs.loggerDefinitionVersionArn).append(connectorDefinitionVersionArn, rhs.connectorDefinitionVersionArn).isEquals();
    }

}
