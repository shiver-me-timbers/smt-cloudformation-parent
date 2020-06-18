
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
 * VirtualNodeVirtualServiceBackend
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientPolicy",
    "VirtualServiceName"
})
public class VirtualNodeVirtualServiceBackend implements Property<VirtualNodeVirtualServiceBackend>
{

    /**
     * VirtualNodeClientPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html
     * 
     */
    @JsonProperty("ClientPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html")
    private Property<VirtualNodeClientPolicy> clientPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-virtualservicename
     * 
     */
    @JsonProperty("VirtualServiceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-virtualservicename")
    private CharSequence virtualServiceName;

    /**
     * VirtualNodeClientPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeClientPolicy> getClientPolicy() {
        return clientPolicy;
    }

    /**
     * VirtualNodeClientPolicy
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html
     * 
     */
    @JsonIgnore
    public void setClientPolicy(Property<VirtualNodeClientPolicy> clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    public VirtualNodeVirtualServiceBackend withClientPolicy(Property<VirtualNodeClientPolicy> clientPolicy) {
        this.clientPolicy = clientPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-virtualservicename
     * 
     */
    @JsonIgnore
    public CharSequence getVirtualServiceName() {
        return virtualServiceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-virtualservicebackend.html#cfn-appmesh-virtualnode-virtualservicebackend-virtualservicename
     * 
     */
    @JsonIgnore
    public void setVirtualServiceName(CharSequence virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
    }

    public VirtualNodeVirtualServiceBackend withVirtualServiceName(CharSequence virtualServiceName) {
        this.virtualServiceName = virtualServiceName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientPolicy", clientPolicy).append("virtualServiceName", virtualServiceName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(virtualServiceName).append(clientPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeVirtualServiceBackend) == false) {
            return false;
        }
        VirtualNodeVirtualServiceBackend rhs = ((VirtualNodeVirtualServiceBackend) other);
        return new EqualsBuilder().append(virtualServiceName, rhs.virtualServiceName).append(clientPolicy, rhs.clientPolicy).isEquals();
    }

}
