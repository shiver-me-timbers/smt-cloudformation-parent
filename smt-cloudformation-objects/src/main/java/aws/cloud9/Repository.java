
package aws.cloud9;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Repository
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PathComponent",
    "RepositoryUrl"
})
public class Repository {

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
    public CharSequence getPathComponent() {
        return pathComponent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-pathcomponent
     * 
     */
    public void setPathComponent(CharSequence pathComponent) {
        this.pathComponent = pathComponent;
    }

    public Repository withPathComponent(CharSequence pathComponent) {
        this.pathComponent = pathComponent;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl
     * 
     */
    public CharSequence getRepositoryUrl() {
        return repositoryUrl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloud9-environmentec2-repository.html#cfn-cloud9-environmentec2-repository-repositoryurl
     * 
     */
    public void setRepositoryUrl(CharSequence repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
    }

    public Repository withRepositoryUrl(CharSequence repositoryUrl) {
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
        if ((other instanceof Repository) == false) {
            return false;
        }
        Repository rhs = ((Repository) other);
        return new EqualsBuilder().append(pathComponent, rhs.pathComponent).append(repositoryUrl, rhs.repositoryUrl).isEquals();
    }

}
