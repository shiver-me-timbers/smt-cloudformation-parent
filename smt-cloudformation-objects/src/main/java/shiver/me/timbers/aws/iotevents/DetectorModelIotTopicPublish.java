
package shiver.me.timbers.aws.iotevents;

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
 * DetectorModelIotTopicPublish
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MqttTopic"
})
public class DetectorModelIotTopicPublish implements Property<DetectorModelIotTopicPublish>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-mqtttopic
     * 
     */
    @JsonProperty("MqttTopic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-mqtttopic")
    private CharSequence mqttTopic;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-mqtttopic
     * 
     */
    @JsonIgnore
    public CharSequence getMqttTopic() {
        return mqttTopic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotevents-detectormodel-iottopicpublish.html#cfn-iotevents-detectormodel-iottopicpublish-mqtttopic
     * 
     */
    @JsonIgnore
    public void setMqttTopic(CharSequence mqttTopic) {
        this.mqttTopic = mqttTopic;
    }

    public DetectorModelIotTopicPublish withMqttTopic(CharSequence mqttTopic) {
        this.mqttTopic = mqttTopic;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mqttTopic", mqttTopic).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mqttTopic).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DetectorModelIotTopicPublish) == false) {
            return false;
        }
        DetectorModelIotTopicPublish rhs = ((DetectorModelIotTopicPublish) other);
        return new EqualsBuilder().append(mqttTopic, rhs.mqttTopic).isEquals();
    }

}
