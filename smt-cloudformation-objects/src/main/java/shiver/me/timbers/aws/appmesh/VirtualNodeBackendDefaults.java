
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
 * VirtualNodeBackendDefaults
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-backenddefaults.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ClientPolicy"
})
public class VirtualNodeBackendDefaults implements Property<VirtualNodeBackendDefaults>
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

    public VirtualNodeBackendDefaults withClientPolicy(Property<VirtualNodeClientPolicy> clientPolicy) {
        this.clientPolicy = clientPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientPolicy", clientPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeBackendDefaults) == false) {
            return false;
        }
        VirtualNodeBackendDefaults rhs = ((VirtualNodeBackendDefaults) other);
        return new EqualsBuilder().append(clientPolicy, rhs.clientPolicy).isEquals();
    }

}
