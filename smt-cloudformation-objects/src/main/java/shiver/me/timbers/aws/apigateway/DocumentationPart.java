
package shiver.me.timbers.aws.apigateway;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import shiver.me.timbers.aws.Property;


/**
 * DocumentationPart
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Location",
    "Properties",
    "RestApiId"
})
public class DocumentationPart {

    /**
     * DocumentationPartLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html
     * 
     */
    @JsonProperty("Location")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html")
    private Property<DocumentationPartLocation> location;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties
     * 
     */
    @JsonProperty("Properties")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties")
    private CharSequence properties;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid
     * 
     */
    @JsonProperty("RestApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid")
    private CharSequence restApiId;

    /**
     * DocumentationPartLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html
     * 
     */
    @JsonIgnore
    public Property<DocumentationPartLocation> getLocation() {
        return location;
    }

    /**
     * DocumentationPartLocation
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html
     * 
     */
    @JsonIgnore
    public void setLocation(Property<DocumentationPartLocation> location) {
        this.location = location;
    }

    public DocumentationPart withLocation(Property<DocumentationPartLocation> location) {
        this.location = location;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties
     * 
     */
    @JsonIgnore
    public CharSequence getProperties() {
        return properties;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-properties
     * 
     */
    @JsonIgnore
    public void setProperties(CharSequence properties) {
        this.properties = properties;
    }

    public DocumentationPart withProperties(CharSequence properties) {
        this.properties = properties;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid
     * 
     */
    @JsonIgnore
    public CharSequence getRestApiId() {
        return restApiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-documentationpart.html#cfn-apigateway-documentationpart-restapiid
     * 
     */
    @JsonIgnore
    public void setRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
    }

    public DocumentationPart withRestApiId(CharSequence restApiId) {
        this.restApiId = restApiId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("location", location).append("properties", properties).append("restApiId", restApiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(location).append(properties).append(restApiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DocumentationPart) == false) {
            return false;
        }
        DocumentationPart rhs = ((DocumentationPart) other);
        return new EqualsBuilder().append(location, rhs.location).append(properties, rhs.properties).append(restApiId, rhs.restApiId).isEquals();
    }

}
