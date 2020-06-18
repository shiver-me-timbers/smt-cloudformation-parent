
package shiver.me.timbers.aws.efs;

import java.util.ArrayList;
import java.util.List;
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
 * AccessPointPosixUser
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Uid",
    "Gid",
    "SecondaryGids"
})
public class AccessPointPosixUser implements Property<AccessPointPosixUser>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-uid
     * 
     */
    @JsonProperty("Uid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-uid")
    private CharSequence uid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-gid
     * 
     */
    @JsonProperty("Gid")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-gid")
    private CharSequence gid;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-secondarygids
     * 
     */
    @JsonProperty("SecondaryGids")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-secondarygids")
    private List<CharSequence> secondaryGids = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-uid
     * 
     */
    @JsonIgnore
    public CharSequence getUid() {
        return uid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-uid
     * 
     */
    @JsonIgnore
    public void setUid(CharSequence uid) {
        this.uid = uid;
    }

    public AccessPointPosixUser withUid(CharSequence uid) {
        this.uid = uid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-gid
     * 
     */
    @JsonIgnore
    public CharSequence getGid() {
        return gid;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-gid
     * 
     */
    @JsonIgnore
    public void setGid(CharSequence gid) {
        this.gid = gid;
    }

    public AccessPointPosixUser withGid(CharSequence gid) {
        this.gid = gid;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-secondarygids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getSecondaryGids() {
        return secondaryGids;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-efs-accesspoint-posixuser.html#cfn-efs-accesspoint-posixuser-secondarygids
     * 
     */
    @JsonIgnore
    public void setSecondaryGids(List<CharSequence> secondaryGids) {
        this.secondaryGids = secondaryGids;
    }

    public AccessPointPosixUser withSecondaryGids(List<CharSequence> secondaryGids) {
        this.secondaryGids = secondaryGids;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("uid", uid).append("gid", gid).append("secondaryGids", secondaryGids).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(uid).append(gid).append(secondaryGids).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AccessPointPosixUser) == false) {
            return false;
        }
        AccessPointPosixUser rhs = ((AccessPointPosixUser) other);
        return new EqualsBuilder().append(uid, rhs.uid).append(gid, rhs.gid).append(secondaryGids, rhs.secondaryGids).isEquals();
    }

}
