
package aws.ecs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Service
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cluster",
    "DeploymentConfiguration",
    "DesiredCount",
    "EnableECSManagedTags",
    "HealthCheckGracePeriodSeconds",
    "LaunchType",
    "LoadBalancers",
    "NetworkConfiguration",
    "PlacementConstraints",
    "PlacementStrategies",
    "PlatformVersion",
    "PropagateTags",
    "Role",
    "SchedulingStrategy",
    "ServiceName",
    "ServiceRegistries",
    "Tags",
    "TaskDefinition"
})
public class Service {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster
     * 
     */
    @JsonProperty("Cluster")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster")
    private CharSequence cluster;
    /**
     * ServiceDeploymentConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
     * 
     */
    @JsonProperty("DeploymentConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html")
    private Property<ServiceDeploymentConfiguration> deploymentConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount
     * 
     */
    @JsonProperty("DesiredCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount")
    private Number desiredCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags
     * 
     */
    @JsonProperty("EnableECSManagedTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags")
    private CharSequence enableECSManagedTags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds
     * 
     */
    @JsonProperty("HealthCheckGracePeriodSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds")
    private Number healthCheckGracePeriodSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype
     * 
     */
    @JsonProperty("LaunchType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype")
    private CharSequence launchType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers
     * 
     */
    @JsonProperty("LoadBalancers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers")
    private Set<Property<ServiceLoadBalancer>> loadBalancers = new LinkedHashSet<Property<ServiceLoadBalancer>>();
    /**
     * ServiceNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
     * 
     */
    @JsonProperty("NetworkConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html")
    private Property<ServiceNetworkConfiguration> networkConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints
     * 
     */
    @JsonProperty("PlacementConstraints")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints")
    private Set<Property<ServicePlacementConstraint>> placementConstraints = new LinkedHashSet<Property<ServicePlacementConstraint>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies
     * 
     */
    @JsonProperty("PlacementStrategies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies")
    private Set<Property<ServicePlacementStrategy>> placementStrategies = new LinkedHashSet<Property<ServicePlacementStrategy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion
     * 
     */
    @JsonProperty("PlatformVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion")
    private CharSequence platformVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags
     * 
     */
    @JsonProperty("PropagateTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags")
    private CharSequence propagateTags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy
     * 
     */
    @JsonProperty("SchedulingStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy")
    private CharSequence schedulingStrategy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename
     * 
     */
    @JsonProperty("ServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename")
    private CharSequence serviceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries
     * 
     */
    @JsonProperty("ServiceRegistries")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries")
    private Set<Property<ServiceServiceRegistry>> serviceRegistries = new LinkedHashSet<Property<ServiceServiceRegistry>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition
     * 
     */
    @JsonProperty("TaskDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition")
    private CharSequence taskDefinition;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster
     * 
     */
    @JsonIgnore
    public CharSequence getCluster() {
        return cluster;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster
     * 
     */
    @JsonIgnore
    public void setCluster(CharSequence cluster) {
        this.cluster = cluster;
    }

    public Service withCluster(CharSequence cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * ServiceDeploymentConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ServiceDeploymentConfiguration> getDeploymentConfiguration() {
        return deploymentConfiguration;
    }

    /**
     * ServiceDeploymentConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
     * 
     */
    @JsonIgnore
    public void setDeploymentConfiguration(Property<ServiceDeploymentConfiguration> deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    public Service withDeploymentConfiguration(Property<ServiceDeploymentConfiguration> deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount
     * 
     */
    @JsonIgnore
    public Number getDesiredCount() {
        return desiredCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount
     * 
     */
    @JsonIgnore
    public void setDesiredCount(Number desiredCount) {
        this.desiredCount = desiredCount;
    }

    public Service withDesiredCount(Number desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags
     * 
     */
    @JsonIgnore
    public CharSequence getEnableECSManagedTags() {
        return enableECSManagedTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-enableecsmanagedtags
     * 
     */
    @JsonIgnore
    public void setEnableECSManagedTags(CharSequence enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
    }

    public Service withEnableECSManagedTags(CharSequence enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds
     * 
     */
    @JsonIgnore
    public Number getHealthCheckGracePeriodSeconds() {
        return healthCheckGracePeriodSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds
     * 
     */
    @JsonIgnore
    public void setHealthCheckGracePeriodSeconds(Number healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    public Service withHealthCheckGracePeriodSeconds(Number healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchType() {
        return launchType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype
     * 
     */
    @JsonIgnore
    public void setLaunchType(CharSequence launchType) {
        this.launchType = launchType;
    }

    public Service withLaunchType(CharSequence launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers
     * 
     */
    @JsonIgnore
    public Set<Property<ServiceLoadBalancer>> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers
     * 
     */
    @JsonIgnore
    public void setLoadBalancers(Set<Property<ServiceLoadBalancer>> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }

    public Service withLoadBalancers(Set<Property<ServiceLoadBalancer>> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }

    /**
     * ServiceNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<ServiceNetworkConfiguration> getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * ServiceNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNetworkConfiguration(Property<ServiceNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    public Service withNetworkConfiguration(Property<ServiceNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints
     * 
     */
    @JsonIgnore
    public Set<Property<ServicePlacementConstraint>> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints
     * 
     */
    @JsonIgnore
    public void setPlacementConstraints(Set<Property<ServicePlacementConstraint>> placementConstraints) {
        this.placementConstraints = placementConstraints;
    }

    public Service withPlacementConstraints(Set<Property<ServicePlacementConstraint>> placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies
     * 
     */
    @JsonIgnore
    public Set<Property<ServicePlacementStrategy>> getPlacementStrategies() {
        return placementStrategies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies
     * 
     */
    @JsonIgnore
    public void setPlacementStrategies(Set<Property<ServicePlacementStrategy>> placementStrategies) {
        this.placementStrategies = placementStrategies;
    }

    public Service withPlacementStrategies(Set<Property<ServicePlacementStrategy>> placementStrategies) {
        this.placementStrategies = placementStrategies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion
     * 
     */
    @JsonIgnore
    public CharSequence getPlatformVersion() {
        return platformVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion
     * 
     */
    @JsonIgnore
    public void setPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
    }

    public Service withPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags
     * 
     */
    @JsonIgnore
    public CharSequence getPropagateTags() {
        return propagateTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-propagatetags
     * 
     */
    @JsonIgnore
    public void setPropagateTags(CharSequence propagateTags) {
        this.propagateTags = propagateTags;
    }

    public Service withPropagateTags(CharSequence propagateTags) {
        this.propagateTags = propagateTags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role
     * 
     */
    @JsonIgnore
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role
     * 
     */
    @JsonIgnore
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public Service withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy
     * 
     */
    @JsonIgnore
    public CharSequence getSchedulingStrategy() {
        return schedulingStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy
     * 
     */
    @JsonIgnore
    public void setSchedulingStrategy(CharSequence schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    public Service withSchedulingStrategy(CharSequence schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename
     * 
     */
    @JsonIgnore
    public CharSequence getServiceName() {
        return serviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename
     * 
     */
    @JsonIgnore
    public void setServiceName(CharSequence serviceName) {
        this.serviceName = serviceName;
    }

    public Service withServiceName(CharSequence serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries
     * 
     */
    @JsonIgnore
    public Set<Property<ServiceServiceRegistry>> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries
     * 
     */
    @JsonIgnore
    public void setServiceRegistries(Set<Property<ServiceServiceRegistry>> serviceRegistries) {
        this.serviceRegistries = serviceRegistries;
    }

    public Service withServiceRegistries(Set<Property<ServiceServiceRegistry>> serviceRegistries) {
        this.serviceRegistries = serviceRegistries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Service withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition
     * 
     */
    @JsonIgnore
    public CharSequence getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition
     * 
     */
    @JsonIgnore
    public void setTaskDefinition(CharSequence taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    public Service withTaskDefinition(CharSequence taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cluster", cluster).append("deploymentConfiguration", deploymentConfiguration).append("desiredCount", desiredCount).append("enableECSManagedTags", enableECSManagedTags).append("healthCheckGracePeriodSeconds", healthCheckGracePeriodSeconds).append("launchType", launchType).append("loadBalancers", loadBalancers).append("networkConfiguration", networkConfiguration).append("placementConstraints", placementConstraints).append("placementStrategies", placementStrategies).append("platformVersion", platformVersion).append("propagateTags", propagateTags).append("role", role).append("schedulingStrategy", schedulingStrategy).append("serviceName", serviceName).append("serviceRegistries", serviceRegistries).append("tags", tags).append("taskDefinition", taskDefinition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cluster).append(placementConstraints).append(role).append(propagateTags).append(networkConfiguration).append(desiredCount).append(loadBalancers).append(serviceRegistries).append(serviceName).append(tags).append(deploymentConfiguration).append(schedulingStrategy).append(platformVersion).append(enableECSManagedTags).append(taskDefinition).append(healthCheckGracePeriodSeconds).append(launchType).append(placementStrategies).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return new EqualsBuilder().append(cluster, rhs.cluster).append(placementConstraints, rhs.placementConstraints).append(role, rhs.role).append(propagateTags, rhs.propagateTags).append(networkConfiguration, rhs.networkConfiguration).append(desiredCount, rhs.desiredCount).append(loadBalancers, rhs.loadBalancers).append(serviceRegistries, rhs.serviceRegistries).append(serviceName, rhs.serviceName).append(tags, rhs.tags).append(deploymentConfiguration, rhs.deploymentConfiguration).append(schedulingStrategy, rhs.schedulingStrategy).append(platformVersion, rhs.platformVersion).append(enableECSManagedTags, rhs.enableECSManagedTags).append(taskDefinition, rhs.taskDefinition).append(healthCheckGracePeriodSeconds, rhs.healthCheckGracePeriodSeconds).append(launchType, rhs.launchType).append(placementStrategies, rhs.placementStrategies).isEquals();
    }

}
