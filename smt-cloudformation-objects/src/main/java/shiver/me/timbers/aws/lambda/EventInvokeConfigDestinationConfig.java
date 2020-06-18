
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
 * EventInvokeConfigDestinationConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OnSuccess",
    "OnFailure"
})
public class EventInvokeConfigDestinationConfig implements Property<EventInvokeConfigDestinationConfig>
{

    /**
     * EventInvokeConfigOnSuccess
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html
     * 
     */
    @JsonProperty("OnSuccess")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html")
    private Property<EventInvokeConfigOnSuccess> onSuccess;
    /**
     * EventInvokeConfigOnFailure
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onfailure.html
     * 
     */
    @JsonProperty("OnFailure")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onfailure.html")
    private Property<EventInvokeConfigOnFailure> onFailure;

    /**
     * EventInvokeConfigOnSuccess
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html
     * 
     */
    @JsonIgnore
    public Property<EventInvokeConfigOnSuccess> getOnSuccess() {
        return onSuccess;
    }

    /**
     * EventInvokeConfigOnSuccess
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onsuccess.html
     * 
     */
    @JsonIgnore
    public void setOnSuccess(Property<EventInvokeConfigOnSuccess> onSuccess) {
        this.onSuccess = onSuccess;
    }

    public EventInvokeConfigDestinationConfig withOnSuccess(Property<EventInvokeConfigOnSuccess> onSuccess) {
        this.onSuccess = onSuccess;
        return this;
    }

    /**
     * EventInvokeConfigOnFailure
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onfailure.html
     * 
     */
    @JsonIgnore
    public Property<EventInvokeConfigOnFailure> getOnFailure() {
        return onFailure;
    }

    /**
     * EventInvokeConfigOnFailure
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventinvokeconfig-destinationconfig-onfailure.html
     * 
     */
    @JsonIgnore
    public void setOnFailure(Property<EventInvokeConfigOnFailure> onFailure) {
        this.onFailure = onFailure;
    }

    public EventInvokeConfigDestinationConfig withOnFailure(Property<EventInvokeConfigOnFailure> onFailure) {
        this.onFailure = onFailure;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("onSuccess", onSuccess).append("onFailure", onFailure).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(onFailure).append(onSuccess).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventInvokeConfigDestinationConfig) == false) {
            return false;
        }
        EventInvokeConfigDestinationConfig rhs = ((EventInvokeConfigDestinationConfig) other);
        return new EqualsBuilder().append(onFailure, rhs.onFailure).append(onSuccess, rhs.onSuccess).isEquals();
    }

}
