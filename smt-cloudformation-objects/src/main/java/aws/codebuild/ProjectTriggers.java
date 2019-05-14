
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
 * ProjectTriggers
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FilterGroups",
    "Webhook"
})
public class ProjectTriggers implements Property<ProjectTriggers>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups
     * 
     */
    @JsonProperty("FilterGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups")
    private List<Property<FilterGroup>> filterGroups = new ArrayList<Property<FilterGroup>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook
     * 
     */
    @JsonProperty("Webhook")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook")
    private Boolean webhook;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups
     * 
     */
    @JsonIgnore
    public List<Property<FilterGroup>> getFilterGroups() {
        return filterGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-filtergroups
     * 
     */
    @JsonIgnore
    public void setFilterGroups(List<Property<FilterGroup>> filterGroups) {
        this.filterGroups = filterGroups;
    }

    public ProjectTriggers withFilterGroups(List<Property<FilterGroup>> filterGroups) {
        this.filterGroups = filterGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook
     * 
     */
    @JsonIgnore
    public Boolean getWebhook() {
        return webhook;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projecttriggers.html#cfn-codebuild-project-projecttriggers-webhook
     * 
     */
    @JsonIgnore
    public void setWebhook(Boolean webhook) {
        this.webhook = webhook;
    }

    public ProjectTriggers withWebhook(Boolean webhook) {
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
        if ((other instanceof ProjectTriggers) == false) {
            return false;
        }
        ProjectTriggers rhs = ((ProjectTriggers) other);
        return new EqualsBuilder().append(filterGroups, rhs.filterGroups).append(webhook, rhs.webhook).isEquals();
    }

}
