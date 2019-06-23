
package aws.appsync;

import aws.Property;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * DataSourceHttpConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Endpoint",
    "AuthorizationConfig"
})
public class DataSourceHttpConfig implements Property<DataSourceHttpConfig>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint
     * 
     */
    @JsonProperty("Endpoint")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint")
    private CharSequence endpoint;
    /**
     * DataSourceAuthorizationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html
     * 
     */
    @JsonProperty("AuthorizationConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html")
    private Property<DataSourceAuthorizationConfig> authorizationConfig;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint
     * 
     */
    @JsonIgnore
    public CharSequence getEndpoint() {
        return endpoint;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-httpconfig.html#cfn-appsync-datasource-httpconfig-endpoint
     * 
     */
    @JsonIgnore
    public void setEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
    }

    public DataSourceHttpConfig withEndpoint(CharSequence endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /**
     * DataSourceAuthorizationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceAuthorizationConfig> getAuthorizationConfig() {
        return authorizationConfig;
    }

    /**
     * DataSourceAuthorizationConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html
     * 
     */
    @JsonIgnore
    public void setAuthorizationConfig(Property<DataSourceAuthorizationConfig> authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
    }

    public DataSourceHttpConfig withAuthorizationConfig(Property<DataSourceAuthorizationConfig> authorizationConfig) {
        this.authorizationConfig = authorizationConfig;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("endpoint", endpoint).append("authorizationConfig", authorizationConfig).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(endpoint).append(authorizationConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DataSourceHttpConfig) == false) {
            return false;
        }
        DataSourceHttpConfig rhs = ((DataSourceHttpConfig) other);
        return new EqualsBuilder().append(endpoint, rhs.endpoint).append(authorizationConfig, rhs.authorizationConfig).isEquals();
    }

}
