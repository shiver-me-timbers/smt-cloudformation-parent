
package shiver.me.timbers.aws.sns;

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
 * TopicSubscription
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Endpoint",
    "Protocol"
})
public class TopicSubscription implements Property<TopicSubscription>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-endpoint")
    private CharSequence endpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-protocol")
    private CharSequence protocol;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-endpoint
     * 
     */
    @JsonIgnore
    public CharSequence getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-endpoint
     * 
     */
    @JsonIgnore
    public void setEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
    }

    public TopicSubscription withEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-protocol
     * 
     */
    @JsonIgnore
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sns-subscription.html#cfn-sns-topic-subscription-protocol
     * 
     */
    @JsonIgnore
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public TopicSubscription withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpoint", endpoint).append("protocol", protocol).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpoint).append(protocol).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicSubscription) == false) {
            return false;
        }
        TopicSubscription rhs = ((TopicSubscription) other);
        return new EqualsBuilder().append(endpoint, rhs.endpoint).append(protocol, rhs.protocol).isEquals();
    }

}
