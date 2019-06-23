
package aws.ses;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReceiptRuleAction
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "BounceAction",
    "S3Action",
    "StopAction",
    "SNSAction",
    "WorkmailAction",
    "AddHeaderAction",
    "LambdaAction"
})
public class ReceiptRuleAction implements Property<ReceiptRuleAction>
{

    /**
     * ReceiptRuleBounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonProperty("BounceAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html")
    private Property<ReceiptRuleBounceAction> bounceAction;
    /**
     * ReceiptRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonProperty("S3Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html")
    private Property<ReceiptRuleS3Action> s3Action;
    /**
     * ReceiptRuleStopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonProperty("StopAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html")
    private Property<ReceiptRuleStopAction> stopAction;
    /**
     * ReceiptRuleSNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonProperty("SNSAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html")
    private Property<ReceiptRuleSNSAction> sNSAction;
    /**
     * ReceiptRuleWorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonProperty("WorkmailAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html")
    private Property<ReceiptRuleWorkmailAction> workmailAction;
    /**
     * ReceiptRuleAddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonProperty("AddHeaderAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html")
    private Property<ReceiptRuleAddHeaderAction> addHeaderAction;
    /**
     * ReceiptRuleLambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonProperty("LambdaAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html")
    private Property<ReceiptRuleLambdaAction> lambdaAction;

    /**
     * ReceiptRuleBounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleBounceAction> getBounceAction() {
        return bounceAction;
    }

    /**
     * ReceiptRuleBounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonIgnore
    public void setBounceAction(Property<ReceiptRuleBounceAction> bounceAction) {
        this.bounceAction = bounceAction;
    }

    public ReceiptRuleAction withBounceAction(Property<ReceiptRuleBounceAction> bounceAction) {
        this.bounceAction = bounceAction;
        return this;
    }

    /**
     * ReceiptRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleS3Action> getS3Action() {
        return s3Action;
    }

    /**
     * ReceiptRuleS3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonIgnore
    public void setS3Action(Property<ReceiptRuleS3Action> s3Action) {
        this.s3Action = s3Action;
    }

    public ReceiptRuleAction withS3Action(Property<ReceiptRuleS3Action> s3Action) {
        this.s3Action = s3Action;
        return this;
    }

    /**
     * ReceiptRuleStopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleStopAction> getStopAction() {
        return stopAction;
    }

    /**
     * ReceiptRuleStopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonIgnore
    public void setStopAction(Property<ReceiptRuleStopAction> stopAction) {
        this.stopAction = stopAction;
    }

    public ReceiptRuleAction withStopAction(Property<ReceiptRuleStopAction> stopAction) {
        this.stopAction = stopAction;
        return this;
    }

    /**
     * ReceiptRuleSNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleSNSAction> getSNSAction() {
        return sNSAction;
    }

    /**
     * ReceiptRuleSNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonIgnore
    public void setSNSAction(Property<ReceiptRuleSNSAction> sNSAction) {
        this.sNSAction = sNSAction;
    }

    public ReceiptRuleAction withSNSAction(Property<ReceiptRuleSNSAction> sNSAction) {
        this.sNSAction = sNSAction;
        return this;
    }

    /**
     * ReceiptRuleWorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleWorkmailAction> getWorkmailAction() {
        return workmailAction;
    }

    /**
     * ReceiptRuleWorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonIgnore
    public void setWorkmailAction(Property<ReceiptRuleWorkmailAction> workmailAction) {
        this.workmailAction = workmailAction;
    }

    public ReceiptRuleAction withWorkmailAction(Property<ReceiptRuleWorkmailAction> workmailAction) {
        this.workmailAction = workmailAction;
        return this;
    }

    /**
     * ReceiptRuleAddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleAddHeaderAction> getAddHeaderAction() {
        return addHeaderAction;
    }

    /**
     * ReceiptRuleAddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonIgnore
    public void setAddHeaderAction(Property<ReceiptRuleAddHeaderAction> addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
    }

    public ReceiptRuleAction withAddHeaderAction(Property<ReceiptRuleAddHeaderAction> addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
        return this;
    }

    /**
     * ReceiptRuleLambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public Property<ReceiptRuleLambdaAction> getLambdaAction() {
        return lambdaAction;
    }

    /**
     * ReceiptRuleLambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public void setLambdaAction(Property<ReceiptRuleLambdaAction> lambdaAction) {
        this.lambdaAction = lambdaAction;
    }

    public ReceiptRuleAction withLambdaAction(Property<ReceiptRuleLambdaAction> lambdaAction) {
        this.lambdaAction = lambdaAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("bounceAction", bounceAction).append("s3Action", s3Action).append("stopAction", stopAction).append("sNSAction", sNSAction).append("workmailAction", workmailAction).append("addHeaderAction", addHeaderAction).append("lambdaAction", lambdaAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(workmailAction).append(addHeaderAction).append(stopAction).append(lambdaAction).append(sNSAction).append(bounceAction).append(s3Action).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReceiptRuleAction) == false) {
            return false;
        }
        ReceiptRuleAction rhs = ((ReceiptRuleAction) other);
        return new EqualsBuilder().append(workmailAction, rhs.workmailAction).append(addHeaderAction, rhs.addHeaderAction).append(stopAction, rhs.stopAction).append(lambdaAction, rhs.lambdaAction).append(sNSAction, rhs.sNSAction).append(bounceAction, rhs.bounceAction).append(s3Action, rhs.s3Action).isEquals();
    }

}
