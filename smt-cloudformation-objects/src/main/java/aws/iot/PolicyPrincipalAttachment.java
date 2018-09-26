
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PolicyPrincipalAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PolicyName",
    "Principal"
})
public class PolicyPrincipalAttachment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname")
    private CharSequence policyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal
     * 
     */
    @JsonProperty("Principal")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal")
    private CharSequence principal;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname
     * 
     */
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-policyname
     * 
     */
    public void setPolicyName(CharSequence policyName) {
        this.policyName = policyName;
    }

    public PolicyPrincipalAttachment withPolicyName(CharSequence policyName) {
        this.policyName = policyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal
     * 
     */
    public CharSequence getPrincipal() {
        return principal;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-policyprincipalattachment.html#cfn-iot-policyprincipalattachment-principal
     * 
     */
    public void setPrincipal(CharSequence principal) {
        this.principal = principal;
    }

    public PolicyPrincipalAttachment withPrincipal(CharSequence principal) {
        this.principal = principal;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policyName", policyName).append("principal", principal).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(principal).append(policyName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PolicyPrincipalAttachment) == false) {
            return false;
        }
        PolicyPrincipalAttachment rhs = ((PolicyPrincipalAttachment) other);
        return new EqualsBuilder().append(principal, rhs.principal).append(policyName, rhs.policyName).isEquals();
    }

}
