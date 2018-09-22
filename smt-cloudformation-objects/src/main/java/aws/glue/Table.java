
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Table
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TableInput",
    "DatabaseName",
    "CatalogId"
})
public class Table {

    /**
     * TableInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html
     * 
     */
    @JsonProperty("TableInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html")
    private TableInput tableInput;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename")
    private String databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid")
    private String catalogId;

    /**
     * TableInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html
     * 
     */
    @JsonProperty("TableInput")
    public TableInput getTableInput() {
        return tableInput;
    }

    /**
     * TableInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html
     * 
     */
    @JsonProperty("TableInput")
    public void setTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
    }

    public Table withTableInput(TableInput tableInput) {
        this.tableInput = tableInput;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    public String getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    public void setDatabaseName(String databaseName) {
        this.databaseName = databaseName;
    }

    public Table withDatabaseName(String databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    public String getCatalogId() {
        return catalogId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-table.html#cfn-glue-table-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    public void setCatalogId(String catalogId) {
        this.catalogId = catalogId;
    }

    public Table withCatalogId(String catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableInput", tableInput).append("databaseName", databaseName).append("catalogId", catalogId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(catalogId).append(databaseName).append(tableInput).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Table) == false) {
            return false;
        }
        Table rhs = ((Table) other);
        return new EqualsBuilder().append(catalogId, rhs.catalogId).append(databaseName, rhs.databaseName).append(tableInput, rhs.tableInput).isEquals();
    }

}
