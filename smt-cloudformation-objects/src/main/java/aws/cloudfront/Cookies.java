
package aws.cloudfront;

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
 * Cookies
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "WhitelistedNames",
    "Forward"
})
public class Cookies {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames
     * 
     */
    @JsonProperty("WhitelistedNames")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames")
    private List<CharSequence> whitelistedNames = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward
     * 
     */
    @JsonProperty("Forward")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward")
    private CharSequence forward;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames
     * 
     */
    public List<CharSequence> getWhitelistedNames() {
        return whitelistedNames;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-whitelistednames
     * 
     */
    public void setWhitelistedNames(List<CharSequence> whitelistedNames) {
        this.whitelistedNames = whitelistedNames;
    }

    public Cookies withWhitelistedNames(List<CharSequence> whitelistedNames) {
        this.whitelistedNames = whitelistedNames;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward
     * 
     */
    public CharSequence getForward() {
        return forward;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html#cfn-cloudfront-distribution-cookies-forward
     * 
     */
    public void setForward(CharSequence forward) {
        this.forward = forward;
    }

    public Cookies withForward(CharSequence forward) {
        this.forward = forward;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("whitelistedNames", whitelistedNames).append("forward", forward).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(whitelistedNames).append(forward).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Cookies) == false) {
            return false;
        }
        Cookies rhs = ((Cookies) other);
        return new EqualsBuilder().append(whitelistedNames, rhs.whitelistedNames).append(forward, rhs.forward).isEquals();
    }

}
