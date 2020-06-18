
package shiver.me.timbers.aws.iot;

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
 * TopicRuleHttpAuthorization
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-httpauthorization.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Sigv4"
})
public class TopicRuleHttpAuthorization implements Property<TopicRuleHttpAuthorization>
{

    /**
     * TopicRuleSigV4Authorization
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html
     * 
     */
    @JsonProperty("Sigv4")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html")
    private Property<TopicRuleSigV4Authorization> sigv4;

    /**
     * TopicRuleSigV4Authorization
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html
     * 
     */
    @JsonIgnore
    public Property<TopicRuleSigV4Authorization> getSigv4() {
        return sigv4;
    }

    /**
     * TopicRuleSigV4Authorization
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-sigv4authorization.html
     * 
     */
    @JsonIgnore
    public void setSigv4(Property<TopicRuleSigV4Authorization> sigv4) {
        this.sigv4 = sigv4;
    }

    public TopicRuleHttpAuthorization withSigv4(Property<TopicRuleSigV4Authorization> sigv4) {
        this.sigv4 = sigv4;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sigv4", sigv4).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sigv4).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleHttpAuthorization) == false) {
            return false;
        }
        TopicRuleHttpAuthorization rhs = ((TopicRuleHttpAuthorization) other);
        return new EqualsBuilder().append(sigv4, rhs.sigv4).isEquals();
    }

}
