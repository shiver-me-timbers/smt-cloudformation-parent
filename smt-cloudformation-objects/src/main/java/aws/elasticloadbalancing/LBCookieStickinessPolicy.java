
package aws.elasticloadbalancing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LBCookieStickinessPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CookieExpirationPeriod",
    "PolicyName"
})
public class LBCookieStickinessPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod
     * 
     */
    @JsonProperty("CookieExpirationPeriod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod")
    private CharSequence cookieExpirationPeriod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname")
    private CharSequence policyName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod
     * 
     */
    public CharSequence getCookieExpirationPeriod() {
        return cookieExpirationPeriod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-cookieexpirationperiod
     * 
     */
    public void setCookieExpirationPeriod(CharSequence cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
    }

    public LBCookieStickinessPolicy withCookieExpirationPeriod(CharSequence cookieExpirationPeriod) {
        this.cookieExpirationPeriod = cookieExpirationPeriod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname
     * 
     */
    public CharSequence getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-LBCookieStickinessPolicy.html#cfn-elb-lbcookiestickinesspolicy-policyname
     * 
     */
    public void setPolicyName(CharSequence policyName) {
        this.policyName = policyName;
    }

    public LBCookieStickinessPolicy withPolicyName(CharSequence policyName) {
        this.policyName = policyName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cookieExpirationPeriod", cookieExpirationPeriod).append("policyName", policyName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyName).append(cookieExpirationPeriod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LBCookieStickinessPolicy) == false) {
            return false;
        }
        LBCookieStickinessPolicy rhs = ((LBCookieStickinessPolicy) other);
        return new EqualsBuilder().append(policyName, rhs.policyName).append(cookieExpirationPeriod, rhs.cookieExpirationPeriod).isEquals();
    }

}
