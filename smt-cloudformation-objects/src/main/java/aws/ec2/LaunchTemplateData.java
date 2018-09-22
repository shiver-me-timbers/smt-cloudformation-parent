
package aws.ec2;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LaunchTemplateData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SecurityGroups",
    "TagSpecifications",
    "UserData",
    "InstanceInitiatedShutdownBehavior",
    "BlockDeviceMappings",
    "IamInstanceProfile",
    "KernelId",
    "SecurityGroupIds",
    "EbsOptimized",
    "KeyName",
    "DisableApiTermination",
    "ElasticGpuSpecifications",
    "Placement",
    "InstanceMarketOptions",
    "NetworkInterfaces",
    "ImageId",
    "InstanceType",
    "RamDiskId",
    "Monitoring",
    "CreditSpecification"
})
public class LaunchTemplateData {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups")
    private List<String> securityGroups = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications")
    private List<SpotFleetTagSpecification> tagSpecifications = new ArrayList<SpotFleetTagSpecification>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata")
    private String userData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior")
    private String instanceInitiatedShutdownBehavior;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings")
    private List<BlockDeviceMapping> blockDeviceMappings = new ArrayList<BlockDeviceMapping>();
    /**
     * IamInstanceProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html")
    private IamInstanceProfile iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid")
    private String kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids")
    private List<String> securityGroupIds = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized")
    private Boolean ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname")
    private String keyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination")
    private Boolean disableApiTermination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications")
    private List<ElasticGpuSpecification> elasticGpuSpecifications = new ArrayList<ElasticGpuSpecification>();
    /**
     * Placement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html")
    private Placement placement;
    /**
     * InstanceMarketOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
     * 
     */
    @JsonProperty("InstanceMarketOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html")
    private InstanceMarketOptions instanceMarketOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces")
    private List<NetworkInterface> networkInterfaces = new ArrayList<NetworkInterface>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid")
    private String imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype")
    private String instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid")
    private String ramDiskId;
    /**
     * Monitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html")
    private Monitoring monitoring;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    public void setSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public LaunchTemplateData withSecurityGroups(List<String> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    public List<SpotFleetTagSpecification> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    public void setTagSpecifications(List<SpotFleetTagSpecification> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public LaunchTemplateData withTagSpecifications(List<SpotFleetTagSpecification> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata
     * 
     */
    @JsonProperty("UserData")
    public String getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata
     * 
     */
    @JsonProperty("UserData")
    public void setUserData(String userData) {
        this.userData = userData;
    }

    public LaunchTemplateData withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    public LaunchTemplateData withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public List<BlockDeviceMapping> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    public void setBlockDeviceMappings(List<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public LaunchTemplateData withBlockDeviceMappings(List<BlockDeviceMapping> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * IamInstanceProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public IamInstanceProfile getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * IamInstanceProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    public void setIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public LaunchTemplateData withIamInstanceProfile(IamInstanceProfile iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public String getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid
     * 
     */
    @JsonProperty("KernelId")
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    public LaunchTemplateData withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public LaunchTemplateData withSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public LaunchTemplateData withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname
     * 
     */
    @JsonProperty("KeyName")
    public String getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname
     * 
     */
    @JsonProperty("KeyName")
    public void setKeyName(String keyName) {
        this.keyName = keyName;
    }

    public LaunchTemplateData withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    public LaunchTemplateData withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    public List<ElasticGpuSpecification> getElasticGpuSpecifications() {
        return elasticGpuSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    public void setElasticGpuSpecifications(List<ElasticGpuSpecification> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
    }

    public LaunchTemplateData withElasticGpuSpecifications(List<ElasticGpuSpecification> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
        return this;
    }

    /**
     * Placement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html
     * 
     */
    @JsonProperty("Placement")
    public Placement getPlacement() {
        return placement;
    }

    /**
     * Placement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-placement.html
     * 
     */
    @JsonProperty("Placement")
    public void setPlacement(Placement placement) {
        this.placement = placement;
    }

    public LaunchTemplateData withPlacement(Placement placement) {
        this.placement = placement;
        return this;
    }

    /**
     * InstanceMarketOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
     * 
     */
    @JsonProperty("InstanceMarketOptions")
    public InstanceMarketOptions getInstanceMarketOptions() {
        return instanceMarketOptions;
    }

    /**
     * InstanceMarketOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
     * 
     */
    @JsonProperty("InstanceMarketOptions")
    public void setInstanceMarketOptions(InstanceMarketOptions instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    public LaunchTemplateData withInstanceMarketOptions(InstanceMarketOptions instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    public List<NetworkInterface> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    public void setNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public LaunchTemplateData withNetworkInterfaces(List<NetworkInterface> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid
     * 
     */
    @JsonProperty("ImageId")
    public String getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid
     * 
     */
    @JsonProperty("ImageId")
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public LaunchTemplateData withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public String getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public LaunchTemplateData withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    public String getRamDiskId() {
        return ramDiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    public void setRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    public LaunchTemplateData withRamDiskId(String ramDiskId) {
        this.ramDiskId = ramDiskId;
        return this;
    }

    /**
     * Monitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    public Monitoring getMonitoring() {
        return monitoring;
    }

    /**
     * Monitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    public void setMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
    }

    public LaunchTemplateData withMonitoring(Monitoring monitoring) {
        this.monitoring = monitoring;
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

    public LaunchTemplateData withCreditSpecification(CreditSpecification creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroups", securityGroups).append("tagSpecifications", tagSpecifications).append("userData", userData).append("instanceInitiatedShutdownBehavior", instanceInitiatedShutdownBehavior).append("blockDeviceMappings", blockDeviceMappings).append("iamInstanceProfile", iamInstanceProfile).append("kernelId", kernelId).append("securityGroupIds", securityGroupIds).append("ebsOptimized", ebsOptimized).append("keyName", keyName).append("disableApiTermination", disableApiTermination).append("elasticGpuSpecifications", elasticGpuSpecifications).append("placement", placement).append("instanceMarketOptions", instanceMarketOptions).append("networkInterfaces", networkInterfaces).append("imageId", imageId).append("instanceType", instanceType).append("ramDiskId", ramDiskId).append("monitoring", monitoring).append("creditSpecification", creditSpecification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tagSpecifications).append(elasticGpuSpecifications).append(kernelId).append(ebsOptimized).append(userData).append(imageId).append(blockDeviceMappings).append(instanceType).append(keyName).append(creditSpecification).append(monitoring).append(iamInstanceProfile).append(ramDiskId).append(instanceInitiatedShutdownBehavior).append(disableApiTermination).append(networkInterfaces).append(securityGroupIds).append(instanceMarketOptions).append(securityGroups).append(placement).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LaunchTemplateData) == false) {
            return false;
        }
        LaunchTemplateData rhs = ((LaunchTemplateData) other);
        return new EqualsBuilder().append(tagSpecifications, rhs.tagSpecifications).append(elasticGpuSpecifications, rhs.elasticGpuSpecifications).append(kernelId, rhs.kernelId).append(ebsOptimized, rhs.ebsOptimized).append(userData, rhs.userData).append(imageId, rhs.imageId).append(blockDeviceMappings, rhs.blockDeviceMappings).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(creditSpecification, rhs.creditSpecification).append(monitoring, rhs.monitoring).append(iamInstanceProfile, rhs.iamInstanceProfile).append(ramDiskId, rhs.ramDiskId).append(instanceInitiatedShutdownBehavior, rhs.instanceInitiatedShutdownBehavior).append(disableApiTermination, rhs.disableApiTermination).append(networkInterfaces, rhs.networkInterfaces).append(securityGroupIds, rhs.securityGroupIds).append(instanceMarketOptions, rhs.instanceMarketOptions).append(securityGroups, rhs.securityGroups).append(placement, rhs.placement).isEquals();
    }

}
