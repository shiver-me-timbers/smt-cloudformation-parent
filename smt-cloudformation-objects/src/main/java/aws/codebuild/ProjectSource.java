
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
 * ProjectSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Type",
    "ReportBuildStatus",
    "Auth",
    "SourceIdentifier",
    "BuildSpec",
    "GitCloneDepth",
    "GitSubmodulesConfig",
    "InsecureSsl",
    "Location"
})
public class ProjectSource implements Property<ProjectSource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus
     * 
     */
    @JsonProperty("ReportBuildStatus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus")
    private CharSequence reportBuildStatus;
    /**
     * ProjectSourceAuth
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
     * 
     */
    @JsonProperty("Auth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html")
    private Property<ProjectSourceAuth> auth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier
     * 
     */
    @JsonProperty("SourceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier")
    private CharSequence sourceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec
     * 
     */
    @JsonProperty("BuildSpec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec")
    private CharSequence buildSpec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth
     * 
     */
    @JsonProperty("GitCloneDepth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth")
    private Number gitCloneDepth;
    /**
     * ProjectGitSubmodulesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html
     * 
     */
    @JsonProperty("GitSubmodulesConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html")
    private Property<ProjectGitSubmodulesConfig> gitSubmodulesConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl
     * 
     */
    @JsonProperty("InsecureSsl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl")
    private CharSequence insecureSsl;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location")
    private CharSequence location;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ProjectSource withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus
     * 
     */
    @JsonIgnore
    public CharSequence getReportBuildStatus() {
        return reportBuildStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus
     * 
     */
    @JsonIgnore
    public void setReportBuildStatus(CharSequence reportBuildStatus) {
        this.reportBuildStatus = reportBuildStatus;
    }

    public ProjectSource withReportBuildStatus(CharSequence reportBuildStatus) {
        this.reportBuildStatus = reportBuildStatus;
        return this;
    }

    /**
     * ProjectSourceAuth
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
     * 
     */
    @JsonIgnore
    public Property<ProjectSourceAuth> getAuth() {
        return auth;
    }

    /**
     * ProjectSourceAuth
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
     * 
     */
    @JsonIgnore
    public void setAuth(Property<ProjectSourceAuth> auth) {
        this.auth = auth;
    }

    public ProjectSource withAuth(Property<ProjectSourceAuth> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier
     * 
     */
    @JsonIgnore
    public void setSourceIdentifier(CharSequence sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public ProjectSource withSourceIdentifier(CharSequence sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec
     * 
     */
    @JsonIgnore
    public CharSequence getBuildSpec() {
        return buildSpec;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec
     * 
     */
    @JsonIgnore
    public void setBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
    }

    public ProjectSource withBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth
     * 
     */
    @JsonIgnore
    public Number getGitCloneDepth() {
        return gitCloneDepth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth
     * 
     */
    @JsonIgnore
    public void setGitCloneDepth(Number gitCloneDepth) {
        this.gitCloneDepth = gitCloneDepth;
    }

    public ProjectSource withGitCloneDepth(Number gitCloneDepth) {
        this.gitCloneDepth = gitCloneDepth;
        return this;
    }

    /**
     * ProjectGitSubmodulesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html
     * 
     */
    @JsonIgnore
    public Property<ProjectGitSubmodulesConfig> getGitSubmodulesConfig() {
        return gitSubmodulesConfig;
    }

    /**
     * ProjectGitSubmodulesConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-gitsubmodulesconfig.html
     * 
     */
    @JsonIgnore
    public void setGitSubmodulesConfig(Property<ProjectGitSubmodulesConfig> gitSubmodulesConfig) {
        this.gitSubmodulesConfig = gitSubmodulesConfig;
    }

    public ProjectSource withGitSubmodulesConfig(Property<ProjectGitSubmodulesConfig> gitSubmodulesConfig) {
        this.gitSubmodulesConfig = gitSubmodulesConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl
     * 
     */
    @JsonIgnore
    public CharSequence getInsecureSsl() {
        return insecureSsl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl
     * 
     */
    @JsonIgnore
    public void setInsecureSsl(CharSequence insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    public ProjectSource withInsecureSsl(CharSequence insecureSsl) {
        this.insecureSsl = insecureSsl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location
     * 
     */
    @JsonIgnore
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location
     * 
     */
    @JsonIgnore
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public ProjectSource withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("reportBuildStatus", reportBuildStatus).append("auth", auth).append("sourceIdentifier", sourceIdentifier).append("buildSpec", buildSpec).append("gitCloneDepth", gitCloneDepth).append("gitSubmodulesConfig", gitSubmodulesConfig).append("insecureSsl", insecureSsl).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceIdentifier).append(auth).append(insecureSsl).append(reportBuildStatus).append(buildSpec).append(gitSubmodulesConfig).append(location).append(type).append(gitCloneDepth).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProjectSource) == false) {
            return false;
        }
        ProjectSource rhs = ((ProjectSource) other);
        return new EqualsBuilder().append(sourceIdentifier, rhs.sourceIdentifier).append(auth, rhs.auth).append(insecureSsl, rhs.insecureSsl).append(reportBuildStatus, rhs.reportBuildStatus).append(buildSpec, rhs.buildSpec).append(gitSubmodulesConfig, rhs.gitSubmodulesConfig).append(location, rhs.location).append(type, rhs.type).append(gitCloneDepth, rhs.gitCloneDepth).isEquals();
    }

}
