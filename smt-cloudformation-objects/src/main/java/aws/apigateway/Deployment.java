
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Deployment
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "RestApiId",
    "StageDescription",
    "StageName"
})
public class Deployment {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid")
    private String restApiId;
    /**
     * StageDescription
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
     * 
     */
    @JsonProperty("StageDescription")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html")
    private StageDescription stageDescription;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename
     * 
     */
    @JsonProperty("StageName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename")
    private String stageName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Deployment withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    public Deployment withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * StageDescription
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
     * 
     */
    @JsonProperty("StageDescription")
    public StageDescription getStageDescription() {
        return stageDescription;
    }

    /**
     * StageDescription
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-deployment-stagedescription.html
     * 
     */
    @JsonProperty("StageDescription")
    public void setStageDescription(StageDescription stageDescription) {
        this.stageDescription = stageDescription;
    }

    public Deployment withStageDescription(StageDescription stageDescription) {
        this.stageDescription = stageDescription;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename
     * 
     */
    @JsonProperty("StageName")
    public String getStageName() {
        return stageName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-deployment.html#cfn-apigateway-deployment-stagename
     * 
     */
    @JsonProperty("StageName")
    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public Deployment withStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("restApiId", restApiId).append("stageDescription", stageDescription).append("stageName", stageName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(stageName).append(restApiId).append(stageDescription).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Deployment) == false) {
            return false;
        }
        Deployment rhs = ((Deployment) other);
        return new EqualsBuilder().append(description, rhs.description).append(stageName, rhs.stageName).append(restApiId, rhs.restApiId).append(stageDescription, rhs.stageDescription).isEquals();
    }

}
