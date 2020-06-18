
package shiver.me.timbers.aws.dlm;

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
 * LifecyclePolicySchedule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TagsToAdd",
    "CreateRule",
    "VariableTags",
    "FastRestoreRule",
    "RetainRule",
    "CrossRegionCopyRules",
    "Name",
    "CopyTags"
})
public class LifecyclePolicySchedule implements Property<LifecyclePolicySchedule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd
     * 
     */
    @JsonProperty("TagsToAdd")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd")
    private List<Property<shiver.me.timbers.aws.Tag>> tagsToAdd = new ArrayList<Property<shiver.me.timbers.aws.Tag>>();
    /**
     * LifecyclePolicyCreateRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
     * 
     */
    @JsonProperty("CreateRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html")
    private Property<LifecyclePolicyCreateRule> createRule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-variabletags
     * 
     */
    @JsonProperty("VariableTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-variabletags")
    private List<Property<shiver.me.timbers.aws.Tag>> variableTags = new ArrayList<Property<shiver.me.timbers.aws.Tag>>();
    /**
     * LifecyclePolicyFastRestoreRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html
     * 
     */
    @JsonProperty("FastRestoreRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html")
    private Property<LifecyclePolicyFastRestoreRule> fastRestoreRule;
    /**
     * LifecyclePolicyCrossRegionCopyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
     * 
     */
    @JsonProperty("RetainRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html")
    private Property<LifecyclePolicyRetainRule> retainRule;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-crossregioncopyrules
     * 
     */
    @JsonProperty("CrossRegionCopyRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-crossregioncopyrules")
    private List<Property<LifecyclePolicyCrossRegionCopyRule>> crossRegionCopyRules = new ArrayList<Property<LifecyclePolicyCrossRegionCopyRule>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags
     * 
     */
    @JsonProperty("CopyTags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags")
    private CharSequence copyTags;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd
     * 
     */
    @JsonIgnore
    public List<Property<shiver.me.timbers.aws.Tag>> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd
     * 
     */
    @JsonIgnore
    public void setTagsToAdd(List<Property<shiver.me.timbers.aws.Tag>> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
    }

    public LifecyclePolicySchedule withTagsToAdd(List<Property<shiver.me.timbers.aws.Tag>> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
        return this;
    }

    /**
     * LifecyclePolicyCreateRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
     * 
     */
    @JsonIgnore
    public Property<LifecyclePolicyCreateRule> getCreateRule() {
        return createRule;
    }

    /**
     * LifecyclePolicyCreateRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
     * 
     */
    @JsonIgnore
    public void setCreateRule(Property<LifecyclePolicyCreateRule> createRule) {
        this.createRule = createRule;
    }

    public LifecyclePolicySchedule withCreateRule(Property<LifecyclePolicyCreateRule> createRule) {
        this.createRule = createRule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-variabletags
     * 
     */
    @JsonIgnore
    public List<Property<shiver.me.timbers.aws.Tag>> getVariableTags() {
        return variableTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-variabletags
     * 
     */
    @JsonIgnore
    public void setVariableTags(List<Property<shiver.me.timbers.aws.Tag>> variableTags) {
        this.variableTags = variableTags;
    }

    public LifecyclePolicySchedule withVariableTags(List<Property<shiver.me.timbers.aws.Tag>> variableTags) {
        this.variableTags = variableTags;
        return this;
    }

    /**
     * LifecyclePolicyFastRestoreRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html
     * 
     */
    @JsonIgnore
    public Property<LifecyclePolicyFastRestoreRule> getFastRestoreRule() {
        return fastRestoreRule;
    }

    /**
     * LifecyclePolicyFastRestoreRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-fastrestorerule.html
     * 
     */
    @JsonIgnore
    public void setFastRestoreRule(Property<LifecyclePolicyFastRestoreRule> fastRestoreRule) {
        this.fastRestoreRule = fastRestoreRule;
    }

    public LifecyclePolicySchedule withFastRestoreRule(Property<LifecyclePolicyFastRestoreRule> fastRestoreRule) {
        this.fastRestoreRule = fastRestoreRule;
        return this;
    }

    /**
     * LifecyclePolicyCrossRegionCopyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
     * 
     */
    @JsonIgnore
    public Property<LifecyclePolicyRetainRule> getRetainRule() {
        return retainRule;
    }

    /**
     * LifecyclePolicyCrossRegionCopyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-crossregioncopyretainrule.html
     * 
     */
    @JsonIgnore
    public void setRetainRule(Property<LifecyclePolicyRetainRule> retainRule) {
        this.retainRule = retainRule;
    }

    public LifecyclePolicySchedule withRetainRule(Property<LifecyclePolicyRetainRule> retainRule) {
        this.retainRule = retainRule;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-crossregioncopyrules
     * 
     */
    @JsonIgnore
    public List<Property<LifecyclePolicyCrossRegionCopyRule>> getCrossRegionCopyRules() {
        return crossRegionCopyRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-crossregioncopyrules
     * 
     */
    @JsonIgnore
    public void setCrossRegionCopyRules(List<Property<LifecyclePolicyCrossRegionCopyRule>> crossRegionCopyRules) {
        this.crossRegionCopyRules = crossRegionCopyRules;
    }

    public LifecyclePolicySchedule withCrossRegionCopyRules(List<Property<LifecyclePolicyCrossRegionCopyRule>> crossRegionCopyRules) {
        this.crossRegionCopyRules = crossRegionCopyRules;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public LifecyclePolicySchedule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags
     * 
     */
    @JsonIgnore
    public CharSequence getCopyTags() {
        return copyTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags
     * 
     */
    @JsonIgnore
    public void setCopyTags(CharSequence copyTags) {
        this.copyTags = copyTags;
    }

    public LifecyclePolicySchedule withCopyTags(CharSequence copyTags) {
        this.copyTags = copyTags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tagsToAdd", tagsToAdd).append("createRule", createRule).append("variableTags", variableTags).append("fastRestoreRule", fastRestoreRule).append("retainRule", retainRule).append("crossRegionCopyRules", crossRegionCopyRules).append("name", name).append("copyTags", copyTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(createRule).append(variableTags).append(crossRegionCopyRules).append(name).append(copyTags).append(fastRestoreRule).append(tagsToAdd).append(retainRule).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicySchedule) == false) {
            return false;
        }
        LifecyclePolicySchedule rhs = ((LifecyclePolicySchedule) other);
        return new EqualsBuilder().append(createRule, rhs.createRule).append(variableTags, rhs.variableTags).append(crossRegionCopyRules, rhs.crossRegionCopyRules).append(name, rhs.name).append(copyTags, rhs.copyTags).append(fastRestoreRule, rhs.fastRestoreRule).append(tagsToAdd, rhs.tagsToAdd).append(retainRule, rhs.retainRule).isEquals();
    }

}
