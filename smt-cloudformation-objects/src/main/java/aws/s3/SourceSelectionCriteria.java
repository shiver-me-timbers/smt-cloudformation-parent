
package aws.s3;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SourceSelectionCriteria
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-sourceselectioncriteria.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SseKmsEncryptedObjects"
})
public class SourceSelectionCriteria {

    /**
     * SseKmsEncryptedObjects
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html
     * 
     */
    @JsonProperty("SseKmsEncryptedObjects")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html")
    private SseKmsEncryptedObjects sseKmsEncryptedObjects;

    /**
     * SseKmsEncryptedObjects
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html
     * 
     */
    public SseKmsEncryptedObjects getSseKmsEncryptedObjects() {
        return sseKmsEncryptedObjects;
    }

    /**
     * SseKmsEncryptedObjects
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-ssekmsencryptedobjects.html
     * 
     */
    public void setSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
        this.sseKmsEncryptedObjects = sseKmsEncryptedObjects;
    }

    public SourceSelectionCriteria withSseKmsEncryptedObjects(SseKmsEncryptedObjects sseKmsEncryptedObjects) {
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
        if ((other instanceof SourceSelectionCriteria) == false) {
            return false;
        }
        SourceSelectionCriteria rhs = ((SourceSelectionCriteria) other);
        return new EqualsBuilder().append(sseKmsEncryptedObjects, rhs.sseKmsEncryptedObjects).isEquals();
    }

}
