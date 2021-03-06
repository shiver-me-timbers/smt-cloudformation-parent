
package shiver.me.timbers.aws.ssm;

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
 * PatchBaselineRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApproveUntilDate",
    "EnableNonSecurity",
    "PatchFilterGroup",
    "ApproveAfterDays",
    "ComplianceLevel"
})
public class PatchBaselineRule implements Property<PatchBaselineRule>
{

    /**
     * PatchBaselinePatchStringDate
     * <p>
     * 
     * 
     */
    @JsonProperty("ApproveUntilDate")
    private CharSequence approveUntilDate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity
     * 
     */
    @JsonProperty("EnableNonSecurity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity")
    private CharSequence enableNonSecurity;
    /**
     * PatchBaselinePatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonProperty("PatchFilterGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html")
    private Property<PatchBaselinePatchFilterGroup> patchFilterGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays
     * 
     */
    @JsonProperty("ApproveAfterDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays")
    private Number approveAfterDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel
     * 
     */
    @JsonProperty("ComplianceLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel")
    private CharSequence complianceLevel;

    /**
     * PatchBaselinePatchStringDate
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public CharSequence getApproveUntilDate() {
        return approveUntilDate;
    }

    /**
     * PatchBaselinePatchStringDate
     * <p>
     * 
     * 
     */
    @JsonIgnore
    public void setApproveUntilDate(CharSequence approveUntilDate) {
        this.approveUntilDate = approveUntilDate;
    }

    public PatchBaselineRule withApproveUntilDate(CharSequence approveUntilDate) {
        this.approveUntilDate = approveUntilDate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity
     * 
     */
    @JsonIgnore
    public CharSequence getEnableNonSecurity() {
        return enableNonSecurity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-enablenonsecurity
     * 
     */
    @JsonIgnore
    public void setEnableNonSecurity(CharSequence enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
    }

    public PatchBaselineRule withEnableNonSecurity(CharSequence enableNonSecurity) {
        this.enableNonSecurity = enableNonSecurity;
        return this;
    }

    /**
     * PatchBaselinePatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonIgnore
    public Property<PatchBaselinePatchFilterGroup> getPatchFilterGroup() {
        return patchFilterGroup;
    }

    /**
     * PatchBaselinePatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonIgnore
    public void setPatchFilterGroup(Property<PatchBaselinePatchFilterGroup> patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
    }

    public PatchBaselineRule withPatchFilterGroup(Property<PatchBaselinePatchFilterGroup> patchFilterGroup) {
        this.patchFilterGroup = patchFilterGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays
     * 
     */
    @JsonIgnore
    public Number getApproveAfterDays() {
        return approveAfterDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-approveafterdays
     * 
     */
    @JsonIgnore
    public void setApproveAfterDays(Number approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
    }

    public PatchBaselineRule withApproveAfterDays(Number approveAfterDays) {
        this.approveAfterDays = approveAfterDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel
     * 
     */
    @JsonIgnore
    public CharSequence getComplianceLevel() {
        return complianceLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rule.html#cfn-ssm-patchbaseline-rule-compliancelevel
     * 
     */
    @JsonIgnore
    public void setComplianceLevel(CharSequence complianceLevel) {
        this.complianceLevel = complianceLevel;
    }

    public PatchBaselineRule withComplianceLevel(CharSequence complianceLevel) {
        this.complianceLevel = complianceLevel;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("approveUntilDate", approveUntilDate).append("enableNonSecurity", enableNonSecurity).append("patchFilterGroup", patchFilterGroup).append("approveAfterDays", approveAfterDays).append("complianceLevel", complianceLevel).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(complianceLevel).append(patchFilterGroup).append(approveUntilDate).append(approveAfterDays).append(enableNonSecurity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatchBaselineRule) == false) {
            return false;
        }
        PatchBaselineRule rhs = ((PatchBaselineRule) other);
        return new EqualsBuilder().append(complianceLevel, rhs.complianceLevel).append(patchFilterGroup, rhs.patchFilterGroup).append(approveUntilDate, rhs.approveUntilDate).append(approveAfterDays, rhs.approveAfterDays).append(enableNonSecurity, rhs.enableNonSecurity).isEquals();
    }

}
