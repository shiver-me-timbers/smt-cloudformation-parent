
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * BasePathMapping
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BasePath",
    "DomainName",
    "RestApiId",
    "Stage"
})
public class BasePathMapping {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath
     * 
     */
    @JsonProperty("BasePath")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath")
    private CharSequence basePath;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname
     * 
     */
    @JsonProperty("DomainName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname")
    private CharSequence domainName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid")
    private CharSequence restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage
     * 
     */
    @JsonProperty("Stage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage")
    private CharSequence stage;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath
     * 
     */
    public CharSequence getBasePath() {
        return basePath;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-basepath
     * 
     */
    public void setBasePath(CharSequence basePath) {
        this.basePath = basePath;
    }

    public BasePathMapping withBasePath(CharSequence basePath) {
        this.basePath = basePath;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname
     * 
     */
    public CharSequence getDomainName() {
        return domainName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-domainname
     * 
     */
    public void setDomainName(CharSequence domainName) {
        this.domainName = domainName;
    }

    public BasePathMapping withDomainName(CharSequence domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public BasePathMapping withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage
     * 
     */
    public CharSequence getStage() {
        return stage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-basepathmapping.html#cfn-apigateway-basepathmapping-stage
     * 
     */
    public void setStage(CharSequence stage) {
        this.stage = stage;
    }

    public BasePathMapping withStage(CharSequence stage) {
        this.stage = stage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("basePath", basePath).append("domainName", domainName).append("restApiId", restApiId).append("stage", stage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(basePath).append(stage).append(restApiId).append(domainName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BasePathMapping) == false) {
            return false;
        }
        BasePathMapping rhs = ((BasePathMapping) other);
        return new EqualsBuilder().append(basePath, rhs.basePath).append(stage, rhs.stage).append(restApiId, rhs.restApiId).append(domainName, rhs.domainName).isEquals();
    }

}
