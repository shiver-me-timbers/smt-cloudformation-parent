
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
 * WebACLXssMatchStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FieldToMatch",
    "TextTransformations"
})
public class WebACLXssMatchStatement implements Property<WebACLXssMatchStatement>
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-texttransformations")
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

    public WebACLXssMatchStatement withFieldToMatch(Property<WebACLFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<WebACLTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-xssmatchstatement.html#cfn-wafv2-webacl-xssmatchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public WebACLXssMatchStatement withTextTransformations(List<Property<WebACLTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fieldToMatch", fieldToMatch).append("textTransformations", textTransformations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textTransformations).append(fieldToMatch).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLXssMatchStatement) == false) {
            return false;
        }
        WebACLXssMatchStatement rhs = ((WebACLXssMatchStatement) other);
        return new EqualsBuilder().append(textTransformations, rhs.textTransformations).append(fieldToMatch, rhs.fieldToMatch).isEquals();
    }

}
