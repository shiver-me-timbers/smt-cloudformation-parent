
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
 * TableInput
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Owner",
    "ViewOriginalText",
    "Description",
    "TableType",
    "Parameters",
    "ViewExpandedText",
    "StorageDescriptor",
    "PartitionKeys",
    "Retention",
    "Name"
})
public class TableInput {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner
     * 
     */
    @JsonProperty("Owner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner")
    private String owner;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext
     * 
     */
    @JsonProperty("ViewOriginalText")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext")
    private String viewOriginalText;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype
     * 
     */
    @JsonProperty("TableType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype")
    private String tableType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters
     * 
     */
    @JsonProperty("Parameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters")
    private Parameters____ parameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext
     * 
     */
    @JsonProperty("ViewExpandedText")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext")
    private String viewExpandedText;
    /**
     * StorageDescriptor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html
     * 
     */
    @JsonProperty("StorageDescriptor")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html")
    private StorageDescriptor storageDescriptor;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys
     * 
     */
    @JsonProperty("PartitionKeys")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys")
    private List<Column> partitionKeys = new ArrayList<Column>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention
     * 
     */
    @JsonProperty("Retention")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention")
    private Integer retention;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name")
    private String name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner
     * 
     */
    @JsonProperty("Owner")
    public String getOwner() {
        return owner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-owner
     * 
     */
    @JsonProperty("Owner")
    public void setOwner(String owner) {
        this.owner = owner;
    }

    public TableInput withOwner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext
     * 
     */
    @JsonProperty("ViewOriginalText")
    public String getViewOriginalText() {
        return viewOriginalText;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-vieworiginaltext
     * 
     */
    @JsonProperty("ViewOriginalText")
    public void setViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
    }

    public TableInput withViewOriginalText(String viewOriginalText) {
        this.viewOriginalText = viewOriginalText;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TableInput withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype
     * 
     */
    @JsonProperty("TableType")
    public String getTableType() {
        return tableType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-tabletype
     * 
     */
    @JsonProperty("TableType")
    public void setTableType(String tableType) {
        this.tableType = tableType;
    }

    public TableInput withTableType(String tableType) {
        this.tableType = tableType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters
     * 
     */
    @JsonProperty("Parameters")
    public Parameters____ getParameters() {
        return parameters;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-parameters
     * 
     */
    @JsonProperty("Parameters")
    public void setParameters(Parameters____ parameters) {
        this.parameters = parameters;
    }

    public TableInput withParameters(Parameters____ parameters) {
        this.parameters = parameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext
     * 
     */
    @JsonProperty("ViewExpandedText")
    public String getViewExpandedText() {
        return viewExpandedText;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-viewexpandedtext
     * 
     */
    @JsonProperty("ViewExpandedText")
    public void setViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
    }

    public TableInput withViewExpandedText(String viewExpandedText) {
        this.viewExpandedText = viewExpandedText;
        return this;
    }

    /**
     * StorageDescriptor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html
     * 
     */
    @JsonProperty("StorageDescriptor")
    public StorageDescriptor getStorageDescriptor() {
        return storageDescriptor;
    }

    /**
     * StorageDescriptor
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-partition-storagedescriptor.html
     * 
     */
    @JsonProperty("StorageDescriptor")
    public void setStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
    }

    public TableInput withStorageDescriptor(StorageDescriptor storageDescriptor) {
        this.storageDescriptor = storageDescriptor;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys
     * 
     */
    @JsonProperty("PartitionKeys")
    public List<Column> getPartitionKeys() {
        return partitionKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-partitionkeys
     * 
     */
    @JsonProperty("PartitionKeys")
    public void setPartitionKeys(List<Column> partitionKeys) {
        this.partitionKeys = partitionKeys;
    }

    public TableInput withPartitionKeys(List<Column> partitionKeys) {
        this.partitionKeys = partitionKeys;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention
     * 
     */
    @JsonProperty("Retention")
    public Integer getRetention() {
        return retention;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-retention
     * 
     */
    @JsonProperty("Retention")
    public void setRetention(Integer retention) {
        this.retention = retention;
    }

    public TableInput withRetention(Integer retention) {
        this.retention = retention;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-table-tableinput.html#cfn-glue-table-tableinput-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public TableInput withName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("owner", owner).append("viewOriginalText", viewOriginalText).append("description", description).append("tableType", tableType).append("parameters", parameters).append("viewExpandedText", viewExpandedText).append("storageDescriptor", storageDescriptor).append("partitionKeys", partitionKeys).append("retention", retention).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(owner).append(viewExpandedText).append(tableType).append(storageDescriptor).append(name).append(description).append(partitionKeys).append(parameters).append(viewOriginalText).append(retention).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TableInput) == false) {
            return false;
        }
        TableInput rhs = ((TableInput) other);
        return new EqualsBuilder().append(owner, rhs.owner).append(viewExpandedText, rhs.viewExpandedText).append(tableType, rhs.tableType).append(storageDescriptor, rhs.storageDescriptor).append(name, rhs.name).append(description, rhs.description).append(partitionKeys, rhs.partitionKeys).append(parameters, rhs.parameters).append(viewOriginalText, rhs.viewOriginalText).append(retention, rhs.retention).isEquals();
    }

}
