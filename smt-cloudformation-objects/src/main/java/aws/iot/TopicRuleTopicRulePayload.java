
package aws.iot;

import java.util.LinkedHashSet;
import java.util.Set;
import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TopicRuleTopicRulePayload
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Actions",
    "AwsIotSqlVersion",
    "Description",
    "ErrorAction",
    "RuleDisabled",
    "Sql"
})
public class TopicRuleTopicRulePayload implements Property<TopicRuleTopicRulePayload>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions")
    private Set<Property<aws.iot.TopicRuleAction>> actions = new LinkedHashSet<Property<aws.iot.TopicRuleAction>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion
     * 
     */
    @JsonProperty("AwsIotSqlVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion")
    private CharSequence awsIotSqlVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description")
    private CharSequence description;
    /**
     * TopicRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonProperty("ErrorAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html")
    private Property<aws.iot.TopicRuleAction> errorAction;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled
     * 
     */
    @JsonProperty("RuleDisabled")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled")
    private Boolean ruleDisabled;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql
     * 
     */
    @JsonProperty("Sql")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql")
    private CharSequence sql;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions
     * 
     */
    @JsonIgnore
    public Set<Property<aws.iot.TopicRuleAction>> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions
     * 
     */
    @JsonIgnore
    public void setActions(Set<Property<aws.iot.TopicRuleAction>> actions) {
        this.actions = actions;
    }

    public TopicRuleTopicRulePayload withActions(Set<Property<aws.iot.TopicRuleAction>> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion
     * 
     */
    @JsonIgnore
    public CharSequence getAwsIotSqlVersion() {
        return awsIotSqlVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion
     * 
     */
    @JsonIgnore
    public void setAwsIotSqlVersion(CharSequence awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
    }

    public TopicRuleTopicRulePayload withAwsIotSqlVersion(CharSequence awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public TopicRuleTopicRulePayload withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * TopicRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonIgnore
    public Property<aws.iot.TopicRuleAction> getErrorAction() {
        return errorAction;
    }

    /**
     * TopicRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-s3action.html
     * 
     */
    @JsonIgnore
    public void setErrorAction(Property<aws.iot.TopicRuleAction> errorAction) {
        this.errorAction = errorAction;
    }

    public TopicRuleTopicRulePayload withErrorAction(Property<aws.iot.TopicRuleAction> errorAction) {
        this.errorAction = errorAction;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled
     * 
     */
    @JsonIgnore
    public Boolean getRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled
     * 
     */
    @JsonIgnore
    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    public TopicRuleTopicRulePayload withRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql
     * 
     */
    @JsonIgnore
    public CharSequence getSql() {
        return sql;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql
     * 
     */
    @JsonIgnore
    public void setSql(CharSequence sql) {
        this.sql = sql;
    }

    public TopicRuleTopicRulePayload withSql(CharSequence sql) {
        this.sql = sql;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("awsIotSqlVersion", awsIotSqlVersion).append("description", description).append("errorAction", errorAction).append("ruleDisabled", ruleDisabled).append("sql", sql).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsIotSqlVersion).append(ruleDisabled).append(description).append(errorAction).append(actions).append(sql).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRuleTopicRulePayload) == false) {
            return false;
        }
        TopicRuleTopicRulePayload rhs = ((TopicRuleTopicRulePayload) other);
        return new EqualsBuilder().append(awsIotSqlVersion, rhs.awsIotSqlVersion).append(ruleDisabled, rhs.ruleDisabled).append(description, rhs.description).append(errorAction, rhs.errorAction).append(actions, rhs.actions).append(sql, rhs.sql).isEquals();
    }

}
