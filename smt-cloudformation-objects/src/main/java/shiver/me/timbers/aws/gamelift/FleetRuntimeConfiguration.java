
package shiver.me.timbers.aws.gamelift;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * FleetRuntimeConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GameSessionActivationTimeoutSeconds",
    "MaxConcurrentGameSessionActivations",
    "ServerProcesses"
})
public class FleetRuntimeConfiguration implements Property<FleetRuntimeConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-gamesessionactivationtimeoutseconds
     * 
     */
    @JsonProperty("GameSessionActivationTimeoutSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-gamesessionactivationtimeoutseconds")
    private Number gameSessionActivationTimeoutSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-maxconcurrentgamesessionactivations
     * 
     */
    @JsonProperty("MaxConcurrentGameSessionActivations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-maxconcurrentgamesessionactivations")
    private Number maxConcurrentGameSessionActivations;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-serverprocesses
     * 
     */
    @JsonProperty("ServerProcesses")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-serverprocesses")
    private Set<Property<FleetServerProcess>> serverProcesses = new LinkedHashSet<Property<FleetServerProcess>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-gamesessionactivationtimeoutseconds
     * 
     */
    @JsonIgnore
    public Number getGameSessionActivationTimeoutSeconds() {
        return gameSessionActivationTimeoutSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-gamesessionactivationtimeoutseconds
     * 
     */
    @JsonIgnore
    public void setGameSessionActivationTimeoutSeconds(Number gameSessionActivationTimeoutSeconds) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
    }

    public FleetRuntimeConfiguration withGameSessionActivationTimeoutSeconds(Number gameSessionActivationTimeoutSeconds) {
        this.gameSessionActivationTimeoutSeconds = gameSessionActivationTimeoutSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-maxconcurrentgamesessionactivations
     * 
     */
    @JsonIgnore
    public Number getMaxConcurrentGameSessionActivations() {
        return maxConcurrentGameSessionActivations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-maxconcurrentgamesessionactivations
     * 
     */
    @JsonIgnore
    public void setMaxConcurrentGameSessionActivations(Number maxConcurrentGameSessionActivations) {
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
    }

    public FleetRuntimeConfiguration withMaxConcurrentGameSessionActivations(Number maxConcurrentGameSessionActivations) {
        this.maxConcurrentGameSessionActivations = maxConcurrentGameSessionActivations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-serverprocesses
     * 
     */
    @JsonIgnore
    public Set<Property<FleetServerProcess>> getServerProcesses() {
        return serverProcesses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-fleet-runtimeconfiguration.html#cfn-gamelift-fleet-runtimeconfiguration-serverprocesses
     * 
     */
    @JsonIgnore
    public void setServerProcesses(Set<Property<FleetServerProcess>> serverProcesses) {
        this.serverProcesses = serverProcesses;
    }

    public FleetRuntimeConfiguration withServerProcesses(Set<Property<FleetServerProcess>> serverProcesses) {
        this.serverProcesses = serverProcesses;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("gameSessionActivationTimeoutSeconds", gameSessionActivationTimeoutSeconds).append("maxConcurrentGameSessionActivations", maxConcurrentGameSessionActivations).append("serverProcesses", serverProcesses).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxConcurrentGameSessionActivations).append(gameSessionActivationTimeoutSeconds).append(serverProcesses).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetRuntimeConfiguration) == false) {
            return false;
        }
        FleetRuntimeConfiguration rhs = ((FleetRuntimeConfiguration) other);
        return new EqualsBuilder().append(maxConcurrentGameSessionActivations, rhs.maxConcurrentGameSessionActivations).append(gameSessionActivationTimeoutSeconds, rhs.gameSessionActivationTimeoutSeconds).append(serverProcesses, rhs.serverProcesses).isEquals();
    }

}
