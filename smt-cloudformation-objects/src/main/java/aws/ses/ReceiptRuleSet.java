
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReceiptRuleSet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RuleSetName"
})
public class ReceiptRuleSet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname
     * 
     */
    @JsonProperty("RuleSetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname")
    private CharSequence ruleSetName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname
     * 
     */
    public CharSequence getRuleSetName() {
        return ruleSetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ses-receiptruleset.html#cfn-ses-receiptruleset-rulesetname
     * 
     */
    public void setRuleSetName(CharSequence ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    public ReceiptRuleSet withRuleSetName(CharSequence ruleSetName) {
        this.ruleSetName = ruleSetName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ruleSetName", ruleSetName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ruleSetName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptRuleSet) == false) {
            return false;
        }
        ReceiptRuleSet rhs = ((ReceiptRuleSet) other);
        return new EqualsBuilder().append(ruleSetName, rhs.ruleSetName).isEquals();
    }

}
