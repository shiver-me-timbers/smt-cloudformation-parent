
package shiver.me.timbers.aws.amplify;

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
 * AppBasicAuthConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Username",
    "EnableBasicAuth",
    "Password"
})
public class AppBasicAuthConfig implements Property<AppBasicAuthConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-username")
    private CharSequence username;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-enablebasicauth
     * 
     */
    @JsonProperty("EnableBasicAuth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-enablebasicauth")
    private CharSequence enableBasicAuth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-password")
    private CharSequence password;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-username
     * 
     */
    @JsonIgnore
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-username
     * 
     */
    @JsonIgnore
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public AppBasicAuthConfig withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-enablebasicauth
     * 
     */
    @JsonIgnore
    public CharSequence getEnableBasicAuth() {
        return enableBasicAuth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-enablebasicauth
     * 
     */
    @JsonIgnore
    public void setEnableBasicAuth(CharSequence enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
    }

    public AppBasicAuthConfig withEnableBasicAuth(CharSequence enableBasicAuth) {
        this.enableBasicAuth = enableBasicAuth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-password
     * 
     */
    @JsonIgnore
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amplify-app-basicauthconfig.html#cfn-amplify-app-basicauthconfig-password
     * 
     */
    @JsonIgnore
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public AppBasicAuthConfig withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("username", username).append("enableBasicAuth", enableBasicAuth).append("password", password).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(enableBasicAuth).append(password).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppBasicAuthConfig) == false) {
            return false;
        }
        AppBasicAuthConfig rhs = ((AppBasicAuthConfig) other);
        return new EqualsBuilder().append(enableBasicAuth, rhs.enableBasicAuth).append(password, rhs.password).append(username, rhs.username).isEquals();
    }

}
