
package shiver.me.timbers.aws.gamelift;

import java.util.ArrayList;
import java.util.List;
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
 * GameSessionQueue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimeoutInSeconds",
    "PlayerLatencyPolicies",
    "Destinations",
    "Name"
})
public class GameSessionQueue {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds
     * 
     */
    @JsonProperty("TimeoutInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds")
    private Number timeoutInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies
     * 
     */
    @JsonProperty("PlayerLatencyPolicies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies")
    private List<Property<GameSessionQueuePlayerLatencyPolicy>> playerLatencyPolicies = new ArrayList<Property<GameSessionQueuePlayerLatencyPolicy>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations
     * 
     */
    @JsonProperty("Destinations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations")
    private List<Property<GameSessionQueueDestination>> destinations = new ArrayList<Property<GameSessionQueueDestination>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds
     * 
     */
    @JsonIgnore
    public Number getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-timeoutinseconds
     * 
     */
    @JsonIgnore
    public void setTimeoutInSeconds(Number timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public GameSessionQueue withTimeoutInSeconds(Number timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies
     * 
     */
    @JsonIgnore
    public List<Property<GameSessionQueuePlayerLatencyPolicy>> getPlayerLatencyPolicies() {
        return playerLatencyPolicies;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-playerlatencypolicies
     * 
     */
    @JsonIgnore
    public void setPlayerLatencyPolicies(List<Property<GameSessionQueuePlayerLatencyPolicy>> playerLatencyPolicies) {
        this.playerLatencyPolicies = playerLatencyPolicies;
    }

    public GameSessionQueue withPlayerLatencyPolicies(List<Property<GameSessionQueuePlayerLatencyPolicy>> playerLatencyPolicies) {
        this.playerLatencyPolicies = playerLatencyPolicies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations
     * 
     */
    @JsonIgnore
    public List<Property<GameSessionQueueDestination>> getDestinations() {
        return destinations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-destinations
     * 
     */
    @JsonIgnore
    public void setDestinations(List<Property<GameSessionQueueDestination>> destinations) {
        this.destinations = destinations;
    }

    public GameSessionQueue withDestinations(List<Property<GameSessionQueueDestination>> destinations) {
        this.destinations = destinations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-gamelift-gamesessionqueue.html#cfn-gamelift-gamesessionqueue-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public GameSessionQueue withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timeoutInSeconds", timeoutInSeconds).append("playerLatencyPolicies", playerLatencyPolicies).append("destinations", destinations).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(playerLatencyPolicies).append(timeoutInSeconds).append(destinations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameSessionQueue) == false) {
            return false;
        }
        GameSessionQueue rhs = ((GameSessionQueue) other);
        return new EqualsBuilder().append(name, rhs.name).append(playerLatencyPolicies, rhs.playerLatencyPolicies).append(timeoutInSeconds, rhs.timeoutInSeconds).append(destinations, rhs.destinations).isEquals();
    }

}
