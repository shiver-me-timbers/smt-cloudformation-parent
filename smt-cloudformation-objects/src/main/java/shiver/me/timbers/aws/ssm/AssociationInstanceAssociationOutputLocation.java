
package shiver.me.timbers.aws.ssm;

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
 * AssociationInstanceAssociationOutputLocation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-instanceassociationoutputlocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Location"
})
public class AssociationInstanceAssociationOutputLocation implements Property<AssociationInstanceAssociationOutputLocation>
{

    /**
     * AssociationS3OutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
     * 
     */
    @JsonProperty("S3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html")
    private Property<AssociationS3OutputLocation> s3Location;

    /**
     * AssociationS3OutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
     * 
     */
    @JsonIgnore
    public Property<AssociationS3OutputLocation> getS3Location() {
        return s3Location;
    }

    /**
     * AssociationS3OutputLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ssm-association-s3outputlocation.html
     * 
     */
    @JsonIgnore
    public void setS3Location(Property<AssociationS3OutputLocation> s3Location) {
        this.s3Location = s3Location;
    }

    public AssociationInstanceAssociationOutputLocation withS3Location(Property<AssociationS3OutputLocation> s3Location) {
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
        if ((other instanceof AssociationInstanceAssociationOutputLocation) == false) {
            return false;
        }
        AssociationInstanceAssociationOutputLocation rhs = ((AssociationInstanceAssociationOutputLocation) other);
        return new EqualsBuilder().append(s3Location, rhs.s3Location).isEquals();
    }

}
