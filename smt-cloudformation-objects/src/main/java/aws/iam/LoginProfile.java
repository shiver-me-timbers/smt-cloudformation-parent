
package aws.iam;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LoginProfile
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Password",
    "PasswordResetRequired"
})
public class LoginProfile {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password
     * 
     */
    @JsonProperty("Password")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password")
    private CharSequence password;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired
     * 
     */
    @JsonProperty("PasswordResetRequired")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired")
    private Boolean passwordResetRequired;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password
     * 
     */
    public CharSequence getPassword() {
        return password;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-password
     * 
     */
    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public LoginProfile withPassword(CharSequence password) {
        this.password = password;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired
     * 
     */
    public Boolean getPasswordResetRequired() {
        return passwordResetRequired;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iam-user-loginprofile.html#cfn-iam-user-loginprofile-passwordresetrequired
     * 
     */
    public void setPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
    }

    public LoginProfile withPasswordResetRequired(Boolean passwordResetRequired) {
        this.passwordResetRequired = passwordResetRequired;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("password", password).append("passwordResetRequired", passwordResetRequired).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(passwordResetRequired).append(password).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LoginProfile) == false) {
            return false;
        }
        LoginProfile rhs = ((LoginProfile) other);
        return new EqualsBuilder().append(passwordResetRequired, rhs.passwordResetRequired).append(password, rhs.password).isEquals();
    }

}
