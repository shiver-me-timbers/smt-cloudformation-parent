
package shiver.me.timbers.aws.ecs;

import java.util.ArrayList;
import java.util.List;
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
 * TaskSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cluster",
    "ExternalId",
    "LaunchType",
    "LoadBalancers",
    "NetworkConfiguration",
    "PlatformVersion",
    "Scale",
    "Service",
    "ServiceRegistries",
    "TaskDefinition"
})
public class TaskSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster
     * 
     */
    @JsonProperty("Cluster")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster")
    private CharSequence cluster;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid
     * 
     */
    @JsonProperty("ExternalId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid")
    private CharSequence externalId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype
     * 
     */
    @JsonProperty("LaunchType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype")
    private CharSequence launchType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers
     * 
     */
    @JsonProperty("LoadBalancers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers")
    private List<Property<TaskSetLoadBalancer>> loadBalancers = new ArrayList<Property<TaskSetLoadBalancer>>();
    /**
     * TaskSetNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html
     * 
     */
    @JsonProperty("NetworkConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html")
    private Property<TaskSetNetworkConfiguration> networkConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion
     * 
     */
    @JsonProperty("PlatformVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion")
    private CharSequence platformVersion;
    /**
     * TaskSetScale
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html
     * 
     */
    @JsonProperty("Scale")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html")
    private Property<TaskSetScale> scale;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service
     * 
     */
    @JsonProperty("Service")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service")
    private CharSequence service;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries
     * 
     */
    @JsonProperty("ServiceRegistries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries")
    private List<Property<TaskSetServiceRegistry>> serviceRegistries = new ArrayList<Property<TaskSetServiceRegistry>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition
     * 
     */
    @JsonProperty("TaskDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition")
    private CharSequence taskDefinition;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster
     * 
     */
    @JsonIgnore
    public CharSequence getCluster() {
        return cluster;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-cluster
     * 
     */
    @JsonIgnore
    public void setCluster(CharSequence cluster) {
        this.cluster = cluster;
    }

    public TaskSet withCluster(CharSequence cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid
     * 
     */
    @JsonIgnore
    public CharSequence getExternalId() {
        return externalId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-externalid
     * 
     */
    @JsonIgnore
    public void setExternalId(CharSequence externalId) {
        this.externalId = externalId;
    }

    public TaskSet withExternalId(CharSequence externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchType() {
        return launchType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-launchtype
     * 
     */
    @JsonIgnore
    public void setLaunchType(CharSequence launchType) {
        this.launchType = launchType;
    }

    public TaskSet withLaunchType(CharSequence launchType) {
        this.launchType = launchType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers
     * 
     */
    @JsonIgnore
    public List<Property<TaskSetLoadBalancer>> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-loadbalancers
     * 
     */
    @JsonIgnore
    public void setLoadBalancers(List<Property<TaskSetLoadBalancer>> loadBalancers) {
        this.loadBalancers = loadBalancers;
    }

    public TaskSet withLoadBalancers(List<Property<TaskSetLoadBalancer>> loadBalancers) {
        this.loadBalancers = loadBalancers;
        return this;
    }

    /**
     * TaskSetNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<TaskSetNetworkConfiguration> getNetworkConfiguration() {
        return networkConfiguration;
    }

    /**
     * TaskSetNetworkConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-networkconfiguration.html
     * 
     */
    @JsonIgnore
    public void setNetworkConfiguration(Property<TaskSetNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    public TaskSet withNetworkConfiguration(Property<TaskSetNetworkConfiguration> networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion
     * 
     */
    @JsonIgnore
    public CharSequence getPlatformVersion() {
        return platformVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-platformversion
     * 
     */
    @JsonIgnore
    public void setPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
    }

    public TaskSet withPlatformVersion(CharSequence platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * TaskSetScale
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html
     * 
     */
    @JsonIgnore
    public Property<TaskSetScale> getScale() {
        return scale;
    }

    /**
     * TaskSetScale
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskset-scale.html
     * 
     */
    @JsonIgnore
    public void setScale(Property<TaskSetScale> scale) {
        this.scale = scale;
    }

    public TaskSet withScale(Property<TaskSetScale> scale) {
        this.scale = scale;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service
     * 
     */
    @JsonIgnore
    public CharSequence getService() {
        return service;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-service
     * 
     */
    @JsonIgnore
    public void setService(CharSequence service) {
        this.service = service;
    }

    public TaskSet withService(CharSequence service) {
        this.service = service;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries
     * 
     */
    @JsonIgnore
    public List<Property<TaskSetServiceRegistry>> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-serviceregistries
     * 
     */
    @JsonIgnore
    public void setServiceRegistries(List<Property<TaskSetServiceRegistry>> serviceRegistries) {
        this.serviceRegistries = serviceRegistries;
    }

    public TaskSet withServiceRegistries(List<Property<TaskSetServiceRegistry>> serviceRegistries) {
        this.serviceRegistries = serviceRegistries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition
     * 
     */
    @JsonIgnore
    public CharSequence getTaskDefinition() {
        return taskDefinition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecs-taskset.html#cfn-ecs-taskset-taskdefinition
     * 
     */
    @JsonIgnore
    public void setTaskDefinition(CharSequence taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    public TaskSet withTaskDefinition(CharSequence taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cluster", cluster).append("externalId", externalId).append("launchType", launchType).append("loadBalancers", loadBalancers).append("networkConfiguration", networkConfiguration).append("platformVersion", platformVersion).append("scale", scale).append("service", service).append("serviceRegistries", serviceRegistries).append("taskDefinition", taskDefinition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cluster).append(networkConfiguration).append(service).append(platformVersion).append(loadBalancers).append(externalId).append(scale).append(serviceRegistries).append(taskDefinition).append(launchType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskSet) == false) {
            return false;
        }
        TaskSet rhs = ((TaskSet) other);
        return new EqualsBuilder().append(cluster, rhs.cluster).append(networkConfiguration, rhs.networkConfiguration).append(service, rhs.service).append(platformVersion, rhs.platformVersion).append(loadBalancers, rhs.loadBalancers).append(externalId, rhs.externalId).append(scale, rhs.scale).append(serviceRegistries, rhs.serviceRegistries).append(taskDefinition, rhs.taskDefinition).append(launchType, rhs.launchType).isEquals();
    }

}
