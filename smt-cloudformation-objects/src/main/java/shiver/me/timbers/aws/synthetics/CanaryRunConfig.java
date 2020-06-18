
package shiver.me.timbers.aws.synthetics;

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
 * CanaryRunConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "TimeoutInSeconds"
})
public class CanaryRunConfig implements Property<CanaryRunConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-timeoutinseconds
     * 
     */
    @JsonProperty("TimeoutInSeconds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-timeoutinseconds")
    private Number timeoutInSeconds;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-timeoutinseconds
     * 
     */
    @JsonIgnore
    public Number getTimeoutInSeconds() {
        return timeoutInSeconds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-synthetics-canary-runconfig.html#cfn-synthetics-canary-runconfig-timeoutinseconds
     * 
     */
    @JsonIgnore
    public void setTimeoutInSeconds(Number timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
    }

    public CanaryRunConfig withTimeoutInSeconds(Number timeoutInSeconds) {
        this.timeoutInSeconds = timeoutInSeconds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timeoutInSeconds", timeoutInSeconds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(timeoutInSeconds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CanaryRunConfig) == false) {
            return false;
        }
        CanaryRunConfig rhs = ((CanaryRunConfig) other);
        return new EqualsBuilder().append(timeoutInSeconds, rhs.timeoutInSeconds).isEquals();
    }

}
