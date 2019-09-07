
package aws.glue;

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
 * MLTransformGlueTables
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ConnectionName",
    "TableName",
    "DatabaseName",
    "CatalogId"
})
public class MLTransformGlueTables implements Property<MLTransformGlueTables>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-connectionname
     * 
     */
    @JsonProperty("ConnectionName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-connectionname")
    private CharSequence connectionName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-tablename")
    private CharSequence tableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-databasename")
    private CharSequence databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-catalogid")
    private CharSequence catalogId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-connectionname
     * 
     */
    @JsonIgnore
    public CharSequence getConnectionName() {
        return connectionName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-connectionname
     * 
     */
    @JsonIgnore
    public void setConnectionName(CharSequence connectionName) {
        this.connectionName = connectionName;
    }

    public MLTransformGlueTables withConnectionName(CharSequence connectionName) {
        this.connectionName = connectionName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public MLTransformGlueTables withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-databasename
     * 
     */
    @JsonIgnore
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-databasename
     * 
     */
    @JsonIgnore
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public MLTransformGlueTables withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-catalogid
     * 
     */
    @JsonIgnore
    public CharSequence getCatalogId() {
        return catalogId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-mltransform-inputrecordtables-gluetables.html#cfn-glue-mltransform-inputrecordtables-gluetables-catalogid
     * 
     */
    @JsonIgnore
    public void setCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
    }

    public MLTransformGlueTables withCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("connectionName", connectionName).append("tableName", tableName).append("databaseName", databaseName).append("catalogId", catalogId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(connectionName).append(catalogId).append(databaseName).append(tableName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MLTransformGlueTables) == false) {
            return false;
        }
        MLTransformGlueTables rhs = ((MLTransformGlueTables) other);
        return new EqualsBuilder().append(connectionName, rhs.connectionName).append(catalogId, rhs.catalogId).append(databaseName, rhs.databaseName).append(tableName, rhs.tableName).isEquals();
    }

}
