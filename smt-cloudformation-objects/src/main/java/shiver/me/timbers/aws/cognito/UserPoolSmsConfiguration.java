
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
 * UserPoolSmsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExternalId",
    "SnsCallerArn"
})
public class UserPoolSmsConfiguration implements Property<UserPoolSmsConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid
     * 
     */
    @JsonProperty("ExternalId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid")
    private CharSequence externalId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn
     * 
     */
    @JsonProperty("SnsCallerArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn")
    private CharSequence snsCallerArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid
     * 
     */
    @JsonIgnore
    public CharSequence getExternalId() {
        return externalId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-externalid
     * 
     */
    @JsonIgnore
    public void setExternalId(CharSequence externalId) {
        this.externalId = externalId;
    }

    public UserPoolSmsConfiguration withExternalId(CharSequence externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn
     * 
     */
    @JsonIgnore
    public CharSequence getSnsCallerArn() {
        return snsCallerArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-smsconfiguration.html#cfn-cognito-userpool-smsconfiguration-snscallerarn
     * 
     */
    @JsonIgnore
    public void setSnsCallerArn(CharSequence snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
    }

    public UserPoolSmsConfiguration withSnsCallerArn(CharSequence snsCallerArn) {
        this.snsCallerArn = snsCallerArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("externalId", externalId).append("snsCallerArn", snsCallerArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(externalId).append(snsCallerArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolSmsConfiguration) == false) {
            return false;
        }
        UserPoolSmsConfiguration rhs = ((UserPoolSmsConfiguration) other);
        return new EqualsBuilder().append(externalId, rhs.externalId).append(snsCallerArn, rhs.snsCallerArn).isEquals();
    }

}
