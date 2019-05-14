
package aws.ec2;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchTemplateConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LaunchTemplateSpecification",
    "Overrides"
})
public class LaunchTemplateConfig implements Property<LaunchTemplateConfig>
{

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplateSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html")
    private Property<FleetLaunchTemplateSpecification> launchTemplateSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonProperty("Overrides")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides")
    private Set<Property<LaunchTemplateOverrides>> overrides = new LinkedHashSet<Property<LaunchTemplateOverrides>>();

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<FleetLaunchTemplateSpecification> getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateSpecification(Property<FleetLaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    public LaunchTemplateConfig withLaunchTemplateSpecification(Property<FleetLaunchTemplateSpecification> launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonIgnore
    public Set<Property<LaunchTemplateOverrides>> getOverrides() {
        return overrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonIgnore
    public void setOverrides(Set<Property<LaunchTemplateOverrides>> overrides) {
        this.overrides = overrides;
    }

    public LaunchTemplateConfig withOverrides(Set<Property<LaunchTemplateOverrides>> overrides) {
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
        if ((other instanceof LaunchTemplateConfig) == false) {
            return false;
        }
        LaunchTemplateConfig rhs = ((LaunchTemplateConfig) other);
        return new EqualsBuilder().append(launchTemplateSpecification, rhs.launchTemplateSpecification).append(overrides, rhs.overrides).isEquals();
    }

}
