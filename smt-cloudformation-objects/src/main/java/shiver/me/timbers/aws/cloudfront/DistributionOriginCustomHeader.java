
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
 * DistributionOriginCustomHeader
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "HeaderValue",
    "HeaderName"
})
public class DistributionOriginCustomHeader implements Property<DistributionOriginCustomHeader>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue
     * 
     */
    @JsonProperty("HeaderValue")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue")
    private CharSequence headerValue;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername
     * 
     */
    @JsonProperty("HeaderName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername")
    private CharSequence headerName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue
     * 
     */
    @JsonIgnore
    public CharSequence getHeaderValue() {
        return headerValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue
     * 
     */
    @JsonIgnore
    public void setHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
    }

    public DistributionOriginCustomHeader withHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername
     * 
     */
    @JsonIgnore
    public CharSequence getHeaderName() {
        return headerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername
     * 
     */
    @JsonIgnore
    public void setHeaderName(CharSequence headerName) {
        this.headerName = headerName;
    }

    public DistributionOriginCustomHeader withHeaderName(CharSequence headerName) {
        this.headerName = headerName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("headerValue", headerValue).append("headerName", headerName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headerValue).append(headerName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionOriginCustomHeader) == false) {
            return false;
        }
        DistributionOriginCustomHeader rhs = ((DistributionOriginCustomHeader) other);
        return new EqualsBuilder().append(headerValue, rhs.headerValue).append(headerName, rhs.headerName).isEquals();
    }

}
