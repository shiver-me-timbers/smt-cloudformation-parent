
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
 * VirtualNodeServiceDiscovery
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DNS"
})
public class VirtualNodeServiceDiscovery implements Property<VirtualNodeServiceDiscovery>
{

    /**
     * VirtualNodeDnsServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html
     * 
     */
    @JsonProperty("DNS")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html")
    private Property<VirtualNodeDnsServiceDiscovery> dNS;

    /**
     * VirtualNodeDnsServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html
     * 
     */
    @JsonIgnore
    public Property<VirtualNodeDnsServiceDiscovery> getDNS() {
        return dNS;
    }

    /**
     * VirtualNodeDnsServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html
     * 
     */
    @JsonIgnore
    public void setDNS(Property<VirtualNodeDnsServiceDiscovery> dNS) {
        this.dNS = dNS;
    }

    public VirtualNodeServiceDiscovery withDNS(Property<VirtualNodeDnsServiceDiscovery> dNS) {
        this.dNS = dNS;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dNS", dNS).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dNS).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VirtualNodeServiceDiscovery) == false) {
            return false;
        }
        VirtualNodeServiceDiscovery rhs = ((VirtualNodeServiceDiscovery) other);
        return new EqualsBuilder().append(dNS, rhs.dNS).isEquals();
    }

}
