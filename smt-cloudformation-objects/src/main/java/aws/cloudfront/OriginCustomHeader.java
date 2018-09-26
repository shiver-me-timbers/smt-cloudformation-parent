
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * OriginCustomHeader
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "HeaderValue",
    "HeaderName"
})
public class OriginCustomHeader {

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
    public CharSequence getHeaderValue() {
        return headerValue;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headervalue
     * 
     */
    public void setHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
    }

    public OriginCustomHeader withHeaderValue(CharSequence headerValue) {
        this.headerValue = headerValue;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername
     * 
     */
    public CharSequence getHeaderName() {
        return headerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-origincustomheader.html#cfn-cloudfront-distribution-origincustomheader-headername
     * 
     */
    public void setHeaderName(CharSequence headerName) {
        this.headerName = headerName;
    }

    public OriginCustomHeader withHeaderName(CharSequence headerName) {
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
        if ((other instanceof OriginCustomHeader) == false) {
            return false;
        }
        OriginCustomHeader rhs = ((OriginCustomHeader) other);
        return new EqualsBuilder().append(headerValue, rhs.headerValue).append(headerName, rhs.headerName).isEquals();
    }

}
