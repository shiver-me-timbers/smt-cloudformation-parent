
package aws.cognito;

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
 * UserPoolAdminCreateUserConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "InviteMessageTemplate",
    "UnusedAccountValidityDays",
    "AllowAdminCreateUserOnly"
})
public class UserPoolAdminCreateUserConfig implements Property<UserPoolAdminCreateUserConfig>
{

    /**
     * UserPoolInviteMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
     * 
     */
    @JsonProperty("InviteMessageTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html")
    private Property<UserPoolInviteMessageTemplate> inviteMessageTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays
     * 
     */
    @JsonProperty("UnusedAccountValidityDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays")
    private Number unusedAccountValidityDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly
     * 
     */
    @JsonProperty("AllowAdminCreateUserOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly")
    private CharSequence allowAdminCreateUserOnly;

    /**
     * UserPoolInviteMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
     * 
     */
    @JsonIgnore
    public Property<UserPoolInviteMessageTemplate> getInviteMessageTemplate() {
        return inviteMessageTemplate;
    }

    /**
     * UserPoolInviteMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
     * 
     */
    @JsonIgnore
    public void setInviteMessageTemplate(Property<UserPoolInviteMessageTemplate> inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    public UserPoolAdminCreateUserConfig withInviteMessageTemplate(Property<UserPoolInviteMessageTemplate> inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays
     * 
     */
    @JsonIgnore
    public Number getUnusedAccountValidityDays() {
        return unusedAccountValidityDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays
     * 
     */
    @JsonIgnore
    public void setUnusedAccountValidityDays(Number unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
    }

    public UserPoolAdminCreateUserConfig withUnusedAccountValidityDays(Number unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly
     * 
     */
    @JsonIgnore
    public CharSequence getAllowAdminCreateUserOnly() {
        return allowAdminCreateUserOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly
     * 
     */
    @JsonIgnore
    public void setAllowAdminCreateUserOnly(CharSequence allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
    }

    public UserPoolAdminCreateUserConfig withAllowAdminCreateUserOnly(CharSequence allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("inviteMessageTemplate", inviteMessageTemplate).append("unusedAccountValidityDays", unusedAccountValidityDays).append("allowAdminCreateUserOnly", allowAdminCreateUserOnly).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(allowAdminCreateUserOnly).append(inviteMessageTemplate).append(unusedAccountValidityDays).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof UserPoolAdminCreateUserConfig) == false) {
            return false;
        }
        UserPoolAdminCreateUserConfig rhs = ((UserPoolAdminCreateUserConfig) other);
        return new EqualsBuilder().append(allowAdminCreateUserOnly, rhs.allowAdminCreateUserOnly).append(inviteMessageTemplate, rhs.inviteMessageTemplate).append(unusedAccountValidityDays, rhs.unusedAccountValidityDays).isEquals();
    }

}
