
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * QuotaSettings
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Limit",
    "Offset",
    "Period"
})
public class QuotaSettings {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit
     * 
     */
    @JsonProperty("Limit")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit")
    private Integer limit;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset
     * 
     */
    @JsonProperty("Offset")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset")
    private Integer offset;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period
     * 
     */
    @JsonProperty("Period")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period")
    private CharSequence period;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit
     * 
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-limit
     * 
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public QuotaSettings withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset
     * 
     */
    public Integer getOffset() {
        return offset;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-offset
     * 
     */
    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public QuotaSettings withOffset(Integer offset) {
        this.offset = offset;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period
     * 
     */
    public CharSequence getPeriod() {
        return period;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html#cfn-apigateway-usageplan-quotasettings-period
     * 
     */
    public void setPeriod(CharSequence period) {
        this.period = period;
    }

    public QuotaSettings withPeriod(CharSequence period) {
        this.period = period;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("limit", limit).append("offset", offset).append("period", period).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(limit).append(period).append(offset).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof QuotaSettings) == false) {
            return false;
        }
        QuotaSettings rhs = ((QuotaSettings) other);
        return new EqualsBuilder().append(limit, rhs.limit).append(period, rhs.period).append(offset, rhs.offset).isEquals();
    }

}
