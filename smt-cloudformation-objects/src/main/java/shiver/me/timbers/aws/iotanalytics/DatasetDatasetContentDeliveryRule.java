
package shiver.me.timbers.aws.iotanalytics;

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
 * DatasetDatasetContentDeliveryRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Destination",
    "EntryName"
})
public class DatasetDatasetContentDeliveryRule implements Property<DatasetDatasetContentDeliveryRule>
{

    /**
     * DatasetDatasetContentDeliveryRuleDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html")
    private Property<DatasetDatasetContentDeliveryRuleDestination> destination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-entryname
     * 
     */
    @JsonProperty("EntryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-entryname")
    private CharSequence entryName;

    /**
     * DatasetDatasetContentDeliveryRuleDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html
     * 
     */
    @JsonIgnore
    public Property<DatasetDatasetContentDeliveryRuleDestination> getDestination() {
        return destination;
    }

    /**
     * DatasetDatasetContentDeliveryRuleDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryruledestination.html
     * 
     */
    @JsonIgnore
    public void setDestination(Property<DatasetDatasetContentDeliveryRuleDestination> destination) {
        this.destination = destination;
    }

    public DatasetDatasetContentDeliveryRule withDestination(Property<DatasetDatasetContentDeliveryRuleDestination> destination) {
        this.destination = destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-entryname
     * 
     */
    @JsonIgnore
    public CharSequence getEntryName() {
        return entryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-datasetcontentdeliveryrule.html#cfn-iotanalytics-dataset-datasetcontentdeliveryrule-entryname
     * 
     */
    @JsonIgnore
    public void setEntryName(CharSequence entryName) {
        this.entryName = entryName;
    }

    public DatasetDatasetContentDeliveryRule withEntryName(CharSequence entryName) {
        this.entryName = entryName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).append("entryName", entryName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destination).append(entryName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetDatasetContentDeliveryRule) == false) {
            return false;
        }
        DatasetDatasetContentDeliveryRule rhs = ((DatasetDatasetContentDeliveryRule) other);
        return new EqualsBuilder().append(destination, rhs.destination).append(entryName, rhs.entryName).isEquals();
    }

}
