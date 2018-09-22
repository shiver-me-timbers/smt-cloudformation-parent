
package aws.iot;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TopicRulePayload
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Actions",
    "AwsIotSqlVersion",
    "Description",
    "RuleDisabled",
    "Sql"
})
public class TopicRulePayload {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions
     * 
     */
    @JsonProperty("Actions")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions")
    private Set<S3Action> actions = new LinkedHashSet<S3Action>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion
     * 
     */
    @JsonProperty("AwsIotSqlVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion")
    private String awsIotSqlVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description")
    private String description;
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
    private String sql;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions
     * 
     */
    @JsonProperty("Actions")
    public Set<S3Action> getActions() {
        return actions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-actions
     * 
     */
    @JsonProperty("Actions")
    public void setActions(Set<S3Action> actions) {
        this.actions = actions;
    }

    public TopicRulePayload withActions(Set<S3Action> actions) {
        this.actions = actions;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion
     * 
     */
    @JsonProperty("AwsIotSqlVersion")
    public String getAwsIotSqlVersion() {
        return awsIotSqlVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-awsiotsqlversion
     * 
     */
    @JsonProperty("AwsIotSqlVersion")
    public void setAwsIotSqlVersion(String awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
    }

    public TopicRulePayload withAwsIotSqlVersion(String awsIotSqlVersion) {
        this.awsIotSqlVersion = awsIotSqlVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public TopicRulePayload withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled
     * 
     */
    @JsonProperty("RuleDisabled")
    public Boolean getRuleDisabled() {
        return ruleDisabled;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-ruledisabled
     * 
     */
    @JsonProperty("RuleDisabled")
    public void setRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
    }

    public TopicRulePayload withRuleDisabled(Boolean ruleDisabled) {
        this.ruleDisabled = ruleDisabled;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql
     * 
     */
    @JsonProperty("Sql")
    public String getSql() {
        return sql;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iot-topicrule-topicrulepayload.html#cfn-iot-topicrule-topicrulepayload-sql
     * 
     */
    @JsonProperty("Sql")
    public void setSql(String sql) {
        this.sql = sql;
    }

    public TopicRulePayload withSql(String sql) {
        this.sql = sql;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("actions", actions).append("awsIotSqlVersion", awsIotSqlVersion).append("description", description).append("ruleDisabled", ruleDisabled).append("sql", sql).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsIotSqlVersion).append(description).append(actions).append(ruleDisabled).append(sql).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TopicRulePayload) == false) {
            return false;
        }
        TopicRulePayload rhs = ((TopicRulePayload) other);
        return new EqualsBuilder().append(awsIotSqlVersion, rhs.awsIotSqlVersion).append(description, rhs.description).append(actions, rhs.actions).append(ruleDisabled, rhs.ruleDisabled).append(sql, rhs.sql).isEquals();
    }

}
