
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
    private String replicationInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion")
    private String engineVersion;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid")
    private String kmsKeyId;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone")
    private String availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow")
    private String preferredMaintenanceWindow;
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
    private String replicationSubnetGroupIdentifier;
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
    private List<String> vpcSecurityGroupIds = new ArrayList<String>();
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
    private String replicationInstanceClass;
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
    @JsonProperty("ReplicationInstanceIdentifier")
    public String getReplicationInstanceIdentifier() {
        return replicationInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceidentifier
     * 
     */
    @JsonProperty("ReplicationInstanceIdentifier")
    public void setReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
    }

    public ReplicationInstance withReplicationInstanceIdentifier(String replicationInstanceIdentifier) {
        this.replicationInstanceIdentifier = replicationInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    public String getEngineVersion() {
        return engineVersion;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-engineversion
     * 
     */
    @JsonProperty("EngineVersion")
    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    public ReplicationInstance withEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public String getKmsKeyId() {
        return kmsKeyId;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-kmskeyid
     * 
     */
    @JsonProperty("KmsKeyId")
    public void setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
    }

    public ReplicationInstance withKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public String getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public ReplicationInstance withAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    public String getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    public void setPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public ReplicationInstance withPreferredMaintenanceWindow(String preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
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
    @JsonProperty("ReplicationSubnetGroupIdentifier")
    public String getReplicationSubnetGroupIdentifier() {
        return replicationSubnetGroupIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationsubnetgroupidentifier
     * 
     */
    @JsonProperty("ReplicationSubnetGroupIdentifier")
    public void setReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
    }

    public ReplicationInstance withReplicationSubnetGroupIdentifier(String replicationSubnetGroupIdentifier) {
        this.replicationSubnetGroupIdentifier = replicationSubnetGroupIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage
     * 
     */
    @JsonProperty("AllocatedStorage")
    public Integer getAllocatedStorage() {
        return allocatedStorage;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allocatedstorage
     * 
     */
    @JsonProperty("AllocatedStorage")
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
    @JsonProperty("VpcSecurityGroupIds")
    public List<String> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    public void setVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public ReplicationInstance withVpcSecurityGroupIds(List<String> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
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
    @JsonProperty("ReplicationInstanceClass")
    public String getReplicationInstanceClass() {
        return replicationInstanceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-replicationinstanceclass
     * 
     */
    @JsonProperty("ReplicationInstanceClass")
    public void setReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
    }

    public ReplicationInstance withReplicationInstanceClass(String replicationInstanceClass) {
        this.replicationInstanceClass = replicationInstanceClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
    public Boolean getPubliclyAccessible() {
        return publiclyAccessible;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-publiclyaccessible
     * 
     */
    @JsonProperty("PubliclyAccessible")
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
    @JsonProperty("MultiAZ")
    public Boolean getMultiAZ() {
        return multiAZ;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-multiaz
     * 
     */
    @JsonProperty("MultiAZ")
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
    @JsonProperty("Tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-dms-replicationinstance.html#cfn-dms-replicationinstance-tags
     * 
     */
    @JsonProperty("Tags")
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
