
package shiver.me.timbers.aws.appstream;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;
import shiver.me.timbers.aws.Tag;


/**
 * Fleet
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Description",
    "ComputeCapacity",
    "VpcConfig",
    "FleetType",
    "EnableDefaultInternetAccess",
    "DomainJoinInfo",
    "Name",
    "ImageName",
    "MaxUserDurationInSeconds",
    "IdleDisconnectTimeoutInSeconds",
    "DisconnectTimeoutInSeconds",
    "DisplayName",
    "InstanceType",
    "Tags",
    "ImageArn"
})
public class Fleet {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description")
    private CharSequence description;
    /**
     * FleetComputeCapacity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html
     * 
     */
    @JsonProperty("ComputeCapacity")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html")
    private Property<FleetComputeCapacity> computeCapacity;
    /**
     * FleetVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html")
    private Property<FleetVpcConfig> vpcConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype
     * 
     */
    @JsonProperty("FleetType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype")
    private CharSequence fleetType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess
     * 
     */
    @JsonProperty("EnableDefaultInternetAccess")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess")
    private CharSequence enableDefaultInternetAccess;
    /**
     * FleetDomainJoinInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html
     * 
     */
    @JsonProperty("DomainJoinInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html")
    private Property<FleetDomainJoinInfo> domainJoinInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename
     * 
     */
    @JsonProperty("ImageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename")
    private CharSequence imageName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds
     * 
     */
    @JsonProperty("MaxUserDurationInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds")
    private Number maxUserDurationInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds
     * 
     */
    @JsonProperty("IdleDisconnectTimeoutInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds")
    private Number idleDisconnectTimeoutInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds
     * 
     */
    @JsonProperty("DisconnectTimeoutInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds")
    private Number disconnectTimeoutInSeconds;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname
     * 
     */
    @JsonProperty("DisplayName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname")
    private CharSequence displayName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn
     * 
     */
    @JsonProperty("ImageArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn")
    private CharSequence imageArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public Fleet withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * FleetComputeCapacity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html
     * 
     */
    @JsonIgnore
    public Property<FleetComputeCapacity> getComputeCapacity() {
        return computeCapacity;
    }

    /**
     * FleetComputeCapacity
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-computecapacity.html
     * 
     */
    @JsonIgnore
    public void setComputeCapacity(Property<FleetComputeCapacity> computeCapacity) {
        this.computeCapacity = computeCapacity;
    }

    public Fleet withComputeCapacity(Property<FleetComputeCapacity> computeCapacity) {
        this.computeCapacity = computeCapacity;
        return this;
    }

    /**
     * FleetVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html
     * 
     */
    @JsonIgnore
    public Property<FleetVpcConfig> getVpcConfig() {
        return vpcConfig;
    }

    /**
     * FleetVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-vpcconfig.html
     * 
     */
    @JsonIgnore
    public void setVpcConfig(Property<FleetVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public Fleet withVpcConfig(Property<FleetVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype
     * 
     */
    @JsonIgnore
    public CharSequence getFleetType() {
        return fleetType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-fleettype
     * 
     */
    @JsonIgnore
    public void setFleetType(CharSequence fleetType) {
        this.fleetType = fleetType;
    }

    public Fleet withFleetType(CharSequence fleetType) {
        this.fleetType = fleetType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess
     * 
     */
    @JsonIgnore
    public CharSequence getEnableDefaultInternetAccess() {
        return enableDefaultInternetAccess;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-enabledefaultinternetaccess
     * 
     */
    @JsonIgnore
    public void setEnableDefaultInternetAccess(CharSequence enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    public Fleet withEnableDefaultInternetAccess(CharSequence enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
        return this;
    }

    /**
     * FleetDomainJoinInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html
     * 
     */
    @JsonIgnore
    public Property<FleetDomainJoinInfo> getDomainJoinInfo() {
        return domainJoinInfo;
    }

    /**
     * FleetDomainJoinInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html
     * 
     */
    @JsonIgnore
    public void setDomainJoinInfo(Property<FleetDomainJoinInfo> domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    public Fleet withDomainJoinInfo(Property<FleetDomainJoinInfo> domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public Fleet withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename
     * 
     */
    @JsonIgnore
    public CharSequence getImageName() {
        return imageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagename
     * 
     */
    @JsonIgnore
    public void setImageName(CharSequence imageName) {
        this.imageName = imageName;
    }

    public Fleet withImageName(CharSequence imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds
     * 
     */
    @JsonIgnore
    public Number getMaxUserDurationInSeconds() {
        return maxUserDurationInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-maxuserdurationinseconds
     * 
     */
    @JsonIgnore
    public void setMaxUserDurationInSeconds(Number maxUserDurationInSeconds) {
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
    }

    public Fleet withMaxUserDurationInSeconds(Number maxUserDurationInSeconds) {
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds
     * 
     */
    @JsonIgnore
    public Number getIdleDisconnectTimeoutInSeconds() {
        return idleDisconnectTimeoutInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-idledisconnecttimeoutinseconds
     * 
     */
    @JsonIgnore
    public void setIdleDisconnectTimeoutInSeconds(Number idleDisconnectTimeoutInSeconds) {
        this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
    }

    public Fleet withIdleDisconnectTimeoutInSeconds(Number idleDisconnectTimeoutInSeconds) {
        this.idleDisconnectTimeoutInSeconds = idleDisconnectTimeoutInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds
     * 
     */
    @JsonIgnore
    public Number getDisconnectTimeoutInSeconds() {
        return disconnectTimeoutInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-disconnecttimeoutinseconds
     * 
     */
    @JsonIgnore
    public void setDisconnectTimeoutInSeconds(Number disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
    }

    public Fleet withDisconnectTimeoutInSeconds(Number disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname
     * 
     */
    @JsonIgnore
    public CharSequence getDisplayName() {
        return displayName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-displayname
     * 
     */
    @JsonIgnore
    public void setDisplayName(CharSequence displayName) {
        this.displayName = displayName;
    }

    public Fleet withDisplayName(CharSequence displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public Fleet withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public Fleet withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn
     * 
     */
    @JsonIgnore
    public CharSequence getImageArn() {
        return imageArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-fleet.html#cfn-appstream-fleet-imagearn
     * 
     */
    @JsonIgnore
    public void setImageArn(CharSequence imageArn) {
        this.imageArn = imageArn;
    }

    public Fleet withImageArn(CharSequence imageArn) {
        this.imageArn = imageArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("computeCapacity", computeCapacity).append("vpcConfig", vpcConfig).append("fleetType", fleetType).append("enableDefaultInternetAccess", enableDefaultInternetAccess).append("domainJoinInfo", domainJoinInfo).append("name", name).append("imageName", imageName).append("maxUserDurationInSeconds", maxUserDurationInSeconds).append("idleDisconnectTimeoutInSeconds", idleDisconnectTimeoutInSeconds).append("disconnectTimeoutInSeconds", disconnectTimeoutInSeconds).append("displayName", displayName).append("instanceType", instanceType).append("tags", tags).append("imageArn", imageArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(maxUserDurationInSeconds).append(imageArn).append(imageName).append(enableDefaultInternetAccess).append(displayName).append(instanceType).append(description).append(tags).append(domainJoinInfo).append(computeCapacity).append(fleetType).append(vpcConfig).append(name).append(idleDisconnectTimeoutInSeconds).append(disconnectTimeoutInSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Fleet) == false) {
            return false;
        }
        Fleet rhs = ((Fleet) other);
        return new EqualsBuilder().append(maxUserDurationInSeconds, rhs.maxUserDurationInSeconds).append(imageArn, rhs.imageArn).append(imageName, rhs.imageName).append(enableDefaultInternetAccess, rhs.enableDefaultInternetAccess).append(displayName, rhs.displayName).append(instanceType, rhs.instanceType).append(description, rhs.description).append(tags, rhs.tags).append(domainJoinInfo, rhs.domainJoinInfo).append(computeCapacity, rhs.computeCapacity).append(fleetType, rhs.fleetType).append(vpcConfig, rhs.vpcConfig).append(name, rhs.name).append(idleDisconnectTimeoutInSeconds, rhs.idleDisconnectTimeoutInSeconds).append(disconnectTimeoutInSeconds, rhs.disconnectTimeoutInSeconds).isEquals();
    }

}
