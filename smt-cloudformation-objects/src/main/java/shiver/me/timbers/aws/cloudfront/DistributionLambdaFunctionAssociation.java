
package shiver.me.timbers.aws.cloudfront;

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
 * DistributionLambdaFunctionAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "IncludeBody",
    "EventType",
    "LambdaFunctionARN"
})
public class DistributionLambdaFunctionAssociation implements Property<DistributionLambdaFunctionAssociation>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-includebody
     * 
     */
    @JsonProperty("IncludeBody")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-includebody")
    private CharSequence includeBody;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype
     * 
     */
    @JsonProperty("EventType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype")
    private CharSequence eventType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn
     * 
     */
    @JsonProperty("LambdaFunctionARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn")
    private CharSequence lambdaFunctionARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-includebody
     * 
     */
    @JsonIgnore
    public CharSequence getIncludeBody() {
        return includeBody;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-includebody
     * 
     */
    @JsonIgnore
    public void setIncludeBody(CharSequence includeBody) {
        this.includeBody = includeBody;
    }

    public DistributionLambdaFunctionAssociation withIncludeBody(CharSequence includeBody) {
        this.includeBody = includeBody;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype
     * 
     */
    @JsonIgnore
    public CharSequence getEventType() {
        return eventType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype
     * 
     */
    @JsonIgnore
    public void setEventType(CharSequence eventType) {
        this.eventType = eventType;
    }

    public DistributionLambdaFunctionAssociation withEventType(CharSequence eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn
     * 
     */
    @JsonIgnore
    public CharSequence getLambdaFunctionARN() {
        return lambdaFunctionARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn
     * 
     */
    @JsonIgnore
    public void setLambdaFunctionARN(CharSequence lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    public DistributionLambdaFunctionAssociation withLambdaFunctionARN(CharSequence lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("includeBody", includeBody).append("eventType", eventType).append("lambdaFunctionARN", lambdaFunctionARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lambdaFunctionARN).append(eventType).append(includeBody).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DistributionLambdaFunctionAssociation) == false) {
            return false;
        }
        DistributionLambdaFunctionAssociation rhs = ((DistributionLambdaFunctionAssociation) other);
        return new EqualsBuilder().append(lambdaFunctionARN, rhs.lambdaFunctionARN).append(eventType, rhs.eventType).append(includeBody, rhs.includeBody).isEquals();
    }

}
