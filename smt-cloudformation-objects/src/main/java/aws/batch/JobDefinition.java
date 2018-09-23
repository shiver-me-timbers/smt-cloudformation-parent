
package aws.batch;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Parameters",
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
    private String type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters")
    private Parameters parameters;
    /**
     * Timeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html")
    private Timeout timeout;
    /**
     * ContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonProperty("ContainerProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html")
    private ContainerProperties containerProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    @JsonProperty("JobDefinitionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname")
    private String jobDefinitionName;
    /**
     * RetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    @JsonProperty("RetryStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html")
    private RetryStrategy retryStrategy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type
     * 
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type
     * 
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public JobDefinition withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonProperty("Parameters")
    public Parameters getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonProperty("Parameters")
    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public JobDefinition withParameters(Parameters parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Timeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    @JsonProperty("Timeout")
    public Timeout getTimeout() {
        return timeout;
    }

    /**
     * Timeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    @JsonProperty("Timeout")
    public void setTimeout(Timeout timeout) {
        this.timeout = timeout;
    }

    public JobDefinition withTimeout(Timeout timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * ContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonProperty("ContainerProperties")
    public ContainerProperties getContainerProperties() {
        return containerProperties;
    }

    /**
     * ContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
    @JsonProperty("ContainerProperties")
    public void setContainerProperties(ContainerProperties containerProperties) {
        this.containerProperties = containerProperties;
    }

    public JobDefinition withContainerProperties(ContainerProperties containerProperties) {
        this.containerProperties = containerProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    @JsonProperty("JobDefinitionName")
    public String getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    @JsonProperty("JobDefinitionName")
    public void setJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    public JobDefinition withJobDefinitionName(String jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
        return this;
    }

    /**
     * RetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    @JsonProperty("RetryStrategy")
    public RetryStrategy getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * RetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    @JsonProperty("RetryStrategy")
    public void setRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public JobDefinition withRetryStrategy(RetryStrategy retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("parameters", parameters).append("timeout", timeout).append("containerProperties", containerProperties).append("jobDefinitionName", jobDefinitionName).append("retryStrategy", retryStrategy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(containerProperties).append(type).append(jobDefinitionName).append(retryStrategy).append(parameters).append(timeout).toHashCode();
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
        return new EqualsBuilder().append(containerProperties, rhs.containerProperties).append(type, rhs.type).append(jobDefinitionName, rhs.jobDefinitionName).append(retryStrategy, rhs.retryStrategy).append(parameters, rhs.parameters).append(timeout, rhs.timeout).isEquals();
    }

}