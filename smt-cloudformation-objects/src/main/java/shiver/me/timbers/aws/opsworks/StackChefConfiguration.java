
package shiver.me.timbers.aws.opsworks;

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
 * StackChefConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BerkshelfVersion",
    "ManageBerkshelf"
})
public class StackChefConfiguration implements Property<StackChefConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion
     * 
     */
    @JsonProperty("BerkshelfVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion")
    private CharSequence berkshelfVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion
     * 
     */
    @JsonProperty("ManageBerkshelf")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion")
    private CharSequence manageBerkshelf;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion
     * 
     */
    @JsonIgnore
    public CharSequence getBerkshelfVersion() {
        return berkshelfVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion
     * 
     */
    @JsonIgnore
    public void setBerkshelfVersion(CharSequence berkshelfVersion) {
        this.berkshelfVersion = berkshelfVersion;
    }

    public StackChefConfiguration withBerkshelfVersion(CharSequence berkshelfVersion) {
        this.berkshelfVersion = berkshelfVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion
     * 
     */
    @JsonIgnore
    public CharSequence getManageBerkshelf() {
        return manageBerkshelf;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-opsworks-stack-chefconfiguration.html#cfn-opsworks-chefconfiguration-berkshelfversion
     * 
     */
    @JsonIgnore
    public void setManageBerkshelf(CharSequence manageBerkshelf) {
        this.manageBerkshelf = manageBerkshelf;
    }

    public StackChefConfiguration withManageBerkshelf(CharSequence manageBerkshelf) {
        this.manageBerkshelf = manageBerkshelf;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("berkshelfVersion", berkshelfVersion).append("manageBerkshelf", manageBerkshelf).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(manageBerkshelf).append(berkshelfVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackChefConfiguration) == false) {
            return false;
        }
        StackChefConfiguration rhs = ((StackChefConfiguration) other);
        return new EqualsBuilder().append(manageBerkshelf, rhs.manageBerkshelf).append(berkshelfVersion, rhs.berkshelfVersion).isEquals();
    }

}
