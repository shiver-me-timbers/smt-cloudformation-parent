
package aws.cloudfront;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DistributionCustomErrorResponse
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ResponseCode",
    "ErrorCachingMinTTL",
    "ErrorCode",
    "ResponsePagePath"
})
public class DistributionCustomErrorResponse implements Property<DistributionCustomErrorResponse>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode
     * 
     */
    @JsonProperty("ResponseCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode")
    private Number responseCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl
     * 
     */
    @JsonProperty("ErrorCachingMinTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl")
    private Number errorCachingMinTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode
     * 
     */
    @JsonProperty("ErrorCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode")
    private Number errorCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath
     * 
     */
    @JsonProperty("ResponsePagePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath")
    private CharSequence responsePagePath;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode
     * 
     */
    @JsonIgnore
    public Number getResponseCode() {
        return responseCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode
     * 
     */
    @JsonIgnore
    public void setResponseCode(Number responseCode) {
        this.responseCode = responseCode;
    }

    public DistributionCustomErrorResponse withResponseCode(Number responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl
     * 
     */
    @JsonIgnore
    public Number getErrorCachingMinTTL() {
        return errorCachingMinTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl
     * 
     */
    @JsonIgnore
    public void setErrorCachingMinTTL(Number errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
    }

    public DistributionCustomErrorResponse withErrorCachingMinTTL(Number errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode
     * 
     */
    @JsonIgnore
    public Number getErrorCode() {
        return errorCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode
     * 
     */
    @JsonIgnore
    public void setErrorCode(Number errorCode) {
        this.errorCode = errorCode;
    }

    public DistributionCustomErrorResponse withErrorCode(Number errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath
     * 
     */
    @JsonIgnore
    public CharSequence getResponsePagePath() {
        return responsePagePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath
     * 
     */
    @JsonIgnore
    public void setResponsePagePath(CharSequence responsePagePath) {
        this.responsePagePath = responsePagePath;
    }

    public DistributionCustomErrorResponse withResponsePagePath(CharSequence responsePagePath) {
        this.responsePagePath = responsePagePath;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("responseCode", responseCode).append("errorCachingMinTTL", errorCachingMinTTL).append("errorCode", errorCode).append("responsePagePath", responsePagePath).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(errorCode).append(responsePagePath).append(errorCachingMinTTL).append(responseCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionCustomErrorResponse) == false) {
            return false;
        }
        DistributionCustomErrorResponse rhs = ((DistributionCustomErrorResponse) other);
        return new EqualsBuilder().append(errorCode, rhs.errorCode).append(responsePagePath, rhs.responsePagePath).append(errorCachingMinTTL, rhs.errorCachingMinTTL).append(responseCode, rhs.responseCode).isEquals();
    }

}
