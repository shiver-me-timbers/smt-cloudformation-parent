
package aws.ssm;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * InstanceAssociationOutputLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "S3Location"
})
public class InstanceAssociationOutputLocation {

    /**
     * S3OutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
     * 
     */
    @JsonProperty("S3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html")
    private S3OutputLocation s3Location;

    /**
     * S3OutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
     * 
     */
    public S3OutputLocation getS3Location() {
        return s3Location;
    }

    /**
     * S3OutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
     * 
     */
    public void setS3Location(S3OutputLocation s3Location) {
        this.s3Location = s3Location;
    }

    public InstanceAssociationOutputLocation withS3Location(S3OutputLocation s3Location) {
        this.s3Location = s3Location;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Location", s3Location).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3Location).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof InstanceAssociationOutputLocation) == false) {
            return false;
        }
        InstanceAssociationOutputLocation rhs = ((InstanceAssociationOutputLocation) other);
        return new EqualsBuilder().append(s3Location, rhs.s3Location).isEquals();
    }

}
