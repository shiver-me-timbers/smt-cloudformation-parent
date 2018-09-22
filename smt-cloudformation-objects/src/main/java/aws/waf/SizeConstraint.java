
package aws.waf;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComparisonOperator",
    "FieldToMatch",
    "Size",
    "TextTransformation"
})
public class SizeConstraint {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-comparisonoperator")
    private String comparisonOperator;
    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html")
    private FieldToMatch fieldToMatch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-size
     * 
     */
    @JsonProperty("Size")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-size")
    private Integer size;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-texttransformation")
    private String textTransformation;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    public String getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    public void setComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public SizeConstraint withComparisonOperator(String comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    public FieldToMatch getFieldToMatch() {
        return fieldToMatch;
    }

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    public SizeConstraint withFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-size
     * 
     */
    @JsonProperty("Size")
    public Integer getSize() {
        return size;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-size
     * 
     */
    @JsonProperty("Size")
    public void setSize(Integer size) {
        this.size = size;
    }

    public SizeConstraint withSize(Integer size) {
        this.size = size;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    public String getTextTransformation() {
        return textTransformation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-sizeconstraintset-sizeconstraint.html#cfn-waf-sizeconstraintset-sizeconstraint-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    public void setTextTransformation(String textTransformation) {
        this.textTransformation = textTransformation;
    }

    public SizeConstraint withTextTransformation(String textTransformation) {
        this.textTransformation = textTransformation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comparisonOperator", comparisonOperator).append("fieldToMatch", fieldToMatch).append("size", size).append("textTransformation", textTransformation).toString();
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
