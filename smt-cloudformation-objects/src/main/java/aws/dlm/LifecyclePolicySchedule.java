
package aws.dlm;

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
 * LifecyclePolicySchedule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TagsToAdd",
    "CreateRule",
    "RetainRule",
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
    private List<Property<Tag>> tagsToAdd = new ArrayList<Property<Tag>>();
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
     * LifecyclePolicyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
     * 
     */
    @JsonProperty("RetainRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html")
    private Property<LifecyclePolicyRetainRule> retainRule;
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
    public List<Property<Tag>> getTagsToAdd() {
        return tagsToAdd;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd
     * 
     */
    @JsonIgnore
    public void setTagsToAdd(List<Property<Tag>> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
    }

    public LifecyclePolicySchedule withTagsToAdd(List<Property<Tag>> tagsToAdd) {
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
     * LifecyclePolicyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
     * 
     */
    @JsonIgnore
    public Property<LifecyclePolicyRetainRule> getRetainRule() {
        return retainRule;
    }

    /**
     * LifecyclePolicyRetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
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
        return new ToStringBuilder(this).append("tagsToAdd", tagsToAdd).append("createRule", createRule).append("retainRule", retainRule).append("name", name).append("copyTags", copyTags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(copyTags).append(tagsToAdd).append(createRule).append(retainRule).toHashCode();
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
        return new EqualsBuilder().append(name, rhs.name).append(copyTags, rhs.copyTags).append(tagsToAdd, rhs.tagsToAdd).append(createRule, rhs.createRule).append(retainRule, rhs.retainRule).isEquals();
    }

}
