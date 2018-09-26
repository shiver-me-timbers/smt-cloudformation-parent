
package aws.cognito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * AdminCreateUserConfig
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "InviteMessageTemplate",
    "UnusedAccountValidityDays",
    "AllowAdminCreateUserOnly"
})
public class AdminCreateUserConfig {

    /**
     * InviteMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
     * 
     */
    @JsonProperty("InviteMessageTemplate")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html")
    private InviteMessageTemplate inviteMessageTemplate;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays
     * 
     */
    @JsonProperty("UnusedAccountValidityDays")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays")
    private Double unusedAccountValidityDays;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly
     * 
     */
    @JsonProperty("AllowAdminCreateUserOnly")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly")
    private Boolean allowAdminCreateUserOnly;

    /**
     * InviteMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
     * 
     */
    public InviteMessageTemplate getInviteMessageTemplate() {
        return inviteMessageTemplate;
    }

    /**
     * InviteMessageTemplate
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-invitemessagetemplate.html
     * 
     */
    public void setInviteMessageTemplate(InviteMessageTemplate inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
    }

    public AdminCreateUserConfig withInviteMessageTemplate(InviteMessageTemplate inviteMessageTemplate) {
        this.inviteMessageTemplate = inviteMessageTemplate;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays
     * 
     */
    public Double getUnusedAccountValidityDays() {
        return unusedAccountValidityDays;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-unusedaccountvaliditydays
     * 
     */
    public void setUnusedAccountValidityDays(Double unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
    }

    public AdminCreateUserConfig withUnusedAccountValidityDays(Double unusedAccountValidityDays) {
        this.unusedAccountValidityDays = unusedAccountValidityDays;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly
     * 
     */
    public Boolean getAllowAdminCreateUserOnly() {
        return allowAdminCreateUserOnly;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-admincreateuserconfig.html#cfn-cognito-userpool-admincreateuserconfig-allowadmincreateuseronly
     * 
     */
    public void setAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
        this.allowAdminCreateUserOnly = allowAdminCreateUserOnly;
    }

    public AdminCreateUserConfig withAllowAdminCreateUserOnly(Boolean allowAdminCreateUserOnly) {
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
        if ((other instanceof AdminCreateUserConfig) == false) {
            return false;
        }
        AdminCreateUserConfig rhs = ((AdminCreateUserConfig) other);
        return new EqualsBuilder().append(allowAdminCreateUserOnly, rhs.allowAdminCreateUserOnly).append(inviteMessageTemplate, rhs.inviteMessageTemplate).append(unusedAccountValidityDays, rhs.unusedAccountValidityDays).isEquals();
    }

}
