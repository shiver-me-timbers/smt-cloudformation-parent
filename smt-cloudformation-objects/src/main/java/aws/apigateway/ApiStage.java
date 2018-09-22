
package aws.apigateway;

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
    "Stage"
})
public class ApiStage {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid")
    private String apiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage
     * 
     */
    @JsonProperty("Stage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage")
    private String stage;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid
     * 
     */
    @JsonProperty("ApiId")
    public String getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-apiid
     * 
     */
    @JsonProperty("ApiId")
    public void setApiId(String apiId) {
        this.apiId = apiId;
    }

    public ApiStage withApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage
     * 
     */
    @JsonProperty("Stage")
    public String getStage() {
        return stage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-usageplan-apistage.html#cfn-apigateway-usageplan-apistage-stage
     * 
     */
    @JsonProperty("Stage")
    public void setStage(String stage) {
        this.stage = stage;
    }

    public ApiStage withStage(String stage) {
        this.stage = stage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiId", apiId).append("stage", stage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(stage).append(apiId).toHashCode();
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
        return new EqualsBuilder().append(stage, rhs.stage).append(apiId, rhs.apiId).isEquals();
    }

}
