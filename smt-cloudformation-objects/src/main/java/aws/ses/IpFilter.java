
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * IpFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Policy",
    "Cidr"
})
public class IpFilter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy
     * 
     */
    @JsonProperty("Policy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy")
    private CharSequence policy;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr
     * 
     */
    @JsonProperty("Cidr")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr")
    private CharSequence cidr;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy
     * 
     */
    public CharSequence getPolicy() {
        return policy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-policy
     * 
     */
    public void setPolicy(CharSequence policy) {
        this.policy = policy;
    }

    public IpFilter withPolicy(CharSequence policy) {
        this.policy = policy;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr
     * 
     */
    public CharSequence getCidr() {
        return cidr;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptfilter-ipfilter.html#cfn-ses-receiptfilter-ipfilter-cidr
     * 
     */
    public void setCidr(CharSequence cidr) {
        this.cidr = cidr;
    }

    public IpFilter withCidr(CharSequence cidr) {
        this.cidr = cidr;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("policy", policy).append("cidr", cidr).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cidr).append(policy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof IpFilter) == false) {
            return false;
        }
        IpFilter rhs = ((IpFilter) other);
        return new EqualsBuilder().append(cidr, rhs.cidr).append(policy, rhs.policy).isEquals();
    }

}
