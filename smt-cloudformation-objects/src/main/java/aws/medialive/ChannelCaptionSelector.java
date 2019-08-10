
package aws.medialive;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ChannelCaptionSelector
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LanguageCode",
    "SelectorSettings",
    "Name"
})
public class ChannelCaptionSelector implements Property<ChannelCaptionSelector>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-languagecode
     * 
     */
    @JsonProperty("LanguageCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-languagecode")
    private CharSequence languageCode;
    /**
     * ChannelCaptionSelectorSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html
     * 
     */
    @JsonProperty("SelectorSettings")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html")
    private Property<ChannelCaptionSelectorSettings> selectorSettings;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-name")
    private CharSequence name;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-languagecode
     * 
     */
    @JsonIgnore
    public CharSequence getLanguageCode() {
        return languageCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-languagecode
     * 
     */
    @JsonIgnore
    public void setLanguageCode(CharSequence languageCode) {
        this.languageCode = languageCode;
    }

    public ChannelCaptionSelector withLanguageCode(CharSequence languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * ChannelCaptionSelectorSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html
     * 
     */
    @JsonIgnore
    public Property<ChannelCaptionSelectorSettings> getSelectorSettings() {
        return selectorSettings;
    }

    /**
     * ChannelCaptionSelectorSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselectorsettings.html
     * 
     */
    @JsonIgnore
    public void setSelectorSettings(Property<ChannelCaptionSelectorSettings> selectorSettings) {
        this.selectorSettings = selectorSettings;
    }

    public ChannelCaptionSelector withSelectorSettings(Property<ChannelCaptionSelectorSettings> selectorSettings) {
        this.selectorSettings = selectorSettings;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-name
     * 
     */
    @JsonIgnore
    public CharSequence getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-captionselector.html#cfn-medialive-channel-captionselector-name
     * 
     */
    @JsonIgnore
    public void setName(CharSequence name) {
        this.name = name;
    }

    public ChannelCaptionSelector withName(CharSequence name) {
        this.name = name;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("languageCode", languageCode).append("selectorSettings", selectorSettings).append("name", name).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(languageCode).append(selectorSettings).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelCaptionSelector) == false) {
            return false;
        }
        ChannelCaptionSelector rhs = ((ChannelCaptionSelector) other);
        return new EqualsBuilder().append(name, rhs.name).append(languageCode, rhs.languageCode).append(selectorSettings, rhs.selectorSettings).isEquals();
    }

}
