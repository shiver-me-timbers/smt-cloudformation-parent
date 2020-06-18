
package shiver.me.timbers.aws.macie;

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
 * FindingsFilterFindingCriteria
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-findingcriteria.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Criterion"
})
public class FindingsFilterFindingCriteria implements Property<FindingsFilterFindingCriteria>
{

    /**
     * FindingsFilterCriterion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterion.html
     * 
     */
    @JsonProperty("Criterion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterion.html")
    private Property<FindingsFilterCriterion> criterion;

    /**
     * FindingsFilterCriterion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterion.html
     * 
     */
    @JsonIgnore
    public Property<FindingsFilterCriterion> getCriterion() {
        return criterion;
    }

    /**
     * FindingsFilterCriterion
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-macie-findingsfilter-criterion.html
     * 
     */
    @JsonIgnore
    public void setCriterion(Property<FindingsFilterCriterion> criterion) {
        this.criterion = criterion;
    }

    public FindingsFilterFindingCriteria withCriterion(Property<FindingsFilterCriterion> criterion) {
        this.criterion = criterion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("criterion", criterion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(criterion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FindingsFilterFindingCriteria) == false) {
            return false;
        }
        FindingsFilterFindingCriteria rhs = ((FindingsFilterFindingCriteria) other);
        return new EqualsBuilder().append(criterion, rhs.criterion).isEquals();
    }

}
