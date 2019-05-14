
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
 * VirtualServiceProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualserviceprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualNode",
    "VirtualRouter"
})
public class VirtualServiceProvider implements Property<VirtualServiceProvider>
{

    /**
     * VirtualNodeServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
     * 
     */
    @JsonProperty("VirtualNode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html")
    private Property<VirtualNodeServiceProvider> virtualNode;
    /**
     * VirtualRouterServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
     * 
     */
    @JsonProperty("VirtualRouter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html")
    private Property<VirtualRouterServiceProvider> virtualRouter;

    /**
     * VirtualNodeServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeServiceProvider> getVirtualNode() {
        return virtualNode;
    }

    /**
     * VirtualNodeServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
     * 
     */
    @JsonIgnore
    public void setVirtualNode(Property<VirtualNodeServiceProvider> virtualNode) {
        this.virtualNode = virtualNode;
    }

    public VirtualServiceProvider withVirtualNode(Property<VirtualNodeServiceProvider> virtualNode) {
        this.virtualNode = virtualNode;
        return this;
    }

    /**
     * VirtualRouterServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
     * 
     */
    @JsonIgnore
    public Property<VirtualRouterServiceProvider> getVirtualRouter() {
        return virtualRouter;
    }

    /**
     * VirtualRouterServiceProvider
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualrouterserviceprovider.html
     * 
     */
    @JsonIgnore
    public void setVirtualRouter(Property<VirtualRouterServiceProvider> virtualRouter) {
        this.virtualRouter = virtualRouter;
    }

    public VirtualServiceProvider withVirtualRouter(Property<VirtualRouterServiceProvider> virtualRouter) {
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
        if ((other instanceof VirtualServiceProvider) == false) {
            return false;
        }
        VirtualServiceProvider rhs = ((VirtualServiceProvider) other);
        return new EqualsBuilder().append(virtualNode, rhs.virtualNode).append(virtualRouter, rhs.virtualRouter).isEquals();
    }

}
