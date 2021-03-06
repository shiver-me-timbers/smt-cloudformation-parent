
package shiver.me.timbers.aws.autoscaling;

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
 * LaunchConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
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
    private CharSequence associatePublicIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings")
    private Set<Property<LaunchConfigurationBlockDeviceMapping>> blockDeviceMappings = new LinkedHashSet<Property<LaunchConfigurationBlockDeviceMapping>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid
     * 
     */
    @JsonProperty("ClassicLinkVPCId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid")
    private CharSequence classicLinkVPCId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups
     * 
     */
    @JsonProperty("ClassicLinkVPCSecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups")
    private Set<CharSequence> classicLinkVPCSecurityGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized")
    private CharSequence ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile")
    private CharSequence iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid")
    private CharSequence imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid
     * 
     */
    @JsonProperty("InstanceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid")
    private CharSequence instanceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring
     * 
     */
    @JsonProperty("InstanceMonitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring")
    private CharSequence instanceMonitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid")
    private CharSequence kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname")
    private CharSequence keyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname
     * 
     */
    @JsonProperty("LaunchConfigurationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname")
    private CharSequence launchConfigurationName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy
     * 
     */
    @JsonProperty("PlacementTenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy")
    private CharSequence placementTenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid")
    private CharSequence ramDiskId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups")
    private Set<CharSequence> securityGroups = new LinkedHashSet<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice
     * 
     */
    @JsonProperty("SpotPrice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice")
    private CharSequence spotPrice;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata")
    private CharSequence userData;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip
     * 
     */
    @JsonIgnore
    public CharSequence getAssociatePublicIpAddress() {
        return associatePublicIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cf-as-launchconfig-associatepubip
     * 
     */
    @JsonIgnore
    public void setAssociatePublicIpAddress(CharSequence associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
    }

    public LaunchConfiguration withAssociatePublicIpAddress(CharSequence associatePublicIpAddress) {
        this.associatePublicIpAddress = associatePublicIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings
     * 
     */
    @JsonIgnore
    public Set<Property<LaunchConfigurationBlockDeviceMapping>> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-blockdevicemappings
     * 
     */
    @JsonIgnore
    public void setBlockDeviceMappings(Set<Property<LaunchConfigurationBlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public LaunchConfiguration withBlockDeviceMappings(Set<Property<LaunchConfigurationBlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid
     * 
     */
    @JsonIgnore
    public CharSequence getClassicLinkVPCId() {
        return classicLinkVPCId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcid
     * 
     */
    @JsonIgnore
    public void setClassicLinkVPCId(CharSequence classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
    }

    public LaunchConfiguration withClassicLinkVPCId(CharSequence classicLinkVPCId) {
        this.classicLinkVPCId = classicLinkVPCId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getClassicLinkVPCSecurityGroups() {
        return classicLinkVPCSecurityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-classiclinkvpcsecuritygroups
     * 
     */
    @JsonIgnore
    public void setClassicLinkVPCSecurityGroups(Set<CharSequence> classicLinkVPCSecurityGroups) {
        this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroups;
    }

    public LaunchConfiguration withClassicLinkVPCSecurityGroups(Set<CharSequence> classicLinkVPCSecurityGroups) {
        this.classicLinkVPCSecurityGroups = classicLinkVPCSecurityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized
     * 
     */
    @JsonIgnore
    public CharSequence getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public LaunchConfiguration withEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile
     * 
     */
    @JsonIgnore
    public CharSequence getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-iaminstanceprofile
     * 
     */
    @JsonIgnore
    public void setIamInstanceProfile(CharSequence iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public LaunchConfiguration withIamInstanceProfile(CharSequence iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid
     * 
     */
    @JsonIgnore
    public CharSequence getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-imageid
     * 
     */
    @JsonIgnore
    public void setImageId(CharSequence imageId) {
        this.imageId = imageId;
    }

    public LaunchConfiguration withImageId(CharSequence imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceId() {
        return instanceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instanceid
     * 
     */
    @JsonIgnore
    public void setInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
    }

    public LaunchConfiguration withInstanceId(CharSequence instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceMonitoring() {
        return instanceMonitoring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancemonitoring
     * 
     */
    @JsonIgnore
    public void setInstanceMonitoring(CharSequence instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
    }

    public LaunchConfiguration withInstanceMonitoring(CharSequence instanceMonitoring) {
        this.instanceMonitoring = instanceMonitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public LaunchConfiguration withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid
     * 
     */
    @JsonIgnore
    public CharSequence getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-kernelid
     * 
     */
    @JsonIgnore
    public void setKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
    }

    public LaunchConfiguration withKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname
     * 
     */
    @JsonIgnore
    public CharSequence getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-keyname
     * 
     */
    @JsonIgnore
    public void setKeyName(CharSequence keyName) {
        this.keyName = keyName;
    }

    public LaunchConfiguration withKeyName(CharSequence keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname
     * 
     */
    @JsonIgnore
    public CharSequence getLaunchConfigurationName() {
        return launchConfigurationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-autoscaling-launchconfig-launchconfigurationname
     * 
     */
    @JsonIgnore
    public void setLaunchConfigurationName(CharSequence launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
    }

    public LaunchConfiguration withLaunchConfigurationName(CharSequence launchConfigurationName) {
        this.launchConfigurationName = launchConfigurationName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy
     * 
     */
    @JsonIgnore
    public CharSequence getPlacementTenancy() {
        return placementTenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-placementtenancy
     * 
     */
    @JsonIgnore
    public void setPlacementTenancy(CharSequence placementTenancy) {
        this.placementTenancy = placementTenancy;
    }

    public LaunchConfiguration withPlacementTenancy(CharSequence placementTenancy) {
        this.placementTenancy = placementTenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid
     * 
     */
    @JsonIgnore
    public CharSequence getRamDiskId() {
        return ramDiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-ramdiskid
     * 
     */
    @JsonIgnore
    public void setRamDiskId(CharSequence ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    public LaunchConfiguration withRamDiskId(CharSequence ramDiskId) {
        this.ramDiskId = ramDiskId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups
     * 
     */
    @JsonIgnore
    public Set<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public LaunchConfiguration withSecurityGroups(Set<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice
     * 
     */
    @JsonIgnore
    public CharSequence getSpotPrice() {
        return spotPrice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-spotprice
     * 
     */
    @JsonIgnore
    public void setSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
    }

    public LaunchConfiguration withSpotPrice(CharSequence spotPrice) {
        this.spotPrice = spotPrice;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata
     * 
     */
    @JsonIgnore
    public CharSequence getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-as-launchconfig.html#cfn-as-launchconfig-userdata
     * 
     */
    @JsonIgnore
    public void setUserData(CharSequence userData) {
        this.userData = userData;
    }

    public LaunchConfiguration withUserData(CharSequence userData) {
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
