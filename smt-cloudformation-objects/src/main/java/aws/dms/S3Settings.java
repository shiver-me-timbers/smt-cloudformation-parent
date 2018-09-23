
package aws.dms;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * S3Settings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ExternalTableDefinition",
    "BucketName",
    "BucketFolder",
    "CsvRowDelimiter",
    "CsvDelimiter",
    "ServiceAccessRoleArn",
    "CompressionType"
})
public class S3Settings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition
     * 
     */
    @JsonProperty("ExternalTableDefinition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition")
    private String externalTableDefinition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname
     * 
     */
    @JsonProperty("BucketName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname")
    private String bucketName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder
     * 
     */
    @JsonProperty("BucketFolder")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder")
    private String bucketFolder;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter
     * 
     */
    @JsonProperty("CsvRowDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter")
    private String csvRowDelimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter
     * 
     */
    @JsonProperty("CsvDelimiter")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter")
    private String csvDelimiter;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn")
    private String serviceAccessRoleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype
     * 
     */
    @JsonProperty("CompressionType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype")
    private String compressionType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition
     * 
     */
    @JsonProperty("ExternalTableDefinition")
    public String getExternalTableDefinition() {
        return externalTableDefinition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-externaltabledefinition
     * 
     */
    @JsonProperty("ExternalTableDefinition")
    public void setExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
    }

    public S3Settings withExternalTableDefinition(String externalTableDefinition) {
        this.externalTableDefinition = externalTableDefinition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname
     * 
     */
    @JsonProperty("BucketName")
    public String getBucketName() {
        return bucketName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketname
     * 
     */
    @JsonProperty("BucketName")
    public void setBucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public S3Settings withBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder
     * 
     */
    @JsonProperty("BucketFolder")
    public String getBucketFolder() {
        return bucketFolder;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-bucketfolder
     * 
     */
    @JsonProperty("BucketFolder")
    public void setBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
    }

    public S3Settings withBucketFolder(String bucketFolder) {
        this.bucketFolder = bucketFolder;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter
     * 
     */
    @JsonProperty("CsvRowDelimiter")
    public String getCsvRowDelimiter() {
        return csvRowDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvrowdelimiter
     * 
     */
    @JsonProperty("CsvRowDelimiter")
    public void setCsvRowDelimiter(String csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
    }

    public S3Settings withCsvRowDelimiter(String csvRowDelimiter) {
        this.csvRowDelimiter = csvRowDelimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter
     * 
     */
    @JsonProperty("CsvDelimiter")
    public String getCsvDelimiter() {
        return csvDelimiter;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-csvdelimiter
     * 
     */
    @JsonProperty("CsvDelimiter")
    public void setCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
    }

    public S3Settings withCsvDelimiter(String csvDelimiter) {
        this.csvDelimiter = csvDelimiter;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    public String getServiceAccessRoleArn() {
        return serviceAccessRoleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-serviceaccessrolearn
     * 
     */
    @JsonProperty("ServiceAccessRoleArn")
    public void setServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
    }

    public S3Settings withServiceAccessRoleArn(String serviceAccessRoleArn) {
        this.serviceAccessRoleArn = serviceAccessRoleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype
     * 
     */
    @JsonProperty("CompressionType")
    public String getCompressionType() {
        return compressionType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-s3settings.html#cfn-dms-endpoint-s3settings-compressiontype
     * 
     */
    @JsonProperty("CompressionType")
    public void setCompressionType(String compressionType) {
        this.compressionType = compressionType;
    }

    public S3Settings withCompressionType(String compressionType) {
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
        if ((other instanceof S3Settings) == false) {
            return false;
        }
        S3Settings rhs = ((S3Settings) other);
        return new EqualsBuilder().append(serviceAccessRoleArn, rhs.serviceAccessRoleArn).append(externalTableDefinition, rhs.externalTableDefinition).append(bucketName, rhs.bucketName).append(bucketFolder, rhs.bucketFolder).append(csvRowDelimiter, rhs.csvRowDelimiter).append(compressionType, rhs.compressionType).append(csvDelimiter, rhs.csvDelimiter).isEquals();
    }

}