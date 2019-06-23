
package aws.glue;

import java.util.ArrayList;
import java.util.List;
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
 * PartitionStorageDescriptor
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html
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
public class PartitionStorageDescriptor implements Property<PartitionStorageDescriptor>
{

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
     * PartitionSkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html
     * 
     */
    @JsonProperty("SkewedInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html")
    private Property<PartitionSkewedInfo> skewedInfo;
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
    private List<Property<PartitionColumn>> columns = new ArrayList<Property<PartitionColumn>>();
    /**
     * PartitionSerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
     * 
     */
    @JsonProperty("SerdeInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html")
    private Property<PartitionSerdeInfo> serdeInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns
     * 
     */
    @JsonProperty("SortColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns")
    private List<Property<PartitionOrder>> sortColumns = new ArrayList<Property<PartitionOrder>>();
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
    @JsonIgnore
    public Boolean getStoredAsSubDirectories() {
        return storedAsSubDirectories;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-storedassubdirectories
     * 
     */
    @JsonIgnore
    public void setStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
    }

    public PartitionStorageDescriptor withStoredAsSubDirectories(Boolean storedAsSubDirectories) {
        this.storedAsSubDirectories = storedAsSubDirectories;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters
     * 
     */
    @JsonIgnore
    public Object getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-parameters
     * 
     */
    @JsonIgnore
    public void setParameters(Object parameters) {
        this.parameters = parameters;
    }

    public PartitionStorageDescriptor withParameters(Object parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns
     * 
     */
    @JsonIgnore
    public List<CharSequence> getBucketColumns() {
        return bucketColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-bucketcolumns
     * 
     */
    @JsonIgnore
    public void setBucketColumns(List<CharSequence> bucketColumns) {
        this.bucketColumns = bucketColumns;
    }

    public PartitionStorageDescriptor withBucketColumns(List<CharSequence> bucketColumns) {
        this.bucketColumns = bucketColumns;
        return this;
    }

    /**
     * PartitionSkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html
     * 
     */
    @JsonIgnore
    public Property<PartitionSkewedInfo> getSkewedInfo() {
        return skewedInfo;
    }

    /**
     * PartitionSkewedInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-skewedinfo.html
     * 
     */
    @JsonIgnore
    public void setSkewedInfo(Property<PartitionSkewedInfo> skewedInfo) {
        this.skewedInfo = skewedInfo;
    }

    public PartitionStorageDescriptor withSkewedInfo(Property<PartitionSkewedInfo> skewedInfo) {
        this.skewedInfo = skewedInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat
     * 
     */
    @JsonIgnore
    public CharSequence getInputFormat() {
        return inputFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-inputformat
     * 
     */
    @JsonIgnore
    public void setInputFormat(CharSequence inputFormat) {
        this.inputFormat = inputFormat;
    }

    public PartitionStorageDescriptor withInputFormat(CharSequence inputFormat) {
        this.inputFormat = inputFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets
     * 
     */
    @JsonIgnore
    public Integer getNumberOfBuckets() {
        return numberOfBuckets;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-numberofbuckets
     * 
     */
    @JsonIgnore
    public void setNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
    }

    public PartitionStorageDescriptor withNumberOfBuckets(Integer numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat
     * 
     */
    @JsonIgnore
    public CharSequence getOutputFormat() {
        return outputFormat;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-outputformat
     * 
     */
    @JsonIgnore
    public void setOutputFormat(CharSequence outputFormat) {
        this.outputFormat = outputFormat;
    }

    public PartitionStorageDescriptor withOutputFormat(CharSequence outputFormat) {
        this.outputFormat = outputFormat;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns
     * 
     */
    @JsonIgnore
    public List<Property<PartitionColumn>> getColumns() {
        return columns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-columns
     * 
     */
    @JsonIgnore
    public void setColumns(List<Property<PartitionColumn>> columns) {
        this.columns = columns;
    }

    public PartitionStorageDescriptor withColumns(List<Property<PartitionColumn>> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * PartitionSerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
     * 
     */
    @JsonIgnore
    public Property<PartitionSerdeInfo> getSerdeInfo() {
        return serdeInfo;
    }

    /**
     * PartitionSerdeInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-serdeinfo.html
     * 
     */
    @JsonIgnore
    public void setSerdeInfo(Property<PartitionSerdeInfo> serdeInfo) {
        this.serdeInfo = serdeInfo;
    }

    public PartitionStorageDescriptor withSerdeInfo(Property<PartitionSerdeInfo> serdeInfo) {
        this.serdeInfo = serdeInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns
     * 
     */
    @JsonIgnore
    public List<Property<PartitionOrder>> getSortColumns() {
        return sortColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-sortcolumns
     * 
     */
    @JsonIgnore
    public void setSortColumns(List<Property<PartitionOrder>> sortColumns) {
        this.sortColumns = sortColumns;
    }

    public PartitionStorageDescriptor withSortColumns(List<Property<PartitionOrder>> sortColumns) {
        this.sortColumns = sortColumns;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed
     * 
     */
    @JsonIgnore
    public Boolean getCompressed() {
        return compressed;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-compressed
     * 
     */
    @JsonIgnore
    public void setCompressed(Boolean compressed) {
        this.compressed = compressed;
    }

    public PartitionStorageDescriptor withCompressed(Boolean compressed) {
        this.compressed = compressed;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location
     * 
     */
    @JsonIgnore
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html#cfn-glue-partition-storagedescriptor-location
     * 
     */
    @JsonIgnore
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public PartitionStorageDescriptor withLocation(CharSequence location) {
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
        if ((other instanceof PartitionStorageDescriptor) == false) {
            return false;
        }
        PartitionStorageDescriptor rhs = ((PartitionStorageDescriptor) other);
        return new EqualsBuilder().append(skewedInfo, rhs.skewedInfo).append(columns, rhs.columns).append(bucketColumns, rhs.bucketColumns).append(inputFormat, rhs.inputFormat).append(numberOfBuckets, rhs.numberOfBuckets).append(sortColumns, rhs.sortColumns).append(storedAsSubDirectories, rhs.storedAsSubDirectories).append(location, rhs.location).append(compressed, rhs.compressed).append(parameters, rhs.parameters).append(outputFormat, rhs.outputFormat).append(serdeInfo, rhs.serdeInfo).isEquals();
    }

}
