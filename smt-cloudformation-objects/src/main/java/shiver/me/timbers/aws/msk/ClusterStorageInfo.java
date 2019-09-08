
package shiver.me.timbers.aws.msk;

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
 * ClusterStorageInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-storageinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "EBSStorageInfo"
})
public class ClusterStorageInfo implements Property<ClusterStorageInfo>
{

    /**
     * ClusterEBSStorageInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html
     * 
     */
    @JsonProperty("EBSStorageInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html")
    private Property<ClusterEBSStorageInfo> eBSStorageInfo;

    /**
     * ClusterEBSStorageInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html
     * 
     */
    @JsonIgnore
    public Property<ClusterEBSStorageInfo> getEBSStorageInfo() {
        return eBSStorageInfo;
    }

    /**
     * ClusterEBSStorageInfo
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html
     * 
     */
    @JsonIgnore
    public void setEBSStorageInfo(Property<ClusterEBSStorageInfo> eBSStorageInfo) {
        this.eBSStorageInfo = eBSStorageInfo;
    }

    public ClusterStorageInfo withEBSStorageInfo(Property<ClusterEBSStorageInfo> eBSStorageInfo) {
        this.eBSStorageInfo = eBSStorageInfo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eBSStorageInfo", eBSStorageInfo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(eBSStorageInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterStorageInfo) == false) {
            return false;
        }
        ClusterStorageInfo rhs = ((ClusterStorageInfo) other);
        return new EqualsBuilder().append(eBSStorageInfo, rhs.eBSStorageInfo).isEquals();
    }

}
