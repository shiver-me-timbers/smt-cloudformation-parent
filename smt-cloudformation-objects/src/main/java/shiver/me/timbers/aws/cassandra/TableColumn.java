
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
 * TableColumn
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ColumnName",
    "ColumnType"
})
public class TableColumn implements Property<TableColumn>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columnname
     * 
     */
    @JsonProperty("ColumnName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columnname")
    private CharSequence columnName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columntype
     * 
     */
    @JsonProperty("ColumnType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columntype")
    private CharSequence columnType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columnname
     * 
     */
    @JsonIgnore
    public CharSequence getColumnName() {
        return columnName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columnname
     * 
     */
    @JsonIgnore
    public void setColumnName(CharSequence columnName) {
        this.columnName = columnName;
    }

    public TableColumn withColumnName(CharSequence columnName) {
        this.columnName = columnName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columntype
     * 
     */
    @JsonIgnore
    public CharSequence getColumnType() {
        return columnType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html#cfn-cassandra-table-column-columntype
     * 
     */
    @JsonIgnore
    public void setColumnType(CharSequence columnType) {
        this.columnType = columnType;
    }

    public TableColumn withColumnType(CharSequence columnType) {
        this.columnType = columnType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("columnName", columnName).append("columnType", columnType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(columnType).append(columnName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableColumn) == false) {
            return false;
        }
        TableColumn rhs = ((TableColumn) other);
        return new EqualsBuilder().append(columnType, rhs.columnType).append(columnName, rhs.columnName).isEquals();
    }

}
