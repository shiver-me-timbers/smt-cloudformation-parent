
package shiver.me.timbers.aws.ssm;

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
 * ResourceDataSyncAwsOrganizationsSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OrganizationSourceType",
    "OrganizationalUnits"
})
public class ResourceDataSyncAwsOrganizationsSource implements Property<ResourceDataSyncAwsOrganizationsSource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationsourcetype
     * 
     */
    @JsonProperty("OrganizationSourceType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationsourcetype")
    private CharSequence organizationSourceType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationalunits
     * 
     */
    @JsonProperty("OrganizationalUnits")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationalunits")
    private List<CharSequence> organizationalUnits = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationsourcetype
     * 
     */
    @JsonIgnore
    public CharSequence getOrganizationSourceType() {
        return organizationSourceType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationsourcetype
     * 
     */
    @JsonIgnore
    public void setOrganizationSourceType(CharSequence organizationSourceType) {
        this.organizationSourceType = organizationSourceType;
    }

    public ResourceDataSyncAwsOrganizationsSource withOrganizationSourceType(CharSequence organizationSourceType) {
        this.organizationSourceType = organizationSourceType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationalunits
     * 
     */
    @JsonIgnore
    public List<CharSequence> getOrganizationalUnits() {
        return organizationalUnits;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-resourcedatasync-awsorganizationssource.html#cfn-ssm-resourcedatasync-awsorganizationssource-organizationalunits
     * 
     */
    @JsonIgnore
    public void setOrganizationalUnits(List<CharSequence> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
    }

    public ResourceDataSyncAwsOrganizationsSource withOrganizationalUnits(List<CharSequence> organizationalUnits) {
        this.organizationalUnits = organizationalUnits;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("organizationSourceType", organizationSourceType).append("organizationalUnits", organizationalUnits).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationalUnits).append(organizationSourceType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ResourceDataSyncAwsOrganizationsSource) == false) {
            return false;
        }
        ResourceDataSyncAwsOrganizationsSource rhs = ((ResourceDataSyncAwsOrganizationsSource) other);
        return new EqualsBuilder().append(organizationalUnits, rhs.organizationalUnits).append(organizationSourceType, rhs.organizationSourceType).isEquals();
    }

}
