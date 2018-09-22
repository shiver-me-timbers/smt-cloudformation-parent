
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
    private String autoScalingGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones")
    private List<String> availabilityZones = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown")
    private String cooldown;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
    @JsonProperty("DesiredCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity")
    private String desiredCapacity;
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
    private String healthCheckType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid")
    private String instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname")
    private String launchConfigurationName;
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
    private List<String> loadBalancerNames = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize")
    private String maxSize;
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
    private String minSize;
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
    private String placementGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
    @JsonProperty("ServiceLinkedRoleARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn")
    private String serviceLinkedRoleARN;
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
    private Set<String> targetGroupARNs = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
    @JsonProperty("TerminationPolicies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy")
    private Set<String> terminationPolicies = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    @JsonProperty("VPCZoneIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier")
    private List<String> vPCZoneIdentifier = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-autoscalinggroupname
     * 
     */
    @JsonProperty("AutoScalingGroupName")
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }

    public AutoScalingGroup withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    public List<String> getAvailabilityZones() {
        return availabilityZones;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-availabilityzones
     * 
     */
    @JsonProperty("AvailabilityZones")
    public void setAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
    }

    public AutoScalingGroup withAvailabilityZones(List<String> availabilityZones) {
        this.availabilityZones = availabilityZones;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    public String getCooldown() {
        return cooldown;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-cooldown
     * 
     */
    @JsonProperty("Cooldown")
    public void setCooldown(String cooldown) {
        this.cooldown = cooldown;
    }

    public AutoScalingGroup withCooldown(String cooldown) {
        this.cooldown = cooldown;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
    @JsonProperty("DesiredCapacity")
    public String getDesiredCapacity() {
        return desiredCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-desiredcapacity
     * 
     */
    @JsonProperty("DesiredCapacity")
    public void setDesiredCapacity(String desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
    }

    public AutoScalingGroup withDesiredCapacity(String desiredCapacity) {
        this.desiredCapacity = desiredCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod
     * 
     */
    @JsonProperty("HealthCheckGracePeriod")
    public Integer getHealthCheckGracePeriod() {
        return healthCheckGracePeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthcheckgraceperiod
     * 
     */
    @JsonProperty("HealthCheckGracePeriod")
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
    @JsonProperty("HealthCheckType")
    public String getHealthCheckType() {
        return healthCheckType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-healthchecktype
     * 
     */
    @JsonProperty("HealthCheckType")
    public void setHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
    }

    public AutoScalingGroup withHealthCheckType(String healthCheckType) {
        this.healthCheckType = healthCheckType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public AutoScalingGroup withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    public AutoScalingGroup withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    public LaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * LaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscaling-autoscalinggroup-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
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
    @JsonProperty("LifecycleHookSpecificationList")
    public List<LifecycleHookSpecification> getLifecycleHookSpecificationList() {
        return lifecycleHookSpecificationList;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-lifecyclehookspecificationlist
     * 
     */
    @JsonProperty("LifecycleHookSpecificationList")
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
    @JsonProperty("LoadBalancerNames")
    public List<String> getLoadBalancerNames() {
        return loadBalancerNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-loadbalancernames
     * 
     */
    @JsonProperty("LoadBalancerNames")
    public void setLoadBalancerNames(List<String> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
    }

    public AutoScalingGroup withLoadBalancerNames(List<String> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    public String getMaxSize() {
        return maxSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-maxsize
     * 
     */
    @JsonProperty("MaxSize")
    public void setMaxSize(String maxSize) {
        this.maxSize = maxSize;
    }

    public AutoScalingGroup withMaxSize(String maxSize) {
        this.maxSize = maxSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection
     * 
     */
    @JsonProperty("MetricsCollection")
    public List<MetricsCollection> getMetricsCollection() {
        return metricsCollection;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-metricscollection
     * 
     */
    @JsonProperty("MetricsCollection")
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
    @JsonProperty("MinSize")
    public String getMinSize() {
        return minSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-minsize
     * 
     */
    @JsonProperty("MinSize")
    public void setMinSize(String minSize) {
        this.minSize = minSize;
    }

    public AutoScalingGroup withMinSize(String minSize) {
        this.minSize = minSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    @JsonProperty("NotificationConfigurations")
    public List<NotificationConfiguration> getNotificationConfigurations() {
        return notificationConfigurations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-notificationconfigurations
     * 
     */
    @JsonProperty("NotificationConfigurations")
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
    @JsonProperty("PlacementGroup")
    public String getPlacementGroup() {
        return placementGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-placementgroup
     * 
     */
    @JsonProperty("PlacementGroup")
    public void setPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
    }

    public AutoScalingGroup withPlacementGroup(String placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
    @JsonProperty("ServiceLinkedRoleARN")
    public String getServiceLinkedRoleARN() {
        return serviceLinkedRoleARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-autoscaling-autoscalinggroup-servicelinkedrolearn
     * 
     */
    @JsonProperty("ServiceLinkedRoleARN")
    public void setServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
    }

    public AutoScalingGroup withServiceLinkedRoleARN(String serviceLinkedRoleARN) {
        this.serviceLinkedRoleARN = serviceLinkedRoleARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags
     * 
     */
    @JsonProperty("Tags")
    public List<TagProperty> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-tags
     * 
     */
    @JsonProperty("Tags")
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
    @JsonProperty("TargetGroupARNs")
    public Set<String> getTargetGroupARNs() {
        return targetGroupARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-targetgrouparns
     * 
     */
    @JsonProperty("TargetGroupARNs")
    public void setTargetGroupARNs(Set<String> targetGroupARNs) {
        this.targetGroupARNs = targetGroupARNs;
    }

    public AutoScalingGroup withTargetGroupARNs(Set<String> targetGroupARNs) {
        this.targetGroupARNs = targetGroupARNs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
    @JsonProperty("TerminationPolicies")
    public Set<String> getTerminationPolicies() {
        return terminationPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-termpolicy
     * 
     */
    @JsonProperty("TerminationPolicies")
    public void setTerminationPolicies(Set<String> terminationPolicies) {
        this.terminationPolicies = terminationPolicies;
    }

    public AutoScalingGroup withTerminationPolicies(Set<String> terminationPolicies) {
        this.terminationPolicies = terminationPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    @JsonProperty("VPCZoneIdentifier")
    public List<String> getVPCZoneIdentifier() {
        return vPCZoneIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-group.html#cfn-as-group-vpczoneidentifier
     * 
     */
    @JsonProperty("VPCZoneIdentifier")
    public void setVPCZoneIdentifier(List<String> vPCZoneIdentifier) {
        this.vPCZoneIdentifier = vPCZoneIdentifier;
    }

    public AutoScalingGroup withVPCZoneIdentifier(List<String> vPCZoneIdentifier) {
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
