
package aws.ecr;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LifecyclePolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "LifecyclePolicyText",
    "RegistryId"
})
public class LifecyclePolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext
     * 
     */
    @JsonProperty("LifecyclePolicyText")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext")
    private CharSequence lifecyclePolicyText;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid
     * 
     */
    @JsonProperty("RegistryId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid")
    private CharSequence registryId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext
     * 
     */
    public CharSequence getLifecyclePolicyText() {
        return lifecyclePolicyText;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext
     * 
     */
    public void setLifecyclePolicyText(CharSequence lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    public LifecyclePolicy withLifecyclePolicyText(CharSequence lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid
     * 
     */
    public CharSequence getRegistryId() {
        return registryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid
     * 
     */
    public void setRegistryId(CharSequence registryId) {
        this.registryId = registryId;
    }

    public LifecyclePolicy withRegistryId(CharSequence registryId) {
        this.registryId = registryId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("lifecyclePolicyText", lifecyclePolicyText).append("registryId", registryId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lifecyclePolicyText).append(registryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicy) == false) {
            return false;
        }
        LifecyclePolicy rhs = ((LifecyclePolicy) other);
        return new EqualsBuilder().append(lifecyclePolicyText, rhs.lifecyclePolicyText).append(registryId, rhs.registryId).isEquals();
    }

}
