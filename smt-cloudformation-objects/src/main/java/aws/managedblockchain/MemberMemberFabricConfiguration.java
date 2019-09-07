
package aws.managedblockchain;

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
 * MemberMemberFabricConfiguration
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "AdminUsername",
    "AdminPassword"
})
public class MemberMemberFabricConfiguration implements Property<MemberMemberFabricConfiguration>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminusername
     * 
     */
    @JsonProperty("AdminUsername")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminusername")
    private CharSequence adminUsername;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminpassword
     * 
     */
    @JsonProperty("AdminPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminpassword")
    private CharSequence adminPassword;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminusername
     * 
     */
    @JsonIgnore
    public CharSequence getAdminUsername() {
        return adminUsername;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminusername
     * 
     */
    @JsonIgnore
    public void setAdminUsername(CharSequence adminUsername) {
        this.adminUsername = adminUsername;
    }

    public MemberMemberFabricConfiguration withAdminUsername(CharSequence adminUsername) {
        this.adminUsername = adminUsername;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminpassword
     * 
     */
    @JsonIgnore
    public CharSequence getAdminPassword() {
        return adminPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-managedblockchain-member-memberfabricconfiguration.html#cfn-managedblockchain-member-memberfabricconfiguration-adminpassword
     * 
     */
    @JsonIgnore
    public void setAdminPassword(CharSequence adminPassword) {
        this.adminPassword = adminPassword;
    }

    public MemberMemberFabricConfiguration withAdminPassword(CharSequence adminPassword) {
        this.adminPassword = adminPassword;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("adminUsername", adminUsername).append("adminPassword", adminPassword).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(adminUsername).append(adminPassword).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MemberMemberFabricConfiguration) == false) {
            return false;
        }
        MemberMemberFabricConfiguration rhs = ((MemberMemberFabricConfiguration) other);
        return new EqualsBuilder().append(adminUsername, rhs.adminUsername).append(adminPassword, rhs.adminPassword).isEquals();
    }

}
