
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
 * VirtualNodeClientPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TLS"
})
public class VirtualNodeClientPolicy implements Property<VirtualNodeClientPolicy>
{

    /**
     * VirtualNodeClientPolicyTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html
     * 
     */
    @JsonProperty("TLS")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html")
    private Property<VirtualNodeClientPolicyTls> tLS;

    /**
     * VirtualNodeClientPolicyTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeClientPolicyTls> getTLS() {
        return tLS;
    }

    /**
     * VirtualNodeClientPolicyTls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-clientpolicytls.html
     * 
     */
    @JsonIgnore
    public void setTLS(Property<VirtualNodeClientPolicyTls> tLS) {
        this.tLS = tLS;
    }

    public VirtualNodeClientPolicy withTLS(Property<VirtualNodeClientPolicyTls> tLS) {
        this.tLS = tLS;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tLS", tLS).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tLS).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeClientPolicy) == false) {
            return false;
        }
        VirtualNodeClientPolicy rhs = ((VirtualNodeClientPolicy) other);
        return new EqualsBuilder().append(tLS, rhs.tLS).isEquals();
    }

}
