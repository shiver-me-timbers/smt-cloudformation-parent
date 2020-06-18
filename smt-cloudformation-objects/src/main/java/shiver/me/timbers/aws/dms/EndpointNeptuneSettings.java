
package shiver.me.timbers.aws.dms;

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
 * EndpointNeptuneSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "MaxRetryCount",
    "MaxFileSize",
    "S3BucketFolder",
    "ErrorRetryDuration",
    "IamAuthEnabled",
    "S3BucketName",
    "ServiceAccessRoleArn"
})
public class EndpointNeptuneSettings implements Property<EndpointNeptuneSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxretrycount
     * 
     */
    @JsonProperty("MaxRetryCount")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxretrycount")
    private Number maxRetryCount;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxfilesize
     * 
     */
    @JsonProperty("MaxFileSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxfilesize")
    private Number maxFileSize;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketfolder
     * 
     */
    @JsonProperty("S3BucketFolder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketfolder")
    private CharSequence s3BucketFolder;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-errorretryduration
     * 
     */
    @JsonProperty("ErrorRetryDuration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-errorretryduration")
    private Number errorRetryDuration;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-iamauthenabled
     * 
     */
    @JsonProperty("IamAuthEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-iamauthenabled")
    private CharSequence iamAuthEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketname
     * 
     */
    @JsonProperty("S3BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketname")
    private CharSequence s3BucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-serviceaccessrolearn")
    private CharSequence serviceAccessRoleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxretrycount
     * 
     */
    @JsonIgnore
    public Number getMaxRetryCount() {
        return maxRetryCount;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxretrycount
     * 
     */
    @JsonIgnore
    public void setMaxRetryCount(Number maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
    }

    public EndpointNeptuneSettings withMaxRetryCount(Number maxRetryCount) {
        this.maxRetryCount = maxRetryCount;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxfilesize
     * 
     */
    @JsonIgnore
    public Number getMaxFileSize() {
        return maxFileSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-maxfilesize
     * 
     */
    @JsonIgnore
    public void setMaxFileSize(Number maxFileSize) {
        this.maxFileSize = maxFileSize;
    }

    public EndpointNeptuneSettings withMaxFileSize(Number maxFileSize) {
        this.maxFileSize = maxFileSize;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketfolder
     * 
     */
    @JsonIgnore
    public CharSequence getS3BucketFolder() {
        return s3BucketFolder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketfolder
     * 
     */
    @JsonIgnore
    public void setS3BucketFolder(CharSequence s3BucketFolder) {
        this.s3BucketFolder = s3BucketFolder;
    }

    public EndpointNeptuneSettings withS3BucketFolder(CharSequence s3BucketFolder) {
        this.s3BucketFolder = s3BucketFolder;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-errorretryduration
     * 
     */
    @JsonIgnore
    public Number getErrorRetryDuration() {
        return errorRetryDuration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-errorretryduration
     * 
     */
    @JsonIgnore
    public void setErrorRetryDuration(Number errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
    }

    public EndpointNeptuneSettings withErrorRetryDuration(Number errorRetryDuration) {
        this.errorRetryDuration = errorRetryDuration;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-iamauthenabled
     * 
     */
    @JsonIgnore
    public CharSequence getIamAuthEnabled() {
        return iamAuthEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-iamauthenabled
     * 
     */
    @JsonIgnore
    public void setIamAuthEnabled(CharSequence iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
    }

    public EndpointNeptuneSettings withIamAuthEnabled(CharSequence iamAuthEnabled) {
        this.iamAuthEnabled = iamAuthEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getS3BucketName() {
        return s3BucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-s3bucketname
     * 
     */
    @JsonIgnore
    public void setS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
    }

    public EndpointNeptuneSettings withS3BucketName(CharSequence s3BucketName) {
        this.s3BucketName = s3BucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-serviceaccessrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-neptunesettings.html#cfn-dms-endpoint-neptunesettings-serviceaccessrolearn
     * 
     */
    @JsonIgnore
    public void setServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    public EndpointNeptuneSettings withServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("maxRetryCount", maxRetryCount).append("maxFileSize", maxFileSize).append("s3BucketFolder", s3BucketFolder).append("errorRetryDuration", errorRetryDuration).append("iamAuthEnabled", iamAuthEnabled).append("s3BucketName", s3BucketName).append("serviceAccessRoleArn", serviceAccessRoleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceAccessRoleArn).append(s3BucketFolder).append(iamAuthEnabled).append(s3BucketName).append(maxRetryCount).append(maxFileSize).append(errorRetryDuration).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointNeptuneSettings) == false) {
            return false;
        }
        EndpointNeptuneSettings rhs = ((EndpointNeptuneSettings) other);
        return new EqualsBuilder().append(serviceAccessRoleArn, rhs.serviceAccessRoleArn).append(s3BucketFolder, rhs.s3BucketFolder).append(iamAuthEnabled, rhs.iamAuthEnabled).append(s3BucketName, rhs.s3BucketName).append(maxRetryCount, rhs.maxRetryCount).append(maxFileSize, rhs.maxFileSize).append(errorRetryDuration, rhs.errorRetryDuration).isEquals();
    }

}
