
package shiver.me.timbers.aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * RestApiEndpointConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Types",
    "VpcEndpointIds"
})
public class RestApiEndpointConfiguration implements Property<RestApiEndpointConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types
     * 
     */
    @JsonProperty("Types")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types")
    private Set<CharSequence> types = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-vpcendpointids
     * 
     */
    @JsonProperty("VpcEndpointIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-vpcendpointids")
    private Set<CharSequence> vpcEndpointIds = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getTypes() {
        return types;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-types
     * 
     */
    @JsonIgnore
    public void setTypes(Set<CharSequence> types) {
        this.types = types;
    }

    public RestApiEndpointConfiguration withTypes(Set<CharSequence> types) {
        this.types = types;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-vpcendpointids
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getVpcEndpointIds() {
        return vpcEndpointIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-restapi-endpointconfiguration.html#cfn-apigateway-restapi-endpointconfiguration-vpcendpointids
     * 
     */
    @JsonIgnore
    public void setVpcEndpointIds(Set<CharSequence> vpcEndpointIds) {
        this.vpcEndpointIds = vpcEndpointIds;
    }

    public RestApiEndpointConfiguration withVpcEndpointIds(Set<CharSequence> vpcEndpointIds) {
        this.vpcEndpointIds = vpcEndpointIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("types", types).append("vpcEndpointIds", vpcEndpointIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(vpcEndpointIds).append(types).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RestApiEndpointConfiguration) == false) {
            return false;
        }
        RestApiEndpointConfiguration rhs = ((RestApiEndpointConfiguration) other);
        return new EqualsBuilder().append(vpcEndpointIds, rhs.vpcEndpointIds).append(types, rhs.types).isEquals();
    }

}
