
package aws.neptune;

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
 * DBInstance
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "DBParameterGroupName",
    "DBInstanceClass",
    "AllowMajorVersionUpgrade",
    "DBClusterIdentifier",
    "AvailabilityZone",
    "PreferredMaintenanceWindow",
    "AutoMinorVersionUpgrade",
    "DBSubnetGroupName",
    "DBInstanceIdentifier",
    "DBSnapshotIdentifier",
    "Tags"
})
public class DBInstance {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname
     * 
     */
    @JsonProperty("DBParameterGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname")
    private CharSequence dBParameterGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass
     * 
     */
    @JsonProperty("DBInstanceClass")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass")
    private CharSequence dBInstanceClass;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade
     * 
     */
    @JsonProperty("AllowMajorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade")
    private Boolean allowMajorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier
     * 
     */
    @JsonProperty("DBClusterIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier")
    private CharSequence dBClusterIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone
     * 
     */
    @JsonProperty("AvailabilityZone")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone")
    private CharSequence availabilityZone;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow
     * 
     */
    @JsonProperty("PreferredMaintenanceWindow")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow")
    private CharSequence preferredMaintenanceWindow;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade
     * 
     */
    @JsonProperty("AutoMinorVersionUpgrade")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade")
    private Boolean autoMinorVersionUpgrade;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname
     * 
     */
    @JsonProperty("DBSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname")
    private CharSequence dBSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier
     * 
     */
    @JsonProperty("DBInstanceIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier")
    private CharSequence dBInstanceIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier
     * 
     */
    @JsonProperty("DBSnapshotIdentifier")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier")
    private CharSequence dBSnapshotIdentifier;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags")
    private List<Tag> tags = new ArrayList<Tag>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname
     * 
     */
    public CharSequence getDBParameterGroupName() {
        return dBParameterGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbparametergroupname
     * 
     */
    public void setDBParameterGroupName(CharSequence dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
    }

    public DBInstance withDBParameterGroupName(CharSequence dBParameterGroupName) {
        this.dBParameterGroupName = dBParameterGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass
     * 
     */
    public CharSequence getDBInstanceClass() {
        return dBInstanceClass;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceclass
     * 
     */
    public void setDBInstanceClass(CharSequence dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
    }

    public DBInstance withDBInstanceClass(CharSequence dBInstanceClass) {
        this.dBInstanceClass = dBInstanceClass;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade
     * 
     */
    public Boolean getAllowMajorVersionUpgrade() {
        return allowMajorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-allowmajorversionupgrade
     * 
     */
    public void setAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
    }

    public DBInstance withAllowMajorVersionUpgrade(Boolean allowMajorVersionUpgrade) {
        this.allowMajorVersionUpgrade = allowMajorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier
     * 
     */
    public CharSequence getDBClusterIdentifier() {
        return dBClusterIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbclusteridentifier
     * 
     */
    public void setDBClusterIdentifier(CharSequence dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
    }

    public DBInstance withDBClusterIdentifier(CharSequence dBClusterIdentifier) {
        this.dBClusterIdentifier = dBClusterIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone
     * 
     */
    public CharSequence getAvailabilityZone() {
        return availabilityZone;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-availabilityzone
     * 
     */
    public void setAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public DBInstance withAvailabilityZone(CharSequence availabilityZone) {
        this.availabilityZone = availabilityZone;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow
     * 
     */
    public CharSequence getPreferredMaintenanceWindow() {
        return preferredMaintenanceWindow;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-preferredmaintenancewindow
     * 
     */
    public void setPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
    }

    public DBInstance withPreferredMaintenanceWindow(CharSequence preferredMaintenanceWindow) {
        this.preferredMaintenanceWindow = preferredMaintenanceWindow;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade
     * 
     */
    public Boolean getAutoMinorVersionUpgrade() {
        return autoMinorVersionUpgrade;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-autominorversionupgrade
     * 
     */
    public void setAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
    }

    public DBInstance withAutoMinorVersionUpgrade(Boolean autoMinorVersionUpgrade) {
        this.autoMinorVersionUpgrade = autoMinorVersionUpgrade;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname
     * 
     */
    public CharSequence getDBSubnetGroupName() {
        return dBSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsubnetgroupname
     * 
     */
    public void setDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
    }

    public DBInstance withDBSubnetGroupName(CharSequence dBSubnetGroupName) {
        this.dBSubnetGroupName = dBSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier
     * 
     */
    public CharSequence getDBInstanceIdentifier() {
        return dBInstanceIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbinstanceidentifier
     * 
     */
    public void setDBInstanceIdentifier(CharSequence dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    public DBInstance withDBInstanceIdentifier(CharSequence dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier
     * 
     */
    public CharSequence getDBSnapshotIdentifier() {
        return dBSnapshotIdentifier;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-dbsnapshotidentifier
     * 
     */
    public void setDBSnapshotIdentifier(CharSequence dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    public DBInstance withDBSnapshotIdentifier(CharSequence dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags
     * 
     */
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-neptune-dbinstance.html#cfn-neptune-dbinstance-tags
     * 
     */
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public DBInstance withTags(List<Tag> tags) {
        this.tags = tags;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dBParameterGroupName", dBParameterGroupName).append("dBInstanceClass", dBInstanceClass).append("allowMajorVersionUpgrade", allowMajorVersionUpgrade).append("dBClusterIdentifier", dBClusterIdentifier).append("availabilityZone", availabilityZone).append("preferredMaintenanceWindow", preferredMaintenanceWindow).append("autoMinorVersionUpgrade", autoMinorVersionUpgrade).append("dBSubnetGroupName", dBSubnetGroupName).append("dBInstanceIdentifier", dBInstanceIdentifier).append("dBSnapshotIdentifier", dBSnapshotIdentifier).append("tags", tags).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dBInstanceIdentifier).append(allowMajorVersionUpgrade).append(dBParameterGroupName).append(preferredMaintenanceWindow).append(dBInstanceClass).append(dBSnapshotIdentifier).append(dBClusterIdentifier).append(availabilityZone).append(autoMinorVersionUpgrade).append(dBSubnetGroupName).append(tags).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBInstance) == false) {
            return false;
        }
        DBInstance rhs = ((DBInstance) other);
        return new EqualsBuilder().append(dBInstanceIdentifier, rhs.dBInstanceIdentifier).append(allowMajorVersionUpgrade, rhs.allowMajorVersionUpgrade).append(dBParameterGroupName, rhs.dBParameterGroupName).append(preferredMaintenanceWindow, rhs.preferredMaintenanceWindow).append(dBInstanceClass, rhs.dBInstanceClass).append(dBSnapshotIdentifier, rhs.dBSnapshotIdentifier).append(dBClusterIdentifier, rhs.dBClusterIdentifier).append(availabilityZone, rhs.availabilityZone).append(autoMinorVersionUpgrade, rhs.autoMinorVersionUpgrade).append(dBSubnetGroupName, rhs.dBSubnetGroupName).append(tags, rhs.tags).isEquals();
    }

}
