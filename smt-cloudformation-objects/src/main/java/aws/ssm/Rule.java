
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Rule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EnableNonSecurity",
    "PatchFilterGroup",
    "ApproveAfterDays",
    "ComplianceLevel"
})
public class Rule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity
     * 
     */
    @JsonProperty("EnableNonSecurity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity")
    private Boolean enableNonSecurity;
    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonProperty("PatchFilterGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html")
    private PatchFilterGroup patchFilterGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays
     * 
     */
    @JsonProperty("ApproveAfterDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays")
    private Integer approveAfterDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel
     * 
     */
    @JsonProperty("ComplianceLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel")
    private CharSequence complianceLevel;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity
     * 
     */
    public Boolean getEnableNonSecurity() {
        return enableNonSecurity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity
     * 
     */
    public void setEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
    }

    public Rule withEnableNonSecurity(Boolean enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
        return this;
    }

    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    public PatchFilterGroup getPatchFilterGroup() {
        return patchFilterGroup;
    }

    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    public void setPatchFilterGroup(PatchFilterGroup patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
    }

    public Rule withPatchFilterGroup(PatchFilterGroup patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays
     * 
     */
    public Integer getApproveAfterDays() {
        return approveAfterDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays
     * 
     */
    public void setApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
    }

    public Rule withApproveAfterDays(Integer approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel
     * 
     */
    public CharSequence getComplianceLevel() {
        return complianceLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel
     * 
     */
    public void setComplianceLevel(CharSequence complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    public Rule withComplianceLevel(CharSequence complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("enableNonSecurity", enableNonSecurity).append("patchFilterGroup", patchFilterGroup).append("approveAfterDays", approveAfterDays).append("complianceLevel", complianceLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(complianceLevel).append(patchFilterGroup).append(approveAfterDays).append(enableNonSecurity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rule) == false) {
            return false;
        }
        Rule rhs = ((Rule) other);
        return new EqualsBuilder().append(complianceLevel, rhs.complianceLevel).append(patchFilterGroup, rhs.patchFilterGroup).append(approveAfterDays, rhs.approveAfterDays).append(enableNonSecurity, rhs.enableNonSecurity).isEquals();
    }

}
