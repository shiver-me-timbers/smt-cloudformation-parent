
package aws.apigateway;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ClientCertificate
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Description"
})
public class ClientCertificate {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html#cfn-apigateway-clientcertificate-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html#cfn-apigateway-clientcertificate-description")
    private CharSequence description;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html#cfn-apigateway-clientcertificate-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-clientcertificate.html#cfn-apigateway-clientcertificate-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public ClientCertificate withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClientCertificate) == false) {
            return false;
        }
        ClientCertificate rhs = ((ClientCertificate) other);
        return new EqualsBuilder().append(description, rhs.description).isEquals();
    }

}
