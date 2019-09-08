
package shiver.me.timbers.aws.servicediscovery;

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
 * ServiceDnsConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DnsRecords",
    "RoutingPolicy",
    "NamespaceId"
})
public class ServiceDnsConfig implements Property<ServiceDnsConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords
     * 
     */
    @JsonProperty("DnsRecords")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords")
    private List<Property<ServiceDnsRecord>> dnsRecords = new ArrayList<Property<ServiceDnsRecord>>();
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
    @JsonIgnore
    public List<Property<ServiceDnsRecord>> getDnsRecords() {
        return dnsRecords;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-dnsrecords
     * 
     */
    @JsonIgnore
    public void setDnsRecords(List<Property<ServiceDnsRecord>> dnsRecords) {
        this.dnsRecords = dnsRecords;
    }

    public ServiceDnsConfig withDnsRecords(List<Property<ServiceDnsRecord>> dnsRecords) {
        this.dnsRecords = dnsRecords;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getRoutingPolicy() {
        return routingPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-routingpolicy
     * 
     */
    @JsonIgnore
    public void setRoutingPolicy(CharSequence routingPolicy) {
        this.routingPolicy = routingPolicy;
    }

    public ServiceDnsConfig withRoutingPolicy(CharSequence routingPolicy) {
        this.routingPolicy = routingPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid
     * 
     */
    @JsonIgnore
    public CharSequence getNamespaceId() {
        return namespaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsconfig.html#cfn-servicediscovery-service-dnsconfig-namespaceid
     * 
     */
    @JsonIgnore
    public void setNamespaceId(CharSequence namespaceId) {
        this.namespaceId = namespaceId;
    }

    public ServiceDnsConfig withNamespaceId(CharSequence namespaceId) {
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
        if ((other instanceof ServiceDnsConfig) == false) {
            return false;
        }
        ServiceDnsConfig rhs = ((ServiceDnsConfig) other);
        return new EqualsBuilder().append(routingPolicy, rhs.routingPolicy).append(namespaceId, rhs.namespaceId).append(dnsRecords, rhs.dnsRecords).isEquals();
    }

}
