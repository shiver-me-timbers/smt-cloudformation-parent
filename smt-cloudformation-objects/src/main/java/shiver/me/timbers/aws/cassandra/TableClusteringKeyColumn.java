
package shiver.me.timbers.aws.cassandra;

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
 * TableClusteringKeyColumn
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Column",
    "OrderBy"
})
public class TableClusteringKeyColumn implements Property<TableClusteringKeyColumn>
{

    /**
     * TableColumn
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html
     * 
     */
    @JsonProperty("Column")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html")
    private Property<TableColumn> column;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-orderby
     * 
     */
    @JsonProperty("OrderBy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-orderby")
    private CharSequence orderBy;

    /**
     * TableColumn
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html
     * 
     */
    @JsonIgnore
    public Property<TableColumn> getColumn() {
        return column;
    }

    /**
     * TableColumn
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html
     * 
     */
    @JsonIgnore
    public void setColumn(Property<TableColumn> column) {
        this.column = column;
    }

    public TableClusteringKeyColumn withColumn(Property<TableColumn> column) {
        this.column = column;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-orderby
     * 
     */
    @JsonIgnore
    public CharSequence getOrderBy() {
        return orderBy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-clusteringkeycolumn.html#cfn-cassandra-table-clusteringkeycolumn-orderby
     * 
     */
    @JsonIgnore
    public void setOrderBy(CharSequence orderBy) {
        this.orderBy = orderBy;
    }

    public TableClusteringKeyColumn withOrderBy(CharSequence orderBy) {
        this.orderBy = orderBy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("column", column).append("orderBy", orderBy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(column).append(orderBy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableClusteringKeyColumn) == false) {
            return false;
        }
        TableClusteringKeyColumn rhs = ((TableClusteringKeyColumn) other);
        return new EqualsBuilder().append(column, rhs.column).append(orderBy, rhs.orderBy).isEquals();
    }

}
