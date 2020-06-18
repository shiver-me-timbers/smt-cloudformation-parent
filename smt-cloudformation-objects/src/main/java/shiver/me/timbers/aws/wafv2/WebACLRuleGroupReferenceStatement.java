
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
 * WebACLRuleGroupReferenceStatement
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Arn",
    "ExcludedRules"
})
public class WebACLRuleGroupReferenceStatement implements Property<WebACLRuleGroupReferenceStatement>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-arn
     * 
     */
    @JsonProperty("Arn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-arn")
    private CharSequence arn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-excludedrules
     * 
     */
    @JsonProperty("ExcludedRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-excludedrules")
    private List<Property<WebACLExcludedRule>> excludedRules = new ArrayList<Property<WebACLExcludedRule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-arn
     * 
     */
    @JsonIgnore
    public CharSequence getArn() {
        return arn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-arn
     * 
     */
    @JsonIgnore
    public void setArn(CharSequence arn) {
        this.arn = arn;
    }

    public WebACLRuleGroupReferenceStatement withArn(CharSequence arn) {
        this.arn = arn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-excludedrules
     * 
     */
    @JsonIgnore
    public List<Property<WebACLExcludedRule>> getExcludedRules() {
        return excludedRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-rulegroupreferencestatement.html#cfn-wafv2-webacl-rulegroupreferencestatement-excludedrules
     * 
     */
    @JsonIgnore
    public void setExcludedRules(List<Property<WebACLExcludedRule>> excludedRules) {
        this.excludedRules = excludedRules;
    }

    public WebACLRuleGroupReferenceStatement withExcludedRules(List<Property<WebACLExcludedRule>> excludedRules) {
        this.excludedRules = excludedRules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("arn", arn).append("excludedRules", excludedRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(arn).append(excludedRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLRuleGroupReferenceStatement) == false) {
            return false;
        }
        WebACLRuleGroupReferenceStatement rhs = ((WebACLRuleGroupReferenceStatement) other);
        return new EqualsBuilder().append(arn, rhs.arn).append(excludedRules, rhs.excludedRules).isEquals();
    }

}
