
package shiver.me.timbers.aws.dlm;

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
 * LifecyclePolicyRetainRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Count"
})
public class LifecyclePolicyRetainRule implements Property<LifecyclePolicyRetainRule>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-count
     * 
     */
    @JsonProperty("Count")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-count")
    private Number count;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-count
     * 
     */
    @JsonIgnore
    public Number getCount() {
        return count;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-retainrule.html#cfn-dlm-lifecyclepolicy-retainrule-count
     * 
     */
    @JsonIgnore
    public void setCount(Number count) {
        this.count = count;
    }

    public LifecyclePolicyRetainRule withCount(Number count) {
        this.count = count;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("count", count).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(count).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicyRetainRule) == false) {
            return false;
        }
        LifecyclePolicyRetainRule rhs = ((LifecyclePolicyRetainRule) other);
        return new EqualsBuilder().append(count, rhs.count).isEquals();
    }

}