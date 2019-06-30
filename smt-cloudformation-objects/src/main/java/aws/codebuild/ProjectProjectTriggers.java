
package aws.codebuild;

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
 * ProjectProjectTriggers
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FilterGroups",
    "Webhook"
})
public class ProjectProjectTriggers implements Property<ProjectProjectTriggers>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups
     * 
     */
    @JsonProperty("FilterGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups")
    private List<Property<ProjectFilterGroup>> filterGroups = new ArrayList<Property<ProjectFilterGroup>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook
     * 
     */
    @JsonProperty("Webhook")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook")
    private CharSequence webhook;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups
     * 
     */
    @JsonIgnore
    public List<Property<ProjectFilterGroup>> getFilterGroups() {
        return filterGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups
     * 
     */
    @JsonIgnore
    public void setFilterGroups(List<Property<ProjectFilterGroup>> filterGroups) {
        this.filterGroups = filterGroups;
    }

    public ProjectProjectTriggers withFilterGroups(List<Property<ProjectFilterGroup>> filterGroups) {
        this.filterGroups = filterGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook
     * 
     */
    @JsonIgnore
    public CharSequence getWebhook() {
        return webhook;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook
     * 
     */
    @JsonIgnore
    public void setWebhook(CharSequence webhook) {
        this.webhook = webhook;
    }

    public ProjectProjectTriggers withWebhook(CharSequence webhook) {
        this.webhook = webhook;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("filterGroups", filterGroups).append("webhook", webhook).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filterGroups).append(webhook).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectProjectTriggers) == false) {
            return false;
        }
        ProjectProjectTriggers rhs = ((ProjectProjectTriggers) other);
        return new EqualsBuilder().append(filterGroups, rhs.filterGroups).append(webhook, rhs.webhook).isEquals();
    }

}
