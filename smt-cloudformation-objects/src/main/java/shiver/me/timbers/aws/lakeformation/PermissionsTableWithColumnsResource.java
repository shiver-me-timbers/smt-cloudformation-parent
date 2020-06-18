
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
 * PermissionsTableWithColumnsResource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ColumnNames",
    "DatabaseName",
    "Name",
    "ColumnWildcard"
})
public class PermissionsTableWithColumnsResource implements Property<PermissionsTableWithColumnsResource>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnnames
     * 
     */
    @JsonProperty("ColumnNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnnames")
    private List<CharSequence> columnNames = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-databasename")
    private CharSequence databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-name")
    private CharSequence name;
    /**
     * PermissionsColumnWildcard
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html
     * 
     */
    @JsonProperty("ColumnWildcard")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html")
    private Property<PermissionsColumnWildcard> columnWildcard;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnnames
     * 
     */
    @JsonIgnore
    public List<CharSequence> getColumnNames() {
        return columnNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnnames
     * 
     */
    @JsonIgnore
    public void setColumnNames(List<CharSequence> columnNames) {
        this.columnNames = columnNames;
    }

    public PermissionsTableWithColumnsResource withColumnNames(List<CharSequence> columnNames) {
        this.columnNames = columnNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-databasename
     * 
     */
    @JsonIgnore
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-databasename
     * 
     */
    @JsonIgnore
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public PermissionsTableWithColumnsResource withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public PermissionsTableWithColumnsResource withName(CharSequence name) {
        this.name = name;
        return this;
    }

    /**
     * PermissionsColumnWildcard
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html
     * 
     */
    @JsonIgnore
    public Property<PermissionsColumnWildcard> getColumnWildcard() {
        return columnWildcard;
    }

    /**
     * PermissionsColumnWildcard
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html
     * 
     */
    @JsonIgnore
    public void setColumnWildcard(Property<PermissionsColumnWildcard> columnWildcard) {
        this.columnWildcard = columnWildcard;
    }

    public PermissionsTableWithColumnsResource withColumnWildcard(Property<PermissionsColumnWildcard> columnWildcard) {
        this.columnWildcard = columnWildcard;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("columnNames", columnNames).append("databaseName", databaseName).append("name", name).append("columnWildcard", columnWildcard).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(columnWildcard).append(columnNames).append(databaseName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PermissionsTableWithColumnsResource) == false) {
            return false;
        }
        PermissionsTableWithColumnsResource rhs = ((PermissionsTableWithColumnsResource) other);
        return new EqualsBuilder().append(name, rhs.name).append(columnWildcard, rhs.columnWildcard).append(columnNames, rhs.columnNames).append(databaseName, rhs.databaseName).isEquals();
    }

}
