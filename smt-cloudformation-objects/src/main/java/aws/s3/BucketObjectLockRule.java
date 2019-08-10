
package aws.s3;

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
 * BucketObjectLockRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-objectlockrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DefaultRetention"
})
public class BucketObjectLockRule implements Property<BucketObjectLockRule>
{

    /**
     * BucketDefaultRetention
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html
     * 
     */
    @JsonProperty("DefaultRetention")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html")
    private Property<BucketDefaultRetention> defaultRetention;

    /**
     * BucketDefaultRetention
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html
     * 
     */
    @JsonIgnore
    public Property<BucketDefaultRetention> getDefaultRetention() {
        return defaultRetention;
    }

    /**
     * BucketDefaultRetention
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-defaultretention.html
     * 
     */
    @JsonIgnore
    public void setDefaultRetention(Property<BucketDefaultRetention> defaultRetention) {
        this.defaultRetention = defaultRetention;
    }

    public BucketObjectLockRule withDefaultRetention(Property<BucketDefaultRetention> defaultRetention) {
        this.defaultRetention = defaultRetention;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("defaultRetention", defaultRetention).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(defaultRetention).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketObjectLockRule) == false) {
            return false;
        }
        BucketObjectLockRule rhs = ((BucketObjectLockRule) other);
        return new EqualsBuilder().append(defaultRetention, rhs.defaultRetention).isEquals();
    }

}
