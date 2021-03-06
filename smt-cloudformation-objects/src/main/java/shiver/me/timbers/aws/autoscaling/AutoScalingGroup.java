
package shiver.me.timbers.aws.autoscaling;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
 * AutoScalingGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutoScalingGroupName",
    "AvailabilityZones",
    "Cooldown",
    "DesiredCapacity",
    "HealthCheckGracePeriod",
    "HealthCheckType",
    "InstanceId",
    "LaunchConfigurationName",
    "LaunchTemplate",
    "LifecycleHookSpecificationList",
    "LoadBalancerNames",
    "MaxInstanceLifetime",
    "MaxSize",
    "MetricsCollection",
    "MinSize",
    "MixedInstancesPolicy",
    "NotificationConfigurations",
    "PlacementGroup",
    "ServiceLinkedRoleARN",
    "Tags",
    "TargetGroupARNs",
    "TerminationPolicies",
    "VPCZoneIdentifier"
})
public class AutoScalingGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname")
    private CharSequence autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones")
    private List<CharSequence> availabilityZones = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown")
    private CharSequence cooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
    @JsonProperty("DesiredCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity")
    private CharSequence desiredCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod
     * 
     */
    @JsonProperty("HealthCheckGracePeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod")
    private Number healthCheckGracePeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype
     * 
     */
    @JsonProperty("HealthCheckType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype")
    private CharSequence healthCheckType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname")
    private CharSequence launchConfigurationName;
    /**
     * AutoScalingGroupLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html")
    private Property<AutoScalingGroupLaunchTemplateSpecification> launchTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    @JsonProperty("LifecycleHookSpecificationList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist")
    private List<Property<AutoScalingGroupLifecycleHookSpecification>> lifecycleHookSpecificationList = new ArrayList<Property<AutoScalingGroupLifecycleHookSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    @JsonProperty("LoadBalancerNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames")
    private List<CharSequence> loadBalancerNames = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxinstancelifetime
     * 
     */
    @JsonProperty("MaxInstanceLifetime")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxinstancelifetime")
    private Number maxInstanceLifetime;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize")
    private CharSequence maxSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection
     * 
     */
    @JsonProperty("MetricsCollection")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection")
    private List<Property<AutoScalingGroupMetricsCollection>> metricsCollection = new ArrayList<Property<AutoScalingGroupMetricsCollection>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    @JsonProperty("MinSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize")
    private CharSequence minSize;
    /**
     * AutoScalingGroupMixedInstancesPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-group-mixedinstancespolicy.html
     * 
     */
    @JsonProperty("MixedInstancesPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-group-mixedinstancespolicy.html")
    private Property<AutoScalingGroupMixedInstancesPolicy> mixedInstancesPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    @JsonProperty("NotificationConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations")
    private List<Property<AutoScalingGroupNotificationConfiguration>> notificationConfigurations = new ArrayList<Property<AutoScalingGroupNotificationConfiguration>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup
     * 
     */
    @JsonProperty("PlacementGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup")
    private CharSequence placementGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
    @JsonProperty("ServiceLinkedRoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn")
    private CharSequence serviceLinkedRoleARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags")
    private List<Property<AutoScalingGroupTagProperty>> tags = new ArrayList<Property<AutoScalingGroupTagProperty>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns
     * 
     */
    @JsonProperty("TargetGroupARNs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns")
    private Set<CharSequence> targetGroupARNs = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
    @JsonProperty("TerminationPolicies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy")
    private Set<CharSequence> terminationPolicies = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    @JsonProperty("VPCZoneIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier")
    private List<CharSequence> vPCZoneIdentifier = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname
     * 
     */
    @JsonIgnore
    public CharSequence getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname
     * 
     */
    @JsonIgnore
    public void setAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public AutoScalingGroup withAutoScalingGroupName(CharSequence autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
    @JsonIgnore
    public void setAvailabilityZones(List<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public AutoScalingGroup withAvailabilityZones(List<CharSequence> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
    @JsonIgnore
    public CharSequence getCooldown() {
        return cooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
    @JsonIgnore
    public void setCooldown(CharSequence cooldown) {
        this.cooldown = cooldown;
    }

    public AutoScalingGroup withCooldown(CharSequence cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
    @JsonIgnore
    public CharSequence getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
    @JsonIgnore
    public void setDesiredCapacity(CharSequence desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    public AutoScalingGroup withDesiredCapacity(CharSequence desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod
     * 
     */
    @JsonIgnore
    public Number getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod
     * 
     */
    @JsonIgnore
    public void setHealthCheckGracePeriod(Number healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    public AutoScalingGroup withHealthCheckGracePeriod(Number healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype
     * 
     */
    @JsonIgnore
    public CharSequence getHealthCheckType() {
        return healthCheckType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype
     * 
     */
    @JsonIgnore
    public void setHealthCheckType(CharSequence healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    public AutoScalingGroup withHealthCheckType(CharSequence healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
    @JsonIgnore
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public AutoScalingGroup withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    @JsonIgnore
    public void setLaunchConfigurationName(CharSequence launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    public AutoScalingGroup withLaunchConfigurationName(CharSequence launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * AutoScalingGroupLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<AutoScalingGroupLaunchTemplateSpecification> getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * AutoScalingGroupLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplate(Property<AutoScalingGroupLaunchTemplateSpecification> launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public AutoScalingGroup withLaunchTemplate(Property<AutoScalingGroupLaunchTemplateSpecification> launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    @JsonIgnore
    public List<Property<AutoScalingGroupLifecycleHookSpecification>> getLifecycleHookSpecificationList() {
        return lifecycleHookSpecificationList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    @JsonIgnore
    public void setLifecycleHookSpecificationList(List<Property<AutoScalingGroupLifecycleHookSpecification>> lifecycleHookSpecificationList) {
        this.lifecycleHookSpecificationList = lifecycleHookSpecificationList;
    }

    public AutoScalingGroup withLifecycleHookSpecificationList(List<Property<AutoScalingGroupLifecycleHookSpecification>> lifecycleHookSpecificationList) {
        this.lifecycleHookSpecificationList = lifecycleHookSpecificationList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    @JsonIgnore
    public List<CharSequence> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    @JsonIgnore
    public void setLoadBalancerNames(List<CharSequence> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
    }

    public AutoScalingGroup withLoadBalancerNames(List<CharSequence> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxinstancelifetime
     * 
     */
    @JsonIgnore
    public Number getMaxInstanceLifetime() {
        return maxInstanceLifetime;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxinstancelifetime
     * 
     */
    @JsonIgnore
    public void setMaxInstanceLifetime(Number maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
    }

    public AutoScalingGroup withMaxInstanceLifetime(Number maxInstanceLifetime) {
        this.maxInstanceLifetime = maxInstanceLifetime;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    @JsonIgnore
    public CharSequence getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    @JsonIgnore
    public void setMaxSize(CharSequence maxSize) {
        this.maxSize = maxSize;
    }

    public AutoScalingGroup withMaxSize(CharSequence maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection
     * 
     */
    @JsonIgnore
    public List<Property<AutoScalingGroupMetricsCollection>> getMetricsCollection() {
        return metricsCollection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection
     * 
     */
    @JsonIgnore
    public void setMetricsCollection(List<Property<AutoScalingGroupMetricsCollection>> metricsCollection) {
        this.metricsCollection = metricsCollection;
    }

    public AutoScalingGroup withMetricsCollection(List<Property<AutoScalingGroupMetricsCollection>> metricsCollection) {
        this.metricsCollection = metricsCollection;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    @JsonIgnore
    public CharSequence getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    @JsonIgnore
    public void setMinSize(CharSequence minSize) {
        this.minSize = minSize;
    }

    public AutoScalingGroup withMinSize(CharSequence minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * AutoScalingGroupMixedInstancesPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-group-mixedinstancespolicy.html
     * 
     */
    @JsonIgnore
    public Property<AutoScalingGroupMixedInstancesPolicy> getMixedInstancesPolicy() {
        return mixedInstancesPolicy;
    }

    /**
     * AutoScalingGroupMixedInstancesPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-as-group-mixedinstancespolicy.html
     * 
     */
    @JsonIgnore
    public void setMixedInstancesPolicy(Property<AutoScalingGroupMixedInstancesPolicy> mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
    }

    public AutoScalingGroup withMixedInstancesPolicy(Property<AutoScalingGroupMixedInstancesPolicy> mixedInstancesPolicy) {
        this.mixedInstancesPolicy = mixedInstancesPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    @JsonIgnore
    public List<Property<AutoScalingGroupNotificationConfiguration>> getNotificationConfigurations() {
        return notificationConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    @JsonIgnore
    public void setNotificationConfigurations(List<Property<AutoScalingGroupNotificationConfiguration>> notificationConfigurations) {
        this.notificationConfigurations = notificationConfigurations;
    }

    public AutoScalingGroup withNotificationConfigurations(List<Property<AutoScalingGroupNotificationConfiguration>> notificationConfigurations) {
        this.notificationConfigurations = notificationConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup
     * 
     */
    @JsonIgnore
    public CharSequence getPlacementGroup() {
        return placementGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup
     * 
     */
    @JsonIgnore
    public void setPlacementGroup(CharSequence placementGroup) {
        this.placementGroup = placementGroup;
    }

    public AutoScalingGroup withPlacementGroup(CharSequence placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceLinkedRoleARN() {
        return serviceLinkedRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
    @JsonIgnore
    public void setServiceLinkedRoleARN(CharSequence serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    public AutoScalingGroup withServiceLinkedRoleARN(CharSequence serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags
     * 
     */
    @JsonIgnore
    public List<Property<AutoScalingGroupTagProperty>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<AutoScalingGroupTagProperty>> tags) {
        this.tags = tags;
    }

    public AutoScalingGroup withTags(List<Property<AutoScalingGroupTagProperty>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getTargetGroupARNs() {
        return targetGroupARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns
     * 
     */
    @JsonIgnore
    public void setTargetGroupARNs(Set<CharSequence> targetGroupARNs) {
        this.targetGroupARNs = targetGroupARNs;
    }

    public AutoScalingGroup withTargetGroupARNs(Set<CharSequence> targetGroupARNs) {
        this.targetGroupARNs = targetGroupARNs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getTerminationPolicies() {
        return terminationPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
    @JsonIgnore
    public void setTerminationPolicies(Set<CharSequence> terminationPolicies) {
        this.terminationPolicies = terminationPolicies;
    }

    public AutoScalingGroup withTerminationPolicies(Set<CharSequence> terminationPolicies) {
        this.terminationPolicies = terminationPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    @JsonIgnore
    public List<CharSequence> getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    @JsonIgnore
    public void setVPCZoneIdentifier(List<CharSequence> vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    public AutoScalingGroup withVPCZoneIdentifier(List<CharSequence> vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingGroupName", autoScalingGroupName).append("availabilityZones", availabilityZones).append("cooldown", cooldown).append("desiredCapacity", desiredCapacity).append("healthCheckGracePeriod", healthCheckGracePeriod).append("healthCheckType", healthCheckType).append("instanceId", instanceId).append("launchConfigurationName", launchConfigurationName).append("launchTemplate", launchTemplate).append("lifecycleHookSpecificationList", lifecycleHookSpecificationList).append("loadBalancerNames", loadBalancerNames).append("maxInstanceLifetime", maxInstanceLifetime).append("maxSize", maxSize).append("metricsCollection", metricsCollection).append("minSize", minSize).append("mixedInstancesPolicy", mixedInstancesPolicy).append("notificationConfigurations", notificationConfigurations).append("placementGroup", placementGroup).append("serviceLinkedRoleARN", serviceLinkedRoleARN).append("tags", tags).append("targetGroupARNs", targetGroupARNs).append("terminationPolicies", terminationPolicies).append("vPCZoneIdentifier", vPCZoneIdentifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckType).append(loadBalancerNames).append(metricsCollection).append(terminationPolicies).append(availabilityZones).append(maxSize).append(targetGroupARNs).append(maxInstanceLifetime).append(serviceLinkedRoleARN).append(tags).append(launchConfigurationName).append(notificationConfigurations).append(autoScalingGroupName).append(mixedInstancesPolicy).append(instanceId).append(healthCheckGracePeriod).append(cooldown).append(launchTemplate).append(minSize).append(placementGroup).append(desiredCapacity).append(lifecycleHookSpecificationList).append(vPCZoneIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AutoScalingGroup) == false) {
            return false;
        }
        AutoScalingGroup rhs = ((AutoScalingGroup) other);
        return new EqualsBuilder().append(healthCheckType, rhs.healthCheckType).append(loadBalancerNames, rhs.loadBalancerNames).append(metricsCollection, rhs.metricsCollection).append(terminationPolicies, rhs.terminationPolicies).append(availabilityZones, rhs.availabilityZones).append(maxSize, rhs.maxSize).append(targetGroupARNs, rhs.targetGroupARNs).append(maxInstanceLifetime, rhs.maxInstanceLifetime).append(serviceLinkedRoleARN, rhs.serviceLinkedRoleARN).append(tags, rhs.tags).append(launchConfigurationName, rhs.launchConfigurationName).append(notificationConfigurations, rhs.notificationConfigurations).append(autoScalingGroupName, rhs.autoScalingGroupName).append(mixedInstancesPolicy, rhs.mixedInstancesPolicy).append(instanceId, rhs.instanceId).append(healthCheckGracePeriod, rhs.healthCheckGracePeriod).append(cooldown, rhs.cooldown).append(launchTemplate, rhs.launchTemplate).append(minSize, rhs.minSize).append(placementGroup, rhs.placementGroup).append(desiredCapacity, rhs.desiredCapacity).append(lifecycleHookSpecificationList, rhs.lifecycleHookSpecificationList).append(vPCZoneIdentifier, rhs.vPCZoneIdentifier).isEquals();
    }

}
