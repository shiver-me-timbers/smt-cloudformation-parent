
package aws.pinpoint;

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
 * CampaignEventDimensions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Metrics",
    "EventType",
    "Attributes"
})
public class CampaignEventDimensions implements Property<CampaignEventDimensions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-metrics
     * 
     */
    @JsonProperty("Metrics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-metrics")
    private Object metrics;
    /**
     * CampaignSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html
     * 
     */
    @JsonProperty("EventType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html")
    private Property<CampaignSetDimension> eventType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-attributes")
    private Object attributes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-metrics
     * 
     */
    @JsonIgnore
    public Object getMetrics() {
        return metrics;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-metrics
     * 
     */
    @JsonIgnore
    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    public CampaignEventDimensions withMetrics(Object metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * CampaignSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html
     * 
     */
    @JsonIgnore
    public Property<CampaignSetDimension> getEventType() {
        return eventType;
    }

    /**
     * CampaignSetDimension
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-setdimension.html
     * 
     */
    @JsonIgnore
    public void setEventType(Property<CampaignSetDimension> eventType) {
        this.eventType = eventType;
    }

    public CampaignEventDimensions withEventType(Property<CampaignSetDimension> eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-attributes
     * 
     */
    @JsonIgnore
    public Object getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html#cfn-pinpoint-campaign-eventdimensions-attributes
     * 
     */
    @JsonIgnore
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public CampaignEventDimensions withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("metrics", metrics).append("eventType", eventType).append("attributes", attributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(attributes).append(metrics).append(eventType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignEventDimensions) == false) {
            return false;
        }
        CampaignEventDimensions rhs = ((CampaignEventDimensions) other);
        return new EqualsBuilder().append(attributes, rhs.attributes).append(metrics, rhs.metrics).append(eventType, rhs.eventType).isEquals();
    }

}
