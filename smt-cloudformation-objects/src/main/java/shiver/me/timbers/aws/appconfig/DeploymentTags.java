
package shiver.me.timbers.aws.appconfig;

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
 * DeploymentTags
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Value",
    "Key"
})
public class DeploymentTags implements Property<DeploymentTags>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-value")
    private CharSequence value;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-key")
    private CharSequence key;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-value
     * 
     */
    @JsonIgnore
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-value
     * 
     */
    @JsonIgnore
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public DeploymentTags withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-key
     * 
     */
    @JsonIgnore
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appconfig-deployment-tags.html#cfn-appconfig-deployment-tags-key
     * 
     */
    @JsonIgnore
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public DeploymentTags withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("value", value).append("key", key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(value).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeploymentTags) == false) {
            return false;
        }
        DeploymentTags rhs = ((DeploymentTags) other);
        return new EqualsBuilder().append(value, rhs.value).append(key, rhs.key).isEquals();
    }

}
