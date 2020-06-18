
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
 * GameSessionQueueDestination
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DestinationArn"
})
public class GameSessionQueueDestination implements Property<GameSessionQueueDestination>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html#cfn-gamelift-gamesessionqueue-destination-destinationarn
     * 
     */
    @JsonProperty("DestinationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html#cfn-gamelift-gamesessionqueue-destination-destinationarn")
    private CharSequence destinationArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html#cfn-gamelift-gamesessionqueue-destination-destinationarn
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationArn() {
        return destinationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-gamesessionqueue-destination.html#cfn-gamelift-gamesessionqueue-destination-destinationarn
     * 
     */
    @JsonIgnore
    public void setDestinationArn(CharSequence destinationArn) {
        this.destinationArn = destinationArn;
    }

    public GameSessionQueueDestination withDestinationArn(CharSequence destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationArn", destinationArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destinationArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GameSessionQueueDestination) == false) {
            return false;
        }
        GameSessionQueueDestination rhs = ((GameSessionQueueDestination) other);
        return new EqualsBuilder().append(destinationArn, rhs.destinationArn).isEquals();
    }

}
