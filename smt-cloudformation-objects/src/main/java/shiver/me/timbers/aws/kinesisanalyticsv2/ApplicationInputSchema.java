
package shiver.me.timbers.aws.kinesisanalyticsv2;

import java.util.ArrayList;
import java.util.List;
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
 * ApplicationInputSchema
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RecordEncoding",
    "RecordColumns",
    "RecordFormat"
})
public class ApplicationInputSchema implements Property<ApplicationInputSchema>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding
     * 
     */
    @JsonProperty("RecordEncoding")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding")
    private CharSequence recordEncoding;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns
     * 
     */
    @JsonProperty("RecordColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns")
    private List<Property<ApplicationRecordColumn>> recordColumns = new ArrayList<Property<ApplicationRecordColumn>>();
    /**
     * ApplicationReferenceDataSourceRecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonProperty("RecordFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html")
    private Property<ApplicationRecordFormat> recordFormat;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding
     * 
     */
    @JsonIgnore
    public CharSequence getRecordEncoding() {
        return recordEncoding;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordencoding
     * 
     */
    @JsonIgnore
    public void setRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
    }

    public ApplicationInputSchema withRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns
     * 
     */
    @JsonIgnore
    public List<Property<ApplicationRecordColumn>> getRecordColumns() {
        return recordColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns
     * 
     */
    @JsonIgnore
    public void setRecordColumns(List<Property<ApplicationRecordColumn>> recordColumns) {
        this.recordColumns = recordColumns;
    }

    public ApplicationInputSchema withRecordColumns(List<Property<ApplicationRecordColumn>> recordColumns) {
        this.recordColumns = recordColumns;
        return this;
    }

    /**
     * ApplicationReferenceDataSourceRecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonIgnore
    public Property<ApplicationRecordFormat> getRecordFormat() {
        return recordFormat;
    }

    /**
     * ApplicationReferenceDataSourceRecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonIgnore
    public void setRecordFormat(Property<ApplicationRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
    }

    public ApplicationInputSchema withRecordFormat(Property<ApplicationRecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recordEncoding", recordEncoding).append("recordColumns", recordColumns).append("recordFormat", recordFormat).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordFormat).append(recordEncoding).append(recordColumns).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationInputSchema) == false) {
            return false;
        }
        ApplicationInputSchema rhs = ((ApplicationInputSchema) other);
        return new EqualsBuilder().append(recordFormat, rhs.recordFormat).append(recordEncoding, rhs.recordEncoding).append(recordColumns, rhs.recordColumns).isEquals();
    }

}
