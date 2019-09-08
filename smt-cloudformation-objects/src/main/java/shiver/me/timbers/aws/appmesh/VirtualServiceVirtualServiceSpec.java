
package shiver.me.timbers.aws.appmesh;

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
 * VirtualServiceVirtualServiceSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualservicespec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Provider"
})
public class VirtualServiceVirtualServiceSpec implements Property<VirtualServiceVirtualServiceSpec>
{

    /**
     * VirtualServiceVirtualServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
     * 
     */
    @JsonProperty("Provider")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html")
    private Property<VirtualServiceVirtualServiceProvider> provider;

    /**
     * VirtualServiceVirtualServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
     * 
     */
    @JsonIgnore
    public Property<VirtualServiceVirtualServiceProvider> getProvider() {
        return provider;
    }

    /**
     * VirtualServiceVirtualServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
     * 
     */
    @JsonIgnore
    public void setProvider(Property<VirtualServiceVirtualServiceProvider> provider) {
        this.provider = provider;
    }

    public VirtualServiceVirtualServiceSpec withProvider(Property<VirtualServiceVirtualServiceProvider> provider) {
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
        if ((other instanceof VirtualServiceVirtualServiceSpec) == false) {
            return false;
        }
        VirtualServiceVirtualServiceSpec rhs = ((VirtualServiceVirtualServiceSpec) other);
        return new EqualsBuilder().append(provider, rhs.provider).isEquals();
    }

}
