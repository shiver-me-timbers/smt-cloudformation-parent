
package aws.kinesisfirehose;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CopyCommand
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CopyOptions",
    "DataTableColumns",
    "DataTableName"
})
public class CopyCommand {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions
     * 
     */
    @JsonProperty("CopyOptions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions")
    private String copyOptions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns
     * 
     */
    @JsonProperty("DataTableColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns")
    private String dataTableColumns;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename
     * 
     */
    @JsonProperty("DataTableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename")
    private String dataTableName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions
     * 
     */
    @JsonProperty("CopyOptions")
    public String getCopyOptions() {
        return copyOptions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-copyoptions
     * 
     */
    @JsonProperty("CopyOptions")
    public void setCopyOptions(String copyOptions) {
        this.copyOptions = copyOptions;
    }

    public CopyCommand withCopyOptions(String copyOptions) {
        this.copyOptions = copyOptions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns
     * 
     */
    @JsonProperty("DataTableColumns")
    public String getDataTableColumns() {
        return dataTableColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablecolumns
     * 
     */
    @JsonProperty("DataTableColumns")
    public void setDataTableColumns(String dataTableColumns) {
        this.dataTableColumns = dataTableColumns;
    }

    public CopyCommand withDataTableColumns(String dataTableColumns) {
        this.dataTableColumns = dataTableColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename
     * 
     */
    @JsonProperty("DataTableName")
    public String getDataTableName() {
        return dataTableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisfirehose-deliverystream-copycommand.html#cfn-kinesisfirehose-deliverystream-copycommand-datatablename
     * 
     */
    @JsonProperty("DataTableName")
    public void setDataTableName(String dataTableName) {
        this.dataTableName = dataTableName;
    }

    public CopyCommand withDataTableName(String dataTableName) {
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
        if ((other instanceof CopyCommand) == false) {
            return false;
        }
        CopyCommand rhs = ((CopyCommand) other);
        return new EqualsBuilder().append(dataTableColumns, rhs.dataTableColumns).append(dataTableName, rhs.dataTableName).append(copyOptions, rhs.copyOptions).isEquals();
    }

}
