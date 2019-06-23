
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
 * DatasetOutputFileUriValue
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FileName"
})
public class DatasetOutputFileUriValue implements Property<DatasetOutputFileUriValue>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html#cfn-iotanalytics-dataset-variable-outputfileurivalue-filename
     * 
     */
    @JsonProperty("FileName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html#cfn-iotanalytics-dataset-variable-outputfileurivalue-filename")
    private CharSequence fileName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html#cfn-iotanalytics-dataset-variable-outputfileurivalue-filename
     * 
     */
    @JsonIgnore
    public CharSequence getFileName() {
        return fileName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html#cfn-iotanalytics-dataset-variable-outputfileurivalue-filename
     * 
     */
    @JsonIgnore
    public void setFileName(CharSequence fileName) {
        this.fileName = fileName;
    }

    public DatasetOutputFileUriValue withFileName(CharSequence fileName) {
        this.fileName = fileName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("fileName", fileName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fileName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetOutputFileUriValue) == false) {
            return false;
        }
        DatasetOutputFileUriValue rhs = ((DatasetOutputFileUriValue) other);
        return new EqualsBuilder().append(fileName, rhs.fileName).isEquals();
    }

}
