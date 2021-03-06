
package shiver.me.timbers.aws.ecr;

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
 * RepositoryLifecyclePolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LifecyclePolicyText",
    "RegistryId"
})
public class RepositoryLifecyclePolicy implements Property<RepositoryLifecyclePolicy>
{

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
    @JsonIgnore
    public CharSequence getLifecyclePolicyText() {
        return lifecyclePolicyText;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-lifecyclepolicytext
     * 
     */
    @JsonIgnore
    public void setLifecyclePolicyText(CharSequence lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
    }

    public RepositoryLifecyclePolicy withLifecyclePolicyText(CharSequence lifecyclePolicyText) {
        this.lifecyclePolicyText = lifecyclePolicyText;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid
     * 
     */
    @JsonIgnore
    public CharSequence getRegistryId() {
        return registryId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecr-repository-lifecyclepolicy.html#cfn-ecr-repository-lifecyclepolicy-registryid
     * 
     */
    @JsonIgnore
    public void setRegistryId(CharSequence registryId) {
        this.registryId = registryId;
    }

    public RepositoryLifecyclePolicy withRegistryId(CharSequence registryId) {
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
        if ((other instanceof RepositoryLifecyclePolicy) == false) {
            return false;
        }
        RepositoryLifecyclePolicy rhs = ((RepositoryLifecyclePolicy) other);
        return new EqualsBuilder().append(lifecyclePolicyText, rhs.lifecyclePolicyText).append(registryId, rhs.registryId).isEquals();
    }

}
