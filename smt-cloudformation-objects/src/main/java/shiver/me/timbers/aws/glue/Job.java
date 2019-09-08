
package shiver.me.timbers.aws.glue;

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
 * Job
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Connections",
    "MaxRetries",
    "Description",
    "AllocatedCapacity",
    "Name",
    "Role",
    "DefaultArguments",
    "WorkerType",
    "LogUri",
    "Command",
    "GlueVersion",
    "ExecutionProperty",
    "SecurityConfiguration",
    "NumberOfWorkers",
    "Tags",
    "MaxCapacity"
})
public class Job {

    /**
     * JobConnectionsList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
     * 
     */
    @JsonProperty("Connections")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html")
    private Property<JobConnectionsList> connections;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries
     * 
     */
    @JsonProperty("MaxRetries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries")
    private Number maxRetries;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity
     * 
     */
    @JsonProperty("AllocatedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity")
    private Number allocatedCapacity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role
     * 
     */
    @JsonProperty("Role")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role")
    private CharSequence role;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments
     * 
     */
    @JsonProperty("DefaultArguments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments")
    private Object defaultArguments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype
     * 
     */
    @JsonProperty("WorkerType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype")
    private CharSequence workerType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri
     * 
     */
    @JsonProperty("LogUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri")
    private CharSequence logUri;
    /**
     * JobJobCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
     * 
     */
    @JsonProperty("Command")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html")
    private Property<JobJobCommand> command;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion
     * 
     */
    @JsonProperty("GlueVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion")
    private CharSequence glueVersion;
    /**
     * JobExecutionProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
     * 
     */
    @JsonProperty("ExecutionProperty")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html")
    private Property<JobExecutionProperty> executionProperty;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration")
    private CharSequence securityConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers
     * 
     */
    @JsonProperty("NumberOfWorkers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers")
    private Number numberOfWorkers;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity
     * 
     */
    @JsonProperty("MaxCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity")
    private Number maxCapacity;

    /**
     * JobConnectionsList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
     * 
     */
    @JsonIgnore
    public Property<JobConnectionsList> getConnections() {
        return connections;
    }

    /**
     * JobConnectionsList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
     * 
     */
    @JsonIgnore
    public void setConnections(Property<JobConnectionsList> connections) {
        this.connections = connections;
    }

    public Job withConnections(Property<JobConnectionsList> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries
     * 
     */
    @JsonIgnore
    public Number getMaxRetries() {
        return maxRetries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries
     * 
     */
    @JsonIgnore
    public void setMaxRetries(Number maxRetries) {
        this.maxRetries = maxRetries;
    }

    public Job withMaxRetries(Number maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Job withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity
     * 
     */
    @JsonIgnore
    public Number getAllocatedCapacity() {
        return allocatedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity
     * 
     */
    @JsonIgnore
    public void setAllocatedCapacity(Number allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    public Job withAllocatedCapacity(Number allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Job withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role
     * 
     */
    @JsonIgnore
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role
     * 
     */
    @JsonIgnore
    public void setRole(CharSequence role) {
        this.role = role;
    }

    public Job withRole(CharSequence role) {
        this.role = role;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments
     * 
     */
    @JsonIgnore
    public Object getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments
     * 
     */
    @JsonIgnore
    public void setDefaultArguments(Object defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    public Job withDefaultArguments(Object defaultArguments) {
        this.defaultArguments = defaultArguments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype
     * 
     */
    @JsonIgnore
    public CharSequence getWorkerType() {
        return workerType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-workertype
     * 
     */
    @JsonIgnore
    public void setWorkerType(CharSequence workerType) {
        this.workerType = workerType;
    }

    public Job withWorkerType(CharSequence workerType) {
        this.workerType = workerType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri
     * 
     */
    @JsonIgnore
    public CharSequence getLogUri() {
        return logUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri
     * 
     */
    @JsonIgnore
    public void setLogUri(CharSequence logUri) {
        this.logUri = logUri;
    }

    public Job withLogUri(CharSequence logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * JobJobCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
     * 
     */
    @JsonIgnore
    public Property<JobJobCommand> getCommand() {
        return command;
    }

    /**
     * JobJobCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
     * 
     */
    @JsonIgnore
    public void setCommand(Property<JobJobCommand> command) {
        this.command = command;
    }

    public Job withCommand(Property<JobJobCommand> command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion
     * 
     */
    @JsonIgnore
    public CharSequence getGlueVersion() {
        return glueVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-glueversion
     * 
     */
    @JsonIgnore
    public void setGlueVersion(CharSequence glueVersion) {
        this.glueVersion = glueVersion;
    }

    public Job withGlueVersion(CharSequence glueVersion) {
        this.glueVersion = glueVersion;
        return this;
    }

    /**
     * JobExecutionProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
     * 
     */
    @JsonIgnore
    public Property<JobExecutionProperty> getExecutionProperty() {
        return executionProperty;
    }

    /**
     * JobExecutionProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
     * 
     */
    @JsonIgnore
    public void setExecutionProperty(Property<JobExecutionProperty> executionProperty) {
        this.executionProperty = executionProperty;
    }

    public Job withExecutionProperty(Property<JobExecutionProperty> executionProperty) {
        this.executionProperty = executionProperty;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-securityconfiguration
     * 
     */
    @JsonIgnore
    public void setSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public Job withSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers
     * 
     */
    @JsonIgnore
    public Number getNumberOfWorkers() {
        return numberOfWorkers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-numberofworkers
     * 
     */
    @JsonIgnore
    public void setNumberOfWorkers(Number numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
    }

    public Job withNumberOfWorkers(Number numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Job withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity
     * 
     */
    @JsonIgnore
    public Number getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxcapacity
     * 
     */
    @JsonIgnore
    public void setMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public Job withMaxCapacity(Number maxCapacity) {
        this.maxCapacity = maxCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connections", connections).append("maxRetries", maxRetries).append("description", description).append("allocatedCapacity", allocatedCapacity).append("name", name).append("role", role).append("defaultArguments", defaultArguments).append("workerType", workerType).append("logUri", logUri).append("command", command).append("glueVersion", glueVersion).append("executionProperty", executionProperty).append("securityConfiguration", securityConfiguration).append("numberOfWorkers", numberOfWorkers).append("tags", tags).append("maxCapacity", maxCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(workerType).append(numberOfWorkers).append(allocatedCapacity).append(role).append(description).append(glueVersion).append(maxCapacity).append(command).append(tags).append(maxRetries).append(defaultArguments).append(name).append(executionProperty).append(securityConfiguration).append(connections).append(logUri).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Job) == false) {
            return false;
        }
        Job rhs = ((Job) other);
        return new EqualsBuilder().append(workerType, rhs.workerType).append(numberOfWorkers, rhs.numberOfWorkers).append(allocatedCapacity, rhs.allocatedCapacity).append(role, rhs.role).append(description, rhs.description).append(glueVersion, rhs.glueVersion).append(maxCapacity, rhs.maxCapacity).append(command, rhs.command).append(tags, rhs.tags).append(maxRetries, rhs.maxRetries).append(defaultArguments, rhs.defaultArguments).append(name, rhs.name).append(executionProperty, rhs.executionProperty).append(securityConfiguration, rhs.securityConfiguration).append(connections, rhs.connections).append(logUri, rhs.logUri).isEquals();
    }

}
