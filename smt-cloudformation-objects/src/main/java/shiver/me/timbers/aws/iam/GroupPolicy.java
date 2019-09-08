
package shiver.me.timbers.aws.iam;

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
 * GroupPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PolicyDocument",
    "PolicyName"
})
public class GroupPolicy implements Property<GroupPolicy>
{

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonProperty("PolicyDocument")
    @JsonPropertyDescription("https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html")
    private Property<PolicyDocument> policyDocument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html#cfn-iam-policies-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html#cfn-iam-policies-policyname")
    private CharSequence policyName;

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public Property<PolicyDocument> getPolicyDocument() {
        return policyDocument;
    }

    /**
     * Resource
     * <p>
     * https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_policies_elements.html
     * 
     */
    @JsonIgnore
    public void setPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
    }

    public GroupPolicy withPolicyDocument(Property<PolicyDocument> policyDocument) {
        this.policyDocument = policyDocument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html#cfn-iam-policies-policyname
     * 
     */
    @JsonIgnore
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-policy.html#cfn-iam-policies-policyname
     * 
     */
    @JsonIgnore
    public void setPolicyName(CharSequence policyName) {
        this.policyName = policyName;
    }

    public GroupPolicy withPolicyName(CharSequence policyName) {
        this.policyName = policyName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policyDocument", policyDocument).append("policyName", policyName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyDocument).append(policyName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GroupPolicy) == false) {
            return false;
        }
        GroupPolicy rhs = ((GroupPolicy) other);
        return new EqualsBuilder().append(policyDocument, rhs.policyDocument).append(policyName, rhs.policyName).isEquals();
    }

}
