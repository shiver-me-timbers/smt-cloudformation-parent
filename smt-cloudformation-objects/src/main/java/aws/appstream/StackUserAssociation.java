
package aws.appstream;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StackUserAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SendEmailNotification",
    "UserName",
    "StackName",
    "AuthenticationType"
})
public class StackUserAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification
     * 
     */
    @JsonProperty("SendEmailNotification")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification")
    private CharSequence sendEmailNotification;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username
     * 
     */
    @JsonProperty("UserName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username")
    private CharSequence userName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname
     * 
     */
    @JsonProperty("StackName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname")
    private CharSequence stackName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype
     * 
     */
    @JsonProperty("AuthenticationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype")
    private CharSequence authenticationType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification
     * 
     */
    @JsonIgnore
    public CharSequence getSendEmailNotification() {
        return sendEmailNotification;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-sendemailnotification
     * 
     */
    @JsonIgnore
    public void setSendEmailNotification(CharSequence sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
    }

    public StackUserAssociation withSendEmailNotification(CharSequence sendEmailNotification) {
        this.sendEmailNotification = sendEmailNotification;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username
     * 
     */
    @JsonIgnore
    public CharSequence getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-username
     * 
     */
    @JsonIgnore
    public void setUserName(CharSequence userName) {
        this.userName = userName;
    }

    public StackUserAssociation withUserName(CharSequence userName) {
        this.userName = userName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname
     * 
     */
    @JsonIgnore
    public CharSequence getStackName() {
        return stackName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-stackname
     * 
     */
    @JsonIgnore
    public void setStackName(CharSequence stackName) {
        this.stackName = stackName;
    }

    public StackUserAssociation withStackName(CharSequence stackName) {
        this.stackName = stackName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype
     * 
     */
    @JsonIgnore
    public CharSequence getAuthenticationType() {
        return authenticationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appstream-stackuserassociation.html#cfn-appstream-stackuserassociation-authenticationtype
     * 
     */
    @JsonIgnore
    public void setAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
    }

    public StackUserAssociation withAuthenticationType(CharSequence authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sendEmailNotification", sendEmailNotification).append("userName", userName).append("stackName", stackName).append("authenticationType", authenticationType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stackName).append(sendEmailNotification).append(authenticationType).append(userName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StackUserAssociation) == false) {
            return false;
        }
        StackUserAssociation rhs = ((StackUserAssociation) other);
        return new EqualsBuilder().append(stackName, rhs.stackName).append(sendEmailNotification, rhs.sendEmailNotification).append(authenticationType, rhs.authenticationType).append(userName, rhs.userName).isEquals();
    }

}
