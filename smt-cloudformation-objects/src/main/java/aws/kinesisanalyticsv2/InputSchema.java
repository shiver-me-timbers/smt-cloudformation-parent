
package aws.kinesisanalyticsv2;

import java.util.ArrayList;
import java.util.List;
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
 * InputSchema
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
public class InputSchema implements Property<InputSchema>
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
    private List<Property<RecordColumn>> recordColumns = new ArrayList<Property<RecordColumn>>();
    /**
     * RecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonProperty("RecordFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html")
    private Property<RecordFormat> recordFormat;

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

    public InputSchema withRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns
     * 
     */
    @JsonIgnore
    public List<Property<RecordColumn>> getRecordColumns() {
        return recordColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-inputschema.html#cfn-kinesisanalyticsv2-application-inputschema-recordcolumns
     * 
     */
    @JsonIgnore
    public void setRecordColumns(List<Property<RecordColumn>> recordColumns) {
        this.recordColumns = recordColumns;
    }

    public InputSchema withRecordColumns(List<Property<RecordColumn>> recordColumns) {
        this.recordColumns = recordColumns;
        return this;
    }

    /**
     * RecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonIgnore
    public Property<RecordFormat> getRecordFormat() {
        return recordFormat;
    }

    /**
     * RecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonIgnore
    public void setRecordFormat(Property<RecordFormat> recordFormat) {
        this.recordFormat = recordFormat;
    }

    public InputSchema withRecordFormat(Property<RecordFormat> recordFormat) {
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
        if ((other instanceof InputSchema) == false) {
            return false;
        }
        InputSchema rhs = ((InputSchema) other);
        return new EqualsBuilder().append(recordFormat, rhs.recordFormat).append(recordEncoding, rhs.recordEncoding).append(recordColumns, rhs.recordColumns).isEquals();
    }

}