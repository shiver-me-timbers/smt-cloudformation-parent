
package aws.batch;

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
 * ComputeEnvironmentComputeResources
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SpotIamFleetRole",
    "MaxvCpus",
    "BidPercentage",
    "SecurityGroupIds",
    "Subnets",
    "Type",
    "MinvCpus",
    "LaunchTemplate",
    "ImageId",
    "InstanceRole",
    "InstanceTypes",
    "Ec2KeyPair",
    "PlacementGroup",
    "Tags",
    "DesiredvCpus"
})
public class ComputeEnvironmentComputeResources implements Property<ComputeEnvironmentComputeResources>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole
     * 
     */
    @JsonProperty("SpotIamFleetRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole")
    private CharSequence spotIamFleetRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus
     * 
     */
    @JsonProperty("MaxvCpus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus")
    private Integer maxvCpus;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage
     * 
     */
    @JsonProperty("BidPercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage")
    private Integer bidPercentage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets
     * 
     */
    @JsonProperty("Subnets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets")
    private List<CharSequence> subnets = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus
     * 
     */
    @JsonProperty("MinvCpus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus")
    private Integer minvCpus;
    /**
     * ComputeEnvironmentLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html")
    private Property<ComputeEnvironmentLaunchTemplateSpecification> launchTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid")
    private CharSequence imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole
     * 
     */
    @JsonProperty("InstanceRole")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole")
    private CharSequence instanceRole;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes
     * 
     */
    @JsonProperty("InstanceTypes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes")
    private List<CharSequence> instanceTypes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair
     * 
     */
    @JsonProperty("Ec2KeyPair")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair")
    private CharSequence ec2KeyPair;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup
     * 
     */
    @JsonProperty("PlacementGroup")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup")
    private CharSequence placementGroup;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags")
    private Object tags;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus
     * 
     */
    @JsonProperty("DesiredvCpus")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus")
    private Integer desiredvCpus;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole
     * 
     */
    @JsonIgnore
    public CharSequence getSpotIamFleetRole() {
        return spotIamFleetRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-spotiamfleetrole
     * 
     */
    @JsonIgnore
    public void setSpotIamFleetRole(CharSequence spotIamFleetRole) {
        this.spotIamFleetRole = spotIamFleetRole;
    }

    public ComputeEnvironmentComputeResources withSpotIamFleetRole(CharSequence spotIamFleetRole) {
        this.spotIamFleetRole = spotIamFleetRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus
     * 
     */
    @JsonIgnore
    public Integer getMaxvCpus() {
        return maxvCpus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-maxvcpus
     * 
     */
    @JsonIgnore
    public void setMaxvCpus(Integer maxvCpus) {
        this.maxvCpus = maxvCpus;
    }

    public ComputeEnvironmentComputeResources withMaxvCpus(Integer maxvCpus) {
        this.maxvCpus = maxvCpus;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage
     * 
     */
    @JsonIgnore
    public Integer getBidPercentage() {
        return bidPercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-bidpercentage
     * 
     */
    @JsonIgnore
    public void setBidPercentage(Integer bidPercentage) {
        this.bidPercentage = bidPercentage;
    }

    public ComputeEnvironmentComputeResources withBidPercentage(Integer bidPercentage) {
        this.bidPercentage = bidPercentage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-securitygroupids
     * 
     */
    @JsonIgnore
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public ComputeEnvironmentComputeResources withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSubnets() {
        return subnets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-subnets
     * 
     */
    @JsonIgnore
    public void setSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
    }

    public ComputeEnvironmentComputeResources withSubnets(List<CharSequence> subnets) {
        this.subnets = subnets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type
     * 
     */
    @JsonIgnore
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-type
     * 
     */
    @JsonIgnore
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ComputeEnvironmentComputeResources withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus
     * 
     */
    @JsonIgnore
    public Integer getMinvCpus() {
        return minvCpus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-minvcpus
     * 
     */
    @JsonIgnore
    public void setMinvCpus(Integer minvCpus) {
        this.minvCpus = minvCpus;
    }

    public ComputeEnvironmentComputeResources withMinvCpus(Integer minvCpus) {
        this.minvCpus = minvCpus;
        return this;
    }

    /**
     * ComputeEnvironmentLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<ComputeEnvironmentLaunchTemplateSpecification> getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * ComputeEnvironmentLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplate(Property<ComputeEnvironmentLaunchTemplateSpecification> launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public ComputeEnvironmentComputeResources withLaunchTemplate(Property<ComputeEnvironmentLaunchTemplateSpecification> launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid
     * 
     */
    @JsonIgnore
    public CharSequence getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-imageid
     * 
     */
    @JsonIgnore
    public void setImageId(CharSequence imageId) {
        this.imageId = imageId;
    }

    public ComputeEnvironmentComputeResources withImageId(CharSequence imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceRole() {
        return instanceRole;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancerole
     * 
     */
    @JsonIgnore
    public void setInstanceRole(CharSequence instanceRole) {
        this.instanceRole = instanceRole;
    }

    public ComputeEnvironmentComputeResources withInstanceRole(CharSequence instanceRole) {
        this.instanceRole = instanceRole;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getInstanceTypes() {
        return instanceTypes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-instancetypes
     * 
     */
    @JsonIgnore
    public void setInstanceTypes(List<CharSequence> instanceTypes) {
        this.instanceTypes = instanceTypes;
    }

    public ComputeEnvironmentComputeResources withInstanceTypes(List<CharSequence> instanceTypes) {
        this.instanceTypes = instanceTypes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair
     * 
     */
    @JsonIgnore
    public CharSequence getEc2KeyPair() {
        return ec2KeyPair;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-ec2keypair
     * 
     */
    @JsonIgnore
    public void setEc2KeyPair(CharSequence ec2KeyPair) {
        this.ec2KeyPair = ec2KeyPair;
    }

    public ComputeEnvironmentComputeResources withEc2KeyPair(CharSequence ec2KeyPair) {
        this.ec2KeyPair = ec2KeyPair;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup
     * 
     */
    @JsonIgnore
    public CharSequence getPlacementGroup() {
        return placementGroup;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-placementgroup
     * 
     */
    @JsonIgnore
    public void setPlacementGroup(CharSequence placementGroup) {
        this.placementGroup = placementGroup;
    }

    public ComputeEnvironmentComputeResources withPlacementGroup(CharSequence placementGroup) {
        this.placementGroup = placementGroup;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags
     * 
     */
    @JsonIgnore
    public Object getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-tags
     * 
     */
    @JsonIgnore
    public void setTags(Object tags) {
        this.tags = tags;
    }

    public ComputeEnvironmentComputeResources withTags(Object tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus
     * 
     */
    @JsonIgnore
    public Integer getDesiredvCpus() {
        return desiredvCpus;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-computeenvironment-computeresources.html#cfn-batch-computeenvironment-computeresources-desiredvcpus
     * 
     */
    @JsonIgnore
    public void setDesiredvCpus(Integer desiredvCpus) {
        this.desiredvCpus = desiredvCpus;
    }

    public ComputeEnvironmentComputeResources withDesiredvCpus(Integer desiredvCpus) {
        this.desiredvCpus = desiredvCpus;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("spotIamFleetRole", spotIamFleetRole).append("maxvCpus", maxvCpus).append("bidPercentage", bidPercentage).append("securityGroupIds", securityGroupIds).append("subnets", subnets).append("type", type).append("minvCpus", minvCpus).append("launchTemplate", launchTemplate).append("imageId", imageId).append("instanceRole", instanceRole).append("instanceTypes", instanceTypes).append("ec2KeyPair", ec2KeyPair).append("placementGroup", placementGroup).append("tags", tags).append("desiredvCpus", desiredvCpus).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(spotIamFleetRole).append(ec2KeyPair).append(imageId).append(instanceTypes).append(desiredvCpus).append(type).append(instanceRole).append(bidPercentage).append(minvCpus).append(tags).append(securityGroupIds).append(launchTemplate).append(subnets).append(placementGroup).append(maxvCpus).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ComputeEnvironmentComputeResources) == false) {
            return false;
        }
        ComputeEnvironmentComputeResources rhs = ((ComputeEnvironmentComputeResources) other);
        return new EqualsBuilder().append(spotIamFleetRole, rhs.spotIamFleetRole).append(ec2KeyPair, rhs.ec2KeyPair).append(imageId, rhs.imageId).append(instanceTypes, rhs.instanceTypes).append(desiredvCpus, rhs.desiredvCpus).append(type, rhs.type).append(instanceRole, rhs.instanceRole).append(bidPercentage, rhs.bidPercentage).append(minvCpus, rhs.minvCpus).append(tags, rhs.tags).append(securityGroupIds, rhs.securityGroupIds).append(launchTemplate, rhs.launchTemplate).append(subnets, rhs.subnets).append(placementGroup, rhs.placementGroup).append(maxvCpus, rhs.maxvCpus).isEquals();
    }

}