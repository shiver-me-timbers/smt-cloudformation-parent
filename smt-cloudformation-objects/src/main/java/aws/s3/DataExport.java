
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DataExport
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Destination",
    "OutputSchemaVersion"
})
public class DataExport {

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html")
    private Destination destination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion
     * 
     */
    @JsonProperty("OutputSchemaVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion")
    private CharSequence outputSchemaVersion;

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    public Destination getDestination() {
        return destination;
    }

    /**
     * Destination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public DataExport withDestination(Destination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion
     * 
     */
    public CharSequence getOutputSchemaVersion() {
        return outputSchemaVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion
     * 
     */
    public void setOutputSchemaVersion(CharSequence outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
    }

    public DataExport withOutputSchemaVersion(CharSequence outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destination", destination).append("outputSchemaVersion", outputSchemaVersion).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(destination).append(outputSchemaVersion).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataExport) == false) {
            return false;
        }
        DataExport rhs = ((DataExport) other);
        return new EqualsBuilder().append(destination, rhs.destination).append(outputSchemaVersion, rhs.outputSchemaVersion).isEquals();
    }

}
