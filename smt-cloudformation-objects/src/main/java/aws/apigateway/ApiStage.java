
package aws.apigateway;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApiStage
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ApiId",
    "Stage",
    "Throttle"
})
public class ApiStage {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid")
    private CharSequence apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage
     * 
     */
    @JsonProperty("Stage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage")
    private CharSequence stage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle
     * 
     */
    @JsonProperty("Throttle")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle")
    private Map<String, ThrottleSettings> throttle;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid
     * 
     */
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid
     * 
     */
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public ApiStage withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage
     * 
     */
    public CharSequence getStage() {
        return stage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage
     * 
     */
    public void setStage(CharSequence stage) {
        this.stage = stage;
    }

    public ApiStage withStage(CharSequence stage) {
        this.stage = stage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle
     * 
     */
    public Map<String, ThrottleSettings> getThrottle() {
        return throttle;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-throttle
     * 
     */
    public void setThrottle(Map<String, ThrottleSettings> throttle) {
        this.throttle = throttle;
    }

    public ApiStage withThrottle(Map<String, ThrottleSettings> throttle) {
        this.throttle = throttle;
        return this;
    }

    @Override
    public java.lang.String toString() {
        return new ToStringBuilder(this).append("apiId", apiId).append("stage", stage).append("throttle", throttle).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(throttle).append(stage).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiStage) == false) {
            return false;
        }
        ApiStage rhs = ((ApiStage) other);
        return new EqualsBuilder().append(throttle, rhs.throttle).append(stage, rhs.stage).append(apiId, rhs.apiId).isEquals();
    }

}
