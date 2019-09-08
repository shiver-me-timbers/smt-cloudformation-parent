
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
 * GraphQLApiOpenIDConnectConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Issuer",
    "ClientId",
    "AuthTTL",
    "IatTTL"
})
public class GraphQLApiOpenIDConnectConfig implements Property<GraphQLApiOpenIDConnectConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer
     * 
     */
    @JsonProperty("Issuer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer")
    private CharSequence issuer;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid
     * 
     */
    @JsonProperty("ClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid")
    private CharSequence clientId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl
     * 
     */
    @JsonProperty("AuthTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl")
    private Number authTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl
     * 
     */
    @JsonProperty("IatTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl")
    private Number iatTTL;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer
     * 
     */
    @JsonIgnore
    public CharSequence getIssuer() {
        return issuer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer
     * 
     */
    @JsonIgnore
    public void setIssuer(CharSequence issuer) {
        this.issuer = issuer;
    }

    public GraphQLApiOpenIDConnectConfig withIssuer(CharSequence issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid
     * 
     */
    @JsonIgnore
    public CharSequence getClientId() {
        return clientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid
     * 
     */
    @JsonIgnore
    public void setClientId(CharSequence clientId) {
        this.clientId = clientId;
    }

    public GraphQLApiOpenIDConnectConfig withClientId(CharSequence clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl
     * 
     */
    @JsonIgnore
    public Number getAuthTTL() {
        return authTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl
     * 
     */
    @JsonIgnore
    public void setAuthTTL(Number authTTL) {
        this.authTTL = authTTL;
    }

    public GraphQLApiOpenIDConnectConfig withAuthTTL(Number authTTL) {
        this.authTTL = authTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl
     * 
     */
    @JsonIgnore
    public Number getIatTTL() {
        return iatTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl
     * 
     */
    @JsonIgnore
    public void setIatTTL(Number iatTTL) {
        this.iatTTL = iatTTL;
    }

    public GraphQLApiOpenIDConnectConfig withIatTTL(Number iatTTL) {
        this.iatTTL = iatTTL;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("issuer", issuer).append("clientId", clientId).append("authTTL", authTTL).append("iatTTL", iatTTL).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iatTTL).append(authTTL).append(clientId).append(issuer).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphQLApiOpenIDConnectConfig) == false) {
            return false;
        }
        GraphQLApiOpenIDConnectConfig rhs = ((GraphQLApiOpenIDConnectConfig) other);
        return new EqualsBuilder().append(iatTTL, rhs.iatTTL).append(authTTL, rhs.authTTL).append(clientId, rhs.clientId).append(issuer, rhs.issuer).isEquals();
    }

}
