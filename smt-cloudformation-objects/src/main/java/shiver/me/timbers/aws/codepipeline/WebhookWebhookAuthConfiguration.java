
package shiver.me.timbers.aws.codepipeline;

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
 * WebhookWebhookAuthConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AllowedIPRange",
    "SecretToken"
})
public class WebhookWebhookAuthConfiguration implements Property<WebhookWebhookAuthConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange
     * 
     */
    @JsonProperty("AllowedIPRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange")
    private CharSequence allowedIPRange;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken
     * 
     */
    @JsonProperty("SecretToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken")
    private CharSequence secretToken;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange
     * 
     */
    @JsonIgnore
    public CharSequence getAllowedIPRange() {
        return allowedIPRange;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange
     * 
     */
    @JsonIgnore
    public void setAllowedIPRange(CharSequence allowedIPRange) {
        this.allowedIPRange = allowedIPRange;
    }

    public WebhookWebhookAuthConfiguration withAllowedIPRange(CharSequence allowedIPRange) {
        this.allowedIPRange = allowedIPRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken
     * 
     */
    @JsonIgnore
    public CharSequence getSecretToken() {
        return secretToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken
     * 
     */
    @JsonIgnore
    public void setSecretToken(CharSequence secretToken) {
        this.secretToken = secretToken;
    }

    public WebhookWebhookAuthConfiguration withSecretToken(CharSequence secretToken) {
        this.secretToken = secretToken;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowedIPRange", allowedIPRange).append("secretToken", secretToken).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowedIPRange).append(secretToken).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookWebhookAuthConfiguration) == false) {
            return false;
        }
        WebhookWebhookAuthConfiguration rhs = ((WebhookWebhookAuthConfiguration) other);
        return new EqualsBuilder().append(allowedIPRange, rhs.allowedIPRange).append(secretToken, rhs.secretToken).isEquals();
    }

}
