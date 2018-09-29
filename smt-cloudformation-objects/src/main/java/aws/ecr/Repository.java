
package aws.ecr;

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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LifecyclePolicy",
    "RepositoryName",
    "RepositoryPolicyText"
})
public class Repository {

    /**
     * LifecyclePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
     * 
     */
    @JsonProperty("LifecyclePolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html")
    private LifecyclePolicy lifecyclePolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname
     * 
     */
    @JsonProperty("RepositoryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname")
    private CharSequence repositoryName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext
     * 
     */
    @JsonProperty("RepositoryPolicyText")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext")
    private Object repositoryPolicyText;

    /**
     * LifecyclePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
     * 
     */
    public LifecyclePolicy getLifecyclePolicy() {
        return lifecyclePolicy;
    }

    /**
     * LifecyclePolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
     * 
     */
    public void setLifecyclePolicy(LifecyclePolicy lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
    }

    public Repository withLifecyclePolicy(LifecyclePolicy lifecyclePolicy) {
        this.lifecyclePolicy = lifecyclePolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname
     * 
     */
    public CharSequence getRepositoryName() {
        return repositoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositoryname
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext
     * 
     */
    public Object getRepositoryPolicyText() {
        return repositoryPolicyText;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ecr-repository.html#cfn-ecr-repository-repositorypolicytext
     * 
     */
    public void setRepositoryPolicyText(Object repositoryPolicyText) {
        this.repositoryPolicyText = repositoryPolicyText;
    }

    public Repository withRepositoryPolicyText(Object repositoryPolicyText) {
        this.repositoryPolicyText = repositoryPolicyText;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lifecyclePolicy", lifecyclePolicy).append("repositoryName", repositoryName).append("repositoryPolicyText", repositoryPolicyText).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(repositoryPolicyText).append(lifecyclePolicy).append(repositoryName).toHashCode();
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
        return new EqualsBuilder().append(repositoryPolicyText, rhs.repositoryPolicyText).append(lifecyclePolicy, rhs.lifecyclePolicy).append(repositoryName, rhs.repositoryName).isEquals();
    }

}
