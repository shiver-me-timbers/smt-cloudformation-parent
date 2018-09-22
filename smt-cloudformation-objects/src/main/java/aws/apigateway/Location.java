
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Location
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Method",
    "Name",
    "Path",
    "StatusCode",
    "Type"
})
public class Location {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method
     * 
     */
    @JsonProperty("Method")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method")
    private String method;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name
     * 
     */
    @JsonProperty("Name")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name")
    private String name;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path
     * 
     */
    @JsonProperty("Path")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path")
    private String path;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode")
    private String statusCode;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type
     * 
     */
    @JsonProperty("Type")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type")
    private String type;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method
     * 
     */
    @JsonProperty("Method")
    public String getMethod() {
        return method;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-method
     * 
     */
    @JsonProperty("Method")
    public void setMethod(String method) {
        this.method = method;
    }

    public Location withMethod(String method) {
        this.method = method;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name
     * 
     */
    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-name
     * 
     */
    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    public Location withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path
     * 
     */
    @JsonProperty("Path")
    public String getPath() {
        return path;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-path
     * 
     */
    @JsonProperty("Path")
    public void setPath(String path) {
        this.path = path;
    }

    public Location withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    public String getStatusCode() {
        return statusCode;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-statuscode
     * 
     */
    @JsonProperty("StatusCode")
    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public Location withStatusCode(String statusCode) {
        this.statusCode = statusCode;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type
     * 
     */
    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-documentationpart-location.html#cfn-apigateway-documentationpart-location-type
     * 
     */
    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    public Location withType(String type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("method", method).append("name", name).append("path", path).append("statusCode", statusCode).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(path).append(method).append(type).append(statusCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Location) == false) {
            return false;
        }
        Location rhs = ((Location) other);
        return new EqualsBuilder().append(name, rhs.name).append(path, rhs.path).append(method, rhs.method).append(type, rhs.type).append(statusCode, rhs.statusCode).isEquals();
    }

}
