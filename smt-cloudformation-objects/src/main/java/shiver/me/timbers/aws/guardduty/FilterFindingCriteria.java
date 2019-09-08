
package shiver.me.timbers.aws.guardduty;

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
 * FilterFindingCriteria
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Criterion",
    "ItemType"
})
public class FilterFindingCriteria implements Property<FilterFindingCriteria>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion
     * 
     */
    @JsonProperty("Criterion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion")
    private Object criterion;
    /**
     * FilterCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
     * 
     */
    @JsonProperty("ItemType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html")
    private Property<FilterCondition> itemType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion
     * 
     */
    @JsonIgnore
    public Object getCriterion() {
        return criterion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion
     * 
     */
    @JsonIgnore
    public void setCriterion(Object criterion) {
        this.criterion = criterion;
    }

    public FilterFindingCriteria withCriterion(Object criterion) {
        this.criterion = criterion;
        return this;
    }

    /**
     * FilterCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
     * 
     */
    @JsonIgnore
    public Property<FilterCondition> getItemType() {
        return itemType;
    }

    /**
     * FilterCondition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
     * 
     */
    @JsonIgnore
    public void setItemType(Property<FilterCondition> itemType) {
        this.itemType = itemType;
    }

    public FilterFindingCriteria withItemType(Property<FilterCondition> itemType) {
        this.itemType = itemType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("criterion", criterion).append("itemType", itemType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(itemType).append(criterion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FilterFindingCriteria) == false) {
            return false;
        }
        FilterFindingCriteria rhs = ((FilterFindingCriteria) other);
        return new EqualsBuilder().append(itemType, rhs.itemType).append(criterion, rhs.criterion).isEquals();
    }

}
