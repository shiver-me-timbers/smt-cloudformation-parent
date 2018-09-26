
package aws.autoscaling;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
 * AutoScalingGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    "MaxSize",
    "MetricsCollection",
    "MinSize",
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
    private Integer healthCheckGracePeriod;
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
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html")
    private LaunchTemplateSpecification launchTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    @JsonProperty("LifecycleHookSpecificationList")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist")
    private List<LifecycleHookSpecification> lifecycleHookSpecificationList = new ArrayList<LifecycleHookSpecification>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    @JsonProperty("LoadBalancerNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames")
    private List<CharSequence> loadBalancerNames = new ArrayList<CharSequence>();
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
    private List<MetricsCollection> metricsCollection = new ArrayList<MetricsCollection>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    @JsonProperty("MinSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize")
    private CharSequence minSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    @JsonProperty("NotificationConfigurations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations")
    private List<NotificationConfiguration> notificationConfigurations = new ArrayList<NotificationConfiguration>();
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
    private List<TagProperty> tags = new ArrayList<TagProperty>();
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
    public CharSequence getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname
     * 
     */
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
    public List<CharSequence> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
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
    public CharSequence getCooldown() {
        return cooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
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
    public CharSequence getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
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
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod
     * 
     */
    public void setHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
    }

    public AutoScalingGroup withHealthCheckGracePeriod(Integer healthCheckGracePeriod) {
        this.healthCheckGracePeriod = healthCheckGracePeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype
     * 
     */
    public CharSequence getHealthCheckType() {
        return healthCheckType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype
     * 
     */
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
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
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
    public CharSequence getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    public void setLaunchConfigurationName(CharSequence launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    public AutoScalingGroup withLaunchConfigurationName(CharSequence launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    public LaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    public void setLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public AutoScalingGroup withLaunchTemplate(LaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    public List<LifecycleHookSpecification> getLifecycleHookSpecificationList() {
        return lifecycleHookSpecificationList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    public void setLifecycleHookSpecificationList(List<LifecycleHookSpecification> lifecycleHookSpecificationList) {
        this.lifecycleHookSpecificationList = lifecycleHookSpecificationList;
    }

    public AutoScalingGroup withLifecycleHookSpecificationList(List<LifecycleHookSpecification> lifecycleHookSpecificationList) {
        this.lifecycleHookSpecificationList = lifecycleHookSpecificationList;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    public List<CharSequence> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    public void setLoadBalancerNames(List<CharSequence> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
    }

    public AutoScalingGroup withLoadBalancerNames(List<CharSequence> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    public CharSequence getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
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
    public List<MetricsCollection> getMetricsCollection() {
        return metricsCollection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection
     * 
     */
    public void setMetricsCollection(List<MetricsCollection> metricsCollection) {
        this.metricsCollection = metricsCollection;
    }

    public AutoScalingGroup withMetricsCollection(List<MetricsCollection> metricsCollection) {
        this.metricsCollection = metricsCollection;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    public CharSequence getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    public void setMinSize(CharSequence minSize) {
        this.minSize = minSize;
    }

    public AutoScalingGroup withMinSize(CharSequence minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    public List<NotificationConfiguration> getNotificationConfigurations() {
        return notificationConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    public void setNotificationConfigurations(List<NotificationConfiguration> notificationConfigurations) {
        this.notificationConfigurations = notificationConfigurations;
    }

    public AutoScalingGroup withNotificationConfigurations(List<NotificationConfiguration> notificationConfigurations) {
        this.notificationConfigurations = notificationConfigurations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup
     * 
     */
    public CharSequence getPlacementGroup() {
        return placementGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup
     * 
     */
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
    public CharSequence getServiceLinkedRoleARN() {
        return serviceLinkedRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
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
    public List<TagProperty> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags
     * 
     */
    public void setTags(List<TagProperty> tags) {
        this.tags = tags;
    }

    public AutoScalingGroup withTags(List<TagProperty> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns
     * 
     */
    public Set<CharSequence> getTargetGroupARNs() {
        return targetGroupARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns
     * 
     */
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
    public Set<CharSequence> getTerminationPolicies() {
        return terminationPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
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
    public List<CharSequence> getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    public void setVPCZoneIdentifier(List<CharSequence> vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    public AutoScalingGroup withVPCZoneIdentifier(List<CharSequence> vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoScalingGroupName", autoScalingGroupName).append("availabilityZones", availabilityZones).append("cooldown", cooldown).append("desiredCapacity", desiredCapacity).append("healthCheckGracePeriod", healthCheckGracePeriod).append("healthCheckType", healthCheckType).append("instanceId", instanceId).append("launchConfigurationName", launchConfigurationName).append("launchTemplate", launchTemplate).append("lifecycleHookSpecificationList", lifecycleHookSpecificationList).append("loadBalancerNames", loadBalancerNames).append("maxSize", maxSize).append("metricsCollection", metricsCollection).append("minSize", minSize).append("notificationConfigurations", notificationConfigurations).append("placementGroup", placementGroup).append("serviceLinkedRoleARN", serviceLinkedRoleARN).append("tags", tags).append("targetGroupARNs", targetGroupARNs).append("terminationPolicies", terminationPolicies).append("vPCZoneIdentifier", vPCZoneIdentifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(healthCheckType).append(loadBalancerNames).append(metricsCollection).append(terminationPolicies).append(availabilityZones).append(maxSize).append(targetGroupARNs).append(serviceLinkedRoleARN).append(tags).append(launchConfigurationName).append(notificationConfigurations).append(autoScalingGroupName).append(instanceId).append(healthCheckGracePeriod).append(cooldown).append(launchTemplate).append(minSize).append(placementGroup).append(desiredCapacity).append(lifecycleHookSpecificationList).append(vPCZoneIdentifier).toHashCode();
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
        return new EqualsBuilder().append(healthCheckType, rhs.healthCheckType).append(loadBalancerNames, rhs.loadBalancerNames).append(metricsCollection, rhs.metricsCollection).append(terminationPolicies, rhs.terminationPolicies).append(availabilityZones, rhs.availabilityZones).append(maxSize, rhs.maxSize).append(targetGroupARNs, rhs.targetGroupARNs).append(serviceLinkedRoleARN, rhs.serviceLinkedRoleARN).append(tags, rhs.tags).append(launchConfigurationName, rhs.launchConfigurationName).append(notificationConfigurations, rhs.notificationConfigurations).append(autoScalingGroupName, rhs.autoScalingGroupName).append(instanceId, rhs.instanceId).append(healthCheckGracePeriod, rhs.healthCheckGracePeriod).append(cooldown, rhs.cooldown).append(launchTemplate, rhs.launchTemplate).append(minSize, rhs.minSize).append(placementGroup, rhs.placementGroup).append(desiredCapacity, rhs.desiredCapacity).append(lifecycleHookSpecificationList, rhs.lifecycleHookSpecificationList).append(vPCZoneIdentifier, rhs.vPCZoneIdentifier).isEquals();
    }

}
