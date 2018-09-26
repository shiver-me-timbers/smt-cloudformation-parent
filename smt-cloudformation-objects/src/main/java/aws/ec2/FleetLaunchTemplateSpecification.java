
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * FleetLaunchTemplateSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LaunchTemplateId",
    "LaunchTemplateName",
    "Version"
})
public class FleetLaunchTemplateSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid
     * 
     */
    @JsonProperty("LaunchTemplateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid")
    private CharSequence launchTemplateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename
     * 
     */
    @JsonProperty("LaunchTemplateName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename")
    private CharSequence launchTemplateName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version
     * 
     */
    @JsonProperty("Version")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version")
    private CharSequence version;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid
     * 
     */
    public CharSequence getLaunchTemplateId() {
        return launchTemplateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplateid
     * 
     */
    public void setLaunchTemplateId(CharSequence launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
    }

    public FleetLaunchTemplateSpecification withLaunchTemplateId(CharSequence launchTemplateId) {
        this.launchTemplateId = launchTemplateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename
     * 
     */
    public CharSequence getLaunchTemplateName() {
        return launchTemplateName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-launchtemplatename
     * 
     */
    public void setLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
    }

    public FleetLaunchTemplateSpecification withLaunchTemplateName(CharSequence launchTemplateName) {
        this.launchTemplateName = launchTemplateName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version
     * 
     */
    public CharSequence getVersion() {
        return version;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html#cfn-ec2-spotfleet-fleetlaunchtemplatespecification-version
     * 
     */
    public void setVersion(CharSequence version) {
        this.version = version;
    }

    public FleetLaunchTemplateSpecification withVersion(CharSequence version) {
        this.version = version;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("launchTemplateId", launchTemplateId).append("launchTemplateName", launchTemplateName).append("version", version).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(launchTemplateId).append(version).append(launchTemplateName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetLaunchTemplateSpecification) == false) {
            return false;
        }
        FleetLaunchTemplateSpecification rhs = ((FleetLaunchTemplateSpecification) other);
        return new EqualsBuilder().append(launchTemplateId, rhs.launchTemplateId).append(version, rhs.version).append(launchTemplateName, rhs.launchTemplateName).isEquals();
    }

}
