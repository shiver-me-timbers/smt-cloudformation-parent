
package aws.servicediscovery;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DnsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DnsRecords",
    "RoutingPolicy",
    "NamespaceId"
})
public class DnsConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords
     * 
     */
    @JsonProperty("DnsRecords")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords")
    private List<DnsRecord> dnsRecords = new ArrayList<DnsRecord>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy
     * 
     */
    @JsonProperty("RoutingPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy")
    private CharSequence routingPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid
     * 
     */
    @JsonProperty("NamespaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid")
    private CharSequence namespaceId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords
     * 
     */
    public List<DnsRecord> getDnsRecords() {
        return dnsRecords;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords
     * 
     */
    public void setDnsRecords(List<DnsRecord> dnsRecords) {
        this.dnsRecords = dnsRecords;
    }

    public DnsConfig withDnsRecords(List<DnsRecord> dnsRecords) {
        this.dnsRecords = dnsRecords;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy
     * 
     */
    public CharSequence getRoutingPolicy() {
        return routingPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy
     * 
     */
    public void setRoutingPolicy(CharSequence routingPolicy) {
        this.routingPolicy = routingPolicy;
    }

    public DnsConfig withRoutingPolicy(CharSequence routingPolicy) {
        this.routingPolicy = routingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid
     * 
     */
    public CharSequence getNamespaceId() {
        return namespaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid
     * 
     */
    public void setNamespaceId(CharSequence namespaceId) {
        this.namespaceId = namespaceId;
    }

    public DnsConfig withNamespaceId(CharSequence namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dnsRecords", dnsRecords).append("routingPolicy", routingPolicy).append("namespaceId", namespaceId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(routingPolicy).append(namespaceId).append(dnsRecords).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DnsConfig) == false) {
            return false;
        }
        DnsConfig rhs = ((DnsConfig) other);
        return new EqualsBuilder().append(routingPolicy, rhs.routingPolicy).append(namespaceId, rhs.namespaceId).append(dnsRecords, rhs.dnsRecords).isEquals();
    }

}
