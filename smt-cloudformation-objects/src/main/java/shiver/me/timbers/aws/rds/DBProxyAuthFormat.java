
package shiver.me.timbers.aws.rds;

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
 * DBProxyAuthFormat
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AuthScheme",
    "Description",
    "IAMAuth",
    "SecretArn",
    "UserName"
})
public class DBProxyAuthFormat implements Property<DBProxyAuthFormat>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-authscheme
     * 
     */
    @JsonProperty("AuthScheme")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-authscheme")
    private CharSequence authScheme;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-iamauth
     * 
     */
    @JsonProperty("IAMAuth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-iamauth")
    private CharSequence iAMAuth;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-secretarn
     * 
     */
    @JsonProperty("SecretArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-secretarn")
    private CharSequence secretArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-username
     * 
     */
    @JsonProperty("UserName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-username")
    private CharSequence userName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-authscheme
     * 
     */
    @JsonIgnore
    public CharSequence getAuthScheme() {
        return authScheme;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-authscheme
     * 
     */
    @JsonIgnore
    public void setAuthScheme(CharSequence authScheme) {
        this.authScheme = authScheme;
    }

    public DBProxyAuthFormat withAuthScheme(CharSequence authScheme) {
        this.authScheme = authScheme;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-description
     * 
     */
    @JsonIgnore
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-description
     * 
     */
    @JsonIgnore
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public DBProxyAuthFormat withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-iamauth
     * 
     */
    @JsonIgnore
    public CharSequence getIAMAuth() {
        return iAMAuth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-iamauth
     * 
     */
    @JsonIgnore
    public void setIAMAuth(CharSequence iAMAuth) {
        this.iAMAuth = iAMAuth;
    }

    public DBProxyAuthFormat withIAMAuth(CharSequence iAMAuth) {
        this.iAMAuth = iAMAuth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-secretarn
     * 
     */
    @JsonIgnore
    public CharSequence getSecretArn() {
        return secretArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-secretarn
     * 
     */
    @JsonIgnore
    public void setSecretArn(CharSequence secretArn) {
        this.secretArn = secretArn;
    }

    public DBProxyAuthFormat withSecretArn(CharSequence secretArn) {
        this.secretArn = secretArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-username
     * 
     */
    @JsonIgnore
    public CharSequence getUserName() {
        return userName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxy-authformat.html#cfn-rds-dbproxy-authformat-username
     * 
     */
    @JsonIgnore
    public void setUserName(CharSequence userName) {
        this.userName = userName;
    }

    public DBProxyAuthFormat withUserName(CharSequence userName) {
        this.userName = userName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("authScheme", authScheme).append("description", description).append("iAMAuth", iAMAuth).append("secretArn", secretArn).append("userName", userName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(iAMAuth).append(description).append(authScheme).append(userName).append(secretArn).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBProxyAuthFormat) == false) {
            return false;
        }
        DBProxyAuthFormat rhs = ((DBProxyAuthFormat) other);
        return new EqualsBuilder().append(iAMAuth, rhs.iAMAuth).append(description, rhs.description).append(authScheme, rhs.authScheme).append(userName, rhs.userName).append(secretArn, rhs.secretArn).isEquals();
    }

}
