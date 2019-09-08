
package shiver.me.timbers.aws.codepipeline;

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


/**
 * Webhook
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
     * WebhookWebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
    @JsonProperty("AuthenticationConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html")
    private Property<WebhookWebhookAuthConfiguration> authenticationConfiguration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
    @JsonProperty("Filters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters")
    private List<Property<WebhookWebhookFilterRule>> filters = new ArrayList<Property<WebhookWebhookFilterRule>>();
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
    private Number targetPipelineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
    @JsonProperty("RegisterWithThirdParty")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty")
    private CharSequence registerWithThirdParty;

    /**
     * WebhookWebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
    @JsonIgnore
    public Property<WebhookWebhookAuthConfiguration> getAuthenticationConfiguration() {
        return authenticationConfiguration;
    }

    /**
     * WebhookWebhookAuthConfiguration
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
     * 
     */
    @JsonIgnore
    public void setAuthenticationConfiguration(Property<WebhookWebhookAuthConfiguration> authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
    }

    public Webhook withAuthenticationConfiguration(Property<WebhookWebhookAuthConfiguration> authenticationConfiguration) {
        this.authenticationConfiguration = authenticationConfiguration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
    @JsonIgnore
    public List<Property<WebhookWebhookFilterRule>> getFilters() {
        return filters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-filters
     * 
     */
    @JsonIgnore
    public void setFilters(List<Property<WebhookWebhookFilterRule>> filters) {
        this.filters = filters;
    }

    public Webhook withFilters(List<Property<WebhookWebhookFilterRule>> filters) {
        this.filters = filters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication
     * 
     */
    @JsonIgnore
    public CharSequence getAuthentication() {
        return authentication;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-authentication
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getTargetPipeline() {
        return targetPipeline;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipeline
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getTargetAction() {
        return targetAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetaction
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-name
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public Number getTargetPipelineVersion() {
        return targetPipelineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-targetpipelineversion
     * 
     */
    @JsonIgnore
    public void setTargetPipelineVersion(Number targetPipelineVersion) {
        this.targetPipelineVersion = targetPipelineVersion;
    }

    public Webhook withTargetPipelineVersion(Number targetPipelineVersion) {
        this.targetPipelineVersion = targetPipelineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
    @JsonIgnore
    public CharSequence getRegisterWithThirdParty() {
        return registerWithThirdParty;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-codepipeline-webhook.html#cfn-codepipeline-webhook-registerwiththirdparty
     * 
     */
    @JsonIgnore
    public void setRegisterWithThirdParty(CharSequence registerWithThirdParty) {
        this.registerWithThirdParty = registerWithThirdParty;
    }

    public Webhook withRegisterWithThirdParty(CharSequence registerWithThirdParty) {
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
