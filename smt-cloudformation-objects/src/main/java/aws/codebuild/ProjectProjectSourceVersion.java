
package aws.codebuild;

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
 * ProjectProjectSourceVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourceIdentifier",
    "SourceVersion"
})
public class ProjectProjectSourceVersion implements Property<ProjectProjectSourceVersion>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceidentifier
     * 
     */
    @JsonProperty("SourceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceidentifier")
    private CharSequence sourceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceversion
     * 
     */
    @JsonProperty("SourceVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceversion")
    private CharSequence sourceVersion;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceidentifier
     * 
     */
    @JsonIgnore
    public void setSourceIdentifier(CharSequence sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public ProjectProjectSourceVersion withSourceIdentifier(CharSequence sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceversion
     * 
     */
    @JsonIgnore
    public CharSequence getSourceVersion() {
        return sourceVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectsourceversion.html#cfn-codebuild-project-projectsourceversion-sourceversion
     * 
     */
    @JsonIgnore
    public void setSourceVersion(CharSequence sourceVersion) {
        this.sourceVersion = sourceVersion;
    }

    public ProjectProjectSourceVersion withSourceVersion(CharSequence sourceVersion) {
        this.sourceVersion = sourceVersion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourceIdentifier", sourceIdentifier).append("sourceVersion", sourceVersion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceVersion).append(sourceIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectProjectSourceVersion) == false) {
            return false;
        }
        ProjectProjectSourceVersion rhs = ((ProjectProjectSourceVersion) other);
        return new EqualsBuilder().append(sourceVersion, rhs.sourceVersion).append(sourceIdentifier, rhs.sourceIdentifier).isEquals();
    }

}
