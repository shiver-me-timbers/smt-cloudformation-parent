
package aws.cognito;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UserPoolUser
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ValidationData",
    "UserPoolId",
    "Username",
    "MessageAction",
    "DesiredDeliveryMediums",
    "ForceAliasCreation",
    "UserAttributes"
})
public class UserPoolUser {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata
     * 
     */
    @JsonProperty("ValidationData")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata")
    private List<AttributeType> validationData = new ArrayList<AttributeType>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid")
    private CharSequence userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username
     * 
     */
    @JsonProperty("Username")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username")
    private CharSequence username;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction
     * 
     */
    @JsonProperty("MessageAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction")
    private CharSequence messageAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums
     * 
     */
    @JsonProperty("DesiredDeliveryMediums")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums")
    private List<CharSequence> desiredDeliveryMediums = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation
     * 
     */
    @JsonProperty("ForceAliasCreation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation")
    private Boolean forceAliasCreation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes
     * 
     */
    @JsonProperty("UserAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes")
    private List<AttributeType> userAttributes = new ArrayList<AttributeType>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata
     * 
     */
    public List<AttributeType> getValidationData() {
        return validationData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata
     * 
     */
    public void setValidationData(List<AttributeType> validationData) {
        this.validationData = validationData;
    }

    public UserPoolUser withValidationData(List<AttributeType> validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid
     * 
     */
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid
     * 
     */
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolUser withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username
     * 
     */
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username
     * 
     */
    public void setUsername(CharSequence username) {
        this.username = username;
    }

    public UserPoolUser withUsername(CharSequence username) {
        this.username = username;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction
     * 
     */
    public CharSequence getMessageAction() {
        return messageAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction
     * 
     */
    public void setMessageAction(CharSequence messageAction) {
        this.messageAction = messageAction;
    }

    public UserPoolUser withMessageAction(CharSequence messageAction) {
        this.messageAction = messageAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums
     * 
     */
    public List<CharSequence> getDesiredDeliveryMediums() {
        return desiredDeliveryMediums;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums
     * 
     */
    public void setDesiredDeliveryMediums(List<CharSequence> desiredDeliveryMediums) {
        this.desiredDeliveryMediums = desiredDeliveryMediums;
    }

    public UserPoolUser withDesiredDeliveryMediums(List<CharSequence> desiredDeliveryMediums) {
        this.desiredDeliveryMediums = desiredDeliveryMediums;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation
     * 
     */
    public Boolean getForceAliasCreation() {
        return forceAliasCreation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation
     * 
     */
    public void setForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }

    public UserPoolUser withForceAliasCreation(Boolean forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes
     * 
     */
    public List<AttributeType> getUserAttributes() {
        return userAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes
     * 
     */
    public void setUserAttributes(List<AttributeType> userAttributes) {
        this.userAttributes = userAttributes;
    }

    public UserPoolUser withUserAttributes(List<AttributeType> userAttributes) {
        this.userAttributes = userAttributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("validationData", validationData).append("userPoolId", userPoolId).append("username", username).append("messageAction", messageAction).append("desiredDeliveryMediums", desiredDeliveryMediums).append("forceAliasCreation", forceAliasCreation).append("userAttributes", userAttributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(userAttributes).append(desiredDeliveryMediums).append(messageAction).append(forceAliasCreation).append(userPoolId).append(validationData).append(username).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolUser) == false) {
            return false;
        }
        UserPoolUser rhs = ((UserPoolUser) other);
        return new EqualsBuilder().append(userAttributes, rhs.userAttributes).append(desiredDeliveryMediums, rhs.desiredDeliveryMediums).append(messageAction, rhs.messageAction).append(forceAliasCreation, rhs.forceAliasCreation).append(userPoolId, rhs.userPoolId).append(validationData, rhs.validationData).append(username, rhs.username).isEquals();
    }

}
