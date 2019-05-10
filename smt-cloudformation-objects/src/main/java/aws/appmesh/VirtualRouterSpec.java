
package aws.appmesh;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * VirtualRouterSpec
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Listeners"
})
public class VirtualRouterSpec {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners
     * 
     */
    @JsonProperty("Listeners")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners")
    private List<VirtualRouterListener> listeners = new ArrayList<VirtualRouterListener>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners
     * 
     */
    @JsonIgnore
    public List<VirtualRouterListener> getListeners() {
        return listeners;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualrouter-virtualrouterspec.html#cfn-appmesh-virtualrouter-virtualrouterspec-listeners
     * 
     */
    @JsonIgnore
    public void setListeners(List<VirtualRouterListener> listeners) {
        this.listeners = listeners;
    }

    public VirtualRouterSpec withListeners(List<VirtualRouterListener> listeners) {
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
        if ((other instanceof VirtualRouterSpec) == false) {
            return false;
        }
        VirtualRouterSpec rhs = ((VirtualRouterSpec) other);
        return new EqualsBuilder().append(listeners, rhs.listeners).isEquals();
    }

}
