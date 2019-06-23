
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
 * ResourceDefinitionVersionLocalDeviceResourceData
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SourcePath",
    "GroupOwnerSetting"
})
public class ResourceDefinitionVersionLocalDeviceResourceData implements Property<ResourceDefinitionVersionLocalDeviceResourceData>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-sourcepath
     * 
     */
    @JsonProperty("SourcePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-sourcepath")
    private CharSequence sourcePath;
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-sourcepath
     * 
     */
    @JsonIgnore
    public CharSequence getSourcePath() {
        return sourcePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-sourcepath
     * 
     */
    @JsonIgnore
    public void setSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
    }

    public ResourceDefinitionVersionLocalDeviceResourceData withSourcePath(CharSequence sourcePath) {
        this.sourcePath = sourcePath;
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

    public ResourceDefinitionVersionLocalDeviceResourceData withGroupOwnerSetting(Property<ResourceDefinitionVersionGroupOwnerSetting> groupOwnerSetting) {
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
        if ((other instanceof ResourceDefinitionVersionLocalDeviceResourceData) == false) {
            return false;
        }
        ResourceDefinitionVersionLocalDeviceResourceData rhs = ((ResourceDefinitionVersionLocalDeviceResourceData) other);
        return new EqualsBuilder().append(groupOwnerSetting, rhs.groupOwnerSetting).append(sourcePath, rhs.sourcePath).isEquals();
    }

}
