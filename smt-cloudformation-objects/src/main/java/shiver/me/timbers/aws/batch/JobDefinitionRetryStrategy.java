
package shiver.me.timbers.aws.batch;

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
 * JobDefinitionRetryStrategy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Attempts"
})
public class JobDefinitionRetryStrategy implements Property<JobDefinitionRetryStrategy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts
     * 
     */
    @JsonProperty("Attempts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts")
    private Number attempts;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts
     * 
     */
    @JsonIgnore
    public Number getAttempts() {
        return attempts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts
     * 
     */
    @JsonIgnore
    public void setAttempts(Number attempts) {
        this.attempts = attempts;
    }

    public JobDefinitionRetryStrategy withAttempts(Number attempts) {
        this.attempts = attempts;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("attempts", attempts).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attempts).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobDefinitionRetryStrategy) == false) {
            return false;
        }
        JobDefinitionRetryStrategy rhs = ((JobDefinitionRetryStrategy) other);
        return new EqualsBuilder().append(attempts, rhs.attempts).isEquals();
    }

}
