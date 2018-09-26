
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AccessControlTranslation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Owner"
})
public class AccessControlTranslation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner
     * 
     */
    @JsonProperty("Owner")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner")
    private CharSequence owner;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner
     * 
     */
    public CharSequence getOwner() {
        return owner;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-accesscontroltranslation.html#cfn-s3-bucket-accesscontroltranslation-owner
     * 
     */
    public void setOwner(CharSequence owner) {
        this.owner = owner;
    }

    public AccessControlTranslation withOwner(CharSequence owner) {
        this.owner = owner;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("owner", owner).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(owner).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessControlTranslation) == false) {
            return false;
        }
        AccessControlTranslation rhs = ((AccessControlTranslation) other);
        return new EqualsBuilder().append(owner, rhs.owner).isEquals();
    }

}
