
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
 * ResourceDefinitionVersionResourceDownloadOwnerSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "GroupOwner",
    "GroupPermission"
})
public class ResourceDefinitionVersionResourceDownloadOwnerSetting implements Property<ResourceDefinitionVersionResourceDownloadOwnerSetting>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-groupowner
     * 
     */
    @JsonProperty("GroupOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-groupowner")
    private CharSequence groupOwner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-grouppermission
     * 
     */
    @JsonProperty("GroupPermission")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-grouppermission")
    private CharSequence groupPermission;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-groupowner
     * 
     */
    @JsonIgnore
    public CharSequence getGroupOwner() {
        return groupOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-groupowner
     * 
     */
    @JsonIgnore
    public void setGroupOwner(CharSequence groupOwner) {
        this.groupOwner = groupOwner;
    }

    public ResourceDefinitionVersionResourceDownloadOwnerSetting withGroupOwner(CharSequence groupOwner) {
        this.groupOwner = groupOwner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-grouppermission
     * 
     */
    @JsonIgnore
    public CharSequence getGroupPermission() {
        return groupPermission;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-grouppermission
     * 
     */
    @JsonIgnore
    public void setGroupPermission(CharSequence groupPermission) {
        this.groupPermission = groupPermission;
    }

    public ResourceDefinitionVersionResourceDownloadOwnerSetting withGroupPermission(CharSequence groupPermission) {
        this.groupPermission = groupPermission;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("groupOwner", groupOwner).append("groupPermission", groupPermission).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupOwner).append(groupPermission).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionVersionResourceDownloadOwnerSetting) == false) {
            return false;
        }
        ResourceDefinitionVersionResourceDownloadOwnerSetting rhs = ((ResourceDefinitionVersionResourceDownloadOwnerSetting) other);
        return new EqualsBuilder().append(groupOwner, rhs.groupOwner).append(groupPermission, rhs.groupPermission).isEquals();
    }

}
