
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
 * ChannelTeletextSourceSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "PageNumber"
})
public class ChannelTeletextSourceSettings implements Property<ChannelTeletextSourceSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html#cfn-medialive-channel-teletextsourcesettings-pagenumber
     * 
     */
    @JsonProperty("PageNumber")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html#cfn-medialive-channel-teletextsourcesettings-pagenumber")
    private CharSequence pageNumber;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html#cfn-medialive-channel-teletextsourcesettings-pagenumber
     * 
     */
    @JsonIgnore
    public CharSequence getPageNumber() {
        return pageNumber;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-teletextsourcesettings.html#cfn-medialive-channel-teletextsourcesettings-pagenumber
     * 
     */
    @JsonIgnore
    public void setPageNumber(CharSequence pageNumber) {
        this.pageNumber = pageNumber;
    }

    public ChannelTeletextSourceSettings withPageNumber(CharSequence pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("pageNumber", pageNumber).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pageNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ChannelTeletextSourceSettings) == false) {
            return false;
        }
        ChannelTeletextSourceSettings rhs = ((ChannelTeletextSourceSettings) other);
        return new EqualsBuilder().append(pageNumber, rhs.pageNumber).isEquals();
    }

}
