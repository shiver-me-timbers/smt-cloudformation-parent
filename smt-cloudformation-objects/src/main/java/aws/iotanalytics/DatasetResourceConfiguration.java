
package aws.iotanalytics;

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
 * DatasetResourceConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VolumeSizeInGB",
    "ComputeType"
})
public class DatasetResourceConfiguration implements Property<DatasetResourceConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-volumesizeingb
     * 
     */
    @JsonProperty("VolumeSizeInGB")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-volumesizeingb")
    private Number volumeSizeInGB;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-computetype
     * 
     */
    @JsonProperty("ComputeType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-computetype")
    private CharSequence computeType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-volumesizeingb
     * 
     */
    @JsonIgnore
    public Number getVolumeSizeInGB() {
        return volumeSizeInGB;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-volumesizeingb
     * 
     */
    @JsonIgnore
    public void setVolumeSizeInGB(Number volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
    }

    public DatasetResourceConfiguration withVolumeSizeInGB(Number volumeSizeInGB) {
        this.volumeSizeInGB = volumeSizeInGB;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-computetype
     * 
     */
    @JsonIgnore
    public CharSequence getComputeType() {
        return computeType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-resourceconfiguration.html#cfn-iotanalytics-dataset-resourceconfiguration-computetype
     * 
     */
    @JsonIgnore
    public void setComputeType(CharSequence computeType) {
        this.computeType = computeType;
    }

    public DatasetResourceConfiguration withComputeType(CharSequence computeType) {
        this.computeType = computeType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("volumeSizeInGB", volumeSizeInGB).append("computeType", computeType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeSizeInGB).append(computeType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetResourceConfiguration) == false) {
            return false;
        }
        DatasetResourceConfiguration rhs = ((DatasetResourceConfiguration) other);
        return new EqualsBuilder().append(volumeSizeInGB, rhs.volumeSizeInGB).append(computeType, rhs.computeType).isEquals();
    }

}
