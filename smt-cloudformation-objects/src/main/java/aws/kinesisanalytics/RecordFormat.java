
package aws.kinesisanalytics;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * RecordFormat
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "MappingParameters",
    "RecordFormatType"
})
public class RecordFormat {

    /**
     * MappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html
     * 
     */
    @JsonProperty("MappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html")
    private MappingParameters mappingParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype
     * 
     */
    @JsonProperty("RecordFormatType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype")
    private CharSequence recordFormatType;

    /**
     * MappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html
     * 
     */
    public MappingParameters getMappingParameters() {
        return mappingParameters;
    }

    /**
     * MappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-mappingparameters.html
     * 
     */
    public void setMappingParameters(MappingParameters mappingParameters) {
        this.mappingParameters = mappingParameters;
    }

    public RecordFormat withMappingParameters(MappingParameters mappingParameters) {
        this.mappingParameters = mappingParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype
     * 
     */
    public CharSequence getRecordFormatType() {
        return recordFormatType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype
     * 
     */
    public void setRecordFormatType(CharSequence recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    public RecordFormat withRecordFormatType(CharSequence recordFormatType) {
        this.recordFormatType = recordFormatType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mappingParameters", mappingParameters).append("recordFormatType", recordFormatType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordFormatType).append(mappingParameters).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RecordFormat) == false) {
            return false;
        }
        RecordFormat rhs = ((RecordFormat) other);
        return new EqualsBuilder().append(recordFormatType, rhs.recordFormatType).append(mappingParameters, rhs.mappingParameters).isEquals();
    }

}
