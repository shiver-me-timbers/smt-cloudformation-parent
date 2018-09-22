
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
 * SpotFleetLaunchSpecification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
public class SpotFleetLaunchSpecification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings")
    private Set<BlockDeviceMapping> blockDeviceMappings = new LinkedHashSet<BlockDeviceMapping>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized")
    private Boolean ebsOptimized;
    /**
     * IamInstanceProfileSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html")
    private IamInstanceProfileSpecification iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid")
    private String imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype")
    private String instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid")
    private String kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname")
    private String keyName;
    /**
     * SpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html")
    private SpotFleetMonitoring monitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces")
    private Set<InstanceNetworkInterfaceSpecification> networkInterfaces = new LinkedHashSet<InstanceNetworkInterfaceSpecification>();
    /**
     * SpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html")
    private SpotPlacement placement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid")
    private String ramdiskId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups")
    private Set<GroupIdentifier> securityGroups = new LinkedHashSet<GroupIdentifier>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice")
    private String spotPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid")
    private String subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications")
    private Set<SpotFleetTagSpecification> tagSpecifications = new LinkedHashSet<SpotFleetTagSpecification>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata")
    private String userData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity")
    private Double weightedCapacity;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public Set<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public void setBlockDeviceMappings(Set<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public SpotFleetLaunchSpecification withBlockDeviceMappings(Set<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public SpotFleetLaunchSpecification withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * IamInstanceProfileSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public IamInstanceProfileSpecification getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * IamInstanceProfileSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public void setIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public SpotFleetLaunchSpecification withIamInstanceProfile(IamInstanceProfileSpecification iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid
     * 
     */
    @JsonProperty("ImageId")
    public String getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-imageid
     * 
     */
    @JsonProperty("ImageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public SpotFleetLaunchSpecification withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public SpotFleetLaunchSpecification withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public String getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    public SpotFleetLaunchSpecification withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname
     * 
     */
    @JsonProperty("KeyName")
    public String getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-keyname
     * 
     */
    @JsonProperty("KeyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public SpotFleetLaunchSpecification withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * SpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    public SpotFleetMonitoring getMonitoring() {
        return monitoring;
    }

    /**
     * SpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    public void setMonitoring(SpotFleetMonitoring monitoring) {
        this.monitoring = monitoring;
    }

    public SpotFleetLaunchSpecification withMonitoring(SpotFleetMonitoring monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    public Set<InstanceNetworkInterfaceSpecification> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    public void setNetworkInterfaces(Set<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public SpotFleetLaunchSpecification withNetworkInterfaces(Set<InstanceNetworkInterfaceSpecification> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * SpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonProperty("Placement")
    public SpotPlacement getPlacement() {
        return placement;
    }

    /**
     * SpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonProperty("Placement")
    public void setPlacement(SpotPlacement placement) {
        this.placement = placement;
    }

    public SpotFleetLaunchSpecification withPlacement(SpotPlacement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    public SpotFleetLaunchSpecification withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public Set<GroupIdentifier> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public void setSecurityGroups(Set<GroupIdentifier> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public SpotFleetLaunchSpecification withSecurityGroups(Set<GroupIdentifier> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public SpotFleetLaunchSpecification withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public SpotFleetLaunchSpecification withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    public Set<SpotFleetTagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    public void setTagSpecifications(Set<SpotFleetTagSpecification> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public SpotFleetLaunchSpecification withTagSpecifications(Set<SpotFleetTagSpecification> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata
     * 
     */
    @JsonProperty("UserData")
    public String getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-userdata
     * 
     */
    @JsonProperty("UserData")
    public void setUserData(String userData) {
        this.userData = userData;
    }

    public SpotFleetLaunchSpecification withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    public Double getWeightedCapacity() {
        return weightedCapacity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications.html#cfn-ec2-spotfleet-spotfleetlaunchspecification-weightedcapacity
     * 
     */
    @JsonProperty("WeightedCapacity")
    public void setWeightedCapacity(Double weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    public SpotFleetLaunchSpecification withWeightedCapacity(Double weightedCapacity) {
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
        if ((other instanceof SpotFleetLaunchSpecification) == false) {
            return false;
        }
        SpotFleetLaunchSpecification rhs = ((SpotFleetLaunchSpecification) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(tagSpecifications, rhs.tagSpecifications).append(kernelId, rhs.kernelId).append(ebsOptimized, rhs.ebsOptimized).append(ramdiskId, rhs.ramdiskId).append(imageId, rhs.imageId).append(spotPrice, rhs.spotPrice).append(userData, rhs.userData).append(blockDeviceMappings, rhs.blockDeviceMappings).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(monitoring, rhs.monitoring).append(iamInstanceProfile, rhs.iamInstanceProfile).append(weightedCapacity, rhs.weightedCapacity).append(networkInterfaces, rhs.networkInterfaces).append(securityGroups, rhs.securityGroups).append(placement, rhs.placement).isEquals();
    }

}
