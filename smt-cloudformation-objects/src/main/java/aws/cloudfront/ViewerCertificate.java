
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ViewerCertificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "IamCertificateId",
    "SslSupportMethod",
    "MinimumProtocolVersion",
    "CloudFrontDefaultCertificate",
    "AcmCertificateArn"
})
public class ViewerCertificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid
     * 
     */
    @JsonProperty("IamCertificateId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid")
    private CharSequence iamCertificateId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod
     * 
     */
    @JsonProperty("SslSupportMethod")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod")
    private CharSequence sslSupportMethod;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion
     * 
     */
    @JsonProperty("MinimumProtocolVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion")
    private CharSequence minimumProtocolVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate
     * 
     */
    @JsonProperty("CloudFrontDefaultCertificate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate")
    private Boolean cloudFrontDefaultCertificate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn
     * 
     */
    @JsonProperty("AcmCertificateArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn")
    private CharSequence acmCertificateArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid
     * 
     */
    public CharSequence getIamCertificateId() {
        return iamCertificateId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-iamcertificateid
     * 
     */
    public void setIamCertificateId(CharSequence iamCertificateId) {
        this.iamCertificateId = iamCertificateId;
    }

    public ViewerCertificate withIamCertificateId(CharSequence iamCertificateId) {
        this.iamCertificateId = iamCertificateId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod
     * 
     */
    public CharSequence getSslSupportMethod() {
        return sslSupportMethod;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-sslsupportmethod
     * 
     */
    public void setSslSupportMethod(CharSequence sslSupportMethod) {
        this.sslSupportMethod = sslSupportMethod;
    }

    public ViewerCertificate withSslSupportMethod(CharSequence sslSupportMethod) {
        this.sslSupportMethod = sslSupportMethod;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion
     * 
     */
    public CharSequence getMinimumProtocolVersion() {
        return minimumProtocolVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-minimumprotocolversion
     * 
     */
    public void setMinimumProtocolVersion(CharSequence minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
    }

    public ViewerCertificate withMinimumProtocolVersion(CharSequence minimumProtocolVersion) {
        this.minimumProtocolVersion = minimumProtocolVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate
     * 
     */
    public Boolean getCloudFrontDefaultCertificate() {
        return cloudFrontDefaultCertificate;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-cloudfrontdefaultcertificate
     * 
     */
    public void setCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
    }

    public ViewerCertificate withCloudFrontDefaultCertificate(Boolean cloudFrontDefaultCertificate) {
        this.cloudFrontDefaultCertificate = cloudFrontDefaultCertificate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn
     * 
     */
    public CharSequence getAcmCertificateArn() {
        return acmCertificateArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-viewercertificate.html#cfn-cloudfront-distribution-viewercertificate-acmcertificatearn
     * 
     */
    public void setAcmCertificateArn(CharSequence acmCertificateArn) {
        this.acmCertificateArn = acmCertificateArn;
    }

    public ViewerCertificate withAcmCertificateArn(CharSequence acmCertificateArn) {
        this.acmCertificateArn = acmCertificateArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iamCertificateId", iamCertificateId).append("sslSupportMethod", sslSupportMethod).append("minimumProtocolVersion", minimumProtocolVersion).append("cloudFrontDefaultCertificate", cloudFrontDefaultCertificate).append("acmCertificateArn", acmCertificateArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(cloudFrontDefaultCertificate).append(acmCertificateArn).append(minimumProtocolVersion).append(iamCertificateId).append(sslSupportMethod).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ViewerCertificate) == false) {
            return false;
        }
        ViewerCertificate rhs = ((ViewerCertificate) other);
        return new EqualsBuilder().append(cloudFrontDefaultCertificate, rhs.cloudFrontDefaultCertificate).append(acmCertificateArn, rhs.acmCertificateArn).append(minimumProtocolVersion, rhs.minimumProtocolVersion).append(iamCertificateId, rhs.iamCertificateId).append(sslSupportMethod, rhs.sslSupportMethod).isEquals();
    }

}
