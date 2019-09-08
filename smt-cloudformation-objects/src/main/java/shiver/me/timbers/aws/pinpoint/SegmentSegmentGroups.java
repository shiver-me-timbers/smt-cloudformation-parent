
package shiver.me.timbers.aws.pinpoint;

import java.util.ArrayList;
import java.util.List;
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
 * SegmentSegmentGroups
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Groups",
    "Include"
})
public class SegmentSegmentGroups implements Property<SegmentSegmentGroups>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-groups
     * 
     */
    @JsonProperty("Groups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-groups")
    private List<Property<SegmentGroups>> groups = new ArrayList<Property<SegmentGroups>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-include
     * 
     */
    @JsonProperty("Include")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-include")
    private CharSequence include;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-groups
     * 
     */
    @JsonIgnore
    public List<Property<SegmentGroups>> getGroups() {
        return groups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-groups
     * 
     */
    @JsonIgnore
    public void setGroups(List<Property<SegmentGroups>> groups) {
        this.groups = groups;
    }

    public SegmentSegmentGroups withGroups(List<Property<SegmentGroups>> groups) {
        this.groups = groups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-include
     * 
     */
    @JsonIgnore
    public CharSequence getInclude() {
        return include;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-segment-segmentgroups.html#cfn-pinpoint-segment-segmentgroups-include
     * 
     */
    @JsonIgnore
    public void setInclude(CharSequence include) {
        this.include = include;
    }

    public SegmentSegmentGroups withInclude(CharSequence include) {
        this.include = include;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groups", groups).append("include", include).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groups).append(include).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SegmentSegmentGroups) == false) {
            return false;
        }
        SegmentSegmentGroups rhs = ((SegmentSegmentGroups) other);
        return new EqualsBuilder().append(groups, rhs.groups).append(include, rhs.include).isEquals();
    }

}
