
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
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters")
    private Object parameters;
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
    private CharSequence jobDefinitionName;
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
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-type
     * 
     */
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
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-parameters
     * 
     */
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public JobDefinition withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * Timeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
    public Timeout getTimeout() {
        return timeout;
    }

    /**
     * Timeout
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-timeout.html
     * 
     */
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
    public ContainerProperties getContainerProperties() {
        return containerProperties;
    }

    /**
     * ContainerProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-containerproperties.html
     * 
     */
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
    public CharSequence getJobDefinitionName() {
        return jobDefinitionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-batch-jobdefinition.html#cfn-batch-jobdefinition-jobdefinitionname
     * 
     */
    public void setJobDefinitionName(CharSequence jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
    }

    public JobDefinition withJobDefinitionName(CharSequence jobDefinitionName) {
        this.jobDefinitionName = jobDefinitionName;
        return this;
    }

    /**
     * RetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
    public RetryStrategy getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * RetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
     * 
     */
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
