
package shiver.me.timbers.aws.wafv2;

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
 * WebACLSizeConstraintStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FieldToMatch",
    "ComparisonOperator",
    "Size",
    "TextTransformations"
})
public class WebACLSizeConstraintStatement implements Property<WebACLSizeConstraintStatement>
{

    /**
     * WebACLFieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html")
    private Property<WebACLFieldToMatch> fieldToMatch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-comparisonoperator")
    private CharSequence comparisonOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-size
     * 
     */
    @JsonProperty("Size")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-size")
    private Number size;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-texttransformations")
    private List<Property<WebACLTextTransformation>> textTransformations = new ArrayList<Property<WebACLTextTransformation>>();

    /**
     * WebACLFieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html
     * 
     */
    @JsonIgnore
    public Property<WebACLFieldToMatch> getFieldToMatch() {
        return fieldToMatch;
    }

    /**
     * WebACLFieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html
     * 
     */
    @JsonIgnore
    public void setFieldToMatch(Property<WebACLFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    public WebACLSizeConstraintStatement withFieldToMatch(Property<WebACLFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-comparisonoperator
     * 
     */
    @JsonIgnore
    public CharSequence getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-comparisonoperator
     * 
     */
    @JsonIgnore
    public void setComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public WebACLSizeConstraintStatement withComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-size
     * 
     */
    @JsonIgnore
    public Number getSize() {
        return size;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-size
     * 
     */
    @JsonIgnore
    public void setSize(Number size) {
        this.size = size;
    }

    public WebACLSizeConstraintStatement withSize(Number size) {
        this.size = size;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<WebACLTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-sizeconstraintstatement.html#cfn-wafv2-webacl-sizeconstraintstatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public WebACLSizeConstraintStatement withTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fieldToMatch", fieldToMatch).append("comparisonOperator", comparisonOperator).append("size", size).append("textTransformations", textTransformations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fieldToMatch).append(size).append(comparisonOperator).append(textTransformations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLSizeConstraintStatement) == false) {
            return false;
        }
        WebACLSizeConstraintStatement rhs = ((WebACLSizeConstraintStatement) other);
        return new EqualsBuilder().append(fieldToMatch, rhs.fieldToMatch).append(size, rhs.size).append(comparisonOperator, rhs.comparisonOperator).append(textTransformations, rhs.textTransformations).isEquals();
    }

}
