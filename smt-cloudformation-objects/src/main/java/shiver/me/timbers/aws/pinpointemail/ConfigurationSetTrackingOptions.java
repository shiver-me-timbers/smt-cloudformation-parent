
package shiver.me.timbers.aws.pinpointemail;

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
 * ConfigurationSetTrackingOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CustomRedirectDomain"
})
public class ConfigurationSetTrackingOptions implements Property<ConfigurationSetTrackingOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html#cfn-pinpointemail-configurationset-trackingoptions-customredirectdomain
     * 
     */
    @JsonProperty("CustomRedirectDomain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html#cfn-pinpointemail-configurationset-trackingoptions-customredirectdomain")
    private CharSequence customRedirectDomain;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html#cfn-pinpointemail-configurationset-trackingoptions-customredirectdomain
     * 
     */
    @JsonIgnore
    public CharSequence getCustomRedirectDomain() {
        return customRedirectDomain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-trackingoptions.html#cfn-pinpointemail-configurationset-trackingoptions-customredirectdomain
     * 
     */
    @JsonIgnore
    public void setCustomRedirectDomain(CharSequence customRedirectDomain) {
        this.customRedirectDomain = customRedirectDomain;
    }

    public ConfigurationSetTrackingOptions withCustomRedirectDomain(CharSequence customRedirectDomain) {
        this.customRedirectDomain = customRedirectDomain;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("customRedirectDomain", customRedirectDomain).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customRedirectDomain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetTrackingOptions) == false) {
            return false;
        }
        ConfigurationSetTrackingOptions rhs = ((ConfigurationSetTrackingOptions) other);
        return new EqualsBuilder().append(customRedirectDomain, rhs.customRedirectDomain).isEquals();
    }

}
