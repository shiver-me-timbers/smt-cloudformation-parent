
package shiver.me.timbers.aws.lambda;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EventSourceMapping
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BatchSize",
    "Enabled",
    "EventSourceArn",
    "FunctionName",
    "MaximumBatchingWindowInSeconds",
    "StartingPosition"
})
public class EventSourceMapping {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize
     * 
     */
    @JsonProperty("BatchSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize")
    private Number batchSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn
     * 
     */
    @JsonProperty("EventSourceArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn")
    private CharSequence eventSourceArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname
     * 
     */
    @JsonProperty("FunctionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname")
    private CharSequence functionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds
     * 
     */
    @JsonProperty("MaximumBatchingWindowInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds")
    private Number maximumBatchingWindowInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition
     * 
     */
    @JsonProperty("StartingPosition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition")
    private CharSequence startingPosition;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize
     * 
     */
    @JsonIgnore
    public Number getBatchSize() {
        return batchSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize
     * 
     */
    @JsonIgnore
    public void setBatchSize(Number batchSize) {
        this.batchSize = batchSize;
    }

    public EventSourceMapping withBatchSize(Number batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public EventSourceMapping withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn
     * 
     */
    @JsonIgnore
    public CharSequence getEventSourceArn() {
        return eventSourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn
     * 
     */
    @JsonIgnore
    public void setEventSourceArn(CharSequence eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
    }

    public EventSourceMapping withEventSourceArn(CharSequence eventSourceArn) {
        this.eventSourceArn = eventSourceArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname
     * 
     */
    @JsonIgnore
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname
     * 
     */
    @JsonIgnore
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public EventSourceMapping withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds
     * 
     */
    @JsonIgnore
    public Number getMaximumBatchingWindowInSeconds() {
        return maximumBatchingWindowInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-maximumbatchingwindowinseconds
     * 
     */
    @JsonIgnore
    public void setMaximumBatchingWindowInSeconds(Number maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    public EventSourceMapping withMaximumBatchingWindowInSeconds(Number maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition
     * 
     */
    @JsonIgnore
    public CharSequence getStartingPosition() {
        return startingPosition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition
     * 
     */
    @JsonIgnore
    public void setStartingPosition(CharSequence startingPosition) {
        this.startingPosition = startingPosition;
    }

    public EventSourceMapping withStartingPosition(CharSequence startingPosition) {
        this.startingPosition = startingPosition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("batchSize", batchSize).append("enabled", enabled).append("eventSourceArn", eventSourceArn).append("functionName", functionName).append("maximumBatchingWindowInSeconds", maximumBatchingWindowInSeconds).append("startingPosition", startingPosition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maximumBatchingWindowInSeconds).append(eventSourceArn).append(functionName).append(batchSize).append(startingPosition).append(enabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EventSourceMapping) == false) {
            return false;
        }
        EventSourceMapping rhs = ((EventSourceMapping) other);
        return new EqualsBuilder().append(maximumBatchingWindowInSeconds, rhs.maximumBatchingWindowInSeconds).append(eventSourceArn, rhs.eventSourceArn).append(functionName, rhs.functionName).append(batchSize, rhs.batchSize).append(startingPosition, rhs.startingPosition).append(enabled, rhs.enabled).isEquals();
    }

}