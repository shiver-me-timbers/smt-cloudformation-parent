
package aws.kinesisanalytics;

import aws.Property;
import aws.kinesisanalyticsv2.MappingParameters;
import com.fasterxml.jackson.annotation.JsonIgnore;
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MappingParameters",
    "RecordFormatType"
})
public class RecordFormat implements Property<RecordFormat>
{

    /**
     * JSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonProperty("MappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html")
    private Property<MappingParameters> mappingParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype
     * 
     */
    @JsonProperty("RecordFormatType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype")
    private CharSequence recordFormatType;

    /**
     * JSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<MappingParameters> getMappingParameters() {
        return mappingParameters;
    }

    /**
     * JSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setMappingParameters(Property<MappingParameters> mappingParameters) {
        this.mappingParameters = mappingParameters;
    }

    public RecordFormat withMappingParameters(Property<MappingParameters> mappingParameters) {
        this.mappingParameters = mappingParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype
     * 
     */
    @JsonIgnore
    public CharSequence getRecordFormatType() {
        return recordFormatType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-recordformat.html#cfn-kinesisanalytics-application-recordformat-recordformattype
     * 
     */
    @JsonIgnore
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
