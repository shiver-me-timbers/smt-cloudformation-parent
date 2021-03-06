
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
 * VirtualServiceVirtualNodeServiceProvider
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualNodeName"
})
public class VirtualServiceVirtualNodeServiceProvider implements Property<VirtualServiceVirtualNodeServiceProvider>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html#cfn-appmesh-virtualservice-virtualnodeserviceprovider-virtualnodename
     * 
     */
    @JsonProperty("VirtualNodeName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html#cfn-appmesh-virtualservice-virtualnodeserviceprovider-virtualnodename")
    private CharSequence virtualNodeName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html#cfn-appmesh-virtualservice-virtualnodeserviceprovider-virtualnodename
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualNodeName() {
        return virtualNodeName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualservice-virtualnodeserviceprovider.html#cfn-appmesh-virtualservice-virtualnodeserviceprovider-virtualnodename
     * 
     */
    @JsonIgnore
    public void setVirtualNodeName(CharSequence virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
    }

    public VirtualServiceVirtualNodeServiceProvider withVirtualNodeName(CharSequence virtualNodeName) {
        this.virtualNodeName = virtualNodeName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("virtualNodeName", virtualNodeName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualNodeName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualServiceVirtualNodeServiceProvider) == false) {
            return false;
        }
        VirtualServiceVirtualNodeServiceProvider rhs = ((VirtualServiceVirtualNodeServiceProvider) other);
        return new EqualsBuilder().append(virtualNodeName, rhs.virtualNodeName).isEquals();
    }

}
