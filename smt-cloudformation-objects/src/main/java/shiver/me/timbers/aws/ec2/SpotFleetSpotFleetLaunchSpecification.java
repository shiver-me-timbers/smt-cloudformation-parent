
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
 * SpotFleetSpotFleetLaunchSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BlockDeviceMappings",
    "EbsOptimized",
    "IamInstanceProfile",
    "ImageId",
    "InstanceType",
    "KernelId",
    "KeyName",
    "Monitoring",
    "NetworkInterfaces",
    "Placement",
    "RamdiskId",
    "SecurityGroups",
    "SpotPrice",
    "SubnetId",
    "TagSpecifications",
    "UserData",
    "WeightedCapacity"
})
public class SpotFleetSpotFleetLaunchSpecification implements Property<SpotFleetSpotFleetLaunchSpecification>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings")
    private Set<Property<SpotFleetBlockDeviceMapping>> blockDeviceMappings = new LinkedHashSet<Property<SpotFleetBlockDeviceMapping>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized")
    private CharSequence ebsOptimized;
    /**
     * SpotFleetIamInstanceProfileSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html")
    private Property<SpotFleetIamInstanceProfileSpecification> iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid")
    private CharSequence imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid")
    private CharSequence kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname")
    private CharSequence keyName;
    /**
     * SpotFleetSpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html")
    private Property<SpotFleetSpotFleetMonitoring> monitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces")
    private Set<Property<SpotFleetInstanceNetworkInterfaceSpecification>> networkInterfaces = new LinkedHashSet<Property<SpotFleetInstanceNetworkInterfaceSpecification>>();
    /**
     * SpotFleetSpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html")
    private Property<SpotFleetSpotPlacement> placement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid")
    private CharSequence ramdiskId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups")
    private Set<Property<SpotFleetGroupIdentifier>> securityGroups = new LinkedHashSet<Property<SpotFleetGroupIdentifier>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice")
    private CharSequence spotPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid")
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications")
    private Set<Property<SpotFleetSpotFleetTagSpecification>> tagSpecifications = new LinkedHashSet<Property<SpotFleetSpotFleetTagSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata")
    private CharSequence userData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity")
    private Number weightedCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetBlockDeviceMapping>> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings
     * 
     */
    @JsonIgnore
    public void setBlockDeviceMappings(Set<Property<SpotFleetBlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public SpotFleetSpotFleetLaunchSpecification withBlockDeviceMappings(Set<Property<SpotFleetBlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized
     * 
     */
    @JsonIgnore
    public CharSequence getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public SpotFleetSpotFleetLaunchSpecification withEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * SpotFleetIamInstanceProfileSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetIamInstanceProfileSpecification> getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * SpotFleetIamInstanceProfileSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
     * 
     */
    @JsonIgnore
    public void setIamInstanceProfile(Property<SpotFleetIamInstanceProfileSpecification> iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public SpotFleetSpotFleetLaunchSpecification withIamInstanceProfile(Property<SpotFleetIamInstanceProfileSpecification> iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid
     * 
     */
    @JsonIgnore
    public CharSequence getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid
     * 
     */
    @JsonIgnore
    public void setImageId(CharSequence imageId) {
        this.imageId = imageId;
    }

    public SpotFleetSpotFleetLaunchSpecification withImageId(CharSequence imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public SpotFleetSpotFleetLaunchSpecification withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid
     * 
     */
    @JsonIgnore
    public CharSequence getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid
     * 
     */
    @JsonIgnore
    public void setKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
    }

    public SpotFleetSpotFleetLaunchSpecification withKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname
     * 
     */
    @JsonIgnore
    public CharSequence getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname
     * 
     */
    @JsonIgnore
    public void setKeyName(CharSequence keyName) {
        this.keyName = keyName;
    }

    public SpotFleetSpotFleetLaunchSpecification withKeyName(CharSequence keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * SpotFleetSpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetSpotFleetMonitoring> getMonitoring() {
        return monitoring;
    }

    /**
     * SpotFleetSpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonIgnore
    public void setMonitoring(Property<SpotFleetSpotFleetMonitoring> monitoring) {
        this.monitoring = monitoring;
    }

    public SpotFleetSpotFleetLaunchSpecification withMonitoring(Property<SpotFleetSpotFleetMonitoring> monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetInstanceNetworkInterfaceSpecification>> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces
     * 
     */
    @JsonIgnore
    public void setNetworkInterfaces(Set<Property<SpotFleetInstanceNetworkInterfaceSpecification>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public SpotFleetSpotFleetLaunchSpecification withNetworkInterfaces(Set<Property<SpotFleetInstanceNetworkInterfaceSpecification>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * SpotFleetSpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonIgnore
    public Property<SpotFleetSpotPlacement> getPlacement() {
        return placement;
    }

    /**
     * SpotFleetSpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonIgnore
    public void setPlacement(Property<SpotFleetSpotPlacement> placement) {
        this.placement = placement;
    }

    public SpotFleetSpotFleetLaunchSpecification withPlacement(Property<SpotFleetSpotPlacement> placement) {
        this.placement = placement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid
     * 
     */
    @JsonIgnore
    public CharSequence getRamdiskId() {
        return ramdiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid
     * 
     */
    @JsonIgnore
    public void setRamdiskId(CharSequence ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    public SpotFleetSpotFleetLaunchSpecification withRamdiskId(CharSequence ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetGroupIdentifier>> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(Set<Property<SpotFleetGroupIdentifier>> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public SpotFleetSpotFleetLaunchSpecification withSecurityGroups(Set<Property<SpotFleetGroupIdentifier>> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice
     * 
     */
    @JsonIgnore
    public CharSequence getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice
     * 
     */
    @JsonIgnore
    public void setSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
    }

    public SpotFleetSpotFleetLaunchSpecification withSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid
     * 
     */
    @JsonIgnore
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid
     * 
     */
    @JsonIgnore
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public SpotFleetSpotFleetLaunchSpecification withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications
     * 
     */
    @JsonIgnore
    public Set<Property<SpotFleetSpotFleetTagSpecification>> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications
     * 
     */
    @JsonIgnore
    public void setTagSpecifications(Set<Property<SpotFleetSpotFleetTagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public SpotFleetSpotFleetLaunchSpecification withTagSpecifications(Set<Property<SpotFleetSpotFleetTagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata
     * 
     */
    @JsonIgnore
    public CharSequence getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata
     * 
     */
    @JsonIgnore
    public void setUserData(CharSequence userData) {
        this.userData = userData;
    }

    public SpotFleetSpotFleetLaunchSpecification withUserData(CharSequence userData) {
        this.userData = userData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity
     * 
     */
    @JsonIgnore
    public Number getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity
     * 
     */
    @JsonIgnore
    public void setWeightedCapacity(Number weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    public SpotFleetSpotFleetLaunchSpecification withWeightedCapacity(Number weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("blockDeviceMappings", blockDeviceMappings).append("ebsOptimized", ebsOptimized).append("iamInstanceProfile", iamInstanceProfile).append("imageId", imageId).append("instanceType", instanceType).append("kernelId", kernelId).append("keyName", keyName).append("monitoring", monitoring).append("networkInterfaces", networkInterfaces).append("placement", placement).append("ramdiskId", ramdiskId).append("securityGroups", securityGroups).append("spotPrice", spotPrice).append("subnetId", subnetId).append("tagSpecifications", tagSpecifications).append("userData", userData).append("weightedCapacity", weightedCapacity).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(tagSpecifications).append(kernelId).append(ebsOptimized).append(ramdiskId).append(imageId).append(spotPrice).append(userData).append(blockDeviceMappings).append(instanceType).append(keyName).append(monitoring).append(iamInstanceProfile).append(weightedCapacity).append(networkInterfaces).append(securityGroups).append(placement).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SpotFleetSpotFleetLaunchSpecification) == false) {
            return false;
        }
        SpotFleetSpotFleetLaunchSpecification rhs = ((SpotFleetSpotFleetLaunchSpecification) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(tagSpecifications, rhs.tagSpecifications).append(kernelId, rhs.kernelId).append(ebsOptimized, rhs.ebsOptimized).append(ramdiskId, rhs.ramdiskId).append(imageId, rhs.imageId).append(spotPrice, rhs.spotPrice).append(userData, rhs.userData).append(blockDeviceMappings, rhs.blockDeviceMappings).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(monitoring, rhs.monitoring).append(iamInstanceProfile, rhs.iamInstanceProfile).append(weightedCapacity, rhs.weightedCapacity).append(networkInterfaces, rhs.networkInterfaces).append(securityGroups, rhs.securityGroups).append(placement, rhs.placement).isEquals();
    }

}
