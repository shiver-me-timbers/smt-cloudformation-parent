
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
 * VirtualRouterListener
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterlistener.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PortMapping"
})
public class VirtualRouterListener implements Property<VirtualRouterListener>
{

    /**
     * PortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonProperty("PortMapping")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html")
    private Property<PortMapping> portMapping;

    /**
     * PortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonIgnore
    public Property<PortMapping> getPortMapping() {
        return portMapping;
    }

    /**
     * PortMapping
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-portmapping.html
     * 
     */
    @JsonIgnore
    public void setPortMapping(Property<PortMapping> portMapping) {
        this.portMapping = portMapping;
    }

    public VirtualRouterListener withPortMapping(Property<PortMapping> portMapping) {
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
        if ((other instanceof VirtualRouterListener) == false) {
            return false;
        }
        VirtualRouterListener rhs = ((VirtualRouterListener) other);
        return new EqualsBuilder().append(portMapping, rhs.portMapping).isEquals();
    }

}
