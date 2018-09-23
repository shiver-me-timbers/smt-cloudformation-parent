
package aws.codedeploy;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeploymentGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    "LoadBalancerInfo",
    "OnPremisesInstanceTagFilters",
    "ServiceRoleArn",
    "TriggerConfigurations"
})
public class DeploymentGroup {

    /**
     * AlarmConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
     * 
     */
    @JsonProperty("AlarmConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html")
    private AlarmConfiguration alarmConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname")
    private CharSequence applicationName;
    /**
     * AutoRollbackConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
     * 
     */
    @JsonProperty("AutoRollbackConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html")
    private AutoRollbackConfiguration autoRollbackConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups
     * 
     */
    @JsonProperty("AutoScalingGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups")
    private Set<CharSequence> autoScalingGroups = new LinkedHashSet<CharSequence>();
    /**
     * Deployment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
     * 
     */
    @JsonProperty("Deployment")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html")
    private Deployment deployment;
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
     * DeploymentStyle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
     * 
     */
    @JsonProperty("DeploymentStyle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html")
    private DeploymentStyle deploymentStyle;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters
     * 
     */
    @JsonProperty("Ec2TagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters")
    private Set<EC2TagFilter> ec2TagFilters = new LinkedHashSet<EC2TagFilter>();
    /**
     * LoadBalancerInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
     * 
     */
    @JsonProperty("LoadBalancerInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html")
    private LoadBalancerInfo loadBalancerInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters
     * 
     */
    @JsonProperty("OnPremisesInstanceTagFilters")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters")
    private Set<TagFilter> onPremisesInstanceTagFilters = new LinkedHashSet<TagFilter>();
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
    private Set<TriggerConfig> triggerConfigurations = new LinkedHashSet<TriggerConfig>();

    /**
     * AlarmConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
     * 
     */
    @JsonProperty("AlarmConfiguration")
    public AlarmConfiguration getAlarmConfiguration() {
        return alarmConfiguration;
    }

    /**
     * AlarmConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-alarmconfiguration.html
     * 
     */
    @JsonProperty("AlarmConfiguration")
    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    public DeploymentGroup withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public DeploymentGroup withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * AutoRollbackConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
     * 
     */
    @JsonProperty("AutoRollbackConfiguration")
    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return autoRollbackConfiguration;
    }

    /**
     * AutoRollbackConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-autorollbackconfiguration.html
     * 
     */
    @JsonProperty("AutoRollbackConfiguration")
    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    public DeploymentGroup withAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups
     * 
     */
    @JsonProperty("AutoScalingGroups")
    public Set<CharSequence> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-autoscalinggroups
     * 
     */
    @JsonProperty("AutoScalingGroups")
    public void setAutoScalingGroups(Set<CharSequence> autoScalingGroups) {
        this.autoScalingGroups = autoScalingGroups;
    }

    public DeploymentGroup withAutoScalingGroups(Set<CharSequence> autoScalingGroups) {
        this.autoScalingGroups = autoScalingGroups;
        return this;
    }

    /**
     * Deployment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
     * 
     */
    @JsonProperty("Deployment")
    public Deployment getDeployment() {
        return deployment;
    }

    /**
     * Deployment
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deployment.html
     * 
     */
    @JsonProperty("Deployment")
    public void setDeployment(Deployment deployment) {
        this.deployment = deployment;
    }

    public DeploymentGroup withDeployment(Deployment deployment) {
        this.deployment = deployment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname
     * 
     */
    @JsonProperty("DeploymentConfigName")
    public CharSequence getDeploymentConfigName() {
        return deploymentConfigName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentconfigname
     * 
     */
    @JsonProperty("DeploymentConfigName")
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
    @JsonProperty("DeploymentGroupName")
    public CharSequence getDeploymentGroupName() {
        return deploymentGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-deploymentgroupname
     * 
     */
    @JsonProperty("DeploymentGroupName")
    public void setDeploymentGroupName(CharSequence deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    public DeploymentGroup withDeploymentGroupName(CharSequence deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * DeploymentStyle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
     * 
     */
    @JsonProperty("DeploymentStyle")
    public DeploymentStyle getDeploymentStyle() {
        return deploymentStyle;
    }

    /**
     * DeploymentStyle
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-deploymentstyle.html
     * 
     */
    @JsonProperty("DeploymentStyle")
    public void setDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
    }

    public DeploymentGroup withDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters
     * 
     */
    @JsonProperty("Ec2TagFilters")
    public Set<EC2TagFilter> getEc2TagFilters() {
        return ec2TagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-ec2tagfilters
     * 
     */
    @JsonProperty("Ec2TagFilters")
    public void setEc2TagFilters(Set<EC2TagFilter> ec2TagFilters) {
        this.ec2TagFilters = ec2TagFilters;
    }

    public DeploymentGroup withEc2TagFilters(Set<EC2TagFilter> ec2TagFilters) {
        this.ec2TagFilters = ec2TagFilters;
        return this;
    }

    /**
     * LoadBalancerInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
     * 
     */
    @JsonProperty("LoadBalancerInfo")
    public LoadBalancerInfo getLoadBalancerInfo() {
        return loadBalancerInfo;
    }

    /**
     * LoadBalancerInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentgroup-loadbalancerinfo.html
     * 
     */
    @JsonProperty("LoadBalancerInfo")
    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    public DeploymentGroup withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters
     * 
     */
    @JsonProperty("OnPremisesInstanceTagFilters")
    public Set<TagFilter> getOnPremisesInstanceTagFilters() {
        return onPremisesInstanceTagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-onpremisesinstancetagfilters
     * 
     */
    @JsonProperty("OnPremisesInstanceTagFilters")
    public void setOnPremisesInstanceTagFilters(Set<TagFilter> onPremisesInstanceTagFilters) {
        this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
    }

    public DeploymentGroup withOnPremisesInstanceTagFilters(Set<TagFilter> onPremisesInstanceTagFilters) {
        this.onPremisesInstanceTagFilters = onPremisesInstanceTagFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
    public CharSequence getServiceRoleArn() {
        return serviceRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-servicerolearn
     * 
     */
    @JsonProperty("ServiceRoleArn")
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
    @JsonProperty("TriggerConfigurations")
    public Set<TriggerConfig> getTriggerConfigurations() {
        return triggerConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codedeploy-deploymentgroup.html#cfn-codedeploy-deploymentgroup-triggerconfigurations
     * 
     */
    @JsonProperty("TriggerConfigurations")
    public void setTriggerConfigurations(Set<TriggerConfig> triggerConfigurations) {
        this.triggerConfigurations = triggerConfigurations;
    }

    public DeploymentGroup withTriggerConfigurations(Set<TriggerConfig> triggerConfigurations) {
        this.triggerConfigurations = triggerConfigurations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("alarmConfiguration", alarmConfiguration).append("applicationName", applicationName).append("autoRollbackConfiguration", autoRollbackConfiguration).append("autoScalingGroups", autoScalingGroups).append("deployment", deployment).append("deploymentConfigName", deploymentConfigName).append("deploymentGroupName", deploymentGroupName).append("deploymentStyle", deploymentStyle).append("ec2TagFilters", ec2TagFilters).append("loadBalancerInfo", loadBalancerInfo).append("onPremisesInstanceTagFilters", onPremisesInstanceTagFilters).append("serviceRoleArn", serviceRoleArn).append("triggerConfigurations", triggerConfigurations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deploymentGroupName).append(deploymentConfigName).append(loadBalancerInfo).append(triggerConfigurations).append(alarmConfiguration).append(autoScalingGroups).append(ec2TagFilters).append(deploymentStyle).append(serviceRoleArn).append(applicationName).append(onPremisesInstanceTagFilters).append(autoRollbackConfiguration).append(deployment).toHashCode();
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
        return new EqualsBuilder().append(deploymentGroupName, rhs.deploymentGroupName).append(deploymentConfigName, rhs.deploymentConfigName).append(loadBalancerInfo, rhs.loadBalancerInfo).append(triggerConfigurations, rhs.triggerConfigurations).append(alarmConfiguration, rhs.alarmConfiguration).append(autoScalingGroups, rhs.autoScalingGroups).append(ec2TagFilters, rhs.ec2TagFilters).append(deploymentStyle, rhs.deploymentStyle).append(serviceRoleArn, rhs.serviceRoleArn).append(applicationName, rhs.applicationName).append(onPremisesInstanceTagFilters, rhs.onPremisesInstanceTagFilters).append(autoRollbackConfiguration, rhs.autoRollbackConfiguration).append(deployment, rhs.deployment).isEquals();
    }

}
