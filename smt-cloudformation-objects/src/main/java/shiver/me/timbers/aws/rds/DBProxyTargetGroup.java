
package shiver.me.timbers.aws.rds;

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
 * DBProxyTargetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "DBProxyName",
    "ConnectionPoolConfigurationInfo",
    "DBInstanceIdentifiers",
    "DBClusterIdentifiers"
})
public class DBProxyTargetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname
     * 
     */
    @JsonProperty("DBProxyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname")
    private CharSequence dBProxyName;
    /**
     * DBProxyTargetGroupConnectionPoolConfigurationInfoFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html
     * 
     */
    @JsonProperty("ConnectionPoolConfigurationInfo")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html")
    private Property<DBProxyTargetGroupConnectionPoolConfigurationInfoFormat> connectionPoolConfigurationInfo;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers
     * 
     */
    @JsonProperty("DBInstanceIdentifiers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers")
    private List<CharSequence> dBInstanceIdentifiers = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers
     * 
     */
    @JsonProperty("DBClusterIdentifiers")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers")
    private List<CharSequence> dBClusterIdentifiers = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname
     * 
     */
    @JsonIgnore
    public CharSequence getDBProxyName() {
        return dBProxyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbproxyname
     * 
     */
    @JsonIgnore
    public void setDBProxyName(CharSequence dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    public DBProxyTargetGroup withDBProxyName(CharSequence dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * DBProxyTargetGroupConnectionPoolConfigurationInfoFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html
     * 
     */
    @JsonIgnore
    public Property<DBProxyTargetGroupConnectionPoolConfigurationInfoFormat> getConnectionPoolConfigurationInfo() {
        return connectionPoolConfigurationInfo;
    }

    /**
     * DBProxyTargetGroupConnectionPoolConfigurationInfoFormat
     * <p>
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbproxytargetgroup-connectionpoolconfigurationinfoformat.html
     * 
     */
    @JsonIgnore
    public void setConnectionPoolConfigurationInfo(Property<DBProxyTargetGroupConnectionPoolConfigurationInfoFormat> connectionPoolConfigurationInfo) {
        this.connectionPoolConfigurationInfo = connectionPoolConfigurationInfo;
    }

    public DBProxyTargetGroup withConnectionPoolConfigurationInfo(Property<DBProxyTargetGroupConnectionPoolConfigurationInfoFormat> connectionPoolConfigurationInfo) {
        this.connectionPoolConfigurationInfo = connectionPoolConfigurationInfo;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers
     * 
     */
    @JsonIgnore
    public List<CharSequence> getDBInstanceIdentifiers() {
        return dBInstanceIdentifiers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbinstanceidentifiers
     * 
     */
    @JsonIgnore
    public void setDBInstanceIdentifiers(List<CharSequence> dBInstanceIdentifiers) {
        this.dBInstanceIdentifiers = dBInstanceIdentifiers;
    }

    public DBProxyTargetGroup withDBInstanceIdentifiers(List<CharSequence> dBInstanceIdentifiers) {
        this.dBInstanceIdentifiers = dBInstanceIdentifiers;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers
     * 
     */
    @JsonIgnore
    public List<CharSequence> getDBClusterIdentifiers() {
        return dBClusterIdentifiers;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxytargetgroup.html#cfn-rds-dbproxytargetgroup-dbclusteridentifiers
     * 
     */
    @JsonIgnore
    public void setDBClusterIdentifiers(List<CharSequence> dBClusterIdentifiers) {
        this.dBClusterIdentifiers = dBClusterIdentifiers;
    }

    public DBProxyTargetGroup withDBClusterIdentifiers(List<CharSequence> dBClusterIdentifiers) {
        this.dBClusterIdentifiers = dBClusterIdentifiers;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dBProxyName", dBProxyName).append("connectionPoolConfigurationInfo", connectionPoolConfigurationInfo).append("dBInstanceIdentifiers", dBInstanceIdentifiers).append("dBClusterIdentifiers", dBClusterIdentifiers).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dBInstanceIdentifiers).append(dBClusterIdentifiers).append(dBProxyName).append(connectionPoolConfigurationInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBProxyTargetGroup) == false) {
            return false;
        }
        DBProxyTargetGroup rhs = ((DBProxyTargetGroup) other);
        return new EqualsBuilder().append(dBInstanceIdentifiers, rhs.dBInstanceIdentifiers).append(dBClusterIdentifiers, rhs.dBClusterIdentifiers).append(dBProxyName, rhs.dBProxyName).append(connectionPoolConfigurationInfo, rhs.connectionPoolConfigurationInfo).isEquals();
    }

}
