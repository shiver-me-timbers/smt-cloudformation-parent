
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
 * ReferenceSchema
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RecordEncoding",
    "RecordColumns",
    "RecordFormat"
})
public class ReferenceSchema {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding
     * 
     */
    @JsonProperty("RecordEncoding")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding")
    private CharSequence recordEncoding;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns
     * 
     */
    @JsonProperty("RecordColumns")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns")
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding
     * 
     */
    public CharSequence getRecordEncoding() {
        return recordEncoding;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding
     * 
     */
    public void setRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
    }

    public ReferenceSchema withRecordEncoding(CharSequence recordEncoding) {
        this.recordEncoding = recordEncoding;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns
     * 
     */
    public List<RecordColumn> getRecordColumns() {
        return recordColumns;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns
     * 
     */
    public void setRecordColumns(List<RecordColumn> recordColumns) {
        this.recordColumns = recordColumns;
    }

    public ReferenceSchema withRecordColumns(List<RecordColumn> recordColumns) {
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

    public ReferenceSchema withRecordFormat(RecordFormat recordFormat) {
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
        if ((other instanceof ReferenceSchema) == false) {
            return false;
        }
        ReferenceSchema rhs = ((ReferenceSchema) other);
        return new EqualsBuilder().append(recordFormat, rhs.recordFormat).append(recordEncoding, rhs.recordEncoding).append(recordColumns, rhs.recordColumns).isEquals();
    }

}
