
package aws.batch;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * JobDefinition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "Parameters",
    "NodeProperties",
    "Timeout",
    "ContainerProperties",
    "JobDefinitionName",
    "RetryStrategy"
})
public class JobDefinition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters")
    private Object parameters;
    /**
     * JobDefinitionNodeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html
     * 
     */
    @JsonProperty("NodeProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html")
    private Property<JobDefinitionNodeProperties> nodeProperties;
    /**
     * JobDefinitionTimeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html")
    private Property<JobDefinitionTimeout> timeout;
    /**
     * JobDefinitionContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonProperty("ContainerProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html")
    private Property<JobDefinitionContainerProperties> containerProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    @JsonProperty("JobDefinitionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname")
    private CharSequence jobDefinitionName;
    /**
     * JobDefinitionRetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    @JsonProperty("RetryStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html")
    private Property<JobDefinitionRetryStrategy> retryStrategy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public JobDefinition withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonIgnore
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public JobDefinition withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * JobDefinitionNodeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html
     * 
     */
    @JsonIgnore
    public Property<JobDefinitionNodeProperties> getNodeProperties() {
        return nodeProperties;
    }

    /**
     * JobDefinitionNodeProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-nodeproperties.html
     * 
     */
    @JsonIgnore
    public void setNodeProperties(Property<JobDefinitionNodeProperties> nodeProperties) {
        this.nodeProperties = nodeProperties;
    }

    public JobDefinition withNodeProperties(Property<JobDefinitionNodeProperties> nodeProperties) {
        this.nodeProperties = nodeProperties;
        return this;
    }

    /**
     * JobDefinitionTimeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    @JsonIgnore
    public Property<JobDefinitionTimeout> getTimeout() {
        return timeout;
    }

    /**
     * JobDefinitionTimeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    @JsonIgnore
    public void setTimeout(Property<JobDefinitionTimeout> timeout) {
        this.timeout = timeout;
    }

    public JobDefinition withTimeout(Property<JobDefinitionTimeout> timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * JobDefinitionContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonIgnore
    public Property<JobDefinitionContainerProperties> getContainerProperties() {
        return containerProperties;
    }

    /**
     * JobDefinitionContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonIgnore
    public void setContainerProperties(Property<JobDefinitionContainerProperties> containerProperties) {
        this.containerProperties = containerProperties;
    }

    public JobDefinition withContainerProperties(Property<JobDefinitionContainerProperties> containerProperties) {
        this.containerProperties = containerProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    @JsonIgnore
    public CharSequence getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    @JsonIgnore
    public void setJobDefinitionName(CharSequence jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    public JobDefinition withJobDefinitionName(CharSequence jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
        return this;
    }

    /**
     * JobDefinitionRetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    @JsonIgnore
    public Property<JobDefinitionRetryStrategy> getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * JobDefinitionRetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    @JsonIgnore
    public void setRetryStrategy(Property<JobDefinitionRetryStrategy> retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public JobDefinition withRetryStrategy(Property<JobDefinitionRetryStrategy> retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("parameters", parameters).append("nodeProperties", nodeProperties).append("timeout", timeout).append("containerProperties", containerProperties).append("jobDefinitionName", jobDefinitionName).append("retryStrategy", retryStrategy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerProperties).append(type).append(jobDefinitionName).append(retryStrategy).append(parameters).append(timeout).append(nodeProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDefinition) == false) {
            return false;
        }
        JobDefinition rhs = ((JobDefinition) other);
        return new EqualsBuilder().append(containerProperties, rhs.containerProperties).append(type, rhs.type).append(jobDefinitionName, rhs.jobDefinitionName).append(retryStrategy, rhs.retryStrategy).append(parameters, rhs.parameters).append(timeout, rhs.timeout).append(nodeProperties, rhs.nodeProperties).isEquals();
    }

}
