
package shiver.me.timbers.aws.glue;

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
 * TriggerAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "NotificationProperty",
    "CrawlerName",
    "Timeout",
    "JobName",
    "Arguments",
    "SecurityConfiguration"
})
public class TriggerAction implements Property<TriggerAction>
{

    /**
     * TriggerNotificationProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html
     * 
     */
    @JsonProperty("NotificationProperty")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html")
    private Property<TriggerNotificationProperty> notificationProperty;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-crawlername
     * 
     */
    @JsonProperty("CrawlerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-crawlername")
    private CharSequence crawlerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-timeout
     * 
     */
    @JsonProperty("Timeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-timeout")
    private Number timeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname
     * 
     */
    @JsonProperty("JobName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname")
    private CharSequence jobName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments
     * 
     */
    @JsonProperty("Arguments")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments")
    private Object arguments;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-securityconfiguration
     * 
     */
    @JsonProperty("SecurityConfiguration")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-securityconfiguration")
    private CharSequence securityConfiguration;

    /**
     * TriggerNotificationProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html
     * 
     */
    @JsonIgnore
    public Property<TriggerNotificationProperty> getNotificationProperty() {
        return notificationProperty;
    }

    /**
     * TriggerNotificationProperty
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html
     * 
     */
    @JsonIgnore
    public void setNotificationProperty(Property<TriggerNotificationProperty> notificationProperty) {
        this.notificationProperty = notificationProperty;
    }

    public TriggerAction withNotificationProperty(Property<TriggerNotificationProperty> notificationProperty) {
        this.notificationProperty = notificationProperty;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-crawlername
     * 
     */
    @JsonIgnore
    public CharSequence getCrawlerName() {
        return crawlerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-crawlername
     * 
     */
    @JsonIgnore
    public void setCrawlerName(CharSequence crawlerName) {
        this.crawlerName = crawlerName;
    }

    public TriggerAction withCrawlerName(CharSequence crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-timeout
     * 
     */
    @JsonIgnore
    public Number getTimeout() {
        return timeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-timeout
     * 
     */
    @JsonIgnore
    public void setTimeout(Number timeout) {
        this.timeout = timeout;
    }

    public TriggerAction withTimeout(Number timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname
     * 
     */
    @JsonIgnore
    public CharSequence getJobName() {
        return jobName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname
     * 
     */
    @JsonIgnore
    public void setJobName(CharSequence jobName) {
        this.jobName = jobName;
    }

    public TriggerAction withJobName(CharSequence jobName) {
        this.jobName = jobName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments
     * 
     */
    @JsonIgnore
    public Object getArguments() {
        return arguments;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments
     * 
     */
    @JsonIgnore
    public void setArguments(Object arguments) {
        this.arguments = arguments;
    }

    public TriggerAction withArguments(Object arguments) {
        this.arguments = arguments;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-securityconfiguration
     * 
     */
    @JsonIgnore
    public CharSequence getSecurityConfiguration() {
        return securityConfiguration;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-securityconfiguration
     * 
     */
    @JsonIgnore
    public void setSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
    }

    public TriggerAction withSecurityConfiguration(CharSequence securityConfiguration) {
        this.securityConfiguration = securityConfiguration;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("notificationProperty", notificationProperty).append("crawlerName", crawlerName).append("timeout", timeout).append("jobName", jobName).append("arguments", arguments).append("securityConfiguration", securityConfiguration).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(jobName).append(crawlerName).append(arguments).append(notificationProperty).append(securityConfiguration).append(timeout).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerAction) == false) {
            return false;
        }
        TriggerAction rhs = ((TriggerAction) other);
        return new EqualsBuilder().append(jobName, rhs.jobName).append(crawlerName, rhs.crawlerName).append(arguments, rhs.arguments).append(notificationProperty, rhs.notificationProperty).append(securityConfiguration, rhs.securityConfiguration).append(timeout, rhs.timeout).isEquals();
    }

}
