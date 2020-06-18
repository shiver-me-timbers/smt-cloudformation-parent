
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
 * GraphQLApi
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OpenIDConnectConfig",
    "XrayEnabled",
    "UserPoolConfig",
    "Tags",
    "Name",
    "AuthenticationType",
    "LogConfig",
    "AdditionalAuthenticationProviders"
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled
     * 
     */
    @JsonProperty("XrayEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled")
    private CharSequence xrayEnabled;
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
     * GraphQLApiTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-tags.html
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-tags.html")
    private Property<GraphQLApiTags> tags;
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
     * GraphQLApiAdditionalAuthenticationProviders
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationproviders.html
     * 
     */
    @JsonProperty("AdditionalAuthenticationProviders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationproviders.html")
    private Property<GraphQLApiAdditionalAuthenticationProviders> additionalAuthenticationProviders;

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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled
     * 
     */
    @JsonIgnore
    public CharSequence getXrayEnabled() {
        return xrayEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlapi.html#cfn-appsync-graphqlapi-xrayenabled
     * 
     */
    @JsonIgnore
    public void setXrayEnabled(CharSequence xrayEnabled) {
        this.xrayEnabled = xrayEnabled;
    }

    public GraphQLApi withXrayEnabled(CharSequence xrayEnabled) {
        this.xrayEnabled = xrayEnabled;
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
     * GraphQLApiTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-tags.html
     * 
     */
    @JsonIgnore
    public Property<GraphQLApiTags> getTags() {
        return tags;
    }

    /**
     * GraphQLApiTags
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-tags.html
     * 
     */
    @JsonIgnore
    public void setTags(Property<GraphQLApiTags> tags) {
        this.tags = tags;
    }

    public GraphQLApi withTags(Property<GraphQLApiTags> tags) {
        this.tags = tags;
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

    /**
     * GraphQLApiAdditionalAuthenticationProviders
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationproviders.html
     * 
     */
    @JsonIgnore
    public Property<GraphQLApiAdditionalAuthenticationProviders> getAdditionalAuthenticationProviders() {
        return additionalAuthenticationProviders;
    }

    /**
     * GraphQLApiAdditionalAuthenticationProviders
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-additionalauthenticationproviders.html
     * 
     */
    @JsonIgnore
    public void setAdditionalAuthenticationProviders(Property<GraphQLApiAdditionalAuthenticationProviders> additionalAuthenticationProviders) {
        this.additionalAuthenticationProviders = additionalAuthenticationProviders;
    }

    public GraphQLApi withAdditionalAuthenticationProviders(Property<GraphQLApiAdditionalAuthenticationProviders> additionalAuthenticationProviders) {
        this.additionalAuthenticationProviders = additionalAuthenticationProviders;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("openIDConnectConfig", openIDConnectConfig).append("xrayEnabled", xrayEnabled).append("userPoolConfig", userPoolConfig).append("tags", tags).append("name", name).append("authenticationType", authenticationType).append("logConfig", logConfig).append("additionalAuthenticationProviders", additionalAuthenticationProviders).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalAuthenticationProviders).append(logConfig).append(xrayEnabled).append(openIDConnectConfig).append(userPoolConfig).append(name).append(authenticationType).append(tags).toHashCode();
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
        return new EqualsBuilder().append(additionalAuthenticationProviders, rhs.additionalAuthenticationProviders).append(logConfig, rhs.logConfig).append(xrayEnabled, rhs.xrayEnabled).append(openIDConnectConfig, rhs.openIDConnectConfig).append(userPoolConfig, rhs.userPoolConfig).append(name, rhs.name).append(authenticationType, rhs.authenticationType).append(tags, rhs.tags).isEquals();
    }

}
