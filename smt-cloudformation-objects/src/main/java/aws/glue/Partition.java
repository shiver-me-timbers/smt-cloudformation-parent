
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Partition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "TableName",
    "DatabaseName",
    "CatalogId",
    "PartitionInput"
})
public class Partition {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename")
    private CharSequence tableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename
     * 
     */
    @JsonProperty("DatabaseName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename")
    private CharSequence databaseName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid
     * 
     */
    @JsonProperty("CatalogId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid")
    private CharSequence catalogId;
    /**
     * PartitionInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html
     * 
     */
    @JsonProperty("PartitionInput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html")
    private PartitionInput partitionInput;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename
     * 
     */
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-tablename
     * 
     */
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public Partition withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename
     * 
     */
    public CharSequence getDatabaseName() {
        return databaseName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-databasename
     * 
     */
    public void setDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
    }

    public Partition withDatabaseName(CharSequence databaseName) {
        this.databaseName = databaseName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid
     * 
     */
    public CharSequence getCatalogId() {
        return catalogId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-partition.html#cfn-glue-partition-catalogid
     * 
     */
    public void setCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
    }

    public Partition withCatalogId(CharSequence catalogId) {
        this.catalogId = catalogId;
        return this;
    }

    /**
     * PartitionInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html
     * 
     */
    public PartitionInput getPartitionInput() {
        return partitionInput;
    }

    /**
     * PartitionInput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-partitioninput.html
     * 
     */
    public void setPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
    }

    public Partition withPartitionInput(PartitionInput partitionInput) {
        this.partitionInput = partitionInput;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tableName", tableName).append("databaseName", databaseName).append("catalogId", catalogId).append("partitionInput", partitionInput).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(partitionInput).append(catalogId).append(databaseName).append(tableName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Partition) == false) {
            return false;
        }
        Partition rhs = ((Partition) other);
        return new EqualsBuilder().append(partitionInput, rhs.partitionInput).append(catalogId, rhs.catalogId).append(databaseName, rhs.databaseName).append(tableName, rhs.tableName).isEquals();
    }

}
