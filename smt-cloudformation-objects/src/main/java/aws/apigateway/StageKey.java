
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * StageKey
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "RestApiId",
    "StageName"
})
public class StageKey {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid")
    private String restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename")
    private String stageName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    public StageKey withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename
     * 
     */
    @JsonProperty("StageName")
    public String getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename
     * 
     */
    @JsonProperty("StageName")
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public StageKey withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("restApiId", restApiId).append("stageName", stageName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(restApiId).append(stageName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof StageKey) == false) {
            return false;
        }
        StageKey rhs = ((StageKey) other);
        return new EqualsBuilder().append(restApiId, rhs.restApiId).append(stageName, rhs.stageName).isEquals();
    }

}
