
package aws.iot;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Action
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BucketName",
    "Key",
    "RoleArn"
})
public class S3Action {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname")
    private CharSequence bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key
     * 
     */
    @JsonProperty("Key")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key")
    private CharSequence key;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname
     * 
     */
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-bucketname
     * 
     */
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public S3Action withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key
     * 
     */
    public CharSequence getKey() {
        return key;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-key
     * 
     */
    public void setKey(CharSequence key) {
        this.key = key;
    }

    public S3Action withKey(CharSequence key) {
        this.key = key;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html#cfn-iot-topicrule-s3action-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public S3Action withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bucketName", bucketName).append("key", key).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(bucketName).append(key).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof S3Action) == false) {
            return false;
        }
        S3Action rhs = ((S3Action) other);
        return new EqualsBuilder().append(bucketName, rhs.bucketName).append(key, rhs.key).append(roleArn, rhs.roleArn).isEquals();
    }

}
