
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
    private CharSequence authentication;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    @JsonProperty("TargetPipeline")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline")
    private CharSequence targetPipeline;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    @JsonProperty("TargetAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction")
    private CharSequence targetAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name")
    private CharSequence name;
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
    public WebhookAuthConfiguration getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

    /**
     * WebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
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
    public List<WebhookFilterRule> getFilters() {
        return filters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
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
    public CharSequence getAuthentication() {
        return authentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication
     * 
     */
    public void setAuthentication(CharSequence authentication) {
        this.authentication = authentication;
    }

    public Webhook withAuthentication(CharSequence authentication) {
        this.authentication = authentication;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    public CharSequence getTargetPipeline() {
        return targetPipeline;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    public void setTargetPipeline(CharSequence targetPipeline) {
        this.targetPipeline = targetPipeline;
    }

    public Webhook withTargetPipeline(CharSequence targetPipeline) {
        this.targetPipeline = targetPipeline;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    public CharSequence getTargetAction() {
        return targetAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    public void setTargetAction(CharSequence targetAction) {
        this.targetAction = targetAction;
    }

    public Webhook withTargetAction(CharSequence targetAction) {
        this.targetAction = targetAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Webhook withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion
     * 
     */
    public Integer getTargetPipelineVersion() {
        return targetPipelineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion
     * 
     */
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
    public Boolean getRegisterWithThirdParty() {
        return registerWithThirdParty;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
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
