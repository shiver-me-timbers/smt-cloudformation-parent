
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
 * DBProxy
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonPropertyOrder({
    "Auth",
    "DBProxyName",
    "DebugLogging",
    "EngineFamily",
    "IdleClientTimeout",
    "RequireTLS",
    "RoleArn",
    "Tags",
    "VpcSecurityGroupIds",
    "VpcSubnetIds"
})
public class DBProxy {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth
     * 
     */
    @JsonProperty("Auth")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth")
    private List<Property<DBProxyAuthFormat>> auth = new ArrayList<Property<DBProxyAuthFormat>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname
     * 
     */
    @JsonProperty("DBProxyName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname")
    private CharSequence dBProxyName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging
     * 
     */
    @JsonProperty("DebugLogging")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging")
    private CharSequence debugLogging;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily
     * 
     */
    @JsonProperty("EngineFamily")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily")
    private CharSequence engineFamily;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout
     * 
     */
    @JsonProperty("IdleClientTimeout")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout")
    private Number idleClientTimeout;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls
     * 
     */
    @JsonProperty("RequireTLS")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls")
    private CharSequence requireTLS;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn
     * 
     */
    @JsonProperty("RoleArn")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn")
    private CharSequence roleArn;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags
     * 
     */
    @JsonProperty("Tags")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags")
    private List<Property<DBProxyTagFormat>> tags = new ArrayList<Property<DBProxyTagFormat>>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids
     * 
     */
    @JsonProperty("VpcSecurityGroupIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids")
    private List<CharSequence> vpcSecurityGroupIds = new ArrayList<CharSequence>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids
     * 
     */
    @JsonProperty("VpcSubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids")
    private List<CharSequence> vpcSubnetIds = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth
     * 
     */
    @JsonIgnore
    public List<Property<DBProxyAuthFormat>> getAuth() {
        return auth;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-auth
     * 
     */
    @JsonIgnore
    public void setAuth(List<Property<DBProxyAuthFormat>> auth) {
        this.auth = auth;
    }

    public DBProxy withAuth(List<Property<DBProxyAuthFormat>> auth) {
        this.auth = auth;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname
     * 
     */
    @JsonIgnore
    public CharSequence getDBProxyName() {
        return dBProxyName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-dbproxyname
     * 
     */
    @JsonIgnore
    public void setDBProxyName(CharSequence dBProxyName) {
        this.dBProxyName = dBProxyName;
    }

    public DBProxy withDBProxyName(CharSequence dBProxyName) {
        this.dBProxyName = dBProxyName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging
     * 
     */
    @JsonIgnore
    public CharSequence getDebugLogging() {
        return debugLogging;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-debuglogging
     * 
     */
    @JsonIgnore
    public void setDebugLogging(CharSequence debugLogging) {
        this.debugLogging = debugLogging;
    }

    public DBProxy withDebugLogging(CharSequence debugLogging) {
        this.debugLogging = debugLogging;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily
     * 
     */
    @JsonIgnore
    public CharSequence getEngineFamily() {
        return engineFamily;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-enginefamily
     * 
     */
    @JsonIgnore
    public void setEngineFamily(CharSequence engineFamily) {
        this.engineFamily = engineFamily;
    }

    public DBProxy withEngineFamily(CharSequence engineFamily) {
        this.engineFamily = engineFamily;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout
     * 
     */
    @JsonIgnore
    public Number getIdleClientTimeout() {
        return idleClientTimeout;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-idleclienttimeout
     * 
     */
    @JsonIgnore
    public void setIdleClientTimeout(Number idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
    }

    public DBProxy withIdleClientTimeout(Number idleClientTimeout) {
        this.idleClientTimeout = idleClientTimeout;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls
     * 
     */
    @JsonIgnore
    public CharSequence getRequireTLS() {
        return requireTLS;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-requiretls
     * 
     */
    @JsonIgnore
    public void setRequireTLS(CharSequence requireTLS) {
        this.requireTLS = requireTLS;
    }

    public DBProxy withRequireTLS(CharSequence requireTLS) {
        this.requireTLS = requireTLS;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn
     * 
     */
    @JsonIgnore
    public CharSequence getRoleArn() {
        return roleArn;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-rolearn
     * 
     */
    @JsonIgnore
    public void setRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
    }

    public DBProxy withRoleArn(CharSequence roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags
     * 
     */
    @JsonIgnore
    public List<Property<DBProxyTagFormat>> getTags() {
        return tags;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-tags
     * 
     */
    @JsonIgnore
    public void setTags(List<Property<DBProxyTagFormat>> tags) {
        this.tags = tags;
    }

    public DBProxy withTags(List<Property<DBProxyTagFormat>> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getVpcSecurityGroupIds() {
        return vpcSecurityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsecuritygroupids
     * 
     */
    @JsonIgnore
    public void setVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
    }

    public DBProxy withVpcSecurityGroupIds(List<CharSequence> vpcSecurityGroupIds) {
        this.vpcSecurityGroupIds = vpcSecurityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids
     * 
     */
    @JsonIgnore
    public List<CharSequence> getVpcSubnetIds() {
        return vpcSubnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rds-dbproxy.html#cfn-rds-dbproxy-vpcsubnetids
     * 
     */
    @JsonIgnore
    public void setVpcSubnetIds(List<CharSequence> vpcSubnetIds) {
        this.vpcSubnetIds = vpcSubnetIds;
    }

    public DBProxy withVpcSubnetIds(List<CharSequence> vpcSubnetIds) {
        this.vpcSubnetIds = vpcSubnetIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("auth", auth).append("dBProxyName", dBProxyName).append("debugLogging", debugLogging).append("engineFamily", engineFamily).append("idleClientTimeout", idleClientTimeout).append("requireTLS", requireTLS).append("roleArn", roleArn).append("tags", tags).append("vpcSecurityGroupIds", vpcSecurityGroupIds).append("vpcSubnetIds", vpcSubnetIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(idleClientTimeout).append(requireTLS).append(vpcSecurityGroupIds).append(auth).append(roleArn).append(debugLogging).append(engineFamily).append(dBProxyName).append(tags).append(vpcSubnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DBProxy) == false) {
            return false;
        }
        DBProxy rhs = ((DBProxy) other);
        return new EqualsBuilder().append(idleClientTimeout, rhs.idleClientTimeout).append(requireTLS, rhs.requireTLS).append(vpcSecurityGroupIds, rhs.vpcSecurityGroupIds).append(auth, rhs.auth).append(roleArn, rhs.roleArn).append(debugLogging, rhs.debugLogging).append(engineFamily, rhs.engineFamily).append(dBProxyName, rhs.dBProxyName).append(tags, rhs.tags).append(vpcSubnetIds, rhs.vpcSubnetIds).isEquals();
    }

}
