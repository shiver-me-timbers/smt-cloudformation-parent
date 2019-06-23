
package aws.ecs;

import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import aws.Property;
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
 * TaskDefinitionContainerDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Command",
    "Cpu",
    "DisableNetworking",
    "DnsSearchDomains",
    "DnsServers",
    "DockerLabels",
    "DockerSecurityOptions",
    "EntryPoint",
    "Environment",
    "Essential",
    "ExtraHosts",
    "HealthCheck",
    "Hostname",
    "Image",
    "Links",
    "LinuxParameters",
    "LogConfiguration",
    "Memory",
    "MemoryReservation",
    "MountPoints",
    "Name",
    "PortMappings",
    "Privileged",
    "ReadonlyRootFilesystem",
    "RepositoryCredentials",
    "Ulimits",
    "User",
    "VolumesFrom",
    "WorkingDirectory"
})
public class TaskDefinitionContainerDefinition implements Property<TaskDefinitionContainerDefinition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command
     * 
     */
    @JsonProperty("Command")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command")
    private Set<CharSequence> command = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu
     * 
     */
    @JsonProperty("Cpu")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu")
    private Integer cpu;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking
     * 
     */
    @JsonProperty("DisableNetworking")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking")
    private Boolean disableNetworking;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains
     * 
     */
    @JsonProperty("DnsSearchDomains")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains")
    private Set<CharSequence> dnsSearchDomains = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers
     * 
     */
    @JsonProperty("DnsServers")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers")
    private Set<CharSequence> dnsServers = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels
     * 
     */
    @JsonProperty("DockerLabels")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels")
    private Map<String, String> dockerLabels;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions
     * 
     */
    @JsonProperty("DockerSecurityOptions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions")
    private Set<CharSequence> dockerSecurityOptions = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint
     * 
     */
    @JsonProperty("EntryPoint")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint")
    private Set<CharSequence> entryPoint = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment
     * 
     */
    @JsonProperty("Environment")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment")
    private Set<Property<TaskDefinitionKeyValuePair>> environment = new LinkedHashSet<Property<TaskDefinitionKeyValuePair>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential
     * 
     */
    @JsonProperty("Essential")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential")
    private Boolean essential;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts
     * 
     */
    @JsonProperty("ExtraHosts")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts")
    private Set<Property<TaskDefinitionHostEntry>> extraHosts = new LinkedHashSet<Property<TaskDefinitionHostEntry>>();
    /**
     * TaskDefinitionHealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
     * 
     */
    @JsonProperty("HealthCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html")
    private Property<TaskDefinitionHealthCheck> healthCheck;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname
     * 
     */
    @JsonProperty("Hostname")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname")
    private CharSequence hostname;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image
     * 
     */
    @JsonProperty("Image")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image")
    private CharSequence image;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links
     * 
     */
    @JsonProperty("Links")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links")
    private Set<CharSequence> links = new LinkedHashSet<CharSequence>();
    /**
     * TaskDefinitionLinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
     * 
     */
    @JsonProperty("LinuxParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html")
    private Property<TaskDefinitionLinuxParameters> linuxParameters;
    /**
     * TaskDefinitionLogConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
     * 
     */
    @JsonProperty("LogConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html")
    private Property<TaskDefinitionLogConfiguration> logConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory
     * 
     */
    @JsonProperty("Memory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory")
    private Integer memory;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation
     * 
     */
    @JsonProperty("MemoryReservation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation")
    private Integer memoryReservation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints
     * 
     */
    @JsonProperty("MountPoints")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints")
    private Set<Property<TaskDefinitionMountPoint>> mountPoints = new LinkedHashSet<Property<TaskDefinitionMountPoint>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings
     * 
     */
    @JsonProperty("PortMappings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings")
    private Set<Property<TaskDefinitionPortMapping>> portMappings = new LinkedHashSet<Property<TaskDefinitionPortMapping>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged
     * 
     */
    @JsonProperty("Privileged")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged")
    private Boolean privileged;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem
     * 
     */
    @JsonProperty("ReadonlyRootFilesystem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem")
    private Boolean readonlyRootFilesystem;
    /**
     * TaskDefinitionRepositoryCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
     * 
     */
    @JsonProperty("RepositoryCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html")
    private Property<TaskDefinitionRepositoryCredentials> repositoryCredentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits
     * 
     */
    @JsonProperty("Ulimits")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits")
    private Set<Property<TaskDefinitionUlimit>> ulimits = new LinkedHashSet<Property<TaskDefinitionUlimit>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user
     * 
     */
    @JsonProperty("User")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user")
    private CharSequence user;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom
     * 
     */
    @JsonProperty("VolumesFrom")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom")
    private Set<Property<TaskDefinitionVolumeFrom>> volumesFrom = new LinkedHashSet<Property<TaskDefinitionVolumeFrom>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory
     * 
     */
    @JsonProperty("WorkingDirectory")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory")
    private CharSequence workingDirectory;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getCommand() {
        return command;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command
     * 
     */
    @JsonIgnore
    public void setCommand(Set<CharSequence> command) {
        this.command = command;
    }

    public TaskDefinitionContainerDefinition withCommand(Set<CharSequence> command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu
     * 
     */
    @JsonIgnore
    public Integer getCpu() {
        return cpu;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu
     * 
     */
    @JsonIgnore
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public TaskDefinitionContainerDefinition withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking
     * 
     */
    @JsonIgnore
    public Boolean getDisableNetworking() {
        return disableNetworking;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking
     * 
     */
    @JsonIgnore
    public void setDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
    }

    public TaskDefinitionContainerDefinition withDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getDnsSearchDomains() {
        return dnsSearchDomains;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains
     * 
     */
    @JsonIgnore
    public void setDnsSearchDomains(Set<CharSequence> dnsSearchDomains) {
        this.dnsSearchDomains = dnsSearchDomains;
    }

    public TaskDefinitionContainerDefinition withDnsSearchDomains(Set<CharSequence> dnsSearchDomains) {
        this.dnsSearchDomains = dnsSearchDomains;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getDnsServers() {
        return dnsServers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers
     * 
     */
    @JsonIgnore
    public void setDnsServers(Set<CharSequence> dnsServers) {
        this.dnsServers = dnsServers;
    }

    public TaskDefinitionContainerDefinition withDnsServers(Set<CharSequence> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels
     * 
     */
    @JsonIgnore
    public Map<String, String> getDockerLabels() {
        return dockerLabels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels
     * 
     */
    @JsonIgnore
    public void setDockerLabels(Map<String, String> dockerLabels) {
        this.dockerLabels = dockerLabels;
    }

    public TaskDefinitionContainerDefinition withDockerLabels(Map<String, String> dockerLabels) {
        this.dockerLabels = dockerLabels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getDockerSecurityOptions() {
        return dockerSecurityOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions
     * 
     */
    @JsonIgnore
    public void setDockerSecurityOptions(Set<CharSequence> dockerSecurityOptions) {
        this.dockerSecurityOptions = dockerSecurityOptions;
    }

    public TaskDefinitionContainerDefinition withDockerSecurityOptions(Set<CharSequence> dockerSecurityOptions) {
        this.dockerSecurityOptions = dockerSecurityOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getEntryPoint() {
        return entryPoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint
     * 
     */
    @JsonIgnore
    public void setEntryPoint(Set<CharSequence> entryPoint) {
        this.entryPoint = entryPoint;
    }

    public TaskDefinitionContainerDefinition withEntryPoint(Set<CharSequence> entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionKeyValuePair>> getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment
     * 
     */
    @JsonIgnore
    public void setEnvironment(Set<Property<TaskDefinitionKeyValuePair>> environment) {
        this.environment = environment;
    }

    public TaskDefinitionContainerDefinition withEnvironment(Set<Property<TaskDefinitionKeyValuePair>> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential
     * 
     */
    @JsonIgnore
    public Boolean getEssential() {
        return essential;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential
     * 
     */
    @JsonIgnore
    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    public TaskDefinitionContainerDefinition withEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionHostEntry>> getExtraHosts() {
        return extraHosts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts
     * 
     */
    @JsonIgnore
    public void setExtraHosts(Set<Property<TaskDefinitionHostEntry>> extraHosts) {
        this.extraHosts = extraHosts;
    }

    public TaskDefinitionContainerDefinition withExtraHosts(Set<Property<TaskDefinitionHostEntry>> extraHosts) {
        this.extraHosts = extraHosts;
        return this;
    }

    /**
     * TaskDefinitionHealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionHealthCheck> getHealthCheck() {
        return healthCheck;
    }

    /**
     * TaskDefinitionHealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
     * 
     */
    @JsonIgnore
    public void setHealthCheck(Property<TaskDefinitionHealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
    }

    public TaskDefinitionContainerDefinition withHealthCheck(Property<TaskDefinitionHealthCheck> healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname
     * 
     */
    @JsonIgnore
    public CharSequence getHostname() {
        return hostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname
     * 
     */
    @JsonIgnore
    public void setHostname(CharSequence hostname) {
        this.hostname = hostname;
    }

    public TaskDefinitionContainerDefinition withHostname(CharSequence hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image
     * 
     */
    @JsonIgnore
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image
     * 
     */
    @JsonIgnore
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public TaskDefinitionContainerDefinition withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getLinks() {
        return links;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links
     * 
     */
    @JsonIgnore
    public void setLinks(Set<CharSequence> links) {
        this.links = links;
    }

    public TaskDefinitionContainerDefinition withLinks(Set<CharSequence> links) {
        this.links = links;
        return this;
    }

    /**
     * TaskDefinitionLinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionLinuxParameters> getLinuxParameters() {
        return linuxParameters;
    }

    /**
     * TaskDefinitionLinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
     * 
     */
    @JsonIgnore
    public void setLinuxParameters(Property<TaskDefinitionLinuxParameters> linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    public TaskDefinitionContainerDefinition withLinuxParameters(Property<TaskDefinitionLinuxParameters> linuxParameters) {
        this.linuxParameters = linuxParameters;
        return this;
    }

    /**
     * TaskDefinitionLogConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionLogConfiguration> getLogConfiguration() {
        return logConfiguration;
    }

    /**
     * TaskDefinitionLogConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
     * 
     */
    @JsonIgnore
    public void setLogConfiguration(Property<TaskDefinitionLogConfiguration> logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    public TaskDefinitionContainerDefinition withLogConfiguration(Property<TaskDefinitionLogConfiguration> logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory
     * 
     */
    @JsonIgnore
    public Integer getMemory() {
        return memory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory
     * 
     */
    @JsonIgnore
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public TaskDefinitionContainerDefinition withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation
     * 
     */
    @JsonIgnore
    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation
     * 
     */
    @JsonIgnore
    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public TaskDefinitionContainerDefinition withMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionMountPoint>> getMountPoints() {
        return mountPoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints
     * 
     */
    @JsonIgnore
    public void setMountPoints(Set<Property<TaskDefinitionMountPoint>> mountPoints) {
        this.mountPoints = mountPoints;
    }

    public TaskDefinitionContainerDefinition withMountPoints(Set<Property<TaskDefinitionMountPoint>> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public TaskDefinitionContainerDefinition withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionPortMapping>> getPortMappings() {
        return portMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings
     * 
     */
    @JsonIgnore
    public void setPortMappings(Set<Property<TaskDefinitionPortMapping>> portMappings) {
        this.portMappings = portMappings;
    }

    public TaskDefinitionContainerDefinition withPortMappings(Set<Property<TaskDefinitionPortMapping>> portMappings) {
        this.portMappings = portMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged
     * 
     */
    @JsonIgnore
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged
     * 
     */
    @JsonIgnore
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public TaskDefinitionContainerDefinition withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem
     * 
     */
    @JsonIgnore
    public Boolean getReadonlyRootFilesystem() {
        return readonlyRootFilesystem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem
     * 
     */
    @JsonIgnore
    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    public TaskDefinitionContainerDefinition withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
        return this;
    }

    /**
     * TaskDefinitionRepositoryCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
     * 
     */
    @JsonIgnore
    public Property<TaskDefinitionRepositoryCredentials> getRepositoryCredentials() {
        return repositoryCredentials;
    }

    /**
     * TaskDefinitionRepositoryCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
     * 
     */
    @JsonIgnore
    public void setRepositoryCredentials(Property<TaskDefinitionRepositoryCredentials> repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
    }

    public TaskDefinitionContainerDefinition withRepositoryCredentials(Property<TaskDefinitionRepositoryCredentials> repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionUlimit>> getUlimits() {
        return ulimits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits
     * 
     */
    @JsonIgnore
    public void setUlimits(Set<Property<TaskDefinitionUlimit>> ulimits) {
        this.ulimits = ulimits;
    }

    public TaskDefinitionContainerDefinition withUlimits(Set<Property<TaskDefinitionUlimit>> ulimits) {
        this.ulimits = ulimits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user
     * 
     */
    @JsonIgnore
    public CharSequence getUser() {
        return user;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user
     * 
     */
    @JsonIgnore
    public void setUser(CharSequence user) {
        this.user = user;
    }

    public TaskDefinitionContainerDefinition withUser(CharSequence user) {
        this.user = user;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom
     * 
     */
    @JsonIgnore
    public Set<Property<TaskDefinitionVolumeFrom>> getVolumesFrom() {
        return volumesFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom
     * 
     */
    @JsonIgnore
    public void setVolumesFrom(Set<Property<TaskDefinitionVolumeFrom>> volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    public TaskDefinitionContainerDefinition withVolumesFrom(Set<Property<TaskDefinitionVolumeFrom>> volumesFrom) {
        this.volumesFrom = volumesFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory
     * 
     */
    @JsonIgnore
    public CharSequence getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory
     * 
     */
    @JsonIgnore
    public void setWorkingDirectory(CharSequence workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public TaskDefinitionContainerDefinition withWorkingDirectory(CharSequence workingDirectory) {
        this.workingDirectory = workingDirectory;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("command", command).append("cpu", cpu).append("disableNetworking", disableNetworking).append("dnsSearchDomains", dnsSearchDomains).append("dnsServers", dnsServers).append("dockerLabels", dockerLabels).append("dockerSecurityOptions", dockerSecurityOptions).append("entryPoint", entryPoint).append("environment", environment).append("essential", essential).append("extraHosts", extraHosts).append("healthCheck", healthCheck).append("hostname", hostname).append("image", image).append("links", links).append("linuxParameters", linuxParameters).append("logConfiguration", logConfiguration).append("memory", memory).append("memoryReservation", memoryReservation).append("mountPoints", mountPoints).append("name", name).append("portMappings", portMappings).append("privileged", privileged).append("readonlyRootFilesystem", readonlyRootFilesystem).append("repositoryCredentials", repositoryCredentials).append("ulimits", ulimits).append("user", user).append("volumesFrom", volumesFrom).append("workingDirectory", workingDirectory).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumesFrom).append(memory).append(workingDirectory).append(memoryReservation).append(portMappings).append(disableNetworking).append(hostname).append(readonlyRootFilesystem).append(extraHosts).append(dockerSecurityOptions).append(links).append(dnsServers).append(linuxParameters).append(dockerLabels).append(image).append(cpu).append(logConfiguration).append(command).append(privileged).append(environment).append(ulimits).append(healthCheck).append(mountPoints).append(name).append(entryPoint).append(repositoryCredentials).append(user).append(dnsSearchDomains).append(essential).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TaskDefinitionContainerDefinition) == false) {
            return false;
        }
        TaskDefinitionContainerDefinition rhs = ((TaskDefinitionContainerDefinition) other);
        return new EqualsBuilder().append(volumesFrom, rhs.volumesFrom).append(memory, rhs.memory).append(workingDirectory, rhs.workingDirectory).append(memoryReservation, rhs.memoryReservation).append(portMappings, rhs.portMappings).append(disableNetworking, rhs.disableNetworking).append(hostname, rhs.hostname).append(readonlyRootFilesystem, rhs.readonlyRootFilesystem).append(extraHosts, rhs.extraHosts).append(dockerSecurityOptions, rhs.dockerSecurityOptions).append(links, rhs.links).append(dnsServers, rhs.dnsServers).append(linuxParameters, rhs.linuxParameters).append(dockerLabels, rhs.dockerLabels).append(image, rhs.image).append(cpu, rhs.cpu).append(logConfiguration, rhs.logConfiguration).append(command, rhs.command).append(privileged, rhs.privileged).append(environment, rhs.environment).append(ulimits, rhs.ulimits).append(healthCheck, rhs.healthCheck).append(mountPoints, rhs.mountPoints).append(name, rhs.name).append(entryPoint, rhs.entryPoint).append(repositoryCredentials, rhs.repositoryCredentials).append(user, rhs.user).append(dnsSearchDomains, rhs.dnsSearchDomains).append(essential, rhs.essential).isEquals();
    }

}
