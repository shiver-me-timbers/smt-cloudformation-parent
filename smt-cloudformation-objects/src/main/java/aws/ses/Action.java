
package aws.ses;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Action
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-action.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BounceAction",
    "S3Action",
    "StopAction",
    "SNSAction",
    "WorkmailAction",
    "AddHeaderAction",
    "LambdaAction"
})
public class Action {

    /**
     * BounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonProperty("BounceAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html")
    private BounceAction bounceAction;
    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonProperty("S3Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html")
    private S3Action s3Action;
    /**
     * StopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonProperty("StopAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html")
    private StopAction stopAction;
    /**
     * SNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonProperty("SNSAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html")
    private SNSAction sNSAction;
    /**
     * WorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonProperty("WorkmailAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html")
    private WorkmailAction workmailAction;
    /**
     * AddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonProperty("AddHeaderAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html")
    private AddHeaderAction addHeaderAction;
    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonProperty("LambdaAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html")
    private LambdaAction lambdaAction;

    /**
     * BounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    public BounceAction getBounceAction() {
        return bounceAction;
    }

    /**
     * BounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    public void setBounceAction(BounceAction bounceAction) {
        this.bounceAction = bounceAction;
    }

    public Action withBounceAction(BounceAction bounceAction) {
        this.bounceAction = bounceAction;
        return this;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    public S3Action getS3Action() {
        return s3Action;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    public void setS3Action(S3Action s3Action) {
        this.s3Action = s3Action;
    }

    public Action withS3Action(S3Action s3Action) {
        this.s3Action = s3Action;
        return this;
    }

    /**
     * StopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    public StopAction getStopAction() {
        return stopAction;
    }

    /**
     * StopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    public void setStopAction(StopAction stopAction) {
        this.stopAction = stopAction;
    }

    public Action withStopAction(StopAction stopAction) {
        this.stopAction = stopAction;
        return this;
    }

    /**
     * SNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    public SNSAction getSNSAction() {
        return sNSAction;
    }

    /**
     * SNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    public void setSNSAction(SNSAction sNSAction) {
        this.sNSAction = sNSAction;
    }

    public Action withSNSAction(SNSAction sNSAction) {
        this.sNSAction = sNSAction;
        return this;
    }

    /**
     * WorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    public WorkmailAction getWorkmailAction() {
        return workmailAction;
    }

    /**
     * WorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    public void setWorkmailAction(WorkmailAction workmailAction) {
        this.workmailAction = workmailAction;
    }

    public Action withWorkmailAction(WorkmailAction workmailAction) {
        this.workmailAction = workmailAction;
        return this;
    }

    /**
     * AddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    public AddHeaderAction getAddHeaderAction() {
        return addHeaderAction;
    }

    /**
     * AddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    public void setAddHeaderAction(AddHeaderAction addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
    }

    public Action withAddHeaderAction(AddHeaderAction addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
        return this;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    public LambdaAction getLambdaAction() {
        return lambdaAction;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    public void setLambdaAction(LambdaAction lambdaAction) {
        this.lambdaAction = lambdaAction;
    }

    public Action withLambdaAction(LambdaAction lambdaAction) {
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
        if ((other instanceof Action) == false) {
            return false;
        }
        Action rhs = ((Action) other);
        return new EqualsBuilder().append(workmailAction, rhs.workmailAction).append(addHeaderAction, rhs.addHeaderAction).append(stopAction, rhs.stopAction).append(lambdaAction, rhs.lambdaAction).append(sNSAction, rhs.sNSAction).append(bounceAction, rhs.bounceAction).append(s3Action, rhs.s3Action).isEquals();
    }

}
