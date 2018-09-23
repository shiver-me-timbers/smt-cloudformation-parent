
package aws.elasticsearch;

import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * VPCOptions
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "SecurityGroupIds",
    "SubnetIds"
})
public class VPCOptions {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids")
    private Set<String> securityGroupIds = new LinkedHashSet<String>();
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonDeserialize(as = java.util.LinkedHashSet.class)
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids")
    private Set<String> subnetIds = new LinkedHashSet<String>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public Set<String> getSecurityGroupIds() {
        return securityGroupIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-securitygroupids
     * 
     */
    @JsonProperty("SecurityGroupIds")
    public void setSecurityGroupIds(Set<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
    }

    public VPCOptions withSecurityGroupIds(Set<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    public Set<String> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticsearch-domain-vpcoptions.html#cfn-elasticsearch-domain-vpcoptions-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    public void setSubnetIds(Set<String> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public VPCOptions withSubnetIds(Set<String> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("securityGroupIds", securityGroupIds).append("subnetIds", subnetIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(securityGroupIds).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VPCOptions) == false) {
            return false;
        }
        VPCOptions rhs = ((VPCOptions) other);
        return new EqualsBuilder().append(securityGroupIds, rhs.securityGroupIds).append(subnetIds, rhs.subnetIds).isEquals();
    }

}