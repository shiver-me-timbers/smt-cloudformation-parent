
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
 * ChannelAudioLanguageSelection
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "LanguageCode",
    "LanguageSelectionPolicy"
})
public class ChannelAudioLanguageSelection implements Property<ChannelAudioLanguageSelection>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languagecode
     * 
     */
    @JsonProperty("LanguageCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languagecode")
    private CharSequence languageCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languageselectionpolicy
     * 
     */
    @JsonProperty("LanguageSelectionPolicy")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languageselectionpolicy")
    private CharSequence languageSelectionPolicy;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languagecode
     * 
     */
    @JsonIgnore
    public CharSequence getLanguageCode() {
        return languageCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languagecode
     * 
     */
    @JsonIgnore
    public void setLanguageCode(CharSequence languageCode) {
        this.languageCode = languageCode;
    }

    public ChannelAudioLanguageSelection withLanguageCode(CharSequence languageCode) {
        this.languageCode = languageCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languageselectionpolicy
     * 
     */
    @JsonIgnore
    public CharSequence getLanguageSelectionPolicy() {
        return languageSelectionPolicy;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-audiolanguageselection.html#cfn-medialive-channel-audiolanguageselection-languageselectionpolicy
     * 
     */
    @JsonIgnore
    public void setLanguageSelectionPolicy(CharSequence languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
    }

    public ChannelAudioLanguageSelection withLanguageSelectionPolicy(CharSequence languageSelectionPolicy) {
        this.languageSelectionPolicy = languageSelectionPolicy;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("languageCode", languageCode).append("languageSelectionPolicy", languageSelectionPolicy).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(languageCode).append(languageSelectionPolicy).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelAudioLanguageSelection) == false) {
            return false;
        }
        ChannelAudioLanguageSelection rhs = ((ChannelAudioLanguageSelection) other);
        return new EqualsBuilder().append(languageCode, rhs.languageCode).append(languageSelectionPolicy, rhs.languageSelectionPolicy).isEquals();
    }

}
