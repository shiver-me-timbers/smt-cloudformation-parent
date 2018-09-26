
package aws.waf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ByteMatchTuple
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FieldToMatch",
    "PositionalConstraint",
    "TargetString",
    "TargetStringBase64",
    "TextTransformation"
})
public class ByteMatchTuple {

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint
     * 
     */
    @JsonProperty("PositionalConstraint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint")
    private CharSequence positionalConstraint;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring
     * 
     */
    @JsonProperty("TargetString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring")
    private CharSequence targetString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64
     * 
     */
    @JsonProperty("TargetStringBase64")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64")
    private CharSequence targetStringBase64;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation
     * 
     */
    @JsonProperty("TextTransformation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation")
    private CharSequence textTransformation;

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    public FieldToMatch getFieldToMatch() {
        return fieldToMatch;
    }

    /**
     * FieldToMatch
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples-fieldtomatch.html
     * 
     */
    public void setFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
    }

    public ByteMatchTuple withFieldToMatch(FieldToMatch fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint
     * 
     */
    public CharSequence getPositionalConstraint() {
        return positionalConstraint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-positionalconstraint
     * 
     */
    public void setPositionalConstraint(CharSequence positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
    }

    public ByteMatchTuple withPositionalConstraint(CharSequence positionalConstraint) {
        this.positionalConstraint = positionalConstraint;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring
     * 
     */
    public CharSequence getTargetString() {
        return targetString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstring
     * 
     */
    public void setTargetString(CharSequence targetString) {
        this.targetString = targetString;
    }

    public ByteMatchTuple withTargetString(CharSequence targetString) {
        this.targetString = targetString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64
     * 
     */
    public CharSequence getTargetStringBase64() {
        return targetStringBase64;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-targetstringbase64
     * 
     */
    public void setTargetStringBase64(CharSequence targetStringBase64) {
        this.targetStringBase64 = targetStringBase64;
    }

    public ByteMatchTuple withTargetStringBase64(CharSequence targetStringBase64) {
        this.targetStringBase64 = targetStringBase64;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation
     * 
     */
    public CharSequence getTextTransformation() {
        return textTransformation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-bytematchset-bytematchtuples.html#cfn-waf-bytematchset-bytematchtuples-texttransformation
     * 
     */
    public void setTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
    }

    public ByteMatchTuple withTextTransformation(CharSequence textTransformation) {
        this.textTransformation = textTransformation;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fieldToMatch", fieldToMatch).append("positionalConstraint", positionalConstraint).append("targetString", targetString).append("targetStringBase64", targetStringBase64).append("textTransformation", textTransformation).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(textTransformation).append(fieldToMatch).append(targetStringBase64).append(positionalConstraint).append(targetString).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ByteMatchTuple) == false) {
            return false;
        }
        ByteMatchTuple rhs = ((ByteMatchTuple) other);
        return new EqualsBuilder().append(textTransformation, rhs.textTransformation).append(fieldToMatch, rhs.fieldToMatch).append(targetStringBase64, rhs.targetStringBase64).append(positionalConstraint, rhs.positionalConstraint).append(targetString, rhs.targetString).isEquals();
    }

}
