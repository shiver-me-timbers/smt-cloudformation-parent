
package aws.ssm;

import java.util.ArrayList;
import java.util.List;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * PatchBaselinePatchFilterGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PatchFilters"
})
public class PatchBaselinePatchFilterGroup implements Property<PatchBaselinePatchFilterGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters
     * 
     */
    @JsonProperty("PatchFilters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters")
    private List<Property<PatchBaselinePatchFilter>> patchFilters = new ArrayList<Property<PatchBaselinePatchFilter>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters
     * 
     */
    @JsonIgnore
    public List<Property<PatchBaselinePatchFilter>> getPatchFilters() {
        return patchFilters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-patchbaseline-patchfiltergroup.html#cfn-ssm-patchbaseline-patchfiltergroup-patchfilters
     * 
     */
    @JsonIgnore
    public void setPatchFilters(List<Property<PatchBaselinePatchFilter>> patchFilters) {
        this.patchFilters = patchFilters;
    }

    public PatchBaselinePatchFilterGroup withPatchFilters(List<Property<PatchBaselinePatchFilter>> patchFilters) {
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
        if ((other instanceof PatchBaselinePatchFilterGroup) == false) {
            return false;
        }
        PatchBaselinePatchFilterGroup rhs = ((PatchBaselinePatchFilterGroup) other);
        return new EqualsBuilder().append(patchFilters, rhs.patchFilters).isEquals();
    }

}
