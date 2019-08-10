
package aws.pinpointemail;

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
 * ConfigurationSetReputationOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ReputationMetricsEnabled"
})
public class ConfigurationSetReputationOptions implements Property<ConfigurationSetReputationOptions>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html#cfn-pinpointemail-configurationset-reputationoptions-reputationmetricsenabled
     * 
     */
    @JsonProperty("ReputationMetricsEnabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html#cfn-pinpointemail-configurationset-reputationoptions-reputationmetricsenabled")
    private CharSequence reputationMetricsEnabled;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html#cfn-pinpointemail-configurationset-reputationoptions-reputationmetricsenabled
     * 
     */
    @JsonIgnore
    public CharSequence getReputationMetricsEnabled() {
        return reputationMetricsEnabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pinpointemail-configurationset-reputationoptions.html#cfn-pinpointemail-configurationset-reputationoptions-reputationmetricsenabled
     * 
     */
    @JsonIgnore
    public void setReputationMetricsEnabled(CharSequence reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
    }

    public ConfigurationSetReputationOptions withReputationMetricsEnabled(CharSequence reputationMetricsEnabled) {
        this.reputationMetricsEnabled = reputationMetricsEnabled;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("reputationMetricsEnabled", reputationMetricsEnabled).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(reputationMetricsEnabled).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationSetReputationOptions) == false) {
            return false;
        }
        ConfigurationSetReputationOptions rhs = ((ConfigurationSetReputationOptions) other);
        return new EqualsBuilder().append(reputationMetricsEnabled, rhs.reputationMetricsEnabled).isEquals();
    }

}
