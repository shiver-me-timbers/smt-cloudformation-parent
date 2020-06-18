
package shiver.me.timbers.aws.lakeformation;

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
 * PermissionsResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TableResource",
    "DatabaseResource",
    "DataLocationResource",
    "TableWithColumnsResource"
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
     * PermissionsDataLocationResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html
     * 
     */
    @JsonProperty("DataLocationResource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html")
    private Property<PermissionsDataLocationResource> dataLocationResource;
    /**
     * PermissionsTableWithColumnsResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html
     * 
     */
    @JsonProperty("TableWithColumnsResource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html")
    private Property<PermissionsTableWithColumnsResource> tableWithColumnsResource;

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

    /**
     * PermissionsDataLocationResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsDataLocationResource> getDataLocationResource() {
        return dataLocationResource;
    }

    /**
     * PermissionsDataLocationResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html
     * 
     */
    @JsonIgnore
    public void setDataLocationResource(Property<PermissionsDataLocationResource> dataLocationResource) {
        this.dataLocationResource = dataLocationResource;
    }

    public PermissionsResource withDataLocationResource(Property<PermissionsDataLocationResource> dataLocationResource) {
        this.dataLocationResource = dataLocationResource;
        return this;
    }

    /**
     * PermissionsTableWithColumnsResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsTableWithColumnsResource> getTableWithColumnsResource() {
        return tableWithColumnsResource;
    }

    /**
     * PermissionsTableWithColumnsResource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html
     * 
     */
    @JsonIgnore
    public void setTableWithColumnsResource(Property<PermissionsTableWithColumnsResource> tableWithColumnsResource) {
        this.tableWithColumnsResource = tableWithColumnsResource;
    }

    public PermissionsResource withTableWithColumnsResource(Property<PermissionsTableWithColumnsResource> tableWithColumnsResource) {
        this.tableWithColumnsResource = tableWithColumnsResource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableResource", tableResource).append("databaseResource", databaseResource).append("dataLocationResource", dataLocationResource).append("tableWithColumnsResource", tableWithColumnsResource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tableResource).append(tableWithColumnsResource).append(databaseResource).append(dataLocationResource).toHashCode();
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
        return new EqualsBuilder().append(tableResource, rhs.tableResource).append(tableWithColumnsResource, rhs.tableWithColumnsResource).append(databaseResource, rhs.databaseResource).append(dataLocationResource, rhs.dataLocationResource).isEquals();
    }

}
