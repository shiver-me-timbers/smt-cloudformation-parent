
package aws.autoscalingplans;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CloudFormationStackARN",
    "TagFilters"
})
public class ApplicationSource {

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
    private List<TagFilter> tagFilters = new ArrayList<TagFilter>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn
     * 
     */
    public CharSequence getCloudFormationStackARN() {
        return cloudFormationStackARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-cloudformationstackarn
     * 
     */
    public void setCloudFormationStackARN(CharSequence cloudFormationStackARN) {
        this.cloudFormationStackARN = cloudFormationStackARN;
    }

    public ApplicationSource withCloudFormationStackARN(CharSequence cloudFormationStackARN) {
        this.cloudFormationStackARN = cloudFormationStackARN;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters
     * 
     */
    public List<TagFilter> getTagFilters() {
        return tagFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-autoscalingplans-scalingplan-applicationsource.html#cfn-autoscalingplans-scalingplan-applicationsource-tagfilters
     * 
     */
    public void setTagFilters(List<TagFilter> tagFilters) {
        this.tagFilters = tagFilters;
    }

    public ApplicationSource withTagFilters(List<TagFilter> tagFilters) {
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
        if ((other instanceof ApplicationSource) == false) {
            return false;
        }
        ApplicationSource rhs = ((ApplicationSource) other);
        return new EqualsBuilder().append(cloudFormationStackARN, rhs.cloudFormationStackARN).append(tagFilters, rhs.tagFilters).isEquals();
    }

}
