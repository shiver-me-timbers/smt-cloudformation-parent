
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
 * VirtualNodeBackend
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backend.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VirtualService"
})
public class VirtualNodeBackend implements Property<VirtualNodeBackend>
{

    /**
     * VirtualNodeVirtualServiceBackend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
     * 
     */
    @JsonProperty("VirtualService")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html")
    private Property<VirtualNodeVirtualServiceBackend> virtualService;

    /**
     * VirtualNodeVirtualServiceBackend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeVirtualServiceBackend> getVirtualService() {
        return virtualService;
    }

    /**
     * VirtualNodeVirtualServiceBackend
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
     * 
     */
    @JsonIgnore
    public void setVirtualService(Property<VirtualNodeVirtualServiceBackend> virtualService) {
        this.virtualService = virtualService;
    }

    public VirtualNodeBackend withVirtualService(Property<VirtualNodeVirtualServiceBackend> virtualService) {
        this.virtualService = virtualService;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("virtualService", virtualService).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualService).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeBackend) == false) {
            return false;
        }
        VirtualNodeBackend rhs = ((VirtualNodeBackend) other);
        return new EqualsBuilder().append(virtualService, rhs.virtualService).isEquals();
    }

}
