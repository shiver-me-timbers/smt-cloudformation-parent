
package aws.servicediscovery;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DnsRecord
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "TTL"
})
public class DnsRecord {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl
     * 
     */
    @JsonProperty("TTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl")
    private CharSequence tTL;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public DnsRecord withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl
     * 
     */
    public CharSequence getTTL() {
        return tTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicediscovery-service-dnsrecord.html#cfn-servicediscovery-service-dnsrecord-ttl
     * 
     */
    public void setTTL(CharSequence tTL) {
        this.tTL = tTL;
    }

    public DnsRecord withTTL(CharSequence tTL) {
        this.tTL = tTL;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("tTL", tTL).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(tTL).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DnsRecord) == false) {
            return false;
        }
        DnsRecord rhs = ((DnsRecord) other);
        return new EqualsBuilder().append(type, rhs.type).append(tTL, rhs.tTL).isEquals();
    }

}
