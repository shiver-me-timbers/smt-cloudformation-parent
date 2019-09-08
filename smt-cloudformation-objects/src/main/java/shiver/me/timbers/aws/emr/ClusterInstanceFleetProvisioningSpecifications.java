
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
 * ClusterInstanceFleetProvisioningSpecifications
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-instancefleetprovisioningspecifications.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SpotSpecification"
})
public class ClusterInstanceFleetProvisioningSpecifications implements Property<ClusterInstanceFleetProvisioningSpecifications>
{

    /**
     * ClusterSpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
     * 
     */
    @JsonProperty("SpotSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html")
    private Property<ClusterSpotProvisioningSpecification> spotSpecification;

    /**
     * ClusterSpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
     * 
     */
    @JsonIgnore
    public Property<ClusterSpotProvisioningSpecification> getSpotSpecification() {
        return spotSpecification;
    }

    /**
     * ClusterSpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
     * 
     */
    @JsonIgnore
    public void setSpotSpecification(Property<ClusterSpotProvisioningSpecification> spotSpecification) {
        this.spotSpecification = spotSpecification;
    }

    public ClusterInstanceFleetProvisioningSpecifications withSpotSpecification(Property<ClusterSpotProvisioningSpecification> spotSpecification) {
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
        if ((other instanceof ClusterInstanceFleetProvisioningSpecifications) == false) {
            return false;
        }
        ClusterInstanceFleetProvisioningSpecifications rhs = ((ClusterInstanceFleetProvisioningSpecifications) other);
        return new EqualsBuilder().append(spotSpecification, rhs.spotSpecification).isEquals();
    }

}
