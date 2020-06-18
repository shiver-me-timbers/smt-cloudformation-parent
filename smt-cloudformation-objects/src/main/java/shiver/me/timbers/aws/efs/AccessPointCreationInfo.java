
package shiver.me.timbers.aws.efs;

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
 * AccessPointCreationInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "OwnerUid",
    "OwnerGid",
    "Permissions"
})
public class AccessPointCreationInfo implements Property<AccessPointCreationInfo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-owneruid
     * 
     */
    @JsonProperty("OwnerUid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-owneruid")
    private CharSequence ownerUid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-ownergid
     * 
     */
    @JsonProperty("OwnerGid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-ownergid")
    private CharSequence ownerGid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-permissions
     * 
     */
    @JsonProperty("Permissions")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-permissions")
    private CharSequence permissions;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-owneruid
     * 
     */
    @JsonIgnore
    public CharSequence getOwnerUid() {
        return ownerUid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-owneruid
     * 
     */
    @JsonIgnore
    public void setOwnerUid(CharSequence ownerUid) {
        this.ownerUid = ownerUid;
    }

    public AccessPointCreationInfo withOwnerUid(CharSequence ownerUid) {
        this.ownerUid = ownerUid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-ownergid
     * 
     */
    @JsonIgnore
    public CharSequence getOwnerGid() {
        return ownerGid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-ownergid
     * 
     */
    @JsonIgnore
    public void setOwnerGid(CharSequence ownerGid) {
        this.ownerGid = ownerGid;
    }

    public AccessPointCreationInfo withOwnerGid(CharSequence ownerGid) {
        this.ownerGid = ownerGid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-permissions
     * 
     */
    @JsonIgnore
    public CharSequence getPermissions() {
        return permissions;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-creationinfo.html#cfn-efs-accesspoint-creationinfo-permissions
     * 
     */
    @JsonIgnore
    public void setPermissions(CharSequence permissions) {
        this.permissions = permissions;
    }

    public AccessPointCreationInfo withPermissions(CharSequence permissions) {
        this.permissions = permissions;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("ownerUid", ownerUid).append("ownerGid", ownerGid).append("permissions", permissions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(ownerUid).append(ownerGid).append(permissions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessPointCreationInfo) == false) {
            return false;
        }
        AccessPointCreationInfo rhs = ((AccessPointCreationInfo) other);
        return new EqualsBuilder().append(ownerUid, rhs.ownerUid).append(ownerGid, rhs.ownerGid).append(permissions, rhs.permissions).isEquals();
    }

}
