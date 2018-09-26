
package aws.waf;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SizeConstraintSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Name",
    "SizeConstraints"
})
public class SizeConstraintSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints
     * 
     */
    @JsonProperty("SizeConstraints")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints")
    private Set<SizeConstraint> sizeConstraints = new LinkedHashSet<SizeConstraint>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public SizeConstraintSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints
     * 
     */
    public Set<SizeConstraint> getSizeConstraints() {
        return sizeConstraints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-waf-sizeconstraintset.html#cfn-waf-sizeconstraintset-sizeconstraints
     * 
     */
    public void setSizeConstraints(Set<SizeConstraint> sizeConstraints) {
        this.sizeConstraints = sizeConstraints;
    }

    public SizeConstraintSet withSizeConstraints(Set<SizeConstraint> sizeConstraints) {
        this.sizeConstraints = sizeConstraints;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("sizeConstraints", sizeConstraints).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(sizeConstraints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SizeConstraintSet) == false) {
            return false;
        }
        SizeConstraintSet rhs = ((SizeConstraintSet) other);
        return new EqualsBuilder().append(name, rhs.name).append(sizeConstraints, rhs.sizeConstraints).isEquals();
    }

}
