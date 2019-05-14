
package aws.appmesh;

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
 * VirtualServiceSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Provider"
})
public class VirtualServiceSpec implements Property<VirtualServiceSpec>
{

    /**
     * VirtualServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
     * 
     */
    @JsonProperty("Provider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html")
    private Property<VirtualServiceProvider> provider;

    /**
     * VirtualServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
     * 
     */
    @JsonIgnore
    public Property<VirtualServiceProvider> getProvider() {
        return provider;
    }

    /**
     * VirtualServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
     * 
     */
    @JsonIgnore
    public void setProvider(Property<VirtualServiceProvider> provider) {
        this.provider = provider;
    }

    public VirtualServiceSpec withProvider(Property<VirtualServiceProvider> provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("provider", provider).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(provider).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualServiceSpec) == false) {
            return false;
        }
        VirtualServiceSpec rhs = ((VirtualServiceSpec) other);
        return new EqualsBuilder().append(provider, rhs.provider).isEquals();
    }

}
