
package aws.codecommit;

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
 * Repository
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RepositoryName",
    "Triggers",
    "Code",
    "RepositoryDescription",
    "Tags"
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
    private List<Property<RepositoryRepositoryTrigger>> triggers = new ArrayList<Property<RepositoryRepositoryTrigger>>();
    /**
     * RepositoryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html
     * 
     */
    @JsonProperty("Code")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html")
    private Property<RepositoryCode> code;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription
     * 
     */
    @JsonProperty("RepositoryDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription")
    private CharSequence repositoryDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryName() {
        return repositoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositoryname
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public List<Property<RepositoryRepositoryTrigger>> getTriggers() {
        return triggers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-triggers
     * 
     */
    @JsonIgnore
    public void setTriggers(List<Property<RepositoryRepositoryTrigger>> triggers) {
        this.triggers = triggers;
    }

    public Repository withTriggers(List<Property<RepositoryRepositoryTrigger>> triggers) {
        this.triggers = triggers;
        return this;
    }

    /**
     * RepositoryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html
     * 
     */
    @JsonIgnore
    public Property<RepositoryCode> getCode() {
        return code;
    }

    /**
     * RepositoryCode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codecommit-repository-code.html
     * 
     */
    @JsonIgnore
    public void setCode(Property<RepositoryCode> code) {
        this.code = code;
    }

    public Repository withCode(Property<RepositoryCode> code) {
        this.code = code;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription
     * 
     */
    @JsonIgnore
    public CharSequence getRepositoryDescription() {
        return repositoryDescription;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-repositorydescription
     * 
     */
    @JsonIgnore
    public void setRepositoryDescription(CharSequence repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
    }

    public Repository withRepositoryDescription(CharSequence repositoryDescription) {
        this.repositoryDescription = repositoryDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codecommit-repository.html#cfn-codecommit-repository-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Repository withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("repositoryName", repositoryName).append("triggers", triggers).append("code", code).append("repositoryDescription", repositoryDescription).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(repositoryDescription).append(code).append(repositoryName).append(triggers).append(tags).toHashCode();
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
        return new EqualsBuilder().append(repositoryDescription, rhs.repositoryDescription).append(code, rhs.code).append(repositoryName, rhs.repositoryName).append(triggers, rhs.triggers).append(tags, rhs.tags).isEquals();
    }

}
