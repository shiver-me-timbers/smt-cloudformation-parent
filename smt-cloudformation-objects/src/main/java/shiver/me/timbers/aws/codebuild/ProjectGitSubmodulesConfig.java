
package shiver.me.timbers.aws.codebuild;

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
 * ProjectGitSubmodulesConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FetchSubmodules"
})
public class ProjectGitSubmodulesConfig implements Property<ProjectGitSubmodulesConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules
     * 
     */
    @JsonProperty("FetchSubmodules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules")
    private CharSequence fetchSubmodules;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules
     * 
     */
    @JsonIgnore
    public CharSequence getFetchSubmodules() {
        return fetchSubmodules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules
     * 
     */
    @JsonIgnore
    public void setFetchSubmodules(CharSequence fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
    }

    public ProjectGitSubmodulesConfig withFetchSubmodules(CharSequence fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fetchSubmodules", fetchSubmodules).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fetchSubmodules).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectGitSubmodulesConfig) == false) {
            return false;
        }
        ProjectGitSubmodulesConfig rhs = ((ProjectGitSubmodulesConfig) other);
        return new EqualsBuilder().append(fetchSubmodules, rhs.fetchSubmodules).isEquals();
    }

}
