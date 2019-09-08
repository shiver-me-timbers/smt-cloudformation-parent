
package shiver.me.timbers.aws.ec2;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * SpotFleetLaunchTemplateConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateSpecification",
    "Overrides"
})
public class SpotFleetLaunchTemplateConfig implements Property<SpotFleetLaunchTemplateConfig>
{

    /**
     * SpotFleetFleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplateSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html")
    private Property<SpotFleetFleetLaunchTemplateSpecification> launchTemplateSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonProperty("Overrides")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides")
    private Set<Property<SpotFleetLaunchTemplateOverrides>> overrides = new LinkedHashSet<Property<SpotFleetLaunchTemplateOverrides>>();

    /**
     * SpotFleetFleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetFleetLaunchTemplateSpecification> getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * SpotFleetFleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateSpecification(Property<SpotFleetFleetLaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    public SpotFleetLaunchTemplateConfig withLaunchTemplateSpecification(Property<SpotFleetFleetLaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetLaunchTemplateOverrides>> getOverrides() {
        return overrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonIgnore
    public void setOverrides(Set<Property<SpotFleetLaunchTemplateOverrides>> overrides) {
        this.overrides = overrides;
    }

    public SpotFleetLaunchTemplateConfig withOverrides(Set<Property<SpotFleetLaunchTemplateOverrides>> overrides) {
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
        if ((other instanceof SpotFleetLaunchTemplateConfig) == false) {
            return false;
        }
        SpotFleetLaunchTemplateConfig rhs = ((SpotFleetLaunchTemplateConfig) other);
        return new EqualsBuilder().append(launchTemplateSpecification, rhs.launchTemplateSpecification).append(overrides, rhs.overrides).isEquals();
    }

}
