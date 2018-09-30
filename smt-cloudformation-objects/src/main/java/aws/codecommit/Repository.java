
package aws.codecommit;

import java.util.ArrayList;
import java.util.List;
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RepositoryName",
    "Triggers",
    "RepositoryDescription"
})
public class Repository {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname
     * 
     */
    @JsonProperty("RepositoryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname")
    private CharSequence repositoryName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers
     * 
     */
    @JsonProperty("Triggers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers")
    private List<RepositoryTrigger> triggers = new ArrayList<RepositoryTrigger>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription
     * 
     */
    @JsonProperty("RepositoryDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription")
    private CharSequence repositoryDescription;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname
     * 
     */
    public CharSequence getRepositoryName() {
        return repositoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname
     * 
     */
    public void setRepositoryName(CharSequence repositoryName) {
        this.repositoryName = repositoryName;
    }

    public Repository withRepositoryName(CharSequence repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers
     * 
     */
    public List<RepositoryTrigger> getTriggers() {
        return triggers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers
     * 
     */
    public void setTriggers(List<RepositoryTrigger> triggers) {
        this.triggers = triggers;
    }

    public Repository withTriggers(List<RepositoryTrigger> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription
     * 
     */
    public CharSequence getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription
     * 
     */
    public void setRepositoryDescription(CharSequence repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    public Repository withRepositoryDescription(CharSequence repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("repositoryName", repositoryName).append("triggers", triggers).append("repositoryDescription", repositoryDescription).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(repositoryDescription).append(repositoryName).append(triggers).toHashCode();
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
        return new EqualsBuilder().append(repositoryDescription, rhs.repositoryDescription).append(repositoryName, rhs.repositoryName).append(triggers, rhs.triggers).isEquals();
    }

}
