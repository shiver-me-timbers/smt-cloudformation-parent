
package shiver.me.timbers.aws.apigatewayv2;

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
 * IntegrationTlsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ServerNameToVerify"
})
public class IntegrationTlsConfig implements Property<IntegrationTlsConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html#cfn-apigatewayv2-integration-tlsconfig-servernametoverify
     * 
     */
    @JsonProperty("ServerNameToVerify")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html#cfn-apigatewayv2-integration-tlsconfig-servernametoverify")
    private CharSequence serverNameToVerify;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html#cfn-apigatewayv2-integration-tlsconfig-servernametoverify
     * 
     */
    @JsonIgnore
    public CharSequence getServerNameToVerify() {
        return serverNameToVerify;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-integration-tlsconfig.html#cfn-apigatewayv2-integration-tlsconfig-servernametoverify
     * 
     */
    @JsonIgnore
    public void setServerNameToVerify(CharSequence serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
    }

    public IntegrationTlsConfig withServerNameToVerify(CharSequence serverNameToVerify) {
        this.serverNameToVerify = serverNameToVerify;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serverNameToVerify", serverNameToVerify).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serverNameToVerify).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IntegrationTlsConfig) == false) {
            return false;
        }
        IntegrationTlsConfig rhs = ((IntegrationTlsConfig) other);
        return new EqualsBuilder().append(serverNameToVerify, rhs.serverNameToVerify).isEquals();
    }

}
