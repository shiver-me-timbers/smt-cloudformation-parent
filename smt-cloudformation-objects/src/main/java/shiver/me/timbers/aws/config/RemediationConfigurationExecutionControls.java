
package shiver.me.timbers.aws.config;

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
 * RemediationConfigurationExecutionControls
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-executioncontrols.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "SsmControls"
})
public class RemediationConfigurationExecutionControls implements Property<RemediationConfigurationExecutionControls>
{

    /**
     * RemediationConfigurationSsmControls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html
     * 
     */
    @JsonProperty("SsmControls")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html")
    private Property<RemediationConfigurationSsmControls> ssmControls;

    /**
     * RemediationConfigurationSsmControls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html
     * 
     */
    @JsonIgnore
    public Property<RemediationConfigurationSsmControls> getSsmControls() {
        return ssmControls;
    }

    /**
     * RemediationConfigurationSsmControls
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html
     * 
     */
    @JsonIgnore
    public void setSsmControls(Property<RemediationConfigurationSsmControls> ssmControls) {
        this.ssmControls = ssmControls;
    }

    public RemediationConfigurationExecutionControls withSsmControls(Property<RemediationConfigurationSsmControls> ssmControls) {
        this.ssmControls = ssmControls;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ssmControls", ssmControls).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ssmControls).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemediationConfigurationExecutionControls) == false) {
            return false;
        }
        RemediationConfigurationExecutionControls rhs = ((RemediationConfigurationExecutionControls) other);
        return new EqualsBuilder().append(ssmControls, rhs.ssmControls).isEquals();
    }

}
