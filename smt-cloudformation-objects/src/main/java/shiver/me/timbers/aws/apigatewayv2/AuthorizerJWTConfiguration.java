
package shiver.me.timbers.aws.apigatewayv2;

import java.util.ArrayList;
import java.util.List;
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
 * AuthorizerJWTConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Issuer",
    "Audience"
})
public class AuthorizerJWTConfiguration implements Property<AuthorizerJWTConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-issuer
     * 
     */
    @JsonProperty("Issuer")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-issuer")
    private CharSequence issuer;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-audience
     * 
     */
    @JsonProperty("Audience")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-audience")
    private List<CharSequence> audience = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-issuer
     * 
     */
    @JsonIgnore
    public CharSequence getIssuer() {
        return issuer;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-issuer
     * 
     */
    @JsonIgnore
    public void setIssuer(CharSequence issuer) {
        this.issuer = issuer;
    }

    public AuthorizerJWTConfiguration withIssuer(CharSequence issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-audience
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAudience() {
        return audience;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-authorizer-jwtconfiguration.html#cfn-apigatewayv2-authorizer-jwtconfiguration-audience
     * 
     */
    @JsonIgnore
    public void setAudience(List<CharSequence> audience) {
        this.audience = audience;
    }

    public AuthorizerJWTConfiguration withAudience(List<CharSequence> audience) {
        this.audience = audience;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("issuer", issuer).append("audience", audience).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(issuer).append(audience).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorizerJWTConfiguration) == false) {
            return false;
        }
        AuthorizerJWTConfiguration rhs = ((AuthorizerJWTConfiguration) other);
        return new EqualsBuilder().append(issuer, rhs.issuer).append(audience, rhs.audience).isEquals();
    }

}
