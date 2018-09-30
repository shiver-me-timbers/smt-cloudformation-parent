
package aws.emr;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * KerberosAttributes
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "ADDomainJoinPassword",
    "ADDomainJoinUser",
    "CrossRealmTrustPrincipalPassword",
    "KdcAdminPassword",
    "Realm"
})
public class KerberosAttributes {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinpassword
     * 
     */
    @JsonProperty("ADDomainJoinPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinpassword")
    private CharSequence aDDomainJoinPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser
     * 
     */
    @JsonProperty("ADDomainJoinUser")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser")
    private CharSequence aDDomainJoinUser;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword
     * 
     */
    @JsonProperty("CrossRealmTrustPrincipalPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword")
    private CharSequence crossRealmTrustPrincipalPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword
     * 
     */
    @JsonProperty("KdcAdminPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword")
    private CharSequence kdcAdminPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm
     * 
     */
    @JsonProperty("Realm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm")
    private CharSequence realm;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinpassword
     * 
     */
    @JsonIgnore
    public CharSequence getADDomainJoinPassword() {
        return aDDomainJoinPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinpassword
     * 
     */
    @JsonIgnore
    public void setADDomainJoinPassword(CharSequence aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
    }

    public KerberosAttributes withADDomainJoinPassword(CharSequence aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser
     * 
     */
    @JsonIgnore
    public CharSequence getADDomainJoinUser() {
        return aDDomainJoinUser;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser
     * 
     */
    @JsonIgnore
    public void setADDomainJoinUser(CharSequence aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
    }

    public KerberosAttributes withADDomainJoinUser(CharSequence aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword
     * 
     */
    @JsonIgnore
    public CharSequence getCrossRealmTrustPrincipalPassword() {
        return crossRealmTrustPrincipalPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword
     * 
     */
    @JsonIgnore
    public void setCrossRealmTrustPrincipalPassword(CharSequence crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
    }

    public KerberosAttributes withCrossRealmTrustPrincipalPassword(CharSequence crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword
     * 
     */
    @JsonIgnore
    public CharSequence getKdcAdminPassword() {
        return kdcAdminPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword
     * 
     */
    @JsonIgnore
    public void setKdcAdminPassword(CharSequence kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
    }

    public KerberosAttributes withKdcAdminPassword(CharSequence kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm
     * 
     */
    @JsonIgnore
    public CharSequence getRealm() {
        return realm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm
     * 
     */
    @JsonIgnore
    public void setRealm(CharSequence realm) {
        this.realm = realm;
    }

    public KerberosAttributes withRealm(CharSequence realm) {
        this.realm = realm;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("aDDomainJoinPassword", aDDomainJoinPassword).append("aDDomainJoinUser", aDDomainJoinUser).append("crossRealmTrustPrincipalPassword", crossRealmTrustPrincipalPassword).append("kdcAdminPassword", kdcAdminPassword).append("realm", realm).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(aDDomainJoinPassword).append(aDDomainJoinUser).append(realm).append(kdcAdminPassword).append(crossRealmTrustPrincipalPassword).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof KerberosAttributes) == false) {
            return false;
        }
        KerberosAttributes rhs = ((KerberosAttributes) other);
        return new EqualsBuilder().append(aDDomainJoinPassword, rhs.aDDomainJoinPassword).append(aDDomainJoinUser, rhs.aDDomainJoinUser).append(realm, rhs.realm).append(kdcAdminPassword, rhs.kdcAdminPassword).append(crossRealmTrustPrincipalPassword, rhs.crossRealmTrustPrincipalPassword).isEquals();
    }

}
