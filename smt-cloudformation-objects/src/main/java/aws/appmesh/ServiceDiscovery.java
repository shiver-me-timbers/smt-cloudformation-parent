
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
 * ServiceDiscovery
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-servicediscovery.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DNS"
})
public class ServiceDiscovery implements Property<ServiceDiscovery>
{

    /**
     * DnsServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html
     * 
     */
    @JsonProperty("DNS")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html")
    private Property<DnsServiceDiscovery> dNS;

    /**
     * DnsServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html
     * 
     */
    @JsonIgnore
    public Property<DnsServiceDiscovery> getDNS() {
        return dNS;
    }

    /**
     * DnsServiceDiscovery
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appmesh-virtualnode-dnsservicediscovery.html
     * 
     */
    @JsonIgnore
    public void setDNS(Property<DnsServiceDiscovery> dNS) {
        this.dNS = dNS;
    }

    public ServiceDiscovery withDNS(Property<DnsServiceDiscovery> dNS) {
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
        if ((other instanceof ServiceDiscovery) == false) {
            return false;
        }
        ServiceDiscovery rhs = ((ServiceDiscovery) other);
        return new EqualsBuilder().append(dNS, rhs.dNS).isEquals();
    }

}
