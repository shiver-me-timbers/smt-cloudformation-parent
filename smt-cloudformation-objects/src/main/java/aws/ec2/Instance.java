
package aws.ec2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Instance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AdditionalInfo",
    "Affinity",
    "AvailabilityZone",
    "BlockDeviceMappings",
    "CreditSpecification",
    "DisableApiTermination",
    "EbsOptimized",
    "ElasticGpuSpecifications",
    "HostId",
    "IamInstanceProfile",
    "ImageId",
    "InstanceInitiatedShutdownBehavior",
    "InstanceType",
    "Ipv6AddressCount",
    "Ipv6Addresses",
    "KernelId",
    "KeyName",
    "LaunchTemplate",
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
    private String additionalInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity
     * 
     */
    @JsonProperty("Affinity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity")
    private String affinity;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone")
    private String availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings")
    private List<BlockDeviceMapping> blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
    /**
     * CreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html
     * 
     */
    @JsonProperty("CreditSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html")
    private CreditSpecification creditSpecification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination")
    private Boolean disableApiTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized")
    private Boolean ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications")
    private Set<ElasticGpuSpecification> elasticGpuSpecifications = new LinkedHashSet<ElasticGpuSpecification>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid
     * 
     */
    @JsonProperty("HostId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid")
    private String hostId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile")
    private String iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid")
    private String imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior")
    private String instanceInitiatedShutdownBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype")
    private String instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount")
    private Integer ipv6AddressCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses")
    private List<InstanceIpv6Address> ipv6Addresses = new ArrayList<InstanceIpv6Address>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid")
    private String kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname")
    private String keyName;
    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html")
    private FleetLaunchTemplateSpecification launchTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring
     * 
     */
    @JsonProperty("Monitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring")
    private Boolean monitoring;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces")
    private List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname
     * 
     */
    @JsonProperty("PlacementGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname")
    private String placementGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress")
    private String privateIpAddress;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid")
    private String ramdiskId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids")
    private List<String> securityGroupIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups")
    private List<String> securityGroups = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck
     * 
     */
    @JsonProperty("SourceDestCheck")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck")
    private Boolean sourceDestCheck;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations
     * 
     */
    @JsonProperty("SsmAssociations")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations")
    private List<SsmAssociation> ssmAssociations = new ArrayList<SsmAssociation>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid")
    private String subnetId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags")
    private List<Tag> tags = new ArrayList<Tag>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy")
    private String tenancy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata")
    private String userData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes")
    private List<Volume> volumes = new ArrayList<Volume>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo
     * 
     */
    @JsonProperty("AdditionalInfo")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-additionalinfo
     * 
     */
    @JsonProperty("AdditionalInfo")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Instance withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity
     * 
     */
    @JsonProperty("Affinity")
    public String getAffinity() {
        return affinity;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-affinity
     * 
     */
    @JsonProperty("Affinity")
    public void setAffinity(String affinity) {
        this.affinity = affinity;
    }

    public Instance withAffinity(String affinity) {
        this.affinity = affinity;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public Instance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public void setBlockDeviceMappings(List<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public Instance withBlockDeviceMappings(List<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * CreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html
     * 
     */
    @JsonProperty("CreditSpecification")
    public CreditSpecification getCreditSpecification() {
        return creditSpecification;
    }

    /**
     * CreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-creditspecification.html
     * 
     */
    @JsonProperty("CreditSpecification")
    public void setCreditSpecification(CreditSpecification creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    public Instance withCreditSpecification(CreditSpecification creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    public Instance withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public Instance withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    public Set<ElasticGpuSpecification> getElasticGpuSpecifications() {
        return elasticGpuSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    public void setElasticGpuSpecifications(Set<ElasticGpuSpecification> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
    }

    public Instance withElasticGpuSpecifications(Set<ElasticGpuSpecification> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid
     * 
     */
    @JsonProperty("HostId")
    public String getHostId() {
        return hostId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-hostid
     * 
     */
    @JsonProperty("HostId")
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public Instance withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public String getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-iaminstanceprofile
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public void setIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public Instance withIamInstanceProfile(String iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid
     * 
     */
    @JsonProperty("ImageId")
    public String getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-imageid
     * 
     */
    @JsonProperty("ImageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public Instance withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    public Instance withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public Instance withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    public Integer getIpv6AddressCount() {
        return ipv6AddressCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresscount
     * 
     */
    @JsonProperty("Ipv6AddressCount")
    public void setIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
    }

    public Instance withIpv6AddressCount(Integer ipv6AddressCount) {
        this.ipv6AddressCount = ipv6AddressCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    public List<InstanceIpv6Address> getIpv6Addresses() {
        return ipv6Addresses;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ipv6addresses
     * 
     */
    @JsonProperty("Ipv6Addresses")
    public void setIpv6Addresses(List<InstanceIpv6Address> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
    }

    public Instance withIpv6Addresses(List<InstanceIpv6Address> ipv6Addresses) {
        this.ipv6Addresses = ipv6Addresses;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public String getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    public Instance withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname
     * 
     */
    @JsonProperty("KeyName")
    public String getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-keyname
     * 
     */
    @JsonProperty("KeyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public Instance withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    public FleetLaunchTemplateSpecification getLaunchTemplate() {
        return launchTemplate;
    }

    /**
     * FleetLaunchTemplateSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-fleetlaunchtemplatespecification.html
     * 
     */
    @JsonProperty("LaunchTemplate")
    public void setLaunchTemplate(FleetLaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
    }

    public Instance withLaunchTemplate(FleetLaunchTemplateSpecification launchTemplate) {
        this.launchTemplate = launchTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring
     * 
     */
    @JsonProperty("Monitoring")
    public Boolean getMonitoring() {
        return monitoring;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-monitoring
     * 
     */
    @JsonProperty("Monitoring")
    public void setMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
    }

    public Instance withMonitoring(Boolean monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    public List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public Instance withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname
     * 
     */
    @JsonProperty("PlacementGroupName")
    public String getPlacementGroupName() {
        return placementGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-placementgroupname
     * 
     */
    @JsonProperty("PlacementGroupName")
    public void setPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
    }

    public Instance withPlacementGroupName(String placementGroupName) {
        this.placementGroupName = placementGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-privateipaddress
     * 
     */
    @JsonProperty("PrivateIpAddress")
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }

    public Instance withPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    public String getRamdiskId() {
        return ramdiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ramdiskid
     * 
     */
    @JsonProperty("RamdiskId")
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    public Instance withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public Instance withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public Instance withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck
     * 
     */
    @JsonProperty("SourceDestCheck")
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-sourcedestcheck
     * 
     */
    @JsonProperty("SourceDestCheck")
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    public Instance withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations
     * 
     */
    @JsonProperty("SsmAssociations")
    public List<SsmAssociation> getSsmAssociations() {
        return ssmAssociations;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-ssmassociations
     * 
     */
    @JsonProperty("SsmAssociations")
    public void setSsmAssociations(List<SsmAssociation> ssmAssociations) {
        this.ssmAssociations = ssmAssociations;
    }

    public Instance withSsmAssociations(List<SsmAssociation> ssmAssociations) {
        this.ssmAssociations = ssmAssociations;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public String getSubnetId() {
        return subnetId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-subnetid
     * 
     */
    @JsonProperty("SubnetId")
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public Instance withSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags
     * 
     */
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tags
     * 
     */
    @JsonProperty("Tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public Instance withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    public String getTenancy() {
        return tenancy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-tenancy
     * 
     */
    @JsonProperty("Tenancy")
    public void setTenancy(String tenancy) {
        this.tenancy = tenancy;
    }

    public Instance withTenancy(String tenancy) {
        this.tenancy = tenancy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata
     * 
     */
    @JsonProperty("UserData")
    public String getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-userdata
     * 
     */
    @JsonProperty("UserData")
    public void setUserData(String userData) {
        this.userData = userData;
    }

    public Instance withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    public List<Volume> getVolumes() {
        return volumes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html#cfn-ec2-instance-volumes
     * 
     */
    @JsonProperty("Volumes")
    public void setVolumes(List<Volume> volumes) {
        this.volumes = volumes;
    }

    public Instance withVolumes(List<Volume> volumes) {
        this.volumes = volumes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("additionalInfo", additionalInfo).append("affinity", affinity).append("availabilityZone", availabilityZone).append("blockDeviceMappings", blockDeviceMappings).append("creditSpecification", creditSpecification).append("disableApiTermination", disableApiTermination).append("ebsOptimized", ebsOptimized).append("elasticGpuSpecifications", elasticGpuSpecifications).append("hostId", hostId).append("iamInstanceProfile", iamInstanceProfile).append("imageId", imageId).append("instanceInitiatedShutdownBehavior", instanceInitiatedShutdownBehavior).append("instanceType", instanceType).append("ipv6AddressCount", ipv6AddressCount).append("ipv6Addresses", ipv6Addresses).append("kernelId", kernelId).append("keyName", keyName).append("launchTemplate", launchTemplate).append("monitoring", monitoring).append("networkInterfaces", networkInterfaces).append("placementGroupName", placementGroupName).append("privateIpAddress", privateIpAddress).append("ramdiskId", ramdiskId).append("securityGroupIds", securityGroupIds).append("securityGroups", securityGroups).append("sourceDestCheck", sourceDestCheck).append("ssmAssociations", ssmAssociations).append("subnetId", subnetId).append("tags", tags).append("tenancy", tenancy).append("userData", userData).append("volumes", volumes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(subnetId).append(kernelId).append(ramdiskId).append(userData).append(ipv6Addresses).append(sourceDestCheck).append(availabilityZone).append(instanceInitiatedShutdownBehavior).append(placementGroupName).append(securityGroupIds).append(additionalInfo).append(elasticGpuSpecifications).append(ebsOptimized).append(imageId).append(blockDeviceMappings).append(ssmAssociations).append(instanceType).append(keyName).append(tenancy).append(volumes).append(hostId).append(creditSpecification).append(monitoring).append(iamInstanceProfile).append(privateIpAddress).append(tags).append(ipv6AddressCount).append(disableApiTermination).append(networkInterfaces).append(launchTemplate).append(securityGroups).append(affinity).toHashCode();
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
        return new EqualsBuilder().append(subnetId, rhs.subnetId).append(kernelId, rhs.kernelId).append(ramdiskId, rhs.ramdiskId).append(userData, rhs.userData).append(ipv6Addresses, rhs.ipv6Addresses).append(sourceDestCheck, rhs.sourceDestCheck).append(availabilityZone, rhs.availabilityZone).append(instanceInitiatedShutdownBehavior, rhs.instanceInitiatedShutdownBehavior).append(placementGroupName, rhs.placementGroupName).append(securityGroupIds, rhs.securityGroupIds).append(additionalInfo, rhs.additionalInfo).append(elasticGpuSpecifications, rhs.elasticGpuSpecifications).append(ebsOptimized, rhs.ebsOptimized).append(imageId, rhs.imageId).append(blockDeviceMappings, rhs.blockDeviceMappings).append(ssmAssociations, rhs.ssmAssociations).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(tenancy, rhs.tenancy).append(volumes, rhs.volumes).append(hostId, rhs.hostId).append(creditSpecification, rhs.creditSpecification).append(monitoring, rhs.monitoring).append(iamInstanceProfile, rhs.iamInstanceProfile).append(privateIpAddress, rhs.privateIpAddress).append(tags, rhs.tags).append(ipv6AddressCount, rhs.ipv6AddressCount).append(disableApiTermination, rhs.disableApiTermination).append(networkInterfaces, rhs.networkInterfaces).append(launchTemplate, rhs.launchTemplate).append(securityGroups, rhs.securityGroups).append(affinity, rhs.affinity).isEquals();
    }

}
