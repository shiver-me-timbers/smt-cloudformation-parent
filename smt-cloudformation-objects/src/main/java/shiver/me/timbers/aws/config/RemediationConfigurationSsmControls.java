
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
 * RemediationConfigurationSsmControls
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ErrorPercentage",
    "ConcurrentExecutionRatePercentage"
})
public class RemediationConfigurationSsmControls implements Property<RemediationConfigurationSsmControls>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-errorpercentage
     * 
     */
    @JsonProperty("ErrorPercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-errorpercentage")
    private Number errorPercentage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-concurrentexecutionratepercentage
     * 
     */
    @JsonProperty("ConcurrentExecutionRatePercentage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-concurrentexecutionratepercentage")
    private Number concurrentExecutionRatePercentage;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-errorpercentage
     * 
     */
    @JsonIgnore
    public Number getErrorPercentage() {
        return errorPercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-errorpercentage
     * 
     */
    @JsonIgnore
    public void setErrorPercentage(Number errorPercentage) {
        this.errorPercentage = errorPercentage;
    }

    public RemediationConfigurationSsmControls withErrorPercentage(Number errorPercentage) {
        this.errorPercentage = errorPercentage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-concurrentexecutionratepercentage
     * 
     */
    @JsonIgnore
    public Number getConcurrentExecutionRatePercentage() {
        return concurrentExecutionRatePercentage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-config-remediationconfiguration-ssmcontrols.html#cfn-config-remediationconfiguration-ssmcontrols-concurrentexecutionratepercentage
     * 
     */
    @JsonIgnore
    public void setConcurrentExecutionRatePercentage(Number concurrentExecutionRatePercentage) {
        this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
    }

    public RemediationConfigurationSsmControls withConcurrentExecutionRatePercentage(Number concurrentExecutionRatePercentage) {
        this.concurrentExecutionRatePercentage = concurrentExecutionRatePercentage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("errorPercentage", errorPercentage).append("concurrentExecutionRatePercentage", concurrentExecutionRatePercentage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(errorPercentage).append(concurrentExecutionRatePercentage).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RemediationConfigurationSsmControls) == false) {
            return false;
        }
        RemediationConfigurationSsmControls rhs = ((RemediationConfigurationSsmControls) other);
        return new EqualsBuilder().append(errorPercentage, rhs.errorPercentage).append(concurrentExecutionRatePercentage, rhs.concurrentExecutionRatePercentage).isEquals();
    }

}
