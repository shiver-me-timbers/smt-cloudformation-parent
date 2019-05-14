
package aws.s3;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BucketEncryption
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ServerSideEncryptionConfiguration"
})
public class BucketEncryption implements Property<BucketEncryption>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration
     * 
     */
    @JsonProperty("ServerSideEncryptionConfiguration")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration")
    private Set<Property<ServerSideEncryptionRule>> serverSideEncryptionConfiguration = new LinkedHashSet<Property<ServerSideEncryptionRule>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration
     * 
     */
    @JsonIgnore
    public Set<Property<ServerSideEncryptionRule>> getServerSideEncryptionConfiguration() {
        return serverSideEncryptionConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-bucketencryption.html#cfn-s3-bucket-bucketencryption-serversideencryptionconfiguration
     * 
     */
    @JsonIgnore
    public void setServerSideEncryptionConfiguration(Set<Property<ServerSideEncryptionRule>> serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    public BucketEncryption withServerSideEncryptionConfiguration(Set<Property<ServerSideEncryptionRule>> serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serverSideEncryptionConfiguration", serverSideEncryptionConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serverSideEncryptionConfiguration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketEncryption) == false) {
            return false;
        }
        BucketEncryption rhs = ((BucketEncryption) other);
        return new EqualsBuilder().append(serverSideEncryptionConfiguration, rhs.serverSideEncryptionConfiguration).isEquals();
    }

}
