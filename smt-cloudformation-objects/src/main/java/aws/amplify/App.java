
package aws.amplify;

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
 * App
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutoBranchCreationConfig",
    "OauthToken",
    "Repository",
    "Description",
    "EnvironmentVariables",
    "AccessToken",
    "BuildSpec",
    "CustomRules",
    "BasicAuthConfig",
    "Tags",
    "Name",
    "IAMServiceRole"
})
public class App {

    /**
     * AppAutoBranchCreationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html
     * 
     */
    @JsonProperty("AutoBranchCreationConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html")
    private Property<AppAutoBranchCreationConfig> autoBranchCreationConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken
     * 
     */
    @JsonProperty("OauthToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken")
    private CharSequence oauthToken;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository
     * 
     */
    @JsonProperty("Repository")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository")
    private CharSequence repository;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables
     * 
     */
    @JsonProperty("EnvironmentVariables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables")
    private List<Property<AppEnvironmentVariable>> environmentVariables = new ArrayList<Property<AppEnvironmentVariable>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken
     * 
     */
    @JsonProperty("AccessToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken")
    private CharSequence accessToken;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec
     * 
     */
    @JsonProperty("BuildSpec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec")
    private CharSequence buildSpec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules
     * 
     */
    @JsonProperty("CustomRules")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules")
    private List<Property<AppCustomRule>> customRules = new ArrayList<Property<AppCustomRule>>();
    /**
     * AppBasicAuthConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html
     * 
     */
    @JsonProperty("BasicAuthConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html")
    private Property<AppBasicAuthConfig> basicAuthConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole
     * 
     */
    @JsonProperty("IAMServiceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole")
    private CharSequence iAMServiceRole;

    /**
     * AppAutoBranchCreationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html
     * 
     */
    @JsonIgnore
    public Property<AppAutoBranchCreationConfig> getAutoBranchCreationConfig() {
        return autoBranchCreationConfig;
    }

    /**
     * AppAutoBranchCreationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html
     * 
     */
    @JsonIgnore
    public void setAutoBranchCreationConfig(Property<AppAutoBranchCreationConfig> autoBranchCreationConfig) {
        this.autoBranchCreationConfig = autoBranchCreationConfig;
    }

    public App withAutoBranchCreationConfig(Property<AppAutoBranchCreationConfig> autoBranchCreationConfig) {
        this.autoBranchCreationConfig = autoBranchCreationConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken
     * 
     */
    @JsonIgnore
    public CharSequence getOauthToken() {
        return oauthToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-oauthtoken
     * 
     */
    @JsonIgnore
    public void setOauthToken(CharSequence oauthToken) {
        this.oauthToken = oauthToken;
    }

    public App withOauthToken(CharSequence oauthToken) {
        this.oauthToken = oauthToken;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository
     * 
     */
    @JsonIgnore
    public CharSequence getRepository() {
        return repository;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-repository
     * 
     */
    @JsonIgnore
    public void setRepository(CharSequence repository) {
        this.repository = repository;
    }

    public App withRepository(CharSequence repository) {
        this.repository = repository;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public App withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables
     * 
     */
    @JsonIgnore
    public List<Property<AppEnvironmentVariable>> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-environmentvariables
     * 
     */
    @JsonIgnore
    public void setEnvironmentVariables(List<Property<AppEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public App withEnvironmentVariables(List<Property<AppEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken
     * 
     */
    @JsonIgnore
    public CharSequence getAccessToken() {
        return accessToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-accesstoken
     * 
     */
    @JsonIgnore
    public void setAccessToken(CharSequence accessToken) {
        this.accessToken = accessToken;
    }

    public App withAccessToken(CharSequence accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec
     * 
     */
    @JsonIgnore
    public CharSequence getBuildSpec() {
        return buildSpec;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-buildspec
     * 
     */
    @JsonIgnore
    public void setBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
    }

    public App withBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules
     * 
     */
    @JsonIgnore
    public List<Property<AppCustomRule>> getCustomRules() {
        return customRules;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-customrules
     * 
     */
    @JsonIgnore
    public void setCustomRules(List<Property<AppCustomRule>> customRules) {
        this.customRules = customRules;
    }

    public App withCustomRules(List<Property<AppCustomRule>> customRules) {
        this.customRules = customRules;
        return this;
    }

    /**
     * AppBasicAuthConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html
     * 
     */
    @JsonIgnore
    public Property<AppBasicAuthConfig> getBasicAuthConfig() {
        return basicAuthConfig;
    }

    /**
     * AppBasicAuthConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html
     * 
     */
    @JsonIgnore
    public void setBasicAuthConfig(Property<AppBasicAuthConfig> basicAuthConfig) {
        this.basicAuthConfig = basicAuthConfig;
    }

    public App withBasicAuthConfig(Property<AppBasicAuthConfig> basicAuthConfig) {
        this.basicAuthConfig = basicAuthConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public App withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public App withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole
     * 
     */
    @JsonIgnore
    public CharSequence getIAMServiceRole() {
        return iAMServiceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amplify-app.html#cfn-amplify-app-iamservicerole
     * 
     */
    @JsonIgnore
    public void setIAMServiceRole(CharSequence iAMServiceRole) {
        this.iAMServiceRole = iAMServiceRole;
    }

    public App withIAMServiceRole(CharSequence iAMServiceRole) {
        this.iAMServiceRole = iAMServiceRole;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoBranchCreationConfig", autoBranchCreationConfig).append("oauthToken", oauthToken).append("repository", repository).append("description", description).append("environmentVariables", environmentVariables).append("accessToken", accessToken).append("buildSpec", buildSpec).append("customRules", customRules).append("basicAuthConfig", basicAuthConfig).append("tags", tags).append("name", name).append("iAMServiceRole", iAMServiceRole).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(basicAuthConfig).append(oauthToken).append(repository).append(accessToken).append(tags).append(customRules).append(iAMServiceRole).append(environmentVariables).append(autoBranchCreationConfig).append(buildSpec).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof App) == false) {
            return false;
        }
        App rhs = ((App) other);
        return new EqualsBuilder().append(description, rhs.description).append(basicAuthConfig, rhs.basicAuthConfig).append(oauthToken, rhs.oauthToken).append(repository, rhs.repository).append(accessToken, rhs.accessToken).append(tags, rhs.tags).append(customRules, rhs.customRules).append(iAMServiceRole, rhs.iAMServiceRole).append(environmentVariables, rhs.environmentVariables).append(autoBranchCreationConfig, rhs.autoBranchCreationConfig).append(buildSpec, rhs.buildSpec).append(name, rhs.name).isEquals();
    }

}
