
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
 * RuleBatchRetryStrategy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Attempts"
})
public class RuleBatchRetryStrategy implements Property<RuleBatchRetryStrategy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html#cfn-events-rule-batchretrystrategy-attempts
     * 
     */
    @JsonProperty("Attempts")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html#cfn-events-rule-batchretrystrategy-attempts")
    private Number attempts;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html#cfn-events-rule-batchretrystrategy-attempts
     * 
     */
    @JsonIgnore
    public Number getAttempts() {
        return attempts;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batchretrystrategy.html#cfn-events-rule-batchretrystrategy-attempts
     * 
     */
    @JsonIgnore
    public void setAttempts(Number attempts) {
        this.attempts = attempts;
    }

    public RuleBatchRetryStrategy withAttempts(Number attempts) {
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
        if ((other instanceof RuleBatchRetryStrategy) == false) {
            return false;
        }
        RuleBatchRetryStrategy rhs = ((RuleBatchRetryStrategy) other);
        return new EqualsBuilder().append(attempts, rhs.attempts).isEquals();
    }

}
