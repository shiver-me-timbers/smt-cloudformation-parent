
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ThrottleSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BurstLimit",
    "RateLimit"
})
public class ThrottleSettings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit
     * 
     */
    @JsonProperty("BurstLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit")
    private Integer burstLimit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit
     * 
     */
    @JsonProperty("RateLimit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit")
    private Double rateLimit;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit
     * 
     */
    public Integer getBurstLimit() {
        return burstLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-burstlimit
     * 
     */
    public void setBurstLimit(Integer burstLimit) {
        this.burstLimit = burstLimit;
    }

    public ThrottleSettings withBurstLimit(Integer burstLimit) {
        this.burstLimit = burstLimit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit
     * 
     */
    public Double getRateLimit() {
        return rateLimit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html#cfn-apigateway-usageplan-throttlesettings-ratelimit
     * 
     */
    public void setRateLimit(Double rateLimit) {
        this.rateLimit = rateLimit;
    }

    public ThrottleSettings withRateLimit(Double rateLimit) {
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
        if ((other instanceof ThrottleSettings) == false) {
            return false;
        }
        ThrottleSettings rhs = ((ThrottleSettings) other);
        return new EqualsBuilder().append(burstLimit, rhs.burstLimit).append(rateLimit, rhs.rateLimit).isEquals();
    }

}
