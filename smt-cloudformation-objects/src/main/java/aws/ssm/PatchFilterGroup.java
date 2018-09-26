
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
 * PatchFilterGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "PatchFilters"
})
public class PatchFilterGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters
     * 
     */
    @JsonProperty("PatchFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters")
    private List<PatchFilter> patchFilters = new ArrayList<PatchFilter>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters
     * 
     */
    public List<PatchFilter> getPatchFilters() {
        return patchFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters
     * 
     */
    public void setPatchFilters(List<PatchFilter> patchFilters) {
        this.patchFilters = patchFilters;
    }

    public PatchFilterGroup withPatchFilters(List<PatchFilter> patchFilters) {
        this.patchFilters = patchFilters;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("patchFilters", patchFilters).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(patchFilters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PatchFilterGroup) == false) {
            return false;
        }
        PatchFilterGroup rhs = ((PatchFilterGroup) other);
        return new EqualsBuilder().append(patchFilters, rhs.patchFilters).isEquals();
    }

}
