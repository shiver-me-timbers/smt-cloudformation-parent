
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Job
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Role",
    "DefaultArguments",
    "Connections",
    "MaxRetries",
    "Description",
    "LogUri",
    "Command",
    "AllocatedCapacity",
    "ExecutionProperty",
    "Name"
})
public class Job {

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
     * ConnectionsList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
     * 
     */
    @JsonProperty("Connections")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html")
    private ConnectionsList connections;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries
     * 
     */
    @JsonProperty("MaxRetries")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries")
    private Double maxRetries;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri
     * 
     */
    @JsonProperty("LogUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri")
    private CharSequence logUri;
    /**
     * JobCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
     * 
     */
    @JsonProperty("Command")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html")
    private JobCommand command;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity
     * 
     */
    @JsonProperty("AllocatedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity")
    private Double allocatedCapacity;
    /**
     * ExecutionProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
     * 
     */
    @JsonProperty("ExecutionProperty")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html")
    private ExecutionProperty executionProperty;
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
    public CharSequence getRole() {
        return role;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-role
     * 
     */
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
    public Object getDefaultArguments() {
        return defaultArguments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-defaultarguments
     * 
     */
    public void setDefaultArguments(Object defaultArguments) {
        this.defaultArguments = defaultArguments;
    }

    public Job withDefaultArguments(Object defaultArguments) {
        this.defaultArguments = defaultArguments;
        return this;
    }

    /**
     * ConnectionsList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
     * 
     */
    public ConnectionsList getConnections() {
        return connections;
    }

    /**
     * ConnectionsList
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-connectionslist.html
     * 
     */
    public void setConnections(ConnectionsList connections) {
        this.connections = connections;
    }

    public Job withConnections(ConnectionsList connections) {
        this.connections = connections;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries
     * 
     */
    public Double getMaxRetries() {
        return maxRetries;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-maxretries
     * 
     */
    public void setMaxRetries(Double maxRetries) {
        this.maxRetries = maxRetries;
    }

    public Job withMaxRetries(Double maxRetries) {
        this.maxRetries = maxRetries;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Job withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri
     * 
     */
    public CharSequence getLogUri() {
        return logUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-loguri
     * 
     */
    public void setLogUri(CharSequence logUri) {
        this.logUri = logUri;
    }

    public Job withLogUri(CharSequence logUri) {
        this.logUri = logUri;
        return this;
    }

    /**
     * JobCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
     * 
     */
    public JobCommand getCommand() {
        return command;
    }

    /**
     * JobCommand
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-jobcommand.html
     * 
     */
    public void setCommand(JobCommand command) {
        this.command = command;
    }

    public Job withCommand(JobCommand command) {
        this.command = command;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity
     * 
     */
    public Double getAllocatedCapacity() {
        return allocatedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-allocatedcapacity
     * 
     */
    public void setAllocatedCapacity(Double allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
    }

    public Job withAllocatedCapacity(Double allocatedCapacity) {
        this.allocatedCapacity = allocatedCapacity;
        return this;
    }

    /**
     * ExecutionProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
     * 
     */
    public ExecutionProperty getExecutionProperty() {
        return executionProperty;
    }

    /**
     * ExecutionProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-job-executionproperty.html
     * 
     */
    public void setExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
    }

    public Job withExecutionProperty(ExecutionProperty executionProperty) {
        this.executionProperty = executionProperty;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-job.html#cfn-glue-job-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Job withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("role", role).append("defaultArguments", defaultArguments).append("connections", connections).append("maxRetries", maxRetries).append("description", description).append("logUri", logUri).append("command", command).append("allocatedCapacity", allocatedCapacity).append("executionProperty", executionProperty).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxRetries).append(role).append(allocatedCapacity).append(defaultArguments).append(name).append(description).append(executionProperty).append(connections).append(command).append(logUri).toHashCode();
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
        return new EqualsBuilder().append(maxRetries, rhs.maxRetries).append(role, rhs.role).append(allocatedCapacity, rhs.allocatedCapacity).append(defaultArguments, rhs.defaultArguments).append(name, rhs.name).append(description, rhs.description).append(executionProperty, rhs.executionProperty).append(connections, rhs.connections).append(command, rhs.command).append(logUri, rhs.logUri).isEquals();
    }

}
