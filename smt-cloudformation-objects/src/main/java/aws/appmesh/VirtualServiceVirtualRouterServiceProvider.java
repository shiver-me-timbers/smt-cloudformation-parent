
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
 * VirtualServiceVirtualRouterServiceProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualRouterName"
})
public class VirtualServiceVirtualRouterServiceProvider implements Property<VirtualServiceVirtualRouterServiceProvider>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html#cfn-appmesh-virtualservice-virtualrouterserviceprovider-virtualroutername
     * 
     */
    @JsonProperty("VirtualRouterName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html#cfn-appmesh-virtualservice-virtualrouterserviceprovider-virtualroutername")
    private CharSequence virtualRouterName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html#cfn-appmesh-virtualservice-virtualrouterserviceprovider-virtualroutername
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualRouterName() {
        return virtualRouterName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html#cfn-appmesh-virtualservice-virtualrouterserviceprovider-virtualroutername
     * 
     */
    @JsonIgnore
    public void setVirtualRouterName(CharSequence virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
    }

    public VirtualServiceVirtualRouterServiceProvider withVirtualRouterName(CharSequence virtualRouterName) {
        this.virtualRouterName = virtualRouterName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("virtualRouterName", virtualRouterName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualRouterName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualServiceVirtualRouterServiceProvider) == false) {
            return false;
        }
        VirtualServiceVirtualRouterServiceProvider rhs = ((VirtualServiceVirtualRouterServiceProvider) other);
        return new EqualsBuilder().append(virtualRouterName, rhs.virtualRouterName).isEquals();
    }

}
