
package aws.gamelift;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Location
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Bucket",
    "Key",
    "RoleArn"
})
public class S3Location {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-bucket
     * 
     */
    @JsonProperty("Bucket")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-bucket")
    private CharSequence bucket;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-key")
    private CharSequence key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-bucket
     * 
     */
    public CharSequence getBucket() {
        return bucket;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-bucket
     * 
     */
    public void setBucket(CharSequence bucket) {
        this.bucket = bucket;
    }

    public S3Location withBucket(CharSequence bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public S3Location withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-gamelift-build-storagelocation.html#cfn-gamelift-build-storage-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public S3Location withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucket", bucket).append("key", key).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucket).append(key).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3Location) == false) {
            return false;
        }
        S3Location rhs = ((S3Location) other);
        return new EqualsBuilder().append(bucket, rhs.bucket).append(key, rhs.key).append(roleArn, rhs.roleArn).isEquals();
    }

}
