
package shiver.me.timbers.aws.cloud9;

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
 * EnvironmentEC2Repository
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PathComponent",
    "RepositoryUrl"
})
public class EnvironmentEC2Repository implements Property<EnvironmentEC2Repository>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent
     * 
     */
    @JsonProperty("PathComponent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent")
    private CharSequence pathComponent;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl
     * 
     */
    @JsonProperty("RepositoryUrl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl")
    private CharSequence repositoryUrl;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent
     * 
     */
    @JsonIgnore
    public CharSequence getPathComponent() {
        return pathComponent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent
     * 
     */
    @JsonIgnore
    public void setPathComponent(CharSequence pathComponent) {
        this.pathComponent = pathComponent;
    }

    public EnvironmentEC2Repository withPathComponent(CharSequence pathComponent) {
        this.pathComponent = pathComponent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl
     * 
     */
    @JsonIgnore
    public void setRepositoryUrl(CharSequence repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public EnvironmentEC2Repository withRepositoryUrl(CharSequence repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pathComponent", pathComponent).append("repositoryUrl", repositoryUrl).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pathComponent).append(repositoryUrl).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EnvironmentEC2Repository) == false) {
            return false;
        }
        EnvironmentEC2Repository rhs = ((EnvironmentEC2Repository) other);
        return new EqualsBuilder().append(pathComponent, rhs.pathComponent).append(repositoryUrl, rhs.repositoryUrl).isEquals();
    }

}
