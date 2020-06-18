
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
 * TableBillingMode
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Mode",
    "ProvisionedThroughput"
})
public class TableBillingMode implements Property<TableBillingMode>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-mode
     * 
     */
    @JsonProperty("Mode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-mode")
    private CharSequence mode;
    /**
     * TableProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html
     * 
     */
    @JsonProperty("ProvisionedThroughput")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html")
    private Property<TableProvisionedThroughput> provisionedThroughput;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-mode
     * 
     */
    @JsonIgnore
    public CharSequence getMode() {
        return mode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-billingmode.html#cfn-cassandra-table-billingmode-mode
     * 
     */
    @JsonIgnore
    public void setMode(CharSequence mode) {
        this.mode = mode;
    }

    public TableBillingMode withMode(CharSequence mode) {
        this.mode = mode;
        return this;
    }

    /**
     * TableProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html
     * 
     */
    @JsonIgnore
    public Property<TableProvisionedThroughput> getProvisionedThroughput() {
        return provisionedThroughput;
    }

    /**
     * TableProvisionedThroughput
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-provisionedthroughput.html
     * 
     */
    @JsonIgnore
    public void setProvisionedThroughput(Property<TableProvisionedThroughput> provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
    }

    public TableBillingMode withProvisionedThroughput(Property<TableProvisionedThroughput> provisionedThroughput) {
        this.provisionedThroughput = provisionedThroughput;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mode", mode).append("provisionedThroughput", provisionedThroughput).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mode).append(provisionedThroughput).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableBillingMode) == false) {
            return false;
        }
        TableBillingMode rhs = ((TableBillingMode) other);
        return new EqualsBuilder().append(mode, rhs.mode).append(provisionedThroughput, rhs.provisionedThroughput).isEquals();
    }

}
