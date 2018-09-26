
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * EncryptionKey
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Id",
    "Type"
})
public class EncryptionKey {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-id")
    private CharSequence id;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-type")
    private CharSequence type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-id
     * 
     */
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-id
     * 
     */
    public void setId(CharSequence id) {
        this.id = id;
    }

    public EncryptionKey withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-type
     * 
     */
    public CharSequence getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-pipeline-artifactstore-encryptionkey.html#cfn-codepipeline-pipeline-artifactstore-encryptionkey-type
     * 
     */
    public void setType(CharSequence type) {
        this.type = type;
    }

    public EncryptionKey withType(CharSequence type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EncryptionKey) == false) {
            return false;
        }
        EncryptionKey rhs = ((EncryptionKey) other);
        return new EqualsBuilder().append(type, rhs.type).append(id, rhs.id).isEquals();
    }

}
