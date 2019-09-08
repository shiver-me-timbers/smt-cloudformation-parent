
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
 * LifecyclePolicyParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExcludeBootVolume"
})
public class LifecyclePolicyParameters implements Property<LifecyclePolicyParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludebootvolume
     * 
     */
    @JsonProperty("ExcludeBootVolume")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludebootvolume")
    private CharSequence excludeBootVolume;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludebootvolume
     * 
     */
    @JsonIgnore
    public CharSequence getExcludeBootVolume() {
        return excludeBootVolume;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dlm-lifecyclepolicy-parameters.html#cfn-dlm-lifecyclepolicy-parameters-excludebootvolume
     * 
     */
    @JsonIgnore
    public void setExcludeBootVolume(CharSequence excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
    }

    public LifecyclePolicyParameters withExcludeBootVolume(CharSequence excludeBootVolume) {
        this.excludeBootVolume = excludeBootVolume;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("excludeBootVolume", excludeBootVolume).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(excludeBootVolume).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LifecyclePolicyParameters) == false) {
            return false;
        }
        LifecyclePolicyParameters rhs = ((LifecyclePolicyParameters) other);
        return new EqualsBuilder().append(excludeBootVolume, rhs.excludeBootVolume).isEquals();
    }

}
