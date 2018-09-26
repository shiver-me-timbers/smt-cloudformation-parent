
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CognitoIdentityProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ServerSideTokenCheck",
    "ProviderName",
    "ClientId"
})
public class CognitoIdentityProvider {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck
     * 
     */
    @JsonProperty("ServerSideTokenCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck")
    private Boolean serverSideTokenCheck;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername
     * 
     */
    @JsonProperty("ProviderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername")
    private CharSequence providerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid
     * 
     */
    @JsonProperty("ClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid")
    private CharSequence clientId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck
     * 
     */
    public Boolean getServerSideTokenCheck() {
        return serverSideTokenCheck;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-serversidetokencheck
     * 
     */
    public void setServerSideTokenCheck(Boolean serverSideTokenCheck) {
        this.serverSideTokenCheck = serverSideTokenCheck;
    }

    public CognitoIdentityProvider withServerSideTokenCheck(Boolean serverSideTokenCheck) {
        this.serverSideTokenCheck = serverSideTokenCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername
     * 
     */
    public CharSequence getProviderName() {
        return providerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-providername
     * 
     */
    public void setProviderName(CharSequence providerName) {
        this.providerName = providerName;
    }

    public CognitoIdentityProvider withProviderName(CharSequence providerName) {
        this.providerName = providerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid
     * 
     */
    public CharSequence getClientId() {
        return clientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-identitypool-cognitoidentityprovider.html#cfn-cognito-identitypool-cognitoidentityprovider-clientid
     * 
     */
    public void setClientId(CharSequence clientId) {
        this.clientId = clientId;
    }

    public CognitoIdentityProvider withClientId(CharSequence clientId) {
        this.clientId = clientId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serverSideTokenCheck", serverSideTokenCheck).append("providerName", providerName).append("clientId", clientId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientId).append(serverSideTokenCheck).append(providerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CognitoIdentityProvider) == false) {
            return false;
        }
        CognitoIdentityProvider rhs = ((CognitoIdentityProvider) other);
        return new EqualsBuilder().append(clientId, rhs.clientId).append(serverSideTokenCheck, rhs.serverSideTokenCheck).append(providerName, rhs.providerName).isEquals();
    }

}
