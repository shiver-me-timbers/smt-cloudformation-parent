
package shiver.me.timbers.aws.autoscalingplans;

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
 * ScalingPlanApplicationSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CloudFormationStackARN",
    "TagFilters"
})
public class ScalingPlanApplicationSource implements Property<ScalingPlanApplicationSource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn
     * 
     */
    @JsonProperty("CloudFormationStackARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn")
    private CharSequence cloudFormationStackARN;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters
     * 
     */
    @JsonProperty("TagFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters")
    private List<Property<ScalingPlanTagFilter>> tagFilters = new ArrayList<Property<ScalingPlanTagFilter>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn
     * 
     */
    @JsonIgnore
    public CharSequence getCloudFormationStackARN() {
        return cloudFormationStackARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn
     * 
     */
    @JsonIgnore
    public void setCloudFormationStackARN(CharSequence cloudFormationStackARN) {
        this.cloudFormationStackARN = cloudFormationStackARN;
    }

    public ScalingPlanApplicationSource withCloudFormationStackARN(CharSequence cloudFormationStackARN) {
        this.cloudFormationStackARN = cloudFormationStackARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters
     * 
     */
    @JsonIgnore
    public List<Property<ScalingPlanTagFilter>> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters
     * 
     */
    @JsonIgnore
    public void setTagFilters(List<Property<ScalingPlanTagFilter>> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public ScalingPlanApplicationSource withTagFilters(List<Property<ScalingPlanTagFilter>> tagFilters) {
        this.tagFilters = tagFilters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cloudFormationStackARN", cloudFormationStackARN).append("tagFilters", tagFilters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudFormationStackARN).append(tagFilters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ScalingPlanApplicationSource) == false) {
            return false;
        }
        ScalingPlanApplicationSource rhs = ((ScalingPlanApplicationSource) other);
        return new EqualsBuilder().append(cloudFormationStackARN, rhs.cloudFormationStackARN).append(tagFilters, rhs.tagFilters).isEquals();
    }

}
