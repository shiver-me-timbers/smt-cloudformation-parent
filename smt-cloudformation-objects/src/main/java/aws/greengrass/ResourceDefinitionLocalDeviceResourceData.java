
package aws.greengrass;

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
 * ResourceDefinitionLocalDeviceResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourcePath",
    "GroupOwnerSetting"
})
public class ResourceDefinitionLocalDeviceResourceData implements Property<ResourceDefinitionLocalDeviceResourceData>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-sourcepath
     * 
     */
    @JsonProperty("SourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-sourcepath")
    private CharSequence sourcePath;
    /**
     * ResourceDefinitionGroupOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html
     * 
     */
    @JsonProperty("GroupOwnerSetting")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html")
    private Property<ResourceDefinitionGroupOwnerSetting> groupOwnerSetting;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-sourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getSourcePath() {
        return sourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-sourcepath
     * 
     */
    @JsonIgnore
    public void setSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
    }

    public ResourceDefinitionLocalDeviceResourceData withSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
        return this;
    }

    /**
     * ResourceDefinitionGroupOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html
     * 
     */
    @JsonIgnore
    public Property<ResourceDefinitionGroupOwnerSetting> getGroupOwnerSetting() {
        return groupOwnerSetting;
    }

    /**
     * ResourceDefinitionGroupOwnerSetting
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html
     * 
     */
    @JsonIgnore
    public void setGroupOwnerSetting(Property<ResourceDefinitionGroupOwnerSetting> groupOwnerSetting) {
        this.groupOwnerSetting = groupOwnerSetting;
    }

    public ResourceDefinitionLocalDeviceResourceData withGroupOwnerSetting(Property<ResourceDefinitionGroupOwnerSetting> groupOwnerSetting) {
        this.groupOwnerSetting = groupOwnerSetting;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sourcePath", sourcePath).append("groupOwnerSetting", groupOwnerSetting).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupOwnerSetting).append(sourcePath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionLocalDeviceResourceData) == false) {
            return false;
        }
        ResourceDefinitionLocalDeviceResourceData rhs = ((ResourceDefinitionLocalDeviceResourceData) other);
        return new EqualsBuilder().append(groupOwnerSetting, rhs.groupOwnerSetting).append(sourcePath, rhs.sourcePath).isEquals();
    }

}
