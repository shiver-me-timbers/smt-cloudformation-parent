
package aws.cloudformation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CustomResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ServiceToken"
})
public class CustomResource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken
     * 
     */
    @JsonProperty("ServiceToken")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken")
    private CharSequence serviceToken;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken
     * 
     */
    public CharSequence getServiceToken() {
        return serviceToken;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cfn-customresource.html#cfn-customresource-servicetoken
     * 
     */
    public void setServiceToken(CharSequence serviceToken) {
        this.serviceToken = serviceToken;
    }

    public CustomResource withServiceToken(CharSequence serviceToken) {
        this.serviceToken = serviceToken;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serviceToken", serviceToken).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceToken).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CustomResource) == false) {
            return false;
        }
        CustomResource rhs = ((CustomResource) other);
        return new EqualsBuilder().append(serviceToken, rhs.serviceToken).isEquals();
    }

}
