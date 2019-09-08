
package shiver.me.timbers.aws.apigateway;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * UsagePlan
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ApiStages",
    "Description",
    "Quota",
    "Throttle",
    "UsagePlanName"
})
public class UsagePlan {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages
     * 
     */
    @JsonProperty("ApiStages")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages")
    private Set<Property<UsagePlanApiStage>> apiStages = new LinkedHashSet<Property<UsagePlanApiStage>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description")
    private CharSequence description;
    /**
     * UsagePlanQuotaSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html
     * 
     */
    @JsonProperty("Quota")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html")
    private Property<UsagePlanQuotaSettings> quota;
    /**
     * UsagePlanThrottleSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
     * 
     */
    @JsonProperty("Throttle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html")
    private Property<UsagePlanThrottleSettings> throttle;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname
     * 
     */
    @JsonProperty("UsagePlanName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname")
    private CharSequence usagePlanName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages
     * 
     */
    @JsonIgnore
    public Set<Property<UsagePlanApiStage>> getApiStages() {
        return apiStages;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-apistages
     * 
     */
    @JsonIgnore
    public void setApiStages(Set<Property<UsagePlanApiStage>> apiStages) {
        this.apiStages = apiStages;
    }

    public UsagePlan withApiStages(Set<Property<UsagePlanApiStage>> apiStages) {
        this.apiStages = apiStages;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public UsagePlan withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * UsagePlanQuotaSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html
     * 
     */
    @JsonIgnore
    public Property<UsagePlanQuotaSettings> getQuota() {
        return quota;
    }

    /**
     * UsagePlanQuotaSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-quotasettings.html
     * 
     */
    @JsonIgnore
    public void setQuota(Property<UsagePlanQuotaSettings> quota) {
        this.quota = quota;
    }

    public UsagePlan withQuota(Property<UsagePlanQuotaSettings> quota) {
        this.quota = quota;
        return this;
    }

    /**
     * UsagePlanThrottleSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
     * 
     */
    @JsonIgnore
    public Property<UsagePlanThrottleSettings> getThrottle() {
        return throttle;
    }

    /**
     * UsagePlanThrottleSettings
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-throttlesettings.html
     * 
     */
    @JsonIgnore
    public void setThrottle(Property<UsagePlanThrottleSettings> throttle) {
        this.throttle = throttle;
    }

    public UsagePlan withThrottle(Property<UsagePlanThrottleSettings> throttle) {
        this.throttle = throttle;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname
     * 
     */
    @JsonIgnore
    public CharSequence getUsagePlanName() {
        return usagePlanName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-usageplan.html#cfn-apigateway-usageplan-usageplanname
     * 
     */
    @JsonIgnore
    public void setUsagePlanName(CharSequence usagePlanName) {
        this.usagePlanName = usagePlanName;
    }

    public UsagePlan withUsagePlanName(CharSequence usagePlanName) {
        this.usagePlanName = usagePlanName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiStages", apiStages).append("description", description).append("quota", quota).append("throttle", throttle).append("usagePlanName", usagePlanName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(throttle).append(apiStages).append(usagePlanName).append(quota).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UsagePlan) == false) {
            return false;
        }
        UsagePlan rhs = ((UsagePlan) other);
        return new EqualsBuilder().append(description, rhs.description).append(throttle, rhs.throttle).append(apiStages, rhs.apiStages).append(usagePlanName, rhs.usagePlanName).append(quota, rhs.quota).isEquals();
    }

}
