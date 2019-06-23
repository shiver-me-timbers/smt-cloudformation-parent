
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
 * BucketSourceSelectionCriteria
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SseKmsEncryptedObjects"
})
public class BucketSourceSelectionCriteria implements Property<BucketSourceSelectionCriteria>
{

    /**
     * BucketSseKmsEncryptedObjects
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html
     * 
     */
    @JsonProperty("SseKmsEncryptedObjects")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html")
    private Property<BucketSseKmsEncryptedObjects> sseKmsEncryptedObjects;

    /**
     * BucketSseKmsEncryptedObjects
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html
     * 
     */
    @JsonIgnore
    public Property<BucketSseKmsEncryptedObjects> getSseKmsEncryptedObjects() {
        return sseKmsEncryptedObjects;
    }

    /**
     * BucketSseKmsEncryptedObjects
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html
     * 
     */
    @JsonIgnore
    public void setSseKmsEncryptedObjects(Property<BucketSseKmsEncryptedObjects> sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    public BucketSourceSelectionCriteria withSseKmsEncryptedObjects(Property<BucketSseKmsEncryptedObjects> sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sseKmsEncryptedObjects", sseKmsEncryptedObjects).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sseKmsEncryptedObjects).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketSourceSelectionCriteria) == false) {
            return false;
        }
        BucketSourceSelectionCriteria rhs = ((BucketSourceSelectionCriteria) other);
        return new EqualsBuilder().append(sseKmsEncryptedObjects, rhs.sseKmsEncryptedObjects).isEquals();
    }

}
