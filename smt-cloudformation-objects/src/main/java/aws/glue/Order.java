
package aws.glue;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Order
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Column",
    "SortOrder"
})
public class Order {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column
     * 
     */
    @JsonProperty("Column")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column")
    private CharSequence column;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder
     * 
     */
    @JsonProperty("SortOrder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder")
    private Integer sortOrder;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column
     * 
     */
    public CharSequence getColumn() {
        return column;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column
     * 
     */
    public void setColumn(CharSequence column) {
        this.column = column;
    }

    public Order withColumn(CharSequence column) {
        this.column = column;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder
     * 
     */
    public Integer getSortOrder() {
        return sortOrder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder
     * 
     */
    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public Order withSortOrder(Integer sortOrder) {
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
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return new EqualsBuilder().append(column, rhs.column).append(sortOrder, rhs.sortOrder).isEquals();
    }

}
