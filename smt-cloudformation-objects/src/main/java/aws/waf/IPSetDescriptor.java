
package aws.waf;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IPSetDescriptor
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Type",
    "Value"
})
public class IPSetDescriptor {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-type")
    private CharSequence type;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-value
     * 
     */
    @JsonProperty("Value")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-value")
    private CharSequence value;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public IPSetDescriptor withType(CharSequence type) {
        this.type = type;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-value
     * 
     */
    public CharSequence getValue() {
        return value;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-waf-ipset-ipsetdescriptors.html#cfn-waf-ipset-ipsetdescriptors-value
     * 
     */
    public void setValue(CharSequence value) {
        this.value = value;
    }

    public IPSetDescriptor withValue(CharSequence value) {
        this.value = value;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).append("value", value).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(value).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IPSetDescriptor) == false) {
            return false;
        }
        IPSetDescriptor rhs = ((IPSetDescriptor) other);
        return new EqualsBuilder().append(type, rhs.type).append(value, rhs.value).isEquals();
    }

}
