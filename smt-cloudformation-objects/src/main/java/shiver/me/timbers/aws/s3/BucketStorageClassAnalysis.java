
package shiver.me.timbers.aws.s3;

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
 * BucketStorageClassAnalysis
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DataExport"
})
public class BucketStorageClassAnalysis implements Property<BucketStorageClassAnalysis>
{

    /**
     * BucketDataExport
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
     * 
     */
    @JsonProperty("DataExport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html")
    private Property<BucketDataExport> dataExport;

    /**
     * BucketDataExport
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
     * 
     */
    @JsonIgnore
    public Property<BucketDataExport> getDataExport() {
        return dataExport;
    }

    /**
     * BucketDataExport
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
     * 
     */
    @JsonIgnore
    public void setDataExport(Property<BucketDataExport> dataExport) {
        this.dataExport = dataExport;
    }

    public BucketStorageClassAnalysis withDataExport(Property<BucketDataExport> dataExport) {
        this.dataExport = dataExport;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataExport", dataExport).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dataExport).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketStorageClassAnalysis) == false) {
            return false;
        }
        BucketStorageClassAnalysis rhs = ((BucketStorageClassAnalysis) other);
        return new EqualsBuilder().append(dataExport, rhs.dataExport).isEquals();
    }

}
