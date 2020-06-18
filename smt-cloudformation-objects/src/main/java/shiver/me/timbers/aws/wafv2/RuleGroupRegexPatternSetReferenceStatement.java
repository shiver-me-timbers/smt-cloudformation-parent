
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
 * RuleGroupRegexPatternSetReferenceStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Arn",
    "FieldToMatch",
    "TextTransformations"
})
public class RuleGroupRegexPatternSetReferenceStatement implements Property<RuleGroupRegexPatternSetReferenceStatement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-arn")
    private CharSequence arn;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-texttransformations")
    private List<Property<RuleGroupTextTransformation>> textTransformations = new ArrayList<Property<RuleGroupTextTransformation>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-arn
     * 
     */
    @JsonIgnore
    public CharSequence getArn() {
        return arn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-arn
     * 
     */
    @JsonIgnore
    public void setArn(CharSequence arn) {
        this.arn = arn;
    }

    public RuleGroupRegexPatternSetReferenceStatement withArn(CharSequence arn) {
        this.arn = arn;
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

    public RuleGroupRegexPatternSetReferenceStatement withFieldToMatch(Property<RuleGroupFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<RuleGroupTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-regexpatternsetreferencestatement.html#cfn-wafv2-rulegroup-regexpatternsetreferencestatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<RuleGroupTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public RuleGroupRegexPatternSetReferenceStatement withTextTransformations(List<Property<RuleGroupTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arn", arn).append("fieldToMatch", fieldToMatch).append("textTransformations", textTransformations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fieldToMatch).append(arn).append(textTransformations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroupRegexPatternSetReferenceStatement) == false) {
            return false;
        }
        RuleGroupRegexPatternSetReferenceStatement rhs = ((RuleGroupRegexPatternSetReferenceStatement) other);
        return new EqualsBuilder().append(fieldToMatch, rhs.fieldToMatch).append(arn, rhs.arn).append(textTransformations, rhs.textTransformations).isEquals();
    }

}
