
package shiver.me.timbers.aws.greengrass;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html
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
    "SubscriptionDefinitionVersionArn",
    "GroupId"
})
public class GroupVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn
     * 
     */
    @JsonProperty("LoggerDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn")
    private CharSequence loggerDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn
     * 
     */
    @JsonProperty("DeviceDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn")
    private CharSequence deviceDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn
     * 
     */
    @JsonProperty("FunctionDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn")
    private CharSequence functionDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn
     * 
     */
    @JsonProperty("CoreDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn")
    private CharSequence coreDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn
     * 
     */
    @JsonProperty("ResourceDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn")
    private CharSequence resourceDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn
     * 
     */
    @JsonProperty("ConnectorDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn")
    private CharSequence connectorDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn
     * 
     */
    @JsonProperty("SubscriptionDefinitionVersionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn")
    private CharSequence subscriptionDefinitionVersionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid
     * 
     */
    @JsonProperty("GroupId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid")
    private CharSequence groupId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getLoggerDefinitionVersionArn() {
        return loggerDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-loggerdefinitionversionarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceDefinitionVersionArn() {
        return deviceDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-devicedefinitionversionarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionDefinitionVersionArn() {
        return functionDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-functiondefinitionversionarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getCoreDefinitionVersionArn() {
        return coreDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-coredefinitionversionarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getResourceDefinitionVersionArn() {
        return resourceDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-resourcedefinitionversionarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getConnectorDefinitionVersionArn() {
        return connectorDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-connectordefinitionversionarn
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn
     * 
     */
    @JsonIgnore
    public CharSequence getSubscriptionDefinitionVersionArn() {
        return subscriptionDefinitionVersionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-subscriptiondefinitionversionarn
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

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid
     * 
     */
    @JsonIgnore
    public CharSequence getGroupId() {
        return groupId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-groupversion.html#cfn-greengrass-groupversion-groupid
     * 
     */
    @JsonIgnore
    public void setGroupId(CharSequence groupId) {
        this.groupId = groupId;
    }

    public GroupVersion withGroupId(CharSequence groupId) {
        this.groupId = groupId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("loggerDefinitionVersionArn", loggerDefinitionVersionArn).append("deviceDefinitionVersionArn", deviceDefinitionVersionArn).append("functionDefinitionVersionArn", functionDefinitionVersionArn).append("coreDefinitionVersionArn", coreDefinitionVersionArn).append("resourceDefinitionVersionArn", resourceDefinitionVersionArn).append("connectorDefinitionVersionArn", connectorDefinitionVersionArn).append("subscriptionDefinitionVersionArn", subscriptionDefinitionVersionArn).append("groupId", groupId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subscriptionDefinitionVersionArn).append(coreDefinitionVersionArn).append(functionDefinitionVersionArn).append(groupId).append(resourceDefinitionVersionArn).append(deviceDefinitionVersionArn).append(loggerDefinitionVersionArn).append(connectorDefinitionVersionArn).toHashCode();
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
        return new EqualsBuilder().append(subscriptionDefinitionVersionArn, rhs.subscriptionDefinitionVersionArn).append(coreDefinitionVersionArn, rhs.coreDefinitionVersionArn).append(functionDefinitionVersionArn, rhs.functionDefinitionVersionArn).append(groupId, rhs.groupId).append(resourceDefinitionVersionArn, rhs.resourceDefinitionVersionArn).append(deviceDefinitionVersionArn, rhs.deviceDefinitionVersionArn).append(loggerDefinitionVersionArn, rhs.loggerDefinitionVersionArn).append(connectorDefinitionVersionArn, rhs.connectorDefinitionVersionArn).isEquals();
    }

}
