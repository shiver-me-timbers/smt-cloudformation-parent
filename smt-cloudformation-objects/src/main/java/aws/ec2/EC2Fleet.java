
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.ArrayList;
import java.util.List;


/**
 * EC2Fleet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TargetCapacitySpecification",
    "OnDemandOptions",
    "Type",
    "ExcessCapacityTerminationPolicy",
    "TagSpecifications",
    "SpotOptions",
    "ValidFrom",
    "ReplaceUnhealthyInstances",
    "LaunchTemplateConfigs",
    "TerminateInstancesWithExpiration",
    "ValidUntil"
})
public class EC2Fleet {

    /**
     * TargetCapacitySpecificationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html
     * 
     */
    @JsonProperty("TargetCapacitySpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html")
    private TargetCapacitySpecificationRequest targetCapacitySpecification;
    /**
     * OnDemandOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html
     * 
     */
    @JsonProperty("OnDemandOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html")
    private OnDemandOptionsRequest onDemandOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy
     * 
     */
    @JsonProperty("ExcessCapacityTerminationPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy")
    private CharSequence excessCapacityTerminationPolicy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-tagspecifications")
    private List<SpotFleetTagSpecification> tagSpecifications = new ArrayList<SpotFleetTagSpecification>();
    /**
     * SpotOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html
     * 
     */
    @JsonProperty("SpotOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html")
    private SpotOptionsRequest spotOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom
     * 
     */
    @JsonProperty("ValidFrom")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom")
    private CharSequence validFrom;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances
     * 
     */
    @JsonProperty("ReplaceUnhealthyInstances")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances")
    private Boolean replaceUnhealthyInstances;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs
     * 
     */
    @JsonProperty("LaunchTemplateConfigs")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs")
    private List<FleetLaunchTemplateConfigRequest> launchTemplateConfigs = new ArrayList<FleetLaunchTemplateConfigRequest>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration
     * 
     */
    @JsonProperty("TerminateInstancesWithExpiration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration")
    private Boolean terminateInstancesWithExpiration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil
     * 
     */
    @JsonProperty("ValidUntil")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil")
    private CharSequence validUntil;

    /**
     * TargetCapacitySpecificationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html
     * 
     */
    @JsonIgnore
    public TargetCapacitySpecificationRequest getTargetCapacitySpecification() {
        return targetCapacitySpecification;
    }

    /**
     * TargetCapacitySpecificationRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-targetcapacityspecificationrequest.html
     * 
     */
    @JsonIgnore
    public void setTargetCapacitySpecification(TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
    }

    public EC2Fleet withTargetCapacitySpecification(TargetCapacitySpecificationRequest targetCapacitySpecification) {
        this.targetCapacitySpecification = targetCapacitySpecification;
        return this;
    }

    /**
     * OnDemandOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html
     * 
     */
    @JsonIgnore
    public OnDemandOptionsRequest getOnDemandOptions() {
        return onDemandOptions;
    }

    /**
     * OnDemandOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-ondemandoptionsrequest.html
     * 
     */
    @JsonIgnore
    public void setOnDemandOptions(OnDemandOptionsRequest onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
    }

    public EC2Fleet withOnDemandOptions(OnDemandOptionsRequest onDemandOptions) {
        this.onDemandOptions = onDemandOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public EC2Fleet withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getExcessCapacityTerminationPolicy() {
        return excessCapacityTerminationPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-excesscapacityterminationpolicy
     * 
     */
    @JsonIgnore
    public void setExcessCapacityTerminationPolicy(CharSequence excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
    }

    public EC2Fleet withExcessCapacityTerminationPolicy(CharSequence excessCapacityTerminationPolicy) {
        this.excessCapacityTerminationPolicy = excessCapacityTerminationPolicy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-tagspecifications
     * 
     */
    @JsonIgnore
    public List<SpotFleetTagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-tagspecifications
     * 
     */
    @JsonIgnore
    public void setTagSpecifications(List<SpotFleetTagSpecification> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public EC2Fleet withTagSpecifications(List<SpotFleetTagSpecification> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * SpotOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html
     * 
     */
    @JsonIgnore
    public SpotOptionsRequest getSpotOptions() {
        return spotOptions;
    }

    /**
     * SpotOptionsRequest
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-ec2fleet-spotoptionsrequest.html
     * 
     */
    @JsonIgnore
    public void setSpotOptions(SpotOptionsRequest spotOptions) {
        this.spotOptions = spotOptions;
    }

    public EC2Fleet withSpotOptions(SpotOptionsRequest spotOptions) {
        this.spotOptions = spotOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom
     * 
     */
    @JsonIgnore
    public CharSequence getValidFrom() {
        return validFrom;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validfrom
     * 
     */
    @JsonIgnore
    public void setValidFrom(CharSequence validFrom) {
        this.validFrom = validFrom;
    }

    public EC2Fleet withValidFrom(CharSequence validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances
     * 
     */
    @JsonIgnore
    public Boolean getReplaceUnhealthyInstances() {
        return replaceUnhealthyInstances;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-replaceunhealthyinstances
     * 
     */
    @JsonIgnore
    public void setReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
    }

    public EC2Fleet withReplaceUnhealthyInstances(Boolean replaceUnhealthyInstances) {
        this.replaceUnhealthyInstances = replaceUnhealthyInstances;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs
     * 
     */
    @JsonIgnore
    public List<FleetLaunchTemplateConfigRequest> getLaunchTemplateConfigs() {
        return launchTemplateConfigs;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-launchtemplateconfigs
     * 
     */
    @JsonIgnore
    public void setLaunchTemplateConfigs(List<FleetLaunchTemplateConfigRequest> launchTemplateConfigs) {
        this.launchTemplateConfigs = launchTemplateConfigs;
    }

    public EC2Fleet withLaunchTemplateConfigs(List<FleetLaunchTemplateConfigRequest> launchTemplateConfigs) {
        this.launchTemplateConfigs = launchTemplateConfigs;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration
     * 
     */
    @JsonIgnore
    public Boolean getTerminateInstancesWithExpiration() {
        return terminateInstancesWithExpiration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-terminateinstanceswithexpiration
     * 
     */
    @JsonIgnore
    public void setTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
    }

    public EC2Fleet withTerminateInstancesWithExpiration(Boolean terminateInstancesWithExpiration) {
        this.terminateInstancesWithExpiration = terminateInstancesWithExpiration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil
     * 
     */
    @JsonIgnore
    public CharSequence getValidUntil() {
        return validUntil;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-ec2fleet.html#cfn-ec2-ec2fleet-validuntil
     * 
     */
    @JsonIgnore
    public void setValidUntil(CharSequence validUntil) {
        this.validUntil = validUntil;
    }

    public EC2Fleet withValidUntil(CharSequence validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("targetCapacitySpecification", targetCapacitySpecification).append("onDemandOptions", onDemandOptions).append("type", type).append("excessCapacityTerminationPolicy", excessCapacityTerminationPolicy).append("tagSpecifications", tagSpecifications).append("spotOptions", spotOptions).append("validFrom", validFrom).append("replaceUnhealthyInstances", replaceUnhealthyInstances).append("launchTemplateConfigs", launchTemplateConfigs).append("terminateInstancesWithExpiration", terminateInstancesWithExpiration).append("validUntil", validUntil).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagSpecifications).append(targetCapacitySpecification).append(replaceUnhealthyInstances).append(onDemandOptions).append(terminateInstancesWithExpiration).append(launchTemplateConfigs).append(validUntil).append(excessCapacityTerminationPolicy).append(validFrom).append(type).append(spotOptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EC2Fleet) == false) {
            return false;
        }
        EC2Fleet rhs = ((EC2Fleet) other);
        return new EqualsBuilder().append(tagSpecifications, rhs.tagSpecifications).append(targetCapacitySpecification, rhs.targetCapacitySpecification).append(replaceUnhealthyInstances, rhs.replaceUnhealthyInstances).append(onDemandOptions, rhs.onDemandOptions).append(terminateInstancesWithExpiration, rhs.terminateInstancesWithExpiration).append(launchTemplateConfigs, rhs.launchTemplateConfigs).append(validUntil, rhs.validUntil).append(excessCapacityTerminationPolicy, rhs.excessCapacityTerminationPolicy).append(validFrom, rhs.validFrom).append(type, rhs.type).append(spotOptions, rhs.spotOptions).isEquals();
    }

}
