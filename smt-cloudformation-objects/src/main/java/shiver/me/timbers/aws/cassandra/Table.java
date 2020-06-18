
package shiver.me.timbers.aws.cassandra;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * Table
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "KeyspaceName",
    "TableName",
    "RegularColumns",
    "PartitionKeyColumns",
    "ClusteringKeyColumns",
    "BillingMode"
})
public class Table {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename
     * 
     */
    @JsonProperty("KeyspaceName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename")
    private CharSequence keyspaceName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename
     * 
     */
    @JsonProperty("TableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename")
    private CharSequence tableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns
     * 
     */
    @JsonProperty("RegularColumns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns")
    private Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> regularColumns = new LinkedHashSet<Property<shiver.me.timbers.aws.cassandra.TableColumn>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns
     * 
     */
    @JsonProperty("PartitionKeyColumns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns")
    private Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> partitionKeyColumns = new LinkedHashSet<Property<shiver.me.timbers.aws.cassandra.TableColumn>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns
     * 
     */
    @JsonProperty("ClusteringKeyColumns")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns")
    private Set<Property<TableClusteringKeyColumn>> clusteringKeyColumns = new LinkedHashSet<Property<TableClusteringKeyColumn>>();
    /**
     * TableBillingMode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html
     * 
     */
    @JsonProperty("BillingMode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html")
    private Property<TableBillingMode> billingMode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename
     * 
     */
    @JsonIgnore
    public CharSequence getKeyspaceName() {
        return keyspaceName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-keyspacename
     * 
     */
    @JsonIgnore
    public void setKeyspaceName(CharSequence keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    public Table withKeyspaceName(CharSequence keyspaceName) {
        this.keyspaceName = keyspaceName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename
     * 
     */
    @JsonIgnore
    public CharSequence getTableName() {
        return tableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-tablename
     * 
     */
    @JsonIgnore
    public void setTableName(CharSequence tableName) {
        this.tableName = tableName;
    }

    public Table withTableName(CharSequence tableName) {
        this.tableName = tableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns
     * 
     */
    @JsonIgnore
    public Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> getRegularColumns() {
        return regularColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-regularcolumns
     * 
     */
    @JsonIgnore
    public void setRegularColumns(Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> regularColumns) {
        this.regularColumns = regularColumns;
    }

    public Table withRegularColumns(Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> regularColumns) {
        this.regularColumns = regularColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns
     * 
     */
    @JsonIgnore
    public Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> getPartitionKeyColumns() {
        return partitionKeyColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-partitionkeycolumns
     * 
     */
    @JsonIgnore
    public void setPartitionKeyColumns(Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> partitionKeyColumns) {
        this.partitionKeyColumns = partitionKeyColumns;
    }

    public Table withPartitionKeyColumns(Set<Property<shiver.me.timbers.aws.cassandra.TableColumn>> partitionKeyColumns) {
        this.partitionKeyColumns = partitionKeyColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns
     * 
     */
    @JsonIgnore
    public Set<Property<TableClusteringKeyColumn>> getClusteringKeyColumns() {
        return clusteringKeyColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cassandra-table.html#cfn-cassandra-table-clusteringkeycolumns
     * 
     */
    @JsonIgnore
    public void setClusteringKeyColumns(Set<Property<TableClusteringKeyColumn>> clusteringKeyColumns) {
        this.clusteringKeyColumns = clusteringKeyColumns;
    }

    public Table withClusteringKeyColumns(Set<Property<TableClusteringKeyColumn>> clusteringKeyColumns) {
        this.clusteringKeyColumns = clusteringKeyColumns;
        return this;
    }

    /**
     * TableBillingMode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html
     * 
     */
    @JsonIgnore
    public Property<TableBillingMode> getBillingMode() {
        return billingMode;
    }

    /**
     * TableBillingMode
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html
     * 
     */
    @JsonIgnore
    public void setBillingMode(Property<TableBillingMode> billingMode) {
        this.billingMode = billingMode;
    }

    public Table withBillingMode(Property<TableBillingMode> billingMode) {
        this.billingMode = billingMode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("keyspaceName", keyspaceName).append("tableName", tableName).append("regularColumns", regularColumns).append("partitionKeyColumns", partitionKeyColumns).append("clusteringKeyColumns", clusteringKeyColumns).append("billingMode", billingMode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(keyspaceName).append(billingMode).append(partitionKeyColumns).append(regularColumns).append(clusteringKeyColumns).append(tableName).toHashCode();
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
        return new EqualsBuilder().append(keyspaceName, rhs.keyspaceName).append(billingMode, rhs.billingMode).append(partitionKeyColumns, rhs.partitionKeyColumns).append(regularColumns, rhs.regularColumns).append(clusteringKeyColumns, rhs.clusteringKeyColumns).append(tableName, rhs.tableName).isEquals();
    }

}
