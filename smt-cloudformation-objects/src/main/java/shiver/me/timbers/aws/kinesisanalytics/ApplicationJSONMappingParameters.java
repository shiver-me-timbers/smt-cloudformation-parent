
package shiver.me.timbers.aws.kinesisanalytics;

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
 * ApplicationJSONMappingParameters
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RecordRowPath"
})
public class ApplicationJSONMappingParameters implements Property<ApplicationJSONMappingParameters>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath
     * 
     */
    @JsonProperty("RecordRowPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath")
    private CharSequence recordRowPath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath
     * 
     */
    @JsonIgnore
    public CharSequence getRecordRowPath() {
        return recordRowPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-jsonmappingparameters.html#cfn-kinesisanalytics-application-jsonmappingparameters-recordrowpath
     * 
     */
    @JsonIgnore
    public void setRecordRowPath(CharSequence recordRowPath) {
        this.recordRowPath = recordRowPath;
    }

    public ApplicationJSONMappingParameters withRecordRowPath(CharSequence recordRowPath) {
        this.recordRowPath = recordRowPath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recordRowPath", recordRowPath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recordRowPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationJSONMappingParameters) == false) {
            return false;
        }
        ApplicationJSONMappingParameters rhs = ((ApplicationJSONMappingParameters) other);
        return new EqualsBuilder().append(recordRowPath, rhs.recordRowPath).isEquals();
    }

}
