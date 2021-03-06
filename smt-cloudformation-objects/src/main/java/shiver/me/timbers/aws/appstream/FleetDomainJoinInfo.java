
package shiver.me.timbers.aws.appstream;

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
 * FleetDomainJoinInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OrganizationalUnitDistinguishedName",
    "DirectoryName"
})
public class FleetDomainJoinInfo implements Property<FleetDomainJoinInfo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-organizationalunitdistinguishedname
     * 
     */
    @JsonProperty("OrganizationalUnitDistinguishedName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-organizationalunitdistinguishedname")
    private CharSequence organizationalUnitDistinguishedName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-directoryname
     * 
     */
    @JsonProperty("DirectoryName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-directoryname")
    private CharSequence directoryName;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-organizationalunitdistinguishedname
     * 
     */
    @JsonIgnore
    public CharSequence getOrganizationalUnitDistinguishedName() {
        return organizationalUnitDistinguishedName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-organizationalunitdistinguishedname
     * 
     */
    @JsonIgnore
    public void setOrganizationalUnitDistinguishedName(CharSequence organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    public FleetDomainJoinInfo withOrganizationalUnitDistinguishedName(CharSequence organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-directoryname
     * 
     */
    @JsonIgnore
    public CharSequence getDirectoryName() {
        return directoryName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appstream-fleet-domainjoininfo.html#cfn-appstream-fleet-domainjoininfo-directoryname
     * 
     */
    @JsonIgnore
    public void setDirectoryName(CharSequence directoryName) {
        this.directoryName = directoryName;
    }

    public FleetDomainJoinInfo withDirectoryName(CharSequence directoryName) {
        this.directoryName = directoryName;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("organizationalUnitDistinguishedName", organizationalUnitDistinguishedName).append("directoryName", directoryName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(organizationalUnitDistinguishedName).append(directoryName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof FleetDomainJoinInfo) == false) {
            return false;
        }
        FleetDomainJoinInfo rhs = ((FleetDomainJoinInfo) other);
        return new EqualsBuilder().append(organizationalUnitDistinguishedName, rhs.organizationalUnitDistinguishedName).append(directoryName, rhs.directoryName).isEquals();
    }

}
