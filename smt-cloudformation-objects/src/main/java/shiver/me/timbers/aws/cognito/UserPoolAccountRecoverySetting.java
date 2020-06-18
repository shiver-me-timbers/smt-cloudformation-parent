
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
 * UserPoolAccountRecoverySetting
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "RecoveryMechanisms"
})
public class UserPoolAccountRecoverySetting implements Property<UserPoolAccountRecoverySetting>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms
     * 
     */
    @JsonProperty("RecoveryMechanisms")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms")
    private List<Property<UserPoolRecoveryOption>> recoveryMechanisms = new ArrayList<Property<UserPoolRecoveryOption>>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms
     * 
     */
    @JsonIgnore
    public List<Property<UserPoolRecoveryOption>> getRecoveryMechanisms() {
        return recoveryMechanisms;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-accountrecoverysetting.html#cfn-cognito-userpool-accountrecoverysetting-recoverymechanisms
     * 
     */
    @JsonIgnore
    public void setRecoveryMechanisms(List<Property<UserPoolRecoveryOption>> recoveryMechanisms) {
        this.recoveryMechanisms = recoveryMechanisms;
    }

    public UserPoolAccountRecoverySetting withRecoveryMechanisms(List<Property<UserPoolRecoveryOption>> recoveryMechanisms) {
        this.recoveryMechanisms = recoveryMechanisms;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("recoveryMechanisms", recoveryMechanisms).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(recoveryMechanisms).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolAccountRecoverySetting) == false) {
            return false;
        }
        UserPoolAccountRecoverySetting rhs = ((UserPoolAccountRecoverySetting) other);
        return new EqualsBuilder().append(recoveryMechanisms, rhs.recoveryMechanisms).isEquals();
    }

}
