
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Resource
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ParentId",
    "PathPart",
    "RestApiId"
})
public class Resource {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid
     * 
     */
    @JsonProperty("ParentId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid")
    private CharSequence parentId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart
     * 
     */
    @JsonProperty("PathPart")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart")
    private CharSequence pathPart;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid")
    private CharSequence restApiId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid
     * 
     */
    public CharSequence getParentId() {
        return parentId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-parentid
     * 
     */
    public void setParentId(CharSequence parentId) {
        this.parentId = parentId;
    }

    public Resource withParentId(CharSequence parentId) {
        this.parentId = parentId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart
     * 
     */
    public CharSequence getPathPart() {
        return pathPart;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-pathpart
     * 
     */
    public void setPathPart(CharSequence pathPart) {
        this.pathPart = pathPart;
    }

    public Resource withPathPart(CharSequence pathPart) {
        this.pathPart = pathPart;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-resource.html#cfn-apigateway-resource-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public Resource withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("parentId", parentId).append("pathPart", pathPart).append("restApiId", restApiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(pathPart).append(parentId).append(restApiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Resource) == false) {
            return false;
        }
        Resource rhs = ((Resource) other);
        return new EqualsBuilder().append(pathPart, rhs.pathPart).append(parentId, rhs.parentId).append(restApiId, rhs.restApiId).isEquals();
    }

}
