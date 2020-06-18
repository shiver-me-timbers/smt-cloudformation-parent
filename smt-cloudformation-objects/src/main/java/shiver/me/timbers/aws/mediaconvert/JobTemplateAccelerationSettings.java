
package shiver.me.timbers.aws.mediaconvert;

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
 * JobTemplateAccelerationSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Mode"
})
public class JobTemplateAccelerationSettings implements Property<JobTemplateAccelerationSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html#cfn-mediaconvert-jobtemplate-accelerationsettings-mode
     * 
     */
    @JsonProperty("Mode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html#cfn-mediaconvert-jobtemplate-accelerationsettings-mode")
    private CharSequence mode;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html#cfn-mediaconvert-jobtemplate-accelerationsettings-mode
     * 
     */
    @JsonIgnore
    public CharSequence getMode() {
        return mode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-mediaconvert-jobtemplate-accelerationsettings.html#cfn-mediaconvert-jobtemplate-accelerationsettings-mode
     * 
     */
    @JsonIgnore
    public void setMode(CharSequence mode) {
        this.mode = mode;
    }

    public JobTemplateAccelerationSettings withMode(CharSequence mode) {
        this.mode = mode;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("mode", mode).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(mode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof JobTemplateAccelerationSettings) == false) {
            return false;
        }
        JobTemplateAccelerationSettings rhs = ((JobTemplateAccelerationSettings) other);
        return new EqualsBuilder().append(mode, rhs.mode).isEquals();
    }

}
