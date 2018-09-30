
package aws.wafregional;

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
 * SizeConstraintSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SizeConstraints",
    "Name"
})
public class SizeConstraintSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints
     * 
     */
    @JsonProperty("SizeConstraints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints")
    private List<SizeConstraint> sizeConstraints = new ArrayList<SizeConstraint>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints
     * 
     */
    public List<SizeConstraint> getSizeConstraints() {
        return sizeConstraints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-sizeconstraints
     * 
     */
    public void setSizeConstraints(List<SizeConstraint> sizeConstraints) {
        this.sizeConstraints = sizeConstraints;
    }

    public SizeConstraintSet withSizeConstraints(List<SizeConstraint> sizeConstraints) {
        this.sizeConstraints = sizeConstraints;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-wafregional-sizeconstraintset.html#cfn-wafregional-sizeconstraintset-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public SizeConstraintSet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sizeConstraints", sizeConstraints).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sizeConstraints).append(name).toHashCode();
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
        return new EqualsBuilder().append(sizeConstraints, rhs.sizeConstraints).append(name, rhs.name).isEquals();
    }

}
