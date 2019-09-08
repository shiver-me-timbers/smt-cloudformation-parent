
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
 * BucketServerSideEncryptionRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ServerSideEncryptionByDefault"
})
public class BucketServerSideEncryptionRule implements Property<BucketServerSideEncryptionRule>
{

    /**
     * BucketServerSideEncryptionByDefault
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
     * 
     */
    @JsonProperty("ServerSideEncryptionByDefault")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html")
    private Property<BucketServerSideEncryptionByDefault> serverSideEncryptionByDefault;

    /**
     * BucketServerSideEncryptionByDefault
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
     * 
     */
    @JsonIgnore
    public Property<BucketServerSideEncryptionByDefault> getServerSideEncryptionByDefault() {
        return serverSideEncryptionByDefault;
    }

    /**
     * BucketServerSideEncryptionByDefault
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-bucket-serversideencryptionbydefault.html
     * 
     */
    @JsonIgnore
    public void setServerSideEncryptionByDefault(Property<BucketServerSideEncryptionByDefault> serverSideEncryptionByDefault) {
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
    }

    public BucketServerSideEncryptionRule withServerSideEncryptionByDefault(Property<BucketServerSideEncryptionByDefault> serverSideEncryptionByDefault) {
        this.serverSideEncryptionByDefault = serverSideEncryptionByDefault;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serverSideEncryptionByDefault", serverSideEncryptionByDefault).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serverSideEncryptionByDefault).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BucketServerSideEncryptionRule) == false) {
            return false;
        }
        BucketServerSideEncryptionRule rhs = ((BucketServerSideEncryptionRule) other);
        return new EqualsBuilder().append(serverSideEncryptionByDefault, rhs.serverSideEncryptionByDefault).isEquals();
    }

}
