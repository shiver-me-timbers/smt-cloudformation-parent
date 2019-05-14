
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
 * DestinationSchema
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RecordFormatType"
})
public class DestinationSchema implements Property<DestinationSchema>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype
     * 
     */
    @JsonProperty("RecordFormatType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype")
    private CharSequence recordFormatType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype
     * 
     */
    @JsonIgnore
    public CharSequence getRecordFormatType() {
        return recordFormatType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationoutput-destinationschema.html#cfn-kinesisanalyticsv2-applicationoutput-destinationschema-recordformattype
     * 
     */
    @JsonIgnore
    public void setRecordFormatType(CharSequence recordFormatType) {
        this.recordFormatType = recordFormatType;
    }

    public DestinationSchema withRecordFormatType(CharSequence recordFormatType) {
        this.recordFormatType = recordFormatType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recordFormatType", recordFormatType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordFormatType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DestinationSchema) == false) {
            return false;
        }
        DestinationSchema rhs = ((DestinationSchema) other);
        return new EqualsBuilder().append(recordFormatType, rhs.recordFormatType).isEquals();
    }

}
