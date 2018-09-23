
package aws.cloudfront;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * LambdaFunctionAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "EventType",
    "LambdaFunctionARN"
})
public class LambdaFunctionAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype
     * 
     */
    @JsonProperty("EventType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype")
    private String eventType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn
     * 
     */
    @JsonProperty("LambdaFunctionARN")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn")
    private String lambdaFunctionARN;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype
     * 
     */
    @JsonProperty("EventType")
    public String getEventType() {
        return eventType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-eventtype
     * 
     */
    @JsonProperty("EventType")
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public LambdaFunctionAssociation withEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn
     * 
     */
    @JsonProperty("LambdaFunctionARN")
    public String getLambdaFunctionARN() {
        return lambdaFunctionARN;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-distribution-lambdafunctionassociation.html#cfn-cloudfront-distribution-lambdafunctionassociation-lambdafunctionarn
     * 
     */
    @JsonProperty("LambdaFunctionARN")
    public void setLambdaFunctionARN(String lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
    }

    public LambdaFunctionAssociation withLambdaFunctionARN(String lambdaFunctionARN) {
        this.lambdaFunctionARN = lambdaFunctionARN;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventType", eventType).append("lambdaFunctionARN", lambdaFunctionARN).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(lambdaFunctionARN).append(eventType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LambdaFunctionAssociation) == false) {
            return false;
        }
        LambdaFunctionAssociation rhs = ((LambdaFunctionAssociation) other);
        return new EqualsBuilder().append(lambdaFunctionARN, rhs.lambdaFunctionARN).append(eventType, rhs.eventType).isEquals();
    }

}