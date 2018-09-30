
package aws.wafregional;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * XssMatchTuple
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TextTransformation",
    "FieldToMatch"
})
public class XssMatchTuple {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation")
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation
     * 
     */
    public CharSequence getTextTransformation() {
        return textTransformation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafregional-xssmatchset-xssmatchtuple.html#cfn-wafregional-xssmatchset-xssmatchtuple-texttransformation
     * 
     */
    public void setTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
    }

    public XssMatchTuple withTextTransformation(CharSequence textTransformation) {
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

    public XssMatchTuple withFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("textTransformation", textTransformation).append("fieldToMatch", fieldToMatch).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textTransformation).append(fieldToMatch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof XssMatchTuple) == false) {
            return false;
        }
        XssMatchTuple rhs = ((XssMatchTuple) other);
        return new EqualsBuilder().append(textTransformation, rhs.textTransformation).append(fieldToMatch, rhs.fieldToMatch).isEquals();
    }

}
