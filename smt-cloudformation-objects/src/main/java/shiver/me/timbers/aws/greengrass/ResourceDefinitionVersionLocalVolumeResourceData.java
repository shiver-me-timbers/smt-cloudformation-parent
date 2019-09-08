
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
 * ResourceDefinitionVersionLocalVolumeResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourcePath",
    "DestinationPath",
    "GroupOwnerSetting"
})
public class ResourceDefinitionVersionLocalVolumeResourceData implements Property<ResourceDefinitionVersionLocalVolumeResourceData>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-sourcepath
     * 
     */
    @JsonProperty("SourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-sourcepath")
    private CharSequence sourcePath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-destinationpath
     * 
     */
    @JsonProperty("DestinationPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-destinationpath")
    private CharSequence destinationPath;
    /**
     * ResourceDefinitionVersionGroupOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html
     * 
     */
    @JsonProperty("GroupOwnerSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html")
    private Property<ResourceDefinitionVersionGroupOwnerSetting> groupOwnerSetting;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-sourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getSourcePath() {
        return sourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-sourcepath
     * 
     */
    @JsonIgnore
    public void setSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
    }

    public ResourceDefinitionVersionLocalVolumeResourceData withSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public CharSequence getDestinationPath() {
        return destinationPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-destinationpath
     * 
     */
    @JsonIgnore
    public void setDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
    }

    public ResourceDefinitionVersionLocalVolumeResourceData withDestinationPath(CharSequence destinationPath) {
        this.destinationPath = destinationPath;
        return this;
    }

    /**
     * ResourceDefinitionVersionGroupOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionVersionGroupOwnerSetting> getGroupOwnerSetting() {
        return groupOwnerSetting;
    }

    /**
     * ResourceDefinitionVersionGroupOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html
     * 
     */
    @JsonIgnore
    public void setGroupOwnerSetting(Property<ResourceDefinitionVersionGroupOwnerSetting> groupOwnerSetting) {
        this.groupOwnerSetting = groupOwnerSetting;
    }

    public ResourceDefinitionVersionLocalVolumeResourceData withGroupOwnerSetting(Property<ResourceDefinitionVersionGroupOwnerSetting> groupOwnerSetting) {
        this.groupOwnerSetting = groupOwnerSetting;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourcePath", sourcePath).append("destinationPath", destinationPath).append("groupOwnerSetting", groupOwnerSetting).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupOwnerSetting).append(destinationPath).append(sourcePath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionVersionLocalVolumeResourceData) == false) {
            return false;
        }
        ResourceDefinitionVersionLocalVolumeResourceData rhs = ((ResourceDefinitionVersionLocalVolumeResourceData) other);
        return new EqualsBuilder().append(groupOwnerSetting, rhs.groupOwnerSetting).append(destinationPath, rhs.destinationPath).append(sourcePath, rhs.sourcePath).isEquals();
    }

}
