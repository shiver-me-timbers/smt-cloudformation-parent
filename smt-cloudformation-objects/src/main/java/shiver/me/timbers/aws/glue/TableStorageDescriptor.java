
package shiver.me.timbers.aws.glue;

import java.util.ArrayList;
import java.util.List;
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
 * TableStorageDescriptor
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "StoredAsSubDirectories",
    "Parameters",
    "BucketColumns",
    "SkewedInfo",
    "InputFormat",
    "NumberOfBuckets",
    "OutputFormat",
    "Columns",
    "SerdeInfo",
    "SortColumns",
    "Compressed",
    "Location"
})
public class TableStorageDescriptor implements Property<TableStorageDescriptor>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories
     * 
     */
    @JsonProperty("StoredAsSubDirectories")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories")
    private CharSequence storedAsSubDirectories;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters")
    private Object parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns
     * 
     */
    @JsonProperty("BucketColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns")
    private List<CharSequence> bucketColumns = new ArrayList<CharSequence>();
    /**
     * TableSkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
     * 
     */
    @JsonProperty("SkewedInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html")
    private Property<TableSkewedInfo> skewedInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat
     * 
     */
    @JsonProperty("InputFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat")
    private CharSequence inputFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets
     * 
     */
    @JsonProperty("NumberOfBuckets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets")
    private Number numberOfBuckets;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat
     * 
     */
    @JsonProperty("OutputFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat")
    private CharSequence outputFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns
     * 
     */
    @JsonProperty("Columns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns")
    private List<Property<TableColumn>> columns = new ArrayList<Property<TableColumn>>();
    /**
     * TableSerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html
     * 
     */
    @JsonProperty("SerdeInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html")
    private Property<TableSerdeInfo> serdeInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns
     * 
     */
    @JsonProperty("SortColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns")
    private List<Property<TableOrder>> sortColumns = new ArrayList<Property<TableOrder>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed
     * 
     */
    @JsonProperty("Compressed")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed")
    private CharSequence compressed;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location")
    private CharSequence location;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories
     * 
     */
    @JsonIgnore
    public CharSequence getStoredAsSubDirectories() {
        return storedAsSubDirectories;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-storedassubdirectories
     * 
     */
    @JsonIgnore
    public void setStoredAsSubDirectories(CharSequence storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    public TableStorageDescriptor withStoredAsSubDirectories(CharSequence storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters
     * 
     */
    @JsonIgnore
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public TableStorageDescriptor withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getBucketColumns() {
        return bucketColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-bucketcolumns
     * 
     */
    @JsonIgnore
    public void setBucketColumns(List<CharSequence> bucketColumns) {
        this.bucketColumns = bucketColumns;
    }

    public TableStorageDescriptor withBucketColumns(List<CharSequence> bucketColumns) {
        this.bucketColumns = bucketColumns;
        return this;
    }

    /**
     * TableSkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
     * 
     */
    @JsonIgnore
    public Property<TableSkewedInfo> getSkewedInfo() {
        return skewedInfo;
    }

    /**
     * TableSkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
     * 
     */
    @JsonIgnore
    public void setSkewedInfo(Property<TableSkewedInfo> skewedInfo) {
        this.skewedInfo = skewedInfo;
    }

    public TableStorageDescriptor withSkewedInfo(Property<TableSkewedInfo> skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat
     * 
     */
    @JsonIgnore
    public CharSequence getInputFormat() {
        return inputFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-inputformat
     * 
     */
    @JsonIgnore
    public void setInputFormat(CharSequence inputFormat) {
        this.inputFormat = inputFormat;
    }

    public TableStorageDescriptor withInputFormat(CharSequence inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets
     * 
     */
    @JsonIgnore
    public Number getNumberOfBuckets() {
        return numberOfBuckets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-numberofbuckets
     * 
     */
    @JsonIgnore
    public void setNumberOfBuckets(Number numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    public TableStorageDescriptor withNumberOfBuckets(Number numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat
     * 
     */
    @JsonIgnore
    public CharSequence getOutputFormat() {
        return outputFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-outputformat
     * 
     */
    @JsonIgnore
    public void setOutputFormat(CharSequence outputFormat) {
        this.outputFormat = outputFormat;
    }

    public TableStorageDescriptor withOutputFormat(CharSequence outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns
     * 
     */
    @JsonIgnore
    public List<Property<TableColumn>> getColumns() {
        return columns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-columns
     * 
     */
    @JsonIgnore
    public void setColumns(List<Property<TableColumn>> columns) {
        this.columns = columns;
    }

    public TableStorageDescriptor withColumns(List<Property<TableColumn>> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * TableSerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html
     * 
     */
    @JsonIgnore
    public Property<TableSerdeInfo> getSerdeInfo() {
        return serdeInfo;
    }

    /**
     * TableSerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-serdeinfo.html
     * 
     */
    @JsonIgnore
    public void setSerdeInfo(Property<TableSerdeInfo> serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    public TableStorageDescriptor withSerdeInfo(Property<TableSerdeInfo> serdeInfo) {
        this.serdeInfo = serdeInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns
     * 
     */
    @JsonIgnore
    public List<Property<TableOrder>> getSortColumns() {
        return sortColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-sortcolumns
     * 
     */
    @JsonIgnore
    public void setSortColumns(List<Property<TableOrder>> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public TableStorageDescriptor withSortColumns(List<Property<TableOrder>> sortColumns) {
        this.sortColumns = sortColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed
     * 
     */
    @JsonIgnore
    public CharSequence getCompressed() {
        return compressed;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-compressed
     * 
     */
    @JsonIgnore
    public void setCompressed(CharSequence compressed) {
        this.compressed = compressed;
    }

    public TableStorageDescriptor withCompressed(CharSequence compressed) {
        this.compressed = compressed;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location
     * 
     */
    @JsonIgnore
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-storagedescriptor.html#cfn-glue-table-storagedescriptor-location
     * 
     */
    @JsonIgnore
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public TableStorageDescriptor withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("storedAsSubDirectories", storedAsSubDirectories).append("parameters", parameters).append("bucketColumns", bucketColumns).append("skewedInfo", skewedInfo).append("inputFormat", inputFormat).append("numberOfBuckets", numberOfBuckets).append("outputFormat", outputFormat).append("columns", columns).append("serdeInfo", serdeInfo).append("sortColumns", sortColumns).append("compressed", compressed).append("location", location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(skewedInfo).append(columns).append(bucketColumns).append(inputFormat).append(numberOfBuckets).append(sortColumns).append(storedAsSubDirectories).append(location).append(compressed).append(parameters).append(outputFormat).append(serdeInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableStorageDescriptor) == false) {
            return false;
        }
        TableStorageDescriptor rhs = ((TableStorageDescriptor) other);
        return new EqualsBuilder().append(skewedInfo, rhs.skewedInfo).append(columns, rhs.columns).append(bucketColumns, rhs.bucketColumns).append(inputFormat, rhs.inputFormat).append(numberOfBuckets, rhs.numberOfBuckets).append(sortColumns, rhs.sortColumns).append(storedAsSubDirectories, rhs.storedAsSubDirectories).append(location, rhs.location).append(compressed, rhs.compressed).append(parameters, rhs.parameters).append(outputFormat, rhs.outputFormat).append(serdeInfo, rhs.serdeInfo).isEquals();
    }

}
