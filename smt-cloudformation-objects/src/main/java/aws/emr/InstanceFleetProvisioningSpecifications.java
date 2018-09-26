
package aws.emr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceFleetProvisioningSpecifications
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-instancefleetconfig-instancefleetprovisioningspecifications.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SpotSpecification"
})
public class InstanceFleetProvisioningSpecifications {

    /**
     * SpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
     * 
     */
    @JsonProperty("SpotSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html")
    private SpotProvisioningSpecification spotSpecification;

    /**
     * SpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
     * 
     */
    public SpotProvisioningSpecification getSpotSpecification() {
        return spotSpecification;
    }

    /**
     * SpotProvisioningSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-spotprovisioningspecification.html
     * 
     */
    public void setSpotSpecification(SpotProvisioningSpecification spotSpecification) {
        this.spotSpecification = spotSpecification;
    }

    public InstanceFleetProvisioningSpecifications withSpotSpecification(SpotProvisioningSpecification spotSpecification) {
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
        if ((other instanceof InstanceFleetProvisioningSpecifications) == false) {
            return false;
        }
        InstanceFleetProvisioningSpecifications rhs = ((InstanceFleetProvisioningSpecifications) other);
        return new EqualsBuilder().append(spotSpecification, rhs.spotSpecification).isEquals();
    }

}
