
package aws.iotanalytics;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Variable
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DatasetContentVersionValue",
    "DoubleValue",
    "OutputFileUriValue",
    "VariableName",
    "StringValue"
})
public class Variable {

    /**
     * DatasetContentVersionValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html
     * 
     */
    @JsonProperty("DatasetContentVersionValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html")
    private DatasetContentVersionValue datasetContentVersionValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-doublevalue
     * 
     */
    @JsonProperty("DoubleValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-doublevalue")
    private Double doubleValue;
    /**
     * OutputFileUriValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html
     * 
     */
    @JsonProperty("OutputFileUriValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html")
    private OutputFileUriValue outputFileUriValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-variablename
     * 
     */
    @JsonProperty("VariableName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-variablename")
    private CharSequence variableName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-stringvalue
     * 
     */
    @JsonProperty("StringValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-stringvalue")
    private CharSequence stringValue;

    /**
     * DatasetContentVersionValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html
     * 
     */
    @JsonIgnore
    public DatasetContentVersionValue getDatasetContentVersionValue() {
        return datasetContentVersionValue;
    }

    /**
     * DatasetContentVersionValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-datasetcontentversionvalue.html
     * 
     */
    @JsonIgnore
    public void setDatasetContentVersionValue(DatasetContentVersionValue datasetContentVersionValue) {
        this.datasetContentVersionValue = datasetContentVersionValue;
    }

    public Variable withDatasetContentVersionValue(DatasetContentVersionValue datasetContentVersionValue) {
        this.datasetContentVersionValue = datasetContentVersionValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-doublevalue
     * 
     */
    @JsonIgnore
    public Double getDoubleValue() {
        return doubleValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-doublevalue
     * 
     */
    @JsonIgnore
    public void setDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public Variable withDoubleValue(Double doubleValue) {
        this.doubleValue = doubleValue;
        return this;
    }

    /**
     * OutputFileUriValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html
     * 
     */
    @JsonIgnore
    public OutputFileUriValue getOutputFileUriValue() {
        return outputFileUriValue;
    }

    /**
     * OutputFileUriValue
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable-outputfileurivalue.html
     * 
     */
    @JsonIgnore
    public void setOutputFileUriValue(OutputFileUriValue outputFileUriValue) {
        this.outputFileUriValue = outputFileUriValue;
    }

    public Variable withOutputFileUriValue(OutputFileUriValue outputFileUriValue) {
        this.outputFileUriValue = outputFileUriValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-variablename
     * 
     */
    @JsonIgnore
    public CharSequence getVariableName() {
        return variableName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-variablename
     * 
     */
    @JsonIgnore
    public void setVariableName(CharSequence variableName) {
        this.variableName = variableName;
    }

    public Variable withVariableName(CharSequence variableName) {
        this.variableName = variableName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-stringvalue
     * 
     */
    @JsonIgnore
    public CharSequence getStringValue() {
        return stringValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-variable.html#cfn-iotanalytics-dataset-variable-stringvalue
     * 
     */
    @JsonIgnore
    public void setStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
    }

    public Variable withStringValue(CharSequence stringValue) {
        this.stringValue = stringValue;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("datasetContentVersionValue", datasetContentVersionValue).append("doubleValue", doubleValue).append("outputFileUriValue", outputFileUriValue).append("variableName", variableName).append("stringValue", stringValue).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(outputFileUriValue).append(stringValue).append(doubleValue).append(variableName).append(datasetContentVersionValue).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Variable) == false) {
            return false;
        }
        Variable rhs = ((Variable) other);
        return new EqualsBuilder().append(outputFileUriValue, rhs.outputFileUriValue).append(stringValue, rhs.stringValue).append(doubleValue, rhs.doubleValue).append(variableName, rhs.variableName).append(datasetContentVersionValue, rhs.datasetContentVersionValue).isEquals();
    }

}
