
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
 * EndpointS3Settings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ExternalTableDefinition",
    "BucketName",
    "BucketFolder",
    "CsvRowDelimiter",
    "CsvDelimiter",
    "ServiceAccessRoleArn",
    "CompressionType"
})
public class EndpointS3Settings implements Property<EndpointS3Settings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition
     * 
     */
    @JsonProperty("ExternalTableDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition")
    private CharSequence externalTableDefinition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname")
    private CharSequence bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder
     * 
     */
    @JsonProperty("BucketFolder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder")
    private CharSequence bucketFolder;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter
     * 
     */
    @JsonProperty("CsvRowDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter")
    private CharSequence csvRowDelimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter
     * 
     */
    @JsonProperty("CsvDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter")
    private CharSequence csvDelimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn")
    private CharSequence serviceAccessRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype
     * 
     */
    @JsonProperty("CompressionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype")
    private CharSequence compressionType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition
     * 
     */
    @JsonIgnore
    public CharSequence getExternalTableDefinition() {
        return externalTableDefinition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition
     * 
     */
    @JsonIgnore
    public void setExternalTableDefinition(CharSequence externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    public EndpointS3Settings withExternalTableDefinition(CharSequence externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname
     * 
     */
    @JsonIgnore
    public CharSequence getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname
     * 
     */
    @JsonIgnore
    public void setBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
    }

    public EndpointS3Settings withBucketName(CharSequence bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder
     * 
     */
    @JsonIgnore
    public CharSequence getBucketFolder() {
        return bucketFolder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder
     * 
     */
    @JsonIgnore
    public void setBucketFolder(CharSequence bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    public EndpointS3Settings withBucketFolder(CharSequence bucketFolder) {
        this.bucketFolder = bucketFolder;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter
     * 
     */
    @JsonIgnore
    public CharSequence getCsvRowDelimiter() {
        return csvRowDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter
     * 
     */
    @JsonIgnore
    public void setCsvRowDelimiter(CharSequence csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
    }

    public EndpointS3Settings withCsvRowDelimiter(CharSequence csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter
     * 
     */
    @JsonIgnore
    public CharSequence getCsvDelimiter() {
        return csvDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter
     * 
     */
    @JsonIgnore
    public void setCsvDelimiter(CharSequence csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
    }

    public EndpointS3Settings withCsvDelimiter(CharSequence csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn
     * 
     */
    @JsonIgnore
    public CharSequence getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn
     * 
     */
    @JsonIgnore
    public void setServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    public EndpointS3Settings withServiceAccessRoleArn(CharSequence serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype
     * 
     */
    @JsonIgnore
    public CharSequence getCompressionType() {
        return compressionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype
     * 
     */
    @JsonIgnore
    public void setCompressionType(CharSequence compressionType) {
        this.compressionType = compressionType;
    }

    public EndpointS3Settings withCompressionType(CharSequence compressionType) {
        this.compressionType = compressionType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("externalTableDefinition", externalTableDefinition).append("bucketName", bucketName).append("bucketFolder", bucketFolder).append("csvRowDelimiter", csvRowDelimiter).append("csvDelimiter", csvDelimiter).append("serviceAccessRoleArn", serviceAccessRoleArn).append("compressionType", compressionType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(serviceAccessRoleArn).append(externalTableDefinition).append(bucketName).append(bucketFolder).append(csvRowDelimiter).append(compressionType).append(csvDelimiter).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof EndpointS3Settings) == false) {
            return false;
        }
        EndpointS3Settings rhs = ((EndpointS3Settings) other);
        return new EqualsBuilder().append(serviceAccessRoleArn, rhs.serviceAccessRoleArn).append(externalTableDefinition, rhs.externalTableDefinition).append(bucketName, rhs.bucketName).append(bucketFolder, rhs.bucketFolder).append(csvRowDelimiter, rhs.csvRowDelimiter).append(compressionType, rhs.compressionType).append(csvDelimiter, rhs.csvDelimiter).isEquals();
    }

}
