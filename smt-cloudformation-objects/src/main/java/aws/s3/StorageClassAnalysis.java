
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StorageClassAnalysis
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-storageclassanalysis.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DataExport"
})
public class StorageClassAnalysis {

    /**
     * DataExport
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
     * 
     */
    @JsonProperty("DataExport")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html")
    private DataExport dataExport;

    /**
     * DataExport
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
     * 
     */
    public DataExport getDataExport() {
        return dataExport;
    }

    /**
     * DataExport
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
     * 
     */
    public void setDataExport(DataExport dataExport) {
        this.dataExport = dataExport;
    }

    public StorageClassAnalysis withDataExport(DataExport dataExport) {
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
        if ((other instanceof StorageClassAnalysis) == false) {
            return false;
        }
        StorageClassAnalysis rhs = ((StorageClassAnalysis) other);
        return new EqualsBuilder().append(dataExport, rhs.dataExport).isEquals();
    }

}
