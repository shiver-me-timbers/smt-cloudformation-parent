
package aws.kinesisanalyticsv2;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * CodeContent
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ZipFileContent",
    "S3ContentLocation",
    "TextContent"
})
public class CodeContent {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent
     * 
     */
    @JsonProperty("ZipFileContent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent")
    private CharSequence zipFileContent;
    /**
     * S3ContentLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html
     * 
     */
    @JsonProperty("S3ContentLocation")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html")
    private S3ContentLocation s3ContentLocation;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent
     * 
     */
    @JsonProperty("TextContent")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent")
    private CharSequence textContent;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent
     * 
     */
    @JsonIgnore
    public CharSequence getZipFileContent() {
        return zipFileContent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-zipfilecontent
     * 
     */
    @JsonIgnore
    public void setZipFileContent(CharSequence zipFileContent) {
        this.zipFileContent = zipFileContent;
    }

    public CodeContent withZipFileContent(CharSequence zipFileContent) {
        this.zipFileContent = zipFileContent;
        return this;
    }

    /**
     * S3ContentLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html
     * 
     */
    @JsonIgnore
    public S3ContentLocation getS3ContentLocation() {
        return s3ContentLocation;
    }

    /**
     * S3ContentLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-s3contentlocation.html
     * 
     */
    @JsonIgnore
    public void setS3ContentLocation(S3ContentLocation s3ContentLocation) {
        this.s3ContentLocation = s3ContentLocation;
    }

    public CodeContent withS3ContentLocation(S3ContentLocation s3ContentLocation) {
        this.s3ContentLocation = s3ContentLocation;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent
     * 
     */
    @JsonIgnore
    public CharSequence getTextContent() {
        return textContent;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-application-codecontent.html#cfn-kinesisanalyticsv2-application-codecontent-textcontent
     * 
     */
    @JsonIgnore
    public void setTextContent(CharSequence textContent) {
        this.textContent = textContent;
    }

    public CodeContent withTextContent(CharSequence textContent) {
        this.textContent = textContent;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("zipFileContent", zipFileContent).append("s3ContentLocation", s3ContentLocation).append("textContent", textContent).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(s3ContentLocation).append(zipFileContent).append(textContent).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CodeContent) == false) {
            return false;
        }
        CodeContent rhs = ((CodeContent) other);
        return new EqualsBuilder().append(s3ContentLocation, rhs.s3ContentLocation).append(zipFileContent, rhs.zipFileContent).append(textContent, rhs.textContent).isEquals();
    }

}
