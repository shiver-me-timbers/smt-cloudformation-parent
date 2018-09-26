
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CustomErrorResponse
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ResponseCode",
    "ErrorCachingMinTTL",
    "ErrorCode",
    "ResponsePagePath"
})
public class CustomErrorResponse {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode
     * 
     */
    @JsonProperty("ResponseCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode")
    private Integer responseCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl
     * 
     */
    @JsonProperty("ErrorCachingMinTTL")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl")
    private Double errorCachingMinTTL;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode
     * 
     */
    @JsonProperty("ErrorCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode")
    private Integer errorCode;
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
    public Integer getResponseCode() {
        return responseCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsecode
     * 
     */
    public void setResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
    }

    public CustomErrorResponse withResponseCode(Integer responseCode) {
        this.responseCode = responseCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl
     * 
     */
    public Double getErrorCachingMinTTL() {
        return errorCachingMinTTL;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcachingminttl
     * 
     */
    public void setErrorCachingMinTTL(Double errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
    }

    public CustomErrorResponse withErrorCachingMinTTL(Double errorCachingMinTTL) {
        this.errorCachingMinTTL = errorCachingMinTTL;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode
     * 
     */
    public Integer getErrorCode() {
        return errorCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-errorcode
     * 
     */
    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public CustomErrorResponse withErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath
     * 
     */
    public CharSequence getResponsePagePath() {
        return responsePagePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-customerrorresponse.html#cfn-cloudfront-distribution-customerrorresponse-responsepagepath
     * 
     */
    public void setResponsePagePath(CharSequence responsePagePath) {
        this.responsePagePath = responsePagePath;
    }

    public CustomErrorResponse withResponsePagePath(CharSequence responsePagePath) {
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
        if ((other instanceof CustomErrorResponse) == false) {
            return false;
        }
        CustomErrorResponse rhs = ((CustomErrorResponse) other);
        return new EqualsBuilder().append(errorCode, rhs.errorCode).append(responsePagePath, rhs.responsePagePath).append(errorCachingMinTTL, rhs.errorCachingMinTTL).append(responseCode, rhs.responseCode).isEquals();
    }

}
