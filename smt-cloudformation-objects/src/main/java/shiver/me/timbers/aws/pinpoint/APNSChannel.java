
package shiver.me.timbers.aws.pinpoint;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * APNSChannel
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BundleId",
    "PrivateKey",
    "Enabled",
    "DefaultAuthenticationMethod",
    "TokenKey",
    "ApplicationId",
    "TeamId",
    "Certificate",
    "TokenKeyId"
})
public class APNSChannel {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-bundleid
     * 
     */
    @JsonProperty("BundleId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-bundleid")
    private CharSequence bundleId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey
     * 
     */
    @JsonProperty("PrivateKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey")
    private CharSequence privateKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled
     * 
     */
    @JsonProperty("Enabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled")
    private CharSequence enabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod
     * 
     */
    @JsonProperty("DefaultAuthenticationMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod")
    private CharSequence defaultAuthenticationMethod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey
     * 
     */
    @JsonProperty("TokenKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey")
    private CharSequence tokenKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid
     * 
     */
    @JsonProperty("ApplicationId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid")
    private CharSequence applicationId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-teamid
     * 
     */
    @JsonProperty("TeamId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-teamid")
    private CharSequence teamId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-certificate
     * 
     */
    @JsonProperty("Certificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-certificate")
    private CharSequence certificate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkeyid
     * 
     */
    @JsonProperty("TokenKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkeyid")
    private CharSequence tokenKeyId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-bundleid
     * 
     */
    @JsonIgnore
    public CharSequence getBundleId() {
        return bundleId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-bundleid
     * 
     */
    @JsonIgnore
    public void setBundleId(CharSequence bundleId) {
        this.bundleId = bundleId;
    }

    public APNSChannel withBundleId(CharSequence bundleId) {
        this.bundleId = bundleId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey
     * 
     */
    @JsonIgnore
    public CharSequence getPrivateKey() {
        return privateKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-privatekey
     * 
     */
    @JsonIgnore
    public void setPrivateKey(CharSequence privateKey) {
        this.privateKey = privateKey;
    }

    public APNSChannel withPrivateKey(CharSequence privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled
     * 
     */
    @JsonIgnore
    public CharSequence getEnabled() {
        return enabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-enabled
     * 
     */
    @JsonIgnore
    public void setEnabled(CharSequence enabled) {
        this.enabled = enabled;
    }

    public APNSChannel withEnabled(CharSequence enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod
     * 
     */
    @JsonIgnore
    public CharSequence getDefaultAuthenticationMethod() {
        return defaultAuthenticationMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-defaultauthenticationmethod
     * 
     */
    @JsonIgnore
    public void setDefaultAuthenticationMethod(CharSequence defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    public APNSChannel withDefaultAuthenticationMethod(CharSequence defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey
     * 
     */
    @JsonIgnore
    public CharSequence getTokenKey() {
        return tokenKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkey
     * 
     */
    @JsonIgnore
    public void setTokenKey(CharSequence tokenKey) {
        this.tokenKey = tokenKey;
    }

    public APNSChannel withTokenKey(CharSequence tokenKey) {
        this.tokenKey = tokenKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid
     * 
     */
    @JsonIgnore
    public CharSequence getApplicationId() {
        return applicationId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-applicationid
     * 
     */
    @JsonIgnore
    public void setApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
    }

    public APNSChannel withApplicationId(CharSequence applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-teamid
     * 
     */
    @JsonIgnore
    public CharSequence getTeamId() {
        return teamId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-teamid
     * 
     */
    @JsonIgnore
    public void setTeamId(CharSequence teamId) {
        this.teamId = teamId;
    }

    public APNSChannel withTeamId(CharSequence teamId) {
        this.teamId = teamId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-certificate
     * 
     */
    @JsonIgnore
    public CharSequence getCertificate() {
        return certificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-certificate
     * 
     */
    @JsonIgnore
    public void setCertificate(CharSequence certificate) {
        this.certificate = certificate;
    }

    public APNSChannel withCertificate(CharSequence certificate) {
        this.certificate = certificate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkeyid
     * 
     */
    @JsonIgnore
    public CharSequence getTokenKeyId() {
        return tokenKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-pinpoint-apnschannel.html#cfn-pinpoint-apnschannel-tokenkeyid
     * 
     */
    @JsonIgnore
    public void setTokenKeyId(CharSequence tokenKeyId) {
        this.tokenKeyId = tokenKeyId;
    }

    public APNSChannel withTokenKeyId(CharSequence tokenKeyId) {
        this.tokenKeyId = tokenKeyId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bundleId", bundleId).append("privateKey", privateKey).append("enabled", enabled).append("defaultAuthenticationMethod", defaultAuthenticationMethod).append("tokenKey", tokenKey).append("applicationId", applicationId).append("teamId", teamId).append("certificate", certificate).append("tokenKeyId", tokenKeyId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(privateKey).append(tokenKey).append(teamId).append(bundleId).append(certificate).append(applicationId).append(tokenKeyId).append(enabled).append(defaultAuthenticationMethod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof APNSChannel) == false) {
            return false;
        }
        APNSChannel rhs = ((APNSChannel) other);
        return new EqualsBuilder().append(privateKey, rhs.privateKey).append(tokenKey, rhs.tokenKey).append(teamId, rhs.teamId).append(bundleId, rhs.bundleId).append(certificate, rhs.certificate).append(applicationId, rhs.applicationId).append(tokenKeyId, rhs.tokenKeyId).append(enabled, rhs.enabled).append(defaultAuthenticationMethod, rhs.defaultAuthenticationMethod).isEquals();
    }

}
