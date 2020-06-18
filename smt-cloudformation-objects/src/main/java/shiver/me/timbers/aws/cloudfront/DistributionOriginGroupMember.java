
package shiver.me.timbers.aws.cloudfront;

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
 * DistributionOriginGroupMember
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OriginId"
})
public class DistributionOriginGroupMember implements Property<DistributionOriginGroupMember>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html#cfn-cloudfront-distribution-origingroupmember-originid
     * 
     */
    @JsonProperty("OriginId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html#cfn-cloudfront-distribution-origingroupmember-originid")
    private CharSequence originId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html#cfn-cloudfront-distribution-origingroupmember-originid
     * 
     */
    @JsonIgnore
    public CharSequence getOriginId() {
        return originId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmember.html#cfn-cloudfront-distribution-origingroupmember-originid
     * 
     */
    @JsonIgnore
    public void setOriginId(CharSequence originId) {
        this.originId = originId;
    }

    public DistributionOriginGroupMember withOriginId(CharSequence originId) {
        this.originId = originId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("originId", originId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(originId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionOriginGroupMember) == false) {
            return false;
        }
        DistributionOriginGroupMember rhs = ((DistributionOriginGroupMember) other);
        return new EqualsBuilder().append(originId, rhs.originId).isEquals();
    }

}
