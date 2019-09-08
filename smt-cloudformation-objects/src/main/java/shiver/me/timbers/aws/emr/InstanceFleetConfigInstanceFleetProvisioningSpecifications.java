
package shiver.me.timbers.aws.emr;

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
 * InstanceFleetConfigInstanceFleetProvisioningSpecifications
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SpotSpecification"
})
public class InstanceFleetConfigInstanceFleetProvisioningSpecifications implements Property<InstanceFleetConfigInstanceFleetProvisioningSpecifications>
{

    /**
     * InstanceFleetConfigSpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html
     * 
     */
    @JsonProperty("SpotSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html")
    private Property<InstanceFleetConfigSpotProvisioningSpecification> spotSpecification;

    /**
     * InstanceFleetConfigSpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html
     * 
     */
    @JsonIgnore
    public Property<InstanceFleetConfigSpotProvisioningSpecification> getSpotSpecification() {
        return spotSpecification;
    }

    /**
     * InstanceFleetConfigSpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-spotprovisioningspecification.html
     * 
     */
    @JsonIgnore
    public void setSpotSpecification(Property<InstanceFleetConfigSpotProvisioningSpecification> spotSpecification) {
        this.spotSpecification = spotSpecification;
    }

    public InstanceFleetConfigInstanceFleetProvisioningSpecifications withSpotSpecification(Property<InstanceFleetConfigSpotProvisioningSpecification> spotSpecification) {
        this.spotSpecification = spotSpecification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotSpecification", spotSpecification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(spotSpecification).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceFleetConfigInstanceFleetProvisioningSpecifications) == false) {
            return false;
        }
        InstanceFleetConfigInstanceFleetProvisioningSpecifications rhs = ((InstanceFleetConfigInstanceFleetProvisioningSpecifications) other);
        return new EqualsBuilder().append(spotSpecification, rhs.spotSpecification).isEquals();
    }

}
