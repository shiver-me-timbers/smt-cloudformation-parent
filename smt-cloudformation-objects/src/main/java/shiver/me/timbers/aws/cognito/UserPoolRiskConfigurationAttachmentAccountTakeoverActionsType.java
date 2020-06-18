
package shiver.me.timbers.aws.cognito;

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
 * UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractionstype.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HighAction",
    "LowAction",
    "MediumAction"
})
public class UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType implements Property<UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType>
{

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonProperty("HighAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html")
    private Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> highAction;
    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonProperty("LowAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html")
    private Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> lowAction;
    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonProperty("MediumAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html")
    private Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> mediumAction;

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> getHighAction() {
        return highAction;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonIgnore
    public void setHighAction(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> highAction) {
        this.highAction = highAction;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType withHighAction(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> highAction) {
        this.highAction = highAction;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> getLowAction() {
        return lowAction;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonIgnore
    public void setLowAction(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> lowAction) {
        this.lowAction = lowAction;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType withLowAction(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> lowAction) {
        this.lowAction = lowAction;
        return this;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonIgnore
    public Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> getMediumAction() {
        return mediumAction;
    }

    /**
     * UserPoolRiskConfigurationAttachmentAccountTakeoverActionType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpoolriskconfigurationattachment-accounttakeoveractiontype.html
     * 
     */
    @JsonIgnore
    public void setMediumAction(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> mediumAction) {
        this.mediumAction = mediumAction;
    }

    public UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType withMediumAction(Property<shiver.me.timbers.aws.cognito.UserPoolRiskConfigurationAttachmentAccountTakeoverActionType> mediumAction) {
        this.mediumAction = mediumAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("highAction", highAction).append("lowAction", lowAction).append("mediumAction", mediumAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lowAction).append(highAction).append(mediumAction).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType) == false) {
            return false;
        }
        UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType rhs = ((UserPoolRiskConfigurationAttachmentAccountTakeoverActionsType) other);
        return new EqualsBuilder().append(lowAction, rhs.lowAction).append(highAction, rhs.highAction).append(mediumAction, rhs.mediumAction).isEquals();
    }

}
