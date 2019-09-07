
package aws.elasticsearch;

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
 * DomainZoneAwarenessConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AvailabilityZoneCount"
})
public class DomainZoneAwarenessConfig implements Property<DomainZoneAwarenessConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html#cfn-elasticsearch-domain-zoneawarenessconfig-availabilityzonecount
     * 
     */
    @JsonProperty("AvailabilityZoneCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html#cfn-elasticsearch-domain-zoneawarenessconfig-availabilityzonecount")
    private Number availabilityZoneCount;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html#cfn-elasticsearch-domain-zoneawarenessconfig-availabilityzonecount
     * 
     */
    @JsonIgnore
    public Number getAvailabilityZoneCount() {
        return availabilityZoneCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-zoneawarenessconfig.html#cfn-elasticsearch-domain-zoneawarenessconfig-availabilityzonecount
     * 
     */
    @JsonIgnore
    public void setAvailabilityZoneCount(Number availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    public DomainZoneAwarenessConfig withAvailabilityZoneCount(Number availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("availabilityZoneCount", availabilityZoneCount).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(availabilityZoneCount).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DomainZoneAwarenessConfig) == false) {
            return false;
        }
        DomainZoneAwarenessConfig rhs = ((DomainZoneAwarenessConfig) other);
        return new EqualsBuilder().append(availabilityZoneCount, rhs.availabilityZoneCount).isEquals();
    }

}
