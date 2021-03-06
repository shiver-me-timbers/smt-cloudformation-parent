
package shiver.me.timbers.aws.appmesh;

import java.util.ArrayList;
import java.util.List;
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
 * VirtualRouterVirtualRouterSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Listeners"
})
public class VirtualRouterVirtualRouterSpec implements Property<VirtualRouterVirtualRouterSpec>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners
     * 
     */
    @JsonProperty("Listeners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners")
    private List<Property<VirtualRouterVirtualRouterListener>> listeners = new ArrayList<Property<VirtualRouterVirtualRouterListener>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners
     * 
     */
    @JsonIgnore
    public List<Property<VirtualRouterVirtualRouterListener>> getListeners() {
        return listeners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners
     * 
     */
    @JsonIgnore
    public void setListeners(List<Property<VirtualRouterVirtualRouterListener>> listeners) {
        this.listeners = listeners;
    }

    public VirtualRouterVirtualRouterSpec withListeners(List<Property<VirtualRouterVirtualRouterListener>> listeners) {
        this.listeners = listeners;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("listeners", listeners).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(listeners).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualRouterVirtualRouterSpec) == false) {
            return false;
        }
        VirtualRouterVirtualRouterSpec rhs = ((VirtualRouterVirtualRouterSpec) other);
        return new EqualsBuilder().append(listeners, rhs.listeners).isEquals();
    }

}
