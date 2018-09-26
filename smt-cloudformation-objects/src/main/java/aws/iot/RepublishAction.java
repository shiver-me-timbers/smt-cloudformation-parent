
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RepublishAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RoleArn",
    "Topic"
})
public class RepublishAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic
     * 
     */
    @JsonProperty("Topic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic")
    private CharSequence topic;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public RepublishAction withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic
     * 
     */
    public CharSequence getTopic() {
        return topic;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-republishaction.html#cfn-iot-topicrule-republishaction-topic
     * 
     */
    public void setTopic(CharSequence topic) {
        this.topic = topic;
    }

    public RepublishAction withTopic(CharSequence topic) {
        this.topic = topic;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("roleArn", roleArn).append("topic", topic).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topic).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RepublishAction) == false) {
            return false;
        }
        RepublishAction rhs = ((RepublishAction) other);
        return new EqualsBuilder().append(topic, rhs.topic).append(roleArn, rhs.roleArn).isEquals();
    }

}
