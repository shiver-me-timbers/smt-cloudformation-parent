
package aws.iotanalytics;

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
 * DatasetDatasetContentVersionValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DatasetName"
})
public class DatasetDatasetContentVersionValue implements Property<DatasetDatasetContentVersionValue>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html#cfn-iotanalytics-dataset-variable-datasetcontentversionvalue-datasetname
     * 
     */
    @JsonProperty("DatasetName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html#cfn-iotanalytics-dataset-variable-datasetcontentversionvalue-datasetname")
    private CharSequence datasetName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html#cfn-iotanalytics-dataset-variable-datasetcontentversionvalue-datasetname
     * 
     */
    @JsonIgnore
    public CharSequence getDatasetName() {
        return datasetName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html#cfn-iotanalytics-dataset-variable-datasetcontentversionvalue-datasetname
     * 
     */
    @JsonIgnore
    public void setDatasetName(CharSequence datasetName) {
        this.datasetName = datasetName;
    }

    public DatasetDatasetContentVersionValue withDatasetName(CharSequence datasetName) {
        this.datasetName = datasetName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("datasetName", datasetName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(datasetName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetDatasetContentVersionValue) == false) {
            return false;
        }
        DatasetDatasetContentVersionValue rhs = ((DatasetDatasetContentVersionValue) other);
        return new EqualsBuilder().append(datasetName, rhs.datasetName).isEquals();
    }

}
