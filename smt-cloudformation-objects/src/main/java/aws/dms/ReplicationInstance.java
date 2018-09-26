
package aws.dms;

import java.util.ArrayList;
import java.util.List;
import aws.Tag;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * ReplicationInstance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ReplicationInstanceIdentifier",
    "EngineVersion",
    "KmsKeyId",
    "AvailabilityZone",
    "PreferredMaintenanceWindow",
    "AutoMinorVersionUpgrade",
    "ReplicationSubnetGroupIdentifier",
    "AllocatedStorage",
    "VpcSecurityGroupIds",
    "AllowMajorVersionUpgrade",
    "ReplicationInstanceClass",
    "PubliclyAccessible",
    "MultiAZ",
    "Tags"
})
public class ReplicationInstance {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier
     * 
     */
    @JsonProperty("ReplicationInstanceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier")
    private CharSequence replicationInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion")
    private CharSequence engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid")
    private CharSequence kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade")
    private Boolean autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier
     * 
     */
    @JsonProperty("ReplicationSubnetGroupIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier")
    private CharSequence replicationSubnetGroupIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage
     * 
     */
    @JsonProperty("AllocatedStorage")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage")
    private Integer allocatedStorage;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids")
    private List<CharSequence> vpcSecurityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade")
    private Boolean allowMajorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass
     * 
     */
    @JsonProperty("ReplicationInstanceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass")
    private CharSequence replicationInstanceClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible")
    private Boolean publiclyAccessible;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz
     * 
     */
    @JsonProperty("MultiAZ")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz")
    private Boolean multiAZ;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier
     * 
     */
    public CharSequence getReplicationInstanceIdentifier() {
        return replicationInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier
     * 
     */
    public void setReplicationInstanceIdentifier(CharSequence replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    public ReplicationInstance withReplicationInstanceIdentifier(CharSequence replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion
     * 
     */
    public CharSequence getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion
     * 
     */
    public void setEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ReplicationInstance withEngineVersion(CharSequence engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid
     * 
     */
    public CharSequence getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid
     * 
     */
    public void setKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public ReplicationInstance withKmsKeyId(CharSequence kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ReplicationInstance withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public ReplicationInstance withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade
     * 
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade
     * 
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public ReplicationInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier
     * 
     */
    public CharSequence getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier
     * 
     */
    public void setReplicationSubnetGroupIdentifier(CharSequence replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    public ReplicationInstance withReplicationSubnetGroupIdentifier(CharSequence replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage
     * 
     */
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage
     * 
     */
    public void setAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
    }

    public ReplicationInstance withAllocatedStorage(Integer allocatedStorage) {
        this.allocatedStorage = allocatedStorage;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids
     * 
     */
    public List<CharSequence> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids
     * 
     */
    public void setVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public ReplicationInstance withVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade
     * 
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade
     * 
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    public ReplicationInstance withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass
     * 
     */
    public CharSequence getReplicationInstanceClass() {
        return replicationInstanceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass
     * 
     */
    public void setReplicationInstanceClass(CharSequence replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    public ReplicationInstance withReplicationInstanceClass(CharSequence replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible
     * 
     */
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible
     * 
     */
    public void setPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
    }

    public ReplicationInstance withPubliclyAccessible(Boolean publiclyAccessible) {
        this.publiclyAccessible = publiclyAccessible;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz
     * 
     */
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz
     * 
     */
    public void setMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
    }

    public ReplicationInstance withMultiAZ(Boolean multiAZ) {
        this.multiAZ = multiAZ;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public ReplicationInstance withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("replicationInstanceIdentifier", replicationInstanceIdentifier).append("engineVersion", engineVersion).append("kmsKeyId", kmsKeyId).append("availabilityZone", availabilityZone).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("replicationSubnetGroupIdentifier", replicationSubnetGroupIdentifier).append("allocatedStorage", allocatedStorage).append("vpcSecurityGroupIds", vpcSecurityGroupIds).append("allowMajorVersionUpgrade", allowMajorVersionUpgrade).append("replicationInstanceClass", replicationInstanceClass).append("publiclyAccessible", publiclyAccessible).append("multiAZ", multiAZ).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(engineVersion).append(allowMajorVersionUpgrade).append(allocatedStorage).append(vpcSecurityGroupIds).append(multiAZ).append(replicationSubnetGroupIdentifier).append(replicationInstanceClass).append(replicationInstanceIdentifier).append(availabilityZone).append(tags).append(preferredMaintenanceWindow).append(publiclyAccessible).append(kmsKeyId).append(autoMinorVersionUpgrade).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReplicationInstance) == false) {
            return false;
        }
        ReplicationInstance rhs = ((ReplicationInstance) other);
        return new EqualsBuilder().append(engineVersion, rhs.engineVersion).append(allowMajorVersionUpgrade, rhs.allowMajorVersionUpgrade).append(allocatedStorage, rhs.allocatedStorage).append(vpcSecurityGroupIds, rhs.vpcSecurityGroupIds).append(multiAZ, rhs.multiAZ).append(replicationSubnetGroupIdentifier, rhs.replicationSubnetGroupIdentifier).append(replicationInstanceClass, rhs.replicationInstanceClass).append(replicationInstanceIdentifier, rhs.replicationInstanceIdentifier).append(availabilityZone, rhs.availabilityZone).append(tags, rhs.tags).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(publiclyAccessible, rhs.publiclyAccessible).append(kmsKeyId, rhs.kmsKeyId).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).isEquals();
    }

}
