
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
 * Schedule
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
public class Schedule implements Property<Schedule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd
     * 
     */
    @JsonProperty("TagsToAdd")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-tagstoadd")
    private List<Property<Tag>> tagsToAdd = new ArrayList<Property<Tag>>();
    /**
     * CreateRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
     * 
     */
    @JsonProperty("CreateRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html")
    private Property<CreateRule> createRule;
    /**
     * RetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
     * 
     */
    @JsonProperty("RetainRule")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html")
    private Property<RetainRule> retainRule;
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
    private Boolean copyTags;

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

    public Schedule withTagsToAdd(List<Property<Tag>> tagsToAdd) {
        this.tagsToAdd = tagsToAdd;
        return this;
    }

    /**
     * CreateRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
     * 
     */
    @JsonIgnore
    public Property<CreateRule> getCreateRule() {
        return createRule;
    }

    /**
     * CreateRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-createrule.html
     * 
     */
    @JsonIgnore
    public void setCreateRule(Property<CreateRule> createRule) {
        this.createRule = createRule;
    }

    public Schedule withCreateRule(Property<CreateRule> createRule) {
        this.createRule = createRule;
        return this;
    }

    /**
     * RetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
     * 
     */
    @JsonIgnore
    public Property<RetainRule> getRetainRule() {
        return retainRule;
    }

    /**
     * RetainRule
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
     * 
     */
    @JsonIgnore
    public void setRetainRule(Property<RetainRule> retainRule) {
        this.retainRule = retainRule;
    }

    public Schedule withRetainRule(Property<RetainRule> retainRule) {
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

    public Schedule withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags
     * 
     */
    @JsonIgnore
    public Boolean getCopyTags() {
        return copyTags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-schedule.html#cfn-dlm-lifecyclepolicy-schedule-copytags
     * 
     */
    @JsonIgnore
    public void setCopyTags(Boolean copyTags) {
        this.copyTags = copyTags;
    }

    public Schedule withCopyTags(Boolean copyTags) {
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
        if ((other instanceof Schedule) == false) {
            return false;
        }
        Schedule rhs = ((Schedule) other);
        return new EqualsBuilder().append(name, rhs.name).append(copyTags, rhs.copyTags).append(tagsToAdd, rhs.tagsToAdd).append(createRule, rhs.createRule).append(retainRule, rhs.retainRule).isEquals();
    }

}
