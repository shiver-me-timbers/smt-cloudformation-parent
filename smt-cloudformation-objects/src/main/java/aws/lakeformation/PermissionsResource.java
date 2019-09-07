
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
 * PermissionsResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TableResource",
    "DatabaseResource"
})
public class PermissionsResource implements Property<PermissionsResource>
{

    /**
     * PermissionsTableResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html
     * 
     */
    @JsonProperty("TableResource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html")
    private Property<PermissionsTableResource> tableResource;
    /**
     * PermissionsDatabaseResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html
     * 
     */
    @JsonProperty("DatabaseResource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html")
    private Property<PermissionsDatabaseResource> databaseResource;

    /**
     * PermissionsTableResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsTableResource> getTableResource() {
        return tableResource;
    }

    /**
     * PermissionsTableResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html
     * 
     */
    @JsonIgnore
    public void setTableResource(Property<PermissionsTableResource> tableResource) {
        this.tableResource = tableResource;
    }

    public PermissionsResource withTableResource(Property<PermissionsTableResource> tableResource) {
        this.tableResource = tableResource;
        return this;
    }

    /**
     * PermissionsDatabaseResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsDatabaseResource> getDatabaseResource() {
        return databaseResource;
    }

    /**
     * PermissionsDatabaseResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html
     * 
     */
    @JsonIgnore
    public void setDatabaseResource(Property<PermissionsDatabaseResource> databaseResource) {
        this.databaseResource = databaseResource;
    }

    public PermissionsResource withDatabaseResource(Property<PermissionsDatabaseResource> databaseResource) {
        this.databaseResource = databaseResource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableResource", tableResource).append("databaseResource", databaseResource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tableResource).append(databaseResource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PermissionsResource) == false) {
            return false;
        }
        PermissionsResource rhs = ((PermissionsResource) other);
        return new EqualsBuilder().append(tableResource, rhs.tableResource).append(databaseResource, rhs.databaseResource).isEquals();
    }

}
