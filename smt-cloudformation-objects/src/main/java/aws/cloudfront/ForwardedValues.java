
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
 * ForwardedValues
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Cookies",
    "Headers",
    "QueryString",
    "QueryStringCacheKeys"
})
public class ForwardedValues {

    /**
     * Cookies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
     * 
     */
    @JsonProperty("Cookies")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html")
    private Cookies cookies;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers
     * 
     */
    @JsonProperty("Headers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers")
    private List<String> headers = new ArrayList<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring
     * 
     */
    @JsonProperty("QueryString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring")
    private Boolean queryString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys
     * 
     */
    @JsonProperty("QueryStringCacheKeys")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys")
    private List<String> queryStringCacheKeys = new ArrayList<String>();

    /**
     * Cookies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
     * 
     */
    @JsonProperty("Cookies")
    public Cookies getCookies() {
        return cookies;
    }

    /**
     * Cookies
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-cookies.html
     * 
     */
    @JsonProperty("Cookies")
    public void setCookies(Cookies cookies) {
        this.cookies = cookies;
    }

    public ForwardedValues withCookies(Cookies cookies) {
        this.cookies = cookies;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers
     * 
     */
    @JsonProperty("Headers")
    public List<String> getHeaders() {
        return headers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-headers
     * 
     */
    @JsonProperty("Headers")
    public void setHeaders(List<String> headers) {
        this.headers = headers;
    }

    public ForwardedValues withHeaders(List<String> headers) {
        this.headers = headers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring
     * 
     */
    @JsonProperty("QueryString")
    public Boolean getQueryString() {
        return queryString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystring
     * 
     */
    @JsonProperty("QueryString")
    public void setQueryString(Boolean queryString) {
        this.queryString = queryString;
    }

    public ForwardedValues withQueryString(Boolean queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys
     * 
     */
    @JsonProperty("QueryStringCacheKeys")
    public List<String> getQueryStringCacheKeys() {
        return queryStringCacheKeys;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-forwardedvalues.html#cfn-cloudfront-distribution-forwardedvalues-querystringcachekeys
     * 
     */
    @JsonProperty("QueryStringCacheKeys")
    public void setQueryStringCacheKeys(List<String> queryStringCacheKeys) {
        this.queryStringCacheKeys = queryStringCacheKeys;
    }

    public ForwardedValues withQueryStringCacheKeys(List<String> queryStringCacheKeys) {
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
        if ((other instanceof ForwardedValues) == false) {
            return false;
        }
        ForwardedValues rhs = ((ForwardedValues) other);
        return new EqualsBuilder().append(headers, rhs.headers).append(queryString, rhs.queryString).append(cookies, rhs.cookies).append(queryStringCacheKeys, rhs.queryStringCacheKeys).isEquals();
    }

}