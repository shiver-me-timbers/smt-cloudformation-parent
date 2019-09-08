
package shiver.me.timbers.aws.events;

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
 * RuleEcsParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Group",
    "LaunchType",
    "NetworkConfiguration",
    "PlatformVersion",
    "TaskCount",
    "TaskDefinitionArn"
})
public class RuleEcsParameters implements Property<RuleEcsParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-group
     * 
     */
    @JsonProperty("Group")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-group")
    private CharSequence group;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-launchtype
     * 
     */
    @JsonProperty("LaunchType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-launchtype")
    private CharSequence launchType;
    /**
     * RuleNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html
     * 
     */
    @JsonProperty("NetworkConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html")
    private Property<RuleNetworkConfiguration> networkConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-platformversion
     * 
     */
    @JsonProperty("PlatformVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-platformversion")
    private CharSequence platformVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount
     * 
     */
    @JsonProperty("TaskCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount")
    private Number taskCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn
     * 
     */
    @JsonProperty("TaskDefinitionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn")
    private CharSequence taskDefinitionArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-group
     * 
     */
    @JsonIgnore
    public CharSequence getGroup() {
        return group;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-group
     * 
     */
    @JsonIgnore
    public void setGroup(CharSequence group) {
        this.group = group;
    }

    public RuleEcsParameters withGroup(CharSequence group) {
        this.group = group;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-launchtype
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchType() {
        return launchType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-launchtype
     * 
     */
    @JsonIgnore
    public void setLaunchType(CharSequence launchType) {
        this.launchType = launchType;
    }

    public RuleEcsParameters withLaunchType(CharSequence launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * RuleNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<RuleNetworkConfiguration> getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * RuleNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNetworkConfiguration(Property<RuleNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    public RuleEcsParameters withNetworkConfiguration(Property<RuleNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-platformversion
     * 
     */
    @JsonIgnore
    public CharSequence getPlatformVersion() {
        return platformVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-platformversion
     * 
     */
    @JsonIgnore
    public void setPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
    }

    public RuleEcsParameters withPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount
     * 
     */
    @JsonIgnore
    public Number getTaskCount() {
        return taskCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskcount
     * 
     */
    @JsonIgnore
    public void setTaskCount(Number taskCount) {
        this.taskCount = taskCount;
    }

    public RuleEcsParameters withTaskCount(Number taskCount) {
        this.taskCount = taskCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn
     * 
     */
    @JsonIgnore
    public CharSequence getTaskDefinitionArn() {
        return taskDefinitionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-ecsparameters.html#cfn-events-rule-ecsparameters-taskdefinitionarn
     * 
     */
    @JsonIgnore
    public void setTaskDefinitionArn(CharSequence taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    public RuleEcsParameters withTaskDefinitionArn(CharSequence taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("group", group).append("launchType", launchType).append("networkConfiguration", networkConfiguration).append("platformVersion", platformVersion).append("taskCount", taskCount).append("taskDefinitionArn", taskDefinitionArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(taskCount).append(taskDefinitionArn).append(networkConfiguration).append(platformVersion).append(group).append(launchType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleEcsParameters) == false) {
            return false;
        }
        RuleEcsParameters rhs = ((RuleEcsParameters) other);
        return new EqualsBuilder().append(taskCount, rhs.taskCount).append(taskDefinitionArn, rhs.taskDefinitionArn).append(networkConfiguration, rhs.networkConfiguration).append(platformVersion, rhs.platformVersion).append(group, rhs.group).append(launchType, rhs.launchType).isEquals();
    }

}
