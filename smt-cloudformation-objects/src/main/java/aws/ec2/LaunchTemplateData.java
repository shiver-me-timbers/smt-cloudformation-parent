
package aws.ec2;

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
 * LaunchTemplateData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SecurityGroups",
    "TagSpecifications",
    "UserData",
    "BlockDeviceMappings",
    "IamInstanceProfile",
    "KernelId",
    "EbsOptimized",
    "ElasticGpuSpecifications",
    "ElasticInferenceAccelerators",
    "Placement",
    "NetworkInterfaces",
    "ImageId",
    "InstanceType",
    "Monitoring",
    "HibernationOptions",
    "LicenseSpecifications",
    "InstanceInitiatedShutdownBehavior",
    "CpuOptions",
    "SecurityGroupIds",
    "KeyName",
    "DisableApiTermination",
    "InstanceMarketOptions",
    "RamDiskId",
    "CapacityReservationSpecification",
    "CreditSpecification"
})
public class LaunchTemplateData implements Property<LaunchTemplateData>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups
     * 
     */
    @JsonProperty("SecurityGroups")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups")
    private List<CharSequence> securityGroups = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications
     * 
     */
    @JsonProperty("TagSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications")
    private List<Property<TagSpecification>> tagSpecifications = new ArrayList<Property<TagSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata
     * 
     */
    @JsonProperty("UserData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata")
    private CharSequence userData;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings
     * 
     */
    @JsonProperty("BlockDeviceMappings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings")
    private List<Property<BlockDeviceMapping>> blockDeviceMappings = new ArrayList<Property<BlockDeviceMapping>>();
    /**
     * IamInstanceProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
     * 
     */
    @JsonProperty("IamInstanceProfile")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html")
    private Property<IamInstanceProfile> iamInstanceProfile;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid
     * 
     */
    @JsonProperty("KernelId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid")
    private CharSequence kernelId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized
     * 
     */
    @JsonProperty("EbsOptimized")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized")
    private Boolean ebsOptimized;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications
     * 
     */
    @JsonProperty("ElasticGpuSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications")
    private List<Property<ElasticGpuSpecification>> elasticGpuSpecifications = new ArrayList<Property<ElasticGpuSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticinferenceaccelerators
     * 
     */
    @JsonProperty("ElasticInferenceAccelerators")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticinferenceaccelerators")
    private List<Property<LaunchTemplateElasticInferenceAccelerator>> elasticInferenceAccelerators = new ArrayList<Property<LaunchTemplateElasticInferenceAccelerator>>();
    /**
     * SpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonProperty("Placement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html")
    private Property<Placement> placement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces
     * 
     */
    @JsonProperty("NetworkInterfaces")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces")
    private List<Property<NetworkInterface>> networkInterfaces = new ArrayList<Property<NetworkInterface>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid
     * 
     */
    @JsonProperty("ImageId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid")
    private CharSequence imageId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype")
    private CharSequence instanceType;
    /**
     * SpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonProperty("Monitoring")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html")
    private Property<Monitoring> monitoring;
    /**
     * HibernationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-hibernationoptions.html
     * 
     */
    @JsonProperty("HibernationOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-hibernationoptions.html")
    private Property<HibernationOptions> hibernationOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-licensespecifications
     * 
     */
    @JsonProperty("LicenseSpecifications")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-licensespecifications")
    private List<Property<LicenseSpecification>> licenseSpecifications = new ArrayList<Property<LicenseSpecification>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonProperty("InstanceInitiatedShutdownBehavior")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior")
    private CharSequence instanceInitiatedShutdownBehavior;
    /**
     * CpuOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html
     * 
     */
    @JsonProperty("CpuOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html")
    private Property<CpuOptions> cpuOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids")
    private List<CharSequence> securityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname
     * 
     */
    @JsonProperty("KeyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname")
    private CharSequence keyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination
     * 
     */
    @JsonProperty("DisableApiTermination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination")
    private Boolean disableApiTermination;
    /**
     * InstanceMarketOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
     * 
     */
    @JsonProperty("InstanceMarketOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html")
    private Property<InstanceMarketOptions> instanceMarketOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid
     * 
     */
    @JsonProperty("RamDiskId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid")
    private CharSequence ramDiskId;
    /**
     * CapacityReservationSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html
     * 
     */
    @JsonProperty("CapacityReservationSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html")
    private Property<CapacityReservationSpecification> capacityReservationSpecification;
    /**
     * CreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
     * 
     */
    @JsonProperty("CreditSpecification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html")
    private Property<CreditSpecification> creditSpecification;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroups
     * 
     */
    @JsonIgnore
    public void setSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
    }

    public LaunchTemplateData withSecurityGroups(List<CharSequence> securityGroups) {
        this.securityGroups = securityGroups;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications
     * 
     */
    @JsonIgnore
    public List<Property<TagSpecification>> getTagSpecifications() {
        return tagSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-tagspecifications
     * 
     */
    @JsonIgnore
    public void setTagSpecifications(List<Property<TagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
    }

    public LaunchTemplateData withTagSpecifications(List<Property<TagSpecification>> tagSpecifications) {
        this.tagSpecifications = tagSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata
     * 
     */
    @JsonIgnore
    public CharSequence getUserData() {
        return userData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-userdata
     * 
     */
    @JsonIgnore
    public void setUserData(CharSequence userData) {
        this.userData = userData;
    }

    public LaunchTemplateData withUserData(CharSequence userData) {
        this.userData = userData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings
     * 
     */
    @JsonIgnore
    public List<Property<BlockDeviceMapping>> getBlockDeviceMappings() {
        return blockDeviceMappings;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-blockdevicemappings
     * 
     */
    @JsonIgnore
    public void setBlockDeviceMappings(List<Property<BlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
    }

    public LaunchTemplateData withBlockDeviceMappings(List<Property<BlockDeviceMapping>> blockDeviceMappings) {
        this.blockDeviceMappings = blockDeviceMappings;
        return this;
    }

    /**
     * IamInstanceProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
     * 
     */
    @JsonIgnore
    public Property<IamInstanceProfile> getIamInstanceProfile() {
        return iamInstanceProfile;
    }

    /**
     * IamInstanceProfile
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-iaminstanceprofile.html
     * 
     */
    @JsonIgnore
    public void setIamInstanceProfile(Property<IamInstanceProfile> iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
    }

    public LaunchTemplateData withIamInstanceProfile(Property<IamInstanceProfile> iamInstanceProfile) {
        this.iamInstanceProfile = iamInstanceProfile;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid
     * 
     */
    @JsonIgnore
    public CharSequence getKernelId() {
        return kernelId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-kernelid
     * 
     */
    @JsonIgnore
    public void setKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
    }

    public LaunchTemplateData withKernelId(CharSequence kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized
     * 
     */
    @JsonIgnore
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ebsoptimized
     * 
     */
    @JsonIgnore
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    public LaunchTemplateData withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications
     * 
     */
    @JsonIgnore
    public List<Property<ElasticGpuSpecification>> getElasticGpuSpecifications() {
        return elasticGpuSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticgpuspecifications
     * 
     */
    @JsonIgnore
    public void setElasticGpuSpecifications(List<Property<ElasticGpuSpecification>> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
    }

    public LaunchTemplateData withElasticGpuSpecifications(List<Property<ElasticGpuSpecification>> elasticGpuSpecifications) {
        this.elasticGpuSpecifications = elasticGpuSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticinferenceaccelerators
     * 
     */
    @JsonIgnore
    public List<Property<LaunchTemplateElasticInferenceAccelerator>> getElasticInferenceAccelerators() {
        return elasticInferenceAccelerators;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-elasticinferenceaccelerators
     * 
     */
    @JsonIgnore
    public void setElasticInferenceAccelerators(List<Property<LaunchTemplateElasticInferenceAccelerator>> elasticInferenceAccelerators) {
        this.elasticInferenceAccelerators = elasticInferenceAccelerators;
    }

    public LaunchTemplateData withElasticInferenceAccelerators(List<Property<LaunchTemplateElasticInferenceAccelerator>> elasticInferenceAccelerators) {
        this.elasticInferenceAccelerators = elasticInferenceAccelerators;
        return this;
    }

    /**
     * SpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonIgnore
    public Property<Placement> getPlacement() {
        return placement;
    }

    /**
     * SpotPlacement
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-placement.html
     * 
     */
    @JsonIgnore
    public void setPlacement(Property<Placement> placement) {
        this.placement = placement;
    }

    public LaunchTemplateData withPlacement(Property<Placement> placement) {
        this.placement = placement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces
     * 
     */
    @JsonIgnore
    public List<Property<NetworkInterface>> getNetworkInterfaces() {
        return networkInterfaces;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-networkinterfaces
     * 
     */
    @JsonIgnore
    public void setNetworkInterfaces(List<Property<NetworkInterface>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
    }

    public LaunchTemplateData withNetworkInterfaces(List<Property<NetworkInterface>> networkInterfaces) {
        this.networkInterfaces = networkInterfaces;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid
     * 
     */
    @JsonIgnore
    public CharSequence getImageId() {
        return imageId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-imageid
     * 
     */
    @JsonIgnore
    public void setImageId(CharSequence imageId) {
        this.imageId = imageId;
    }

    public LaunchTemplateData withImageId(CharSequence imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public LaunchTemplateData withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * SpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonIgnore
    public Property<Monitoring> getMonitoring() {
        return monitoring;
    }

    /**
     * SpotFleetMonitoring
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-spotfleet-spotfleetrequestconfigdata-launchspecifications-monitoring.html
     * 
     */
    @JsonIgnore
    public void setMonitoring(Property<Monitoring> monitoring) {
        this.monitoring = monitoring;
    }

    public LaunchTemplateData withMonitoring(Property<Monitoring> monitoring) {
        this.monitoring = monitoring;
        return this;
    }

    /**
     * HibernationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-hibernationoptions.html
     * 
     */
    @JsonIgnore
    public Property<HibernationOptions> getHibernationOptions() {
        return hibernationOptions;
    }

    /**
     * HibernationOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-hibernationoptions.html
     * 
     */
    @JsonIgnore
    public void setHibernationOptions(Property<HibernationOptions> hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
    }

    public LaunchTemplateData withHibernationOptions(Property<HibernationOptions> hibernationOptions) {
        this.hibernationOptions = hibernationOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-licensespecifications
     * 
     */
    @JsonIgnore
    public List<Property<LicenseSpecification>> getLicenseSpecifications() {
        return licenseSpecifications;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-licensespecifications
     * 
     */
    @JsonIgnore
    public void setLicenseSpecifications(List<Property<LicenseSpecification>> licenseSpecifications) {
        this.licenseSpecifications = licenseSpecifications;
    }

    public LaunchTemplateData withLicenseSpecifications(List<Property<LicenseSpecification>> licenseSpecifications) {
        this.licenseSpecifications = licenseSpecifications;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-instanceinitiatedshutdownbehavior
     * 
     */
    @JsonIgnore
    public void setInstanceInitiatedShutdownBehavior(CharSequence instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }

    public LaunchTemplateData withInstanceInitiatedShutdownBehavior(CharSequence instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * CpuOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html
     * 
     */
    @JsonIgnore
    public Property<CpuOptions> getCpuOptions() {
        return cpuOptions;
    }

    /**
     * CpuOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-cpuoptions.html
     * 
     */
    @JsonIgnore
    public void setCpuOptions(Property<CpuOptions> cpuOptions) {
        this.cpuOptions = cpuOptions;
    }

    public LaunchTemplateData withCpuOptions(Property<CpuOptions> cpuOptions) {
        this.cpuOptions = cpuOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-securitygroupids
     * 
     */
    @JsonIgnore
    public void setSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public LaunchTemplateData withSecurityGroupIds(List<CharSequence> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname
     * 
     */
    @JsonIgnore
    public CharSequence getKeyName() {
        return keyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-keyname
     * 
     */
    @JsonIgnore
    public void setKeyName(CharSequence keyName) {
        this.keyName = keyName;
    }

    public LaunchTemplateData withKeyName(CharSequence keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination
     * 
     */
    @JsonIgnore
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-disableapitermination
     * 
     */
    @JsonIgnore
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }

    public LaunchTemplateData withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * InstanceMarketOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
     * 
     */
    @JsonIgnore
    public Property<InstanceMarketOptions> getInstanceMarketOptions() {
        return instanceMarketOptions;
    }

    /**
     * InstanceMarketOptions
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-instancemarketoptions.html
     * 
     */
    @JsonIgnore
    public void setInstanceMarketOptions(Property<InstanceMarketOptions> instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
    }

    public LaunchTemplateData withInstanceMarketOptions(Property<InstanceMarketOptions> instanceMarketOptions) {
        this.instanceMarketOptions = instanceMarketOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid
     * 
     */
    @JsonIgnore
    public CharSequence getRamDiskId() {
        return ramDiskId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html#cfn-ec2-launchtemplate-launchtemplatedata-ramdiskid
     * 
     */
    @JsonIgnore
    public void setRamDiskId(CharSequence ramDiskId) {
        this.ramDiskId = ramDiskId;
    }

    public LaunchTemplateData withRamDiskId(CharSequence ramDiskId) {
        this.ramDiskId = ramDiskId;
        return this;
    }

    /**
     * CapacityReservationSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html
     * 
     */
    @JsonIgnore
    public Property<CapacityReservationSpecification> getCapacityReservationSpecification() {
        return capacityReservationSpecification;
    }

    /**
     * CapacityReservationSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata-capacityreservationspecification.html
     * 
     */
    @JsonIgnore
    public void setCapacityReservationSpecification(Property<CapacityReservationSpecification> capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
    }

    public LaunchTemplateData withCapacityReservationSpecification(Property<CapacityReservationSpecification> capacityReservationSpecification) {
        this.capacityReservationSpecification = capacityReservationSpecification;
        return this;
    }

    /**
     * CreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
     * 
     */
    @JsonIgnore
    public Property<CreditSpecification> getCreditSpecification() {
        return creditSpecification;
    }

    /**
     * CreditSpecification
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-creditspecification.html
     * 
     */
    @JsonIgnore
    public void setCreditSpecification(Property<CreditSpecification> creditSpecification) {
        this.creditSpecification = creditSpecification;
    }

    public LaunchTemplateData withCreditSpecification(Property<CreditSpecification> creditSpecification) {
        this.creditSpecification = creditSpecification;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroups", securityGroups).append("tagSpecifications", tagSpecifications).append("userData", userData).append("blockDeviceMappings", blockDeviceMappings).append("iamInstanceProfile", iamInstanceProfile).append("kernelId", kernelId).append("ebsOptimized", ebsOptimized).append("elasticGpuSpecifications", elasticGpuSpecifications).append("elasticInferenceAccelerators", elasticInferenceAccelerators).append("placement", placement).append("networkInterfaces", networkInterfaces).append("imageId", imageId).append("instanceType", instanceType).append("monitoring", monitoring).append("hibernationOptions", hibernationOptions).append("licenseSpecifications", licenseSpecifications).append("instanceInitiatedShutdownBehavior", instanceInitiatedShutdownBehavior).append("cpuOptions", cpuOptions).append("securityGroupIds", securityGroupIds).append("keyName", keyName).append("disableApiTermination", disableApiTermination).append("instanceMarketOptions", instanceMarketOptions).append("ramDiskId", ramDiskId).append("capacityReservationSpecification", capacityReservationSpecification).append("creditSpecification", creditSpecification).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(kernelId).append(userData).append(capacityReservationSpecification).append(hibernationOptions).append(ramDiskId).append(instanceInitiatedShutdownBehavior).append(elasticInferenceAccelerators).append(securityGroupIds).append(tagSpecifications).append(elasticGpuSpecifications).append(ebsOptimized).append(imageId).append(blockDeviceMappings).append(licenseSpecifications).append(instanceType).append(keyName).append(cpuOptions).append(creditSpecification).append(monitoring).append(iamInstanceProfile).append(networkInterfaces).append(disableApiTermination).append(instanceMarketOptions).append(securityGroups).append(placement).toHashCode();
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
        return new EqualsBuilder().append(kernelId, rhs.kernelId).append(userData, rhs.userData).append(capacityReservationSpecification, rhs.capacityReservationSpecification).append(hibernationOptions, rhs.hibernationOptions).append(ramDiskId, rhs.ramDiskId).append(instanceInitiatedShutdownBehavior, rhs.instanceInitiatedShutdownBehavior).append(elasticInferenceAccelerators, rhs.elasticInferenceAccelerators).append(securityGroupIds, rhs.securityGroupIds).append(tagSpecifications, rhs.tagSpecifications).append(elasticGpuSpecifications, rhs.elasticGpuSpecifications).append(ebsOptimized, rhs.ebsOptimized).append(imageId, rhs.imageId).append(blockDeviceMappings, rhs.blockDeviceMappings).append(licenseSpecifications, rhs.licenseSpecifications).append(instanceType, rhs.instanceType).append(keyName, rhs.keyName).append(cpuOptions, rhs.cpuOptions).append(creditSpecification, rhs.creditSpecification).append(monitoring, rhs.monitoring).append(iamInstanceProfile, rhs.iamInstanceProfile).append(networkInterfaces, rhs.networkInterfaces).append(disableApiTermination, rhs.disableApiTermination).append(instanceMarketOptions, rhs.instanceMarketOptions).append(securityGroups, rhs.securityGroups).append(placement, rhs.placement).isEquals();
    }

}
