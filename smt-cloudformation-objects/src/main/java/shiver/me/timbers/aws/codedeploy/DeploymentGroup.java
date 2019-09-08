
package shiver.me.timbers.aws.codedeploy;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DeploymentGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AlarmConfiguration",
    "ApplicationName",
    "AutoRollbackConfiguration",
    "AutoScalingGroups",
    "Deployment",
    "DeploymentConfigName",
    "DeploymentGroupName",
    "DeploymentStyle",
    "Ec2TagFilters",
    "Ec2TagSet",
    "LoadBalancerInfo",
    "OnPremisesInstanceTagFilters",
    "OnPremisesTagSet",
    "ServiceRoleArn",
    "TriggerConfigurations"
})
public class DeploymentGroup {

    /**
     * DeploymentGroupAlarmConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
     * 
     */
    @JsonProperty("AlarmConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html")
    private Property<DeploymentGroupAlarmConfiguration> alarmConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname")
    private CharSequence applicationName;
    /**
     * DeploymentGroupAutoRollbackConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
     * 
     */
    @JsonProperty("AutoRollbackConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html")
    private Property<DeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups
     * 
     */
    @JsonProperty("AutoScalingGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups")
    private Set<CharSequence> autoScalingGroups = new LinkedHashSet<CharSequence>();
    /**
     * DeploymentGroupDeployment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
     * 
     */
    @JsonProperty("Deployment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html")
    private Property<DeploymentGroupDeployment> deployment;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname
     * 
     */
    @JsonProperty("DeploymentConfigName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname")
    private CharSequence deploymentConfigName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname
     * 
     */
    @JsonProperty("DeploymentGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname")
    private CharSequence deploymentGroupName;
    /**
     * DeploymentGroupDeploymentStyle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
     * 
     */
    @JsonProperty("DeploymentStyle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html")
    private Property<DeploymentGroupDeploymentStyle> deploymentStyle;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters
     * 
     */
    @JsonProperty("Ec2TagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters")
    private Set<Property<DeploymentGroupEC2TagFilter>> ec2TagFilters = new LinkedHashSet<Property<DeploymentGroupEC2TagFilter>>();
    /**
     * DeploymentGroupEC2TagSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html
     * 
     */
    @JsonProperty("Ec2TagSet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html")
    private Property<DeploymentGroupEC2TagSet> ec2TagSet;
    /**
     * DeploymentGroupLoadBalancerInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
     * 
     */
    @JsonProperty("LoadBalancerInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html")
    private Property<DeploymentGroupLoadBalancerInfo> loadBalancerInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters
     * 
     */
    @JsonProperty("OnPremisesInstanceTagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters")
    private Set<Property<DeploymentGroupTagFilter>> onPremisesInstanceTagFilters = new LinkedHashSet<Property<DeploymentGroupTagFilter>>();
    /**
     * DeploymentGroupOnPremisesTagSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html
     * 
     */
    @JsonProperty("OnPremisesTagSet")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html")
    private Property<DeploymentGroupOnPremisesTagSet> onPremisesTagSet;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn")
    private CharSequence serviceRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations
     * 
     */
    @JsonProperty("TriggerConfigurations")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations")
    private Set<Property<DeploymentGroupTriggerConfig>> triggerConfigurations = new LinkedHashSet<Property<DeploymentGroupTriggerConfig>>();

    /**
     * DeploymentGroupAlarmConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupAlarmConfiguration> getAlarmConfiguration() {
        return alarmConfiguration;
    }

    /**
     * DeploymentGroupAlarmConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAlarmConfiguration(Property<DeploymentGroupAlarmConfiguration> alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    public DeploymentGroup withAlarmConfiguration(Property<DeploymentGroupAlarmConfiguration> alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname
     * 
     */
    @JsonIgnore
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public DeploymentGroup withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * DeploymentGroupAutoRollbackConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupAutoRollbackConfiguration> getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * DeploymentGroupAutoRollbackConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAutoRollbackConfiguration(Property<DeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    public DeploymentGroup withAutoRollbackConfiguration(Property<DeploymentGroupAutoRollbackConfiguration> autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups
     * 
     */
    @JsonIgnore
    public void setAutoScalingGroups(Set<CharSequence> autoScalingGroups) {
        this.autoScalingGroups = autoScalingGroups;
    }

    public DeploymentGroup withAutoScalingGroups(Set<CharSequence> autoScalingGroups) {
        this.autoScalingGroups = autoScalingGroups;
        return this;
    }

    /**
     * DeploymentGroupDeployment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupDeployment> getDeployment() {
        return deployment;
    }

    /**
     * DeploymentGroupDeployment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
     * 
     */
    @JsonIgnore
    public void setDeployment(Property<DeploymentGroupDeployment> deployment) {
        this.deployment = deployment;
    }

    public DeploymentGroup withDeployment(Property<DeploymentGroupDeployment> deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname
     * 
     */
    @JsonIgnore
    public void setDeploymentConfigName(CharSequence deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    public DeploymentGroup withDeploymentConfigName(CharSequence deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname
     * 
     */
    @JsonIgnore
    public CharSequence getDeploymentGroupName() {
        return deploymentGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname
     * 
     */
    @JsonIgnore
    public void setDeploymentGroupName(CharSequence deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    public DeploymentGroup withDeploymentGroupName(CharSequence deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * DeploymentGroupDeploymentStyle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupDeploymentStyle> getDeploymentStyle() {
        return deploymentStyle;
    }

    /**
     * DeploymentGroupDeploymentStyle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
     * 
     */
    @JsonIgnore
    public void setDeploymentStyle(Property<DeploymentGroupDeploymentStyle> deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
    }

    public DeploymentGroup withDeploymentStyle(Property<DeploymentGroupDeploymentStyle> deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupEC2TagFilter>> getEc2TagFilters() {
        return ec2TagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters
     * 
     */
    @JsonIgnore
    public void setEc2TagFilters(Set<Property<DeploymentGroupEC2TagFilter>> ec2TagFilters) {
        this.ec2TagFilters = ec2TagFilters;
    }

    public DeploymentGroup withEc2TagFilters(Set<Property<DeploymentGroupEC2TagFilter>> ec2TagFilters) {
        this.ec2TagFilters = ec2TagFilters;
        return this;
    }

    /**
     * DeploymentGroupEC2TagSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupEC2TagSet> getEc2TagSet() {
        return ec2TagSet;
    }

    /**
     * DeploymentGroupEC2TagSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-ec2tagset.html
     * 
     */
    @JsonIgnore
    public void setEc2TagSet(Property<DeploymentGroupEC2TagSet> ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    public DeploymentGroup withEc2TagSet(Property<DeploymentGroupEC2TagSet> ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
        return this;
    }

    /**
     * DeploymentGroupLoadBalancerInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupLoadBalancerInfo> getLoadBalancerInfo() {
        return loadBalancerInfo;
    }

    /**
     * DeploymentGroupLoadBalancerInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
     * 
     */
    @JsonIgnore
    public void setLoadBalancerInfo(Property<DeploymentGroupLoadBalancerInfo> loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    public DeploymentGroup withLoadBalancerInfo(Property<DeploymentGroupLoadBalancerInfo> loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupTagFilter>> getOnPremisesInstanceTagFilters() {
        return onPremisesInstanceTagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters
     * 
     */
    @JsonIgnore
    public void setOnPremisesInstanceTagFilters(Set<Property<DeploymentGroupTagFilter>> onPremisesInstanceTagFilters) {
        this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
    }

    public DeploymentGroup withOnPremisesInstanceTagFilters(Set<Property<DeploymentGroupTagFilter>> onPremisesInstanceTagFilters) {
        this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
        return this;
    }

    /**
     * DeploymentGroupOnPremisesTagSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html
     * 
     */
    @JsonIgnore
    public Property<DeploymentGroupOnPremisesTagSet> getOnPremisesTagSet() {
        return onPremisesTagSet;
    }

    /**
     * DeploymentGroupOnPremisesTagSet
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-onpremisestagset.html
     * 
     */
    @JsonIgnore
    public void setOnPremisesTagSet(Property<DeploymentGroupOnPremisesTagSet> onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
    }

    public DeploymentGroup withOnPremisesTagSet(Property<DeploymentGroupOnPremisesTagSet> onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn
     * 
     */
    @JsonIgnore
    public void setServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    public DeploymentGroup withServiceRoleArn(CharSequence serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations
     * 
     */
    @JsonIgnore
    public Set<Property<DeploymentGroupTriggerConfig>> getTriggerConfigurations() {
        return triggerConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations
     * 
     */
    @JsonIgnore
    public void setTriggerConfigurations(Set<Property<DeploymentGroupTriggerConfig>> triggerConfigurations) {
        this.triggerConfigurations = triggerConfigurations;
    }

    public DeploymentGroup withTriggerConfigurations(Set<Property<DeploymentGroupTriggerConfig>> triggerConfigurations) {
        this.triggerConfigurations = triggerConfigurations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarmConfiguration", alarmConfiguration).append("applicationName", applicationName).append("autoRollbackConfiguration", autoRollbackConfiguration).append("autoScalingGroups", autoScalingGroups).append("deployment", deployment).append("deploymentConfigName", deploymentConfigName).append("deploymentGroupName", deploymentGroupName).append("deploymentStyle", deploymentStyle).append("ec2TagFilters", ec2TagFilters).append("ec2TagSet", ec2TagSet).append("loadBalancerInfo", loadBalancerInfo).append("onPremisesInstanceTagFilters", onPremisesInstanceTagFilters).append("onPremisesTagSet", onPremisesTagSet).append("serviceRoleArn", serviceRoleArn).append("triggerConfigurations", triggerConfigurations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deploymentGroupName).append(deploymentConfigName).append(loadBalancerInfo).append(triggerConfigurations).append(alarmConfiguration).append(onPremisesTagSet).append(autoScalingGroups).append(ec2TagFilters).append(deploymentStyle).append(ec2TagSet).append(serviceRoleArn).append(applicationName).append(onPremisesInstanceTagFilters).append(autoRollbackConfiguration).append(deployment).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentGroup) == false) {
            return false;
        }
        DeploymentGroup rhs = ((DeploymentGroup) other);
        return new EqualsBuilder().append(deploymentGroupName, rhs.deploymentGroupName).append(deploymentConfigName, rhs.deploymentConfigName).append(loadBalancerInfo, rhs.loadBalancerInfo).append(triggerConfigurations, rhs.triggerConfigurations).append(alarmConfiguration, rhs.alarmConfiguration).append(onPremisesTagSet, rhs.onPremisesTagSet).append(autoScalingGroups, rhs.autoScalingGroups).append(ec2TagFilters, rhs.ec2TagFilters).append(deploymentStyle, rhs.deploymentStyle).append(ec2TagSet, rhs.ec2TagSet).append(serviceRoleArn, rhs.serviceRoleArn).append(applicationName, rhs.applicationName).append(onPremisesInstanceTagFilters, rhs.onPremisesInstanceTagFilters).append(autoRollbackConfiguration, rhs.autoRollbackConfiguration).append(deployment, rhs.deployment).isEquals();
    }

}
