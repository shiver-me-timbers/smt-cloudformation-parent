
package aws.codebuild;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Source
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "ReportBuildStatus",
    "Auth",
    "SourceIdentifier",
    "BuildSpec",
    "GitCloneDepth",
    "InsecureSsl",
    "Location"
})
public class Source {

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
    private Boolean reportBuildStatus;
    /**
     * SourceAuth
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
     * 
     */
    @JsonProperty("Auth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html")
    private SourceAuth auth;
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
    private Integer gitCloneDepth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl
     * 
     */
    @JsonProperty("InsecureSsl")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl")
    private Boolean insecureSsl;
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
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Source withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus
     * 
     */
    public Boolean getReportBuildStatus() {
        return reportBuildStatus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-reportbuildstatus
     * 
     */
    public void setReportBuildStatus(Boolean reportBuildStatus) {
        this.reportBuildStatus = reportBuildStatus;
    }

    public Source withReportBuildStatus(Boolean reportBuildStatus) {
        this.reportBuildStatus = reportBuildStatus;
        return this;
    }

    /**
     * SourceAuth
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
     * 
     */
    public SourceAuth getAuth() {
        return auth;
    }

    /**
     * SourceAuth
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-sourceauth.html
     * 
     */
    public void setAuth(SourceAuth auth) {
        this.auth = auth;
    }

    public Source withAuth(SourceAuth auth) {
        this.auth = auth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier
     * 
     */
    public CharSequence getSourceIdentifier() {
        return sourceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-sourceidentifier
     * 
     */
    public void setSourceIdentifier(CharSequence sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
    }

    public Source withSourceIdentifier(CharSequence sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec
     * 
     */
    public CharSequence getBuildSpec() {
        return buildSpec;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-buildspec
     * 
     */
    public void setBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
    }

    public Source withBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth
     * 
     */
    public Integer getGitCloneDepth() {
        return gitCloneDepth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-gitclonedepth
     * 
     */
    public void setGitCloneDepth(Integer gitCloneDepth) {
        this.gitCloneDepth = gitCloneDepth;
    }

    public Source withGitCloneDepth(Integer gitCloneDepth) {
        this.gitCloneDepth = gitCloneDepth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl
     * 
     */
    public Boolean getInsecureSsl() {
        return insecureSsl;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-insecuressl
     * 
     */
    public void setInsecureSsl(Boolean insecureSsl) {
        this.insecureSsl = insecureSsl;
    }

    public Source withInsecureSsl(Boolean insecureSsl) {
        this.insecureSsl = insecureSsl;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location
     * 
     */
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-source.html#cfn-codebuild-project-source-location
     * 
     */
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public Source withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("reportBuildStatus", reportBuildStatus).append("auth", auth).append("sourceIdentifier", sourceIdentifier).append("buildSpec", buildSpec).append("gitCloneDepth", gitCloneDepth).append("insecureSsl", insecureSsl).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sourceIdentifier).append(auth).append(insecureSsl).append(reportBuildStatus).append(buildSpec).append(location).append(type).append(gitCloneDepth).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Source) == false) {
            return false;
        }
        Source rhs = ((Source) other);
        return new EqualsBuilder().append(sourceIdentifier, rhs.sourceIdentifier).append(auth, rhs.auth).append(insecureSsl, rhs.insecureSsl).append(reportBuildStatus, rhs.reportBuildStatus).append(buildSpec, rhs.buildSpec).append(location, rhs.location).append(type, rhs.type).append(gitCloneDepth, rhs.gitCloneDepth).isEquals();
    }

}
