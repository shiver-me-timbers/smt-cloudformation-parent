
package aws.opsworks;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UserProfile
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AllowSelfManagement",
    "IamUserArn",
    "SshPublicKey",
    "SshUsername"
})
public class UserProfile {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement
     * 
     */
    @JsonProperty("AllowSelfManagement")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement")
    private Boolean allowSelfManagement;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn
     * 
     */
    @JsonProperty("IamUserArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn")
    private CharSequence iamUserArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey
     * 
     */
    @JsonProperty("SshPublicKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey")
    private CharSequence sshPublicKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername
     * 
     */
    @JsonProperty("SshUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername")
    private CharSequence sshUsername;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement
     * 
     */
    public Boolean getAllowSelfManagement() {
        return allowSelfManagement;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-allowselfmanagement
     * 
     */
    public void setAllowSelfManagement(Boolean allowSelfManagement) {
        this.allowSelfManagement = allowSelfManagement;
    }

    public UserProfile withAllowSelfManagement(Boolean allowSelfManagement) {
        this.allowSelfManagement = allowSelfManagement;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn
     * 
     */
    public CharSequence getIamUserArn() {
        return iamUserArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-iamuserarn
     * 
     */
    public void setIamUserArn(CharSequence iamUserArn) {
        this.iamUserArn = iamUserArn;
    }

    public UserProfile withIamUserArn(CharSequence iamUserArn) {
        this.iamUserArn = iamUserArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey
     * 
     */
    public CharSequence getSshPublicKey() {
        return sshPublicKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshpublickey
     * 
     */
    public void setSshPublicKey(CharSequence sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
    }

    public UserProfile withSshPublicKey(CharSequence sshPublicKey) {
        this.sshPublicKey = sshPublicKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername
     * 
     */
    public CharSequence getSshUsername() {
        return sshUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opsworks-userprofile.html#cfn-opsworks-userprofile-sshusername
     * 
     */
    public void setSshUsername(CharSequence sshUsername) {
        this.sshUsername = sshUsername;
    }

    public UserProfile withSshUsername(CharSequence sshUsername) {
        this.sshUsername = sshUsername;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowSelfManagement", allowSelfManagement).append("iamUserArn", iamUserArn).append("sshPublicKey", sshPublicKey).append("sshUsername", sshUsername).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(sshPublicKey).append(allowSelfManagement).append(iamUserArn).append(sshUsername).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserProfile) == false) {
            return false;
        }
        UserProfile rhs = ((UserProfile) other);
        return new EqualsBuilder().append(sshPublicKey, rhs.sshPublicKey).append(allowSelfManagement, rhs.allowSelfManagement).append(iamUserArn, rhs.iamUserArn).append(sshUsername, rhs.sshUsername).isEquals();
    }

}
