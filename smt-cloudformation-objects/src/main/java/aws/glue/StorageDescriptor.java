
package aws.glue;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StorageDescriptor
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
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
public class StorageDescriptor {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories
     * 
     */
    @JsonProperty("StoredAsSubDirectories")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories")
    private Boolean storedAsSubDirectories;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters")
    private Object parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns
     * 
     */
    @JsonProperty("BucketColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns")
    private List<CharSequence> bucketColumns = new ArrayList<CharSequence>();
    /**
     * SkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
     * 
     */
    @JsonProperty("SkewedInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html")
    private SkewedInfo skewedInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat
     * 
     */
    @JsonProperty("InputFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat")
    private CharSequence inputFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets
     * 
     */
    @JsonProperty("NumberOfBuckets")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets")
    private Integer numberOfBuckets;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat
     * 
     */
    @JsonProperty("OutputFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat")
    private CharSequence outputFormat;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns
     * 
     */
    @JsonProperty("Columns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns")
    private List<Column> columns = new ArrayList<Column>();
    /**
     * SerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
     * 
     */
    @JsonProperty("SerdeInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html")
    private SerdeInfo serdeInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns
     * 
     */
    @JsonProperty("SortColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns")
    private List<Order> sortColumns = new ArrayList<Order>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed
     * 
     */
    @JsonProperty("Compressed")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed")
    private Boolean compressed;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location")
    private CharSequence location;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories
     * 
     */
    public Boolean getStoredAsSubDirectories() {
        return storedAsSubDirectories;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories
     * 
     */
    public void setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    public StorageDescriptor withStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters
     * 
     */
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters
     * 
     */
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public StorageDescriptor withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns
     * 
     */
    public List<CharSequence> getBucketColumns() {
        return bucketColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns
     * 
     */
    public void setBucketColumns(List<CharSequence> bucketColumns) {
        this.bucketColumns = bucketColumns;
    }

    public StorageDescriptor withBucketColumns(List<CharSequence> bucketColumns) {
        this.bucketColumns = bucketColumns;
        return this;
    }

    /**
     * SkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
     * 
     */
    public SkewedInfo getSkewedInfo() {
        return skewedInfo;
    }

    /**
     * SkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-skewedinfo.html
     * 
     */
    public void setSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
    }

    public StorageDescriptor withSkewedInfo(SkewedInfo skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat
     * 
     */
    public CharSequence getInputFormat() {
        return inputFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat
     * 
     */
    public void setInputFormat(CharSequence inputFormat) {
        this.inputFormat = inputFormat;
    }

    public StorageDescriptor withInputFormat(CharSequence inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets
     * 
     */
    public Integer getNumberOfBuckets() {
        return numberOfBuckets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets
     * 
     */
    public void setNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    public StorageDescriptor withNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat
     * 
     */
    public CharSequence getOutputFormat() {
        return outputFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat
     * 
     */
    public void setOutputFormat(CharSequence outputFormat) {
        this.outputFormat = outputFormat;
    }

    public StorageDescriptor withOutputFormat(CharSequence outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns
     * 
     */
    public List<Column> getColumns() {
        return columns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns
     * 
     */
    public void setColumns(List<Column> columns) {
        this.columns = columns;
    }

    public StorageDescriptor withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * SerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
     * 
     */
    public SerdeInfo getSerdeInfo() {
        return serdeInfo;
    }

    /**
     * SerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
     * 
     */
    public void setSerdeInfo(SerdeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    public StorageDescriptor withSerdeInfo(SerdeInfo serdeInfo) {
        this.serdeInfo = serdeInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns
     * 
     */
    public List<Order> getSortColumns() {
        return sortColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns
     * 
     */
    public void setSortColumns(List<Order> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public StorageDescriptor withSortColumns(List<Order> sortColumns) {
        this.sortColumns = sortColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed
     * 
     */
    public Boolean getCompressed() {
        return compressed;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed
     * 
     */
    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    public StorageDescriptor withCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location
     * 
     */
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location
     * 
     */
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public StorageDescriptor withLocation(CharSequence location) {
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
        if ((other instanceof StorageDescriptor) == false) {
            return false;
        }
        StorageDescriptor rhs = ((StorageDescriptor) other);
        return new EqualsBuilder().append(skewedInfo, rhs.skewedInfo).append(columns, rhs.columns).append(bucketColumns, rhs.bucketColumns).append(inputFormat, rhs.inputFormat).append(numberOfBuckets, rhs.numberOfBuckets).append(sortColumns, rhs.sortColumns).append(storedAsSubDirectories, rhs.storedAsSubDirectories).append(location, rhs.location).append(compressed, rhs.compressed).append(parameters, rhs.parameters).append(outputFormat, rhs.outputFormat).append(serdeInfo, rhs.serdeInfo).isEquals();
    }

}
