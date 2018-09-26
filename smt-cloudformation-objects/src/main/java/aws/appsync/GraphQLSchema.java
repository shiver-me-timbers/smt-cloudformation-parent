
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * GraphQLSchema
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Definition",
    "DefinitionS3Location",
    "ApiId"
})
public class GraphQLSchema {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition
     * 
     */
    @JsonProperty("Definition")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition")
    private CharSequence definition;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location
     * 
     */
    @JsonProperty("DefinitionS3Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location")
    private CharSequence definitionS3Location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid")
    private CharSequence apiId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition
     * 
     */
    public CharSequence getDefinition() {
        return definition;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definition
     * 
     */
    public void setDefinition(CharSequence definition) {
        this.definition = definition;
    }

    public GraphQLSchema withDefinition(CharSequence definition) {
        this.definition = definition;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location
     * 
     */
    public CharSequence getDefinitionS3Location() {
        return definitionS3Location;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-definitions3location
     * 
     */
    public void setDefinitionS3Location(CharSequence definitionS3Location) {
        this.definitionS3Location = definitionS3Location;
    }

    public GraphQLSchema withDefinitionS3Location(CharSequence definitionS3Location) {
        this.definitionS3Location = definitionS3Location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid
     * 
     */
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-graphqlschema.html#cfn-appsync-graphqlschema-apiid
     * 
     */
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public GraphQLSchema withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("definition", definition).append("definitionS3Location", definitionS3Location).append("apiId", apiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(definition).append(definitionS3Location).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof GraphQLSchema) == false) {
            return false;
        }
        GraphQLSchema rhs = ((GraphQLSchema) other);
        return new EqualsBuilder().append(definition, rhs.definition).append(definitionS3Location, rhs.definitionS3Location).append(apiId, rhs.apiId).isEquals();
    }

}
