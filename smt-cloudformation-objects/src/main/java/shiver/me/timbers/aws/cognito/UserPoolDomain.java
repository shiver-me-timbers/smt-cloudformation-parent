
package shiver.me.timbers.aws.cognito;

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
 * UserPoolDomain
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "UserPoolId",
    "CustomDomainConfig",
    "Domain"
})
public class UserPoolDomain {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid
     * 
     */
    @JsonProperty("UserPoolId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid")
    private CharSequence userPoolId;
    /**
     * UserPoolDomainCustomDomainConfigType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html
     * 
     */
    @JsonProperty("CustomDomainConfig")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html")
    private Property<UserPoolDomainCustomDomainConfigType> customDomainConfig;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain
     * 
     */
    @JsonProperty("Domain")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain")
    private CharSequence domain;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid
     * 
     */
    @JsonIgnore
    public CharSequence getUserPoolId() {
        return userPoolId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-userpoolid
     * 
     */
    @JsonIgnore
    public void setUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
    }

    public UserPoolDomain withUserPoolId(CharSequence userPoolId) {
        this.userPoolId = userPoolId;
        return this;
    }

    /**
     * UserPoolDomainCustomDomainConfigType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolDomainCustomDomainConfigType> getCustomDomainConfig() {
        return customDomainConfig;
    }

    /**
     * UserPoolDomainCustomDomainConfigType
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpooldomain-customdomainconfigtype.html
     * 
     */
    @JsonIgnore
    public void setCustomDomainConfig(Property<UserPoolDomainCustomDomainConfigType> customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
    }

    public UserPoolDomain withCustomDomainConfig(Property<UserPoolDomainCustomDomainConfigType> customDomainConfig) {
        this.customDomainConfig = customDomainConfig;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain
     * 
     */
    @JsonIgnore
    public CharSequence getDomain() {
        return domain;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cognito-userpooldomain.html#cfn-cognito-userpooldomain-domain
     * 
     */
    @JsonIgnore
    public void setDomain(CharSequence domain) {
        this.domain = domain;
    }

    public UserPoolDomain withDomain(CharSequence domain) {
        this.domain = domain;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userPoolId", userPoolId).append("customDomainConfig", customDomainConfig).append("domain", domain).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(customDomainConfig).append(userPoolId).append(domain).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolDomain) == false) {
            return false;
        }
        UserPoolDomain rhs = ((UserPoolDomain) other);
        return new EqualsBuilder().append(customDomainConfig, rhs.customDomainConfig).append(userPoolId, rhs.userPoolId).append(domain, rhs.domain).isEquals();
    }

}
