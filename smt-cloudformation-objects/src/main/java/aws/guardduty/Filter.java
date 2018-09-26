
package aws.guardduty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Filter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Action",
    "Description",
    "DetectorId",
    "FindingCriteria",
    "Rank",
    "Name"
})
public class Filter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action
     * 
     */
    @JsonProperty("Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action")
    private CharSequence action;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid
     * 
     */
    @JsonProperty("DetectorId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid")
    private CharSequence detectorId;
    /**
     * FindingCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html
     * 
     */
    @JsonProperty("FindingCriteria")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html")
    private FindingCriteria findingCriteria;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank
     * 
     */
    @JsonProperty("Rank")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank")
    private Integer rank;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action
     * 
     */
    public CharSequence getAction() {
        return action;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-action
     * 
     */
    public void setAction(CharSequence action) {
        this.action = action;
    }

    public Filter withAction(CharSequence action) {
        this.action = action;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Filter withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid
     * 
     */
    public CharSequence getDetectorId() {
        return detectorId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-detectorid
     * 
     */
    public void setDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
    }

    public Filter withDetectorId(CharSequence detectorId) {
        this.detectorId = detectorId;
        return this;
    }

    /**
     * FindingCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html
     * 
     */
    public FindingCriteria getFindingCriteria() {
        return findingCriteria;
    }

    /**
     * FindingCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html
     * 
     */
    public void setFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
    }

    public Filter withFindingCriteria(FindingCriteria findingCriteria) {
        this.findingCriteria = findingCriteria;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank
     * 
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-rank
     * 
     */
    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Filter withRank(Integer rank) {
        this.rank = rank;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-guardduty-filter.html#cfn-guardduty-filter-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Filter withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("action", action).append("description", description).append("detectorId", detectorId).append("findingCriteria", findingCriteria).append("rank", rank).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(detectorId).append(findingCriteria).append(name).append(action).append(description).append(rank).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Filter) == false) {
            return false;
        }
        Filter rhs = ((Filter) other);
        return new EqualsBuilder().append(detectorId, rhs.detectorId).append(findingCriteria, rhs.findingCriteria).append(name, rhs.name).append(action, rhs.action).append(description, rhs.description).append(rank, rhs.rank).isEquals();
    }

}
