
package shiver.me.timbers.aws.lambda;

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
 * EventSourceMappingDestinationConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-destinationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnFailure"
})
public class EventSourceMappingDestinationConfig implements Property<EventSourceMappingDestinationConfig>
{

    /**
     * EventSourceMappingOnFailure
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html
     * 
     */
    @JsonProperty("OnFailure")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html")
    private Property<EventSourceMappingOnFailure> onFailure;

    /**
     * EventSourceMappingOnFailure
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html
     * 
     */
    @JsonIgnore
    public Property<EventSourceMappingOnFailure> getOnFailure() {
        return onFailure;
    }

    /**
     * EventSourceMappingOnFailure
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-onfailure.html
     * 
     */
    @JsonIgnore
    public void setOnFailure(Property<EventSourceMappingOnFailure> onFailure) {
        this.onFailure = onFailure;
    }

    public EventSourceMappingDestinationConfig withOnFailure(Property<EventSourceMappingOnFailure> onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onFailure", onFailure).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onFailure).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventSourceMappingDestinationConfig) == false) {
            return false;
        }
        EventSourceMappingDestinationConfig rhs = ((EventSourceMappingDestinationConfig) other);
        return new EqualsBuilder().append(onFailure, rhs.onFailure).isEquals();
    }

}
