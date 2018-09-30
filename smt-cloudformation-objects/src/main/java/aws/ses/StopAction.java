
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StopAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Scope",
    "TopicArn"
})
public class StopAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope
     * 
     */
    @JsonProperty("Scope")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope")
    private CharSequence scope;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn")
    private CharSequence topicArn;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope
     * 
     */
    public CharSequence getScope() {
        return scope;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-scope
     * 
     */
    public void setScope(CharSequence scope) {
        this.scope = scope;
    }

    public StopAction withScope(CharSequence scope) {
        this.scope = scope;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn
     * 
     */
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html#cfn-ses-receiptrule-stopaction-topicarn
     * 
     */
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public StopAction withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("scope", scope).append("topicArn", topicArn).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topicArn).append(scope).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StopAction) == false) {
            return false;
        }
        StopAction rhs = ((StopAction) other);
        return new EqualsBuilder().append(topicArn, rhs.topicArn).append(scope, rhs.scope).isEquals();
    }

}
