
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GitSubmodulesConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FetchSubmodules"
})
public class GitSubmodulesConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules
     * 
     */
    @JsonProperty("FetchSubmodules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules")
    private Boolean fetchSubmodules;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules
     * 
     */
    @JsonIgnore
    public Boolean getFetchSubmodules() {
        return fetchSubmodules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html#cfn-codebuild-project-gitsubmodulesconfig-fetchsubmodules
     * 
     */
    @JsonIgnore
    public void setFetchSubmodules(Boolean fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
    }

    public GitSubmodulesConfig withFetchSubmodules(Boolean fetchSubmodules) {
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
        if ((other instanceof GitSubmodulesConfig) == false) {
            return false;
        }
        GitSubmodulesConfig rhs = ((GitSubmodulesConfig) other);
        return new EqualsBuilder().append(fetchSubmodules, rhs.fetchSubmodules).isEquals();
    }

}
