
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
 * DatasetVersioningConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxVersions",
    "Unlimited"
})
public class DatasetVersioningConfiguration implements Property<DatasetVersioningConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-maxversions
     * 
     */
    @JsonProperty("MaxVersions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-maxversions")
    private Number maxVersions;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-unlimited
     * 
     */
    @JsonProperty("Unlimited")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-unlimited")
    private CharSequence unlimited;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-maxversions
     * 
     */
    @JsonIgnore
    public Number getMaxVersions() {
        return maxVersions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-maxversions
     * 
     */
    @JsonIgnore
    public void setMaxVersions(Number maxVersions) {
        this.maxVersions = maxVersions;
    }

    public DatasetVersioningConfiguration withMaxVersions(Number maxVersions) {
        this.maxVersions = maxVersions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-unlimited
     * 
     */
    @JsonIgnore
    public CharSequence getUnlimited() {
        return unlimited;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iotanalytics-dataset-versioningconfiguration.html#cfn-iotanalytics-dataset-versioningconfiguration-unlimited
     * 
     */
    @JsonIgnore
    public void setUnlimited(CharSequence unlimited) {
        this.unlimited = unlimited;
    }

    public DatasetVersioningConfiguration withUnlimited(CharSequence unlimited) {
        this.unlimited = unlimited;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxVersions", maxVersions).append("unlimited", unlimited).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unlimited).append(maxVersions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DatasetVersioningConfiguration) == false) {
            return false;
        }
        DatasetVersioningConfiguration rhs = ((DatasetVersioningConfiguration) other);
        return new EqualsBuilder().append(unlimited, rhs.unlimited).append(maxVersions, rhs.maxVersions).isEquals();
    }

}
