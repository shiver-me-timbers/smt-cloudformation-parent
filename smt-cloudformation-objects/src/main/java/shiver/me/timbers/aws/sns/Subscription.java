
package shiver.me.timbers.aws.sns;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Subscription
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeliveryPolicy",
    "Endpoint",
    "FilterPolicy",
    "Protocol",
    "RawMessageDelivery",
    "RedrivePolicy",
    "Region",
    "TopicArn"
})
public class Subscription {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy
     * 
     */
    @JsonProperty("DeliveryPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy")
    private Object deliveryPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint")
    private CharSequence endpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy
     * 
     */
    @JsonProperty("FilterPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy")
    private Object filterPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol")
    private CharSequence protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery
     * 
     */
    @JsonProperty("RawMessageDelivery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery")
    private CharSequence rawMessageDelivery;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy
     * 
     */
    @JsonProperty("RedrivePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy")
    private Object redrivePolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region")
    private CharSequence region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn")
    private CharSequence topicArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy
     * 
     */
    @JsonIgnore
    public Object getDeliveryPolicy() {
        return deliveryPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy
     * 
     */
    @JsonIgnore
    public void setDeliveryPolicy(Object deliveryPolicy) {
        this.deliveryPolicy = deliveryPolicy;
    }

    public Subscription withDeliveryPolicy(Object deliveryPolicy) {
        this.deliveryPolicy = deliveryPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint
     * 
     */
    @JsonIgnore
    public CharSequence getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint
     * 
     */
    @JsonIgnore
    public void setEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
    }

    public Subscription withEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy
     * 
     */
    @JsonIgnore
    public Object getFilterPolicy() {
        return filterPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy
     * 
     */
    @JsonIgnore
    public void setFilterPolicy(Object filterPolicy) {
        this.filterPolicy = filterPolicy;
    }

    public Subscription withFilterPolicy(Object filterPolicy) {
        this.filterPolicy = filterPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol
     * 
     */
    @JsonIgnore
    public CharSequence getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol
     * 
     */
    @JsonIgnore
    public void setProtocol(CharSequence protocol) {
        this.protocol = protocol;
    }

    public Subscription withProtocol(CharSequence protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery
     * 
     */
    @JsonIgnore
    public CharSequence getRawMessageDelivery() {
        return rawMessageDelivery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery
     * 
     */
    @JsonIgnore
    public void setRawMessageDelivery(CharSequence rawMessageDelivery) {
        this.rawMessageDelivery = rawMessageDelivery;
    }

    public Subscription withRawMessageDelivery(CharSequence rawMessageDelivery) {
        this.rawMessageDelivery = rawMessageDelivery;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy
     * 
     */
    @JsonIgnore
    public Object getRedrivePolicy() {
        return redrivePolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-redrivepolicy
     * 
     */
    @JsonIgnore
    public void setRedrivePolicy(Object redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
    }

    public Subscription withRedrivePolicy(Object redrivePolicy) {
        this.redrivePolicy = redrivePolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region
     * 
     */
    @JsonIgnore
    public CharSequence getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region
     * 
     */
    @JsonIgnore
    public void setRegion(CharSequence region) {
        this.region = region;
    }

    public Subscription withRegion(CharSequence region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn
     * 
     */
    @JsonIgnore
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn
     * 
     */
    @JsonIgnore
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public Subscription withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryPolicy", deliveryPolicy).append("endpoint", endpoint).append("filterPolicy", filterPolicy).append("protocol", protocol).append("rawMessageDelivery", rawMessageDelivery).append("redrivePolicy", redrivePolicy).append("region", region).append("topicArn", topicArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deliveryPolicy).append(endpoint).append(protocol).append(redrivePolicy).append(filterPolicy).append(region).append(rawMessageDelivery).append(topicArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Subscription) == false) {
            return false;
        }
        Subscription rhs = ((Subscription) other);
        return new EqualsBuilder().append(deliveryPolicy, rhs.deliveryPolicy).append(endpoint, rhs.endpoint).append(protocol, rhs.protocol).append(redrivePolicy, rhs.redrivePolicy).append(filterPolicy, rhs.filterPolicy).append(region, rhs.region).append(rawMessageDelivery, rhs.rawMessageDelivery).append(topicArn, rhs.topicArn).isEquals();
    }

}
