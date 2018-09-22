
package aws.codepipeline;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * WebhookFilterRule
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "JsonPath",
    "MatchEquals"
})
public class WebhookFilterRule {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath
     * 
     */
    @JsonProperty("JsonPath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath")
    private String jsonPath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals
     * 
     */
    @JsonProperty("MatchEquals")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals")
    private String matchEquals;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath
     * 
     */
    @JsonProperty("JsonPath")
    public String getJsonPath() {
        return jsonPath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-jsonpath
     * 
     */
    @JsonProperty("JsonPath")
    public void setJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
    }

    public WebhookFilterRule withJsonPath(String jsonPath) {
        this.jsonPath = jsonPath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals
     * 
     */
    @JsonProperty("MatchEquals")
    public String getMatchEquals() {
        return matchEquals;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codepipeline-webhook-webhookfilterrule.html#cfn-codepipeline-webhook-webhookfilterrule-matchequals
     * 
     */
    @JsonProperty("MatchEquals")
    public void setMatchEquals(String matchEquals) {
        this.matchEquals = matchEquals;
    }

    public WebhookFilterRule withMatchEquals(String matchEquals) {
        this.matchEquals = matchEquals;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("jsonPath", jsonPath).append("matchEquals", matchEquals).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(matchEquals).append(jsonPath).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof WebhookFilterRule) == false) {
            return false;
        }
        WebhookFilterRule rhs = ((WebhookFilterRule) other);
        return new EqualsBuilder().append(matchEquals, rhs.matchEquals).append(jsonPath, rhs.jsonPath).isEquals();
    }

}
