
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
 * PatchBaselineRuleGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PatchRules"
})
public class PatchBaselineRuleGroup implements Property<PatchBaselineRuleGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules
     * 
     */
    @JsonProperty("PatchRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules")
    private List<Property<PatchBaselineRule>> patchRules = new ArrayList<Property<PatchBaselineRule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules
     * 
     */
    @JsonIgnore
    public List<Property<PatchBaselineRule>> getPatchRules() {
        return patchRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html#cfn-ssm-patchbaseline-rulegroup-patchrules
     * 
     */
    @JsonIgnore
    public void setPatchRules(List<Property<PatchBaselineRule>> patchRules) {
        this.patchRules = patchRules;
    }

    public PatchBaselineRuleGroup withPatchRules(List<Property<PatchBaselineRule>> patchRules) {
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
        if ((other instanceof PatchBaselineRuleGroup) == false) {
            return false;
        }
        PatchBaselineRuleGroup rhs = ((PatchBaselineRuleGroup) other);
        return new EqualsBuilder().append(patchRules, rhs.patchRules).isEquals();
    }

}
