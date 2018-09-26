
package aws.budgets;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Notification
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ComparisonOperator",
    "NotificationType",
    "Threshold",
    "ThresholdType"
})
public class Notification {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator
     * 
     */
    @JsonProperty("ComparisonOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator")
    private CharSequence comparisonOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype
     * 
     */
    @JsonProperty("NotificationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype")
    private CharSequence notificationType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold
     * 
     */
    @JsonProperty("Threshold")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold")
    private Double threshold;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype
     * 
     */
    @JsonProperty("ThresholdType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype")
    private CharSequence thresholdType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator
     * 
     */
    public CharSequence getComparisonOperator() {
        return comparisonOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-comparisonoperator
     * 
     */
    public void setComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
    }

    public Notification withComparisonOperator(CharSequence comparisonOperator) {
        this.comparisonOperator = comparisonOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype
     * 
     */
    public CharSequence getNotificationType() {
        return notificationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-notificationtype
     * 
     */
    public void setNotificationType(CharSequence notificationType) {
        this.notificationType = notificationType;
    }

    public Notification withNotificationType(CharSequence notificationType) {
        this.notificationType = notificationType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold
     * 
     */
    public Double getThreshold() {
        return threshold;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-threshold
     * 
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }

    public Notification withThreshold(Double threshold) {
        this.threshold = threshold;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype
     * 
     */
    public CharSequence getThresholdType() {
        return thresholdType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-budgets-budget-notification.html#cfn-budgets-budget-notification-thresholdtype
     * 
     */
    public void setThresholdType(CharSequence thresholdType) {
        this.thresholdType = thresholdType;
    }

    public Notification withThresholdType(CharSequence thresholdType) {
        this.thresholdType = thresholdType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("comparisonOperator", comparisonOperator).append("notificationType", notificationType).append("threshold", threshold).append("thresholdType", thresholdType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(threshold).append(notificationType).append(comparisonOperator).append(thresholdType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Notification) == false) {
            return false;
        }
        Notification rhs = ((Notification) other);
        return new EqualsBuilder().append(threshold, rhs.threshold).append(notificationType, rhs.notificationType).append(comparisonOperator, rhs.comparisonOperator).append(thresholdType, rhs.thresholdType).isEquals();
    }

}
