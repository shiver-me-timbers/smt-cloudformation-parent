
package shiver.me.timbers.aws.medialive;

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
 * ChannelInputAttachment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InputAttachmentName",
    "InputId",
    "InputSettings"
})
public class ChannelInputAttachment implements Property<ChannelInputAttachment>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputattachmentname
     * 
     */
    @JsonProperty("InputAttachmentName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputattachmentname")
    private CharSequence inputAttachmentName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputid
     * 
     */
    @JsonProperty("InputId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputid")
    private CharSequence inputId;
    /**
     * ChannelHlsInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
     * 
     */
    @JsonProperty("InputSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html")
    private Property<ChannelInputSettings> inputSettings;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputattachmentname
     * 
     */
    @JsonIgnore
    public CharSequence getInputAttachmentName() {
        return inputAttachmentName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputattachmentname
     * 
     */
    @JsonIgnore
    public void setInputAttachmentName(CharSequence inputAttachmentName) {
        this.inputAttachmentName = inputAttachmentName;
    }

    public ChannelInputAttachment withInputAttachmentName(CharSequence inputAttachmentName) {
        this.inputAttachmentName = inputAttachmentName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputid
     * 
     */
    @JsonIgnore
    public CharSequence getInputId() {
        return inputId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputattachment.html#cfn-medialive-channel-inputattachment-inputid
     * 
     */
    @JsonIgnore
    public void setInputId(CharSequence inputId) {
        this.inputId = inputId;
    }

    public ChannelInputAttachment withInputId(CharSequence inputId) {
        this.inputId = inputId;
        return this;
    }

    /**
     * ChannelHlsInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelInputSettings> getInputSettings() {
        return inputSettings;
    }

    /**
     * ChannelHlsInputSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-hlsinputsettings.html
     * 
     */
    @JsonIgnore
    public void setInputSettings(Property<ChannelInputSettings> inputSettings) {
        this.inputSettings = inputSettings;
    }

    public ChannelInputAttachment withInputSettings(Property<ChannelInputSettings> inputSettings) {
        this.inputSettings = inputSettings;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("inputAttachmentName", inputAttachmentName).append("inputId", inputId).append("inputSettings", inputSettings).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(inputId).append(inputAttachmentName).append(inputSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelInputAttachment) == false) {
            return false;
        }
        ChannelInputAttachment rhs = ((ChannelInputAttachment) other);
        return new EqualsBuilder().append(inputId, rhs.inputId).append(inputAttachmentName, rhs.inputAttachmentName).append(inputSettings, rhs.inputSettings).isEquals();
    }

}
