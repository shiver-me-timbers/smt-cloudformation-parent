
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * OpenIDConnectConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Issuer",
    "ClientId",
    "AuthTTL",
    "IatTTL"
})
public class OpenIDConnectConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer
     * 
     */
    @JsonProperty("Issuer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer")
    private String issuer;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid
     * 
     */
    @JsonProperty("ClientId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid")
    private String clientId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl
     * 
     */
    @JsonProperty("AuthTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl")
    private Double authTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl
     * 
     */
    @JsonProperty("IatTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl")
    private Double iatTTL;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer
     * 
     */
    @JsonProperty("Issuer")
    public String getIssuer() {
        return issuer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-issuer
     * 
     */
    @JsonProperty("Issuer")
    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public OpenIDConnectConfig withIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid
     * 
     */
    @JsonProperty("ClientId")
    public String getClientId() {
        return clientId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-clientid
     * 
     */
    @JsonProperty("ClientId")
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public OpenIDConnectConfig withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl
     * 
     */
    @JsonProperty("AuthTTL")
    public Double getAuthTTL() {
        return authTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-authttl
     * 
     */
    @JsonProperty("AuthTTL")
    public void setAuthTTL(Double authTTL) {
        this.authTTL = authTTL;
    }

    public OpenIDConnectConfig withAuthTTL(Double authTTL) {
        this.authTTL = authTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl
     * 
     */
    @JsonProperty("IatTTL")
    public Double getIatTTL() {
        return iatTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-openidconnectconfig.html#cfn-appsync-graphqlapi-openidconnectconfig-iatttl
     * 
     */
    @JsonProperty("IatTTL")
    public void setIatTTL(Double iatTTL) {
        this.iatTTL = iatTTL;
    }

    public OpenIDConnectConfig withIatTTL(Double iatTTL) {
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
        if ((other instanceof OpenIDConnectConfig) == false) {
            return false;
        }
        OpenIDConnectConfig rhs = ((OpenIDConnectConfig) other);
        return new EqualsBuilder().append(iatTTL, rhs.iatTTL).append(authTTL, rhs.authTTL).append(clientId, rhs.clientId).append(issuer, rhs.issuer).isEquals();
    }

}