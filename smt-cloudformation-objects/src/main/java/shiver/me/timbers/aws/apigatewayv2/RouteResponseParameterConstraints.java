
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
 * RouteResponseParameterConstraints
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Required"
})
public class RouteResponseParameterConstraints implements Property<RouteResponseParameterConstraints>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html#cfn-apigatewayv2-routeresponse-parameterconstraints-required
     * 
     */
    @JsonProperty("Required")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html#cfn-apigatewayv2-routeresponse-parameterconstraints-required")
    private CharSequence required;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html#cfn-apigatewayv2-routeresponse-parameterconstraints-required
     * 
     */
    @JsonIgnore
    public CharSequence getRequired() {
        return required;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-routeresponse-parameterconstraints.html#cfn-apigatewayv2-routeresponse-parameterconstraints-required
     * 
     */
    @JsonIgnore
    public void setRequired(CharSequence required) {
        this.required = required;
    }

    public RouteResponseParameterConstraints withRequired(CharSequence required) {
        this.required = required;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("required", required).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(required).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RouteResponseParameterConstraints) == false) {
            return false;
        }
        RouteResponseParameterConstraints rhs = ((RouteResponseParameterConstraints) other);
        return new EqualsBuilder().append(required, rhs.required).isEquals();
    }

}
