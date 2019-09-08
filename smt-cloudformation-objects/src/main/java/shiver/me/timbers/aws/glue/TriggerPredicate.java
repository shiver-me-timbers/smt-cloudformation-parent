
package shiver.me.timbers.aws.glue;

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
 * TriggerPredicate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Logical",
    "Conditions"
})
public class TriggerPredicate implements Property<TriggerPredicate>
{

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
    private List<Property<TriggerCondition>> conditions = new ArrayList<Property<TriggerCondition>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical
     * 
     */
    @JsonIgnore
    public CharSequence getLogical() {
        return logical;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical
     * 
     */
    @JsonIgnore
    public void setLogical(CharSequence logical) {
        this.logical = logical;
    }

    public TriggerPredicate withLogical(CharSequence logical) {
        this.logical = logical;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions
     * 
     */
    @JsonIgnore
    public List<Property<TriggerCondition>> getConditions() {
        return conditions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions
     * 
     */
    @JsonIgnore
    public void setConditions(List<Property<TriggerCondition>> conditions) {
        this.conditions = conditions;
    }

    public TriggerPredicate withConditions(List<Property<TriggerCondition>> conditions) {
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
        if ((other instanceof TriggerPredicate) == false) {
            return false;
        }
        TriggerPredicate rhs = ((TriggerPredicate) other);
        return new EqualsBuilder().append(conditions, rhs.conditions).append(logical, rhs.logical).isEquals();
    }

}
