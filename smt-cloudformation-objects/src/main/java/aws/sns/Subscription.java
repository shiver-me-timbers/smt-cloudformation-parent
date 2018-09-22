
package aws.sns;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeliveryPolicy",
    "Endpoint",
    "FilterPolicy",
    "Protocol",
    "RawMessageDelivery",
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
    private DeliveryPolicy deliveryPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint")
    private String endpoint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy
     * 
     */
    @JsonProperty("FilterPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy")
    private FilterPolicy filterPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol
     * 
     */
    @JsonProperty("Protocol")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol")
    private String protocol;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery
     * 
     */
    @JsonProperty("RawMessageDelivery")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery")
    private Boolean rawMessageDelivery;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region
     * 
     */
    @JsonProperty("Region")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region")
    private String region;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn")
    private String topicArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy
     * 
     */
    @JsonProperty("DeliveryPolicy")
    public DeliveryPolicy getDeliveryPolicy() {
        return deliveryPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-deliverypolicy
     * 
     */
    @JsonProperty("DeliveryPolicy")
    public void setDeliveryPolicy(DeliveryPolicy deliveryPolicy) {
        this.deliveryPolicy = deliveryPolicy;
    }

    public Subscription withDeliveryPolicy(DeliveryPolicy deliveryPolicy) {
        this.deliveryPolicy = deliveryPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    public String getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    public void setEndpoint(String endpoint) {
        this.endpoint = endpoint;
    }

    public Subscription withEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy
     * 
     */
    @JsonProperty("FilterPolicy")
    public FilterPolicy getFilterPolicy() {
        return filterPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-filterpolicy
     * 
     */
    @JsonProperty("FilterPolicy")
    public void setFilterPolicy(FilterPolicy filterPolicy) {
        this.filterPolicy = filterPolicy;
    }

    public Subscription withFilterPolicy(FilterPolicy filterPolicy) {
        this.filterPolicy = filterPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol
     * 
     */
    @JsonProperty("Protocol")
    public String getProtocol() {
        return protocol;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-protocol
     * 
     */
    @JsonProperty("Protocol")
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public Subscription withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery
     * 
     */
    @JsonProperty("RawMessageDelivery")
    public Boolean getRawMessageDelivery() {
        return rawMessageDelivery;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-rawmessagedelivery
     * 
     */
    @JsonProperty("RawMessageDelivery")
    public void setRawMessageDelivery(Boolean rawMessageDelivery) {
        this.rawMessageDelivery = rawMessageDelivery;
    }

    public Subscription withRawMessageDelivery(Boolean rawMessageDelivery) {
        this.rawMessageDelivery = rawMessageDelivery;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region
     * 
     */
    @JsonProperty("Region")
    public String getRegion() {
        return region;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#cfn-sns-subscription-region
     * 
     */
    @JsonProperty("Region")
    public void setRegion(String region) {
        this.region = region;
    }

    public Subscription withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn
     * 
     */
    @JsonProperty("TopicArn")
    public String getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sns-subscription.html#topicarn
     * 
     */
    @JsonProperty("TopicArn")
    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    public Subscription withTopicArn(String topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deliveryPolicy", deliveryPolicy).append("endpoint", endpoint).append("filterPolicy", filterPolicy).append("protocol", protocol).append("rawMessageDelivery", rawMessageDelivery).append("region", region).append("topicArn", topicArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deliveryPolicy).append(endpoint).append(protocol).append(filterPolicy).append(region).append(rawMessageDelivery).append(topicArn).toHashCode();
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
        return new EqualsBuilder().append(deliveryPolicy, rhs.deliveryPolicy).append(endpoint, rhs.endpoint).append(protocol, rhs.protocol).append(filterPolicy, rhs.filterPolicy).append(region, rhs.region).append(rawMessageDelivery, rhs.rawMessageDelivery).append(topicArn, rhs.topicArn).isEquals();
    }

}
