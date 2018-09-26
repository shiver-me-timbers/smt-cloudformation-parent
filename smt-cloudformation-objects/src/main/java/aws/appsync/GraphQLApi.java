
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GraphQLApi
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "OpenIDConnectConfig",
    "UserPoolConfig",
    "Name",
    "AuthenticationType",
    "LogConfig"
})
public class GraphQLApi {

    /**
     * OpenIDConnectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
     * 
     */
    @JsonProperty("OpenIDConnectConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html")
    private OpenIDConnectConfig openIDConnectConfig;
    /**
     * UserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
     * 
     */
    @JsonProperty("UserPoolConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html")
    private UserPoolConfig userPoolConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype
     * 
     */
    @JsonProperty("AuthenticationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype")
    private CharSequence authenticationType;
    /**
     * LogConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
     * 
     */
    @JsonProperty("LogConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html")
    private LogConfig logConfig;

    /**
     * OpenIDConnectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
     * 
     */
    public OpenIDConnectConfig getOpenIDConnectConfig() {
        return openIDConnectConfig;
    }

    /**
     * OpenIDConnectConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
     * 
     */
    public void setOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
    }

    public GraphQLApi withOpenIDConnectConfig(OpenIDConnectConfig openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
        return this;
    }

    /**
     * UserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
     * 
     */
    public UserPoolConfig getUserPoolConfig() {
        return userPoolConfig;
    }

    /**
     * UserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
     * 
     */
    public void setUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    public GraphQLApi withUserPoolConfig(UserPoolConfig userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public GraphQLApi withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype
     * 
     */
    public CharSequence getAuthenticationType() {
        return authenticationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype
     * 
     */
    public void setAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
    }

    public GraphQLApi withAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * LogConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
     * 
     */
    public LogConfig getLogConfig() {
        return logConfig;
    }

    /**
     * LogConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
     * 
     */
    public void setLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
    }

    public GraphQLApi withLogConfig(LogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("openIDConnectConfig", openIDConnectConfig).append("userPoolConfig", userPoolConfig).append("name", name).append("authenticationType", authenticationType).append("logConfig", logConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(logConfig).append(authenticationType).append(openIDConnectConfig).append(userPoolConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphQLApi) == false) {
            return false;
        }
        GraphQLApi rhs = ((GraphQLApi) other);
        return new EqualsBuilder().append(name, rhs.name).append(logConfig, rhs.logConfig).append(authenticationType, rhs.authenticationType).append(openIDConnectConfig, rhs.openIDConnectConfig).append(userPoolConfig, rhs.userPoolConfig).isEquals();
    }

}
