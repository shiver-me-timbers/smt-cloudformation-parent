
package aws.ec2;

import java.util.LinkedHashSet;
import java.util.Set;
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
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LaunchTemplateSpecification",
    "Overrides"
})
public class LaunchTemplateConfig {

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplateSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html")
    private FleetLaunchTemplateSpecification launchTemplateSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    @JsonProperty("Overrides")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides")
    private Set<LaunchTemplateOverrides> overrides = new LinkedHashSet<LaunchTemplateOverrides>();

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    public FleetLaunchTemplateSpecification getLaunchTemplateSpecification() {
        return launchTemplateSpecification;
    }

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    public void setLaunchTemplateSpecification(FleetLaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
    }

    public LaunchTemplateConfig withLaunchTemplateSpecification(FleetLaunchTemplateSpecification launchTemplateSpecification) {
        this.launchTemplateSpecification = launchTemplateSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    public Set<LaunchTemplateOverrides> getOverrides() {
        return overrides;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-launchtemplateconfig.html#cfn-ec2-spotfleet-launchtemplateconfig-overrides
     * 
     */
    public void setOverrides(Set<LaunchTemplateOverrides> overrides) {
        this.overrides = overrides;
    }

    public LaunchTemplateConfig withOverrides(Set<LaunchTemplateOverrides> overrides) {
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
