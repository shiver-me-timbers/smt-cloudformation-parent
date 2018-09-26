
package aws.glue;

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
 * Predicate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Logical",
    "Conditions"
})
public class Predicate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical
     * 
     */
    @JsonProperty("Logical")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical")
    private CharSequence logical;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions
     * 
     */
    @JsonProperty("Conditions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions")
    private List<Condition> conditions = new ArrayList<Condition>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical
     * 
     */
    public CharSequence getLogical() {
        return logical;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical
     * 
     */
    public void setLogical(CharSequence logical) {
        this.logical = logical;
    }

    public Predicate withLogical(CharSequence logical) {
        this.logical = logical;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions
     * 
     */
    public List<Condition> getConditions() {
        return conditions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions
     * 
     */
    public void setConditions(List<Condition> conditions) {
        this.conditions = conditions;
    }

    public Predicate withConditions(List<Condition> conditions) {
        this.conditions = conditions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("logical", logical).append("conditions", conditions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(conditions).append(logical).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Predicate) == false) {
            return false;
        }
        Predicate rhs = ((Predicate) other);
        return new EqualsBuilder().append(conditions, rhs.conditions).append(logical, rhs.logical).isEquals();
    }

}
