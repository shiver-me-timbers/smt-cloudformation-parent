
package shiver.me.timbers.aws.ses;

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
 * ReceiptRuleLambdaAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "FunctionArn",
    "TopicArn",
    "InvocationType"
})
public class ReceiptRuleLambdaAction implements Property<ReceiptRuleLambdaAction>
{

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
    @JsonIgnore
    public CharSequence getFunctionArn() {
        return functionArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-functionarn
     * 
     */
    @JsonIgnore
    public void setFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
    }

    public ReceiptRuleLambdaAction withFunctionArn(CharSequence functionArn) {
        this.functionArn = functionArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn
     * 
     */
    @JsonIgnore
    public CharSequence getTopicArn() {
        return topicArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-topicarn
     * 
     */
    @JsonIgnore
    public void setTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
    }

    public ReceiptRuleLambdaAction withTopicArn(CharSequence topicArn) {
        this.topicArn = topicArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype
     * 
     */
    @JsonIgnore
    public CharSequence getInvocationType() {
        return invocationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html#cfn-ses-receiptrule-lambdaaction-invocationtype
     * 
     */
    @JsonIgnore
    public void setInvocationType(CharSequence invocationType) {
        this.invocationType = invocationType;
    }

    public ReceiptRuleLambdaAction withInvocationType(CharSequence invocationType) {
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
        if ((other instanceof ReceiptRuleLambdaAction) == false) {
            return false;
        }
        ReceiptRuleLambdaAction rhs = ((ReceiptRuleLambdaAction) other);
        return new EqualsBuilder().append(invocationType, rhs.invocationType).append(topicArn, rhs.topicArn).append(functionArn, rhs.functionArn).isEquals();
    }

}
