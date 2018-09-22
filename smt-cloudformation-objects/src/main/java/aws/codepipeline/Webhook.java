
package aws.codepipeline;

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
 * Webhook
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AuthenticationConfiguration",
    "Filters",
    "Authentication",
    "TargetPipeline",
    "TargetAction",
    "Name",
    "TargetPipelineVersion",
    "RegisterWithThirdParty"
})
public class Webhook {

    /**
     * WebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
    @JsonProperty("AuthenticationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html")
    private WebhookAuthConfiguration authenticationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
    @JsonProperty("Filters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters")
    private List<WebhookFilterRule> filters = new ArrayList<WebhookFilterRule>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication
     * 
     */
    @JsonProperty("Authentication")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication")
    private String authentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    @JsonProperty("TargetPipeline")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline")
    private String targetPipeline;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    @JsonProperty("TargetAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction")
    private String targetAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion
     * 
     */
    @JsonProperty("TargetPipelineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion")
    private Integer targetPipelineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
    @JsonProperty("RegisterWithThirdParty")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty")
    private Boolean registerWithThirdParty;

    /**
     * WebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
    @JsonProperty("AuthenticationConfiguration")
    public WebhookAuthConfiguration getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

    /**
     * WebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
    @JsonProperty("AuthenticationConfiguration")
    public void setAuthenticationConfiguration(WebhookAuthConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    public Webhook withAuthenticationConfiguration(WebhookAuthConfiguration authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
    @JsonProperty("Filters")
    public List<WebhookFilterRule> getFilters() {
        return filters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
    @JsonProperty("Filters")
    public void setFilters(List<WebhookFilterRule> filters) {
        this.filters = filters;
    }

    public Webhook withFilters(List<WebhookFilterRule> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication
     * 
     */
    @JsonProperty("Authentication")
    public String getAuthentication() {
        return authentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication
     * 
     */
    @JsonProperty("Authentication")
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public Webhook withAuthentication(String authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    @JsonProperty("TargetPipeline")
    public String getTargetPipeline() {
        return targetPipeline;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    @JsonProperty("TargetPipeline")
    public void setTargetPipeline(String targetPipeline) {
        this.targetPipeline = targetPipeline;
    }

    public Webhook withTargetPipeline(String targetPipeline) {
        this.targetPipeline = targetPipeline;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    @JsonProperty("TargetAction")
    public String getTargetAction() {
        return targetAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    @JsonProperty("TargetAction")
    public void setTargetAction(String targetAction) {
        this.targetAction = targetAction;
    }

    public Webhook withTargetAction(String targetAction) {
        this.targetAction = targetAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Webhook withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion
     * 
     */
    @JsonProperty("TargetPipelineVersion")
    public Integer getTargetPipelineVersion() {
        return targetPipelineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion
     * 
     */
    @JsonProperty("TargetPipelineVersion")
    public void setTargetPipelineVersion(Integer targetPipelineVersion) {
        this.targetPipelineVersion = targetPipelineVersion;
    }

    public Webhook withTargetPipelineVersion(Integer targetPipelineVersion) {
        this.targetPipelineVersion = targetPipelineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
    @JsonProperty("RegisterWithThirdParty")
    public Boolean getRegisterWithThirdParty() {
        return registerWithThirdParty;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
    @JsonProperty("RegisterWithThirdParty")
    public void setRegisterWithThirdParty(Boolean registerWithThirdParty) {
        this.registerWithThirdParty = registerWithThirdParty;
    }

    public Webhook withRegisterWithThirdParty(Boolean registerWithThirdParty) {
        this.registerWithThirdParty = registerWithThirdParty;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authenticationConfiguration", authenticationConfiguration).append("filters", filters).append("authentication", authentication).append("targetPipeline", targetPipeline).append("targetAction", targetAction).append("name", name).append("targetPipelineVersion", targetPipelineVersion).append("registerWithThirdParty", registerWithThirdParty).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(targetAction).append(registerWithThirdParty).append(name).append(filters).append(targetPipelineVersion).append(authenticationConfiguration).append(targetPipeline).append(authentication).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Webhook) == false) {
            return false;
        }
        Webhook rhs = ((Webhook) other);
        return new EqualsBuilder().append(targetAction, rhs.targetAction).append(registerWithThirdParty, rhs.registerWithThirdParty).append(name, rhs.name).append(filters, rhs.filters).append(targetPipelineVersion, rhs.targetPipelineVersion).append(authenticationConfiguration, rhs.authenticationConfiguration).append(targetPipeline, rhs.targetPipeline).append(authentication, rhs.authentication).isEquals();
    }

}
