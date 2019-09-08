
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
 * CampaignCampaignEventFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FilterType",
    "Dimensions"
})
public class CampaignCampaignEventFilter implements Property<CampaignCampaignEventFilter>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-filtertype
     * 
     */
    @JsonProperty("FilterType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-filtertype")
    private CharSequence filterType;
    /**
     * CampaignEventDimensions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html
     * 
     */
    @JsonProperty("Dimensions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html")
    private Property<CampaignEventDimensions> dimensions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-filtertype
     * 
     */
    @JsonIgnore
    public CharSequence getFilterType() {
        return filterType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-campaigneventfilter.html#cfn-pinpoint-campaign-campaigneventfilter-filtertype
     * 
     */
    @JsonIgnore
    public void setFilterType(CharSequence filterType) {
        this.filterType = filterType;
    }

    public CampaignCampaignEventFilter withFilterType(CharSequence filterType) {
        this.filterType = filterType;
        return this;
    }

    /**
     * CampaignEventDimensions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html
     * 
     */
    @JsonIgnore
    public Property<CampaignEventDimensions> getDimensions() {
        return dimensions;
    }

    /**
     * CampaignEventDimensions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpoint-campaign-eventdimensions.html
     * 
     */
    @JsonIgnore
    public void setDimensions(Property<CampaignEventDimensions> dimensions) {
        this.dimensions = dimensions;
    }

    public CampaignCampaignEventFilter withDimensions(Property<CampaignEventDimensions> dimensions) {
        this.dimensions = dimensions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("filterType", filterType).append("dimensions", dimensions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filterType).append(dimensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CampaignCampaignEventFilter) == false) {
            return false;
        }
        CampaignCampaignEventFilter rhs = ((CampaignCampaignEventFilter) other);
        return new EqualsBuilder().append(filterType, rhs.filterType).append(dimensions, rhs.dimensions).isEquals();
    }

}
