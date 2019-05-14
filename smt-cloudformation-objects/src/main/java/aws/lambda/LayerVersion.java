
package aws.lambda;

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
 * LayerVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CompatibleRuntimes",
    "LicenseInfo",
    "Description",
    "LayerName",
    "Content"
})
public class LayerVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes
     * 
     */
    @JsonProperty("CompatibleRuntimes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes")
    private List<CharSequence> compatibleRuntimes = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo
     * 
     */
    @JsonProperty("LicenseInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo")
    private CharSequence licenseInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername
     * 
     */
    @JsonProperty("LayerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername")
    private CharSequence layerName;
    /**
     * Content
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html
     * 
     */
    @JsonProperty("Content")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html")
    private Property<Content> content;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes
     * 
     */
    @JsonIgnore
    public List<CharSequence> getCompatibleRuntimes() {
        return compatibleRuntimes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-compatibleruntimes
     * 
     */
    @JsonIgnore
    public void setCompatibleRuntimes(List<CharSequence> compatibleRuntimes) {
        this.compatibleRuntimes = compatibleRuntimes;
    }

    public LayerVersion withCompatibleRuntimes(List<CharSequence> compatibleRuntimes) {
        this.compatibleRuntimes = compatibleRuntimes;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo
     * 
     */
    @JsonIgnore
    public CharSequence getLicenseInfo() {
        return licenseInfo;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-licenseinfo
     * 
     */
    @JsonIgnore
    public void setLicenseInfo(CharSequence licenseInfo) {
        this.licenseInfo = licenseInfo;
    }

    public LayerVersion withLicenseInfo(CharSequence licenseInfo) {
        this.licenseInfo = licenseInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public LayerVersion withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername
     * 
     */
    @JsonIgnore
    public CharSequence getLayerName() {
        return layerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lambda-layerversion.html#cfn-lambda-layerversion-layername
     * 
     */
    @JsonIgnore
    public void setLayerName(CharSequence layerName) {
        this.layerName = layerName;
    }

    public LayerVersion withLayerName(CharSequence layerName) {
        this.layerName = layerName;
        return this;
    }

    /**
     * Content
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html
     * 
     */
    @JsonIgnore
    public Property<Content> getContent() {
        return content;
    }

    /**
     * Content
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-layerversion-content.html
     * 
     */
    @JsonIgnore
    public void setContent(Property<Content> content) {
        this.content = content;
    }

    public LayerVersion withContent(Property<Content> content) {
        this.content = content;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("compatibleRuntimes", compatibleRuntimes).append("licenseInfo", licenseInfo).append("description", description).append("layerName", layerName).append("content", content).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(licenseInfo).append(layerName).append(compatibleRuntimes).append(content).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LayerVersion) == false) {
            return false;
        }
        LayerVersion rhs = ((LayerVersion) other);
        return new EqualsBuilder().append(description, rhs.description).append(licenseInfo, rhs.licenseInfo).append(layerName, rhs.layerName).append(compatibleRuntimes, rhs.compatibleRuntimes).append(content, rhs.content).isEquals();
    }

}
