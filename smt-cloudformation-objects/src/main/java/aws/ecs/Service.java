
package aws.ecs;

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
 * Service
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Cluster",
    "DeploymentConfiguration",
    "DesiredCount",
    "HealthCheckGracePeriodSeconds",
    "LaunchType",
    "LoadBalancers",
    "NetworkConfiguration",
    "PlacementConstraints",
    "PlacementStrategies",
    "PlatformVersion",
    "Role",
    "SchedulingStrategy",
    "ServiceName",
    "ServiceRegistries",
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
     * DeploymentConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
     * 
     */
    @JsonProperty("DeploymentConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html")
    private DeploymentConfiguration deploymentConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount
     * 
     */
    @JsonProperty("DesiredCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount")
    private Integer desiredCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds
     * 
     */
    @JsonProperty("HealthCheckGracePeriodSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds")
    private Integer healthCheckGracePeriodSeconds;
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
    private Set<LoadBalancer> loadBalancers = new LinkedHashSet<LoadBalancer>();
    /**
     * NetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
     * 
     */
    @JsonProperty("NetworkConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html")
    private NetworkConfiguration networkConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints
     * 
     */
    @JsonProperty("PlacementConstraints")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints")
    private Set<TaskDefinitionPlacementConstraint> placementConstraints = new LinkedHashSet<TaskDefinitionPlacementConstraint>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies
     * 
     */
    @JsonProperty("PlacementStrategies")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies")
    private Set<PlacementStrategy> placementStrategies = new LinkedHashSet<PlacementStrategy>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion
     * 
     */
    @JsonProperty("PlatformVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion")
    private CharSequence platformVersion;
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
    private Set<ServiceRegistry> serviceRegistries = new LinkedHashSet<ServiceRegistry>();
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
    public CharSequence getCluster() {
        return cluster;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-cluster
     * 
     */
    public void setCluster(CharSequence cluster) {
        this.cluster = cluster;
    }

    public Service withCluster(CharSequence cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * DeploymentConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
     * 
     */
    public DeploymentConfiguration getDeploymentConfiguration() {
        return deploymentConfiguration;
    }

    /**
     * DeploymentConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-deploymentconfiguration.html
     * 
     */
    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    public Service withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount
     * 
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-desiredcount
     * 
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    public Service withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds
     * 
     */
    public Integer getHealthCheckGracePeriodSeconds() {
        return healthCheckGracePeriodSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-healthcheckgraceperiodseconds
     * 
     */
    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    public Service withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype
     * 
     */
    public CharSequence getLaunchType() {
        return launchType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-launchtype
     * 
     */
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
    public Set<LoadBalancer> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-loadbalancers
     * 
     */
    public void setLoadBalancers(Set<LoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }

    public Service withLoadBalancers(Set<LoadBalancer> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }

    /**
     * NetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
     * 
     */
    public NetworkConfiguration getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * NetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-service-networkconfiguration.html
     * 
     */
    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    public Service withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints
     * 
     */
    public Set<TaskDefinitionPlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementconstraints
     * 
     */
    public void setPlacementConstraints(Set<TaskDefinitionPlacementConstraint> placementConstraints) {
        this.placementConstraints = placementConstraints;
    }

    public Service withPlacementConstraints(Set<TaskDefinitionPlacementConstraint> placementConstraints) {
        this.placementConstraints = placementConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies
     * 
     */
    public Set<PlacementStrategy> getPlacementStrategies() {
        return placementStrategies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-placementstrategies
     * 
     */
    public void setPlacementStrategies(Set<PlacementStrategy> placementStrategies) {
        this.placementStrategies = placementStrategies;
    }

    public Service withPlacementStrategies(Set<PlacementStrategy> placementStrategies) {
        this.placementStrategies = placementStrategies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion
     * 
     */
    public CharSequence getPlatformVersion() {
        return platformVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-platformversion
     * 
     */
    public void setPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
    }

    public Service withPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role
     * 
     */
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-role
     * 
     */
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
    public CharSequence getSchedulingStrategy() {
        return schedulingStrategy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-schedulingstrategy
     * 
     */
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
    public CharSequence getServiceName() {
        return serviceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-servicename
     * 
     */
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
    public Set<ServiceRegistry> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-serviceregistries
     * 
     */
    public void setServiceRegistries(Set<ServiceRegistry> serviceRegistries) {
        this.serviceRegistries = serviceRegistries;
    }

    public Service withServiceRegistries(Set<ServiceRegistry> serviceRegistries) {
        this.serviceRegistries = serviceRegistries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition
     * 
     */
    public CharSequence getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-service.html#cfn-ecs-service-taskdefinition
     * 
     */
    public void setTaskDefinition(CharSequence taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    public Service withTaskDefinition(CharSequence taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cluster", cluster).append("deploymentConfiguration", deploymentConfiguration).append("desiredCount", desiredCount).append("healthCheckGracePeriodSeconds", healthCheckGracePeriodSeconds).append("launchType", launchType).append("loadBalancers", loadBalancers).append("networkConfiguration", networkConfiguration).append("placementConstraints", placementConstraints).append("placementStrategies", placementStrategies).append("platformVersion", platformVersion).append("role", role).append("schedulingStrategy", schedulingStrategy).append("serviceName", serviceName).append("serviceRegistries", serviceRegistries).append("taskDefinition", taskDefinition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cluster).append(placementConstraints).append(role).append(networkConfiguration).append(desiredCount).append(loadBalancers).append(serviceRegistries).append(serviceName).append(deploymentConfiguration).append(schedulingStrategy).append(platformVersion).append(taskDefinition).append(healthCheckGracePeriodSeconds).append(launchType).append(placementStrategies).toHashCode();
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
        return new EqualsBuilder().append(cluster, rhs.cluster).append(placementConstraints, rhs.placementConstraints).append(role, rhs.role).append(networkConfiguration, rhs.networkConfiguration).append(desiredCount, rhs.desiredCount).append(loadBalancers, rhs.loadBalancers).append(serviceRegistries, rhs.serviceRegistries).append(serviceName, rhs.serviceName).append(deploymentConfiguration, rhs.deploymentConfiguration).append(schedulingStrategy, rhs.schedulingStrategy).append(platformVersion, rhs.platformVersion).append(taskDefinition, rhs.taskDefinition).append(healthCheckGracePeriodSeconds, rhs.healthCheckGracePeriodSeconds).append(launchType, rhs.launchType).append(placementStrategies, rhs.placementStrategies).isEquals();
    }

}
