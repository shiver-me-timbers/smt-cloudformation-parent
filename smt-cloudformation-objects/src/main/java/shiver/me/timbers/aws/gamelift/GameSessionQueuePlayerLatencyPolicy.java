
package shiver.me.timbers.aws.gamelift;

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
 * GameSessionQueuePlayerLatencyPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PolicyDurationSeconds",
    "MaximumIndividualPlayerLatencyMilliseconds"
})
public class GameSessionQueuePlayerLatencyPolicy implements Property<GameSessionQueuePlayerLatencyPolicy>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-policydurationseconds
     * 
     */
    @JsonProperty("PolicyDurationSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-policydurationseconds")
    private Number policyDurationSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-maximumindividualplayerlatencymilliseconds
     * 
     */
    @JsonProperty("MaximumIndividualPlayerLatencyMilliseconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-maximumindividualplayerlatencymilliseconds")
    private Number maximumIndividualPlayerLatencyMilliseconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-policydurationseconds
     * 
     */
    @JsonIgnore
    public Number getPolicyDurationSeconds() {
        return policyDurationSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-policydurationseconds
     * 
     */
    @JsonIgnore
    public void setPolicyDurationSeconds(Number policyDurationSeconds) {
        this.policyDurationSeconds = policyDurationSeconds;
    }

    public GameSessionQueuePlayerLatencyPolicy withPolicyDurationSeconds(Number policyDurationSeconds) {
        this.policyDurationSeconds = policyDurationSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-maximumindividualplayerlatencymilliseconds
     * 
     */
    @JsonIgnore
    public Number getMaximumIndividualPlayerLatencyMilliseconds() {
        return maximumIndividualPlayerLatencyMilliseconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-playerlatencypolicy.html#cfn-gamelift-gamesessionqueue-playerlatencypolicy-maximumindividualplayerlatencymilliseconds
     * 
     */
    @JsonIgnore
    public void setMaximumIndividualPlayerLatencyMilliseconds(Number maximumIndividualPlayerLatencyMilliseconds) {
        this.maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds;
    }

    public GameSessionQueuePlayerLatencyPolicy withMaximumIndividualPlayerLatencyMilliseconds(Number maximumIndividualPlayerLatencyMilliseconds) {
        this.maximumIndividualPlayerLatencyMilliseconds = maximumIndividualPlayerLatencyMilliseconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policyDurationSeconds", policyDurationSeconds).append("maximumIndividualPlayerLatencyMilliseconds", maximumIndividualPlayerLatencyMilliseconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximumIndividualPlayerLatencyMilliseconds).append(policyDurationSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameSessionQueuePlayerLatencyPolicy) == false) {
            return false;
        }
        GameSessionQueuePlayerLatencyPolicy rhs = ((GameSessionQueuePlayerLatencyPolicy) other);
        return new EqualsBuilder().append(maximumIndividualPlayerLatencyMilliseconds, rhs.maximumIndividualPlayerLatencyMilliseconds).append(policyDurationSeconds, rhs.policyDurationSeconds).isEquals();
    }

}
