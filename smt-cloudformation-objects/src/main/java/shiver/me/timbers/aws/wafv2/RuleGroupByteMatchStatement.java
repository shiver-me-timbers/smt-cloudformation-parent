
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
 * RuleGroupByteMatchStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SearchString",
    "SearchStringBase64",
    "FieldToMatch",
    "TextTransformations",
    "PositionalConstraint"
})
public class RuleGroupByteMatchStatement implements Property<RuleGroupByteMatchStatement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstring
     * 
     */
    @JsonProperty("SearchString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstring")
    private CharSequence searchString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstringbase64
     * 
     */
    @JsonProperty("SearchStringBase64")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstringbase64")
    private CharSequence searchStringBase64;
    /**
     * RuleGroupFieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html
     * 
     */
    @JsonProperty("FieldToMatch")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html")
    private Property<RuleGroupFieldToMatch> fieldToMatch;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-texttransformations")
    private List<Property<RuleGroupTextTransformation>> textTransformations = new ArrayList<Property<RuleGroupTextTransformation>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-positionalconstraint
     * 
     */
    @JsonProperty("PositionalConstraint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-positionalconstraint")
    private CharSequence positionalConstraint;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstring
     * 
     */
    @JsonIgnore
    public CharSequence getSearchString() {
        return searchString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstring
     * 
     */
    @JsonIgnore
    public void setSearchString(CharSequence searchString) {
        this.searchString = searchString;
    }

    public RuleGroupByteMatchStatement withSearchString(CharSequence searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstringbase64
     * 
     */
    @JsonIgnore
    public CharSequence getSearchStringBase64() {
        return searchStringBase64;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-searchstringbase64
     * 
     */
    @JsonIgnore
    public void setSearchStringBase64(CharSequence searchStringBase64) {
        this.searchStringBase64 = searchStringBase64;
    }

    public RuleGroupByteMatchStatement withSearchStringBase64(CharSequence searchStringBase64) {
        this.searchStringBase64 = searchStringBase64;
        return this;
    }

    /**
     * RuleGroupFieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroupFieldToMatch> getFieldToMatch() {
        return fieldToMatch;
    }

    /**
     * RuleGroupFieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html
     * 
     */
    @JsonIgnore
    public void setFieldToMatch(Property<RuleGroupFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    public RuleGroupByteMatchStatement withFieldToMatch(Property<RuleGroupFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<RuleGroupTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<RuleGroupTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public RuleGroupByteMatchStatement withTextTransformations(List<Property<RuleGroupTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-positionalconstraint
     * 
     */
    @JsonIgnore
    public CharSequence getPositionalConstraint() {
        return positionalConstraint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-bytematchstatement.html#cfn-wafv2-rulegroup-bytematchstatement-positionalconstraint
     * 
     */
    @JsonIgnore
    public void setPositionalConstraint(CharSequence positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
    }

    public RuleGroupByteMatchStatement withPositionalConstraint(CharSequence positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("searchString", searchString).append("searchStringBase64", searchStringBase64).append("fieldToMatch", fieldToMatch).append("textTransformations", textTransformations).append("positionalConstraint", positionalConstraint).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(searchString).append(fieldToMatch).append(positionalConstraint).append(searchStringBase64).append(textTransformations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupByteMatchStatement) == false) {
            return false;
        }
        RuleGroupByteMatchStatement rhs = ((RuleGroupByteMatchStatement) other);
        return new EqualsBuilder().append(searchString, rhs.searchString).append(fieldToMatch, rhs.fieldToMatch).append(positionalConstraint, rhs.positionalConstraint).append(searchStringBase64, rhs.searchStringBase64).append(textTransformations, rhs.textTransformations).isEquals();
    }

}
