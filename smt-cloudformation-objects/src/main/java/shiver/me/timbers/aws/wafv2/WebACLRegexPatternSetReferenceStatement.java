
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
 * WebACLRegexPatternSetReferenceStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Arn",
    "FieldToMatch",
    "TextTransformations"
})
public class WebACLRegexPatternSetReferenceStatement implements Property<WebACLRegexPatternSetReferenceStatement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-arn")
    private CharSequence arn;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-texttransformations")
    private List<Property<WebACLTextTransformation>> textTransformations = new ArrayList<Property<WebACLTextTransformation>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-arn
     * 
     */
    @JsonIgnore
    public CharSequence getArn() {
        return arn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-arn
     * 
     */
    @JsonIgnore
    public void setArn(CharSequence arn) {
        this.arn = arn;
    }

    public WebACLRegexPatternSetReferenceStatement withArn(CharSequence arn) {
        this.arn = arn;
        return this;
    }

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

    public WebACLRegexPatternSetReferenceStatement withFieldToMatch(Property<WebACLFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<WebACLTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-regexpatternsetreferencestatement.html#cfn-wafv2-webacl-regexpatternsetreferencestatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public WebACLRegexPatternSetReferenceStatement withTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
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
        if ((other instanceof WebACLRegexPatternSetReferenceStatement) == false) {
            return false;
        }
        WebACLRegexPatternSetReferenceStatement rhs = ((WebACLRegexPatternSetReferenceStatement) other);
        return new EqualsBuilder().append(fieldToMatch, rhs.fieldToMatch).append(arn, rhs.arn).append(textTransformations, rhs.textTransformations).isEquals();
    }

}
