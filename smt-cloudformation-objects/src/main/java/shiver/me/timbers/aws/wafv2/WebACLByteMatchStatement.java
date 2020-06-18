
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
 * WebACLByteMatchStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html
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
public class WebACLByteMatchStatement implements Property<WebACLByteMatchStatement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstring
     * 
     */
    @JsonProperty("SearchString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstring")
    private CharSequence searchString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstringbase64
     * 
     */
    @JsonProperty("SearchStringBase64")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstringbase64")
    private CharSequence searchStringBase64;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-texttransformations")
    private List<Property<WebACLTextTransformation>> textTransformations = new ArrayList<Property<WebACLTextTransformation>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-positionalconstraint
     * 
     */
    @JsonProperty("PositionalConstraint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-positionalconstraint")
    private CharSequence positionalConstraint;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstring
     * 
     */
    @JsonIgnore
    public CharSequence getSearchString() {
        return searchString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstring
     * 
     */
    @JsonIgnore
    public void setSearchString(CharSequence searchString) {
        this.searchString = searchString;
    }

    public WebACLByteMatchStatement withSearchString(CharSequence searchString) {
        this.searchString = searchString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstringbase64
     * 
     */
    @JsonIgnore
    public CharSequence getSearchStringBase64() {
        return searchStringBase64;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-searchstringbase64
     * 
     */
    @JsonIgnore
    public void setSearchStringBase64(CharSequence searchStringBase64) {
        this.searchStringBase64 = searchStringBase64;
    }

    public WebACLByteMatchStatement withSearchStringBase64(CharSequence searchStringBase64) {
        this.searchStringBase64 = searchStringBase64;
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

    public WebACLByteMatchStatement withFieldToMatch(Property<WebACLFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<WebACLTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public WebACLByteMatchStatement withTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-positionalconstraint
     * 
     */
    @JsonIgnore
    public CharSequence getPositionalConstraint() {
        return positionalConstraint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-bytematchstatement.html#cfn-wafv2-webacl-bytematchstatement-positionalconstraint
     * 
     */
    @JsonIgnore
    public void setPositionalConstraint(CharSequence positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
    }

    public WebACLByteMatchStatement withPositionalConstraint(CharSequence positionalConstraint) {
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
        if ((other instanceof WebACLByteMatchStatement) == false) {
            return false;
        }
        WebACLByteMatchStatement rhs = ((WebACLByteMatchStatement) other);
        return new EqualsBuilder().append(searchString, rhs.searchString).append(fieldToMatch, rhs.fieldToMatch).append(positionalConstraint, rhs.positionalConstraint).append(searchStringBase64, rhs.searchStringBase64).append(textTransformations, rhs.textTransformations).isEquals();
    }

}
