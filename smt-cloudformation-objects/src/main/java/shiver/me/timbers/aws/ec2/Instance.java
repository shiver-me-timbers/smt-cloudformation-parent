
package shiver.me.timbers.aws.ec2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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
import shiver.me.timbers.aws.Tag;


/**
 * Instance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AdditionalInfo",
    "Affinity",
    "AvailabilityZone",
    "BlockDeviceMappings",
    "CpuOptions",
    "CreditSpecification",
    "DisableApiTermination",
    "EbsOptimized",
    "ElasticGpuSpecifications",
    "ElasticInferenceAccelerators",
    "HibernationOptions",
    "HostId",
    "HostResourceGroupArn",
    "IamInstanceProfile",
    "ImageId",
    "InstanceInitiatedShutdownBehavior",
    "InstanceType",
    "Ipv6AddressCount",
    "Ipv6Addresses",
    "KernelId",
    "KeyName",
    "LaunchTemplate",
    "LicenseSpecifications",
    "Monitoring",
    "NetworkInterfaces",
    "PlacementGroupName",
    "PrivateIpAddress",
    "RamdiskId",
    "SecurityGroupIds",
    "SecurityGroups",
    "SourceDestCheck",
    "SsmAssociations",
    "SubnetId",
    "Tags",
    "Tenancy",
    "UserData",
    "Volumes"
})
public class Instance {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo
     * 
     */
    @JsonProperty("AdditionalInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo")
    private CharSequence additionalInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity
     * 
     */
    @JsonProperty("Affinity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity")
    private CharSequence affinity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings")
    private List<Property<InstanceBlockDeviceMapping>> blockDeviceMappings = new ArrayList<Property<InstanceBlockDeviceMapping>>();
    /**
     * InstanceCpuOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html
     * 
     */
    @JsonProperty("CpuOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html")
    private Property<InstanceCpuOptions> cpuOptions;
    /**
     * InstanceCreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
     * 
     */
    @JsonProperty("CreditSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html")
    private Property<InstanceCreditSpecification> creditSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination")
    private CharSequence disableApiTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized")
    private CharSequence ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications")
    private Set<Property<InstanceElasticGpuSpecification>> elasticGpuSpecifications = new LinkedHashSet<Property<InstanceElasticGpuSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators
     * 
     */
    @JsonProperty("ElasticInferenceAccelerators")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators")
    private Set<Property<InstanceElasticInferenceAccelerator>> elasticInferenceAccelerators = new LinkedHashSet<Property<InstanceElasticInferenceAccelerator>>();
    /**
     * InstanceHibernationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html
     * 
     */
    @JsonProperty("HibernationOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html")
    private Property<InstanceHibernationOptions> hibernationOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid
     * 
     */
    @JsonProperty("HostId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid")
    private CharSequence hostId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn
     * 
     */
    @JsonProperty("HostResourceGroupArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn")
    private CharSequence hostResourceGroupArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile")
    private CharSequence iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid")
    private CharSequence imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior")
    private CharSequence instanceInitiatedShutdownBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount")
    private Number ipv6AddressCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses")
    private List<Property<InstanceInstanceIpv6Address>> ipv6Addresses = new ArrayList<Property<InstanceInstanceIpv6Address>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid")
    private CharSequence kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname")
    private CharSequence keyName;
    /**
     * InstanceLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html")
    private Property<InstanceLaunchTemplateSpecification> launchTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-licensespecifications
     * 
     */
    @JsonProperty("LicenseSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-licensespecifications")
    private Set<Property<InstanceLicenseSpecification>> licenseSpecifications = new LinkedHashSet<Property<InstanceLicenseSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring
     * 
     */
    @JsonProperty("Monitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring")
    private CharSequence monitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces")
    private List<Property<InstanceNetworkInterface>> networkInterfaces = new ArrayList<Property<InstanceNetworkInterface>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname
     * 
     */
    @JsonProperty("PlacementGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname")
    private CharSequence placementGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress")
    private CharSequence privateIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid")
    private CharSequence ramdiskId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups")
    private List<CharSequence> securityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck
     * 
     */
    @JsonProperty("SourceDestCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck")
    private CharSequence sourceDestCheck;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations
     * 
     */
    @JsonProperty("SsmAssociations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations")
    private List<Property<InstanceSsmAssociation>> ssmAssociations = new ArrayList<Property<InstanceSsmAssociation>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid")
    private CharSequence subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy")
    private CharSequence tenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata")
    private CharSequence userData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes")
    private List<Property<InstanceVolume>> volumes = new ArrayList<Property<InstanceVolume>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo
     * 
     */
    @JsonIgnore
    public CharSequence getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo
     * 
     */
    @JsonIgnore
    public void setAdditionalInfo(CharSequence additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Instance withAdditionalInfo(CharSequence additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity
     * 
     */
    @JsonIgnore
    public CharSequence getAffinity() {
        return affinity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity
     * 
     */
    @JsonIgnore
    public void setAffinity(CharSequence affinity) {
        this.affinity = affinity;
    }

    public Instance withAffinity(CharSequence affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone
     * 
     */
    @JsonIgnore
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone
     * 
     */
    @JsonIgnore
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Instance withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings
     * 
     */
    @JsonIgnore
    public List<Property<InstanceBlockDeviceMapping>> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings
     * 
     */
    @JsonIgnore
    public void setBlockDeviceMappings(List<Property<InstanceBlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public Instance withBlockDeviceMappings(List<Property<InstanceBlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * InstanceCpuOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html
     * 
     */
    @JsonIgnore
    public Property<InstanceCpuOptions> getCpuOptions() {
        return cpuOptions;
    }

    /**
     * InstanceCpuOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-cpuoptions.html
     * 
     */
    @JsonIgnore
    public void setCpuOptions(Property<InstanceCpuOptions> cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    public Instance withCpuOptions(Property<InstanceCpuOptions> cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    /**
     * InstanceCreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
     * 
     */
    @JsonIgnore
    public Property<InstanceCreditSpecification> getCreditSpecification() {
        return creditSpecification;
    }

    /**
     * InstanceCreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
     * 
     */
    @JsonIgnore
    public void setCreditSpecification(Property<InstanceCreditSpecification> creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    public Instance withCreditSpecification(Property<InstanceCreditSpecification> creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination
     * 
     */
    @JsonIgnore
    public CharSequence getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination
     * 
     */
    @JsonIgnore
    public void setDisableApiTermination(CharSequence disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    public Instance withDisableApiTermination(CharSequence disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized
     * 
     */
    @JsonIgnore
    public CharSequence getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public Instance withEbsOptimized(CharSequence ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceElasticGpuSpecification>> getElasticGpuSpecifications() {
        return elasticGpuSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications
     * 
     */
    @JsonIgnore
    public void setElasticGpuSpecifications(Set<Property<InstanceElasticGpuSpecification>> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
    }

    public Instance withElasticGpuSpecifications(Set<Property<InstanceElasticGpuSpecification>> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceElasticInferenceAccelerator>> getElasticInferenceAccelerators() {
        return elasticInferenceAccelerators;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticinferenceaccelerators
     * 
     */
    @JsonIgnore
    public void setElasticInferenceAccelerators(Set<Property<InstanceElasticInferenceAccelerator>> elasticInferenceAccelerators) {
        this.elasticInferenceAccelerators = elasticInferenceAccelerators;
    }

    public Instance withElasticInferenceAccelerators(Set<Property<InstanceElasticInferenceAccelerator>> elasticInferenceAccelerators) {
        this.elasticInferenceAccelerators = elasticInferenceAccelerators;
        return this;
    }

    /**
     * InstanceHibernationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html
     * 
     */
    @JsonIgnore
    public Property<InstanceHibernationOptions> getHibernationOptions() {
        return hibernationOptions;
    }

    /**
     * InstanceHibernationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-hibernationoptions.html
     * 
     */
    @JsonIgnore
    public void setHibernationOptions(Property<InstanceHibernationOptions> hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    public Instance withHibernationOptions(Property<InstanceHibernationOptions> hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid
     * 
     */
    @JsonIgnore
    public CharSequence getHostId() {
        return hostId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid
     * 
     */
    @JsonIgnore
    public void setHostId(CharSequence hostId) {
        this.hostId = hostId;
    }

    public Instance withHostId(CharSequence hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn
     * 
     */
    @JsonIgnore
    public CharSequence getHostResourceGroupArn() {
        return hostResourceGroupArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostresourcegrouparn
     * 
     */
    @JsonIgnore
    public void setHostResourceGroupArn(CharSequence hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
    }

    public Instance withHostResourceGroupArn(CharSequence hostResourceGroupArn) {
        this.hostResourceGroupArn = hostResourceGroupArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile
     * 
     */
    @JsonIgnore
    public CharSequence getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile
     * 
     */
    @JsonIgnore
    public void setIamInstanceProfile(CharSequence iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public Instance withIamInstanceProfile(CharSequence iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid
     * 
     */
    @JsonIgnore
    public CharSequence getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid
     * 
     */
    @JsonIgnore
    public void setImageId(CharSequence imageId) {
        this.imageId = imageId;
    }

    public Instance withImageId(CharSequence imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonIgnore
    public void setInstanceInitiatedShutdownBehavior(CharSequence instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    public Instance withInstanceInitiatedShutdownBehavior(CharSequence instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public Instance withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount
     * 
     */
    @JsonIgnore
    public Number getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount
     * 
     */
    @JsonIgnore
    public void setIpv6AddressCount(Number ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    public Instance withIpv6AddressCount(Number ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses
     * 
     */
    @JsonIgnore
    public List<Property<InstanceInstanceIpv6Address>> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses
     * 
     */
    @JsonIgnore
    public void setIpv6Addresses(List<Property<InstanceInstanceIpv6Address>> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public Instance withIpv6Addresses(List<Property<InstanceInstanceIpv6Address>> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid
     * 
     */
    @JsonIgnore
    public CharSequence getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid
     * 
     */
    @JsonIgnore
    public void setKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
    }

    public Instance withKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname
     * 
     */
    @JsonIgnore
    public CharSequence getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname
     * 
     */
    @JsonIgnore
    public void setKeyName(CharSequence keyName) {
        this.keyName = keyName;
    }

    public Instance withKeyName(CharSequence keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * InstanceLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public Property<InstanceLaunchTemplateSpecification> getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * InstanceLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-launchtemplatespecification.html
     * 
     */
    @JsonIgnore
    public void setLaunchTemplate(Property<InstanceLaunchTemplateSpecification> launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public Instance withLaunchTemplate(Property<InstanceLaunchTemplateSpecification> launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-licensespecifications
     * 
     */
    @JsonIgnore
    public Set<Property<InstanceLicenseSpecification>> getLicenseSpecifications() {
        return licenseSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-licensespecifications
     * 
     */
    @JsonIgnore
    public void setLicenseSpecifications(Set<Property<InstanceLicenseSpecification>> licenseSpecifications) {
        this.licenseSpecifications = licenseSpecifications;
    }

    public Instance withLicenseSpecifications(Set<Property<InstanceLicenseSpecification>> licenseSpecifications) {
        this.licenseSpecifications = licenseSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring
     * 
     */
    @JsonIgnore
    public CharSequence getMonitoring() {
        return monitoring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring
     * 
     */
    @JsonIgnore
    public void setMonitoring(CharSequence monitoring) {
        this.monitoring = monitoring;
    }

    public Instance withMonitoring(CharSequence monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces
     * 
     */
    @JsonIgnore
    public List<Property<InstanceNetworkInterface>> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces
     * 
     */
    @JsonIgnore
    public void setNetworkInterfaces(List<Property<InstanceNetworkInterface>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public Instance withNetworkInterfaces(List<Property<InstanceNetworkInterface>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname
     * 
     */
    @JsonIgnore
    public CharSequence getPlacementGroupName() {
        return placementGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname
     * 
     */
    @JsonIgnore
    public void setPlacementGroupName(CharSequence placementGroupName) {
        this.placementGroupName = placementGroupName;
    }

    public Instance withPlacementGroupName(CharSequence placementGroupName) {
        this.placementGroupName = placementGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress
     * 
     */
    @JsonIgnore
    public CharSequence getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress
     * 
     */
    @JsonIgnore
    public void setPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public Instance withPrivateIpAddress(CharSequence privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid
     * 
     */
    @JsonIgnore
    public CharSequence getRamdiskId() {
        return ramdiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid
     * 
     */
    @JsonIgnore
    public void setRamdiskId(CharSequence ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    public Instance withRamdiskId(CharSequence ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids
     * 
     */
    @JsonIgnore
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public Instance withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Instance withSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck
     * 
     */
    @JsonIgnore
    public CharSequence getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck
     * 
     */
    @JsonIgnore
    public void setSourceDestCheck(CharSequence sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    public Instance withSourceDestCheck(CharSequence sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations
     * 
     */
    @JsonIgnore
    public List<Property<InstanceSsmAssociation>> getSsmAssociations() {
        return ssmAssociations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations
     * 
     */
    @JsonIgnore
    public void setSsmAssociations(List<Property<InstanceSsmAssociation>> ssmAssociations) {
        this.ssmAssociations = ssmAssociations;
    }

    public Instance withSsmAssociations(List<Property<InstanceSsmAssociation>> ssmAssociations) {
        this.ssmAssociations = ssmAssociations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid
     * 
     */
    @JsonIgnore
    public CharSequence getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid
     * 
     */
    @JsonIgnore
    public void setSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
    }

    public Instance withSubnetId(CharSequence subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Instance withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy
     * 
     */
    @JsonIgnore
    public CharSequence getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy
     * 
     */
    @JsonIgnore
    public void setTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
    }

    public Instance withTenancy(CharSequence tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata
     * 
     */
    @JsonIgnore
    public CharSequence getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata
     * 
     */
    @JsonIgnore
    public void setUserData(CharSequence userData) {
        this.userData = userData;
    }

    public Instance withUserData(CharSequence userData) {
        this.userData = userData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes
     * 
     */
    @JsonIgnore
    public List<Property<InstanceVolume>> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes
     * 
     */
    @JsonIgnore
    public void setVolumes(List<Property<InstanceVolume>> volumes) {
        this.volumes = volumes;
    }

    public Instance withVolumes(List<Property<InstanceVolume>> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalInfo", additionalInfo).append("affinity", affinity).append("availabilityZone", availabilityZone).append("blockDeviceMappings", blockDeviceMappings).append("cpuOptions", cpuOptions).append("creditSpecification", creditSpecification).append("disableApiTermination", disableApiTermination).append("ebsOptimized", ebsOptimized).append("elasticGpuSpecifications", elasticGpuSpecifications).append("elasticInferenceAccelerators", elasticInferenceAccelerators).append("hibernationOptions", hibernationOptions).append("hostId", hostId).append("hostResourceGroupArn", hostResourceGroupArn).append("iamInstanceProfile", iamInstanceProfile).append("imageId", imageId).append("instanceInitiatedShutdownBehavior", instanceInitiatedShutdownBehavior).append("instanceType", instanceType).append("ipv6AddressCount", ipv6AddressCount).append("ipv6Addresses", ipv6Addresses).append("kernelId", kernelId).append("keyName", keyName).append("launchTemplate", launchTemplate).append("licenseSpecifications", licenseSpecifications).append("monitoring", monitoring).append("networkInterfaces", networkInterfaces).append("placementGroupName", placementGroupName).append("privateIpAddress", privateIpAddress).append("ramdiskId", ramdiskId).append("securityGroupIds", securityGroupIds).append("securityGroups", securityGroups).append("sourceDestCheck", sourceDestCheck).append("ssmAssociations", ssmAssociations).append("subnetId", subnetId).append("tags", tags).append("tenancy", tenancy).append("userData", userData).append("volumes", volumes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(kernelId).append(ramdiskId).append(userData).append(hostResourceGroupArn).append(ipv6Addresses).append(sourceDestCheck).append(availabilityZone).append(hibernationOptions).append(instanceInitiatedShutdownBehavior).append(elasticInferenceAccelerators).append(placementGroupName).append(securityGroupIds).append(additionalInfo).append(elasticGpuSpecifications).append(ebsOptimized).append(imageId).append(blockDeviceMappings).append(licenseSpecifications).append(ssmAssociations).append(instanceType).append(keyName).append(tenancy).append(volumes).append(cpuOptions).append(hostId).append(creditSpecification).append(monitoring).append(iamInstanceProfile).append(privateIpAddress).append(tags).append(ipv6AddressCount).append(disableApiTermination).append(networkInterfaces).append(launchTemplate).append(securityGroups).append(affinity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Instance) == false) {
            return false;
        }
        Instance rhs = ((Instance) other);
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(kernelId, rhs.kernelId).append(ramdiskId, rhs.ramdiskId).append(userData, rhs.userData).append(hostResourceGroupArn, rhs.hostResourceGroupArn).append(ipv6Addresses, rhs.ipv6Addresses).append(sourceDestCheck, rhs.sourceDestCheck).append(availabilityZone, rhs.availabilityZone).append(hibernationOptions, rhs.hibernationOptions).append(instanceInitiatedShutdownBehavior, rhs.instanceInitiatedShutdownBehavior).append(elasticInferenceAccelerators, rhs.elasticInferenceAccelerators).append(placementGroupName, rhs.placementGroupName).append(securityGroupIds, rhs.securityGroupIds).append(additionalInfo, rhs.additionalInfo).append(elasticGpuSpecifications, rhs.elasticGpuSpecifications).append(ebsOptimized, rhs.ebsOptimized).append(imageId, rhs.imageId).append(blockDeviceMappings, rhs.blockDeviceMappings).append(licenseSpecifications, rhs.licenseSpecifications).append(ssmAssociations, rhs.ssmAssociations).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(tenancy, rhs.tenancy).append(volumes, rhs.volumes).append(cpuOptions, rhs.cpuOptions).append(hostId, rhs.hostId).append(creditSpecification, rhs.creditSpecification).append(monitoring, rhs.monitoring).append(iamInstanceProfile, rhs.iamInstanceProfile).append(privateIpAddress, rhs.privateIpAddress).append(tags, rhs.tags).append(ipv6AddressCount, rhs.ipv6AddressCount).append(disableApiTermination, rhs.disableApiTermination).append(networkInterfaces, rhs.networkInterfaces).append(launchTemplate, rhs.launchTemplate).append(securityGroups, rhs.securityGroups).append(affinity, rhs.affinity).isEquals();
    }

}
