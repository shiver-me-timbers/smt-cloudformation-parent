
package aws.kinesisanalytics;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApplicationReferenceDataSource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApplicationName",
    "ReferenceDataSource"
})
public class ApplicationReferenceDataSource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname
     * 
     */
    @JsonProperty("ApplicationName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname")
    private CharSequence applicationName;
    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    @JsonProperty("ReferenceDataSource")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html")
    private S3ReferenceDataSource referenceDataSource;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname
     * 
     */
    public CharSequence getApplicationName() {
        return applicationName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname
     * 
     */
    public void setApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
    }

    public ApplicationReferenceDataSource withApplicationName(CharSequence applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    public S3ReferenceDataSource getReferenceDataSource() {
        return referenceDataSource;
    }

    /**
     * S3ReferenceDataSource
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html
     * 
     */
    public void setReferenceDataSource(S3ReferenceDataSource referenceDataSource) {
        this.referenceDataSource = referenceDataSource;
    }

    public ApplicationReferenceDataSource withReferenceDataSource(S3ReferenceDataSource referenceDataSource) {
        this.referenceDataSource = referenceDataSource;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("applicationName", applicationName).append("referenceDataSource", referenceDataSource).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(applicationName).append(referenceDataSource).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApplicationReferenceDataSource) == false) {
            return false;
        }
        ApplicationReferenceDataSource rhs = ((ApplicationReferenceDataSource) other);
        return new EqualsBuilder().append(applicationName, rhs.applicationName).append(referenceDataSource, rhs.referenceDataSource).isEquals();
    }

}
