
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
 * Permissions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DataLakePrincipal",
    "Resource",
    "Permissions",
    "PermissionsWithGrantOption"
})
public class Permissions {

    /**
     * PermissionsDataLakePrincipal
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html
     * 
     */
    @JsonProperty("DataLakePrincipal")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html")
    private Property<PermissionsDataLakePrincipal> dataLakePrincipal;
    /**
     * PermissionsDatabaseResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html
     * 
     */
    @JsonProperty("Resource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html")
    private Property<PermissionsResource> resource;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions
     * 
     */
    @JsonProperty("Permissions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions")
    private List<CharSequence> permissions = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption
     * 
     */
    @JsonProperty("PermissionsWithGrantOption")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption")
    private List<CharSequence> permissionsWithGrantOption = new ArrayList<CharSequence>();

    /**
     * PermissionsDataLakePrincipal
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsDataLakePrincipal> getDataLakePrincipal() {
        return dataLakePrincipal;
    }

    /**
     * PermissionsDataLakePrincipal
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html
     * 
     */
    @JsonIgnore
    public void setDataLakePrincipal(Property<PermissionsDataLakePrincipal> dataLakePrincipal) {
        this.dataLakePrincipal = dataLakePrincipal;
    }

    public Permissions withDataLakePrincipal(Property<PermissionsDataLakePrincipal> dataLakePrincipal) {
        this.dataLakePrincipal = dataLakePrincipal;
        return this;
    }

    /**
     * PermissionsDatabaseResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsResource> getResource() {
        return resource;
    }

    /**
     * PermissionsDatabaseResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html
     * 
     */
    @JsonIgnore
    public void setResource(Property<PermissionsResource> resource) {
        this.resource = resource;
    }

    public Permissions withResource(Property<PermissionsResource> resource) {
        this.resource = resource;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions
     * 
     */
    @JsonIgnore
    public List<CharSequence> getPermissions() {
        return permissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions
     * 
     */
    @JsonIgnore
    public void setPermissions(List<CharSequence> permissions) {
        this.permissions = permissions;
    }

    public Permissions withPermissions(List<CharSequence> permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption
     * 
     */
    @JsonIgnore
    public List<CharSequence> getPermissionsWithGrantOption() {
        return permissionsWithGrantOption;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption
     * 
     */
    @JsonIgnore
    public void setPermissionsWithGrantOption(List<CharSequence> permissionsWithGrantOption) {
        this.permissionsWithGrantOption = permissionsWithGrantOption;
    }

    public Permissions withPermissionsWithGrantOption(List<CharSequence> permissionsWithGrantOption) {
        this.permissionsWithGrantOption = permissionsWithGrantOption;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataLakePrincipal", dataLakePrincipal).append("resource", resource).append("permissions", permissions).append("permissionsWithGrantOption", permissionsWithGrantOption).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(permissionsWithGrantOption).append(resource).append(dataLakePrincipal).append(permissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Permissions) == false) {
            return false;
        }
        Permissions rhs = ((Permissions) other);
        return new EqualsBuilder().append(permissionsWithGrantOption, rhs.permissionsWithGrantOption).append(resource, rhs.resource).append(dataLakePrincipal, rhs.dataLakePrincipal).append(permissions, rhs.permissions).isEquals();
    }

}
