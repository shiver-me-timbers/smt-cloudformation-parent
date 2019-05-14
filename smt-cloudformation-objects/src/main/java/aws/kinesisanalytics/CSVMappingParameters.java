
package aws.kinesisanalytics;

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
 * CSVMappingParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RecordRowDelimiter",
    "RecordColumnDelimiter"
})
public class CSVMappingParameters implements Property<CSVMappingParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter
     * 
     */
    @JsonProperty("RecordRowDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter")
    private CharSequence recordRowDelimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter
     * 
     */
    @JsonProperty("RecordColumnDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter")
    private CharSequence recordColumnDelimiter;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter
     * 
     */
    @JsonIgnore
    public CharSequence getRecordRowDelimiter() {
        return recordRowDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordrowdelimiter
     * 
     */
    @JsonIgnore
    public void setRecordRowDelimiter(CharSequence recordRowDelimiter) {
        this.recordRowDelimiter = recordRowDelimiter;
    }

    public CSVMappingParameters withRecordRowDelimiter(CharSequence recordRowDelimiter) {
        this.recordRowDelimiter = recordRowDelimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter
     * 
     */
    @JsonIgnore
    public CharSequence getRecordColumnDelimiter() {
        return recordColumnDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-csvmappingparameters.html#cfn-kinesisanalytics-application-csvmappingparameters-recordcolumndelimiter
     * 
     */
    @JsonIgnore
    public void setRecordColumnDelimiter(CharSequence recordColumnDelimiter) {
        this.recordColumnDelimiter = recordColumnDelimiter;
    }

    public CSVMappingParameters withRecordColumnDelimiter(CharSequence recordColumnDelimiter) {
        this.recordColumnDelimiter = recordColumnDelimiter;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recordRowDelimiter", recordRowDelimiter).append("recordColumnDelimiter", recordColumnDelimiter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordColumnDelimiter).append(recordRowDelimiter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CSVMappingParameters) == false) {
            return false;
        }
        CSVMappingParameters rhs = ((CSVMappingParameters) other);
        return new EqualsBuilder().append(recordColumnDelimiter, rhs.recordColumnDelimiter).append(recordRowDelimiter, rhs.recordRowDelimiter).isEquals();
    }

}
