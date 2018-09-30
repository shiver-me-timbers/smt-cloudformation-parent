
package aws.ecs;

import java.util.LinkedHashSet;
import java.util.Map;
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
 * ContainerDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
public class ContainerDefinition {

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
    private Set<KeyValuePair> environment = new LinkedHashSet<KeyValuePair>();
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
    private Set<HostEntry> extraHosts = new LinkedHashSet<HostEntry>();
    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
     * 
     */
    @JsonProperty("HealthCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html")
    private HealthCheck healthCheck;
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
     * LinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
     * 
     */
    @JsonProperty("LinuxParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html")
    private LinuxParameters linuxParameters;
    /**
     * LogConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
     * 
     */
    @JsonProperty("LogConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html")
    private LogConfiguration logConfiguration;
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
    private Set<MountPoint> mountPoints = new LinkedHashSet<MountPoint>();
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
    private Set<PortMapping> portMappings = new LinkedHashSet<PortMapping>();
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
     * RepositoryCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
     * 
     */
    @JsonProperty("RepositoryCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html")
    private RepositoryCredentials repositoryCredentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits
     * 
     */
    @JsonProperty("Ulimits")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits")
    private Set<Ulimit> ulimits = new LinkedHashSet<Ulimit>();
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
    private Set<VolumeFrom> volumesFrom = new LinkedHashSet<VolumeFrom>();
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
    public Set<CharSequence> getCommand() {
        return command;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-command
     * 
     */
    public void setCommand(Set<CharSequence> command) {
        this.command = command;
    }

    public ContainerDefinition withCommand(Set<CharSequence> command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu
     * 
     */
    public Integer getCpu() {
        return cpu;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-cpu
     * 
     */
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public ContainerDefinition withCpu(Integer cpu) {
        this.cpu = cpu;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking
     * 
     */
    public Boolean getDisableNetworking() {
        return disableNetworking;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-disablenetworking
     * 
     */
    public void setDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
    }

    public ContainerDefinition withDisableNetworking(Boolean disableNetworking) {
        this.disableNetworking = disableNetworking;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains
     * 
     */
    public Set<CharSequence> getDnsSearchDomains() {
        return dnsSearchDomains;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnssearchdomains
     * 
     */
    public void setDnsSearchDomains(Set<CharSequence> dnsSearchDomains) {
        this.dnsSearchDomains = dnsSearchDomains;
    }

    public ContainerDefinition withDnsSearchDomains(Set<CharSequence> dnsSearchDomains) {
        this.dnsSearchDomains = dnsSearchDomains;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers
     * 
     */
    public Set<CharSequence> getDnsServers() {
        return dnsServers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dnsservers
     * 
     */
    public void setDnsServers(Set<CharSequence> dnsServers) {
        this.dnsServers = dnsServers;
    }

    public ContainerDefinition withDnsServers(Set<CharSequence> dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels
     * 
     */
    public Map<String, String> getDockerLabels() {
        return dockerLabels;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockerlabels
     * 
     */
    public void setDockerLabels(Map<String, String> dockerLabels) {
        this.dockerLabels = dockerLabels;
    }

    public ContainerDefinition withDockerLabels(Map<String, String> dockerLabels) {
        this.dockerLabels = dockerLabels;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions
     * 
     */
    public Set<CharSequence> getDockerSecurityOptions() {
        return dockerSecurityOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-dockersecurityoptions
     * 
     */
    public void setDockerSecurityOptions(Set<CharSequence> dockerSecurityOptions) {
        this.dockerSecurityOptions = dockerSecurityOptions;
    }

    public ContainerDefinition withDockerSecurityOptions(Set<CharSequence> dockerSecurityOptions) {
        this.dockerSecurityOptions = dockerSecurityOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint
     * 
     */
    public Set<CharSequence> getEntryPoint() {
        return entryPoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-entrypoint
     * 
     */
    public void setEntryPoint(Set<CharSequence> entryPoint) {
        this.entryPoint = entryPoint;
    }

    public ContainerDefinition withEntryPoint(Set<CharSequence> entryPoint) {
        this.entryPoint = entryPoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment
     * 
     */
    public Set<KeyValuePair> getEnvironment() {
        return environment;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-environment
     * 
     */
    public void setEnvironment(Set<KeyValuePair> environment) {
        this.environment = environment;
    }

    public ContainerDefinition withEnvironment(Set<KeyValuePair> environment) {
        this.environment = environment;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential
     * 
     */
    public Boolean getEssential() {
        return essential;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-essential
     * 
     */
    public void setEssential(Boolean essential) {
        this.essential = essential;
    }

    public ContainerDefinition withEssential(Boolean essential) {
        this.essential = essential;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts
     * 
     */
    public Set<HostEntry> getExtraHosts() {
        return extraHosts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-extrahosts
     * 
     */
    public void setExtraHosts(Set<HostEntry> extraHosts) {
        this.extraHosts = extraHosts;
    }

    public ContainerDefinition withExtraHosts(Set<HostEntry> extraHosts) {
        this.extraHosts = extraHosts;
        return this;
    }

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
     * 
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }

    /**
     * HealthCheck
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-healthcheck.html
     * 
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }

    public ContainerDefinition withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname
     * 
     */
    public CharSequence getHostname() {
        return hostname;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-hostname
     * 
     */
    public void setHostname(CharSequence hostname) {
        this.hostname = hostname;
    }

    public ContainerDefinition withHostname(CharSequence hostname) {
        this.hostname = hostname;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image
     * 
     */
    public CharSequence getImage() {
        return image;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-image
     * 
     */
    public void setImage(CharSequence image) {
        this.image = image;
    }

    public ContainerDefinition withImage(CharSequence image) {
        this.image = image;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links
     * 
     */
    public Set<CharSequence> getLinks() {
        return links;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-links
     * 
     */
    public void setLinks(Set<CharSequence> links) {
        this.links = links;
    }

    public ContainerDefinition withLinks(Set<CharSequence> links) {
        this.links = links;
        return this;
    }

    /**
     * LinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
     * 
     */
    public LinuxParameters getLinuxParameters() {
        return linuxParameters;
    }

    /**
     * LinuxParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-linuxparameters.html
     * 
     */
    public void setLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
    }

    public ContainerDefinition withLinuxParameters(LinuxParameters linuxParameters) {
        this.linuxParameters = linuxParameters;
        return this;
    }

    /**
     * LogConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
     * 
     */
    public LogConfiguration getLogConfiguration() {
        return logConfiguration;
    }

    /**
     * LogConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions-logconfiguration.html
     * 
     */
    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    public ContainerDefinition withLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory
     * 
     */
    public Integer getMemory() {
        return memory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memory
     * 
     */
    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    public ContainerDefinition withMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation
     * 
     */
    public Integer getMemoryReservation() {
        return memoryReservation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-memoryreservation
     * 
     */
    public void setMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
    }

    public ContainerDefinition withMemoryReservation(Integer memoryReservation) {
        this.memoryReservation = memoryReservation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints
     * 
     */
    public Set<MountPoint> getMountPoints() {
        return mountPoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-mountpoints
     * 
     */
    public void setMountPoints(Set<MountPoint> mountPoints) {
        this.mountPoints = mountPoints;
    }

    public ContainerDefinition withMountPoints(Set<MountPoint> mountPoints) {
        this.mountPoints = mountPoints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ContainerDefinition withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings
     * 
     */
    public Set<PortMapping> getPortMappings() {
        return portMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-portmappings
     * 
     */
    public void setPortMappings(Set<PortMapping> portMappings) {
        this.portMappings = portMappings;
    }

    public ContainerDefinition withPortMappings(Set<PortMapping> portMappings) {
        this.portMappings = portMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged
     * 
     */
    public Boolean getPrivileged() {
        return privileged;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-privileged
     * 
     */
    public void setPrivileged(Boolean privileged) {
        this.privileged = privileged;
    }

    public ContainerDefinition withPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem
     * 
     */
    public Boolean getReadonlyRootFilesystem() {
        return readonlyRootFilesystem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-readonlyrootfilesystem
     * 
     */
    public void setReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
    }

    public ContainerDefinition withReadonlyRootFilesystem(Boolean readonlyRootFilesystem) {
        this.readonlyRootFilesystem = readonlyRootFilesystem;
        return this;
    }

    /**
     * RepositoryCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
     * 
     */
    public RepositoryCredentials getRepositoryCredentials() {
        return repositoryCredentials;
    }

    /**
     * RepositoryCredentials
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-repositorycredentials.html
     * 
     */
    public void setRepositoryCredentials(RepositoryCredentials repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
    }

    public ContainerDefinition withRepositoryCredentials(RepositoryCredentials repositoryCredentials) {
        this.repositoryCredentials = repositoryCredentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits
     * 
     */
    public Set<Ulimit> getUlimits() {
        return ulimits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-ulimits
     * 
     */
    public void setUlimits(Set<Ulimit> ulimits) {
        this.ulimits = ulimits;
    }

    public ContainerDefinition withUlimits(Set<Ulimit> ulimits) {
        this.ulimits = ulimits;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user
     * 
     */
    public CharSequence getUser() {
        return user;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-user
     * 
     */
    public void setUser(CharSequence user) {
        this.user = user;
    }

    public ContainerDefinition withUser(CharSequence user) {
        this.user = user;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom
     * 
     */
    public Set<VolumeFrom> getVolumesFrom() {
        return volumesFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-volumesfrom
     * 
     */
    public void setVolumesFrom(Set<VolumeFrom> volumesFrom) {
        this.volumesFrom = volumesFrom;
    }

    public ContainerDefinition withVolumesFrom(Set<VolumeFrom> volumesFrom) {
        this.volumesFrom = volumesFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory
     * 
     */
    public CharSequence getWorkingDirectory() {
        return workingDirectory;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-containerdefinitions.html#cfn-ecs-taskdefinition-containerdefinition-workingdirectory
     * 
     */
    public void setWorkingDirectory(CharSequence workingDirectory) {
        this.workingDirectory = workingDirectory;
    }

    public ContainerDefinition withWorkingDirectory(CharSequence workingDirectory) {
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
        if ((other instanceof ContainerDefinition) == false) {
            return false;
        }
        ContainerDefinition rhs = ((ContainerDefinition) other);
        return new EqualsBuilder().append(volumesFrom, rhs.volumesFrom).append(memory, rhs.memory).append(workingDirectory, rhs.workingDirectory).append(memoryReservation, rhs.memoryReservation).append(portMappings, rhs.portMappings).append(disableNetworking, rhs.disableNetworking).append(hostname, rhs.hostname).append(readonlyRootFilesystem, rhs.readonlyRootFilesystem).append(extraHosts, rhs.extraHosts).append(dockerSecurityOptions, rhs.dockerSecurityOptions).append(links, rhs.links).append(dnsServers, rhs.dnsServers).append(linuxParameters, rhs.linuxParameters).append(dockerLabels, rhs.dockerLabels).append(image, rhs.image).append(cpu, rhs.cpu).append(logConfiguration, rhs.logConfiguration).append(command, rhs.command).append(privileged, rhs.privileged).append(environment, rhs.environment).append(ulimits, rhs.ulimits).append(healthCheck, rhs.healthCheck).append(mountPoints, rhs.mountPoints).append(name, rhs.name).append(entryPoint, rhs.entryPoint).append(repositoryCredentials, rhs.repositoryCredentials).append(user, rhs.user).append(dnsSearchDomains, rhs.dnsSearchDomains).append(essential, rhs.essential).isEquals();
    }

}
