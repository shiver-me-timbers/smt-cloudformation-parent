
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
 * PartitionOrder
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Column",
    "SortOrder"
})
public class PartitionOrder implements Property<PartitionOrder>
{

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
    private Number sortOrder;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column
     * 
     */
    @JsonIgnore
    public CharSequence getColumn() {
        return column;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-column
     * 
     */
    @JsonIgnore
    public void setColumn(CharSequence column) {
        this.column = column;
    }

    public PartitionOrder withColumn(CharSequence column) {
        this.column = column;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder
     * 
     */
    @JsonIgnore
    public Number getSortOrder() {
        return sortOrder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-order.html#cfn-glue-partition-order-sortorder
     * 
     */
    @JsonIgnore
    public void setSortOrder(Number sortOrder) {
        this.sortOrder = sortOrder;
    }

    public PartitionOrder withSortOrder(Number sortOrder) {
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
        if ((other instanceof PartitionOrder) == false) {
            return false;
        }
        PartitionOrder rhs = ((PartitionOrder) other);
        return new EqualsBuilder().append(column, rhs.column).append(sortOrder, rhs.sortOrder).isEquals();
    }

}
