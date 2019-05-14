
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
 * Action
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
public class Action implements Property<Action>
{

    /**
     * BounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonProperty("BounceAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html")
    private Property<BounceAction> bounceAction;
    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonProperty("S3Action")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html")
    private Property<S3Action> s3Action;
    /**
     * StopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonProperty("StopAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html")
    private Property<StopAction> stopAction;
    /**
     * SNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonProperty("SNSAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html")
    private Property<SNSAction> sNSAction;
    /**
     * WorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonProperty("WorkmailAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html")
    private Property<WorkmailAction> workmailAction;
    /**
     * AddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonProperty("AddHeaderAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html")
    private Property<AddHeaderAction> addHeaderAction;
    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonProperty("LambdaAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html")
    private Property<LambdaAction> lambdaAction;

    /**
     * BounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonIgnore
    public Property<BounceAction> getBounceAction() {
        return bounceAction;
    }

    /**
     * BounceAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-bounceaction.html
     * 
     */
    @JsonIgnore
    public void setBounceAction(Property<BounceAction> bounceAction) {
        this.bounceAction = bounceAction;
    }

    public Action withBounceAction(Property<BounceAction> bounceAction) {
        this.bounceAction = bounceAction;
        return this;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonIgnore
    public Property<S3Action> getS3Action() {
        return s3Action;
    }

    /**
     * S3Action
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-s3action.html
     * 
     */
    @JsonIgnore
    public void setS3Action(Property<S3Action> s3Action) {
        this.s3Action = s3Action;
    }

    public Action withS3Action(Property<S3Action> s3Action) {
        this.s3Action = s3Action;
        return this;
    }

    /**
     * StopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonIgnore
    public Property<StopAction> getStopAction() {
        return stopAction;
    }

    /**
     * StopAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-stopaction.html
     * 
     */
    @JsonIgnore
    public void setStopAction(Property<StopAction> stopAction) {
        this.stopAction = stopAction;
    }

    public Action withStopAction(Property<StopAction> stopAction) {
        this.stopAction = stopAction;
        return this;
    }

    /**
     * SNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonIgnore
    public Property<SNSAction> getSNSAction() {
        return sNSAction;
    }

    /**
     * SNSAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-snsaction.html
     * 
     */
    @JsonIgnore
    public void setSNSAction(Property<SNSAction> sNSAction) {
        this.sNSAction = sNSAction;
    }

    public Action withSNSAction(Property<SNSAction> sNSAction) {
        this.sNSAction = sNSAction;
        return this;
    }

    /**
     * WorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonIgnore
    public Property<WorkmailAction> getWorkmailAction() {
        return workmailAction;
    }

    /**
     * WorkmailAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-workmailaction.html
     * 
     */
    @JsonIgnore
    public void setWorkmailAction(Property<WorkmailAction> workmailAction) {
        this.workmailAction = workmailAction;
    }

    public Action withWorkmailAction(Property<WorkmailAction> workmailAction) {
        this.workmailAction = workmailAction;
        return this;
    }

    /**
     * AddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonIgnore
    public Property<AddHeaderAction> getAddHeaderAction() {
        return addHeaderAction;
    }

    /**
     * AddHeaderAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-addheaderaction.html
     * 
     */
    @JsonIgnore
    public void setAddHeaderAction(Property<AddHeaderAction> addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
    }

    public Action withAddHeaderAction(Property<AddHeaderAction> addHeaderAction) {
        this.addHeaderAction = addHeaderAction;
        return this;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public Property<LambdaAction> getLambdaAction() {
        return lambdaAction;
    }

    /**
     * LambdaAction
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ses-receiptrule-lambdaaction.html
     * 
     */
    @JsonIgnore
    public void setLambdaAction(Property<LambdaAction> lambdaAction) {
        this.lambdaAction = lambdaAction;
    }

    public Action withLambdaAction(Property<LambdaAction> lambdaAction) {
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
