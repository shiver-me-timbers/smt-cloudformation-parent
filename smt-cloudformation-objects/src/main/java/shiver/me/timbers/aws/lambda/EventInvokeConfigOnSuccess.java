
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
 * EventInvokeConfigOnSuccess
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Destination"
})
public class EventInvokeConfigOnSuccess implements Property<EventInvokeConfigOnSuccess>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html#cfn-lambda-eventinvokeconfig-destinationconfig-onsuccess-destination
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html#cfn-lambda-eventinvokeconfig-destinationconfig-onsuccess-destination")
    private CharSequence destination;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html#cfn-lambda-eventinvokeconfig-destinationconfig-onsuccess-destination
     * 
     */
    @JsonIgnore
    public CharSequence getDestination() {
        return destination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html#cfn-lambda-eventinvokeconfig-destinationconfig-onsuccess-destination
     * 
     */
    @JsonIgnore
    public void setDestination(CharSequence destination) {
        this.destination = destination;
    }

    public EventInvokeConfigOnSuccess withDestination(CharSequence destination) {
        this.destination = destination;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventInvokeConfigOnSuccess) == false) {
            return false;
        }
        EventInvokeConfigOnSuccess rhs = ((EventInvokeConfigOnSuccess) other);
        return new EqualsBuilder().append(destination, rhs.destination).isEquals();
    }

}
