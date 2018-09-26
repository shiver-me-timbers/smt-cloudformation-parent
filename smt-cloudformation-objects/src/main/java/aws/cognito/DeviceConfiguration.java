
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DeviceConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DeviceOnlyRememberedOnUserPrompt",
    "ChallengeRequiredOnNewDevice"
})
public class DeviceConfiguration {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt
     * 
     */
    @JsonProperty("DeviceOnlyRememberedOnUserPrompt")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt")
    private Boolean deviceOnlyRememberedOnUserPrompt;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice
     * 
     */
    @JsonProperty("ChallengeRequiredOnNewDevice")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice")
    private Boolean challengeRequiredOnNewDevice;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt
     * 
     */
    public Boolean getDeviceOnlyRememberedOnUserPrompt() {
        return deviceOnlyRememberedOnUserPrompt;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-deviceonlyrememberedonuserprompt
     * 
     */
    public void setDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    public DeviceConfiguration withDeviceOnlyRememberedOnUserPrompt(Boolean deviceOnlyRememberedOnUserPrompt) {
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice
     * 
     */
    public Boolean getChallengeRequiredOnNewDevice() {
        return challengeRequiredOnNewDevice;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-deviceconfiguration.html#cfn-cognito-userpool-deviceconfiguration-challengerequiredonnewdevice
     * 
     */
    public void setChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
    }

    public DeviceConfiguration withChallengeRequiredOnNewDevice(Boolean challengeRequiredOnNewDevice) {
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
        if ((other instanceof DeviceConfiguration) == false) {
            return false;
        }
        DeviceConfiguration rhs = ((DeviceConfiguration) other);
        return new EqualsBuilder().append(deviceOnlyRememberedOnUserPrompt, rhs.deviceOnlyRememberedOnUserPrompt).append(challengeRequiredOnNewDevice, rhs.challengeRequiredOnNewDevice).isEquals();
    }

}
