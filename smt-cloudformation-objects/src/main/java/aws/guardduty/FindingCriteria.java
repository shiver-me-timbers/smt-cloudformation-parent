
package aws.guardduty;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FindingCriteria
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Criterion",
    "ItemType"
})
public class FindingCriteria {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion
     * 
     */
    @JsonProperty("Criterion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion")
    private Object criterion;
    /**
     * Condition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
     * 
     */
    @JsonProperty("ItemType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html")
    private Condition itemType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion
     * 
     */
    public Object getCriterion() {
        return criterion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-findingcriteria.html#cfn-guardduty-filter-findingcriteria-criterion
     * 
     */
    public void setCriterion(Object criterion) {
        this.criterion = criterion;
    }

    public FindingCriteria withCriterion(Object criterion) {
        this.criterion = criterion;
        return this;
    }

    /**
     * Condition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
     * 
     */
    public Condition getItemType() {
        return itemType;
    }

    /**
     * Condition
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-guardduty-filter-condition.html
     * 
     */
    public void setItemType(Condition itemType) {
        this.itemType = itemType;
    }

    public FindingCriteria withItemType(Condition itemType) {
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
        if ((other instanceof FindingCriteria) == false) {
            return false;
        }
        FindingCriteria rhs = ((FindingCriteria) other);
        return new EqualsBuilder().append(itemType, rhs.itemType).append(criterion, rhs.criterion).isEquals();
    }

}
