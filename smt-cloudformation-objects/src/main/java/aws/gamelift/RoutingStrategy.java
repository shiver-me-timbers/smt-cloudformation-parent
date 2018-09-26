
package aws.gamelift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RoutingStrategy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FleetId",
    "Message",
    "Type"
})
public class RoutingStrategy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-fleetid
     * 
     */
    @JsonProperty("FleetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-fleetid")
    private CharSequence fleetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-message
     * 
     */
    @JsonProperty("Message")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-message")
    private CharSequence message;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-fleetid
     * 
     */
    public CharSequence getFleetId() {
        return fleetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-fleetid
     * 
     */
    public void setFleetId(CharSequence fleetId) {
        this.fleetId = fleetId;
    }

    public RoutingStrategy withFleetId(CharSequence fleetId) {
        this.fleetId = fleetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-message
     * 
     */
    public CharSequence getMessage() {
        return message;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-message
     * 
     */
    public void setMessage(CharSequence message) {
        this.message = message;
    }

    public RoutingStrategy withMessage(CharSequence message) {
        this.message = message;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-alias-routingstrategy.html#cfn-gamelift-alias-routingstrategy-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public RoutingStrategy withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fleetId", fleetId).append("message", message).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fleetId).append(message).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RoutingStrategy) == false) {
            return false;
        }
        RoutingStrategy rhs = ((RoutingStrategy) other);
        return new EqualsBuilder().append(fleetId, rhs.fleetId).append(message, rhs.message).append(type, rhs.type).isEquals();
    }

}
