
package shiver.me.timbers.aws.codebuild;

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
 * ReportGroupReportExportConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "S3Destination",
    "ExportConfigType"
})
public class ReportGroupReportExportConfig implements Property<ReportGroupReportExportConfig>
{

    /**
     * ReportGroupS3ReportExportConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html
     * 
     */
    @JsonProperty("S3Destination")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html")
    private Property<ReportGroupS3ReportExportConfig> s3Destination;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-exportconfigtype
     * 
     */
    @JsonProperty("ExportConfigType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-exportconfigtype")
    private CharSequence exportConfigType;

    /**
     * ReportGroupS3ReportExportConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html
     * 
     */
    @JsonIgnore
    public Property<ReportGroupS3ReportExportConfig> getS3Destination() {
        return s3Destination;
    }

    /**
     * ReportGroupS3ReportExportConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html
     * 
     */
    @JsonIgnore
    public void setS3Destination(Property<ReportGroupS3ReportExportConfig> s3Destination) {
        this.s3Destination = s3Destination;
    }

    public ReportGroupReportExportConfig withS3Destination(Property<ReportGroupS3ReportExportConfig> s3Destination) {
        this.s3Destination = s3Destination;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-exportconfigtype
     * 
     */
    @JsonIgnore
    public CharSequence getExportConfigType() {
        return exportConfigType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html#cfn-codebuild-reportgroup-reportexportconfig-exportconfigtype
     * 
     */
    @JsonIgnore
    public void setExportConfigType(CharSequence exportConfigType) {
        this.exportConfigType = exportConfigType;
    }

    public ReportGroupReportExportConfig withExportConfigType(CharSequence exportConfigType) {
        this.exportConfigType = exportConfigType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("s3Destination", s3Destination).append("exportConfigType", exportConfigType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(exportConfigType).append(s3Destination).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReportGroupReportExportConfig) == false) {
            return false;
        }
        ReportGroupReportExportConfig rhs = ((ReportGroupReportExportConfig) other);
        return new EqualsBuilder().append(exportConfigType, rhs.exportConfigType).append(s3Destination, rhs.s3Destination).isEquals();
    }

}
