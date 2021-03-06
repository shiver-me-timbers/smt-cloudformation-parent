
package shiver.me.timbers.aws.cognito;

import java.util.ArrayList;
import java.util.List;
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
 * UserPoolUser
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ValidationData",
    "UserPoolId",
    "Username",
    "MessageAction",
    "ClientMetadata",
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
    private List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> validationData = new ArrayList<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>>();
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
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata
     * 
     */
    @JsonProperty("ClientMetadata")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata")
    private Object clientMetadata;
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
    private CharSequence forceAliasCreation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes
     * 
     */
    @JsonProperty("UserAttributes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes")
    private List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> userAttributes = new ArrayList<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata
     * 
     */
    @JsonIgnore
    public List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> getValidationData() {
        return validationData;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-validationdata
     * 
     */
    @JsonIgnore
    public void setValidationData(List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> validationData) {
        this.validationData = validationData;
    }

    public UserPoolUser withValidationData(List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> validationData) {
        this.validationData = validationData;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userpoolid
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getUsername() {
        return username;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-username
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getMessageAction() {
        return messageAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-messageaction
     * 
     */
    @JsonIgnore
    public void setMessageAction(CharSequence messageAction) {
        this.messageAction = messageAction;
    }

    public UserPoolUser withMessageAction(CharSequence messageAction) {
        this.messageAction = messageAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata
     * 
     */
    @JsonIgnore
    public Object getClientMetadata() {
        return clientMetadata;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-clientmetadata
     * 
     */
    @JsonIgnore
    public void setClientMetadata(Object clientMetadata) {
        this.clientMetadata = clientMetadata;
    }

    public UserPoolUser withClientMetadata(Object clientMetadata) {
        this.clientMetadata = clientMetadata;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums
     * 
     */
    @JsonIgnore
    public List<CharSequence> getDesiredDeliveryMediums() {
        return desiredDeliveryMediums;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-desireddeliverymediums
     * 
     */
    @JsonIgnore
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
    @JsonIgnore
    public CharSequence getForceAliasCreation() {
        return forceAliasCreation;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-forcealiascreation
     * 
     */
    @JsonIgnore
    public void setForceAliasCreation(CharSequence forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
    }

    public UserPoolUser withForceAliasCreation(CharSequence forceAliasCreation) {
        this.forceAliasCreation = forceAliasCreation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes
     * 
     */
    @JsonIgnore
    public List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> getUserAttributes() {
        return userAttributes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooluser.html#cfn-cognito-userpooluser-userattributes
     * 
     */
    @JsonIgnore
    public void setUserAttributes(List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> userAttributes) {
        this.userAttributes = userAttributes;
    }

    public UserPoolUser withUserAttributes(List<Property<shiver.me.timbers.aws.cognito.UserPoolUserAttributeType>> userAttributes) {
        this.userAttributes = userAttributes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("validationData", validationData).append("userPoolId", userPoolId).append("username", username).append("messageAction", messageAction).append("clientMetadata", clientMetadata).append("desiredDeliveryMediums", desiredDeliveryMediums).append("forceAliasCreation", forceAliasCreation).append("userAttributes", userAttributes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(clientMetadata).append(userAttributes).append(desiredDeliveryMediums).append(messageAction).append(forceAliasCreation).append(userPoolId).append(validationData).append(username).toHashCode();
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
        return new EqualsBuilder().append(clientMetadata, rhs.clientMetadata).append(userAttributes, rhs.userAttributes).append(desiredDeliveryMediums, rhs.desiredDeliveryMediums).append(messageAction, rhs.messageAction).append(forceAliasCreation, rhs.forceAliasCreation).append(userPoolId, rhs.userPoolId).append(validationData, rhs.validationData).append(username, rhs.username).isEquals();
    }

}
