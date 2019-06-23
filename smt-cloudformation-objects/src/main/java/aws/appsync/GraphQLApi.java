
package aws.appsync;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OpenIDConnectConfig",
    "UserPoolConfig",
    "Name",
    "AuthenticationType",
    "LogConfig"
})
public class GraphQLApi {

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
     * GraphQLApiUserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
     * 
     */
    @JsonProperty("UserPoolConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html")
    private Property<GraphQLApiUserPoolConfig> userPoolConfig;
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
     * GraphQLApiLogConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
     * 
     */
    @JsonProperty("LogConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html")
    private Property<GraphQLApiLogConfig> logConfig;

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

    public GraphQLApi withOpenIDConnectConfig(Property<GraphQLApiOpenIDConnectConfig> openIDConnectConfig) {
        this.openIDConnectConfig = openIDConnectConfig;
        return this;
    }

    /**
     * GraphQLApiUserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
     * 
     */
    @JsonIgnore
    public Property<GraphQLApiUserPoolConfig> getUserPoolConfig() {
        return userPoolConfig;
    }

    /**
     * GraphQLApiUserPoolConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
     * 
     */
    @JsonIgnore
    public void setUserPoolConfig(Property<GraphQLApiUserPoolConfig> userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
    }

    public GraphQLApi withUserPoolConfig(Property<GraphQLApiUserPoolConfig> userPoolConfig) {
        this.userPoolConfig = userPoolConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-name
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getAuthenticationType() {
        return authenticationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-authenticationtype
     * 
     */
    @JsonIgnore
    public void setAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
    }

    public GraphQLApi withAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * GraphQLApiLogConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
     * 
     */
    @JsonIgnore
    public Property<GraphQLApiLogConfig> getLogConfig() {
        return logConfig;
    }

    /**
     * GraphQLApiLogConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-logconfig.html
     * 
     */
    @JsonIgnore
    public void setLogConfig(Property<GraphQLApiLogConfig> logConfig) {
        this.logConfig = logConfig;
    }

    public GraphQLApi withLogConfig(Property<GraphQLApiLogConfig> logConfig) {
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
