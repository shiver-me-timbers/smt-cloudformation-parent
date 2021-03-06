
package shiver.me.timbers.aws.cloudfront;

import java.util.ArrayList;
import java.util.List;
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
 * DistributionForwardedValues
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Cookies",
    "Headers",
    "QueryString",
    "QueryStringCacheKeys"
})
public class DistributionForwardedValues implements Property<DistributionForwardedValues>
{

    /**
     * DistributionCookies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
     * 
     */
    @JsonProperty("Cookies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html")
    private Property<DistributionCookies> cookies;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers
     * 
     */
    @JsonProperty("Headers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers")
    private List<CharSequence> headers = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring
     * 
     */
    @JsonProperty("QueryString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring")
    private CharSequence queryString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys
     * 
     */
    @JsonProperty("QueryStringCacheKeys")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys")
    private List<CharSequence> queryStringCacheKeys = new ArrayList<CharSequence>();

    /**
     * DistributionCookies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
     * 
     */
    @JsonIgnore
    public Property<DistributionCookies> getCookies() {
        return cookies;
    }

    /**
     * DistributionCookies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
     * 
     */
    @JsonIgnore
    public void setCookies(Property<DistributionCookies> cookies) {
        this.cookies = cookies;
    }

    public DistributionForwardedValues withCookies(Property<DistributionCookies> cookies) {
        this.cookies = cookies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers
     * 
     */
    @JsonIgnore
    public List<CharSequence> getHeaders() {
        return headers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers
     * 
     */
    @JsonIgnore
    public void setHeaders(List<CharSequence> headers) {
        this.headers = headers;
    }

    public DistributionForwardedValues withHeaders(List<CharSequence> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring
     * 
     */
    @JsonIgnore
    public CharSequence getQueryString() {
        return queryString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring
     * 
     */
    @JsonIgnore
    public void setQueryString(CharSequence queryString) {
        this.queryString = queryString;
    }

    public DistributionForwardedValues withQueryString(CharSequence queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys
     * 
     */
    @JsonIgnore
    public List<CharSequence> getQueryStringCacheKeys() {
        return queryStringCacheKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys
     * 
     */
    @JsonIgnore
    public void setQueryStringCacheKeys(List<CharSequence> queryStringCacheKeys) {
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    public DistributionForwardedValues withQueryStringCacheKeys(List<CharSequence> queryStringCacheKeys) {
        this.queryStringCacheKeys = queryStringCacheKeys;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cookies", cookies).append("headers", headers).append("queryString", queryString).append("queryStringCacheKeys", queryStringCacheKeys).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(headers).append(queryString).append(cookies).append(queryStringCacheKeys).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionForwardedValues) == false) {
            return false;
        }
        DistributionForwardedValues rhs = ((DistributionForwardedValues) other);
        return new EqualsBuilder().append(headers, rhs.headers).append(queryString, rhs.queryString).append(cookies, rhs.cookies).append(queryStringCacheKeys, rhs.queryStringCacheKeys).isEquals();
    }

}
