
package shiver.me.timbers.aws.pinpoint;

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
 * SegmentSegmentDimensions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Demographic",
    "Metrics",
    "Attributes",
    "Behavior",
    "UserAttributes",
    "Location"
})
public class SegmentSegmentDimensions implements Property<SegmentSegmentDimensions>
{

    /**
     * SegmentDemographic
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-demographic.html
     * 
     */
    @JsonProperty("Demographic")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-demographic.html")
    private Property<SegmentDemographic> demographic;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-metrics
     * 
     */
    @JsonProperty("Metrics")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-metrics")
    private Object metrics;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-attributes
     * 
     */
    @JsonProperty("Attributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-attributes")
    private Object attributes;
    /**
     * SegmentBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior.html
     * 
     */
    @JsonProperty("Behavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior.html")
    private Property<SegmentBehavior> behavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-userattributes
     * 
     */
    @JsonProperty("UserAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-userattributes")
    private Object userAttributes;
    /**
     * SegmentLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location.html
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location.html")
    private Property<SegmentLocation> location;

    /**
     * SegmentDemographic
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-demographic.html
     * 
     */
    @JsonIgnore
    public Property<SegmentDemographic> getDemographic() {
        return demographic;
    }

    /**
     * SegmentDemographic
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-demographic.html
     * 
     */
    @JsonIgnore
    public void setDemographic(Property<SegmentDemographic> demographic) {
        this.demographic = demographic;
    }

    public SegmentSegmentDimensions withDemographic(Property<SegmentDemographic> demographic) {
        this.demographic = demographic;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-metrics
     * 
     */
    @JsonIgnore
    public Object getMetrics() {
        return metrics;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-metrics
     * 
     */
    @JsonIgnore
    public void setMetrics(Object metrics) {
        this.metrics = metrics;
    }

    public SegmentSegmentDimensions withMetrics(Object metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-attributes
     * 
     */
    @JsonIgnore
    public Object getAttributes() {
        return attributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-attributes
     * 
     */
    @JsonIgnore
    public void setAttributes(Object attributes) {
        this.attributes = attributes;
    }

    public SegmentSegmentDimensions withAttributes(Object attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * SegmentBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior.html
     * 
     */
    @JsonIgnore
    public Property<SegmentBehavior> getBehavior() {
        return behavior;
    }

    /**
     * SegmentBehavior
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior.html
     * 
     */
    @JsonIgnore
    public void setBehavior(Property<SegmentBehavior> behavior) {
        this.behavior = behavior;
    }

    public SegmentSegmentDimensions withBehavior(Property<SegmentBehavior> behavior) {
        this.behavior = behavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-userattributes
     * 
     */
    @JsonIgnore
    public Object getUserAttributes() {
        return userAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions.html#cfn-pinpoint-segment-segmentdimensions-userattributes
     * 
     */
    @JsonIgnore
    public void setUserAttributes(Object userAttributes) {
        this.userAttributes = userAttributes;
    }

    public SegmentSegmentDimensions withUserAttributes(Object userAttributes) {
        this.userAttributes = userAttributes;
        return this;
    }

    /**
     * SegmentLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location.html
     * 
     */
    @JsonIgnore
    public Property<SegmentLocation> getLocation() {
        return location;
    }

    /**
     * SegmentLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-location.html
     * 
     */
    @JsonIgnore
    public void setLocation(Property<SegmentLocation> location) {
        this.location = location;
    }

    public SegmentSegmentDimensions withLocation(Property<SegmentLocation> location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("demographic", demographic).append("metrics", metrics).append("attributes", attributes).append("behavior", behavior).append("userAttributes", userAttributes).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(userAttributes).append(attributes).append(location).append(metrics).append(behavior).append(demographic).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentSegmentDimensions) == false) {
            return false;
        }
        SegmentSegmentDimensions rhs = ((SegmentSegmentDimensions) other);
        return new EqualsBuilder().append(userAttributes, rhs.userAttributes).append(attributes, rhs.attributes).append(location, rhs.location).append(metrics, rhs.metrics).append(behavior, rhs.behavior).append(demographic, rhs.demographic).isEquals();
    }

}
