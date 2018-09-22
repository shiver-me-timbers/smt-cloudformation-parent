
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PatchBaseline
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OperatingSystem",
    "ApprovedPatches",
    "PatchGroups",
    "Description",
    "ApprovedPatchesComplianceLevel",
    "ApprovedPatchesEnableNonSecurity",
    "ApprovalRules",
    "GlobalFilters",
    "Sources",
    "Name",
    "RejectedPatches"
})
public class PatchBaseline {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem
     * 
     */
    @JsonProperty("OperatingSystem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem")
    private String operatingSystem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches
     * 
     */
    @JsonProperty("ApprovedPatches")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches")
    private List<String> approvedPatches = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups
     * 
     */
    @JsonProperty("PatchGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups")
    private List<String> patchGroups = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel
     * 
     */
    @JsonProperty("ApprovedPatchesComplianceLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel")
    private String approvedPatchesComplianceLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity
     * 
     */
    @JsonProperty("ApprovedPatchesEnableNonSecurity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity")
    private Boolean approvedPatchesEnableNonSecurity;
    /**
     * RuleGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
     * 
     */
    @JsonProperty("ApprovalRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html")
    private RuleGroup approvalRules;
    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonProperty("GlobalFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html")
    private PatchFilterGroup globalFilters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources
     * 
     */
    @JsonProperty("Sources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources")
    private List<PatchSource> sources = new ArrayList<PatchSource>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches
     * 
     */
    @JsonProperty("RejectedPatches")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches")
    private List<String> rejectedPatches = new ArrayList<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem
     * 
     */
    @JsonProperty("OperatingSystem")
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem
     * 
     */
    @JsonProperty("OperatingSystem")
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public PatchBaseline withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches
     * 
     */
    @JsonProperty("ApprovedPatches")
    public List<String> getApprovedPatches() {
        return approvedPatches;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches
     * 
     */
    @JsonProperty("ApprovedPatches")
    public void setApprovedPatches(List<String> approvedPatches) {
        this.approvedPatches = approvedPatches;
    }

    public PatchBaseline withApprovedPatches(List<String> approvedPatches) {
        this.approvedPatches = approvedPatches;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups
     * 
     */
    @JsonProperty("PatchGroups")
    public List<String> getPatchGroups() {
        return patchGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups
     * 
     */
    @JsonProperty("PatchGroups")
    public void setPatchGroups(List<String> patchGroups) {
        this.patchGroups = patchGroups;
    }

    public PatchBaseline withPatchGroups(List<String> patchGroups) {
        this.patchGroups = patchGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public PatchBaseline withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel
     * 
     */
    @JsonProperty("ApprovedPatchesComplianceLevel")
    public String getApprovedPatchesComplianceLevel() {
        return approvedPatchesComplianceLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel
     * 
     */
    @JsonProperty("ApprovedPatchesComplianceLevel")
    public void setApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    public PatchBaseline withApprovedPatchesComplianceLevel(String approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity
     * 
     */
    @JsonProperty("ApprovedPatchesEnableNonSecurity")
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return approvedPatchesEnableNonSecurity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity
     * 
     */
    @JsonProperty("ApprovedPatchesEnableNonSecurity")
    public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
    }

    public PatchBaseline withApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }

    /**
     * RuleGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
     * 
     */
    @JsonProperty("ApprovalRules")
    public RuleGroup getApprovalRules() {
        return approvalRules;
    }

    /**
     * RuleGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
     * 
     */
    @JsonProperty("ApprovalRules")
    public void setApprovalRules(RuleGroup approvalRules) {
        this.approvalRules = approvalRules;
    }

    public PatchBaseline withApprovalRules(RuleGroup approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }

    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonProperty("GlobalFilters")
    public PatchFilterGroup getGlobalFilters() {
        return globalFilters;
    }

    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonProperty("GlobalFilters")
    public void setGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
    }

    public PatchBaseline withGlobalFilters(PatchFilterGroup globalFilters) {
        this.globalFilters = globalFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources
     * 
     */
    @JsonProperty("Sources")
    public List<PatchSource> getSources() {
        return sources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources
     * 
     */
    @JsonProperty("Sources")
    public void setSources(List<PatchSource> sources) {
        this.sources = sources;
    }

    public PatchBaseline withSources(List<PatchSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public PatchBaseline withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches
     * 
     */
    @JsonProperty("RejectedPatches")
    public List<String> getRejectedPatches() {
        return rejectedPatches;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches
     * 
     */
    @JsonProperty("RejectedPatches")
    public void setRejectedPatches(List<String> rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
    }

    public PatchBaseline withRejectedPatches(List<String> rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("operatingSystem", operatingSystem).append("approvedPatches", approvedPatches).append("patchGroups", patchGroups).append("description", description).append("approvedPatchesComplianceLevel", approvedPatchesComplianceLevel).append("approvedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity).append("approvalRules", approvalRules).append("globalFilters", globalFilters).append("sources", sources).append("name", name).append("rejectedPatches", rejectedPatches).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(approvedPatchesEnableNonSecurity).append(approvedPatches).append(sources).append(name).append(description).append(rejectedPatches).append(operatingSystem).append(approvalRules).append(globalFilters).append(patchGroups).append(approvedPatchesComplianceLevel).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatchBaseline) == false) {
            return false;
        }
        PatchBaseline rhs = ((PatchBaseline) other);
        return new EqualsBuilder().append(approvedPatchesEnableNonSecurity, rhs.approvedPatchesEnableNonSecurity).append(approvedPatches, rhs.approvedPatches).append(sources, rhs.sources).append(name, rhs.name).append(description, rhs.description).append(rejectedPatches, rhs.rejectedPatches).append(operatingSystem, rhs.operatingSystem).append(approvalRules, rhs.approvalRules).append(globalFilters, rhs.globalFilters).append(patchGroups, rhs.patchGroups).append(approvedPatchesComplianceLevel, rhs.approvedPatchesComplianceLevel).isEquals();
    }

}
