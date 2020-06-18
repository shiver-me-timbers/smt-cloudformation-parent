
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
 * RuleGroupSqliMatchStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FieldToMatch",
    "TextTransformations"
})
public class RuleGroupSqliMatchStatement implements Property<RuleGroupSqliMatchStatement>
{

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-texttransformations
     * 
     */
    @JsonProperty("TextTransformations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-texttransformations")
    private List<Property<RuleGroupTextTransformation>> textTransformations = new ArrayList<Property<RuleGroupTextTransformation>>();

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

    public RuleGroupSqliMatchStatement withFieldToMatch(Property<RuleGroupFieldToMatch> fieldToMatch) {
        this.fieldToMatch = fieldToMatch;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public List<Property<RuleGroupTextTransformation>> getTextTransformations() {
        return textTransformations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-sqlimatchstatement.html#cfn-wafv2-rulegroup-sqlimatchstatement-texttransformations
     * 
     */
    @JsonIgnore
    public void setTextTransformations(List<Property<RuleGroupTextTransformation>> textTransformations) {
        this.textTransformations = textTransformations;
    }

    public RuleGroupSqliMatchStatement withTextTransformations(List<Property<RuleGroupTextTransformation>> textTransformations) {
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
        if ((other instanceof RuleGroupSqliMatchStatement) == false) {
            return false;
        }
        RuleGroupSqliMatchStatement rhs = ((RuleGroupSqliMatchStatement) other);
        return new EqualsBuilder().append(textTransformations, rhs.textTransformations).append(fieldToMatch, rhs.fieldToMatch).isEquals();
    }

}
