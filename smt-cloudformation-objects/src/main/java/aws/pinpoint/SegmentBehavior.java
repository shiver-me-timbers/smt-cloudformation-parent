
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
 * SegmentBehavior
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Recency"
})
public class SegmentBehavior implements Property<SegmentBehavior>
{

    /**
     * SegmentRecency
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior-recency.html
     * 
     */
    @JsonProperty("Recency")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior-recency.html")
    private Property<SegmentRecency> recency;

    /**
     * SegmentRecency
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior-recency.html
     * 
     */
    @JsonIgnore
    public Property<SegmentRecency> getRecency() {
        return recency;
    }

    /**
     * SegmentRecency
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentdimensions-behavior-recency.html
     * 
     */
    @JsonIgnore
    public void setRecency(Property<SegmentRecency> recency) {
        this.recency = recency;
    }

    public SegmentBehavior withRecency(Property<SegmentRecency> recency) {
        this.recency = recency;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recency", recency).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recency).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentBehavior) == false) {
            return false;
        }
        SegmentBehavior rhs = ((SegmentBehavior) other);
        return new EqualsBuilder().append(recency, rhs.recency).isEquals();
    }

}
