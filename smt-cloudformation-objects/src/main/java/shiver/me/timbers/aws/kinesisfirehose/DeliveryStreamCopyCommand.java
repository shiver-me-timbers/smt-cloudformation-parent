
package shiver.me.timbers.aws.kinesisfirehose;

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
 * DeliveryStreamCopyCommand
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CopyOptions",
    "DataTableColumns",
    "DataTableName"
})
public class DeliveryStreamCopyCommand implements Property<DeliveryStreamCopyCommand>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions
     * 
     */
    @JsonProperty("CopyOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions")
    private CharSequence copyOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns
     * 
     */
    @JsonProperty("DataTableColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns")
    private CharSequence dataTableColumns;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename
     * 
     */
    @JsonProperty("DataTableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename")
    private CharSequence dataTableName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions
     * 
     */
    @JsonIgnore
    public CharSequence getCopyOptions() {
        return copyOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions
     * 
     */
    @JsonIgnore
    public void setCopyOptions(CharSequence copyOptions) {
        this.copyOptions = copyOptions;
    }

    public DeliveryStreamCopyCommand withCopyOptions(CharSequence copyOptions) {
        this.copyOptions = copyOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns
     * 
     */
    @JsonIgnore
    public CharSequence getDataTableColumns() {
        return dataTableColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns
     * 
     */
    @JsonIgnore
    public void setDataTableColumns(CharSequence dataTableColumns) {
        this.dataTableColumns = dataTableColumns;
    }

    public DeliveryStreamCopyCommand withDataTableColumns(CharSequence dataTableColumns) {
        this.dataTableColumns = dataTableColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename
     * 
     */
    @JsonIgnore
    public CharSequence getDataTableName() {
        return dataTableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename
     * 
     */
    @JsonIgnore
    public void setDataTableName(CharSequence dataTableName) {
        this.dataTableName = dataTableName;
    }

    public DeliveryStreamCopyCommand withDataTableName(CharSequence dataTableName) {
        this.dataTableName = dataTableName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("copyOptions", copyOptions).append("dataTableColumns", dataTableColumns).append("dataTableName", dataTableName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataTableColumns).append(dataTableName).append(copyOptions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryStreamCopyCommand) == false) {
            return false;
        }
        DeliveryStreamCopyCommand rhs = ((DeliveryStreamCopyCommand) other);
        return new EqualsBuilder().append(dataTableColumns, rhs.dataTableColumns).append(dataTableName, rhs.dataTableName).append(copyOptions, rhs.copyOptions).isEquals();
    }

}
