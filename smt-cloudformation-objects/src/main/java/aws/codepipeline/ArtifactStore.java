
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ArtifactStore
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EncryptionKey",
    "Location",
    "Type"
})
public class ArtifactStore {

    /**
     * EncryptionKey
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html
     * 
     */
    @JsonProperty("EncryptionKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html")
    private EncryptionKey encryptionKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location")
    private CharSequence location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type")
    private CharSequence type;

    /**
     * EncryptionKey
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html
     * 
     */
    public EncryptionKey getEncryptionKey() {
        return encryptionKey;
    }

    /**
     * EncryptionKey
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html
     * 
     */
    public void setEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
    }

    public ArtifactStore withEncryptionKey(EncryptionKey encryptionKey) {
        this.encryptionKey = encryptionKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location
     * 
     */
    public CharSequence getLocation() {
        return location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-location
     * 
     */
    public void setLocation(CharSequence location) {
        this.location = location;
    }

    public ArtifactStore withLocation(CharSequence location) {
        this.location = location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore.html#cfn-codepipeline-pipeline-artifactstore-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public ArtifactStore withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("encryptionKey", encryptionKey).append("location", location).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(location).append(encryptionKey).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ArtifactStore) == false) {
            return false;
        }
        ArtifactStore rhs = ((ArtifactStore) other);
        return new EqualsBuilder().append(location, rhs.location).append(encryptionKey, rhs.encryptionKey).append(type, rhs.type).isEquals();
    }

}
