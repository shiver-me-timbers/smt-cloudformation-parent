
package aws.elasticloadbalancing;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AppCookieStickinessPolicy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CookieName",
    "PolicyName"
})
public class AppCookieStickinessPolicy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename
     * 
     */
    @JsonProperty("CookieName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename")
    private String cookieName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname")
    private String policyName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename
     * 
     */
    @JsonProperty("CookieName")
    public String getCookieName() {
        return cookieName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-cookiename
     * 
     */
    @JsonProperty("CookieName")
    public void setCookieName(String cookieName) {
        this.cookieName = cookieName;
    }

    public AppCookieStickinessPolicy withCookieName(String cookieName) {
        this.cookieName = cookieName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    public String getPolicyName() {
        return policyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-elb-AppCookieStickinessPolicy.html#cfn-elb-appcookiestickinesspolicy-policyname
     * 
     */
    @JsonProperty("PolicyName")
    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public AppCookieStickinessPolicy withPolicyName(String policyName) {
        this.policyName = policyName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cookieName", cookieName).append("policyName", policyName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(policyName).append(cookieName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AppCookieStickinessPolicy) == false) {
            return false;
        }
        AppCookieStickinessPolicy rhs = ((AppCookieStickinessPolicy) other);
        return new EqualsBuilder().append(policyName, rhs.policyName).append(cookieName, rhs.cookieName).isEquals();
    }

}
