
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
 * VirtualServiceVirtualServiceProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualNode",
    "VirtualRouter"
})
public class VirtualServiceVirtualServiceProvider implements Property<VirtualServiceVirtualServiceProvider>
{

    /**
     * VirtualServiceVirtualNodeServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
     * 
     */
    @JsonProperty("VirtualNode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html")
    private Property<VirtualServiceVirtualNodeServiceProvider> virtualNode;
    /**
     * VirtualServiceVirtualRouterServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
     * 
     */
    @JsonProperty("VirtualRouter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html")
    private Property<VirtualServiceVirtualRouterServiceProvider> virtualRouter;

    /**
     * VirtualServiceVirtualNodeServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
     * 
     */
    @JsonIgnore
    public Property<VirtualServiceVirtualNodeServiceProvider> getVirtualNode() {
        return virtualNode;
    }

    /**
     * VirtualServiceVirtualNodeServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
     * 
     */
    @JsonIgnore
    public void setVirtualNode(Property<VirtualServiceVirtualNodeServiceProvider> virtualNode) {
        this.virtualNode = virtualNode;
    }

    public VirtualServiceVirtualServiceProvider withVirtualNode(Property<VirtualServiceVirtualNodeServiceProvider> virtualNode) {
        this.virtualNode = virtualNode;
        return this;
    }

    /**
     * VirtualServiceVirtualRouterServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
     * 
     */
    @JsonIgnore
    public Property<VirtualServiceVirtualRouterServiceProvider> getVirtualRouter() {
        return virtualRouter;
    }

    /**
     * VirtualServiceVirtualRouterServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
     * 
     */
    @JsonIgnore
    public void setVirtualRouter(Property<VirtualServiceVirtualRouterServiceProvider> virtualRouter) {
        this.virtualRouter = virtualRouter;
    }

    public VirtualServiceVirtualServiceProvider withVirtualRouter(Property<VirtualServiceVirtualRouterServiceProvider> virtualRouter) {
        this.virtualRouter = virtualRouter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("virtualNode", virtualNode).append("virtualRouter", virtualRouter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualNode).append(virtualRouter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualServiceVirtualServiceProvider) == false) {
            return false;
        }
        VirtualServiceVirtualServiceProvider rhs = ((VirtualServiceVirtualServiceProvider) other);
        return new EqualsBuilder().append(virtualNode, rhs.virtualNode).append(virtualRouter, rhs.virtualRouter).isEquals();
    }

}
