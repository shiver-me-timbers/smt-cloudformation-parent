
package shiver.me.timbers.aws.events;

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
 * RuleBatchParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ArrayProperties",
    "JobDefinition",
    "JobName",
    "RetryStrategy"
})
public class RuleBatchParameters implements Property<RuleBatchParameters>
{

    /**
     * RuleBatchArrayProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html
     * 
     */
    @JsonProperty("ArrayProperties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html")
    private Property<RuleBatchArrayProperties> arrayProperties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobdefinition
     * 
     */
    @JsonProperty("JobDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobdefinition")
    private CharSequence jobDefinition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobname
     * 
     */
    @JsonProperty("JobName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobname")
    private CharSequence jobName;
    /**
     * RuleBatchRetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html
     * 
     */
    @JsonProperty("RetryStrategy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html")
    private Property<RuleBatchRetryStrategy> retryStrategy;

    /**
     * RuleBatchArrayProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html
     * 
     */
    @JsonIgnore
    public Property<RuleBatchArrayProperties> getArrayProperties() {
        return arrayProperties;
    }

    /**
     * RuleBatchArrayProperties
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html
     * 
     */
    @JsonIgnore
    public void setArrayProperties(Property<RuleBatchArrayProperties> arrayProperties) {
        this.arrayProperties = arrayProperties;
    }

    public RuleBatchParameters withArrayProperties(Property<RuleBatchArrayProperties> arrayProperties) {
        this.arrayProperties = arrayProperties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobdefinition
     * 
     */
    @JsonIgnore
    public CharSequence getJobDefinition() {
        return jobDefinition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobdefinition
     * 
     */
    @JsonIgnore
    public void setJobDefinition(CharSequence jobDefinition) {
        this.jobDefinition = jobDefinition;
    }

    public RuleBatchParameters withJobDefinition(CharSequence jobDefinition) {
        this.jobDefinition = jobDefinition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobname
     * 
     */
    @JsonIgnore
    public CharSequence getJobName() {
        return jobName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchparameters.html#cfn-events-rule-batchparameters-jobname
     * 
     */
    @JsonIgnore
    public void setJobName(CharSequence jobName) {
        this.jobName = jobName;
    }

    public RuleBatchParameters withJobName(CharSequence jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * RuleBatchRetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html
     * 
     */
    @JsonIgnore
    public Property<RuleBatchRetryStrategy> getRetryStrategy() {
        return retryStrategy;
    }

    /**
     * RuleBatchRetryStrategy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html
     * 
     */
    @JsonIgnore
    public void setRetryStrategy(Property<RuleBatchRetryStrategy> retryStrategy) {
        this.retryStrategy = retryStrategy;
    }

    public RuleBatchParameters withRetryStrategy(Property<RuleBatchRetryStrategy> retryStrategy) {
        this.retryStrategy = retryStrategy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arrayProperties", arrayProperties).append("jobDefinition", jobDefinition).append("jobName", jobName).append("retryStrategy", retryStrategy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jobName).append(arrayProperties).append(retryStrategy).append(jobDefinition).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleBatchParameters) == false) {
            return false;
        }
        RuleBatchParameters rhs = ((RuleBatchParameters) other);
        return new EqualsBuilder().append(jobName, rhs.jobName).append(arrayProperties, rhs.arrayProperties).append(retryStrategy, rhs.retryStrategy).append(jobDefinition, rhs.jobDefinition).isEquals();
    }

}
