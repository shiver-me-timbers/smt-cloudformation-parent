
package aws.wafregional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SizeConstraint
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComparisonOperator",
    "Size",
    "TextTransformation",
    "FieldToMatch"
})
public class SizeConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator")
    private CharSequence comparisonOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size
     * 
     */
    @JsonProperty("Size")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size")
    private Integer size;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation")
    private CharSequence textTransformation;
    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html")
    private FieldToMatch fieldToMatch;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator
     * 
     */
    public CharSequence getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-comparisonoperator
     * 
     */
    public void setComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public SizeConstraint withComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size
     * 
     */
    public Integer getSize() {
        return size;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-size
     * 
     */
    public void setSize(Integer size) {
        this.size = size;
    }

    public SizeConstraint withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation
     * 
     */
    public CharSequence getTextTransformation() {
        return textTransformation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-sizeconstraintset-sizeconstraint.html#cfn-wafregional-sizeconstraintset-sizeconstraint-texttransformation
     * 
     */
    public void setTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
    }

    public SizeConstraint withTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
        return this;
    }

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html
     * 
     */
    public FieldToMatch getFieldToMatch() {
        return fieldToMatch;
    }

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-bytematchset-fieldtomatch.html
     * 
     */
    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    public SizeConstraint withFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comparisonOperator", comparisonOperator).append("size", size).append("textTransformation", textTransformation).append("fieldToMatch", fieldToMatch).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textTransformation).append(fieldToMatch).append(size).append(comparisonOperator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SizeConstraint) == false) {
            return false;
        }
        SizeConstraint rhs = ((SizeConstraint) other);
        return new EqualsBuilder().append(textTransformation, rhs.textTransformation).append(fieldToMatch, rhs.fieldToMatch).append(size, rhs.size).append(comparisonOperator, rhs.comparisonOperator).isEquals();
    }

}
