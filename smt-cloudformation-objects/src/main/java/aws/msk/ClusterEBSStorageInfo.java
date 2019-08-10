
package aws.msk;

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
 * ClusterEBSStorageInfo
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "VolumeSize"
})
public class ClusterEBSStorageInfo implements Property<ClusterEBSStorageInfo>
{

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize
     * 
     */
    @JsonProperty("VolumeSize")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize")
    private Number volumeSize;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize
     * 
     */
    @JsonIgnore
    public Number getVolumeSize() {
        return volumeSize;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-msk-cluster-ebsstorageinfo.html#cfn-msk-cluster-ebsstorageinfo-volumesize
     * 
     */
    @JsonIgnore
    public void setVolumeSize(Number volumeSize) {
        this.volumeSize = volumeSize;
    }

    public ClusterEBSStorageInfo withVolumeSize(Number volumeSize) {
        this.volumeSize = volumeSize;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("volumeSize", volumeSize).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(volumeSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ClusterEBSStorageInfo) == false) {
            return false;
        }
        ClusterEBSStorageInfo rhs = ((ClusterEBSStorageInfo) other);
        return new EqualsBuilder().append(volumeSize, rhs.volumeSize).isEquals();
    }

}
