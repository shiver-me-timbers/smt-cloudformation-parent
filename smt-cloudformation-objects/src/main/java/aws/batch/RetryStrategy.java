
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
 * RetryStrategy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Attempts"
})
public class RetryStrategy implements Property<RetryStrategy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts
     * 
     */
    @JsonProperty("Attempts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts")
    private Integer attempts;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts
     * 
     */
    @JsonIgnore
    public Integer getAttempts() {
        return attempts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-retrystrategy.html#cfn-batch-jobdefinition-retrystrategy-attempts
     * 
     */
    @JsonIgnore
    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    public RetryStrategy withAttempts(Integer attempts) {
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
        if ((other instanceof RetryStrategy) == false) {
            return false;
        }
        RetryStrategy rhs = ((RetryStrategy) other);
        return new EqualsBuilder().append(attempts, rhs.attempts).isEquals();
    }

}
