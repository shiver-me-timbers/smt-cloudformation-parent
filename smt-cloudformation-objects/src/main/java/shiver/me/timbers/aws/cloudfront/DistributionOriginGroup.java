
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
 * DistributionOriginGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Id",
    "FailoverCriteria",
    "Members"
})
public class DistributionOriginGroup implements Property<DistributionOriginGroup>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-id
     * 
     */
    @JsonProperty("Id")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-id")
    private CharSequence id;
    /**
     * DistributionOriginGroupFailoverCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html
     * 
     */
    @JsonProperty("FailoverCriteria")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html")
    private Property<DistributionOriginGroupFailoverCriteria> failoverCriteria;
    /**
     * DistributionOriginGroupMembers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html
     * 
     */
    @JsonProperty("Members")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html")
    private Property<DistributionOriginGroupMembers> members;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-id
     * 
     */
    @JsonIgnore
    public CharSequence getId() {
        return id;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroup.html#cfn-cloudfront-distribution-origingroup-id
     * 
     */
    @JsonIgnore
    public void setId(CharSequence id) {
        this.id = id;
    }

    public DistributionOriginGroup withId(CharSequence id) {
        this.id = id;
        return this;
    }

    /**
     * DistributionOriginGroupFailoverCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html
     * 
     */
    @JsonIgnore
    public Property<DistributionOriginGroupFailoverCriteria> getFailoverCriteria() {
        return failoverCriteria;
    }

    /**
     * DistributionOriginGroupFailoverCriteria
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html
     * 
     */
    @JsonIgnore
    public void setFailoverCriteria(Property<DistributionOriginGroupFailoverCriteria> failoverCriteria) {
        this.failoverCriteria = failoverCriteria;
    }

    public DistributionOriginGroup withFailoverCriteria(Property<DistributionOriginGroupFailoverCriteria> failoverCriteria) {
        this.failoverCriteria = failoverCriteria;
        return this;
    }

    /**
     * DistributionOriginGroupMembers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html
     * 
     */
    @JsonIgnore
    public Property<DistributionOriginGroupMembers> getMembers() {
        return members;
    }

    /**
     * DistributionOriginGroupMembers
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupmembers.html
     * 
     */
    @JsonIgnore
    public void setMembers(Property<DistributionOriginGroupMembers> members) {
        this.members = members;
    }

    public DistributionOriginGroup withMembers(Property<DistributionOriginGroupMembers> members) {
        this.members = members;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("failoverCriteria", failoverCriteria).append("members", members).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(failoverCriteria).append(id).append(members).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionOriginGroup) == false) {
            return false;
        }
        DistributionOriginGroup rhs = ((DistributionOriginGroup) other);
        return new EqualsBuilder().append(failoverCriteria, rhs.failoverCriteria).append(id, rhs.id).append(members, rhs.members).isEquals();
    }

}
