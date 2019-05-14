
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OperatingSystem",
    "Description",
    "ApprovalRules",
    "Sources",
    "Name",
    "RejectedPatches",
    "ApprovedPatches",
    "RejectedPatchesAction",
    "PatchGroups",
    "ApprovedPatchesComplianceLevel",
    "ApprovedPatchesEnableNonSecurity",
    "GlobalFilters",
    "Tags"
})
public class PatchBaseline {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem
     * 
     */
    @JsonProperty("OperatingSystem")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem")
    private CharSequence operatingSystem;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description")
    private CharSequence description;
    /**
     * RuleGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
     * 
     */
    @JsonProperty("ApprovalRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html")
    private Property<RuleGroup> approvalRules;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources
     * 
     */
    @JsonProperty("Sources")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources")
    private List<Property<PatchSource>> sources = new ArrayList<Property<PatchSource>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches
     * 
     */
    @JsonProperty("RejectedPatches")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches")
    private List<CharSequence> rejectedPatches = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches
     * 
     */
    @JsonProperty("ApprovedPatches")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches")
    private List<CharSequence> approvedPatches = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction
     * 
     */
    @JsonProperty("RejectedPatchesAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction")
    private CharSequence rejectedPatchesAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups
     * 
     */
    @JsonProperty("PatchGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups")
    private List<CharSequence> patchGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel
     * 
     */
    @JsonProperty("ApprovedPatchesComplianceLevel")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel")
    private CharSequence approvedPatchesComplianceLevel;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity
     * 
     */
    @JsonProperty("ApprovedPatchesEnableNonSecurity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity")
    private Boolean approvedPatchesEnableNonSecurity;
    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonProperty("GlobalFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html")
    private Property<PatchFilterGroup> globalFilters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem
     * 
     */
    @JsonIgnore
    public CharSequence getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-operatingsystem
     * 
     */
    @JsonIgnore
    public void setOperatingSystem(CharSequence operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public PatchBaseline withOperatingSystem(CharSequence operatingSystem) {
        this.operatingSystem = operatingSystem;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public PatchBaseline withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * RuleGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
     * 
     */
    @JsonIgnore
    public Property<RuleGroup> getApprovalRules() {
        return approvalRules;
    }

    /**
     * RuleGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-rulegroup.html
     * 
     */
    @JsonIgnore
    public void setApprovalRules(Property<RuleGroup> approvalRules) {
        this.approvalRules = approvalRules;
    }

    public PatchBaseline withApprovalRules(Property<RuleGroup> approvalRules) {
        this.approvalRules = approvalRules;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources
     * 
     */
    @JsonIgnore
    public List<Property<PatchSource>> getSources() {
        return sources;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-sources
     * 
     */
    @JsonIgnore
    public void setSources(List<Property<PatchSource>> sources) {
        this.sources = sources;
    }

    public PatchBaseline withSources(List<Property<PatchSource>> sources) {
        this.sources = sources;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public PatchBaseline withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches
     * 
     */
    @JsonIgnore
    public List<CharSequence> getRejectedPatches() {
        return rejectedPatches;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatches
     * 
     */
    @JsonIgnore
    public void setRejectedPatches(List<CharSequence> rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
    }

    public PatchBaseline withRejectedPatches(List<CharSequence> rejectedPatches) {
        this.rejectedPatches = rejectedPatches;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches
     * 
     */
    @JsonIgnore
    public List<CharSequence> getApprovedPatches() {
        return approvedPatches;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatches
     * 
     */
    @JsonIgnore
    public void setApprovedPatches(List<CharSequence> approvedPatches) {
        this.approvedPatches = approvedPatches;
    }

    public PatchBaseline withApprovedPatches(List<CharSequence> approvedPatches) {
        this.approvedPatches = approvedPatches;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction
     * 
     */
    @JsonIgnore
    public CharSequence getRejectedPatchesAction() {
        return rejectedPatchesAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-rejectedpatchesaction
     * 
     */
    @JsonIgnore
    public void setRejectedPatchesAction(CharSequence rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
    }

    public PatchBaseline withRejectedPatchesAction(CharSequence rejectedPatchesAction) {
        this.rejectedPatchesAction = rejectedPatchesAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getPatchGroups() {
        return patchGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-patchgroups
     * 
     */
    @JsonIgnore
    public void setPatchGroups(List<CharSequence> patchGroups) {
        this.patchGroups = patchGroups;
    }

    public PatchBaseline withPatchGroups(List<CharSequence> patchGroups) {
        this.patchGroups = patchGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel
     * 
     */
    @JsonIgnore
    public CharSequence getApprovedPatchesComplianceLevel() {
        return approvedPatchesComplianceLevel;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchescompliancelevel
     * 
     */
    @JsonIgnore
    public void setApprovedPatchesComplianceLevel(CharSequence approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
    }

    public PatchBaseline withApprovedPatchesComplianceLevel(CharSequence approvedPatchesComplianceLevel) {
        this.approvedPatchesComplianceLevel = approvedPatchesComplianceLevel;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity
     * 
     */
    @JsonIgnore
    public Boolean getApprovedPatchesEnableNonSecurity() {
        return approvedPatchesEnableNonSecurity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-approvedpatchesenablenonsecurity
     * 
     */
    @JsonIgnore
    public void setApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
    }

    public PatchBaseline withApprovedPatchesEnableNonSecurity(Boolean approvedPatchesEnableNonSecurity) {
        this.approvedPatchesEnableNonSecurity = approvedPatchesEnableNonSecurity;
        return this;
    }

    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonIgnore
    public Property<PatchFilterGroup> getGlobalFilters() {
        return globalFilters;
    }

    /**
     * PatchFilterGroup
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
     * 
     */
    @JsonIgnore
    public void setGlobalFilters(Property<PatchFilterGroup> globalFilters) {
        this.globalFilters = globalFilters;
    }

    public PatchBaseline withGlobalFilters(Property<PatchFilterGroup> globalFilters) {
        this.globalFilters = globalFilters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ssm-patchbaseline.html#cfn-ssm-patchbaseline-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public PatchBaseline withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("operatingSystem", operatingSystem).append("description", description).append("approvalRules", approvalRules).append("sources", sources).append("name", name).append("rejectedPatches", rejectedPatches).append("approvedPatches", approvedPatches).append("rejectedPatchesAction", rejectedPatchesAction).append("patchGroups", patchGroups).append("approvedPatchesComplianceLevel", approvedPatchesComplianceLevel).append("approvedPatchesEnableNonSecurity", approvedPatchesEnableNonSecurity).append("globalFilters", globalFilters).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(approvedPatches).append(sources).append(description).append(operatingSystem).append(approvalRules).append(tags).append(approvedPatchesEnableNonSecurity).append(rejectedPatchesAction).append(name).append(rejectedPatches).append(globalFilters).append(patchGroups).append(approvedPatchesComplianceLevel).toHashCode();
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
        return new EqualsBuilder().append(approvedPatches, rhs.approvedPatches).append(sources, rhs.sources).append(description, rhs.description).append(operatingSystem, rhs.operatingSystem).append(approvalRules, rhs.approvalRules).append(tags, rhs.tags).append(approvedPatchesEnableNonSecurity, rhs.approvedPatchesEnableNonSecurity).append(rejectedPatchesAction, rhs.rejectedPatchesAction).append(name, rhs.name).append(rejectedPatches, rhs.rejectedPatches).append(globalFilters, rhs.globalFilters).append(patchGroups, rhs.patchGroups).append(approvedPatchesComplianceLevel, rhs.approvedPatchesComplianceLevel).isEquals();
    }

}
