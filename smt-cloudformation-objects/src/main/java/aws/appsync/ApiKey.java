
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ApiKey
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description",
    "Expires",
    "ApiId"
})
public class ApiKey {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires
     * 
     */
    @JsonProperty("Expires")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires")
    private Double expires;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid
     * 
     */
    @JsonProperty("ApiId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid")
    private CharSequence apiId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ApiKey withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires
     * 
     */
    public Double getExpires() {
        return expires;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-expires
     * 
     */
    public void setExpires(Double expires) {
        this.expires = expires;
    }

    public ApiKey withExpires(Double expires) {
        this.expires = expires;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid
     * 
     */
    public CharSequence getApiId() {
        return apiId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-apikey.html#cfn-appsync-apikey-apiid
     * 
     */
    public void setApiId(CharSequence apiId) {
        this.apiId = apiId;
    }

    public ApiKey withApiId(CharSequence apiId) {
        this.apiId = apiId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("expires", expires).append("apiId", apiId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(expires).append(apiId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiKey) == false) {
            return false;
        }
        ApiKey rhs = ((ApiKey) other);
        return new EqualsBuilder().append(description, rhs.description).append(expires, rhs.expires).append(apiId, rhs.apiId).isEquals();
    }

}
