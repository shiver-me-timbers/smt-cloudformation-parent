
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
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
 * EC2FleetFleetLaunchTemplateConfigRequest
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateSpecification",
    "Overrides"
})
public class EC2FleetFleetLaunchTemplateConfigRequest implements Property<EC2FleetFleetLaunchTemplateConfigRequest>
{

    /**
     * EC2FleetFleetLaunchTemplateSpecificationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html
     * 
     */
    @JsonProperty("LaunchTemplateSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html")
    private Property<EC2FleetFleetLaunchTemplateSpecificationRequest> launchTemplateSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-overrides
     * 
     */
    @JsonProperty("Overrides")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-overrides")
    private List<Property<EC2FleetFleetLaunchTemplateOverridesRequest>> overrides = new ArrayList<Property<EC2FleetFleetLaunchTemplateOverridesRequest>>();

    /**
     * EC2FleetFleetLaunchTemplateSpecificationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html
     * 
     */
    @JsonIgnore
    public Property<EC2FleetFleetLaunchTemplateSpecificationRequest> getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * EC2FleetFleetLaunchTemplateSpecificationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplatespecificationrequest.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateSpecification(Property<EC2FleetFleetLaunchTemplateSpecificationRequest> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    public EC2FleetFleetLaunchTemplateConfigRequest withLaunchTemplateSpecification(Property<EC2FleetFleetLaunchTemplateSpecificationRequest> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-overrides
     * 
     */
    @JsonIgnore
    public List<Property<EC2FleetFleetLaunchTemplateOverridesRequest>> getOverrides() {
        return overrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-fleetlaunchtemplateconfigrequest.html#cfn-ec2-ec2fleet-fleetlaunchtemplateconfigrequest-overrides
     * 
     */
    @JsonIgnore
    public void setOverrides(List<Property<EC2FleetFleetLaunchTemplateOverridesRequest>> overrides) {
        this.overrides = overrides;
    }

    public EC2FleetFleetLaunchTemplateConfigRequest withOverrides(List<Property<EC2FleetFleetLaunchTemplateOverridesRequest>> overrides) {
        this.overrides = overrides;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("launchTemplateSpecification", launchTemplateSpecification).append("overrides", overrides).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(launchTemplateSpecification).append(overrides).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2FleetFleetLaunchTemplateConfigRequest) == false) {
            return false;
        }
        EC2FleetFleetLaunchTemplateConfigRequest rhs = ((EC2FleetFleetLaunchTemplateConfigRequest) other);
        return new EqualsBuilder().append(launchTemplateSpecification, rhs.launchTemplateSpecification).append(overrides, rhs.overrides).isEquals();
    }

}
