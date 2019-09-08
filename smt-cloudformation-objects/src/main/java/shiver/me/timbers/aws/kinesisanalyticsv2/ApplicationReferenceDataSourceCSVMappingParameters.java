
package shiver.me.timbers.aws.kinesisanalyticsv2;

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
 * ApplicationReferenceDataSourceCSVMappingParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RecordRowDelimiter",
    "RecordColumnDelimiter"
})
public class ApplicationReferenceDataSourceCSVMappingParameters implements Property<ApplicationReferenceDataSourceCSVMappingParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter
     * 
     */
    @JsonProperty("RecordRowDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter")
    private CharSequence recordRowDelimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter
     * 
     */
    @JsonProperty("RecordColumnDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter")
    private CharSequence recordColumnDelimiter;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter
     * 
     */
    @JsonIgnore
    public CharSequence getRecordRowDelimiter() {
        return recordRowDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter
     * 
     */
    @JsonIgnore
    public void setRecordRowDelimiter(CharSequence recordRowDelimiter) {
        this.recordRowDelimiter = recordRowDelimiter;
    }

    public ApplicationReferenceDataSourceCSVMappingParameters withRecordRowDelimiter(CharSequence recordRowDelimiter) {
        this.recordRowDelimiter = recordRowDelimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter
     * 
     */
    @JsonIgnore
    public CharSequence getRecordColumnDelimiter() {
        return recordColumnDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter
     * 
     */
    @JsonIgnore
    public void setRecordColumnDelimiter(CharSequence recordColumnDelimiter) {
        this.recordColumnDelimiter = recordColumnDelimiter;
    }

    public ApplicationReferenceDataSourceCSVMappingParameters withRecordColumnDelimiter(CharSequence recordColumnDelimiter) {
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
        if ((other instanceof ApplicationReferenceDataSourceCSVMappingParameters) == false) {
            return false;
        }
        ApplicationReferenceDataSourceCSVMappingParameters rhs = ((ApplicationReferenceDataSourceCSVMappingParameters) other);
        return new EqualsBuilder().append(recordColumnDelimiter, rhs.recordColumnDelimiter).append(recordRowDelimiter, rhs.recordRowDelimiter).isEquals();
    }

}
