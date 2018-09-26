
package aws.ec2;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * TrunkInterfaceAssociation
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "BranchInterfaceId",
    "GREKey",
    "TrunkInterfaceId",
    "VLANId"
})
public class TrunkInterfaceAssociation {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid
     * 
     */
    @JsonProperty("BranchInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid")
    private CharSequence branchInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey
     * 
     */
    @JsonProperty("GREKey")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey")
    private Integer gREKey;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid
     * 
     */
    @JsonProperty("TrunkInterfaceId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid")
    private CharSequence trunkInterfaceId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid
     * 
     */
    @JsonProperty("VLANId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid")
    private Integer vLANId;

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid
     * 
     */
    public CharSequence getBranchInterfaceId() {
        return branchInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-branchinterfaceid
     * 
     */
    public void setBranchInterfaceId(CharSequence branchInterfaceId) {
        this.branchInterfaceId = branchInterfaceId;
    }

    public TrunkInterfaceAssociation withBranchInterfaceId(CharSequence branchInterfaceId) {
        this.branchInterfaceId = branchInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey
     * 
     */
    public Integer getGREKey() {
        return gREKey;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-grekey
     * 
     */
    public void setGREKey(Integer gREKey) {
        this.gREKey = gREKey;
    }

    public TrunkInterfaceAssociation withGREKey(Integer gREKey) {
        this.gREKey = gREKey;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid
     * 
     */
    public CharSequence getTrunkInterfaceId() {
        return trunkInterfaceId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-trunkinterfaceid
     * 
     */
    public void setTrunkInterfaceId(CharSequence trunkInterfaceId) {
        this.trunkInterfaceId = trunkInterfaceId;
    }

    public TrunkInterfaceAssociation withTrunkInterfaceId(CharSequence trunkInterfaceId) {
        this.trunkInterfaceId = trunkInterfaceId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid
     * 
     */
    public Integer getVLANId() {
        return vLANId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-trunkinterfaceassociation.html#cfn-ec2-trunkinterfaceassociation-vlanid
     * 
     */
    public void setVLANId(Integer vLANId) {
        this.vLANId = vLANId;
    }

    public TrunkInterfaceAssociation withVLANId(Integer vLANId) {
        this.vLANId = vLANId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("branchInterfaceId", branchInterfaceId).append("gREKey", gREKey).append("trunkInterfaceId", trunkInterfaceId).append("vLANId", vLANId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(trunkInterfaceId).append(branchInterfaceId).append(gREKey).append(vLANId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TrunkInterfaceAssociation) == false) {
            return false;
        }
        TrunkInterfaceAssociation rhs = ((TrunkInterfaceAssociation) other);
        return new EqualsBuilder().append(trunkInterfaceId, rhs.trunkInterfaceId).append(branchInterfaceId, rhs.branchInterfaceId).append(gREKey, rhs.gREKey).append(vLANId, rhs.vLANId).isEquals();
    }

}
