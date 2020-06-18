
package shiver.me.timbers.aws.wafv2;

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
 * WebACLFieldToMatch
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SingleHeader",
    "SingleQueryArgument",
    "AllQueryArguments",
    "UriPath",
    "QueryString",
    "Body",
    "Method"
})
public class WebACLFieldToMatch implements Property<WebACLFieldToMatch>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singleheader
     * 
     */
    @JsonProperty("SingleHeader")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singleheader")
    private Object singleHeader;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singlequeryargument
     * 
     */
    @JsonProperty("SingleQueryArgument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singlequeryargument")
    private Object singleQueryArgument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-allqueryarguments
     * 
     */
    @JsonProperty("AllQueryArguments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-allqueryarguments")
    private Object allQueryArguments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-uripath
     * 
     */
    @JsonProperty("UriPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-uripath")
    private Object uriPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-querystring
     * 
     */
    @JsonProperty("QueryString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-querystring")
    private Object queryString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-body")
    private Object body;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-method
     * 
     */
    @JsonProperty("Method")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-method")
    private Object method;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singleheader
     * 
     */
    @JsonIgnore
    public Object getSingleHeader() {
        return singleHeader;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singleheader
     * 
     */
    @JsonIgnore
    public void setSingleHeader(Object singleHeader) {
        this.singleHeader = singleHeader;
    }

    public WebACLFieldToMatch withSingleHeader(Object singleHeader) {
        this.singleHeader = singleHeader;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singlequeryargument
     * 
     */
    @JsonIgnore
    public Object getSingleQueryArgument() {
        return singleQueryArgument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-singlequeryargument
     * 
     */
    @JsonIgnore
    public void setSingleQueryArgument(Object singleQueryArgument) {
        this.singleQueryArgument = singleQueryArgument;
    }

    public WebACLFieldToMatch withSingleQueryArgument(Object singleQueryArgument) {
        this.singleQueryArgument = singleQueryArgument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-allqueryarguments
     * 
     */
    @JsonIgnore
    public Object getAllQueryArguments() {
        return allQueryArguments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-allqueryarguments
     * 
     */
    @JsonIgnore
    public void setAllQueryArguments(Object allQueryArguments) {
        this.allQueryArguments = allQueryArguments;
    }

    public WebACLFieldToMatch withAllQueryArguments(Object allQueryArguments) {
        this.allQueryArguments = allQueryArguments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-uripath
     * 
     */
    @JsonIgnore
    public Object getUriPath() {
        return uriPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-uripath
     * 
     */
    @JsonIgnore
    public void setUriPath(Object uriPath) {
        this.uriPath = uriPath;
    }

    public WebACLFieldToMatch withUriPath(Object uriPath) {
        this.uriPath = uriPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-querystring
     * 
     */
    @JsonIgnore
    public Object getQueryString() {
        return queryString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-querystring
     * 
     */
    @JsonIgnore
    public void setQueryString(Object queryString) {
        this.queryString = queryString;
    }

    public WebACLFieldToMatch withQueryString(Object queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-body
     * 
     */
    @JsonIgnore
    public Object getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-body
     * 
     */
    @JsonIgnore
    public void setBody(Object body) {
        this.body = body;
    }

    public WebACLFieldToMatch withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-method
     * 
     */
    @JsonIgnore
    public Object getMethod() {
        return method;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-webacl-fieldtomatch.html#cfn-wafv2-webacl-fieldtomatch-method
     * 
     */
    @JsonIgnore
    public void setMethod(Object method) {
        this.method = method;
    }

    public WebACLFieldToMatch withMethod(Object method) {
        this.method = method;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("singleHeader", singleHeader).append("singleQueryArgument", singleQueryArgument).append("allQueryArguments", allQueryArguments).append("uriPath", uriPath).append("queryString", queryString).append("body", body).append("method", method).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(method).append(allQueryArguments).append(singleQueryArgument).append(singleHeader).append(queryString).append(body).append(uriPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebACLFieldToMatch) == false) {
            return false;
        }
        WebACLFieldToMatch rhs = ((WebACLFieldToMatch) other);
        return new EqualsBuilder().append(method, rhs.method).append(allQueryArguments, rhs.allQueryArguments).append(singleQueryArgument, rhs.singleQueryArgument).append(singleHeader, rhs.singleHeader).append(queryString, rhs.queryString).append(body, rhs.body).append(uriPath, rhs.uriPath).isEquals();
    }

}
