
package aws.logs;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SubscriptionFilter
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DestinationArn",
    "FilterPattern",
    "LogGroupName",
    "RoleArn"
})
public class SubscriptionFilter {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn
     * 
     */
    @JsonProperty("DestinationArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn")
    private CharSequence destinationArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern
     * 
     */
    @JsonProperty("FilterPattern")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern")
    private CharSequence filterPattern;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname
     * 
     */
    @JsonProperty("LogGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname")
    private CharSequence logGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn")
    private CharSequence roleArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn
     * 
     */
    public CharSequence getDestinationArn() {
        return destinationArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-destinationarn
     * 
     */
    public void setDestinationArn(CharSequence destinationArn) {
        this.destinationArn = destinationArn;
    }

    public SubscriptionFilter withDestinationArn(CharSequence destinationArn) {
        this.destinationArn = destinationArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern
     * 
     */
    public CharSequence getFilterPattern() {
        return filterPattern;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-filterpattern
     * 
     */
    public void setFilterPattern(CharSequence filterPattern) {
        this.filterPattern = filterPattern;
    }

    public SubscriptionFilter withFilterPattern(CharSequence filterPattern) {
        this.filterPattern = filterPattern;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname
     * 
     */
    public CharSequence getLogGroupName() {
        return logGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-loggroupname
     * 
     */
    public void setLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
    }

    public SubscriptionFilter withLogGroupName(CharSequence logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn
     * 
     */
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-logs-subscriptionfilter.html#cfn-cwl-subscriptionfilter-rolearn
     * 
     */
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public SubscriptionFilter withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("destinationArn", destinationArn).append("filterPattern", filterPattern).append("logGroupName", logGroupName).append("roleArn", roleArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(filterPattern).append(logGroupName).append(destinationArn).append(roleArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubscriptionFilter) == false) {
            return false;
        }
        SubscriptionFilter rhs = ((SubscriptionFilter) other);
        return new EqualsBuilder().append(filterPattern, rhs.filterPattern).append(logGroupName, rhs.logGroupName).append(destinationArn, rhs.destinationArn).append(roleArn, rhs.roleArn).isEquals();
    }

}
