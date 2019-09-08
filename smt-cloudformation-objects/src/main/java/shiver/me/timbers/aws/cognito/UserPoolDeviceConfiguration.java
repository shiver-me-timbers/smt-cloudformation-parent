
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
 * UserPoolDeviceConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DeviceOnlyRememberedOnUserPrompt",
    "ChallengeRequiredOnNewDevice"
})
public class UserPoolDeviceConfiguration implements Property<UserPoolDeviceConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt
     * 
     */
    @JsonProperty("DeviceOnlyRememberedOnUserPrompt")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt")
    private CharSequence deviceOnlyRememberedOnUserPrompt;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice
     * 
     */
    @JsonProperty("ChallengeRequiredOnNewDevice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice")
    private CharSequence challengeRequiredOnNewDevice;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt
     * 
     */
    @JsonIgnore
    public CharSequence getDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt
     * 
     */
    @JsonIgnore
    public void setDeviceOnlyRememberedOnUserPrompt(CharSequence deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    public UserPoolDeviceConfiguration withDeviceOnlyRememberedOnUserPrompt(CharSequence deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice
     * 
     */
    @JsonIgnore
    public CharSequence getChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice
     * 
     */
    @JsonIgnore
    public void setChallengeRequiredOnNewDevice(CharSequence challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    public UserPoolDeviceConfiguration withChallengeRequiredOnNewDevice(CharSequence challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("deviceOnlyRememberedOnUserPrompt", deviceOnlyRememberedOnUserPrompt).append("challengeRequiredOnNewDevice", challengeRequiredOnNewDevice).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(deviceOnlyRememberedOnUserPrompt).append(challengeRequiredOnNewDevice).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolDeviceConfiguration) == false) {
            return false;
        }
        UserPoolDeviceConfiguration rhs = ((UserPoolDeviceConfiguration) other);
        return new EqualsBuilder().append(deviceOnlyRememberedOnUserPrompt, rhs.deviceOnlyRememberedOnUserPrompt).append(challengeRequiredOnNewDevice, rhs.challengeRequiredOnNewDevice).isEquals();
    }

}
