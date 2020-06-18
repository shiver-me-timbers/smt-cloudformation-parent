
package shiver.me.timbers.aws.apigatewayv2;

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
 * ApiCors
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AllowOrigins",
    "AllowCredentials",
    "ExposeHeaders",
    "AllowHeaders",
    "MaxAge",
    "AllowMethods"
})
public class ApiCors implements Property<ApiCors>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-alloworigins
     * 
     */
    @JsonProperty("AllowOrigins")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-alloworigins")
    private List<CharSequence> allowOrigins = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowcredentials
     * 
     */
    @JsonProperty("AllowCredentials")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowcredentials")
    private CharSequence allowCredentials;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-exposeheaders
     * 
     */
    @JsonProperty("ExposeHeaders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-exposeheaders")
    private List<CharSequence> exposeHeaders = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowheaders
     * 
     */
    @JsonProperty("AllowHeaders")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowheaders")
    private List<CharSequence> allowHeaders = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-maxage
     * 
     */
    @JsonProperty("MaxAge")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-maxage")
    private Number maxAge;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowmethods
     * 
     */
    @JsonProperty("AllowMethods")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowmethods")
    private List<CharSequence> allowMethods = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-alloworigins
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowOrigins() {
        return allowOrigins;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-alloworigins
     * 
     */
    @JsonIgnore
    public void setAllowOrigins(List<CharSequence> allowOrigins) {
        this.allowOrigins = allowOrigins;
    }

    public ApiCors withAllowOrigins(List<CharSequence> allowOrigins) {
        this.allowOrigins = allowOrigins;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowcredentials
     * 
     */
    @JsonIgnore
    public CharSequence getAllowCredentials() {
        return allowCredentials;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowcredentials
     * 
     */
    @JsonIgnore
    public void setAllowCredentials(CharSequence allowCredentials) {
        this.allowCredentials = allowCredentials;
    }

    public ApiCors withAllowCredentials(CharSequence allowCredentials) {
        this.allowCredentials = allowCredentials;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-exposeheaders
     * 
     */
    @JsonIgnore
    public List<CharSequence> getExposeHeaders() {
        return exposeHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-exposeheaders
     * 
     */
    @JsonIgnore
    public void setExposeHeaders(List<CharSequence> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
    }

    public ApiCors withExposeHeaders(List<CharSequence> exposeHeaders) {
        this.exposeHeaders = exposeHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowheaders
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowHeaders() {
        return allowHeaders;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowheaders
     * 
     */
    @JsonIgnore
    public void setAllowHeaders(List<CharSequence> allowHeaders) {
        this.allowHeaders = allowHeaders;
    }

    public ApiCors withAllowHeaders(List<CharSequence> allowHeaders) {
        this.allowHeaders = allowHeaders;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-maxage
     * 
     */
    @JsonIgnore
    public Number getMaxAge() {
        return maxAge;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-maxage
     * 
     */
    @JsonIgnore
    public void setMaxAge(Number maxAge) {
        this.maxAge = maxAge;
    }

    public ApiCors withMaxAge(Number maxAge) {
        this.maxAge = maxAge;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowmethods
     * 
     */
    @JsonIgnore
    public List<CharSequence> getAllowMethods() {
        return allowMethods;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigatewayv2-api-cors.html#cfn-apigatewayv2-api-cors-allowmethods
     * 
     */
    @JsonIgnore
    public void setAllowMethods(List<CharSequence> allowMethods) {
        this.allowMethods = allowMethods;
    }

    public ApiCors withAllowMethods(List<CharSequence> allowMethods) {
        this.allowMethods = allowMethods;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("allowOrigins", allowOrigins).append("allowCredentials", allowCredentials).append("exposeHeaders", exposeHeaders).append("allowHeaders", allowHeaders).append("maxAge", maxAge).append("allowMethods", allowMethods).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowMethods).append(exposeHeaders).append(allowHeaders).append(maxAge).append(allowCredentials).append(allowOrigins).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiCors) == false) {
            return false;
        }
        ApiCors rhs = ((ApiCors) other);
        return new EqualsBuilder().append(allowMethods, rhs.allowMethods).append(exposeHeaders, rhs.exposeHeaders).append(allowHeaders, rhs.allowHeaders).append(maxAge, rhs.maxAge).append(allowCredentials, rhs.allowCredentials).append(allowOrigins, rhs.allowOrigins).isEquals();
    }

}
