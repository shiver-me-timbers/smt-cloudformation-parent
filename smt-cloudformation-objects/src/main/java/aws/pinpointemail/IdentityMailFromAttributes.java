
package aws.pinpointemail;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IdentityMailFromAttributes
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MailFromDomain",
    "BehaviorOnMxFailure"
})
public class IdentityMailFromAttributes implements Property<IdentityMailFromAttributes>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-mailfromdomain
     * 
     */
    @JsonProperty("MailFromDomain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-mailfromdomain")
    private CharSequence mailFromDomain;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-behavioronmxfailure
     * 
     */
    @JsonProperty("BehaviorOnMxFailure")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-behavioronmxfailure")
    private CharSequence behaviorOnMxFailure;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-mailfromdomain
     * 
     */
    @JsonIgnore
    public CharSequence getMailFromDomain() {
        return mailFromDomain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-mailfromdomain
     * 
     */
    @JsonIgnore
    public void setMailFromDomain(CharSequence mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
    }

    public IdentityMailFromAttributes withMailFromDomain(CharSequence mailFromDomain) {
        this.mailFromDomain = mailFromDomain;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-behavioronmxfailure
     * 
     */
    @JsonIgnore
    public CharSequence getBehaviorOnMxFailure() {
        return behaviorOnMxFailure;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-identity-mailfromattributes.html#cfn-pinpointemail-identity-mailfromattributes-behavioronmxfailure
     * 
     */
    @JsonIgnore
    public void setBehaviorOnMxFailure(CharSequence behaviorOnMxFailure) {
        this.behaviorOnMxFailure = behaviorOnMxFailure;
    }

    public IdentityMailFromAttributes withBehaviorOnMxFailure(CharSequence behaviorOnMxFailure) {
        this.behaviorOnMxFailure = behaviorOnMxFailure;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mailFromDomain", mailFromDomain).append("behaviorOnMxFailure", behaviorOnMxFailure).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mailFromDomain).append(behaviorOnMxFailure).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IdentityMailFromAttributes) == false) {
            return false;
        }
        IdentityMailFromAttributes rhs = ((IdentityMailFromAttributes) other);
        return new EqualsBuilder().append(mailFromDomain, rhs.mailFromDomain).append(behaviorOnMxFailure, rhs.behaviorOnMxFailure).isEquals();
    }

}
