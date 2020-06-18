
package shiver.me.timbers.aws.lambda;

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
 * VersionProvisionedConcurrencyConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ProvisionedConcurrentExecutions"
})
public class VersionProvisionedConcurrencyConfiguration implements Property<VersionProvisionedConcurrencyConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html#cfn-lambda-version-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions
     * 
     */
    @JsonProperty("ProvisionedConcurrentExecutions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html#cfn-lambda-version-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions")
    private Number provisionedConcurrentExecutions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html#cfn-lambda-version-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions
     * 
     */
    @JsonIgnore
    public Number getProvisionedConcurrentExecutions() {
        return provisionedConcurrentExecutions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-version-provisionedconcurrencyconfiguration.html#cfn-lambda-version-provisionedconcurrencyconfiguration-provisionedconcurrentexecutions
     * 
     */
    @JsonIgnore
    public void setProvisionedConcurrentExecutions(Number provisionedConcurrentExecutions) {
        this.provisionedConcurrentExecutions = provisionedConcurrentExecutions;
    }

    public VersionProvisionedConcurrencyConfiguration withProvisionedConcurrentExecutions(Number provisionedConcurrentExecutions) {
        this.provisionedConcurrentExecutions = provisionedConcurrentExecutions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("provisionedConcurrentExecutions", provisionedConcurrentExecutions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(provisionedConcurrentExecutions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VersionProvisionedConcurrencyConfiguration) == false) {
            return false;
        }
        VersionProvisionedConcurrencyConfiguration rhs = ((VersionProvisionedConcurrencyConfiguration) other);
        return new EqualsBuilder().append(provisionedConcurrentExecutions, rhs.provisionedConcurrentExecutions).isEquals();
    }

}
