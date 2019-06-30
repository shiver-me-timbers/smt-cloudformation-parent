
package aws.apigateway;

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
 * UsagePlanThrottleSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BurstLimit",
    "RateLimit"
})
public class UsagePlanThrottleSettings implements Property<UsagePlanThrottleSettings>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit
     * 
     */
    @JsonProperty("BurstLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit")
    private Number burstLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit
     * 
     */
    @JsonProperty("RateLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit")
    private Number rateLimit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit
     * 
     */
    @JsonIgnore
    public Number getBurstLimit() {
        return burstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit
     * 
     */
    @JsonIgnore
    public void setBurstLimit(Number burstLimit) {
        this.burstLimit = burstLimit;
    }

    public UsagePlanThrottleSettings withBurstLimit(Number burstLimit) {
        this.burstLimit = burstLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit
     * 
     */
    @JsonIgnore
    public Number getRateLimit() {
        return rateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit
     * 
     */
    @JsonIgnore
    public void setRateLimit(Number rateLimit) {
        this.rateLimit = rateLimit;
    }

    public UsagePlanThrottleSettings withRateLimit(Number rateLimit) {
        this.rateLimit = rateLimit;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("burstLimit", burstLimit).append("rateLimit", rateLimit).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(burstLimit).append(rateLimit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsagePlanThrottleSettings) == false) {
            return false;
        }
        UsagePlanThrottleSettings rhs = ((UsagePlanThrottleSettings) other);
        return new EqualsBuilder().append(burstLimit, rhs.burstLimit).append(rateLimit, rhs.rateLimit).isEquals();
    }

}
