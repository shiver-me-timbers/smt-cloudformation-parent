
package aws.lakeformation;

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
 * PermissionsDataLakePrincipal
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DataLakePrincipalIdentifier"
})
public class PermissionsDataLakePrincipal implements Property<PermissionsDataLakePrincipal>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html#cfn-lakeformation-permissions-datalakeprincipal-datalakeprincipalidentifier
     * 
     */
    @JsonProperty("DataLakePrincipalIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html#cfn-lakeformation-permissions-datalakeprincipal-datalakeprincipalidentifier")
    private CharSequence dataLakePrincipalIdentifier;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html#cfn-lakeformation-permissions-datalakeprincipal-datalakeprincipalidentifier
     * 
     */
    @JsonIgnore
    public CharSequence getDataLakePrincipalIdentifier() {
        return dataLakePrincipalIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html#cfn-lakeformation-permissions-datalakeprincipal-datalakeprincipalidentifier
     * 
     */
    @JsonIgnore
    public void setDataLakePrincipalIdentifier(CharSequence dataLakePrincipalIdentifier) {
        this.dataLakePrincipalIdentifier = dataLakePrincipalIdentifier;
    }

    public PermissionsDataLakePrincipal withDataLakePrincipalIdentifier(CharSequence dataLakePrincipalIdentifier) {
        this.dataLakePrincipalIdentifier = dataLakePrincipalIdentifier;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataLakePrincipalIdentifier", dataLakePrincipalIdentifier).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataLakePrincipalIdentifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PermissionsDataLakePrincipal) == false) {
            return false;
        }
        PermissionsDataLakePrincipal rhs = ((PermissionsDataLakePrincipal) other);
        return new EqualsBuilder().append(dataLakePrincipalIdentifier, rhs.dataLakePrincipalIdentifier).isEquals();
    }

}
