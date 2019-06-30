
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
 * ResourceDefinitionVersionGroupOwnerSetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AutoAddGroupOwner",
    "GroupOwner"
})
public class ResourceDefinitionVersionGroupOwnerSetting implements Property<ResourceDefinitionVersionGroupOwnerSetting>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-autoaddgroupowner
     * 
     */
    @JsonProperty("AutoAddGroupOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-autoaddgroupowner")
    private CharSequence autoAddGroupOwner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-groupowner
     * 
     */
    @JsonProperty("GroupOwner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-groupowner")
    private CharSequence groupOwner;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-autoaddgroupowner
     * 
     */
    @JsonIgnore
    public CharSequence getAutoAddGroupOwner() {
        return autoAddGroupOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-autoaddgroupowner
     * 
     */
    @JsonIgnore
    public void setAutoAddGroupOwner(CharSequence autoAddGroupOwner) {
        this.autoAddGroupOwner = autoAddGroupOwner;
    }

    public ResourceDefinitionVersionGroupOwnerSetting withAutoAddGroupOwner(CharSequence autoAddGroupOwner) {
        this.autoAddGroupOwner = autoAddGroupOwner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-groupowner
     * 
     */
    @JsonIgnore
    public CharSequence getGroupOwner() {
        return groupOwner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-groupowner
     * 
     */
    @JsonIgnore
    public void setGroupOwner(CharSequence groupOwner) {
        this.groupOwner = groupOwner;
    }

    public ResourceDefinitionVersionGroupOwnerSetting withGroupOwner(CharSequence groupOwner) {
        this.groupOwner = groupOwner;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("autoAddGroupOwner", autoAddGroupOwner).append("groupOwner", groupOwner).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(groupOwner).append(autoAddGroupOwner).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDefinitionVersionGroupOwnerSetting) == false) {
            return false;
        }
        ResourceDefinitionVersionGroupOwnerSetting rhs = ((ResourceDefinitionVersionGroupOwnerSetting) other);
        return new EqualsBuilder().append(groupOwner, rhs.groupOwner).append(autoAddGroupOwner, rhs.autoAddGroupOwner).isEquals();
    }

}
