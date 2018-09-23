
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WebhookAuthConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowedIPRange",
    "SecretToken"
})
public class WebhookAuthConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange
     * 
     */
    @JsonProperty("AllowedIPRange")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange")
    private String allowedIPRange;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken
     * 
     */
    @JsonProperty("SecretToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken")
    private String secretToken;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange
     * 
     */
    @JsonProperty("AllowedIPRange")
    public String getAllowedIPRange() {
        return allowedIPRange;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-allowediprange
     * 
     */
    @JsonProperty("AllowedIPRange")
    public void setAllowedIPRange(String allowedIPRange) {
        this.allowedIPRange = allowedIPRange;
    }

    public WebhookAuthConfiguration withAllowedIPRange(String allowedIPRange) {
        this.allowedIPRange = allowedIPRange;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken
     * 
     */
    @JsonProperty("SecretToken")
    public String getSecretToken() {
        return secretToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookauthconfiguration.html#cfn-codepipeline-webhook-webhookauthconfiguration-secrettoken
     * 
     */
    @JsonProperty("SecretToken")
    public void setSecretToken(String secretToken) {
        this.secretToken = secretToken;
    }

    public WebhookAuthConfiguration withSecretToken(String secretToken) {
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
        if ((other instanceof WebhookAuthConfiguration) == false) {
            return false;
        }
        WebhookAuthConfiguration rhs = ((WebhookAuthConfiguration) other);
        return new EqualsBuilder().append(allowedIPRange, rhs.allowedIPRange).append(secretToken, rhs.secretToken).isEquals();
    }

}