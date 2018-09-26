
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * HttpConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Endpoint"
})
public class HttpConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint")
    private CharSequence endpoint;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint
     * 
     */
    public CharSequence getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint
     * 
     */
    public void setEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
    }

    public HttpConfig withEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpoint", endpoint).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpoint).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HttpConfig) == false) {
            return false;
        }
        HttpConfig rhs = ((HttpConfig) other);
        return new EqualsBuilder().append(endpoint, rhs.endpoint).isEquals();
    }

}
