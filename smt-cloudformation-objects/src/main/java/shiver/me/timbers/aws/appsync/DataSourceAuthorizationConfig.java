
package shiver.me.timbers.aws.appsync;

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
 * DataSourceAuthorizationConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AwsIamConfig",
    "AuthorizationType"
})
public class DataSourceAuthorizationConfig implements Property<DataSourceAuthorizationConfig>
{

    /**
     * DataSourceAwsIamConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
     * 
     */
    @JsonProperty("AwsIamConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html")
    private Property<DataSourceAwsIamConfig> awsIamConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype
     * 
     */
    @JsonProperty("AuthorizationType")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-authorizationconfig.html#cfn-appsync-datasource-authorizationconfig-authorizationtype")
    private CharSequence authorizationType;

    /**
     * DataSourceAwsIamConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
     * 
     */
    @JsonIgnore
    public Property<DataSourceAwsIamConfig> getAwsIamConfig() {
        return awsIamConfig;
    }

    /**
     * DataSourceAwsIamConfig
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-datasource-awsiamconfig.html
     * 
     */
    @JsonIgnore
    public void setAwsIamConfig(Property<DataSourceAwsIamConfig> awsIamConfig) {
        this.awsIamConfig = awsIamConfig;
    }

    public DataSourceAuthorizationConfig withAwsIamConfig(Property<DataSourceAwsIamConfig> awsIamConfig) {
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

    public DataSourceAuthorizationConfig withAuthorizationType(CharSequence authorizationType) {
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
        if ((other instanceof DataSourceAuthorizationConfig) == false) {
            return false;
        }
        DataSourceAuthorizationConfig rhs = ((DataSourceAuthorizationConfig) other);
        return new EqualsBuilder().append(authorizationType, rhs.authorizationType).append(awsIamConfig, rhs.awsIamConfig).isEquals();
    }

}
