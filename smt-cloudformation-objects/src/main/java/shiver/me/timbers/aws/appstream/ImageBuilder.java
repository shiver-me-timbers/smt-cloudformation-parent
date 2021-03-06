
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
 * ImageBuilder
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ImageName",
    "Description",
    "VpcConfig",
    "EnableDefaultInternetAccess",
    "DisplayName",
    "DomainJoinInfo",
    "AppstreamAgentVersion",
    "InstanceType",
    "Tags",
    "Name",
    "ImageArn",
    "AccessEndpoints"
})
public class ImageBuilder {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename
     * 
     */
    @JsonProperty("ImageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename")
    private CharSequence imageName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description")
    private CharSequence description;
    /**
     * ImageBuilderVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html
     * 
     */
    @JsonProperty("VpcConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html")
    private Property<ImageBuilderVpcConfig> vpcConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess
     * 
     */
    @JsonProperty("EnableDefaultInternetAccess")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess")
    private CharSequence enableDefaultInternetAccess;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname
     * 
     */
    @JsonProperty("DisplayName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname")
    private CharSequence displayName;
    /**
     * ImageBuilderDomainJoinInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html
     * 
     */
    @JsonProperty("DomainJoinInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html")
    private Property<ImageBuilderDomainJoinInfo> domainJoinInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion
     * 
     */
    @JsonProperty("AppstreamAgentVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion")
    private CharSequence appstreamAgentVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-instancetype
     * 
     */
    @JsonProperty("InstanceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-instancetype")
    private CharSequence instanceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags")
    private List<Property<Tag>> tags = new ArrayList<Property<Tag>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name")
    private CharSequence name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn
     * 
     */
    @JsonProperty("ImageArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn")
    private CharSequence imageArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints
     * 
     */
    @JsonProperty("AccessEndpoints")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints")
    private List<Property<ImageBuilderAccessEndpoint>> accessEndpoints = new ArrayList<Property<ImageBuilderAccessEndpoint>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename
     * 
     */
    @JsonIgnore
    public CharSequence getImageName() {
        return imageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagename
     * 
     */
    @JsonIgnore
    public void setImageName(CharSequence imageName) {
        this.imageName = imageName;
    }

    public ImageBuilder withImageName(CharSequence imageName) {
        this.imageName = imageName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ImageBuilder withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * ImageBuilderVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html
     * 
     */
    @JsonIgnore
    public Property<ImageBuilderVpcConfig> getVpcConfig() {
        return vpcConfig;
    }

    /**
     * ImageBuilderVpcConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-vpcconfig.html
     * 
     */
    @JsonIgnore
    public void setVpcConfig(Property<ImageBuilderVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    public ImageBuilder withVpcConfig(Property<ImageBuilderVpcConfig> vpcConfig) {
        this.vpcConfig = vpcConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess
     * 
     */
    @JsonIgnore
    public CharSequence getEnableDefaultInternetAccess() {
        return enableDefaultInternetAccess;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-enabledefaultinternetaccess
     * 
     */
    @JsonIgnore
    public void setEnableDefaultInternetAccess(CharSequence enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
    }

    public ImageBuilder withEnableDefaultInternetAccess(CharSequence enableDefaultInternetAccess) {
        this.enableDefaultInternetAccess = enableDefaultInternetAccess;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname
     * 
     */
    @JsonIgnore
    public CharSequence getDisplayName() {
        return displayName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-displayname
     * 
     */
    @JsonIgnore
    public void setDisplayName(CharSequence displayName) {
        this.displayName = displayName;
    }

    public ImageBuilder withDisplayName(CharSequence displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * ImageBuilderDomainJoinInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html
     * 
     */
    @JsonIgnore
    public Property<ImageBuilderDomainJoinInfo> getDomainJoinInfo() {
        return domainJoinInfo;
    }

    /**
     * ImageBuilderDomainJoinInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-imagebuilder-domainjoininfo.html
     * 
     */
    @JsonIgnore
    public void setDomainJoinInfo(Property<ImageBuilderDomainJoinInfo> domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
    }

    public ImageBuilder withDomainJoinInfo(Property<ImageBuilderDomainJoinInfo> domainJoinInfo) {
        this.domainJoinInfo = domainJoinInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion
     * 
     */
    @JsonIgnore
    public CharSequence getAppstreamAgentVersion() {
        return appstreamAgentVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-appstreamagentversion
     * 
     */
    @JsonIgnore
    public void setAppstreamAgentVersion(CharSequence appstreamAgentVersion) {
        this.appstreamAgentVersion = appstreamAgentVersion;
    }

    public ImageBuilder withAppstreamAgentVersion(CharSequence appstreamAgentVersion) {
        this.appstreamAgentVersion = appstreamAgentVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-instancetype
     * 
     */
    @JsonIgnore
    public CharSequence getInstanceType() {
        return instanceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-instancetype
     * 
     */
    @JsonIgnore
    public void setInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
    }

    public ImageBuilder withInstanceType(CharSequence instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags
     * 
     */
    @JsonIgnore
    public List<Property<Tag>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<Tag>> tags) {
        this.tags = tags;
    }

    public ImageBuilder withTags(List<Property<Tag>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ImageBuilder withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn
     * 
     */
    @JsonIgnore
    public CharSequence getImageArn() {
        return imageArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-imagearn
     * 
     */
    @JsonIgnore
    public void setImageArn(CharSequence imageArn) {
        this.imageArn = imageArn;
    }

    public ImageBuilder withImageArn(CharSequence imageArn) {
        this.imageArn = imageArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints
     * 
     */
    @JsonIgnore
    public List<Property<ImageBuilderAccessEndpoint>> getAccessEndpoints() {
        return accessEndpoints;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-imagebuilder.html#cfn-appstream-imagebuilder-accessendpoints
     * 
     */
    @JsonIgnore
    public void setAccessEndpoints(List<Property<ImageBuilderAccessEndpoint>> accessEndpoints) {
        this.accessEndpoints = accessEndpoints;
    }

    public ImageBuilder withAccessEndpoints(List<Property<ImageBuilderAccessEndpoint>> accessEndpoints) {
        this.accessEndpoints = accessEndpoints;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("imageName", imageName).append("description", description).append("vpcConfig", vpcConfig).append("enableDefaultInternetAccess", enableDefaultInternetAccess).append("displayName", displayName).append("domainJoinInfo", domainJoinInfo).append("appstreamAgentVersion", appstreamAgentVersion).append("instanceType", instanceType).append("tags", tags).append("name", name).append("imageArn", imageArn).append("accessEndpoints", accessEndpoints).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(imageArn).append(imageName).append(enableDefaultInternetAccess).append(displayName).append(instanceType).append(accessEndpoints).append(description).append(appstreamAgentVersion).append(tags).append(domainJoinInfo).append(vpcConfig).append(name).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImageBuilder) == false) {
            return false;
        }
        ImageBuilder rhs = ((ImageBuilder) other);
        return new EqualsBuilder().append(imageArn, rhs.imageArn).append(imageName, rhs.imageName).append(enableDefaultInternetAccess, rhs.enableDefaultInternetAccess).append(displayName, rhs.displayName).append(instanceType, rhs.instanceType).append(accessEndpoints, rhs.accessEndpoints).append(description, rhs.description).append(appstreamAgentVersion, rhs.appstreamAgentVersion).append(tags, rhs.tags).append(domainJoinInfo, rhs.domainJoinInfo).append(vpcConfig, rhs.vpcConfig).append(name, rhs.name).isEquals();
    }

}
