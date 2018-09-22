
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Model
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ContentType",
    "Description",
    "Name",
    "RestApiId",
    "Schema"
})
public class Model {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-contenttype
     * 
     */
    @JsonProperty("ContentType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-contenttype")
    private String contentType;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-description")
    private String description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-restapiid")
    private String restApiId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-schema
     * 
     */
    @JsonProperty("Schema")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-schema")
    private Schema schema;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-contenttype
     * 
     */
    @JsonProperty("ContentType")
    public String getContentType() {
        return contentType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-contenttype
     * 
     */
    @JsonProperty("ContentType")
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public Model withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-description
     * 
     */
    @JsonProperty("Description")
    public String getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-description
     * 
     */
    @JsonProperty("Description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Model withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Model withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public String getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    public void setRestApiId(String restApiId) {
        this.restApiId = restApiId;
    }

    public Model withRestApiId(String restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-schema
     * 
     */
    @JsonProperty("Schema")
    public Schema getSchema() {
        return schema;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-model.html#cfn-apigateway-model-schema
     * 
     */
    @JsonProperty("Schema")
    public void setSchema(Schema schema) {
        this.schema = schema;
    }

    public Model withSchema(Schema schema) {
        this.schema = schema;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contentType", contentType).append("description", description).append("name", name).append("restApiId", restApiId).append("schema", schema).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(schema).append(description).append(contentType).append(restApiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Model) == false) {
            return false;
        }
        Model rhs = ((Model) other);
        return new EqualsBuilder().append(name, rhs.name).append(schema, rhs.schema).append(description, rhs.description).append(contentType, rhs.contentType).append(restApiId, rhs.restApiId).isEquals();
    }

}
