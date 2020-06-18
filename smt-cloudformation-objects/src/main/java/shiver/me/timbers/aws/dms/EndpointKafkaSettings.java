
package shiver.me.timbers.aws.dms;

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
 * EndpointKafkaSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Broker",
    "Topic"
})
public class EndpointKafkaSettings implements Property<EndpointKafkaSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-broker
     * 
     */
    @JsonProperty("Broker")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-broker")
    private CharSequence broker;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-topic
     * 
     */
    @JsonProperty("Topic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-topic")
    private CharSequence topic;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-broker
     * 
     */
    @JsonIgnore
    public CharSequence getBroker() {
        return broker;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-broker
     * 
     */
    @JsonIgnore
    public void setBroker(CharSequence broker) {
        this.broker = broker;
    }

    public EndpointKafkaSettings withBroker(CharSequence broker) {
        this.broker = broker;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-topic
     * 
     */
    @JsonIgnore
    public CharSequence getTopic() {
        return topic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html#cfn-dms-endpoint-kafkasettings-topic
     * 
     */
    @JsonIgnore
    public void setTopic(CharSequence topic) {
        this.topic = topic;
    }

    public EndpointKafkaSettings withTopic(CharSequence topic) {
        this.topic = topic;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("broker", broker).append("topic", topic).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(broker).append(topic).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointKafkaSettings) == false) {
            return false;
        }
        EndpointKafkaSettings rhs = ((EndpointKafkaSettings) other);
        return new EqualsBuilder().append(broker, rhs.broker).append(topic, rhs.topic).isEquals();
    }

}
