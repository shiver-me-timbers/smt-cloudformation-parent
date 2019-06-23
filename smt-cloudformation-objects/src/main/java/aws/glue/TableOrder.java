
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
 * TableOrder
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Column",
    "SortOrder"
})
public class TableOrder implements Property<TableOrder>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column
     * 
     */
    @JsonProperty("Column")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column")
    private CharSequence column;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder
     * 
     */
    @JsonProperty("SortOrder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder")
    private Integer sortOrder;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column
     * 
     */
    @JsonIgnore
    public CharSequence getColumn() {
        return column;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-column
     * 
     */
    @JsonIgnore
    public void setColumn(CharSequence column) {
        this.column = column;
    }

    public TableOrder withColumn(CharSequence column) {
        this.column = column;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder
     * 
     */
    @JsonIgnore
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-order.html#cfn-glue-table-order-sortorder
     * 
     */
    @JsonIgnore
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public TableOrder withSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("column", column).append("sortOrder", sortOrder).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(column).append(sortOrder).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableOrder) == false) {
            return false;
        }
        TableOrder rhs = ((TableOrder) other);
        return new EqualsBuilder().append(column, rhs.column).append(sortOrder, rhs.sortOrder).isEquals();
    }

}
