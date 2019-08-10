
package aws.amplify;

import java.util.ArrayList;
import java.util.List;
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
 * AppAutoBranchCreationConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EnvironmentVariables",
    "EnableAutoBranchCreation",
    "AutoBranchCreationPatterns",
    "EnableAutoBuild",
    "BuildSpec",
    "Stage",
    "BasicAuthConfig"
})
public class AppAutoBranchCreationConfig implements Property<AppAutoBranchCreationConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-environmentvariables
     * 
     */
    @JsonProperty("EnvironmentVariables")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-environmentvariables")
    private List<Property<AppEnvironmentVariable>> environmentVariables = new ArrayList<Property<AppEnvironmentVariable>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobranchcreation
     * 
     */
    @JsonProperty("EnableAutoBranchCreation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobranchcreation")
    private CharSequence enableAutoBranchCreation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-autobranchcreationpatterns
     * 
     */
    @JsonProperty("AutoBranchCreationPatterns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-autobranchcreationpatterns")
    private List<CharSequence> autoBranchCreationPatterns = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobuild
     * 
     */
    @JsonProperty("EnableAutoBuild")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobuild")
    private CharSequence enableAutoBuild;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-buildspec
     * 
     */
    @JsonProperty("BuildSpec")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-buildspec")
    private CharSequence buildSpec;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-stage
     * 
     */
    @JsonProperty("Stage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-stage")
    private CharSequence stage;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-environmentvariables
     * 
     */
    @JsonIgnore
    public List<Property<AppEnvironmentVariable>> getEnvironmentVariables() {
        return environmentVariables;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-environmentvariables
     * 
     */
    @JsonIgnore
    public void setEnvironmentVariables(List<Property<AppEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
    }

    public AppAutoBranchCreationConfig withEnvironmentVariables(List<Property<AppEnvironmentVariable>> environmentVariables) {
        this.environmentVariables = environmentVariables;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobranchcreation
     * 
     */
    @JsonIgnore
    public CharSequence getEnableAutoBranchCreation() {
        return enableAutoBranchCreation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobranchcreation
     * 
     */
    @JsonIgnore
    public void setEnableAutoBranchCreation(CharSequence enableAutoBranchCreation) {
        this.enableAutoBranchCreation = enableAutoBranchCreation;
    }

    public AppAutoBranchCreationConfig withEnableAutoBranchCreation(CharSequence enableAutoBranchCreation) {
        this.enableAutoBranchCreation = enableAutoBranchCreation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-autobranchcreationpatterns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAutoBranchCreationPatterns() {
        return autoBranchCreationPatterns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-autobranchcreationpatterns
     * 
     */
    @JsonIgnore
    public void setAutoBranchCreationPatterns(List<CharSequence> autoBranchCreationPatterns) {
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
    }

    public AppAutoBranchCreationConfig withAutoBranchCreationPatterns(List<CharSequence> autoBranchCreationPatterns) {
        this.autoBranchCreationPatterns = autoBranchCreationPatterns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobuild
     * 
     */
    @JsonIgnore
    public CharSequence getEnableAutoBuild() {
        return enableAutoBuild;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-enableautobuild
     * 
     */
    @JsonIgnore
    public void setEnableAutoBuild(CharSequence enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
    }

    public AppAutoBranchCreationConfig withEnableAutoBuild(CharSequence enableAutoBuild) {
        this.enableAutoBuild = enableAutoBuild;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-buildspec
     * 
     */
    @JsonIgnore
    public CharSequence getBuildSpec() {
        return buildSpec;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-buildspec
     * 
     */
    @JsonIgnore
    public void setBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
    }

    public AppAutoBranchCreationConfig withBuildSpec(CharSequence buildSpec) {
        this.buildSpec = buildSpec;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-stage
     * 
     */
    @JsonIgnore
    public CharSequence getStage() {
        return stage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-autobranchcreationconfig.html#cfn-amplify-app-autobranchcreationconfig-stage
     * 
     */
    @JsonIgnore
    public void setStage(CharSequence stage) {
        this.stage = stage;
    }

    public AppAutoBranchCreationConfig withStage(CharSequence stage) {
        this.stage = stage;
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

    public AppAutoBranchCreationConfig withBasicAuthConfig(Property<AppBasicAuthConfig> basicAuthConfig) {
        this.basicAuthConfig = basicAuthConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("environmentVariables", environmentVariables).append("enableAutoBranchCreation", enableAutoBranchCreation).append("autoBranchCreationPatterns", autoBranchCreationPatterns).append("enableAutoBuild", enableAutoBuild).append("buildSpec", buildSpec).append("stage", stage).append("basicAuthConfig", basicAuthConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(autoBranchCreationPatterns).append(enableAutoBuild).append(stage).append(environmentVariables).append(buildSpec).append(enableAutoBranchCreation).append(basicAuthConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppAutoBranchCreationConfig) == false) {
            return false;
        }
        AppAutoBranchCreationConfig rhs = ((AppAutoBranchCreationConfig) other);
        return new EqualsBuilder().append(autoBranchCreationPatterns, rhs.autoBranchCreationPatterns).append(enableAutoBuild, rhs.enableAutoBuild).append(stage, rhs.stage).append(environmentVariables, rhs.environmentVariables).append(buildSpec, rhs.buildSpec).append(enableAutoBranchCreation, rhs.enableAutoBranchCreation).append(basicAuthConfig, rhs.basicAuthConfig).isEquals();
    }

}
