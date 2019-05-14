
package aws.iot;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TopicRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RuleName",
    "TopicRulePayload"
})
public class TopicRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename
     * 
     */
    @JsonProperty("RuleName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename")
    private CharSequence ruleName;
    /**
     * TopicRulePayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
     * 
     */
    @JsonProperty("TopicRulePayload")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html")
    private Property<TopicRulePayload> topicRulePayload;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename
     * 
     */
    @JsonIgnore
    public CharSequence getRuleName() {
        return ruleName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-topicrule.html#cfn-iot-topicrule-rulename
     * 
     */
    @JsonIgnore
    public void setRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
    }

    public TopicRule withRuleName(CharSequence ruleName) {
        this.ruleName = ruleName;
        return this;
    }

    /**
     * TopicRulePayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
     * 
     */
    @JsonIgnore
    public Property<TopicRulePayload> getTopicRulePayload() {
        return topicRulePayload;
    }

    /**
     * TopicRulePayload
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
     * 
     */
    @JsonIgnore
    public void setTopicRulePayload(Property<TopicRulePayload> topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
    }

    public TopicRule withTopicRulePayload(Property<TopicRulePayload> topicRulePayload) {
        this.topicRulePayload = topicRulePayload;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ruleName", ruleName).append("topicRulePayload", topicRulePayload).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ruleName).append(topicRulePayload).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRule) == false) {
            return false;
        }
        TopicRule rhs = ((TopicRule) other);
        return new EqualsBuilder().append(ruleName, rhs.ruleName).append(topicRulePayload, rhs.topicRulePayload).isEquals();
    }

}
