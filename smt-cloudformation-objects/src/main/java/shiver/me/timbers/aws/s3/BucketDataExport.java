
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
 * BucketDataExport
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Destination",
    "OutputSchemaVersion"
})
public class BucketDataExport implements Property<BucketDataExport>
{

    /**
     * BucketDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonProperty("Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html")
    private Property<BucketDestination> destination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion
     * 
     */
    @JsonProperty("OutputSchemaVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion")
    private CharSequence outputSchemaVersion;

    /**
     * BucketDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonIgnore
    public Property<BucketDestination> getDestination() {
        return destination;
    }

    /**
     * BucketDestination
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-destination.html
     * 
     */
    @JsonIgnore
    public void setDestination(Property<BucketDestination> destination) {
        this.destination = destination;
    }

    public BucketDataExport withDestination(Property<BucketDestination> destination) {
        this.destination = destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion
     * 
     */
    @JsonIgnore
    public CharSequence getOutputSchemaVersion() {
        return outputSchemaVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-dataexport.html#cfn-s3-bucket-dataexport-outputschemaversion
     * 
     */
    @JsonIgnore
    public void setOutputSchemaVersion(CharSequence outputSchemaVersion) {
        this.outputSchemaVersion = outputSchemaVersion;
    }

    public BucketDataExport withOutputSchemaVersion(CharSequence outputSchemaVersion) {
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
        if ((other instanceof BucketDataExport) == false) {
            return false;
        }
        BucketDataExport rhs = ((BucketDataExport) other);
        return new EqualsBuilder().append(destination, rhs.destination).append(outputSchemaVersion, rhs.outputSchemaVersion).isEquals();
    }

}
