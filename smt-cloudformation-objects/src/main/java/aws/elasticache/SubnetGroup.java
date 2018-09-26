
package aws.elasticache;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * SubnetGroup
 * <p>
 * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CacheSubnetGroupName",
    "Description",
    "SubnetIds"
})
public class SubnetGroup {

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname
     * 
     */
    @JsonProperty("CacheSubnetGroupName")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname")
    private CharSequence cacheSubnetGroupName;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description
     * 
     */
    @JsonProperty("Description")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description")
    private CharSequence description;
    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids
     * 
     */
    @JsonProperty("SubnetIds")
    @JsonPropertyDescription("http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids")
    private List<CharSequence> subnetIds = new ArrayList<CharSequence>();

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname
     * 
     */
    public CharSequence getCacheSubnetGroupName() {
        return cacheSubnetGroupName;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-cachesubnetgroupname
     * 
     */
    public void setCacheSubnetGroupName(CharSequence cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
    }

    public SubnetGroup withCacheSubnetGroupName(CharSequence cacheSubnetGroupName) {
        this.cacheSubnetGroupName = cacheSubnetGroupName;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description
     * 
     */
    public CharSequence getDescription() {
        return description;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-description
     * 
     */
    public void setDescription(CharSequence description) {
        this.description = description;
    }

    public SubnetGroup withDescription(CharSequence description) {
        this.description = description;
        return this;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids
     * 
     */
    public List<CharSequence> getSubnetIds() {
        return subnetIds;
    }

    /**
     * http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticache-subnetgroup.html#cfn-elasticache-subnetgroup-subnetids
     * 
     */
    public void setSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
    }

    public SubnetGroup withSubnetIds(List<CharSequence> subnetIds) {
        this.subnetIds = subnetIds;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cacheSubnetGroupName", cacheSubnetGroupName).append("description", description).append("subnetIds", subnetIds).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(description).append(cacheSubnetGroupName).append(subnetIds).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof SubnetGroup) == false) {
            return false;
        }
        SubnetGroup rhs = ((SubnetGroup) other);
        return new EqualsBuilder().append(description, rhs.description).append(cacheSubnetGroupName, rhs.cacheSubnetGroupName).append(subnetIds, rhs.subnetIds).isEquals();
    }

}
