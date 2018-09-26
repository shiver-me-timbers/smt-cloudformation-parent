
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
 * EndpointConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Types"
})
public class EndpointConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types
     * 
     */
    @JsonProperty("Types")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types")
    private Set<CharSequence> types = new LinkedHashSet<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types
     * 
     */
    public Set<CharSequence> getTypes() {
        return types;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-domainname-endpointconfiguration.html#cfn-apigateway-domainname-endpointconfiguration-types
     * 
     */
    public void setTypes(Set<CharSequence> types) {
        this.types = types;
    }

    public EndpointConfiguration withTypes(Set<CharSequence> types) {
        this.types = types;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("types", types).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(types).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointConfiguration) == false) {
            return false;
        }
        EndpointConfiguration rhs = ((EndpointConfiguration) other);
        return new EqualsBuilder().append(types, rhs.types).isEquals();
    }

}
