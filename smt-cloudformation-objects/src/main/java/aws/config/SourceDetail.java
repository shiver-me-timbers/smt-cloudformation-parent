
package aws.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SourceDetail
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EventSource",
    "MaximumExecutionFrequency",
    "MessageType"
})
public class SourceDetail {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource
     * 
     */
    @JsonProperty("EventSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource")
    private CharSequence eventSource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency
     * 
     */
    @JsonProperty("MaximumExecutionFrequency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency")
    private CharSequence maximumExecutionFrequency;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype
     * 
     */
    @JsonProperty("MessageType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype")
    private CharSequence messageType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource
     * 
     */
    public CharSequence getEventSource() {
        return eventSource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-eventsource
     * 
     */
    public void setEventSource(CharSequence eventSource) {
        this.eventSource = eventSource;
    }

    public SourceDetail withEventSource(CharSequence eventSource) {
        this.eventSource = eventSource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency
     * 
     */
    public CharSequence getMaximumExecutionFrequency() {
        return maximumExecutionFrequency;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-sourcedetail-maximumexecutionfrequency
     * 
     */
    public void setMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
    }

    public SourceDetail withMaximumExecutionFrequency(CharSequence maximumExecutionFrequency) {
        this.maximumExecutionFrequency = maximumExecutionFrequency;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype
     * 
     */
    public CharSequence getMessageType() {
        return messageType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-configrule-source-sourcedetails.html#cfn-config-configrule-source-sourcedetail-messagetype
     * 
     */
    public void setMessageType(CharSequence messageType) {
        this.messageType = messageType;
    }

    public SourceDetail withMessageType(CharSequence messageType) {
        this.messageType = messageType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventSource", eventSource).append("maximumExecutionFrequency", maximumExecutionFrequency).append("messageType", messageType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eventSource).append(messageType).append(maximumExecutionFrequency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SourceDetail) == false) {
            return false;
        }
        SourceDetail rhs = ((SourceDetail) other);
        return new EqualsBuilder().append(eventSource, rhs.eventSource).append(messageType, rhs.messageType).append(maximumExecutionFrequency, rhs.maximumExecutionFrequency).isEquals();
    }

}
