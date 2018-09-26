
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PatchFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Values",
    "Key"
})
public class PatchFilter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values
     * 
     */
    @JsonProperty("Values")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values")
    private List<CharSequence> values = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key")
    private CharSequence key;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values
     * 
     */
    public List<CharSequence> getValues() {
        return values;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-values
     * 
     */
    public void setValues(List<CharSequence> values) {
        this.values = values;
    }

    public PatchFilter withValues(List<CharSequence> values) {
        this.values = values;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfilter.html#cfn-ssm-patchbaseline-patchfilter-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public PatchFilter withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("values", values).append("key", key).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(key).append(values).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatchFilter) == false) {
            return false;
        }
        PatchFilter rhs = ((PatchFilter) other);
        return new EqualsBuilder().append(key, rhs.key).append(values, rhs.values).isEquals();
    }

}
