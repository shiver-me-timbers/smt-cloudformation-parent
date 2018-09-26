
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DocumentationVersion
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "DocumentationVersion",
    "RestApiId"
})
public class DocumentationVersion {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion
     * 
     */
    @JsonProperty("DocumentationVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion")
    private CharSequence documentationVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid")
    private CharSequence restApiId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public DocumentationVersion withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion
     * 
     */
    public CharSequence getDocumentationVersion() {
        return documentationVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-documentationversion
     * 
     */
    public void setDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
    }

    public DocumentationVersion withDocumentationVersion(CharSequence documentationVersion) {
        this.documentationVersion = documentationVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid
     * 
     */
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationversion.html#cfn-apigateway-documentationversion-restapiid
     * 
     */
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public DocumentationVersion withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("documentationVersion", documentationVersion).append("restApiId", restApiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(documentationVersion).append(restApiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentationVersion) == false) {
            return false;
        }
        DocumentationVersion rhs = ((DocumentationVersion) other);
        return new EqualsBuilder().append(description, rhs.description).append(documentationVersion, rhs.documentationVersion).append(restApiId, rhs.restApiId).isEquals();
    }

}
