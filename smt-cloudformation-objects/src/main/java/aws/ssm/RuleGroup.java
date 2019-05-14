
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RuleGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PatchRules"
})
public class RuleGroup implements Property<RuleGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules
     * 
     */
    @JsonProperty("PatchRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules")
    private List<Property<Rule>> patchRules = new ArrayList<Property<Rule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules
     * 
     */
    @JsonIgnore
    public List<Property<Rule>> getPatchRules() {
        return patchRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules
     * 
     */
    @JsonIgnore
    public void setPatchRules(List<Property<Rule>> patchRules) {
        this.patchRules = patchRules;
    }

    public RuleGroup withPatchRules(List<Property<Rule>> patchRules) {
        this.patchRules = patchRules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("patchRules", patchRules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patchRules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RuleGroup) == false) {
            return false;
        }
        RuleGroup rhs = ((RuleGroup) other);
        return new EqualsBuilder().append(patchRules, rhs.patchRules).isEquals();
    }

}
