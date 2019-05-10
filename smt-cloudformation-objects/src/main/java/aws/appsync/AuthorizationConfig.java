
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AuthorizationConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AwsIamConfig",
    "AuthorizationType"
})
public class AuthorizationConfig {

    /**
     * AwsIamConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
     * 
     */
    @JsonProperty("AwsIamConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html")
    private AwsIamConfig awsIamConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype")
    private CharSequence authorizationType;

    /**
     * AwsIamConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
     * 
     */
    @JsonIgnore
    public AwsIamConfig getAwsIamConfig() {
        return awsIamConfig;
    }

    /**
     * AwsIamConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
     * 
     */
    @JsonIgnore
    public void setAwsIamConfig(AwsIamConfig awsIamConfig) {
        this.awsIamConfig = awsIamConfig;
    }

    public AuthorizationConfig withAwsIamConfig(AwsIamConfig awsIamConfig) {
        this.awsIamConfig = awsIamConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype
     * 
     */
    @JsonIgnore
    public CharSequence getAuthorizationType() {
        return authorizationType;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype
     * 
     */
    @JsonIgnore
    public void setAuthorizationType(CharSequence authorizationType) {
        this.authorizationType = authorizationType;
    }

    public AuthorizationConfig withAuthorizationType(CharSequence authorizationType) {
        this.authorizationType = authorizationType;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("awsIamConfig", awsIamConfig).append("authorizationType", authorizationType).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authorizationType).append(awsIamConfig).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorizationConfig) == false) {
            return false;
        }
        AuthorizationConfig rhs = ((AuthorizationConfig) other);
        return new EqualsBuilder().append(authorizationType, rhs.authorizationType).append(awsIamConfig, rhs.awsIamConfig).isEquals();
    }

}
