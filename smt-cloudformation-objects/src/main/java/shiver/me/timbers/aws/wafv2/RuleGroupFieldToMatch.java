
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
 * RuleGroupFieldToMatch
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html
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
public class RuleGroupFieldToMatch implements Property<RuleGroupFieldToMatch>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singleheader
     * 
     */
    @JsonProperty("SingleHeader")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singleheader")
    private Object singleHeader;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singlequeryargument
     * 
     */
    @JsonProperty("SingleQueryArgument")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singlequeryargument")
    private Object singleQueryArgument;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-allqueryarguments
     * 
     */
    @JsonProperty("AllQueryArguments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-allqueryarguments")
    private Object allQueryArguments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-uripath
     * 
     */
    @JsonProperty("UriPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-uripath")
    private Object uriPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-querystring
     * 
     */
    @JsonProperty("QueryString")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-querystring")
    private Object queryString;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-body
     * 
     */
    @JsonProperty("Body")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-body")
    private Object body;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-method
     * 
     */
    @JsonProperty("Method")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-method")
    private Object method;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singleheader
     * 
     */
    @JsonIgnore
    public Object getSingleHeader() {
        return singleHeader;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singleheader
     * 
     */
    @JsonIgnore
    public void setSingleHeader(Object singleHeader) {
        this.singleHeader = singleHeader;
    }

    public RuleGroupFieldToMatch withSingleHeader(Object singleHeader) {
        this.singleHeader = singleHeader;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singlequeryargument
     * 
     */
    @JsonIgnore
    public Object getSingleQueryArgument() {
        return singleQueryArgument;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-singlequeryargument
     * 
     */
    @JsonIgnore
    public void setSingleQueryArgument(Object singleQueryArgument) {
        this.singleQueryArgument = singleQueryArgument;
    }

    public RuleGroupFieldToMatch withSingleQueryArgument(Object singleQueryArgument) {
        this.singleQueryArgument = singleQueryArgument;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-allqueryarguments
     * 
     */
    @JsonIgnore
    public Object getAllQueryArguments() {
        return allQueryArguments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-allqueryarguments
     * 
     */
    @JsonIgnore
    public void setAllQueryArguments(Object allQueryArguments) {
        this.allQueryArguments = allQueryArguments;
    }

    public RuleGroupFieldToMatch withAllQueryArguments(Object allQueryArguments) {
        this.allQueryArguments = allQueryArguments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-uripath
     * 
     */
    @JsonIgnore
    public Object getUriPath() {
        return uriPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-uripath
     * 
     */
    @JsonIgnore
    public void setUriPath(Object uriPath) {
        this.uriPath = uriPath;
    }

    public RuleGroupFieldToMatch withUriPath(Object uriPath) {
        this.uriPath = uriPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-querystring
     * 
     */
    @JsonIgnore
    public Object getQueryString() {
        return queryString;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-querystring
     * 
     */
    @JsonIgnore
    public void setQueryString(Object queryString) {
        this.queryString = queryString;
    }

    public RuleGroupFieldToMatch withQueryString(Object queryString) {
        this.queryString = queryString;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-body
     * 
     */
    @JsonIgnore
    public Object getBody() {
        return body;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-body
     * 
     */
    @JsonIgnore
    public void setBody(Object body) {
        this.body = body;
    }

    public RuleGroupFieldToMatch withBody(Object body) {
        this.body = body;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-method
     * 
     */
    @JsonIgnore
    public Object getMethod() {
        return method;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-wafv2-rulegroup-fieldtomatch.html#cfn-wafv2-rulegroup-fieldtomatch-method
     * 
     */
    @JsonIgnore
    public void setMethod(Object method) {
        this.method = method;
    }

    public RuleGroupFieldToMatch withMethod(Object method) {
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
        if ((other instanceof RuleGroupFieldToMatch) == false) {
            return false;
        }
        RuleGroupFieldToMatch rhs = ((RuleGroupFieldToMatch) other);
        return new EqualsBuilder().append(method, rhs.method).append(allQueryArguments, rhs.allQueryArguments).append(singleQueryArgument, rhs.singleQueryArgument).append(singleHeader, rhs.singleHeader).append(queryString, rhs.queryString).append(body, rhs.body).append(uriPath, rhs.uriPath).isEquals();
    }

}
