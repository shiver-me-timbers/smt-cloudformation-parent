
package aws.autoscaling;

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
 * LaunchConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AssociatePublicIpAddress",
    "BlockDeviceMappings",
    "ClassicLinkVPCId",
    "ClassicLinkVPCSecurityGroups",
    "EbsOptimized",
    "IamInstanceProfile",
    "ImageId",
    "InstanceId",
    "InstanceMonitoring",
    "InstanceType",
    "KernelId",
    "KeyName",
    "LaunchConfigurationName",
    "PlacementTenancy",
    "RamDiskId",
    "SecurityGroups",
    "SpotPrice",
    "UserData"
})
public class LaunchConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip")
    private Boolean associatePublicIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings")
    private Set<BlockDeviceMapping> blockDeviceMappings = new LinkedHashSet<BlockDeviceMapping>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid
     * 
     */
    @JsonProperty("ClassicLinkVPCId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid")
    private String classicLinkVPCId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups
     * 
     */
    @JsonProperty("ClassicLinkVPCSecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups")
    private Set<String> classicLinkVPCSecurityGroups = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized")
    private Boolean ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile")
    private String iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid")
    private String imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid")
    private String instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring
     * 
     */
    @JsonProperty("InstanceMonitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring")
    private Boolean instanceMonitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype")
    private String instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid")
    private String kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname")
    private String keyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname")
    private String launchConfigurationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy
     * 
     */
    @JsonProperty("PlacementTenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy")
    private String placementTenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid")
    private String ramDiskId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups")
    private Set<String> securityGroups = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice")
    private String spotPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata")
    private String userData;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    public Boolean getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip
     * 
     */
    @JsonProperty("AssociatePublicIpAddress")
    public void setAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    public LaunchConfiguration withAssociatePublicIpAddress(Boolean associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public Set<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public void setBlockDeviceMappings(Set<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public LaunchConfiguration withBlockDeviceMappings(Set<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid
     * 
     */
    @JsonProperty("ClassicLinkVPCId")
    public String getClassicLinkVPCId() {
        return classicLinkVPCId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid
     * 
     */
    @JsonProperty("ClassicLinkVPCId")
    public void setClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }

    public LaunchConfiguration withClassicLinkVPCId(String classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups
     * 
     */
    @JsonProperty("ClassicLinkVPCSecurityGroups")
    public Set<String> getClassicLinkVPCSecurityGroups() {
        return classicLinkVPCSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups
     * 
     */
    @JsonProperty("ClassicLinkVPCSecurityGroups")
    public void setClassicLinkVPCSecurityGroups(Set<String> classicLinkVPCSecurityGroups) {
        this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroups;
    }

    public LaunchConfiguration withClassicLinkVPCSecurityGroups(Set<String> classicLinkVPCSecurityGroups) {
        this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public LaunchConfiguration withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public LaunchConfiguration withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid
     * 
     */
    @JsonProperty("ImageId")
    public String getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid
     * 
     */
    @JsonProperty("ImageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public LaunchConfiguration withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public LaunchConfiguration withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring
     * 
     */
    @JsonProperty("InstanceMonitoring")
    public Boolean getInstanceMonitoring() {
        return instanceMonitoring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring
     * 
     */
    @JsonProperty("InstanceMonitoring")
    public void setInstanceMonitoring(Boolean instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }

    public LaunchConfiguration withInstanceMonitoring(Boolean instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public LaunchConfiguration withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public String getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    public LaunchConfiguration withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname
     * 
     */
    @JsonProperty("KeyName")
    public String getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname
     * 
     */
    @JsonProperty("KeyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public LaunchConfiguration withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    public String getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    public void setLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    public LaunchConfiguration withLaunchConfigurationName(String launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy
     * 
     */
    @JsonProperty("PlacementTenancy")
    public String getPlacementTenancy() {
        return placementTenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy
     * 
     */
    @JsonProperty("PlacementTenancy")
    public void setPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    public LaunchConfiguration withPlacementTenancy(String placementTenancy) {
        this.placementTenancy = placementTenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    public String getRamDiskId() {
        return ramDiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    public void setRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    public LaunchConfiguration withRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public Set<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public void setSecurityGroups(Set<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public LaunchConfiguration withSecurityGroups(Set<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    public String getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    public void setSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
    }

    public LaunchConfiguration withSpotPrice(String spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata
     * 
     */
    @JsonProperty("UserData")
    public String getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata
     * 
     */
    @JsonProperty("UserData")
    public void setUserData(String userData) {
        this.userData = userData;
    }

    public LaunchConfiguration withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("associatePublicIpAddress", associatePublicIpAddress).append("blockDeviceMappings", blockDeviceMappings).append("classicLinkVPCId", classicLinkVPCId).append("classicLinkVPCSecurityGroups", classicLinkVPCSecurityGroups).append("ebsOptimized", ebsOptimized).append("iamInstanceProfile", iamInstanceProfile).append("imageId", imageId).append("instanceId", instanceId).append("instanceMonitoring", instanceMonitoring).append("instanceType", instanceType).append("kernelId", kernelId).append("keyName", keyName).append("launchConfigurationName", launchConfigurationName).append("placementTenancy", placementTenancy).append("ramDiskId", ramDiskId).append("securityGroups", securityGroups).append("spotPrice", spotPrice).append("userData", userData).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kernelId).append(ebsOptimized).append(imageId).append(spotPrice).append(userData).append(blockDeviceMappings).append(classicLinkVPCSecurityGroups).append(instanceType).append(keyName).append(classicLinkVPCId).append(placementTenancy).append(iamInstanceProfile).append(ramDiskId).append(launchConfigurationName).append(instanceId).append(associatePublicIpAddress).append(securityGroups).append(instanceMonitoring).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchConfiguration) == false) {
            return false;
        }
        LaunchConfiguration rhs = ((LaunchConfiguration) other);
        return new EqualsBuilder().append(kernelId, rhs.kernelId).append(ebsOptimized, rhs.ebsOptimized).append(imageId, rhs.imageId).append(spotPrice, rhs.spotPrice).append(userData, rhs.userData).append(blockDeviceMappings, rhs.blockDeviceMappings).append(classicLinkVPCSecurityGroups, rhs.classicLinkVPCSecurityGroups).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(classicLinkVPCId, rhs.classicLinkVPCId).append(placementTenancy, rhs.placementTenancy).append(iamInstanceProfile, rhs.iamInstanceProfile).append(ramDiskId, rhs.ramDiskId).append(launchConfigurationName, rhs.launchConfigurationName).append(instanceId, rhs.instanceId).append(associatePublicIpAddress, rhs.associatePublicIpAddress).append(securityGroups, rhs.securityGroups).append(instanceMonitoring, rhs.instanceMonitoring).isEquals();
    }

}
