
package shiver.me.timbers.aws.appsync;

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
 * GraphQLApiAdditionalAuthenticationProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OpenIDConnectConfig",
    "UserPoolConfig",
    "AuthenticationType"
})
public class GraphQLApiAdditionalAuthenticationProvider implements Property<GraphQLApiAdditionalAuthenticationProvider>
{

    /**
     * GraphQLApiOpenIDConnectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
     * 
     */
    @JsonProperty("OpenIDConnectConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html")
    private Property<GraphQLApiOpenIDConnectConfig> openIDConnectConfig;
    /**
     * GraphQLApiCognitoUserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html
     * 
     */
    @JsonProperty("UserPoolConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html")
    private Property<GraphQLApiCognitoUserPoolConfig> userPoolConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-authenticationtype
     * 
     */
    @JsonProperty("AuthenticationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-authenticationtype")
    private CharSequence authenticationType;

    /**
     * GraphQLApiOpenIDConnectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
     * 
     */
    @JsonIgnore
    public Property<GraphQLApiOpenIDConnectConfig> getOpenIDConnectConfig() {
        return openIDConnectConfig;
    }

    /**
     * GraphQLApiOpenIDConnectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
     * 
     */
    @JsonIgnore
    public void setOpenIDConnectConfig(Property<GraphQLApiOpenIDConnectConfig> openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    public GraphQLApiAdditionalAuthenticationProvider withOpenIDConnectConfig(Property<GraphQLApiOpenIDConnectConfig> openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
        return this;
    }

    /**
     * GraphQLApiCognitoUserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html
     * 
     */
    @JsonIgnore
    public Property<GraphQLApiCognitoUserPoolConfig> getUserPoolConfig() {
        return userPoolConfig;
    }

    /**
     * GraphQLApiCognitoUserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-cognitouserpoolconfig.html
     * 
     */
    @JsonIgnore
    public void setUserPoolConfig(Property<GraphQLApiCognitoUserPoolConfig> userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    public GraphQLApiAdditionalAuthenticationProvider withUserPoolConfig(Property<GraphQLApiCognitoUserPoolConfig> userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-authenticationtype
     * 
     */
    @JsonIgnore
    public CharSequence getAuthenticationType() {
        return authenticationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationprovider.html#cfn-appsync-graphqlapi-additionalauthenticationprovider-authenticationtype
     * 
     */
    @JsonIgnore
    public void setAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
    }

    public GraphQLApiAdditionalAuthenticationProvider withAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("openIDConnectConfig", openIDConnectConfig).append("userPoolConfig", userPoolConfig).append("authenticationType", authenticationType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authenticationType).append(openIDConnectConfig).append(userPoolConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphQLApiAdditionalAuthenticationProvider) == false) {
            return false;
        }
        GraphQLApiAdditionalAuthenticationProvider rhs = ((GraphQLApiAdditionalAuthenticationProvider) other);
        return new EqualsBuilder().append(authenticationType, rhs.authenticationType).append(openIDConnectConfig, rhs.openIDConnectConfig).append(userPoolConfig, rhs.userPoolConfig).isEquals();
    }

}
