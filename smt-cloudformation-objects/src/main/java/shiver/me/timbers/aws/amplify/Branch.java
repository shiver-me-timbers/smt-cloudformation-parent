
package shiver.me.timbers.aws.amplify;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Branch
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "EnvironmentVariables",
    "AppId",
    "EnableAutoBuild",
    "BuildSpec",
    "Stage",
    "BranchName",
    "BasicAuthConfig",
    "Tags"
})
public class Branch {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables
     * 
     */
    @JsonProperty("EnvironmentVariables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables")
    private List<Property<BranchEnvironmentVariable>> environmentVariables = new ArrayList<Property<BranchEnvironmentVariable>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid
     * 
     */
    @JsonProperty("AppId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid")
    private CharSequence appId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild
     * 
     */
    @JsonProperty("EnableAutoBuild")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild")
    private CharSequence enableAutoBuild;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec
     * 
     */
    @JsonProperty("BuildSpec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec")
    private CharSequence buildSpec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage
     * 
     */
    @JsonProperty("Stage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage")
    private CharSequence stage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname
     * 
     */
    @JsonProperty("BranchName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname")
    private CharSequence branchName;
    /**
     * BranchBasicAuthConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html
     * 
     */
    @JsonProperty("BasicAuthConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html")
    private Property<BranchBasicAuthConfig> basicAuthConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Branch withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables
     * 
     */
    @JsonIgnore
    public List<Property<BranchEnvironmentVariable>> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-environmentvariables
     * 
     */
    @JsonIgnore
    public void setEnvironmentVariables(List<Property<BranchEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public Branch withEnvironmentVariables(List<Property<BranchEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid
     * 
     */
    @JsonIgnore
    public CharSequence getAppId() {
        return appId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-appid
     * 
     */
    @JsonIgnore
    public void setAppId(CharSequence appId) {
        this.appId = appId;
    }

    public Branch withAppId(CharSequence appId) {
        this.appId = appId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild
     * 
     */
    @JsonIgnore
    public CharSequence getEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-enableautobuild
     * 
     */
    @JsonIgnore
    public void setEnableAutoBuild(CharSequence enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    public Branch withEnableAutoBuild(CharSequence enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec
     * 
     */
    @JsonIgnore
    public CharSequence getBuildSpec() {
        return buildSpec;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-buildspec
     * 
     */
    @JsonIgnore
    public void setBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
    }

    public Branch withBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage
     * 
     */
    @JsonIgnore
    public CharSequence getStage() {
        return stage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-stage
     * 
     */
    @JsonIgnore
    public void setStage(CharSequence stage) {
        this.stage = stage;
    }

    public Branch withStage(CharSequence stage) {
        this.stage = stage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname
     * 
     */
    @JsonIgnore
    public CharSequence getBranchName() {
        return branchName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-branchname
     * 
     */
    @JsonIgnore
    public void setBranchName(CharSequence branchName) {
        this.branchName = branchName;
    }

    public Branch withBranchName(CharSequence branchName) {
        this.branchName = branchName;
        return this;
    }

    /**
     * BranchBasicAuthConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html
     * 
     */
    @JsonIgnore
    public Property<BranchBasicAuthConfig> getBasicAuthConfig() {
        return basicAuthConfig;
    }

    /**
     * BranchBasicAuthConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-branch-basicauthconfig.html
     * 
     */
    @JsonIgnore
    public void setBasicAuthConfig(Property<BranchBasicAuthConfig> basicAuthConfig) {
        this.basicAuthConfig = basicAuthConfig;
    }

    public Branch withBasicAuthConfig(Property<BranchBasicAuthConfig> basicAuthConfig) {
        this.basicAuthConfig = basicAuthConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-branch.html#cfn-amplify-branch-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Branch withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("environmentVariables", environmentVariables).append("appId", appId).append("enableAutoBuild", enableAutoBuild).append("buildSpec", buildSpec).append("stage", stage).append("branchName", branchName).append("basicAuthConfig", basicAuthConfig).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enableAutoBuild).append(stage).append(environmentVariables).append(appId).append(buildSpec).append(description).append(branchName).append(basicAuthConfig).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Branch) == false) {
            return false;
        }
        Branch rhs = ((Branch) other);
        return new EqualsBuilder().append(enableAutoBuild, rhs.enableAutoBuild).append(stage, rhs.stage).append(environmentVariables, rhs.environmentVariables).append(appId, rhs.appId).append(buildSpec, rhs.buildSpec).append(description, rhs.description).append(branchName, rhs.branchName).append(basicAuthConfig, rhs.basicAuthConfig).append(tags, rhs.tags).isEquals();
    }

}
