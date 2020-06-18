
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
 * DistributionOriginGroupFailoverCriteria
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origingroupfailovercriteria.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "StatusCodes"
})
public class DistributionOriginGroupFailoverCriteria implements Property<DistributionOriginGroupFailoverCriteria>
{

    /**
     * DistributionStatusCodes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html
     * 
     */
    @JsonProperty("StatusCodes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html")
    private Property<DistributionStatusCodes> statusCodes;

    /**
     * DistributionStatusCodes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html
     * 
     */
    @JsonIgnore
    public Property<DistributionStatusCodes> getStatusCodes() {
        return statusCodes;
    }

    /**
     * DistributionStatusCodes
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-statuscodes.html
     * 
     */
    @JsonIgnore
    public void setStatusCodes(Property<DistributionStatusCodes> statusCodes) {
        this.statusCodes = statusCodes;
    }

    public DistributionOriginGroupFailoverCriteria withStatusCodes(Property<DistributionStatusCodes> statusCodes) {
        this.statusCodes = statusCodes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("statusCodes", statusCodes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(statusCodes).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionOriginGroupFailoverCriteria) == false) {
            return false;
        }
        DistributionOriginGroupFailoverCriteria rhs = ((DistributionOriginGroupFailoverCriteria) other);
        return new EqualsBuilder().append(statusCodes, rhs.statusCodes).isEquals();
    }

}
