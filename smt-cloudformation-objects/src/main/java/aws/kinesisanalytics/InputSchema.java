
package aws.kinesisanalytics;

import java.util.ArrayList;
import java.util.List;
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
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RecordEncoding",
    "RecordColumns",
    "RecordFormat"
})
public class InputSchema {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding
     * 
     */
    @JsonProperty("RecordEncoding")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding")
    private CharSequence recordEncoding;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns
     * 
     */
    @JsonProperty("RecordColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns")
    private List<RecordColumn> recordColumns = new ArrayList<RecordColumn>();
    /**
     * RecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html
     * 
     */
    @JsonProperty("RecordFormat")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html")
    private RecordFormat recordFormat;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding
     * 
     */
    public CharSequence getRecordEncoding() {
        return recordEncoding;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordencoding
     * 
     */
    public void setRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
    }

    public InputSchema withRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns
     * 
     */
    public List<RecordColumn> getRecordColumns() {
        return recordColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputschema.html#cfn-kinesisanalytics-application-inputschema-recordcolumns
     * 
     */
    public void setRecordColumns(List<RecordColumn> recordColumns) {
        this.recordColumns = recordColumns;
    }

    public InputSchema withRecordColumns(List<RecordColumn> recordColumns) {
        this.recordColumns = recordColumns;
        return this;
    }

    /**
     * RecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html
     * 
     */
    public RecordFormat getRecordFormat() {
        return recordFormat;
    }

    /**
     * RecordFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html
     * 
     */
    public void setRecordFormat(RecordFormat recordFormat) {
        this.recordFormat = recordFormat;
    }

    public InputSchema withRecordFormat(RecordFormat recordFormat) {
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
