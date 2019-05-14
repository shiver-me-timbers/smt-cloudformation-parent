
package aws.appstream;

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
 * ServiceAccountCredentials
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AccountName",
    "AccountPassword"
})
public class ServiceAccountCredentials implements Property<ServiceAccountCredentials>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountname
     * 
     */
    @JsonProperty("AccountName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountname")
    private CharSequence accountName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountpassword
     * 
     */
    @JsonProperty("AccountPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountpassword")
    private CharSequence accountPassword;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountname
     * 
     */
    @JsonIgnore
    public CharSequence getAccountName() {
        return accountName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountname
     * 
     */
    @JsonIgnore
    public void setAccountName(CharSequence accountName) {
        this.accountName = accountName;
    }

    public ServiceAccountCredentials withAccountName(CharSequence accountName) {
        this.accountName = accountName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountpassword
     * 
     */
    @JsonIgnore
    public CharSequence getAccountPassword() {
        return accountPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-directoryconfig-serviceaccountcredentials.html#cfn-appstream-directoryconfig-serviceaccountcredentials-accountpassword
     * 
     */
    @JsonIgnore
    public void setAccountPassword(CharSequence accountPassword) {
        this.accountPassword = accountPassword;
    }

    public ServiceAccountCredentials withAccountPassword(CharSequence accountPassword) {
        this.accountPassword = accountPassword;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("accountName", accountName).append("accountPassword", accountPassword).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountName).append(accountPassword).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceAccountCredentials) == false) {
            return false;
        }
        ServiceAccountCredentials rhs = ((ServiceAccountCredentials) other);
        return new EqualsBuilder().append(accountName, rhs.accountName).append(accountPassword, rhs.accountPassword).isEquals();
    }

}
