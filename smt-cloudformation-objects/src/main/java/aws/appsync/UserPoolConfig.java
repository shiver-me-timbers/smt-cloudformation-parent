
package aws.appsync;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * UserPoolConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "AppIdClientRegex",
    "UserPoolId",
    "AwsRegion",
    "DefaultAction"
})
public class UserPoolConfig {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex
     * 
     */
    @JsonProperty("AppIdClientRegex")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex")
    private String appIdClientRegex;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid")
    private String userPoolId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion")
    private String awsRegion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction
     * 
     */
    @JsonProperty("DefaultAction")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction")
    private String defaultAction;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex
     * 
     */
    @JsonProperty("AppIdClientRegex")
    public String getAppIdClientRegex() {
        return appIdClientRegex;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-appidclientregex
     * 
     */
    @JsonProperty("AppIdClientRegex")
    public void setAppIdClientRegex(String appIdClientRegex) {
        this.appIdClientRegex = appIdClientRegex;
    }

    public UserPoolConfig withAppIdClientRegex(String appIdClientRegex) {
        this.appIdClientRegex = appIdClientRegex;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    public String getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolConfig withUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    public String getAwsRegion() {
        return awsRegion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-awsregion
     * 
     */
    @JsonProperty("AwsRegion")
    public void setAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
    }

    public UserPoolConfig withAwsRegion(String awsRegion) {
        this.awsRegion = awsRegion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction
     * 
     */
    @JsonProperty("DefaultAction")
    public String getDefaultAction() {
        return defaultAction;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appsync-graphqlapi-userpoolconfig.html#cfn-appsync-graphqlapi-userpoolconfig-defaultaction
     * 
     */
    @JsonProperty("DefaultAction")
    public void setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
    }

    public UserPoolConfig withDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("appIdClientRegex", appIdClientRegex).append("userPoolId", userPoolId).append("awsRegion", awsRegion).append("defaultAction", defaultAction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(awsRegion).append(defaultAction).append(userPoolId).append(appIdClientRegex).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolConfig) == false) {
            return false;
        }
        UserPoolConfig rhs = ((UserPoolConfig) other);
        return new EqualsBuilder().append(awsRegion, rhs.awsRegion).append(defaultAction, rhs.defaultAction).append(userPoolId, rhs.userPoolId).append(appIdClientRegex, rhs.appIdClientRegex).isEquals();
    }

}
