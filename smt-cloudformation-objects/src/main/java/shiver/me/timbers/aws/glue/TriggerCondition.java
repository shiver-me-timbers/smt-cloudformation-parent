
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
 * TriggerCondition
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "CrawlerName",
    "State",
    "CrawlState",
    "LogicalOperator",
    "JobName"
})
public class TriggerCondition implements Property<TriggerCondition>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlername
     * 
     */
    @JsonProperty("CrawlerName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlername")
    private CharSequence crawlerName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state
     * 
     */
    @JsonProperty("State")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state")
    private CharSequence state;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlstate
     * 
     */
    @JsonProperty("CrawlState")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlstate")
    private CharSequence crawlState;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator
     * 
     */
    @JsonProperty("LogicalOperator")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator")
    private CharSequence logicalOperator;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname
     * 
     */
    @JsonProperty("JobName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname")
    private CharSequence jobName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlername
     * 
     */
    @JsonIgnore
    public CharSequence getCrawlerName() {
        return crawlerName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlername
     * 
     */
    @JsonIgnore
    public void setCrawlerName(CharSequence crawlerName) {
        this.crawlerName = crawlerName;
    }

    public TriggerCondition withCrawlerName(CharSequence crawlerName) {
        this.crawlerName = crawlerName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state
     * 
     */
    @JsonIgnore
    public CharSequence getState() {
        return state;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state
     * 
     */
    @JsonIgnore
    public void setState(CharSequence state) {
        this.state = state;
    }

    public TriggerCondition withState(CharSequence state) {
        this.state = state;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlstate
     * 
     */
    @JsonIgnore
    public CharSequence getCrawlState() {
        return crawlState;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlstate
     * 
     */
    @JsonIgnore
    public void setCrawlState(CharSequence crawlState) {
        this.crawlState = crawlState;
    }

    public TriggerCondition withCrawlState(CharSequence crawlState) {
        this.crawlState = crawlState;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator
     * 
     */
    @JsonIgnore
    public CharSequence getLogicalOperator() {
        return logicalOperator;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator
     * 
     */
    @JsonIgnore
    public void setLogicalOperator(CharSequence logicalOperator) {
        this.logicalOperator = logicalOperator;
    }

    public TriggerCondition withLogicalOperator(CharSequence logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname
     * 
     */
    @JsonIgnore
    public CharSequence getJobName() {
        return jobName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname
     * 
     */
    @JsonIgnore
    public void setJobName(CharSequence jobName) {
        this.jobName = jobName;
    }

    public TriggerCondition withJobName(CharSequence jobName) {
        this.jobName = jobName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("crawlerName", crawlerName).append("state", state).append("crawlState", crawlState).append("logicalOperator", logicalOperator).append("jobName", jobName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(crawlState).append(jobName).append(crawlerName).append(state).append(logicalOperator).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TriggerCondition) == false) {
            return false;
        }
        TriggerCondition rhs = ((TriggerCondition) other);
        return new EqualsBuilder().append(crawlState, rhs.crawlState).append(jobName, rhs.jobName).append(crawlerName, rhs.crawlerName).append(state, rhs.state).append(logicalOperator, rhs.logicalOperator).isEquals();
    }

}
