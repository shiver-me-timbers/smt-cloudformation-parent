
package aws.kinesisanalyticsv2;

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
 * ApplicationRecordFormat
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MappingParameters",
    "RecordFormatType"
})
public class ApplicationRecordFormat implements Property<ApplicationRecordFormat>
{

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonProperty("MappingParameters")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html")
    private Property<ApplicationMappingParameters> mappingParameters;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype
     * 
     */
    @JsonProperty("RecordFormatType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype")
    private CharSequence recordFormatType;

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationMappingParameters> getMappingParameters() {
        return mappingParameters;
    }

    /**
     * ApplicationReferenceDataSourceJSONMappingParameters
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html
     * 
     */
    @JsonIgnore
    public void setMappingParameters(Property<ApplicationMappingParameters> mappingParameters) {
        this.mappingParameters = mappingParameters;
    }

    public ApplicationRecordFormat withMappingParameters(Property<ApplicationMappingParameters> mappingParameters) {
        this.mappingParameters = mappingParameters;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype
     * 
     */
    @JsonIgnore
    public CharSequence getRecordFormatType() {
        return recordFormatType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-recordformat.html#cfn-kinesisanalyticsv2-application-recordformat-recordformattype
     * 
     */
    @JsonIgnore
    public void setRecordFormatType(CharSequence recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    public ApplicationRecordFormat withRecordFormatType(CharSequence recordFormatType) {
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
        if ((other instanceof ApplicationRecordFormat) == false) {
            return false;
        }
        ApplicationRecordFormat rhs = ((ApplicationRecordFormat) other);
        return new EqualsBuilder().append(recordFormatType, rhs.recordFormatType).append(mappingParameters, rhs.mappingParameters).isEquals();
    }

}
