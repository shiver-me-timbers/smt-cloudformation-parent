
package aws.lambda;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BatchSize",
    "Enabled",
    "EventSourceArn",
    "FunctionName",
    "StartingPosition"
})
public class EventSourceMapping {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize
     * 
     */
    @JsonProperty("BatchSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize")
    private Integer batchSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled")
    private Boolean enabled;
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
    public Integer getBatchSize() {
        return batchSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-batchsize
     * 
     */
    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    public EventSourceMapping withBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled
     * 
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-enabled
     * 
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public EventSourceMapping withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn
     * 
     */
    public CharSequence getEventSourceArn() {
        return eventSourceArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-eventsourcearn
     * 
     */
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
    public CharSequence getFunctionName() {
        return functionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-functionname
     * 
     */
    public void setFunctionName(CharSequence functionName) {
        this.functionName = functionName;
    }

    public EventSourceMapping withFunctionName(CharSequence functionName) {
        this.functionName = functionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition
     * 
     */
    public CharSequence getStartingPosition() {
        return startingPosition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-eventsourcemapping.html#cfn-lambda-eventsourcemapping-startingposition
     * 
     */
    public void setStartingPosition(CharSequence startingPosition) {
        this.startingPosition = startingPosition;
    }

    public EventSourceMapping withStartingPosition(CharSequence startingPosition) {
        this.startingPosition = startingPosition;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("batchSize", batchSize).append("enabled", enabled).append("eventSourceArn", eventSourceArn).append("functionName", functionName).append("startingPosition", startingPosition).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(batchSize).append(startingPosition).append(eventSourceArn).append(functionName).append(enabled).toHashCode();
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
        return new EqualsBuilder().append(batchSize, rhs.batchSize).append(startingPosition, rhs.startingPosition).append(eventSourceArn, rhs.eventSourceArn).append(functionName, rhs.functionName).append(enabled, rhs.enabled).isEquals();
    }

}
