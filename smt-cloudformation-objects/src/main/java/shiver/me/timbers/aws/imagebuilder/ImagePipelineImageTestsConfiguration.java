
package shiver.me.timbers.aws.imagebuilder;

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
 * ImagePipelineImageTestsConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ImageTestsEnabled",
    "TimeoutMinutes"
})
public class ImagePipelineImageTestsConfiguration implements Property<ImagePipelineImageTestsConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-imagetestsenabled
     * 
     */
    @JsonProperty("ImageTestsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-imagetestsenabled")
    private CharSequence imageTestsEnabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-timeoutminutes
     * 
     */
    @JsonProperty("TimeoutMinutes")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-timeoutminutes")
    private Number timeoutMinutes;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-imagetestsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getImageTestsEnabled() {
        return imageTestsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-imagetestsenabled
     * 
     */
    @JsonIgnore
    public void setImageTestsEnabled(CharSequence imageTestsEnabled) {
        this.imageTestsEnabled = imageTestsEnabled;
    }

    public ImagePipelineImageTestsConfiguration withImageTestsEnabled(CharSequence imageTestsEnabled) {
        this.imageTestsEnabled = imageTestsEnabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-timeoutminutes
     * 
     */
    @JsonIgnore
    public Number getTimeoutMinutes() {
        return timeoutMinutes;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-imagepipeline-imagetestsconfiguration.html#cfn-imagebuilder-imagepipeline-imagetestsconfiguration-timeoutminutes
     * 
     */
    @JsonIgnore
    public void setTimeoutMinutes(Number timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
    }

    public ImagePipelineImageTestsConfiguration withTimeoutMinutes(Number timeoutMinutes) {
        this.timeoutMinutes = timeoutMinutes;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("imageTestsEnabled", imageTestsEnabled).append("timeoutMinutes", timeoutMinutes).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeoutMinutes).append(imageTestsEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ImagePipelineImageTestsConfiguration) == false) {
            return false;
        }
        ImagePipelineImageTestsConfiguration rhs = ((ImagePipelineImageTestsConfiguration) other);
        return new EqualsBuilder().append(timeoutMinutes, rhs.timeoutMinutes).append(imageTestsEnabled, rhs.imageTestsEnabled).isEquals();
    }

}
