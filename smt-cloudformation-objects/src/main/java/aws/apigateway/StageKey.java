
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
    private CharSequence restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename")
    private CharSequence stageName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public StageKey withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename
     * 
     */
    public CharSequence getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename
     * 
     */
    public void setStageName(CharSequence stageName) {
        this.stageName = stageName;
    }

    public StageKey withStageName(CharSequence stageName) {
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
