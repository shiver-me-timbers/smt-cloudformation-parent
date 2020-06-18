
package shiver.me.timbers.aws.lakeformation;

import java.util.ArrayList;
import java.util.List;
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
 * PermissionsColumnWildcard
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExcludedColumnNames"
})
public class PermissionsColumnWildcard implements Property<PermissionsColumnWildcard>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html#cfn-lakeformation-permissions-columnwildcard-excludedcolumnnames
     * 
     */
    @JsonProperty("ExcludedColumnNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html#cfn-lakeformation-permissions-columnwildcard-excludedcolumnnames")
    private List<CharSequence> excludedColumnNames = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html#cfn-lakeformation-permissions-columnwildcard-excludedcolumnnames
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExcludedColumnNames() {
        return excludedColumnNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html#cfn-lakeformation-permissions-columnwildcard-excludedcolumnnames
     * 
     */
    @JsonIgnore
    public void setExcludedColumnNames(List<CharSequence> excludedColumnNames) {
        this.excludedColumnNames = excludedColumnNames;
    }

    public PermissionsColumnWildcard withExcludedColumnNames(List<CharSequence> excludedColumnNames) {
        this.excludedColumnNames = excludedColumnNames;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("excludedColumnNames", excludedColumnNames).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(excludedColumnNames).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PermissionsColumnWildcard) == false) {
            return false;
        }
        PermissionsColumnWildcard rhs = ((PermissionsColumnWildcard) other);
        return new EqualsBuilder().append(excludedColumnNames, rhs.excludedColumnNames).isEquals();
    }

}
