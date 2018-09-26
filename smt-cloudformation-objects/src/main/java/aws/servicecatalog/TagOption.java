
package aws.servicecatalog;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TagOption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Active",
    "Value",
    "Key"
})
public class TagOption {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active
     * 
     */
    @JsonProperty("Active")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active")
    private Boolean active;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value")
    private CharSequence value;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key")
    private CharSequence key;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active
     * 
     */
    public Boolean getActive() {
        return active;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-active
     * 
     */
    public void setActive(Boolean active) {
        this.active = active;
    }

    public TagOption withActive(Boolean active) {
        this.active = active;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public TagOption withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-servicecatalog-tagoption.html#cfn-servicecatalog-tagoption-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public TagOption withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("active", active).append("value", value).append("key", key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(active).append(value).append(key).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TagOption) == false) {
            return false;
        }
        TagOption rhs = ((TagOption) other);
        return new EqualsBuilder().append(active, rhs.active).append(value, rhs.value).append(key, rhs.key).isEquals();
    }

}
