
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LambdaAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "FunctionArn",
    "TopicArn",
    "InvocationType"
})
public class LambdaAction {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn
     * 
     */
    @JsonProperty("FunctionArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn")
    private CharSequence functionArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn
     * 
     */
    @JsonProperty("TopicArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn")
    private CharSequence topicArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype
     * 
     */
    @JsonProperty("InvocationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype")
    private CharSequence invocationType;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn
     * 
     */
    public CharSequence getFunctionArn() {
        return functionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn
     * 
     */
    public void setFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
    }

    public LambdaAction withFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn
     * 
     */
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn
     * 
     */
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public LambdaAction withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype
     * 
     */
    public CharSequence getInvocationType() {
        return invocationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype
     * 
     */
    public void setInvocationType(CharSequence invocationType) {
        this.invocationType = invocationType;
    }

    public LambdaAction withInvocationType(CharSequence invocationType) {
        this.invocationType = invocationType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("functionArn", functionArn).append("topicArn", topicArn).append("invocationType", invocationType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(invocationType).append(topicArn).append(functionArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LambdaAction) == false) {
            return false;
        }
        LambdaAction rhs = ((LambdaAction) other);
        return new EqualsBuilder().append(invocationType, rhs.invocationType).append(topicArn, rhs.topicArn).append(functionArn, rhs.functionArn).isEquals();
    }

}
