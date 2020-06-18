
package shiver.me.timbers.aws.greengrass;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * ResourceDefinitionS3MachineLearningModelResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OwnerSetting",
    "DestinationPath",
    "S3Uri"
})
public class ResourceDefinitionS3MachineLearningModelResourceData implements Property<ResourceDefinitionS3MachineLearningModelResourceData>
{

    /**
     * ResourceDefinitionVersionResourceDownloadOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
     * 
     */
    @JsonProperty("OwnerSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html")
    private Property<ResourceDefinitionResourceDownloadOwnerSetting> ownerSetting;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonProperty("DestinationPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-destinationpath")
    private CharSequence destinationPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-s3uri
     * 
     */
    @JsonProperty("S3Uri")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-s3uri")
    private CharSequence s3Uri;

    /**
     * ResourceDefinitionVersionResourceDownloadOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionResourceDownloadOwnerSetting> getOwnerSetting() {
        return ownerSetting;
    }

    /**
     * ResourceDefinitionVersionResourceDownloadOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
     * 
     */
    @JsonIgnore
    public void setOwnerSetting(Property<ResourceDefinitionResourceDownloadOwnerSetting> ownerSetting) {
        this.ownerSetting = ownerSetting;
    }

    public ResourceDefinitionS3MachineLearningModelResourceData withOwnerSetting(Property<ResourceDefinitionResourceDownloadOwnerSetting> ownerSetting) {
        this.ownerSetting = ownerSetting;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationPath() {
        return destinationPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public void setDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
    }

    public ResourceDefinitionS3MachineLearningModelResourceData withDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-s3uri
     * 
     */
    @JsonIgnore
    public CharSequence getS3Uri() {
        return s3Uri;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-s3uri
     * 
     */
    @JsonIgnore
    public void setS3Uri(CharSequence s3Uri) {
        this.s3Uri = s3Uri;
    }

    public ResourceDefinitionS3MachineLearningModelResourceData withS3Uri(CharSequence s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ownerSetting", ownerSetting).append("destinationPath", destinationPath).append("s3Uri", s3Uri).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Uri).append(ownerSetting).append(destinationPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionS3MachineLearningModelResourceData) == false) {
            return false;
        }
        ResourceDefinitionS3MachineLearningModelResourceData rhs = ((ResourceDefinitionS3MachineLearningModelResourceData) other);
        return new EqualsBuilder().append(s3Uri, rhs.s3Uri).append(ownerSetting, rhs.ownerSetting).append(destinationPath, rhs.destinationPath).isEquals();
    }

}
