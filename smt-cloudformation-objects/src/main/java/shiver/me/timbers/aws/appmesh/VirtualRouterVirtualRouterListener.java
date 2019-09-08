
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
 * VirtualRouterVirtualRouterListener
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PortMapping"
})
public class VirtualRouterVirtualRouterListener implements Property<VirtualRouterVirtualRouterListener>
{

    /**
     * VirtualRouterPortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonProperty("PortMapping")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html")
    private Property<VirtualRouterPortMapping> portMapping;

    /**
     * VirtualRouterPortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonIgnore
    public Property<VirtualRouterPortMapping> getPortMapping() {
        return portMapping;
    }

    /**
     * VirtualRouterPortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonIgnore
    public void setPortMapping(Property<VirtualRouterPortMapping> portMapping) {
        this.portMapping = portMapping;
    }

    public VirtualRouterVirtualRouterListener withPortMapping(Property<VirtualRouterPortMapping> portMapping) {
        this.portMapping = portMapping;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("portMapping", portMapping).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(portMapping).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualRouterVirtualRouterListener) == false) {
            return false;
        }
        VirtualRouterVirtualRouterListener rhs = ((VirtualRouterVirtualRouterListener) other);
        return new EqualsBuilder().append(portMapping, rhs.portMapping).isEquals();
    }

}
