
package aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Authorizer
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AuthType",
    "AuthorizerCredentials",
    "AuthorizerResultTtlInSeconds",
    "AuthorizerUri",
    "IdentitySource",
    "IdentityValidationExpression",
    "Name",
    "ProviderARNs",
    "RestApiId",
    "Type"
})
public class Authorizer {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype
     * 
     */
    @JsonProperty("AuthType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype")
    private CharSequence authType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials
     * 
     */
    @JsonProperty("AuthorizerCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials")
    private CharSequence authorizerCredentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds
     * 
     */
    @JsonProperty("AuthorizerResultTtlInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds")
    private Integer authorizerResultTtlInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri
     * 
     */
    @JsonProperty("AuthorizerUri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri")
    private CharSequence authorizerUri;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource
     * 
     */
    @JsonProperty("IdentitySource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource")
    private CharSequence identitySource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression
     * 
     */
    @JsonProperty("IdentityValidationExpression")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression")
    private CharSequence identityValidationExpression;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns
     * 
     */
    @JsonProperty("ProviderARNs")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns")
    private Set<CharSequence> providerARNs = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid")
    private CharSequence restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype
     * 
     */
    public CharSequence getAuthType() {
        return authType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authtype
     * 
     */
    public void setAuthType(CharSequence authType) {
        this.authType = authType;
    }

    public Authorizer withAuthType(CharSequence authType) {
        this.authType = authType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials
     * 
     */
    public CharSequence getAuthorizerCredentials() {
        return authorizerCredentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizercredentials
     * 
     */
    public void setAuthorizerCredentials(CharSequence authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
    }

    public Authorizer withAuthorizerCredentials(CharSequence authorizerCredentials) {
        this.authorizerCredentials = authorizerCredentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds
     * 
     */
    public Integer getAuthorizerResultTtlInSeconds() {
        return authorizerResultTtlInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizerresultttlinseconds
     * 
     */
    public void setAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
    }

    public Authorizer withAuthorizerResultTtlInSeconds(Integer authorizerResultTtlInSeconds) {
        this.authorizerResultTtlInSeconds = authorizerResultTtlInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri
     * 
     */
    public CharSequence getAuthorizerUri() {
        return authorizerUri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-authorizeruri
     * 
     */
    public void setAuthorizerUri(CharSequence authorizerUri) {
        this.authorizerUri = authorizerUri;
    }

    public Authorizer withAuthorizerUri(CharSequence authorizerUri) {
        this.authorizerUri = authorizerUri;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource
     * 
     */
    public CharSequence getIdentitySource() {
        return identitySource;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identitysource
     * 
     */
    public void setIdentitySource(CharSequence identitySource) {
        this.identitySource = identitySource;
    }

    public Authorizer withIdentitySource(CharSequence identitySource) {
        this.identitySource = identitySource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression
     * 
     */
    public CharSequence getIdentityValidationExpression() {
        return identityValidationExpression;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-identityvalidationexpression
     * 
     */
    public void setIdentityValidationExpression(CharSequence identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
    }

    public Authorizer withIdentityValidationExpression(CharSequence identityValidationExpression) {
        this.identityValidationExpression = identityValidationExpression;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name
     * 
     */
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-name
     * 
     */
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Authorizer withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns
     * 
     */
    public Set<CharSequence> getProviderARNs() {
        return providerARNs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-providerarns
     * 
     */
    public void setProviderARNs(Set<CharSequence> providerARNs) {
        this.providerARNs = providerARNs;
    }

    public Authorizer withProviderARNs(Set<CharSequence> providerARNs) {
        this.providerARNs = providerARNs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public Authorizer withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-authorizer.html#cfn-apigateway-authorizer-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public Authorizer withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authType", authType).append("authorizerCredentials", authorizerCredentials).append("authorizerResultTtlInSeconds", authorizerResultTtlInSeconds).append("authorizerUri", authorizerUri).append("identitySource", identitySource).append("identityValidationExpression", identityValidationExpression).append("name", name).append("providerARNs", providerARNs).append("restApiId", restApiId).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(identitySource).append(identityValidationExpression).append(authorizerUri).append(authorizerCredentials).append(restApiId).append(authorizerResultTtlInSeconds).append(name).append(providerARNs).append(authType).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Authorizer) == false) {
            return false;
        }
        Authorizer rhs = ((Authorizer) other);
        return new EqualsBuilder().append(identitySource, rhs.identitySource).append(identityValidationExpression, rhs.identityValidationExpression).append(authorizerUri, rhs.authorizerUri).append(authorizerCredentials, rhs.authorizerCredentials).append(restApiId, rhs.restApiId).append(authorizerResultTtlInSeconds, rhs.authorizerResultTtlInSeconds).append(name, rhs.name).append(providerARNs, rhs.providerARNs).append(authType, rhs.authType).append(type, rhs.type).isEquals();
    }

}
