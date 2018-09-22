
package aws.emr;

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
@JsonInclude(JsonInclude.Include.NON_NULL)
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
    private String aDDomainJoinPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser
     * 
     */
    @JsonProperty("ADDomainJoinUser")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser")
    private String aDDomainJoinUser;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword
     * 
     */
    @JsonProperty("CrossRealmTrustPrincipalPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword")
    private String crossRealmTrustPrincipalPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword
     * 
     */
    @JsonProperty("KdcAdminPassword")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword")
    private String kdcAdminPassword;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm
     * 
     */
    @JsonProperty("Realm")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm")
    private String realm;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinpassword
     * 
     */
    @JsonProperty("ADDomainJoinPassword")
    public String getADDomainJoinPassword() {
        return aDDomainJoinPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinpassword
     * 
     */
    @JsonProperty("ADDomainJoinPassword")
    public void setADDomainJoinPassword(String aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
    }

    public KerberosAttributes withADDomainJoinPassword(String aDDomainJoinPassword) {
        this.aDDomainJoinPassword = aDDomainJoinPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser
     * 
     */
    @JsonProperty("ADDomainJoinUser")
    public String getADDomainJoinUser() {
        return aDDomainJoinUser;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-addomainjoinuser
     * 
     */
    @JsonProperty("ADDomainJoinUser")
    public void setADDomainJoinUser(String aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
    }

    public KerberosAttributes withADDomainJoinUser(String aDDomainJoinUser) {
        this.aDDomainJoinUser = aDDomainJoinUser;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword
     * 
     */
    @JsonProperty("CrossRealmTrustPrincipalPassword")
    public String getCrossRealmTrustPrincipalPassword() {
        return crossRealmTrustPrincipalPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-crossrealmtrustprincipalpassword
     * 
     */
    @JsonProperty("CrossRealmTrustPrincipalPassword")
    public void setCrossRealmTrustPrincipalPassword(String crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
    }

    public KerberosAttributes withCrossRealmTrustPrincipalPassword(String crossRealmTrustPrincipalPassword) {
        this.crossRealmTrustPrincipalPassword = crossRealmTrustPrincipalPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword
     * 
     */
    @JsonProperty("KdcAdminPassword")
    public String getKdcAdminPassword() {
        return kdcAdminPassword;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-kdcadminpassword
     * 
     */
    @JsonProperty("KdcAdminPassword")
    public void setKdcAdminPassword(String kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
    }

    public KerberosAttributes withKdcAdminPassword(String kdcAdminPassword) {
        this.kdcAdminPassword = kdcAdminPassword;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm
     * 
     */
    @JsonProperty("Realm")
    public String getRealm() {
        return realm;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticmapreduce-cluster-kerberosattributes.html#cfn-elasticmapreduce-cluster-kerberosattributes-realm
     * 
     */
    @JsonProperty("Realm")
    public void setRealm(String realm) {
        this.realm = realm;
    }

    public KerberosAttributes withRealm(String realm) {
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
